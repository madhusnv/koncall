package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceDisassociation;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UnsuccessfulFaceDisassociationJsonUnmarshaller implements Unmarshaller<UnsuccessfulFaceDisassociation, JsonUnmarshallerContext> {
    private static UnsuccessfulFaceDisassociationJsonUnmarshaller instance;

    public static UnsuccessfulFaceDisassociationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceDisassociationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsuccessfulFaceDisassociation unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnsuccessfulFaceDisassociation unsuccessfulFaceDisassociation = new UnsuccessfulFaceDisassociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceId")) {
                unsuccessfulFaceDisassociation.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserId")) {
                unsuccessfulFaceDisassociation.setUserId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Reasons")) {
                unsuccessfulFaceDisassociation.setReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unsuccessfulFaceDisassociation;
    }
}
