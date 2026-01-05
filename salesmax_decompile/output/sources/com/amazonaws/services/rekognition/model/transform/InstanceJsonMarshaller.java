package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.DominantColor;
import com.amazonaws.services.rekognition.model.Instance;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class InstanceJsonMarshaller {
    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new InstanceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Instance instance2, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (instance2.getBoundingBox() != null) {
            BoundingBox boundingBox = instance2.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (instance2.getConfidence() != null) {
            Float confidence = instance2.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (instance2.getDominantColors() != null) {
            List<DominantColor> dominantColors = instance2.getDominantColors();
            awsJsonWriter.name("DominantColors");
            awsJsonWriter.beginArray();
            for (DominantColor dominantColor : dominantColors) {
                if (dominantColor != null) {
                    DominantColorJsonMarshaller.getInstance().marshall(dominantColor, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
