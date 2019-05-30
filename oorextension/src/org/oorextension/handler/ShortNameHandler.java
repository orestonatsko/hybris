package org.oorextension.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.oorextension.model.AuthorModel;

public class ShortNameHandler implements DynamicAttributeHandler<String, AuthorModel> {

    @Override
    public String get(AuthorModel authorModel) {
         final String LINE_SEPARATOR = " ";
         final String PERIOD = ".";
        return authorModel.getLastName() + LINE_SEPARATOR + authorModel.getFirstName().charAt(0) + PERIOD;
    }

    @Override
    public void set(AuthorModel model, String s) {
        throw new UnsupportedOperationException("method set() is not available for property 'shortName' in AuthorModel!");
    }
}
