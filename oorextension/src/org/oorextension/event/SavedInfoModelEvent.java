package org.oorextension.event;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import java.time.LocalDateTime;

public class SavedInfoModelEvent extends AbstractEvent {
    private PK pk;
    private LocalDateTime savingTime;

    public SavedInfoModelEvent(PK pk, LocalDateTime savingTime) {
        this.pk = pk;
        this.savingTime = savingTime;
    }

    public PK getPk() {
        return pk;
    }


    public LocalDateTime getSavingTime() {
        return savingTime;
    }
}
