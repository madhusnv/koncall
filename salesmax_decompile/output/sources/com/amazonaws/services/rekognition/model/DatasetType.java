package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum DatasetType {
    TRAIN("TRAIN"),
    TEST("TEST");

    private static final Map<String, DatasetType> enumMap;
    private String value;

    static {
        DatasetType datasetType = TRAIN;
        DatasetType datasetType2 = TEST;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("TRAIN", datasetType);
        map.put("TEST", datasetType2);
    }

    DatasetType(String str) {
        this.value = str;
    }

    public static DatasetType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, DatasetType> map = enumMap;
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
