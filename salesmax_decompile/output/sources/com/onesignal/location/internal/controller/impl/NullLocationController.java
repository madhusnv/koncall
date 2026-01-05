package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import p001o.ml1;
import p001o.n64;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NullLocationController implements ILocationController {
    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        return null;
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Object start(n64 n64Var) {
        return ml1.m39301a(false);
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Object stop(n64 n64Var) {
        return y3i.f54824a;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler iLocationUpdatedHandler) {
        sq8.m48649h(iLocationUpdatedHandler, "handler");
    }
}
