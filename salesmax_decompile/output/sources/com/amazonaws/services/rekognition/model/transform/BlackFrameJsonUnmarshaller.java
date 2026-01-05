package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BlackFrame;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class BlackFrameJsonUnmarshaller implements Unmarshaller<BlackFrame, JsonUnmarshallerContext> {
    private static BlackFrameJsonUnmarshaller instance;

    public static BlackFrameJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new BlackFrameJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public BlackFrame unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BlackFrame blackFrame = new BlackFrame();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("MaxPixelThreshold")) {
                blackFrame.setMaxPixelThreshold(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MinCoveragePercentage")) {
                blackFrame.setMinCoveragePercentage(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return blackFrame;
    }
}
