package com.skydoves.balloon.compose;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.skydoves.balloon.compose.BalloonKt$Balloon$5$1", m15344f = "Balloon.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BalloonKt$Balloon$5$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ BalloonComposeView $balloonComposeView;
    final /* synthetic */ InterfaceC2139c $onBalloonWindowInitialized;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonKt$Balloon$5$1(InterfaceC2139c interfaceC2139c, BalloonComposeView balloonComposeView, InterfaceC7559c<? super BalloonKt$Balloon$5$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$onBalloonWindowInitialized = interfaceC2139c;
        this.$balloonComposeView = balloonComposeView;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new BalloonKt$Balloon$5$1(this.$onBalloonWindowInitialized, this.$balloonComposeView, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        this.$onBalloonWindowInitialized.invoke(this.$balloonComposeView);
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((BalloonKt$Balloon$5$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
