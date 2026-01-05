package com.skydoves.balloon;

import com.skydoves.balloon.Balloon;
import ex.InterfaceC2139c;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AwaitBalloonsKt {
    public static final Object awaitBalloons(InterfaceC2139c interfaceC2139c, InterfaceC7559c<? super a0> interfaceC7559c) {
        AwaitBalloonsDslImpl awaitBalloonsDslImpl = new AwaitBalloonsDslImpl();
        interfaceC2139c.invoke(awaitBalloonsDslImpl);
        DeferredBalloonGroup deferredBalloonGroupBuild = awaitBalloonsDslImpl.build();
        Balloon.Companion companion = Balloon.Companion;
        companion.initConsumerIfNeeded();
        Object objMo14775g = companion.getChannel().mo14775g(deferredBalloonGroupBuild, interfaceC7559c);
        return objMo14775g == EnumC7794a.COROUTINE_SUSPENDED ? objMo14775g : a0.f30746a;
    }
}
