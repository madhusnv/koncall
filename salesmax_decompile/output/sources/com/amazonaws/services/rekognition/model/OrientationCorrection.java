package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum OrientationCorrection {
    ROTATE_0("ROTATE_0"),
    ROTATE_90("ROTATE_90"),
    ROTATE_180("ROTATE_180"),
    ROTATE_270("ROTATE_270");

    private static final Map<String, OrientationCorrection> enumMap;
    private String value;

    static {
        OrientationCorrection orientationCorrection = ROTATE_0;
        OrientationCorrection orientationCorrection2 = ROTATE_90;
        OrientationCorrection orientationCorrection3 = ROTATE_180;
        OrientationCorrection orientationCorrection4 = ROTATE_270;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ROTATE_0", orientationCorrection);
        map.put("ROTATE_90", orientationCorrection2);
        map.put("ROTATE_180", orientationCorrection3);
        map.put("ROTATE_270", orientationCorrection4);
    }

    OrientationCorrection(String str) {
        this.value = str;
    }

    public static OrientationCorrection fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, OrientationCorrection> map = enumMap;
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
