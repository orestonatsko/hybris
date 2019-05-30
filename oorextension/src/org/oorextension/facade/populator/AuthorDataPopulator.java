package org.oorextension.facade.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.oorextension.data.AuthorData;
import org.oorextension.model.AuthorModel;

public class AuthorDataPopulator implements Populator<AuthorModel, AuthorData> {
    @Override
    public void populate(AuthorModel authorModel, AuthorData authorData) throws ConversionException {
        authorData.setFirstName(authorModel.getFirstName());
        authorData.setLastName(authorModel.getLastName());
        authorData.setGenre(authorModel.getGenre());
    }

}
