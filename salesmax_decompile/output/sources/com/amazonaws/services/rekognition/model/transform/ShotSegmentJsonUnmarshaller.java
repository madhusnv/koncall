package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ShotSegment;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ShotSegmentJsonUnmarshaller implements Unmarshaller<ShotSegment, JsonUnmarshallerContext> {
    private static ShotSegmentJsonUnmarshaller instance;

    public static ShotSegmentJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ShotSegmentJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ShotSegment unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ShotSegment shotSegment = new ShotSegment();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Index")) {
                shotSegment.setIndex(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                shotSegment.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return shotSegment;
    }
}
