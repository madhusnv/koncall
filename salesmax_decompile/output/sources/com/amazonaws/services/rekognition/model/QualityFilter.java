package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum QualityFilter {
    NONE("NONE"),
    AUTO("AUTO"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private static final Map<String, QualityFilter> enumMap;
    private String value;

    static {
        QualityFilter qualityFilter = NONE;
        QualityFilter qualityFilter2 = AUTO;
        QualityFilter qualityFilter3 = LOW;
        QualityFilter qualityFilter4 = MEDIUM;
        QualityFilter qualityFilter5 = HIGH;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("NONE", qualityFilter);
        map.put("AUTO", qualityFilter2);
        map.put("LOW", qualityFilter3);
        map.put("MEDIUM", qualityFilter4);
        map.put("HIGH", qualityFilter5);
    }

    QualityFilter(String str) {
        this.value = str;
    }

    public static QualityFilter fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, QualityFilter> map = enumMap;
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
