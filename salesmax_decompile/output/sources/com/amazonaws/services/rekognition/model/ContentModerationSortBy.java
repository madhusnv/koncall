package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ContentModerationSortBy {
    NAME("NAME"),
    TIMESTAMP("TIMESTAMP");

    private static final Map<String, ContentModerationSortBy> enumMap;
    private String value;

    static {
        ContentModerationSortBy contentModerationSortBy = NAME;
        ContentModerationSortBy contentModerationSortBy2 = TIMESTAMP;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("NAME", contentModerationSortBy);
        map.put("TIMESTAMP", contentModerationSortBy2);
    }

    ContentModerationSortBy(String str) {
        this.value = str;
    }

    public static ContentModerationSortBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ContentModerationSortBy> map = enumMap;
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
