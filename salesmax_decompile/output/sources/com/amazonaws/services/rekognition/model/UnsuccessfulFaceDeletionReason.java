package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum UnsuccessfulFaceDeletionReason {
    ASSOCIATED_TO_AN_EXISTING_USER("ASSOCIATED_TO_AN_EXISTING_USER"),
    FACE_NOT_FOUND("FACE_NOT_FOUND");

    private static final Map<String, UnsuccessfulFaceDeletionReason> enumMap;
    private String value;

    static {
        UnsuccessfulFaceDeletionReason unsuccessfulFaceDeletionReason = ASSOCIATED_TO_AN_EXISTING_USER;
        UnsuccessfulFaceDeletionReason unsuccessfulFaceDeletionReason2 = FACE_NOT_FOUND;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ASSOCIATED_TO_AN_EXISTING_USER", unsuccessfulFaceDeletionReason);
        map.put("FACE_NOT_FOUND", unsuccessfulFaceDeletionReason2);
    }

    UnsuccessfulFaceDeletionReason(String str) {
        this.value = str;
    }

    public static UnsuccessfulFaceDeletionReason fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UnsuccessfulFaceDeletionReason> map = enumMap;
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
