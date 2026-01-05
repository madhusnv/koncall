package com.amplifyframework.geo.result;

import com.amplifyframework.geo.models.Place;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GeoSearchResult {
    private final List<Place> places;

    private GeoSearchResult(List<Place> list) {
        this.places = list;
    }

    public static GeoSearchResult withPlaces(List<Place> list) {
        Objects.requireNonNull(list);
        return new GeoSearchResult(list);
    }

    public List<Place> getPlaces() {
        return Immutable.of(this.places);
    }
}
