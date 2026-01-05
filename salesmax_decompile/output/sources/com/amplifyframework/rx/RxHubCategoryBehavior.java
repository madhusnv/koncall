package com.amplifyframework.rx;

import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface RxHubCategoryBehavior {
    x6c on(HubChannel hubChannel);

    <T> xk3 publish(HubChannel hubChannel, HubEvent<T> hubEvent);
}
