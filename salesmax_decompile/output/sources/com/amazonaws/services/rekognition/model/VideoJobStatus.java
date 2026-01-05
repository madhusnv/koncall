package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum VideoJobStatus {
    IN_PROGRESS("IN_PROGRESS"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED");

    private static final Map<String, VideoJobStatus> enumMap;
    private String value;

    static {
        VideoJobStatus videoJobStatus = IN_PROGRESS;
        VideoJobStatus videoJobStatus2 = SUCCEEDED;
        VideoJobStatus videoJobStatus3 = FAILED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("IN_PROGRESS", videoJobStatus);
        map.put("SUCCEEDED", videoJobStatus2);
        map.put("FAILED", videoJobStatus3);
    }

    VideoJobStatus(String str) {
        this.value = str;
    }

    public static VideoJobStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, VideoJobStatus> map = enumMap;
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
