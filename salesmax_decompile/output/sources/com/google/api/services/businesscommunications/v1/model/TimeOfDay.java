package com.google.api.services.businesscommunications.v1.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* loaded from: classes3.dex */
public final class TimeOfDay extends GenericJson {

    @Key
    private Integer hours;

    @Key
    private Integer minutes;

    @Key
    private Integer nanos;

    @Key
    private Integer seconds;

    public Integer getHours() {
        return this.hours;
    }

    public Integer getMinutes() {
        return this.minutes;
    }

    public Integer getNanos() {
        return this.nanos;
    }

    public Integer getSeconds() {
        return this.seconds;
    }

    public TimeOfDay setHours(Integer num) {
        this.hours = num;
        return this;
    }

    public TimeOfDay setMinutes(Integer num) {
        this.minutes = num;
        return this;
    }

    public TimeOfDay setNanos(Integer num) {
        this.nanos = num;
        return this;
    }

    public TimeOfDay setSeconds(Integer num) {
        this.seconds = num;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TimeOfDay set(String str, Object obj) {
        return (TimeOfDay) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TimeOfDay clone() {
        return (TimeOfDay) super.clone();
    }
}
