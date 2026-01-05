package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Instance;
import com.amazonaws.services.rekognition.model.Label;
import com.amazonaws.services.rekognition.model.LabelAlias;
import com.amazonaws.services.rekognition.model.LabelCategory;
import com.amazonaws.services.rekognition.model.Parent;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class LabelJsonMarshaller {
    private static LabelJsonMarshaller instance;

    public static LabelJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LabelJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Label label, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (label.getName() != null) {
            String name = label.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (label.getConfidence() != null) {
            Float confidence = label.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (label.getInstances() != null) {
            List<Instance> instances = label.getInstances();
            awsJsonWriter.name("Instances");
            awsJsonWriter.beginArray();
            for (Instance instance2 : instances) {
                if (instance2 != null) {
                    InstanceJsonMarshaller.getInstance().marshall(instance2, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (label.getParents() != null) {
            List<Parent> parents = label.getParents();
            awsJsonWriter.name("Parents");
            awsJsonWriter.beginArray();
            for (Parent parent : parents) {
                if (parent != null) {
                    ParentJsonMarshaller.getInstance().marshall(parent, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (label.getAliases() != null) {
            List<LabelAlias> aliases = label.getAliases();
            awsJsonWriter.name("Aliases");
            awsJsonWriter.beginArray();
            for (LabelAlias labelAlias : aliases) {
                if (labelAlias != null) {
                    LabelAliasJsonMarshaller.getInstance().marshall(labelAlias, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (label.getCategories() != null) {
            List<LabelCategory> categories = label.getCategories();
            awsJsonWriter.name("Categories");
            awsJsonWriter.beginArray();
            for (LabelCategory labelCategory : categories) {
                if (labelCategory != null) {
                    LabelCategoryJsonMarshaller.getInstance().marshall(labelCategory, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
