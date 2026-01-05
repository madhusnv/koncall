package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum Attribute {
    DEFAULT("DEFAULT"),
    ALL("ALL"),
    AGE_RANGE("AGE_RANGE"),
    BEARD("BEARD"),
    EMOTIONS("EMOTIONS"),
    EYE_DIRECTION("EYE_DIRECTION"),
    EYEGLASSES("EYEGLASSES"),
    EYES_OPEN("EYES_OPEN"),
    GENDER("GENDER"),
    MOUTH_OPEN("MOUTH_OPEN"),
    MUSTACHE("MUSTACHE"),
    FACE_OCCLUDED("FACE_OCCLUDED"),
    SMILE("SMILE"),
    SUNGLASSES("SUNGLASSES");

    private static final Map<String, Attribute> enumMap;
    private String value;

    static {
        Attribute attribute = DEFAULT;
        Attribute attribute2 = ALL;
        Attribute attribute3 = AGE_RANGE;
        Attribute attribute4 = BEARD;
        Attribute attribute5 = EMOTIONS;
        Attribute attribute6 = EYE_DIRECTION;
        Attribute attribute7 = EYEGLASSES;
        Attribute attribute8 = EYES_OPEN;
        Attribute attribute9 = GENDER;
        Attribute attribute10 = MOUTH_OPEN;
        Attribute attribute11 = MUSTACHE;
        Attribute attribute12 = FACE_OCCLUDED;
        Attribute attribute13 = SMILE;
        Attribute attribute14 = SUNGLASSES;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("DEFAULT", attribute);
        map.put("ALL", attribute2);
        map.put("AGE_RANGE", attribute3);
        map.put("BEARD", attribute4);
        map.put("EMOTIONS", attribute5);
        map.put("EYE_DIRECTION", attribute6);
        map.put("EYEGLASSES", attribute7);
        map.put("EYES_OPEN", attribute8);
        map.put("GENDER", attribute9);
        map.put("MOUTH_OPEN", attribute10);
        map.put("MUSTACHE", attribute11);
        map.put("FACE_OCCLUDED", attribute12);
        map.put("SMILE", attribute13);
        map.put("SUNGLASSES", attribute14);
    }

    Attribute(String str) {
        this.value = str;
    }

    public static Attribute fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Attribute> map = enumMap;
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
