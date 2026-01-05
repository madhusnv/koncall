package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum UnsuccessfulFaceDisassociationReason {
    FACE_NOT_FOUND("FACE_NOT_FOUND"),
    ASSOCIATED_TO_A_DIFFERENT_USER("ASSOCIATED_TO_A_DIFFERENT_USER");

    private static final Map<String, UnsuccessfulFaceDisassociationReason> enumMap;
    private String value;

    static {
        UnsuccessfulFaceDisassociationReason unsuccessfulFaceDisassociationReason = FACE_NOT_FOUND;
        UnsuccessfulFaceDisassociationReason unsuccessfulFaceDisassociationReason2 = ASSOCIATED_TO_A_DIFFERENT_USER;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FACE_NOT_FOUND", unsuccessfulFaceDisassociationReason);
        map.put("ASSOCIATED_TO_A_DIFFERENT_USER", unsuccessfulFaceDisassociationReason2);
    }

    UnsuccessfulFaceDisassociationReason(String str) {
        this.value = str;
    }

    public static UnsuccessfulFaceDisassociationReason fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UnsuccessfulFaceDisassociationReason> map = enumMap;
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
