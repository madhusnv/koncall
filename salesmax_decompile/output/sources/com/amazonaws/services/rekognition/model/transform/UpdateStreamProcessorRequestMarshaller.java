package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.services.rekognition.model.StreamProcessorDataSharingPreference;
import com.amazonaws.services.rekognition.model.StreamProcessorSettingsForUpdate;
import com.amazonaws.services.rekognition.model.UpdateStreamProcessorRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class UpdateStreamProcessorRequestMarshaller implements Marshaller<Request<UpdateStreamProcessorRequest>, UpdateStreamProcessorRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UpdateStreamProcessorRequest> marshall(UpdateStreamProcessorRequest updateStreamProcessorRequest) {
        if (updateStreamProcessorRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateStreamProcessorRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(updateStreamProcessorRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.UpdateStreamProcessor");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (updateStreamProcessorRequest.getName() != null) {
                String name = updateStreamProcessorRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateStreamProcessorRequest.getSettingsForUpdate() != null) {
                StreamProcessorSettingsForUpdate settingsForUpdate = updateStreamProcessorRequest.getSettingsForUpdate();
                jsonWriter.name("SettingsForUpdate");
                StreamProcessorSettingsForUpdateJsonMarshaller.getInstance().marshall(settingsForUpdate, jsonWriter);
            }
            if (updateStreamProcessorRequest.getRegionsOfInterestForUpdate() != null) {
                List<RegionOfInterest> regionsOfInterestForUpdate = updateStreamProcessorRequest.getRegionsOfInterestForUpdate();
                jsonWriter.name("RegionsOfInterestForUpdate");
                jsonWriter.beginArray();
                for (RegionOfInterest regionOfInterest : regionsOfInterestForUpdate) {
                    if (regionOfInterest != null) {
                        RegionOfInterestJsonMarshaller.getInstance().marshall(regionOfInterest, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateStreamProcessorRequest.getDataSharingPreferenceForUpdate() != null) {
                StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate = updateStreamProcessorRequest.getDataSharingPreferenceForUpdate();
                jsonWriter.name("DataSharingPreferenceForUpdate");
                StreamProcessorDataSharingPreferenceJsonMarshaller.getInstance().marshall(dataSharingPreferenceForUpdate, jsonWriter);
            }
            if (updateStreamProcessorRequest.getParametersToDelete() != null) {
                List<String> parametersToDelete = updateStreamProcessorRequest.getParametersToDelete();
                jsonWriter.name("ParametersToDelete");
                jsonWriter.beginArray();
                for (String str : parametersToDelete) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            String string = stringWriter.toString();
            byte[] bytes = string.getBytes(StringUtils.UTF8);
            defaultRequest.setContent(new StringInputStream(string));
            defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
