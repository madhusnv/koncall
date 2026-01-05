package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetCelebrityInfoResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetCelebrityInfoResultJsonUnmarshaller implements Unmarshaller<GetCelebrityInfoResult, JsonUnmarshallerContext> {
    private static GetCelebrityInfoResultJsonUnmarshaller instance;

    public static GetCelebrityInfoResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetCelebrityInfoResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetCelebrityInfoResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetCelebrityInfoResult getCelebrityInfoResult = new GetCelebrityInfoResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Urls")) {
                getCelebrityInfoResult.setUrls(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Name")) {
                getCelebrityInfoResult.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("KnownGender")) {
                getCelebrityInfoResult.setKnownGender(KnownGenderJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getCelebrityInfoResult;
    }
}
