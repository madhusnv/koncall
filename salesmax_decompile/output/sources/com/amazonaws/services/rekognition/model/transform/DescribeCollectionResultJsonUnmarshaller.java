package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DescribeCollectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DescribeCollectionResultJsonUnmarshaller implements Unmarshaller<DescribeCollectionResult, JsonUnmarshallerContext> {
    private static DescribeCollectionResultJsonUnmarshaller instance;

    public static DescribeCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeCollectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeCollectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DescribeCollectionResult describeCollectionResult = new DescribeCollectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceCount")) {
                describeCollectionResult.setFaceCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                describeCollectionResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CollectionARN")) {
                describeCollectionResult.setCollectionARN(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CreationTimestamp")) {
                describeCollectionResult.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserCount")) {
                describeCollectionResult.setUserCount(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeCollectionResult;
    }
}
