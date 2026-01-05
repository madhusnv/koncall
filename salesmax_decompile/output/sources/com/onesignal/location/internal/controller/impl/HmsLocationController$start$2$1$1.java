package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class HmsLocationController$start$2$1$1 extends kf9 implements xk7 {
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsLocationController$start$2$1$1(HmsLocationController hmsLocationController) {
        super(1);
        this.this$0 = hmsLocationController;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationUpdatedHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "it");
        Location location = this.this$0.lastLocation;
        sq8.m48646e(location);
        iLocationUpdatedHandler.onLocationChanged(location);
    }
}
