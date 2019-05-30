/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.oorextension.setup;

import static org.oorextension.constants.OorextensionConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.oorextension.constants.OorextensionConstants;
import org.oorextension.service.OorextensionService;


@SystemSetup(extension = OorextensionConstants.EXTENSIONNAME)
public class OorextensionSystemSetup
{
	private final OorextensionService oorextensionService;

	public OorextensionSystemSetup(final OorextensionService oorextensionService)
	{
		this.oorextensionService = oorextensionService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		oorextensionService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return OorextensionSystemSetup.class.getResourceAsStream("/oorextension/sap-hybris-platform.png");
	}
}
