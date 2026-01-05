package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum BodyPart {
    FACE("FACE"),
    HEAD("HEAD"),
    LEFT_HAND("LEFT_HAND"),
    RIGHT_HAND("RIGHT_HAND");

    private static final Map<String, BodyPart> enumMap;
    private String value;

    static {
        BodyPart bodyPart = FACE;
        BodyPart bodyPart2 = HEAD;
        BodyPart bodyPart3 = LEFT_HAND;
        BodyPart bodyPart4 = RIGHT_HAND;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FACE", bodyPart);
        map.put("HEAD", bodyPart2);
        map.put("LEFT_HAND", bodyPart3);
        map.put("RIGHT_HAND", bodyPart4);
    }

    BodyPart(String str) {
        this.value = str;
    }

    public static BodyPart fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, BodyPart> map = enumMap;
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
