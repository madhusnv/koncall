package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum FaceAttributes {
    DEFAULT("DEFAULT"),
    ALL("ALL");

    private static final Map<String, FaceAttributes> enumMap;
    private String value;

    static {
        FaceAttributes faceAttributes = DEFAULT;
        FaceAttributes faceAttributes2 = ALL;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("DEFAULT", faceAttributes);
        map.put("ALL", faceAttributes2);
    }

    FaceAttributes(String str) {
        this.value = str;
    }

    public static FaceAttributes fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, FaceAttributes> map = enumMap;
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
