package org.oorextension.action;

import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.task.RetryLaterException;
import org.oorextension.model.BusinessProcessStatusProductModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductSynchronizingAction extends AbstractSimpleDecisionAction<BusinessProcessStatusProductModel> {
    private Logger logger = LoggerFactory.getLogger(ProductSynchronizingAction.class);

    private CronJobService cronJobService;

    public ProductSynchronizingAction(CronJobService cronJobService) {
        this.cronJobService = cronJobService;
    }

    @Override
    public Transition executeAction(BusinessProcessStatusProductModel businessProcessStatusProductModel) throws RetryLaterException, Exception {
        logger.info("#####################################");
        logger.info("---  ProductSynchronizingAction  ---");
        logger.info("#####################################");

        CronJobModel cronJob = cronJobService.getCronJob("synchronizingCronJob");
        cronJobService.performCronJob(cronJob);

        return Transition.OK;
    }
}
