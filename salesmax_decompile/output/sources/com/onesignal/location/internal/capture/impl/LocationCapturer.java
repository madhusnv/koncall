package com.onesignal.location.internal.capture.impl;

import android.location.Location;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationPoint;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class LocationCapturer implements ILocationUpdatedHandler, ILocationCapturer {
    private final IApplicationService _applicationService;
    private final ILocationController _controller;
    private final ILocationPreferencesService _prefs;
    private final PropertiesModelStore _propertiesModelStore;
    private final ITime _time;
    private boolean locationCoarse;

    public LocationCapturer(IApplicationService iApplicationService, ITime iTime, ILocationPreferencesService iLocationPreferencesService, PropertiesModelStore propertiesModelStore, ILocationController iLocationController) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(iLocationPreferencesService, "_prefs");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(iLocationController, "_controller");
        this._applicationService = iApplicationService;
        this._time = iTime;
        this._prefs = iLocationPreferencesService;
        this._propertiesModelStore = propertiesModelStore;
        this._controller = iLocationController;
        iLocationController.subscribe(this);
    }

    private final void capture(Location location) {
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.setAccuracy(Float.valueOf(location.getAccuracy()));
        locationPoint.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        locationPoint.setType(getLocationCoarse() ? 0 : 1);
        locationPoint.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            locationPoint.setLat(Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue()));
            locationPoint.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue()));
        } else {
            locationPoint.setLat(Double.valueOf(location.getLatitude()));
            locationPoint.setLog(Double.valueOf(location.getLongitude()));
        }
        PropertiesModel model = this._propertiesModelStore.getModel();
        model.setLocationLongitude(locationPoint.getLog());
        model.setLocationLatitude(locationPoint.getLat());
        model.setLocationAccuracy(locationPoint.getAccuracy());
        model.setLocationBackground(locationPoint.getBg());
        model.setLocationType(locationPoint.getType());
        model.setLocationTimestamp(locationPoint.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // com.onesignal.location.internal.capture.ILocationCapturer
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // com.onesignal.location.internal.capture.ILocationCapturer
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // com.onesignal.location.internal.controller.ILocationUpdatedHandler
    public void onLocationChanged(Location location) {
        sq8.m48649h(location, "location");
        Logging.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // com.onesignal.location.internal.capture.ILocationCapturer
    public void setLocationCoarse(boolean z) {
        this.locationCoarse = z;
    }
}
