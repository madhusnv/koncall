package com.amplifyframework.geo.models;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
        if (obj != null && SearchArea.class == obj.getClass()) {
            SearchArea searchArea = (SearchArea) obj;
            if (Objects.equals(this.boundingBox, searchArea.boundingBox) && Objects.equals(this.biasPosition, searchArea.biasPosition)) {
                return true;
            }
        }
        return false;
    }

    public Coordinates getBiasPosition() {
        return this.biasPosition;
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public int hashCode() {
        return Objects.hash(this.boundingBox, this.biasPosition);
    }

    public String toString() {
        return "SearchArea{boundingBox=" + this.boundingBox + ", biasPosition=" + this.biasPosition + '}';
    }
}
