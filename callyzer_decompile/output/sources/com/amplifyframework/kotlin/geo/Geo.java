package com.amplifyframework.kotlin.geo;

import com.amplifyframework.geo.models.Coordinates;
import com.amplifyframework.geo.models.MapStyle;
import com.amplifyframework.geo.models.MapStyleDescriptor;
import com.amplifyframework.geo.options.GeoSearchByCoordinatesOptions;
import com.amplifyframework.geo.options.GeoSearchByTextOptions;
import com.amplifyframework.geo.options.GetMapStyleDescriptorOptions;
import com.amplifyframework.geo.result.GeoSearchResult;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Geo {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getMapStyleDescriptor$default(Geo geo, GetMapStyleDescriptorOptions getMapStyleDescriptorOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapStyleDescriptor");
        }
        if ((i10 & 1) != 0) {
            getMapStyleDescriptorOptions = GetMapStyleDescriptorOptions.defaults();
            AbstractC4154l.m8922e(getMapStyleDescriptorOptions, "defaults(...)");
        }
        return geo.getMapStyleDescriptor(getMapStyleDescriptorOptions, interfaceC7559c);
    }

    static /* synthetic */ Object searchByCoordinates$default(Geo geo, Coordinates coordinates, GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchByCoordinates");
        }
        if ((i10 & 2) != 0) {
            geoSearchByCoordinatesOptions = GeoSearchByCoordinatesOptions.defaults();
            AbstractC4154l.m8922e(geoSearchByCoordinatesOptions, "defaults(...)");
        }
        return geo.searchByCoordinates(coordinates, geoSearchByCoordinatesOptions, interfaceC7559c);
    }

    static /* synthetic */ Object searchByText$default(Geo geo, String str, GeoSearchByTextOptions geoSearchByTextOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchByText");
        }
        if ((i10 & 2) != 0) {
            geoSearchByTextOptions = GeoSearchByTextOptions.defaults();
            AbstractC4154l.m8922e(geoSearchByTextOptions, "defaults(...)");
        }
        return geo.searchByText(str, geoSearchByTextOptions, interfaceC7559c);
    }

    Object getAvailableMaps(InterfaceC7559c<? super Collection<MapStyle>> interfaceC7559c);

    Object getDefaultMap(InterfaceC7559c<? super MapStyle> interfaceC7559c);

    Object getMapStyleDescriptor(GetMapStyleDescriptorOptions getMapStyleDescriptorOptions, InterfaceC7559c<? super MapStyleDescriptor> interfaceC7559c);

    Object searchByCoordinates(Coordinates coordinates, GeoSearchByCoordinatesOptions geoSearchByCoordinatesOptions, InterfaceC7559c<? super GeoSearchResult> interfaceC7559c);

    Object searchByText(String str, GeoSearchByTextOptions geoSearchByTextOptions, InterfaceC7559c<? super GeoSearchResult> interfaceC7559c);
}
