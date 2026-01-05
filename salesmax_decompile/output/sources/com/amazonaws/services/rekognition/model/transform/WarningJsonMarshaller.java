package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Section;
import com.amazonaws.services.rekognition.model.Warning;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class WarningJsonMarshaller {
    private static WarningJsonMarshaller instance;

    public static WarningJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new WarningJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Warning warning, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (warning.getErrorCode() != null) {
            String errorCode = warning.getErrorCode();
            awsJsonWriter.name("ErrorCode");
            awsJsonWriter.value(errorCode);
        }
        if (warning.getMessage() != null) {
            String message = warning.getMessage();
            awsJsonWriter.name("Message");
            awsJsonWriter.value(message);
        }
        if (warning.getSections() != null) {
            List<Section> sections = warning.getSections();
            awsJsonWriter.name("Sections");
            awsJsonWriter.beginArray();
            for (Section section : sections) {
                if (section != null) {
                    SectionJsonMarshaller.getInstance().marshall(section, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
