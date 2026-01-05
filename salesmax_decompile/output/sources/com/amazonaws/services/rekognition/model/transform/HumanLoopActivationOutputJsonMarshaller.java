package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopActivationOutput;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class HumanLoopActivationOutputJsonMarshaller {
    private static HumanLoopActivationOutputJsonMarshaller instance;

    public static HumanLoopActivationOutputJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopActivationOutputJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HumanLoopActivationOutput humanLoopActivationOutput, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (humanLoopActivationOutput.getHumanLoopArn() != null) {
            String humanLoopArn = humanLoopActivationOutput.getHumanLoopArn();
            awsJsonWriter.name("HumanLoopArn");
            awsJsonWriter.value(humanLoopArn);
        }
        if (humanLoopActivationOutput.getHumanLoopActivationReasons() != null) {
            List<String> humanLoopActivationReasons = humanLoopActivationOutput.getHumanLoopActivationReasons();
            awsJsonWriter.name("HumanLoopActivationReasons");
            awsJsonWriter.beginArray();
            for (String str : humanLoopActivationReasons) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults() != null) {
            String humanLoopActivationConditionsEvaluationResults = humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults();
            awsJsonWriter.name("HumanLoopActivationConditionsEvaluationResults");
            awsJsonWriter.value(humanLoopActivationConditionsEvaluationResults);
        }
        awsJsonWriter.endObject();
    }
}
