package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class Hours extends GenericJson {

    @Key
    private String endDay;

    @Key
    private TimeOfDay endTime;

    @Key
    private String startDay;

    @Key
    private TimeOfDay startTime;

    @Key
    private String timeZone;

    public String getEndDay() {
        return this.endDay;
    }

    public TimeOfDay getEndTime() {
        return this.endTime;
    }

    public String getStartDay() {
        return this.startDay;
    }

    public TimeOfDay getStartTime() {
        return this.startTime;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public Hours setEndDay(String str) {
        this.endDay = str;
        return this;
    }

    public Hours setEndTime(TimeOfDay timeOfDay) {
        this.endTime = timeOfDay;
        return this;
    }

    public Hours setStartDay(String str) {
        this.startDay = str;
        return this;
    }

    public Hours setStartTime(TimeOfDay timeOfDay) {
        this.startTime = timeOfDay;
        return this;
    }

    public Hours setTimeZone(String str) {
        this.timeZone = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Hours set(String str, Object obj) {
        return (Hours) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Hours clone() {
        return (Hours) super.clone();
    }
}
