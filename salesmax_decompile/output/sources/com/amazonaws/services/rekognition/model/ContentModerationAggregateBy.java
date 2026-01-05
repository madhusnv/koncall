package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ContentModerationAggregateBy {
    TIMESTAMPS("TIMESTAMPS"),
    SEGMENTS("SEGMENTS");

    private static final Map<String, ContentModerationAggregateBy> enumMap;
    private String value;

    static {
        ContentModerationAggregateBy contentModerationAggregateBy = TIMESTAMPS;
        ContentModerationAggregateBy contentModerationAggregateBy2 = SEGMENTS;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("TIMESTAMPS", contentModerationAggregateBy);
        map.put("SEGMENTS", contentModerationAggregateBy2);
    }

    ContentModerationAggregateBy(String str) {
        this.value = str;
    }

    public static ContentModerationAggregateBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ContentModerationAggregateBy> map = enumMap;
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
