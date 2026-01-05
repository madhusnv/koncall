package com.onesignal.core.internal.database;

/* loaded from: classes6.dex */
public interface ICursor {
    int getCount();

    float getFloat(String str);

    int getInt(String str);

    long getLong(String str);

    Float getOptFloat(String str);

    Integer getOptInt(String str);

    Long getOptLong(String str);

    String getOptString(String str);

    String getString(String str);

    boolean moveToFirst();

    boolean moveToNext();
}
