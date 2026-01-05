package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum UnsuccessfulFaceAssociationReason {
    FACE_NOT_FOUND("FACE_NOT_FOUND"),
    ASSOCIATED_TO_A_DIFFERENT_USER("ASSOCIATED_TO_A_DIFFERENT_USER"),
    LOW_MATCH_CONFIDENCE("LOW_MATCH_CONFIDENCE");

    private static final Map<String, UnsuccessfulFaceAssociationReason> enumMap;
    private String value;

    static {
        UnsuccessfulFaceAssociationReason unsuccessfulFaceAssociationReason = FACE_NOT_FOUND;
        UnsuccessfulFaceAssociationReason unsuccessfulFaceAssociationReason2 = ASSOCIATED_TO_A_DIFFERENT_USER;
        UnsuccessfulFaceAssociationReason unsuccessfulFaceAssociationReason3 = LOW_MATCH_CONFIDENCE;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FACE_NOT_FOUND", unsuccessfulFaceAssociationReason);
        map.put("ASSOCIATED_TO_A_DIFFERENT_USER", unsuccessfulFaceAssociationReason2);
        map.put("LOW_MATCH_CONFIDENCE", unsuccessfulFaceAssociationReason3);
    }

    UnsuccessfulFaceAssociationReason(String str) {
        this.value = str;
    }

    public static UnsuccessfulFaceAssociationReason fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UnsuccessfulFaceAssociationReason> map = enumMap;
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
