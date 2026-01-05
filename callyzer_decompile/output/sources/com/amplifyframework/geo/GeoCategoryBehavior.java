package com.amplifyframework.geo;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.geo.models.Coordinates;
import com.amplifyframework.geo.models.MapStyle;
import com.amplifyframework.geo.models.MapStyleDescriptor;
import com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions;
import com.amplifyframework.geo.options.GeoSearchByTextOptions;
import com.amplifyframework.geo.options.GetMapStyleDescriptorOptions;
import com.amplifyframework.geo.result.GeoSearchResult;
import java.util.Collection;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface GeoCategoryBehavior {
    void getAvailableMaps(Consumer<Collection<MapStyle>> consumer, Consumer<GeoException> consumer2);

    void getDefaultMap(Consumer<MapStyle> consumer, Consumer<GeoException> consumer2);

    void getMapStyleDescriptor(Consumer<MapStyleDescriptor> consumer, Consumer<GeoException> consumer2);

    void getMapStyleDescriptor(GetMapStyleDescriptorOptions getMapStyleDescriptorOptions, Consumer<MapStyleDescriptor> consumer, Consumer<GeoException> consumer2);

    void searchByCoordinates(Coordinates coordinates, Consumer<GeoSearchResult> consumer, Consumer<GeoException> consumer2);

    void searchByCoordinates(Coordinates coordinates, GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions, Consumer<GeoSearchResult> consumer, Consumer<GeoException> consumer2);

    void searchByText(String str, Consumer<GeoSearchResult> consumer, Consumer<GeoException> consumer2);

    void searchByText(String str, GeoSearchByTextOptions geoSearchByTextOptions, Consumer<GeoSearchResult> consumer, Consumer<GeoException> consumer2);
}
