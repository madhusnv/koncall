package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListCollectionsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListCollectionsResultJsonUnmarshaller implements Unmarshaller<ListCollectionsResult, JsonUnmarshallerContext> {
    private static ListCollectionsResultJsonUnmarshaller instance;

    public static ListCollectionsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListCollectionsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListCollectionsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListCollectionsResult listCollectionsResult = new ListCollectionsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("CollectionIds")) {
                listCollectionsResult.setCollectionIds(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                listCollectionsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersions")) {
                listCollectionsResult.setFaceModelVersions(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listCollectionsResult;
    }
}
