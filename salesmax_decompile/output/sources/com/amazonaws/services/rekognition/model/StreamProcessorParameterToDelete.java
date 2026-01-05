package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum StreamProcessorParameterToDelete {
    ConnectedHomeMinConfidence("ConnectedHomeMinConfidence"),
    RegionsOfInterest("RegionsOfInterest");

    private static final Map<String, StreamProcessorParameterToDelete> enumMap;
    private String value;

    static {
        StreamProcessorParameterToDelete streamProcessorParameterToDelete = ConnectedHomeMinConfidence;
        StreamProcessorParameterToDelete streamProcessorParameterToDelete2 = RegionsOfInterest;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ConnectedHomeMinConfidence", streamProcessorParameterToDelete);
        map.put("RegionsOfInterest", streamProcessorParameterToDelete2);
    }

    StreamProcessorParameterToDelete(String str) {
        this.value = str;
    }

    public static StreamProcessorParameterToDelete fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, StreamProcessorParameterToDelete> map = enumMap;
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
