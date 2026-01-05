package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum StreamProcessorStatus {
    STOPPED("STOPPED"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    FAILED("FAILED"),
    STOPPING("STOPPING"),
    UPDATING("UPDATING");

    private static final Map<String, StreamProcessorStatus> enumMap;
    private String value;

    static {
        StreamProcessorStatus streamProcessorStatus = STOPPED;
        StreamProcessorStatus streamProcessorStatus2 = STARTING;
        StreamProcessorStatus streamProcessorStatus3 = RUNNING;
        StreamProcessorStatus streamProcessorStatus4 = FAILED;
        StreamProcessorStatus streamProcessorStatus5 = STOPPING;
        StreamProcessorStatus streamProcessorStatus6 = UPDATING;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("STOPPED", streamProcessorStatus);
        map.put("STARTING", streamProcessorStatus2);
        map.put("RUNNING", streamProcessorStatus3);
        map.put("FAILED", streamProcessorStatus4);
        map.put("STOPPING", streamProcessorStatus5);
        map.put("UPDATING", streamProcessorStatus6);
    }

    StreamProcessorStatus(String str) {
        this.value = str;
    }

    public static StreamProcessorStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, StreamProcessorStatus> map = enumMap;
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
