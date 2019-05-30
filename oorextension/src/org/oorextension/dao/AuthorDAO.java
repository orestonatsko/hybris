package org.oorextension.dao;

import de.hybris.platform.core.PK;
import org.oorextension.model.AuthorModel;

import java.util.List;

public interface AuthorDAO {

    List<AuthorModel> findAll();

    List<AuthorModel> findAuthorByLastName(String lastName);

    AuthorModel save(AuthorModel author) throws Exception;

    AuthorModel update(AuthorModel author) throws Exception;

    void delete(AuthorModel author);

    AuthorModel findByPk(PK pk);
}