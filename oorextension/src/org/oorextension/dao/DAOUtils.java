package org.oorextension.dao;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.tx.Transaction;
import de.hybris.platform.tx.TransactionBody;

public class DAOUtils {

    public static Object saveWithTransaction(ModelService modelService, ItemModel model) throws Exception {
        return  Transaction.current().execute(new TransactionBody() {
            @Override
            public <T> T execute() throws Exception {
                modelService.attach(model);
                modelService.save(model);
                return modelService.get(model.getPk());
            }
        });
    }
}
