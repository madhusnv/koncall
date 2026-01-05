package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AssociateFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class AssociateFacesResultJsonUnmarshaller implements Unmarshaller<AssociateFacesResult, JsonUnmarshallerContext> {
    private static AssociateFacesResultJsonUnmarshaller instance;

    public static AssociateFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssociateFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssociateFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AssociateFacesResult associateFacesResult = new AssociateFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("AssociatedFaces")) {
                associateFacesResult.setAssociatedFaces(new ListUnmarshaller(AssociatedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnsuccessfulFaceAssociations")) {
                associateFacesResult.setUnsuccessfulFaceAssociations(new ListUnmarshaller(UnsuccessfulFaceAssociationJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserStatus")) {
                associateFacesResult.setUserStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associateFacesResult;
    }
}
