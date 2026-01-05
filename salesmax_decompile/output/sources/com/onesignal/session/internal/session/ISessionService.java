package com.onesignal.session.internal.session;

import com.onesignal.common.events.IEventNotifier;

/* loaded from: classes6.dex */
public interface ISessionService extends IEventNotifier<ISessionLifecycleHandler> {
    long getStartTime();
}
