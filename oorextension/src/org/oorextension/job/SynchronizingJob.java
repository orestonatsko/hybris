package org.oorextension.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.oorextension.model.MyStatusProductModel;
import org.oorextension.model.cronjob.SynchronizingCronJobModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SynchronizingJob extends AbstractJobPerformable<CronJobModel> {

    private Logger logger = LoggerFactory.getLogger(SynchronizingJob.class);

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        logger.info("############################");
        logger.info(" ---  SynchronizingJob  ---");
        logger.info("############################");

        SynchronizingCronJobModel synchronizingCronJobModel = (SynchronizingCronJobModel) cronJobModel;

        MyStatusProductModel productModel = modelService.get(synchronizingCronJobModel.getProductStatusPk());

        productModel.setSynchronized(true);

        logger.info("###########################################################################");
        logger.info("---  productModel synchronized: " + productModel.getSynchronized() + " ---");
        logger.info("###########################################################################");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
