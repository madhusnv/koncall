package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum LabelDetectionSortBy {
    NAME("NAME"),
    TIMESTAMP("TIMESTAMP");

    private static final Map<String, LabelDetectionSortBy> enumMap;
    private String value;

    static {
        LabelDetectionSortBy labelDetectionSortBy = NAME;
        LabelDetectionSortBy labelDetectionSortBy2 = TIMESTAMP;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("NAME", labelDetectionSortBy);
        map.put("TIMESTAMP", labelDetectionSortBy2);
    }

    LabelDetectionSortBy(String str) {
        this.value = str;
    }

    public static LabelDetectionSortBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, LabelDetectionSortBy> map = enumMap;
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
