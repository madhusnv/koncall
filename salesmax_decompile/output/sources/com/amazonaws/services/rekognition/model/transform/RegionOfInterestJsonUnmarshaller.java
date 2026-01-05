package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class RegionOfInterestJsonUnmarshaller implements Unmarshaller<RegionOfInterest, JsonUnmarshallerContext> {
    private static RegionOfInterestJsonUnmarshaller instance;

    public static RegionOfInterestJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RegionOfInterestJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RegionOfInterest unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RegionOfInterest regionOfInterest = new RegionOfInterest();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                regionOfInterest.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Polygon")) {
                regionOfInterest.setPolygon(new ListUnmarshaller(PointJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return regionOfInterest;
    }
}
