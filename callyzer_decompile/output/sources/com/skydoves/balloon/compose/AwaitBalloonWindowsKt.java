package com.skydoves.balloon.compose;

import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.DeferredBalloonGroup;
import ex.InterfaceC2139c;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AwaitBalloonWindowsKt {
    public static final Object awaitBalloonWindows(InterfaceC2139c interfaceC2139c, InterfaceC7559c<? super a0> interfaceC7559c) {
        AwaitBalloonWindowsDslImpl awaitBalloonWindowsDslImpl = new AwaitBalloonWindowsDslImpl();
        interfaceC2139c.invoke(awaitBalloonWindowsDslImpl);
        DeferredBalloonGroup deferredBalloonGroupBuild = awaitBalloonWindowsDslImpl.build();
        Balloon.Companion companion = Balloon.Companion;
        companion.initConsumerIfNeeded();
        Object objMo14775g = companion.getChannel().mo14775g(deferredBalloonGroupBuild, interfaceC7559c);
        return objMo14775g == EnumC7794a.COROUTINE_SUSPENDED ? objMo14775g : a0.f30746a;
    }
}
