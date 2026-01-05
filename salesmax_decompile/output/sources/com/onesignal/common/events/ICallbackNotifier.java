package com.onesignal.common.events;

/* loaded from: classes6.dex */
public interface ICallbackNotifier<THandler> {
    boolean getHasCallback();

    void set(THandler thandler);
}
