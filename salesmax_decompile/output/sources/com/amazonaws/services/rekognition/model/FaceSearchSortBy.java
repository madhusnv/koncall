package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum FaceSearchSortBy {
    INDEX("INDEX"),
    TIMESTAMP("TIMESTAMP");

    private static final Map<String, FaceSearchSortBy> enumMap;
    private String value;

    static {
        FaceSearchSortBy faceSearchSortBy = INDEX;
        FaceSearchSortBy faceSearchSortBy2 = TIMESTAMP;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("INDEX", faceSearchSortBy);
        map.put("TIMESTAMP", faceSearchSortBy2);
    }

    FaceSearchSortBy(String str) {
        this.value = str;
    }

    public static FaceSearchSortBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, FaceSearchSortBy> map = enumMap;
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
