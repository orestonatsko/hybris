package org.oorextension.action;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.RetryLaterException;
import org.oorextension.enums.ProductStatus;
import org.oorextension.model.BusinessProcessStatusProductModel;
import org.oorextension.model.MyStatusProductModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertProductAction extends AbstractSimpleDecisionAction<BusinessProcessStatusProductModel> {
    private Logger logger = LoggerFactory.getLogger(InsertProductAction.class);

    private ModelService modelService;

    public InsertProductAction(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public Transition executeAction(BusinessProcessStatusProductModel businessProcessStatusProductModel) throws RetryLaterException, Exception {
        logger.info("##############################");
        logger.info("---  InsertProductAction  ---");
        logger.info("##############################");

        MyStatusProductModel productModel = new MyStatusProductModel();
        productModel.setSynchronized(false);
        productModel.setStatus(ProductStatus.OUTDATED);

        modelService.save(productModel);

        return Transition.OK;
    }
}
