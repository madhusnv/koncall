package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum SegmentType {
    TECHNICAL_CUE("TECHNICAL_CUE"),
    SHOT("SHOT");

    private static final Map<String, SegmentType> enumMap;
    private String value;

    static {
        SegmentType segmentType = TECHNICAL_CUE;
        SegmentType segmentType2 = SHOT;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("TECHNICAL_CUE", segmentType);
        map.put("SHOT", segmentType2);
    }

    SegmentType(String str) {
        this.value = str;
    }

    public static SegmentType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, SegmentType> map = enumMap;
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
