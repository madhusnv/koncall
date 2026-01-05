package com.onesignal.common;

import android.os.Build;
import j$.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    public final String getTimeZoneId() {
        if (Build.VERSION.SDK_INT >= 26) {
            String id = ZoneId.systemDefault().getId();
            sq8.m48648g(id, "{\n            ZoneId.systemDefault().id\n        }");
            return id;
        }
        String id2 = TimeZone.getDefault().getID();
        sq8.m48648g(id2, "{\n            TimeZone.getDefault().id\n        }");
        return id2;
    }

    public final int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }
}
