package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum VideoColorRange {
    FULL("FULL"),
    LIMITED("LIMITED");

    private static final Map<String, VideoColorRange> enumMap;
    private String value;

    static {
        VideoColorRange videoColorRange = FULL;
        VideoColorRange videoColorRange2 = LIMITED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FULL", videoColorRange);
        map.put("LIMITED", videoColorRange2);
    }

    VideoColorRange(String str) {
        this.value = str;
    }

    public static VideoColorRange fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, VideoColorRange> map = enumMap;
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
