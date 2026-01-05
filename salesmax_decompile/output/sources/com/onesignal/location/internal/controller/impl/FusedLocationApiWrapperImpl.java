package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.debug.internal.logging.Logging;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class FusedLocationApiWrapperImpl implements IFusedLocationApiWrapper {
    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        sq8.m48649h(googleApiClient, "googleApiClient");
        sq8.m48649h(locationListener, "locationListener");
        if (googleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            Logging.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        sq8.m48649h(googleApiClient, "googleApiClient");
        if (googleApiClient.isConnected()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        sq8.m48649h(googleApiClient, "googleApiClient");
        sq8.m48649h(locationRequest, "locationRequest");
        sq8.m48649h(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.isConnected()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            Logging.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
