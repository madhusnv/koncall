package com.onesignal.common;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    public final SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat(com.amazonaws.util.DateUtils.ISO8601_DATE_PATTERN, Locale.US);
    }
}
