package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import java.io.Closeable;
import p001o.dge;
import p001o.eu5;
import p001o.gge;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.nqb;
import p001o.o64;
import p001o.omh;
import p001o.pm1;
import p001o.rmh;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;
import p001o.z74;

/* loaded from: classes6.dex */
public final class GmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
    private final EventProducer<ILocationUpdatedHandler> event;
    private GoogleApiClientCompatProxy googleApiClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final nqb startStopMutex;
    public static final Companion Companion = new Companion(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return GmsLocationController.API_FALLBACK_TIME;
        }
    }

    public static final class GoogleApiClientListener implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private final GmsLocationController _parent;

        public GoogleApiClientListener(GmsLocationController gmsLocationController) {
            sq8.m48649h(gmsLocationController, "_parent");
            this._parent = gmsLocationController;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            sq8.m48649h(connectionResult, "connectionResult");
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            ThreadUtilsKt.suspendifyOnThread$default(0, new C11711xebb61691(this, null), 1, null);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            Logging.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i, null, 2, null);
        }
    }

    public static final class LocationHandlerThread extends HandlerThread {
        private Handler mHandler;

        public LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            sq8.m48649h(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class LocationUpdateListener implements LocationListener, IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final IFusedLocationApiWrapper _fusedLocationApiWrapper;
        private final GmsLocationController _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public LocationUpdateListener(IApplicationService iApplicationService, GmsLocationController gmsLocationController, GoogleApiClient googleApiClient, IFusedLocationApiWrapper iFusedLocationApiWrapper) throws Exception {
            sq8.m48649h(iApplicationService, "_applicationService");
            sq8.m48649h(gmsLocationController, "_parent");
            sq8.m48649h(googleApiClient, "googleApiClient");
            sq8.m48649h(iFusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = iApplicationService;
            this._parent = gmsLocationController;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = iFusedLocationApiWrapper;
            if (!googleApiClient.isConnected()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            iApplicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.isConnected()) {
                Logging.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j = this._applicationService.isInForeground() ? LocationConstants.FOREGROUND_UPDATE_TIME_MS : LocationConstants.BACKGROUND_UPDATE_TIME_MS;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            Logging.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            IFusedLocationApiWrapper iFusedLocationApiWrapper = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            sq8.m48648g(priority, "locationRequest");
            iFusedLocationApiWrapper.requestLocationUpdates(googleApiClient, priority, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean z) {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        @Override // com.google.android.gms.location.LocationListener
        public void onLocationChanged(Location location) {
            sq8.m48649h(location, "location");
            Logging.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.GmsLocationController$setLocationAndFire$1 */
    public static final class C117121 extends kf9 implements xk7 {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117121(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ILocationUpdatedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ILocationUpdatedHandler iLocationUpdatedHandler) {
            sq8.m48649h(iLocationUpdatedHandler, "it");
            iLocationUpdatedHandler.onLocationChanged(this.$location);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.GmsLocationController", m36648f = "GmsLocationController.kt", m36649l = {48}, m36650m = "start")
    /* renamed from: com.onesignal.location.internal.controller.impl.GmsLocationController$start$1 */
    public static final class C117131 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117131(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GmsLocationController.this.start(this);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2", m36648f = "GmsLocationController.kt", m36649l = {250, 62}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.controller.impl.GmsLocationController$start$2 */
    public static final class C117142 extends jgg implements nl7 {
        final /* synthetic */ gge $self;
        final /* synthetic */ dge $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117142(dge dgeVar, gge ggeVar, n64 n64Var) {
            super(2, n64Var);
            this.$wasSuccessful = dgeVar;
            this.$self = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return GmsLocationController.this.new C117142(this.$wasSuccessful, this.$self, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            nqb nqbVar;
            GmsLocationController gmsLocationController;
            dge dgeVar;
            gge ggeVar;
            nqb nqbVar2;
            Throwable th;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    nqbVar = GmsLocationController.this.startStopMutex;
                    gmsLocationController = GmsLocationController.this;
                    dgeVar = this.$wasSuccessful;
                    ggeVar = this.$self;
                    this.L$0 = nqbVar;
                    this.L$1 = gmsLocationController;
                    this.L$2 = dgeVar;
                    this.L$3 = ggeVar;
                    this.label = 1;
                    if (nqbVar.mo40922b(null, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nqbVar2 = (nqb) this.L$0;
                        try {
                            try {
                                wre.m54934b(obj);
                            } catch (omh unused) {
                                Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                y3i y3iVar = y3i.f54824a;
                                nqbVar2.mo40923c(null);
                                return y3i.f54824a;
                            }
                            y3i y3iVar2 = y3i.f54824a;
                            nqbVar2.mo40923c(null);
                            return y3i.f54824a;
                        } catch (Throwable th2) {
                            th = th2;
                            nqbVar2.mo40923c(null);
                            throw th;
                        }
                    }
                    ggeVar = (gge) this.L$3;
                    dgeVar = (dge) this.L$2;
                    gmsLocationController = (GmsLocationController) this.L$1;
                    nqb nqbVar3 = (nqb) this.L$0;
                    wre.m54934b(obj);
                    nqbVar = nqbVar3;
                }
                if (gmsLocationController.googleApiClient != null) {
                    if (gmsLocationController.lastLocation != null) {
                        gmsLocationController.event.fire(new GmsLocationController$start$2$1$1(gmsLocationController));
                    } else {
                        Location lastLocation = gmsLocationController.getLastLocation();
                        if (lastLocation != null) {
                            gmsLocationController.setLocationAndFire(lastLocation);
                        }
                    }
                    dgeVar.f19803a = true;
                } else {
                    try {
                        long api_fallback_time = GmsLocationController.Companion.getAPI_FALLBACK_TIME();
                        GmsLocationController$start$2$1$2 gmsLocationController$start$2$1$2 = new GmsLocationController$start$2$1$2(ggeVar, gmsLocationController, dgeVar, null);
                        this.L$0 = nqbVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (rmh.m46984c(api_fallback_time, gmsLocationController$start$2$1$2, this) == objM51918f) {
                            return objM51918f;
                        }
                    } catch (omh unused2) {
                        nqbVar2 = nqbVar;
                        Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                        y3i y3iVar22 = y3i.f54824a;
                        nqbVar2.mo40923c(null);
                        return y3i.f54824a;
                    }
                }
                nqbVar2 = nqbVar;
                y3i y3iVar222 = y3i.f54824a;
                nqbVar2.mo40923c(null);
                return y3i.f54824a;
            } catch (Throwable th3) {
                nqbVar2 = nqbVar;
                th = th3;
                nqbVar2.mo40923c(null);
                throw th;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117142) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.controller.impl.GmsLocationController", m36648f = "GmsLocationController.kt", m36649l = {250}, m36650m = "stop")
    /* renamed from: com.onesignal.location.internal.controller.impl.GmsLocationController$stop$1 */
    public static final class C117151 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C117151(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GmsLocationController.this.stop(this);
        }
    }

    public GmsLocationController(IApplicationService iApplicationService, IFusedLocationApiWrapper iFusedLocationApiWrapper) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iFusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = iApplicationService;
        this._fusedLocationApiWrapper = iFusedLocationApiWrapper;
        this.locationHandlerThread = new LocationHandlerThread();
        this.startStopMutex = tqb.m50340b(false, 1, null);
        this.event = new EventProducer<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        Logging.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new C117121(location));
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        GoogleApiClientCompatProxy googleApiClientCompatProxy = this.googleApiClient;
        if (googleApiClientCompatProxy == null || (realInstance = googleApiClientCompatProxy.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(n64 n64Var) {
        C117131 c117131;
        dge dgeVar;
        if (n64Var instanceof C117131) {
            c117131 = (C117131) n64Var;
            int i = c117131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117131.label = i - Integer.MIN_VALUE;
            } else {
                c117131 = new C117131(n64Var);
            }
        }
        Object obj = c117131.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117131.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            gge ggeVar = new gge();
            ggeVar.f25106a = this;
            dge dgeVar2 = new dge();
            z74 z74VarM25611b = eu5.m25611b();
            C117142 c117142 = new C117142(dgeVar2, ggeVar, null);
            c117131.L$0 = dgeVar2;
            c117131.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117142, c117131) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117131.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(n64 n64Var) {
        C117151 c117151;
        GmsLocationController gmsLocationController;
        nqb nqbVar;
        if (n64Var instanceof C117151) {
            c117151 = (C117151) n64Var;
            int i = c117151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117151.label = i - Integer.MIN_VALUE;
            } else {
                c117151 = new C117151(n64Var);
            }
        }
        Object obj = c117151.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117151.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqb nqbVar2 = this.startStopMutex;
            c117151.L$0 = this;
            c117151.L$1 = nqbVar2;
            c117151.label = 1;
            if (nqbVar2.mo40922b(null, c117151) == objM51918f) {
                return objM51918f;
            }
            gmsLocationController = this;
            nqbVar = nqbVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqbVar = (nqb) c117151.L$1;
            gmsLocationController = (GmsLocationController) c117151.L$0;
            wre.m54934b(obj);
        }
        try {
            LocationUpdateListener locationUpdateListener = gmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
                sq8.m48646e(locationUpdateListener);
                locationUpdateListener.close();
                gmsLocationController.locationUpdateListener = null;
            }
            GoogleApiClientCompatProxy googleApiClientCompatProxy = gmsLocationController.googleApiClient;
            if (googleApiClientCompatProxy != null) {
                sq8.m48646e(googleApiClientCompatProxy);
                googleApiClientCompatProxy.disconnect();
                gmsLocationController.googleApiClient = null;
            }
            gmsLocationController.lastLocation = null;
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
        this.event.subscribe(iLocationUpdatedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
        this.event.unsubscribe(iLocationUpdatedHandler);
    }
}
