package com.onesignal.common.events;

/* loaded from: classes6.dex */
public interface IEventNotifier<THandler> {
    boolean getHasSubscribers();

    void subscribe(THandler thandler);

    void unsubscribe(THandler thandler);
}
