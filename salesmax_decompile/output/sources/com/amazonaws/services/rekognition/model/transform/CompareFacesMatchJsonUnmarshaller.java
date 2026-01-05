package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CompareFacesMatch;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class CompareFacesMatchJsonUnmarshaller implements Unmarshaller<CompareFacesMatch, JsonUnmarshallerContext> {
    private static CompareFacesMatchJsonUnmarshaller instance;

    public static CompareFacesMatchJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CompareFacesMatchJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CompareFacesMatch unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CompareFacesMatch compareFacesMatch = new CompareFacesMatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Similarity")) {
                compareFacesMatch.setSimilarity(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Face")) {
                compareFacesMatch.setFace(ComparedFaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return compareFacesMatch;
    }
}
