package org.oorextension.dao.impl;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.oorextension.dao.AuthorDAO;
import org.oorextension.dao.DAOUtils;
import org.oorextension.model.AuthorModel;

import java.util.List;

public class DefaultAuthorDAO implements AuthorDAO {

    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;

    public DefaultAuthorDAO(FlexibleSearchService flexibleSearchService, ModelService modelService) {
        this.flexibleSearchService = flexibleSearchService;
        this.modelService = modelService;
    }

    @Override
    public List<AuthorModel> findAll() {
        String stringQuery = "SELECT {pk} FROM {" + AuthorModel._TYPECODE + "}";
        FlexibleSearchQuery query = new FlexibleSearchQuery(stringQuery);

        return flexibleSearchService.<AuthorModel>search(query).getResult();
    }

    @Override
    public AuthorModel findByPk(PK pk) {
        return modelService.get(pk);
    }

    @Override
    public List<AuthorModel> findAuthorByLastName(String lastName) {
        String stringQuery = "SELECT * FROM {" + AuthorModel._TYPECODE + " as a} WHERE a." + AuthorModel.LASTNAME +
                "= " + lastName;
        FlexibleSearchQuery query = new FlexibleSearchQuery(stringQuery);

        return flexibleSearchService.<AuthorModel>search(query).getResult();
    }

    @Override
    public AuthorModel save(AuthorModel author) throws Exception {
        return (AuthorModel) DAOUtils.saveWithTransaction(modelService, author);
    }

    @Override
    public AuthorModel update(AuthorModel author) throws Exception {
        AuthorModel updatedAuthorModel = modelService.get(author.getPk());
        updatedAuthorModel.setFirstName(author.getFirstName());
        updatedAuthorModel.setLastName(author.getLastName());
        updatedAuthorModel.setBooks(author.getBooks());
        modelService.save(updatedAuthorModel);

        return modelService.get(updatedAuthorModel.getPk());
    }

    @Override
    public void delete(AuthorModel author) {
        modelService.remove(author);
    }


}
