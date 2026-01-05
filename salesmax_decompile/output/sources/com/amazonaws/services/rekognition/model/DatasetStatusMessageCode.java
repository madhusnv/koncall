package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum DatasetStatusMessageCode {
    SUCCESS("SUCCESS"),
    SERVICE_ERROR("SERVICE_ERROR"),
    CLIENT_ERROR("CLIENT_ERROR");

    private static final Map<String, DatasetStatusMessageCode> enumMap;
    private String value;

    static {
        DatasetStatusMessageCode datasetStatusMessageCode = SUCCESS;
        DatasetStatusMessageCode datasetStatusMessageCode2 = SERVICE_ERROR;
        DatasetStatusMessageCode datasetStatusMessageCode3 = CLIENT_ERROR;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("SUCCESS", datasetStatusMessageCode);
        map.put("SERVICE_ERROR", datasetStatusMessageCode2);
        map.put("CLIENT_ERROR", datasetStatusMessageCode3);
    }

    DatasetStatusMessageCode(String str) {
        this.value = str;
    }

    public static DatasetStatusMessageCode fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, DatasetStatusMessageCode> map = enumMap;
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
