package com.google.api.services.calendar.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class CalendarNotification extends GenericJson {

    @Key
    private String method;

    /* renamed from: type, reason: collision with root package name */
    @Key
    private String f58147type;

    public String getMethod() {
        return this.method;
    }

    public String getType() {
        return this.f58147type;
    }

    public CalendarNotification setMethod(String str) {
        this.method = str;
        return this;
    }

    public CalendarNotification setType(String str) {
        this.f58147type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CalendarNotification set(String str, Object obj) {
        return (CalendarNotification) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CalendarNotification clone() {
        return (CalendarNotification) super.clone();
    }
}
