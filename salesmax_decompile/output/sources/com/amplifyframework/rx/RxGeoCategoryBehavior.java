package com.amplifyframework.rx;

import com.amplifyframework.geo.models.Coordinates;
import com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions;
import com.amplifyframework.geo.options.GeoSearchByTextOptions;
import com.amplifyframework.geo.options.GetMapStyleDescriptorOptions;
import p001o.wtf;

/* loaded from: classes5.dex */
public interface RxGeoCategoryBehavior {
    wtf getAvailableMaps();

    wtf getDefaultMap();

    wtf getMapStyleDescriptor();

    wtf getMapStyleDescriptor(GetMapStyleDescriptorOptions getMapStyleDescriptorOptions);

    wtf searchByCoordinates(Coordinates coordinates);

    wtf searchByCoordinates(Coordinates coordinates, GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions);

    wtf searchByText(String str);

    wtf searchByText(String str, GeoSearchByTextOptions geoSearchByTextOptions);
}
