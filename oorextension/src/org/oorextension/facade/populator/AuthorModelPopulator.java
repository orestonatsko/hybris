package org.oorextension.facade.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.oorextension.data.AuthorData;
import org.oorextension.model.AuthorModel;

public class AuthorModelPopulator implements Populator<AuthorData, AuthorModel> {
    @Override
    public void populate(AuthorData authorData, AuthorModel authorModel) throws ConversionException {
        authorModel.setFirstName(authorData.getFirstName());
        authorModel.setLastName(authorData.getLastName());
        authorModel.setGenre(authorData.getGenre());
    }
}
