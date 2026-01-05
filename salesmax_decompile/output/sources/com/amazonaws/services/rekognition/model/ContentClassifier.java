package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum ContentClassifier {
    FreeOfPersonallyIdentifiableInformation("FreeOfPersonallyIdentifiableInformation"),
    FreeOfAdultContent("FreeOfAdultContent");

    private static final Map<String, ContentClassifier> enumMap;
    private String value;

    static {
        ContentClassifier contentClassifier = FreeOfPersonallyIdentifiableInformation;
        ContentClassifier contentClassifier2 = FreeOfAdultContent;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("FreeOfPersonallyIdentifiableInformation", contentClassifier);
        map.put("FreeOfAdultContent", contentClassifier2);
    }

    ContentClassifier(String str) {
        this.value = str;
    }

    public static ContentClassifier fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ContentClassifier> map = enumMap;
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
