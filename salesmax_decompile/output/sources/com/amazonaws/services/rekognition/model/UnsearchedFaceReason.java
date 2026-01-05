package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum UnsearchedFaceReason {
    FACE_NOT_LARGEST("FACE_NOT_LARGEST"),
    EXCEEDS_MAX_FACES("EXCEEDS_MAX_FACES"),
    EXTREME_POSE("EXTREME_POSE"),
    LOW_BRIGHTNESS("LOW_BRIGHTNESS"),
    LOW_SHARPNESS("LOW_SHARPNESS"),
    LOW_CONFIDENCE("LOW_CONFIDENCE"),
    SMALL_BOUNDING_BOX("SMALL_BOUNDING_BOX"),
    LOW_FACE_QUALITY("LOW_FACE_QUALITY");

    private static final Map<String, UnsearchedFaceReason> enumMap;
    private String value;

    static {
        UnsearchedFaceReason unsearchedFaceReason = FACE_NOT_LARGEST;
        UnsearchedFaceReason unsearchedFaceReason2 = EXCEEDS_MAX_FACES;
        UnsearchedFaceReason unsearchedFaceReason3 = EXTREME_POSE;
        UnsearchedFaceReason unsearchedFaceReason4 = LOW_BRIGHTNESS;
        UnsearchedFaceReason unsearchedFaceReason5 = LOW_SHARPNESS;
        UnsearchedFaceReason unsearchedFaceReason6 = LOW_CONFIDENCE;
        UnsearchedFaceReason unsearchedFaceReason7 = SMALL_BOUNDING_BOX;
        UnsearchedFaceReason unsearchedFaceReason8 = LOW_FACE_QUALITY;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FACE_NOT_LARGEST", unsearchedFaceReason);
        map.put("EXCEEDS_MAX_FACES", unsearchedFaceReason2);
        map.put("EXTREME_POSE", unsearchedFaceReason3);
        map.put("LOW_BRIGHTNESS", unsearchedFaceReason4);
        map.put("LOW_SHARPNESS", unsearchedFaceReason5);
        map.put("LOW_CONFIDENCE", unsearchedFaceReason6);
        map.put("SMALL_BOUNDING_BOX", unsearchedFaceReason7);
        map.put("LOW_FACE_QUALITY", unsearchedFaceReason8);
    }

    UnsearchedFaceReason(String str) {
        this.value = str;
    }

    public static UnsearchedFaceReason fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UnsearchedFaceReason> map = enumMap;
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
