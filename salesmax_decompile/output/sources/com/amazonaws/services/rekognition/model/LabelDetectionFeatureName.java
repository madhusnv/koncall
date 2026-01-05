package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum LabelDetectionFeatureName {
    GENERAL_LABELS("GENERAL_LABELS");

    private static final Map<String, LabelDetectionFeatureName> enumMap;
    private String value;

    static {
        LabelDetectionFeatureName labelDetectionFeatureName = GENERAL_LABELS;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("GENERAL_LABELS", labelDetectionFeatureName);
    }

    LabelDetectionFeatureName(String str) {
        this.value = str;
    }

    public static LabelDetectionFeatureName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, LabelDetectionFeatureName> map = enumMap;
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
