package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ProtectiveEquipmentType {
    FACE_COVER("FACE_COVER"),
    HAND_COVER("HAND_COVER"),
    HEAD_COVER("HEAD_COVER");

    private static final Map<String, ProtectiveEquipmentType> enumMap;
    private String value;

    static {
        ProtectiveEquipmentType protectiveEquipmentType = FACE_COVER;
        ProtectiveEquipmentType protectiveEquipmentType2 = HAND_COVER;
        ProtectiveEquipmentType protectiveEquipmentType3 = HEAD_COVER;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FACE_COVER", protectiveEquipmentType);
        map.put("HAND_COVER", protectiveEquipmentType2);
        map.put("HEAD_COVER", protectiveEquipmentType3);
    }

    ProtectiveEquipmentType(String str) {
        this.value = str;
    }

    public static ProtectiveEquipmentType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ProtectiveEquipmentType> map = enumMap;
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
