package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ModerationLabel;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ModerationLabelJsonUnmarshaller implements Unmarshaller<ModerationLabel, JsonUnmarshallerContext> {
    private static ModerationLabelJsonUnmarshaller instance;

    public static ModerationLabelJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ModerationLabelJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ModerationLabel unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ModerationLabel moderationLabel = new ModerationLabel();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Confidence")) {
                moderationLabel.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Name")) {
                moderationLabel.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ParentName")) {
                moderationLabel.setParentName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return moderationLabel;
    }
}
