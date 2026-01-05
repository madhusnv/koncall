package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.IndexFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class IndexFacesResultJsonUnmarshaller implements Unmarshaller<IndexFacesResult, JsonUnmarshallerContext> {
    private static IndexFacesResultJsonUnmarshaller instance;

    public static IndexFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new IndexFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public IndexFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        IndexFacesResult indexFacesResult = new IndexFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceRecords")) {
                indexFacesResult.setFaceRecords(new ListUnmarshaller(FaceRecordJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("OrientationCorrection")) {
                indexFacesResult.setOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                indexFacesResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnindexedFaces")) {
                indexFacesResult.setUnindexedFaces(new ListUnmarshaller(UnindexedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return indexFacesResult;
    }
}
