package com.onesignal.location.internal.common;

/* loaded from: classes6.dex */
public final class LocationPoint {
    private Float accuracy;
    private Boolean bg;
    private Double lat;
    private Double log;
    private Long timeStamp;

    /* renamed from: type, reason: collision with root package name */
    private Integer f58162type;

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Boolean getBg() {
        return this.bg;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLog() {
        return this.log;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final Integer getType() {
        return this.f58162type;
    }

    public final void setAccuracy(Float f) {
        this.accuracy = f;
    }

    public final void setBg(Boolean bool) {
        this.bg = bool;
    }

    public final void setLat(Double d) {
        this.lat = d;
    }

    public final void setLog(Double d) {
        this.log = d;
    }

    public final void setTimeStamp(Long l) {
        this.timeStamp = l;
    }

    public final void setType(Integer num) {
        this.f58162type = num;
    }

    public String toString() {
        return "LocationPoint{lat=" + this.lat + ", log=" + this.log + ", accuracy=" + this.accuracy + ", type=" + this.f58162type + ", bg=" + this.bg + ", timeStamp=" + this.timeStamp + '}';
    }
}
