package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.Geometry;
import com.amazonaws.services.rekognition.model.Point;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class GeometryJsonMarshaller {
    private static GeometryJsonMarshaller instance;

    public static GeometryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GeometryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Geometry geometry, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (geometry.getBoundingBox() != null) {
            BoundingBox boundingBox = geometry.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (geometry.getPolygon() != null) {
            List<Point> polygon = geometry.getPolygon();
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
