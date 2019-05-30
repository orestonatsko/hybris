package org.oorextension.dao.impl;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.oorextension.dao.BookDAO;
import org.oorextension.dao.DAOUtils;
import org.oorextension.model.BookModel;

import java.util.List;

public class DefaultBookDAO implements BookDAO {
    private ModelService modelService;
    private FlexibleSearchService flexibleSearchService;

    public DefaultBookDAO(ModelService modelService, FlexibleSearchService flexibleSearchService) {
        this.modelService = modelService;
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<BookModel> findAll() {
        String stringQuery = "SELECT * FROM {" + BookModel._TYPECODE + "}";
        FlexibleSearchQuery query = new FlexibleSearchQuery(stringQuery);

        return flexibleSearchService.<BookModel>search(query).getResult();
    }


    @Override
    public BookModel findByPk(PK pk) {
        return modelService.get(pk);
    }

    @Override
    public BookModel save(BookModel book) throws Exception {

        return (BookModel) DAOUtils.saveWithTransaction(modelService, book);
    }

    @Override
    public BookModel update(BookModel book) throws Exception {
        BookModel updatedBook = modelService.get(book.getPk());
        updatedBook.setName(book.getName());
        updatedBook.setAuthor(updatedBook.getAuthor());
        updatedBook.setGenre(book.getGenre());
        updatedBook.setBasePrice(book.getBasePrice());
        updatedBook.setPublishingHouse(book.getPublishingHouse());
        modelService.save(updatedBook);

        return modelService.get(updatedBook.getPk());
    }

    @Override
    public void delete(BookModel book) {
        modelService.remove(book);
    }

}
