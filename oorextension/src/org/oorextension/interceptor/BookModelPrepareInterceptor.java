package org.oorextension.interceptor;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.oorextension.event.SavedInfoModelEvent;
import org.oorextension.model.BookModel;

import java.time.LocalDateTime;

public class BookModelPrepareInterceptor implements PrepareInterceptor<BookModel> {

    private EventService eventService;

    public BookModelPrepareInterceptor(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void onPrepare(BookModel bookModel, InterceptorContext interceptorContext) throws InterceptorException {
        PK pk = bookModel.getPk();
        LocalDateTime savingtDate = LocalDateTime.now();
        SavedInfoModelEvent event = new SavedInfoModelEvent(pk, savingtDate);

    }
}
