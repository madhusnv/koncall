package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum LandmarkType {
    EyeLeft("eyeLeft"),
    EyeRight("eyeRight"),
    Nose("nose"),
    MouthLeft("mouthLeft"),
    MouthRight("mouthRight"),
    LeftEyeBrowLeft("leftEyeBrowLeft"),
    LeftEyeBrowRight("leftEyeBrowRight"),
    LeftEyeBrowUp("leftEyeBrowUp"),
    RightEyeBrowLeft("rightEyeBrowLeft"),
    RightEyeBrowRight("rightEyeBrowRight"),
    RightEyeBrowUp("rightEyeBrowUp"),
    LeftEyeLeft("leftEyeLeft"),
    LeftEyeRight("leftEyeRight"),
    LeftEyeUp("leftEyeUp"),
    LeftEyeDown("leftEyeDown"),
    RightEyeLeft("rightEyeLeft"),
    RightEyeRight("rightEyeRight"),
    RightEyeUp("rightEyeUp"),
    RightEyeDown("rightEyeDown"),
    NoseLeft("noseLeft"),
    NoseRight("noseRight"),
    MouthUp("mouthUp"),
    MouthDown("mouthDown"),
    LeftPupil("leftPupil"),
    RightPupil("rightPupil"),
    UpperJawlineLeft("upperJawlineLeft"),
    MidJawlineLeft("midJawlineLeft"),
    ChinBottom("chinBottom"),
    MidJawlineRight("midJawlineRight"),
    UpperJawlineRight("upperJawlineRight");

    private static final Map<String, LandmarkType> enumMap;
    private String value;

    static {
        LandmarkType landmarkType = EyeLeft;
        LandmarkType landmarkType2 = EyeRight;
        LandmarkType landmarkType3 = Nose;
        LandmarkType landmarkType4 = MouthLeft;
        LandmarkType landmarkType5 = MouthRight;
        LandmarkType landmarkType6 = LeftEyeBrowLeft;
        LandmarkType landmarkType7 = LeftEyeBrowRight;
        LandmarkType landmarkType8 = LeftEyeBrowUp;
        LandmarkType landmarkType9 = RightEyeBrowLeft;
        LandmarkType landmarkType10 = RightEyeBrowRight;
        LandmarkType landmarkType11 = RightEyeBrowUp;
        LandmarkType landmarkType12 = LeftEyeLeft;
        LandmarkType landmarkType13 = LeftEyeRight;
        LandmarkType landmarkType14 = LeftEyeUp;
        LandmarkType landmarkType15 = LeftEyeDown;
        LandmarkType landmarkType16 = RightEyeLeft;
        LandmarkType landmarkType17 = RightEyeRight;
        LandmarkType landmarkType18 = RightEyeUp;
        LandmarkType landmarkType19 = RightEyeDown;
        LandmarkType landmarkType20 = NoseLeft;
        LandmarkType landmarkType21 = NoseRight;
        LandmarkType landmarkType22 = MouthUp;
        LandmarkType landmarkType23 = MouthDown;
        LandmarkType landmarkType24 = LeftPupil;
        LandmarkType landmarkType25 = RightPupil;
        LandmarkType landmarkType26 = UpperJawlineLeft;
        LandmarkType landmarkType27 = MidJawlineLeft;
        LandmarkType landmarkType28 = ChinBottom;
        LandmarkType landmarkType29 = MidJawlineRight;
        LandmarkType landmarkType30 = UpperJawlineRight;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("eyeLeft", landmarkType);
        map.put("eyeRight", landmarkType2);
        map.put("nose", landmarkType3);
        map.put("mouthLeft", landmarkType4);
        map.put("mouthRight", landmarkType5);
        map.put("leftEyeBrowLeft", landmarkType6);
        map.put("leftEyeBrowRight", landmarkType7);
        map.put("leftEyeBrowUp", landmarkType8);
        map.put("rightEyeBrowLeft", landmarkType9);
        map.put("rightEyeBrowRight", landmarkType10);
        map.put("rightEyeBrowUp", landmarkType11);
        map.put("leftEyeLeft", landmarkType12);
        map.put("leftEyeRight", landmarkType13);
        map.put("leftEyeUp", landmarkType14);
        map.put("leftEyeDown", landmarkType15);
        map.put("rightEyeLeft", landmarkType16);
        map.put("rightEyeRight", landmarkType17);
        map.put("rightEyeUp", landmarkType18);
        map.put("rightEyeDown", landmarkType19);
        map.put("noseLeft", landmarkType20);
        map.put("noseRight", landmarkType21);
        map.put("mouthUp", landmarkType22);
        map.put("mouthDown", landmarkType23);
        map.put("leftPupil", landmarkType24);
        map.put("rightPupil", landmarkType25);
        map.put("upperJawlineLeft", landmarkType26);
        map.put("midJawlineLeft", landmarkType27);
        map.put("chinBottom", landmarkType28);
        map.put("midJawlineRight", landmarkType29);
        map.put("upperJawlineRight", landmarkType30);
    }

    LandmarkType(String str) {
        this.value = str;
    }

    public static LandmarkType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, LandmarkType> map = enumMap;
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
