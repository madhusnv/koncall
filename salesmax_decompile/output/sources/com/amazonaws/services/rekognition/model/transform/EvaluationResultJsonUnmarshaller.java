package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EvaluationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class EvaluationResultJsonUnmarshaller implements Unmarshaller<EvaluationResult, JsonUnmarshallerContext> {
    private static EvaluationResultJsonUnmarshaller instance;

    public static EvaluationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EvaluationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public EvaluationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EvaluationResult evaluationResult = new EvaluationResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("F1Score")) {
                evaluationResult.setF1Score(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Summary")) {
                evaluationResult.setSummary(SummaryJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return evaluationResult;
    }
}
