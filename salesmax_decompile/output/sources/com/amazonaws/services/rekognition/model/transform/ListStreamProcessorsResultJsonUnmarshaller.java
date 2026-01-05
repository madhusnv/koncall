package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListStreamProcessorsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListStreamProcessorsResultJsonUnmarshaller implements Unmarshaller<ListStreamProcessorsResult, JsonUnmarshallerContext> {
    private static ListStreamProcessorsResultJsonUnmarshaller instance;

    public static ListStreamProcessorsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListStreamProcessorsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListStreamProcessorsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListStreamProcessorsResult listStreamProcessorsResult = new ListStreamProcessorsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("NextToken")) {
                listStreamProcessorsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StreamProcessors")) {
                listStreamProcessorsResult.setStreamProcessors(new ListUnmarshaller(StreamProcessorJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listStreamProcessorsResult;
    }
}
