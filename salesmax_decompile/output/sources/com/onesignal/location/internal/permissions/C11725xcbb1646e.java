package com.onesignal.location.internal.permissions;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.onesignal.location.internal.permissions.LocationPermissionController$showFallbackAlertDialog$1$onDecline$1 */
/* loaded from: classes6.dex */
public final class C11725xcbb1646e extends kf9 implements xk7 {
    public static final C11725xcbb1646e INSTANCE = new C11725xcbb1646e();

    public C11725xcbb1646e() {
        super(1);
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationPermissionChangedHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
        sq8.m48649h(iLocationPermissionChangedHandler, "it");
        iLocationPermissionChangedHandler.onLocationPermissionChanged(false);
    }
}
