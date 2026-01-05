package com.onesignal.location.internal.background;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class LocationBackgroundService implements IBackgroundService {
    private final IApplicationService _applicationService;
    private final ILocationCapturer _capturer;
    private final ILocationManager _locationManager;
    private final ILocationPreferencesService _prefs;
    private final ITime _time;

    public LocationBackgroundService(IApplicationService iApplicationService, ILocationManager iLocationManager, ILocationPreferencesService iLocationPreferencesService, ILocationCapturer iLocationCapturer, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iLocationManager, "_locationManager");
        sq8.m48649h(iLocationPreferencesService, "_prefs");
        sq8.m48649h(iLocationCapturer, "_capturer");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._locationManager = iLocationManager;
        this._prefs = iLocationPreferencesService;
        this._capturer = iLocationCapturer;
        this._time = iTime;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Object backgroundRun(n64 n64Var) {
        this._capturer.captureLastLocation();
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            Logging.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (LocationUtils.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        Logging.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
