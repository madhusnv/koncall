package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum EmotionName {
    HAPPY("HAPPY"),
    SAD("SAD"),
    ANGRY("ANGRY"),
    CONFUSED("CONFUSED"),
    DISGUSTED("DISGUSTED"),
    SURPRISED("SURPRISED"),
    CALM("CALM"),
    FEAR("FEAR");

    private static final Map<String, EmotionName> enumMap;
    private String value;

    static {
        EmotionName emotionName = HAPPY;
        EmotionName emotionName2 = SAD;
        EmotionName emotionName3 = ANGRY;
        EmotionName emotionName4 = CONFUSED;
        EmotionName emotionName5 = DISGUSTED;
        EmotionName emotionName6 = SURPRISED;
        EmotionName emotionName7 = CALM;
        EmotionName emotionName8 = FEAR;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("HAPPY", emotionName);
        map.put("SAD", emotionName2);
        map.put("ANGRY", emotionName3);
        map.put("CONFUSED", emotionName4);
        map.put("DISGUSTED", emotionName5);
        map.put("SURPRISED", emotionName6);
        map.put("CALM", emotionName7);
        map.put("FEAR", emotionName8);
    }

    EmotionName(String str) {
        this.value = str;
    }

    public static EmotionName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, EmotionName> map = enumMap;
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
