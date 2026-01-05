package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GeneralLabelsSettings;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class GeneralLabelsSettingsJsonMarshaller {
    private static GeneralLabelsSettingsJsonMarshaller instance;

    public static GeneralLabelsSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GeneralLabelsSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GeneralLabelsSettings generalLabelsSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (generalLabelsSettings.getLabelInclusionFilters() != null) {
            List<String> labelInclusionFilters = generalLabelsSettings.getLabelInclusionFilters();
            awsJsonWriter.name("LabelInclusionFilters");
            awsJsonWriter.beginArray();
            for (String str : labelInclusionFilters) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (generalLabelsSettings.getLabelExclusionFilters() != null) {
            List<String> labelExclusionFilters = generalLabelsSettings.getLabelExclusionFilters();
            awsJsonWriter.name("LabelExclusionFilters");
            awsJsonWriter.beginArray();
            for (String str2 : labelExclusionFilters) {
                if (str2 != null) {
                    awsJsonWriter.value(str2);
                }
            }
            awsJsonWriter.endArray();
        }
        if (generalLabelsSettings.getLabelCategoryInclusionFilters() != null) {
            List<String> labelCategoryInclusionFilters = generalLabelsSettings.getLabelCategoryInclusionFilters();
            awsJsonWriter.name("LabelCategoryInclusionFilters");
            awsJsonWriter.beginArray();
            for (String str3 : labelCategoryInclusionFilters) {
                if (str3 != null) {
                    awsJsonWriter.value(str3);
                }
            }
            awsJsonWriter.endArray();
        }
        if (generalLabelsSettings.getLabelCategoryExclusionFilters() != null) {
            List<String> labelCategoryExclusionFilters = generalLabelsSettings.getLabelCategoryExclusionFilters();
            awsJsonWriter.name("LabelCategoryExclusionFilters");
            awsJsonWriter.beginArray();
            for (String str4 : labelCategoryExclusionFilters) {
                if (str4 != null) {
                    awsJsonWriter.value(str4);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
