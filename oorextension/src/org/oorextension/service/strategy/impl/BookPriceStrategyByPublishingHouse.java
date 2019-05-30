package org.oorextension.service.strategy.impl;

import org.oorextension.enums.PublishingHouse;
import org.oorextension.model.BookModel;
import org.oorextension.service.strategy.BookPriceStrategy;

import java.math.BigDecimal;

public class BookPriceStrategyByPublishingHouse implements BookPriceStrategy {
    private final BigDecimal HACHETTE_BOOK_GROUP_RATE = new BigDecimal(1.2);
    private final BigDecimal HARPER_COLLINS_RATE = new BigDecimal(1.4);
    private final BigDecimal SIMON_AND_SCHUSTER_RATE = new BigDecimal(1.12);

    @Override
    public BigDecimal calculate(BookModel bookModel) {
        BigDecimal realPrice = bookModel.getBasePrice();

        PublishingHouse publishingHouse = bookModel.getPublishingHouse();

        if (publishingHouse.equals(PublishingHouse.HACHETTE_BOOK_GROUP)) {
            return realPrice.multiply(HACHETTE_BOOK_GROUP_RATE);

        } else if (publishingHouse.equals(PublishingHouse.HARPER_COLLINS)) {
            return realPrice.multiply(HARPER_COLLINS_RATE);

        } else if (publishingHouse.equals(PublishingHouse.SIMON_AND_SCHUSTER)) {
            return realPrice.multiply(SIMON_AND_SCHUSTER_RATE);

        }
        return realPrice;
    }
}
