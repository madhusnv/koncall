package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum KnownGenderType {
    Male("Male"),
    Female("Female"),
    Nonbinary("Nonbinary"),
    Unlisted("Unlisted");

    private static final Map<String, KnownGenderType> enumMap;
    private String value;

    static {
        KnownGenderType knownGenderType = Male;
        KnownGenderType knownGenderType2 = Female;
        KnownGenderType knownGenderType3 = Nonbinary;
        KnownGenderType knownGenderType4 = Unlisted;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("Male", knownGenderType);
        map.put("Female", knownGenderType2);
        map.put("Nonbinary", knownGenderType3);
        map.put("Unlisted", knownGenderType4);
    }

    KnownGenderType(String str) {
        this.value = str;
    }

    public static KnownGenderType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, KnownGenderType> map = enumMap;
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
