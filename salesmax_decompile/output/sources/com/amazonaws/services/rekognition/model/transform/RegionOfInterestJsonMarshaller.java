package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.Point;
import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class RegionOfInterestJsonMarshaller {
    private static RegionOfInterestJsonMarshaller instance;

    public static RegionOfInterestJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RegionOfInterestJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RegionOfInterest regionOfInterest, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (regionOfInterest.getBoundingBox() != null) {
            BoundingBox boundingBox = regionOfInterest.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (regionOfInterest.getPolygon() != null) {
            List<Point> polygon = regionOfInterest.getPolygon();
            awsJsonWriter.name("Polygon");
            awsJsonWriter.beginArray();
            for (Point point : polygon) {
                if (point != null) {
                    PointJsonMarshaller.getInstance().marshall(point, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
