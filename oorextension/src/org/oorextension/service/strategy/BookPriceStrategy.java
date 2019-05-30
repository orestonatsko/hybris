package org.oorextension.service.strategy;

import org.oorextension.model.BookModel;

import java.math.BigDecimal;

public interface BookPriceStrategy {
    BigDecimal calculate(BookModel bookModel);
}
