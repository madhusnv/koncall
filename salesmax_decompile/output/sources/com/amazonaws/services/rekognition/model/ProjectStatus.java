package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ProjectStatus {
    CREATING("CREATING"),
    CREATED("CREATED"),
    DELETING("DELETING");

    private static final Map<String, ProjectStatus> enumMap;
    private String value;

    static {
        ProjectStatus projectStatus = CREATING;
        ProjectStatus projectStatus2 = CREATED;
        ProjectStatus projectStatus3 = DELETING;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("CREATING", projectStatus);
        map.put("CREATED", projectStatus2);
        map.put("DELETING", projectStatus3);
    }

    ProjectStatus(String str) {
        this.value = str;
    }

    public static ProjectStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ProjectStatus> map = enumMap;
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
