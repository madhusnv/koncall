package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DescribeStreamProcessorResultJsonUnmarshaller implements Unmarshaller<DescribeStreamProcessorResult, JsonUnmarshallerContext> {
    private static DescribeStreamProcessorResultJsonUnmarshaller instance;

    public static DescribeStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DescribeStreamProcessorResult describeStreamProcessorResult = new DescribeStreamProcessorResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Name")) {
                describeStreamProcessorResult.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StreamProcessorArn")) {
                describeStreamProcessorResult.setStreamProcessorArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Status")) {
                describeStreamProcessorResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                describeStreamProcessorResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CreationTimestamp")) {
                describeStreamProcessorResult.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LastUpdateTimestamp")) {
                describeStreamProcessorResult.setLastUpdateTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Input")) {
                describeStreamProcessorResult.setInput(StreamProcessorInputJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Output")) {
                describeStreamProcessorResult.setOutput(StreamProcessorOutputJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RoleArn")) {
                describeStreamProcessorResult.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Settings")) {
                describeStreamProcessorResult.setSettings(StreamProcessorSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NotificationChannel")) {
                describeStreamProcessorResult.setNotificationChannel(StreamProcessorNotificationChannelJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("KmsKeyId")) {
                describeStreamProcessorResult.setKmsKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RegionsOfInterest")) {
                describeStreamProcessorResult.setRegionsOfInterest(new ListUnmarshaller(RegionOfInterestJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DataSharingPreference")) {
                describeStreamProcessorResult.setDataSharingPreference(StreamProcessorDataSharingPreferenceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeStreamProcessorResult;
    }
}
