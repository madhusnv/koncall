package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum LabelDetectionAggregateBy {
    TIMESTAMPS("TIMESTAMPS"),
    SEGMENTS("SEGMENTS");

    private static final Map<String, LabelDetectionAggregateBy> enumMap;
    private String value;

    static {
        LabelDetectionAggregateBy labelDetectionAggregateBy = TIMESTAMPS;
        LabelDetectionAggregateBy labelDetectionAggregateBy2 = SEGMENTS;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("TIMESTAMPS", labelDetectionAggregateBy);
        map.put("SEGMENTS", labelDetectionAggregateBy2);
    }

    LabelDetectionAggregateBy(String str) {
        this.value = str;
    }

    public static LabelDetectionAggregateBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, LabelDetectionAggregateBy> map = enumMap;
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
