package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TechnicalCueSegment;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TechnicalCueSegmentJsonUnmarshaller implements Unmarshaller<TechnicalCueSegment, JsonUnmarshallerContext> {
    private static TechnicalCueSegmentJsonUnmarshaller instance;

    public static TechnicalCueSegmentJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TechnicalCueSegmentJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TechnicalCueSegment unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TechnicalCueSegment technicalCueSegment = new TechnicalCueSegment();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Type")) {
                technicalCueSegment.setType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                technicalCueSegment.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return technicalCueSegment;
    }
}
