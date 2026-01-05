package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum Reason {
    EXCEEDS_MAX_FACES("EXCEEDS_MAX_FACES"),
    EXTREME_POSE("EXTREME_POSE"),
    LOW_BRIGHTNESS("LOW_BRIGHTNESS"),
    LOW_SHARPNESS("LOW_SHARPNESS"),
    LOW_CONFIDENCE("LOW_CONFIDENCE"),
    SMALL_BOUNDING_BOX("SMALL_BOUNDING_BOX"),
    LOW_FACE_QUALITY("LOW_FACE_QUALITY");

    private static final Map<String, Reason> enumMap;
    private String value;

    static {
        Reason reason = EXCEEDS_MAX_FACES;
        Reason reason2 = EXTREME_POSE;
        Reason reason3 = LOW_BRIGHTNESS;
        Reason reason4 = LOW_SHARPNESS;
        Reason reason5 = LOW_CONFIDENCE;
        Reason reason6 = SMALL_BOUNDING_BOX;
        Reason reason7 = LOW_FACE_QUALITY;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("EXCEEDS_MAX_FACES", reason);
        map.put("EXTREME_POSE", reason2);
        map.put("LOW_BRIGHTNESS", reason3);
        map.put("LOW_SHARPNESS", reason4);
        map.put("LOW_CONFIDENCE", reason5);
        map.put("SMALL_BOUNDING_BOX", reason6);
        map.put("LOW_FACE_QUALITY", reason7);
    }

    Reason(String str) {
        this.value = str;
    }

    public static Reason fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Reason> map = enumMap;
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
