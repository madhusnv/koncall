package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum UserStatus {
    ACTIVE("ACTIVE"),
    UPDATING("UPDATING"),
    CREATING("CREATING"),
    CREATED("CREATED");

    private static final Map<String, UserStatus> enumMap;
    private String value;

    static {
        UserStatus userStatus = ACTIVE;
        UserStatus userStatus2 = UPDATING;
        UserStatus userStatus3 = CREATING;
        UserStatus userStatus4 = CREATED;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ACTIVE", userStatus);
        map.put("UPDATING", userStatus2);
        map.put("CREATING", userStatus3);
        map.put("CREATED", userStatus4);
    }

    UserStatus(String str) {
        this.value = str;
    }

    public static UserStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UserStatus> map = enumMap;
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
