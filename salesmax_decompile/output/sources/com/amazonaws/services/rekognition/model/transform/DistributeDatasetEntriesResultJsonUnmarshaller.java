package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DistributeDatasetEntriesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class DistributeDatasetEntriesResultJsonUnmarshaller implements Unmarshaller<DistributeDatasetEntriesResult, JsonUnmarshallerContext> {
    private static DistributeDatasetEntriesResultJsonUnmarshaller instance;

    public static DistributeDatasetEntriesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DistributeDatasetEntriesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DistributeDatasetEntriesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new DistributeDatasetEntriesResult();
    }
}
