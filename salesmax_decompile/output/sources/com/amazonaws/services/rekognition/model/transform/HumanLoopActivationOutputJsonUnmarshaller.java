package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopActivationOutput;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class HumanLoopActivationOutputJsonUnmarshaller implements Unmarshaller<HumanLoopActivationOutput, JsonUnmarshallerContext> {
    private static HumanLoopActivationOutputJsonUnmarshaller instance;

    public static HumanLoopActivationOutputJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopActivationOutputJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public HumanLoopActivationOutput unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HumanLoopActivationOutput humanLoopActivationOutput = new HumanLoopActivationOutput();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("HumanLoopArn")) {
                humanLoopActivationOutput.setHumanLoopArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("HumanLoopActivationReasons")) {
                humanLoopActivationOutput.setHumanLoopActivationReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("HumanLoopActivationConditionsEvaluationResults")) {
                humanLoopActivationOutput.setHumanLoopActivationConditionsEvaluationResults(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return humanLoopActivationOutput;
    }
}
