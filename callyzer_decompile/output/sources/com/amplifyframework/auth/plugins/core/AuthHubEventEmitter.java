package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthHubEventEmitter {
    private final AtomicReference<String> lastPublishedHubEventName = new AtomicReference<>();

    public final void sendHubEvent(String eventName) {
        AbstractC4154l.m8923f(eventName, "eventName");
        if (AbstractC4154l.m8918a(this.lastPublishedHubEventName.getAndSet(eventName), eventName)) {
            return;
        }
        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(eventName));
    }
}
