package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum GenderType {
    Male("Male"),
    Female("Female");

    private static final Map<String, GenderType> enumMap;
    private String value;

    static {
        GenderType genderType = Male;
        GenderType genderType2 = Female;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("Male", genderType);
        map.put("Female", genderType2);
    }

    GenderType(String str) {
        this.value = str;
    }

    public static GenderType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, GenderType> map = enumMap;
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
