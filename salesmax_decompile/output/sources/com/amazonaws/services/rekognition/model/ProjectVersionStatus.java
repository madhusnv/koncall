package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ProjectVersionStatus {
    TRAINING_IN_PROGRESS("TRAINING_IN_PROGRESS"),
    TRAINING_COMPLETED("TRAINING_COMPLETED"),
    TRAINING_FAILED("TRAINING_FAILED"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    FAILED("FAILED"),
    STOPPING("STOPPING"),
    STOPPED("STOPPED"),
    DELETING("DELETING"),
    COPYING_IN_PROGRESS("COPYING_IN_PROGRESS"),
    COPYING_COMPLETED("COPYING_COMPLETED"),
    COPYING_FAILED("COPYING_FAILED");

    private static final Map<String, ProjectVersionStatus> enumMap;
    private String value;

    static {
        ProjectVersionStatus projectVersionStatus = TRAINING_IN_PROGRESS;
        ProjectVersionStatus projectVersionStatus2 = TRAINING_COMPLETED;
        ProjectVersionStatus projectVersionStatus3 = TRAINING_FAILED;
        ProjectVersionStatus projectVersionStatus4 = STARTING;
        ProjectVersionStatus projectVersionStatus5 = RUNNING;
        ProjectVersionStatus projectVersionStatus6 = FAILED;
        ProjectVersionStatus projectVersionStatus7 = STOPPING;
        ProjectVersionStatus projectVersionStatus8 = STOPPED;
        ProjectVersionStatus projectVersionStatus9 = DELETING;
        ProjectVersionStatus projectVersionStatus10 = COPYING_IN_PROGRESS;
        ProjectVersionStatus projectVersionStatus11 = COPYING_COMPLETED;
        ProjectVersionStatus projectVersionStatus12 = COPYING_FAILED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("TRAINING_IN_PROGRESS", projectVersionStatus);
        map.put("TRAINING_COMPLETED", projectVersionStatus2);
        map.put("TRAINING_FAILED", projectVersionStatus3);
        map.put("STARTING", projectVersionStatus4);
        map.put("RUNNING", projectVersionStatus5);
        map.put("FAILED", projectVersionStatus6);
        map.put("STOPPING", projectVersionStatus7);
        map.put("STOPPED", projectVersionStatus8);
        map.put("DELETING", projectVersionStatus9);
        map.put("COPYING_IN_PROGRESS", projectVersionStatus10);
        map.put("COPYING_COMPLETED", projectVersionStatus11);
        map.put("COPYING_FAILED", projectVersionStatus12);
    }

    ProjectVersionStatus(String str) {
        this.value = str;
    }

    public static ProjectVersionStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ProjectVersionStatus> map = enumMap;
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
