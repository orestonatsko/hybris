package org.oorextension.service;

import org.oorextension.model.AuthorModel;

import java.util.List;

public interface AuthorService extends CrudService<AuthorModel> {
   List<AuthorModel> findByLastName(String lastName);
}
