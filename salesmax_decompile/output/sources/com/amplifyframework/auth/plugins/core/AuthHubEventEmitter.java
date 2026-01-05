package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import java.util.concurrent.atomic.AtomicReference;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthHubEventEmitter {
    private final AtomicReference<String> lastPublishedHubEventName = new AtomicReference<>();

    public final void sendHubEvent(String str) {
        sq8.m48649h(str, "eventName");
        if (sq8.m48644c(this.lastPublishedHubEventName.getAndSet(str), str)) {
            return;
        }
        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(str));
    }
}
