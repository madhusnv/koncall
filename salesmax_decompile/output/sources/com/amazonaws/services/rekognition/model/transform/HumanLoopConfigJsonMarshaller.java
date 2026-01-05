package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopConfig;
import com.amazonaws.services.rekognition.model.HumanLoopDataAttributes;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class HumanLoopConfigJsonMarshaller {
    private static HumanLoopConfigJsonMarshaller instance;

    public static HumanLoopConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HumanLoopConfig humanLoopConfig, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (humanLoopConfig.getHumanLoopName() != null) {
            String humanLoopName = humanLoopConfig.getHumanLoopName();
            awsJsonWriter.name("HumanLoopName");
            awsJsonWriter.value(humanLoopName);
        }
        if (humanLoopConfig.getFlowDefinitionArn() != null) {
            String flowDefinitionArn = humanLoopConfig.getFlowDefinitionArn();
            awsJsonWriter.name("FlowDefinitionArn");
            awsJsonWriter.value(flowDefinitionArn);
        }
        if (humanLoopConfig.getDataAttributes() != null) {
            HumanLoopDataAttributes dataAttributes = humanLoopConfig.getDataAttributes();
            awsJsonWriter.name("DataAttributes");
            HumanLoopDataAttributesJsonMarshaller.getInstance().marshall(dataAttributes, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
