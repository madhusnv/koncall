package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum PersonTrackingSortBy {
    INDEX("INDEX"),
    TIMESTAMP("TIMESTAMP");

    private static final Map<String, PersonTrackingSortBy> enumMap;
    private String value;

    static {
        PersonTrackingSortBy personTrackingSortBy = INDEX;
        PersonTrackingSortBy personTrackingSortBy2 = TIMESTAMP;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("INDEX", personTrackingSortBy);
        map.put("TIMESTAMP", personTrackingSortBy2);
    }

    PersonTrackingSortBy(String str) {
        this.value = str;
    }

    public static PersonTrackingSortBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, PersonTrackingSortBy> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
