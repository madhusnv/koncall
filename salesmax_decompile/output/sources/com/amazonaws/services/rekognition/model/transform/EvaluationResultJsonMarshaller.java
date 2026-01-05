package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EvaluationResult;
import com.amazonaws.services.rekognition.model.Summary;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EvaluationResultJsonMarshaller {
    private static EvaluationResultJsonMarshaller instance;

    public static EvaluationResultJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EvaluationResultJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EvaluationResult evaluationResult, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (evaluationResult.getF1Score() != null) {
            Float f1Score = evaluationResult.getF1Score();
            awsJsonWriter.name("F1Score");
            awsJsonWriter.value(f1Score);
        }
        if (evaluationResult.getSummary() != null) {
            Summary summary = evaluationResult.getSummary();
            awsJsonWriter.name("Summary");
            SummaryJsonMarshaller.getInstance().marshall(summary, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
