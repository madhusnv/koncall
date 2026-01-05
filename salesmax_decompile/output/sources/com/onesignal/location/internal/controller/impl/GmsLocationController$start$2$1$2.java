package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.impl.GmsLocationController;
import p001o.dge;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2$1$2", m36648f = "GmsLocationController.kt", m36649l = {}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class GmsLocationController$start$2$1$2 extends jgg implements nl7 {
    final /* synthetic */ gge $self;
    final /* synthetic */ dge $wasSuccessful;
    int label;
    final /* synthetic */ GmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsLocationController$start$2$1$2(gge ggeVar, GmsLocationController gmsLocationController, dge dgeVar, n64 n64Var) {
        super(2, n64Var);
        this.$self = ggeVar;
        this.this$0 = gmsLocationController;
        this.$wasSuccessful = dgeVar;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new GmsLocationController$start$2$1$2(this.$self, this.this$0, this.$wasSuccessful, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Location lastLocation;
        uq8.m51918f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj);
        GmsLocationController.GoogleApiClientListener googleApiClientListener = new GmsLocationController.GoogleApiClientListener((GmsLocationController) this.$self.f25106a);
        GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(this.this$0._applicationService.getAppContext()).addApi(LocationServices.API).addConnectionCallbacks(googleApiClientListener).addOnConnectionFailedListener(googleApiClientListener).setHandler(this.this$0.locationHandlerThread.getMHandler()).build();
        sq8.m48648g(googleApiClientBuild, "googleApiClient");
        GoogleApiClientCompatProxy googleApiClientCompatProxy = new GoogleApiClientCompatProxy(googleApiClientBuild);
        ConnectionResult connectionResultBlockingConnect = googleApiClientCompatProxy.blockingConnect();
        boolean z = false;
        if (connectionResultBlockingConnect != null && connectionResultBlockingConnect.isSuccess()) {
            z = true;
        }
        if (z) {
            if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(googleApiClientBuild)) != null) {
                this.this$0.setLocationAndFire(lastLocation);
            }
            ((GmsLocationController) this.$self.f25106a).locationUpdateListener = new GmsLocationController.LocationUpdateListener(this.this$0._applicationService, (GmsLocationController) this.$self.f25106a, googleApiClientCompatProxy.getRealInstance(), this.this$0._fusedLocationApiWrapper);
            ((GmsLocationController) this.$self.f25106a).googleApiClient = googleApiClientCompatProxy;
            this.$wasSuccessful.f19803a = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("GMSLocationController connection to GoogleApiService failed: (");
            sb.append(connectionResultBlockingConnect != null ? ml1.m39304d(connectionResultBlockingConnect.getErrorCode()) : null);
            sb.append(") ");
            sb.append(connectionResultBlockingConnect != null ? connectionResultBlockingConnect.getErrorMessage() : null);
            Logging.debug$default(sb.toString(), null, 2, null);
        }
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((GmsLocationController$start$2$1$2) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
