package com.amplifyframework.kotlin.hub;

import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubEventFilter;
import com.amplifyframework.hub.HubEventFilters;
import kotlin.jvm.internal.AbstractC4154l;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Hub {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ InterfaceC8209j subscribe$default(Hub hub, HubChannel hubChannel, HubEventFilter hubEventFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }
        if ((i10 & 2) != 0) {
            hubEventFilter = HubEventFilters.always();
            AbstractC4154l.m8922e(hubEventFilter, "always(...)");
        }
        return hub.subscribe(hubChannel, hubEventFilter);
    }

    void publish(HubChannel hubChannel, HubEvent<?> hubEvent);

    InterfaceC8209j subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter);
}
