package org.oorextension.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.oorextension.model.BookModel;

public class BookAmountHandler implements DynamicAttributeHandler<Integer, BookModel> {
        private FlexibleSearchService flexibleSearchService;

    public BookAmountHandler(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public Integer get(BookModel model) {
        String stringQuery = "SELECT COUNT(pk) FROM {" + BookModel._TYPECODE + "}";
        FlexibleSearchQuery query = new FlexibleSearchQuery(stringQuery);
        return flexibleSearchService.<Integer>search(query).getResult().get(0);
    }

    @Override
    public void set(BookModel model, Integer value) {
            throw new UnsupportedOperationException("method set() is not available for property shortName in BookModel!");
    }
}
