package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceDeletion;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UnsuccessfulFaceDeletionJsonUnmarshaller implements Unmarshaller<UnsuccessfulFaceDeletion, JsonUnmarshallerContext> {
    private static UnsuccessfulFaceDeletionJsonUnmarshaller instance;

    public static UnsuccessfulFaceDeletionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceDeletionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsuccessfulFaceDeletion unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnsuccessfulFaceDeletion unsuccessfulFaceDeletion = new UnsuccessfulFaceDeletion();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceId")) {
                unsuccessfulFaceDeletion.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserId")) {
                unsuccessfulFaceDeletion.setUserId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Reasons")) {
                unsuccessfulFaceDeletion.setReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unsuccessfulFaceDeletion;
    }
}
