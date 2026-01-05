package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceAssociation;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UnsuccessfulFaceAssociationJsonUnmarshaller implements Unmarshaller<UnsuccessfulFaceAssociation, JsonUnmarshallerContext> {
    private static UnsuccessfulFaceAssociationJsonUnmarshaller instance;

    public static UnsuccessfulFaceAssociationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceAssociationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsuccessfulFaceAssociation unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnsuccessfulFaceAssociation unsuccessfulFaceAssociation = new UnsuccessfulFaceAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceId")) {
                unsuccessfulFaceAssociation.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserId")) {
                unsuccessfulFaceAssociation.setUserId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                unsuccessfulFaceAssociation.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Reasons")) {
                unsuccessfulFaceAssociation.setReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unsuccessfulFaceAssociation;
    }
}
