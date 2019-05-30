package org.oorextension.eventlistener;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import org.apache.log4j.Logger;
import org.oorextension.event.SavedInfoModelEvent;

public class SavedInfoModelEventListener extends AbstractEventListener<SavedInfoModelEvent> {

    private final Logger logger = Logger.getLogger(SavedInfoModelEventListener.class);

    @Override
    protected void onEvent(SavedInfoModelEvent savedInfoModelEvent) {
        logger.info("Model PK: " + savedInfoModelEvent.getPk() + " preservation time: " + savedInfoModelEvent.getSavingTime());
    }
}
