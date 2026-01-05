package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum LivenessSessionStatus {
    CREATED("CREATED"),
    IN_PROGRESS("IN_PROGRESS"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED"),
    EXPIRED("EXPIRED");

    private static final Map<String, LivenessSessionStatus> enumMap;
    private String value;

    static {
        LivenessSessionStatus livenessSessionStatus = CREATED;
        LivenessSessionStatus livenessSessionStatus2 = IN_PROGRESS;
        LivenessSessionStatus livenessSessionStatus3 = SUCCEEDED;
        LivenessSessionStatus livenessSessionStatus4 = FAILED;
        LivenessSessionStatus livenessSessionStatus5 = EXPIRED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("CREATED", livenessSessionStatus);
        map.put("IN_PROGRESS", livenessSessionStatus2);
        map.put("SUCCEEDED", livenessSessionStatus3);
        map.put("FAILED", livenessSessionStatus4);
        map.put("EXPIRED", livenessSessionStatus5);
    }

    LivenessSessionStatus(String str) {
        this.value = str;
    }

    public static LivenessSessionStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, LivenessSessionStatus> map = enumMap;
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
