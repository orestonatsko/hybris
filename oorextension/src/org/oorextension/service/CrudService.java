package org.oorextension.service;

import de.hybris.platform.core.PK;

import java.util.List;

public interface CrudService<T> {

    List<T> findAll();

    T findByPk(PK pk);

    T save(T model) throws Exception;

    T update(T model) throws Exception;

    void delete(T model);

}
