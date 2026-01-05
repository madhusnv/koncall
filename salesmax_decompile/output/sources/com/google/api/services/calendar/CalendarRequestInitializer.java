package com.google.api.services.calendar;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;

/* loaded from: classes3.dex */
public class CalendarRequestInitializer extends CommonGoogleJsonClientRequestInitializer {
    public CalendarRequestInitializer() {
    }

    public void initializeCalendarRequest(CalendarRequest<?> calendarRequest) {
    }

    @Override // com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer
    public final void initializeJsonRequest(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) {
        super.initializeJsonRequest(abstractGoogleJsonClientRequest);
        initializeCalendarRequest((CalendarRequest) abstractGoogleJsonClientRequest);
    }

    public CalendarRequestInitializer(String str) {
        super(str);
    }

    public CalendarRequestInitializer(String str, String str2) {
        super(str, str2);
    }
}
