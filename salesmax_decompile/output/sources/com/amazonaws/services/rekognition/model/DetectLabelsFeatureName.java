package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum DetectLabelsFeatureName {
    GENERAL_LABELS("GENERAL_LABELS"),
    IMAGE_PROPERTIES("IMAGE_PROPERTIES");

    private static final Map<String, DetectLabelsFeatureName> enumMap;
    private String value;

    static {
        DetectLabelsFeatureName detectLabelsFeatureName = GENERAL_LABELS;
        DetectLabelsFeatureName detectLabelsFeatureName2 = IMAGE_PROPERTIES;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("GENERAL_LABELS", detectLabelsFeatureName);
        map.put("IMAGE_PROPERTIES", detectLabelsFeatureName2);
    }

    DetectLabelsFeatureName(String str) {
        this.value = str;
    }

    public static DetectLabelsFeatureName fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, DetectLabelsFeatureName> map = enumMap;
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
