package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SegmentTypeInfo;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SegmentTypeInfoJsonUnmarshaller implements Unmarshaller<SegmentTypeInfo, JsonUnmarshallerContext> {
    private static SegmentTypeInfoJsonUnmarshaller instance;

    public static SegmentTypeInfoJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SegmentTypeInfoJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SegmentTypeInfo unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentTypeInfo segmentTypeInfo = new SegmentTypeInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Type")) {
                segmentTypeInfo.setType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ModelVersion")) {
                segmentTypeInfo.setModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentTypeInfo;
    }
}
