package com.amplifyframework.geo.models;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SearchArea {
    private final Coordinates biasPosition;
    private final BoundingBox boundingBox;

    private SearchArea(BoundingBox boundingBox, Coordinates coordinates) {
        this.boundingBox = boundingBox;
        this.biasPosition = coordinates;
    }

    public static SearchArea near(Coordinates coordinates) {
        Objects.requireNonNull(coordinates);
        return new SearchArea(null, coordinates);
    }

    public static SearchArea within(BoundingBox boundingBox) {
        Objects.requireNonNull(boundingBox);
        return new SearchArea(boundingBox, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SearchArea.class != obj.getClass()) {
            return false;
        }
        SearchArea searchArea = (SearchArea) obj;
        return s6c.m47909a(this.boundingBox, searchArea.boundingBox) && s6c.m47909a(this.biasPosition, searchArea.biasPosition);
    }

    public Coordinates getBiasPosition() {
        return this.biasPosition;
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public int hashCode() {
        return s6c.m47910b(this.boundingBox, this.biasPosition);
    }

    public String toString() {
        return "SearchArea{boundingBox=" + this.boundingBox + ", biasPosition=" + this.biasPosition + '}';
    }
}
