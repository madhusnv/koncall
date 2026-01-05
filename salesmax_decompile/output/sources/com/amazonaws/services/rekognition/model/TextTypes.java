package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum TextTypes {
    LINE("LINE"),
    WORD("WORD");

    private static final Map<String, TextTypes> enumMap;
    private String value;

    static {
        TextTypes textTypes = LINE;
        TextTypes textTypes2 = WORD;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("LINE", textTypes);
        map.put("WORD", textTypes2);
    }

    TextTypes(String str) {
        this.value = str;
    }

    public static TextTypes fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, TextTypes> map = enumMap;
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
