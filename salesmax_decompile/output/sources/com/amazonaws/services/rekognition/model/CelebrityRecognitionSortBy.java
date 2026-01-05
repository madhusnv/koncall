package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum CelebrityRecognitionSortBy {
    ID("ID"),
    TIMESTAMP("TIMESTAMP");

    private static final Map<String, CelebrityRecognitionSortBy> enumMap;
    private String value;

    static {
        CelebrityRecognitionSortBy celebrityRecognitionSortBy = ID;
        CelebrityRecognitionSortBy celebrityRecognitionSortBy2 = TIMESTAMP;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ID", celebrityRecognitionSortBy);
        map.put("TIMESTAMP", celebrityRecognitionSortBy2);
    }

    CelebrityRecognitionSortBy(String str) {
        this.value = str;
    }

    public static CelebrityRecognitionSortBy fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, CelebrityRecognitionSortBy> map = enumMap;
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
