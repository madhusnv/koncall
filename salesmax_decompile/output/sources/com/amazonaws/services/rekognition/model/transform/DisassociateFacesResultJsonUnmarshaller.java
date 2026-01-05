package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DisassociateFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DisassociateFacesResultJsonUnmarshaller implements Unmarshaller<DisassociateFacesResult, JsonUnmarshallerContext> {
    private static DisassociateFacesResultJsonUnmarshaller instance;

    public static DisassociateFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DisassociateFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DisassociateFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DisassociateFacesResult disassociateFacesResult = new DisassociateFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("DisassociatedFaces")) {
                disassociateFacesResult.setDisassociatedFaces(new ListUnmarshaller(DisassociatedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnsuccessfulFaceDisassociations")) {
                disassociateFacesResult.setUnsuccessfulFaceDisassociations(new ListUnmarshaller(UnsuccessfulFaceDisassociationJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserStatus")) {
                disassociateFacesResult.setUserStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return disassociateFacesResult;
    }
}
