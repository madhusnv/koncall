package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetFaceLivenessSessionResultsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetFaceLivenessSessionResultsResultJsonUnmarshaller implements Unmarshaller<GetFaceLivenessSessionResultsResult, JsonUnmarshallerContext> {
    private static GetFaceLivenessSessionResultsResultJsonUnmarshaller instance;

    public static GetFaceLivenessSessionResultsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetFaceLivenessSessionResultsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetFaceLivenessSessionResultsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetFaceLivenessSessionResultsResult getFaceLivenessSessionResultsResult = new GetFaceLivenessSessionResultsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SessionId")) {
                getFaceLivenessSessionResultsResult.setSessionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Status")) {
                getFaceLivenessSessionResultsResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                getFaceLivenessSessionResultsResult.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ReferenceImage")) {
                getFaceLivenessSessionResultsResult.setReferenceImage(AuditImageJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AuditImages")) {
                getFaceLivenessSessionResultsResult.setAuditImages(new ListUnmarshaller(AuditImageJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getFaceLivenessSessionResultsResult;
    }
}
