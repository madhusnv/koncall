package com.onesignal.user.internal.backend;

import java.util.Map;
import p001o.id5;

/* loaded from: classes6.dex */
public final class PropertiesObject {
    private final String country;
    private final String language;
    private final Double latitude;
    private final Double longitude;
    private final Map<String, String> tags;
    private final String timezoneId;

    public PropertiesObject() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.tags == null && this.language == null && this.timezoneId == null && this.country == null && this.latitude == null && this.longitude == null) ? false : true;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public PropertiesObject(Map<String, String> map, String str, String str2, String str3, Double d, Double d2) {
        this.tags = map;
        this.language = str;
        this.timezoneId = str2;
        this.country = str3;
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ PropertiesObject(Map map, String str, String str2, String str3, Double d, Double d2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2);
    }
}
