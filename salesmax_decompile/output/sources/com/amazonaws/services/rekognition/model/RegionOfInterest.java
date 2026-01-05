package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class RegionOfInterest implements Serializable {
    private BoundingBox boundingBox;
    private List<Point> polygon;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegionOfInterest)) {
            return false;
        }
        RegionOfInterest regionOfInterest = (RegionOfInterest) obj;
        if ((regionOfInterest.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (regionOfInterest.getBoundingBox() != null && !regionOfInterest.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((regionOfInterest.getPolygon() == null) ^ (getPolygon() == null)) {
            return false;
        }
        return regionOfInterest.getPolygon() == null || regionOfInterest.getPolygon().equals(getPolygon());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public List<Point> getPolygon() {
        return this.polygon;
    }

    public int hashCode() {
        return (((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getPolygon() != null ? getPolygon().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setPolygon(Collection<Point> collection) {
        if (collection == null) {
            this.polygon = null;
        } else {
            this.polygon = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getPolygon() != null) {
            sb.append("Polygon: " + getPolygon());
        }
        sb.append("}");
        return sb.toString();
    }

    public RegionOfInterest withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public RegionOfInterest withPolygon(Point... pointArr) {
        if (getPolygon() == null) {
            this.polygon = new ArrayList(pointArr.length);
        }
        for (Point point : pointArr) {
            this.polygon.add(point);
        }
        return this;
    }

    public RegionOfInterest withPolygon(Collection<Point> collection) {
        setPolygon(collection);
        return this;
    }
}
