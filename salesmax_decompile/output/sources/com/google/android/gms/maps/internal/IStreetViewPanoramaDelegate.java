package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* loaded from: classes3.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    void enablePanning(boolean z);

    void enableStreetNames(boolean z);

    void enableUserNavigation(boolean z);

    void enableZoom(boolean z);

    StreetViewPanoramaCamera getPanoramaCamera();

    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(zzbl zzblVar);

    void setOnStreetViewPanoramaChangeListener(zzbn zzbnVar);

    void setOnStreetViewPanoramaClickListener(zzbp zzbpVar);

    void setOnStreetViewPanoramaLongClickListener(zzbr zzbrVar);

    void setPosition(LatLng latLng);

    void setPositionWithID(String str);

    void setPositionWithRadius(LatLng latLng, int i);

    void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource);

    void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource);
}
