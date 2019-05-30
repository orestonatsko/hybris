package org.oorextension.dao;

import de.hybris.platform.core.PK;
import org.oorextension.model.BookModel;

import java.util.List;

public interface BookDAO {

    List<BookModel> findAll();

    BookModel save(BookModel book) throws Exception;

    BookModel update(BookModel book) throws Exception;

    void delete(BookModel book);


    BookModel findByPk(PK pk);
}
