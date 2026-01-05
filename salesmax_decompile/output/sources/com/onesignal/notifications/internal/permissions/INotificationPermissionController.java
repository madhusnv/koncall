package com.onesignal.notifications.internal.permissions;

import com.onesignal.common.events.IEventNotifier;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationPermissionController extends IEventNotifier<INotificationPermissionChangedHandler> {
    boolean getCanRequestPermission();

    Object prompt(boolean z, n64 n64Var);
}
