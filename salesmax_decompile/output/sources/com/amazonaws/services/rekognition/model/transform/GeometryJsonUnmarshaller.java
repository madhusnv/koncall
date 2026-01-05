package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Geometry;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class GeometryJsonUnmarshaller implements Unmarshaller<Geometry, JsonUnmarshallerContext> {
    private static GeometryJsonUnmarshaller instance;

    public static GeometryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GeometryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Geometry unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Geometry geometry = new Geometry();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                geometry.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Polygon")) {
                geometry.setPolygon(new ListUnmarshaller(PointJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return geometry;
    }
}
