package org.oorextension.service.impl;

import de.hybris.platform.core.PK;
import org.oorextension.dao.AuthorDAO;
import org.oorextension.model.AuthorModel;
import org.oorextension.service.AuthorService;

import java.util.List;

public class DefaultAuthorModelService implements AuthorService {

    private AuthorDAO authorDAO;

    public DefaultAuthorModelService(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Override
    public List<AuthorModel> findAll() {
        return authorDAO.findAll();
    }

    @Override
    public AuthorModel findByPk(PK pk) {
        return authorDAO.findByPk(pk);
    }

    @Override
    public AuthorModel save(AuthorModel model) throws Exception {
        return authorDAO.save(model);
    }

    @Override
    public AuthorModel update(AuthorModel model) throws Exception {
        return authorDAO.update(model);
    }

    @Override
    public void delete(AuthorModel model) {
        authorDAO.delete(model);
    }

    @Override
    public List<AuthorModel> findByLastName(String lastName) {
        return authorDAO.findAuthorByLastName(lastName);
    }
}
