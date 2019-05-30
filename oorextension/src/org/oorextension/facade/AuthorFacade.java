package org.oorextension.facade;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.oorextension.data.AuthorData;
import org.oorextension.model.AuthorModel;
import org.oorextension.service.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorFacade {

    private AuthorService authorService;

    private Converter<AuthorData, AuthorModel> authorModelConverter;
    private Converter<AuthorModel, AuthorData> authorDataConverter;

    public AuthorFacade(AuthorService authorService, Converter<AuthorData, AuthorModel> authorModelConverter, Converter<AuthorModel, AuthorData> authorDataConverter) {
        this.authorService = authorService;
        this.authorModelConverter = authorModelConverter;
        this.authorDataConverter = authorDataConverter;
    }

    public List<AuthorData> getAuthorByLastName(String lastName) {
        List<AuthorModel> authorModelList = authorService.findByLastName(lastName);
        return authorModelList
                .stream()
                .map(authorDataConverter::convert)
                .collect(Collectors.toList());
    }

    public AuthorData saveAuthor(AuthorData authorData) throws Exception {
        AuthorModel authorModel = authorModelConverter.convert(authorData, new AuthorModel());
        authorService.save(authorModel);

        return authorDataConverter.convert(authorService.findByPk(authorModel.getPk()), authorData);
    }

    public List<AuthorData> getAllAuthors() {

        return authorDataConverter.convertAll(authorService.findAll());
    }
}
