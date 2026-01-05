package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListFacesResultJsonUnmarshaller implements Unmarshaller<ListFacesResult, JsonUnmarshallerContext> {
    private static ListFacesResultJsonUnmarshaller instance;

    public static ListFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListFacesResult listFacesResult = new ListFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Faces")) {
                listFacesResult.setFaces(new ListUnmarshaller(FaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                listFacesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                listFacesResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listFacesResult;
    }
}
