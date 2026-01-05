package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DeleteFacesResultJsonUnmarshaller implements Unmarshaller<DeleteFacesResult, JsonUnmarshallerContext> {
    private static DeleteFacesResultJsonUnmarshaller instance;

    public static DeleteFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DeleteFacesResult deleteFacesResult = new DeleteFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("DeletedFaces")) {
                deleteFacesResult.setDeletedFaces(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnsuccessfulFaceDeletions")) {
                deleteFacesResult.setUnsuccessfulFaceDeletions(new ListUnmarshaller(UnsuccessfulFaceDeletionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteFacesResult;
    }
}
