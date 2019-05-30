package org.oorextension.action;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.task.RetryLaterException;
import org.oorextension.enums.ProductStatus;
import org.oorextension.model.BusinessProcessStatusProductModel;
import org.oorextension.model.MyStatusProductModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductReviewAction extends AbstractSimpleDecisionAction<BusinessProcessStatusProductModel> {
    private Logger logger = LoggerFactory.getLogger(ProductReviewAction.class);

    private FlexibleSearchService flexibleSearchService;

    public ProductReviewAction(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public Transition executeAction(BusinessProcessStatusProductModel businessProcessStatusProductModel) throws RetryLaterException, Exception {
        logger.info("##############################");
        logger.info("---  ProductReviewAction  ---");
        logger.info("##############################");

        String stringQuery = "SELECT {pk} FROM {" + MyStatusProductModel._TYPECODE + "}";

        FlexibleSearchQuery query = new FlexibleSearchQuery(stringQuery);

        MyStatusProductModel productModel = flexibleSearchService.<MyStatusProductModel>search(query).getResult().get(0);
        ProductStatus productStatus = productModel.getStatus();
        if(!productStatus.equals(ProductStatus.OUTDATED)){
            logger.info("####################################");
            logger.info("---  Product status: "+ productStatus +"   ---");
            logger.info("####################################");

            businessProcessStatusProductModel.setProductStatusPk(productModel.getPk());

            return Transition.OK;
        }
        return Transition.NOK;
    }
}
