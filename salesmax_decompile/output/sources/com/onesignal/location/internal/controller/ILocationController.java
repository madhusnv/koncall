package com.onesignal.location.internal.controller;

import android.location.Location;
import com.onesignal.common.events.IEventNotifier;
import p001o.n64;

/* loaded from: classes6.dex */
public interface ILocationController extends IEventNotifier<ILocationUpdatedHandler> {
    Location getLastLocation();

    Object start(n64 n64Var);

    Object stop(n64 n64Var);
}
