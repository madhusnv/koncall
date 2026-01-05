package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class HumanLoopConfigJsonUnmarshaller implements Unmarshaller<HumanLoopConfig, JsonUnmarshallerContext> {
    private static HumanLoopConfigJsonUnmarshaller instance;

    public static HumanLoopConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public HumanLoopConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HumanLoopConfig humanLoopConfig = new HumanLoopConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("HumanLoopName")) {
                humanLoopConfig.setHumanLoopName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FlowDefinitionArn")) {
                humanLoopConfig.setFlowDefinitionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DataAttributes")) {
                humanLoopConfig.setDataAttributes(HumanLoopDataAttributesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return humanLoopConfig;
    }
}
