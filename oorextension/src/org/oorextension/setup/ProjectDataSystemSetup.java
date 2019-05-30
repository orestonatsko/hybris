package org.oorextension.setup;

import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.impex.jalo.Importer;
import de.hybris.platform.util.CSVReader;
import org.oorextension.constants.OorextensionConstants;

import java.util.Collections;
import java.util.List;


@SystemSetup(extension = OorextensionConstants.EXTENSIONNAME)
public class ProjectDataSystemSetup {

    private final String PROJECT_DATA_PARAMETER = "createProjectData";
    private final String CREATE_OPTION = "create";
    private final String NOT_CREATE_OPTION = "not create";

    @SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.PROJECT)
    public void createProjectData(SystemSetupContext context) {

        String parameter = context.getParameter(OorextensionConstants.EXTENSIONNAME + "_" + PROJECT_DATA_PARAMETER);
        if(parameter.equalsIgnoreCase(CREATE_OPTION)){
            importProjectData(OorextensionConstants.PROJECT_DATA_IMPEX);
        }
    }

    @SystemSetupParameterMethod
    public List<SystemSetupParameter> getSystemSetupParameters() {

        SystemSetupParameter parameter = new SystemSetupParameter(PROJECT_DATA_PARAMETER);
        parameter.setLabel("Create Project Data?");
        parameter.addValue(CREATE_OPTION);
        parameter.addValue(NOT_CREATE_OPTION, false);

        return Collections.singletonList(parameter);
    }

    private void importProjectData(String file) {
        try {
            final CSVReader reader = new CSVReader(getClass().getResource(file).getFile(), "UTF-8");
            final Importer importer = new Importer(reader);
            importer.importAll();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
