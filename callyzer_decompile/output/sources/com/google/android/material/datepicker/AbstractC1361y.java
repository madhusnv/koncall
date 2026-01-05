package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.y */
/* loaded from: classes.dex */
public abstract class AbstractC1361y {

    /* renamed from: a */
    public static final AtomicReference f6916a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m4111a(Calendar calendar) {
        Calendar calendarM4113c = m4113c(calendar);
        Calendar calendarM4113c2 = m4113c(null);
        calendarM4113c2.set(calendarM4113c.get(1), calendarM4113c.get(2), calendarM4113c.get(5));
        return calendarM4113c2;
    }

    /* renamed from: b */
    public static Calendar m4112b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m4113c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
