package com.onesignal.session.internal.session;

/* loaded from: classes6.dex */
public interface ISessionLifecycleHandler {
    void onSessionActive();

    void onSessionEnded(long j);

    void onSessionStarted();
}
