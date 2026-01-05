package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum TechnicalCueType {
    ColorBars("ColorBars"),
    EndCredits("EndCredits"),
    BlackFrames("BlackFrames"),
    OpeningCredits("OpeningCredits"),
    StudioLogo("StudioLogo"),
    Slate("Slate"),
    Content("Content");

    private static final Map<String, TechnicalCueType> enumMap;
    private String value;

    static {
        TechnicalCueType technicalCueType = ColorBars;
        TechnicalCueType technicalCueType2 = EndCredits;
        TechnicalCueType technicalCueType3 = BlackFrames;
        TechnicalCueType technicalCueType4 = OpeningCredits;
        TechnicalCueType technicalCueType5 = StudioLogo;
        TechnicalCueType technicalCueType6 = Slate;
        TechnicalCueType technicalCueType7 = Content;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("ColorBars", technicalCueType);
        map.put("EndCredits", technicalCueType2);
        map.put("BlackFrames", technicalCueType3);
        map.put("OpeningCredits", technicalCueType4);
        map.put("StudioLogo", technicalCueType5);
        map.put("Slate", technicalCueType6);
        map.put("Content", technicalCueType7);
    }

    TechnicalCueType(String str) {
        this.value = str;
    }

    public static TechnicalCueType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, TechnicalCueType> map = enumMap;
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
