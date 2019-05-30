package org.oorextension.service.impl;

import de.hybris.platform.core.PK;
import org.oorextension.dao.BookDAO;
import org.oorextension.model.BookModel;
import org.oorextension.service.BookService;
import org.oorextension.service.strategy.BookPriceStrategy;

import java.util.List;

public class DefaultBookModelService implements BookService {

    private BookDAO bookDAO;
    private BookPriceStrategy priceStrategy;

    public DefaultBookModelService(BookDAO bookDAO, BookPriceStrategy priceStrategy) {
        this.bookDAO = bookDAO;
        this.priceStrategy = priceStrategy;
    }

    @Override
    public List<BookModel> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public BookModel findByPk(PK pk) {
        return bookDAO.findByPk(pk);
    }

    @Override
    public BookModel save(BookModel model) throws Exception {
        model.setFullPrice(priceStrategy.calculate(model));
        return bookDAO.save(model);
    }

    @Override
    public BookModel update(BookModel model) throws Exception {
        return bookDAO.update(model);
    }

    @Override
    public void delete(BookModel model) {
        bookDAO.delete(model);
    }

}
