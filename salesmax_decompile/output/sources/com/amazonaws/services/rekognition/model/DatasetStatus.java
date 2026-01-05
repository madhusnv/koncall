package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum DatasetStatus {
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    CREATE_FAILED("CREATE_FAILED"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    UPDATE_COMPLETE("UPDATE_COMPLETE"),
    UPDATE_FAILED("UPDATE_FAILED"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS");

    private static final Map<String, DatasetStatus> enumMap;
    private String value;

    static {
        DatasetStatus datasetStatus = CREATE_IN_PROGRESS;
        DatasetStatus datasetStatus2 = CREATE_COMPLETE;
        DatasetStatus datasetStatus3 = CREATE_FAILED;
        DatasetStatus datasetStatus4 = UPDATE_IN_PROGRESS;
        DatasetStatus datasetStatus5 = UPDATE_COMPLETE;
        DatasetStatus datasetStatus6 = UPDATE_FAILED;
        DatasetStatus datasetStatus7 = DELETE_IN_PROGRESS;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("CREATE_IN_PROGRESS", datasetStatus);
        map.put("CREATE_COMPLETE", datasetStatus2);
        map.put("CREATE_FAILED", datasetStatus3);
        map.put("UPDATE_IN_PROGRESS", datasetStatus4);
        map.put("UPDATE_COMPLETE", datasetStatus5);
        map.put("UPDATE_FAILED", datasetStatus6);
        map.put("DELETE_IN_PROGRESS", datasetStatus7);
    }

    DatasetStatus(String str) {
        this.value = str;
    }

    public static DatasetStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, DatasetStatus> map = enumMap;
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
