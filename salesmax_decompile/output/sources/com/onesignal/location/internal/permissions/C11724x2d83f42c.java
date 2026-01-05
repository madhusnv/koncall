package com.onesignal.location.internal.permissions;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.onesignal.location.internal.permissions.LocationPermissionController$showFallbackAlertDialog$1$onAccept$1$onFocus$1 */
/* loaded from: classes6.dex */
public final class C11724x2d83f42c extends kf9 implements xk7 {
    final /* synthetic */ boolean $hasPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11724x2d83f42c(boolean z) {
        super(1);
        this.$hasPermission = z;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ILocationPermissionChangedHandler) obj);
        return y3i.f54824a;
    }

    public final void invoke(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
        sq8.m48649h(iLocationPermissionChangedHandler, "it");
        iLocationPermissionChangedHandler.onLocationPermissionChanged(this.$hasPermission);
    }
}
