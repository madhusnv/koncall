package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStreamStartSelector;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class KinesisVideoStreamStartSelectorJsonUnmarshaller implements Unmarshaller<KinesisVideoStreamStartSelector, JsonUnmarshallerContext> {
    private static KinesisVideoStreamStartSelectorJsonUnmarshaller instance;

    public static KinesisVideoStreamStartSelectorJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisVideoStreamStartSelectorJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public KinesisVideoStreamStartSelector unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector = new KinesisVideoStreamStartSelector();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProducerTimestamp")) {
                kinesisVideoStreamStartSelector.setProducerTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FragmentNumber")) {
                kinesisVideoStreamStartSelector.setFragmentNumber(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return kinesisVideoStreamStartSelector;
    }
}
