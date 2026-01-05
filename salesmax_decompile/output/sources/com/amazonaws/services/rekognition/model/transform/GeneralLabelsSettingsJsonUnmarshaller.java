package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GeneralLabelsSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class GeneralLabelsSettingsJsonUnmarshaller implements Unmarshaller<GeneralLabelsSettings, JsonUnmarshallerContext> {
    private static GeneralLabelsSettingsJsonUnmarshaller instance;

    public static GeneralLabelsSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GeneralLabelsSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GeneralLabelsSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GeneralLabelsSettings generalLabelsSettings = new GeneralLabelsSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("LabelInclusionFilters")) {
                generalLabelsSettings.setLabelInclusionFilters(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LabelExclusionFilters")) {
                generalLabelsSettings.setLabelExclusionFilters(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LabelCategoryInclusionFilters")) {
                generalLabelsSettings.setLabelCategoryInclusionFilters(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LabelCategoryExclusionFilters")) {
                generalLabelsSettings.setLabelCategoryExclusionFilters(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return generalLabelsSettings;
    }
}
