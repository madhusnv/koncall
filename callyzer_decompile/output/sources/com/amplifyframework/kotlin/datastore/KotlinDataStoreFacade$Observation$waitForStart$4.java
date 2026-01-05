package com.amplifyframework.kotlin.datastore;

import com.amplifyframework.core.async.Cancelable;
import ex.InterfaceC2142f;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$4", m15344f = "KotlinDataStoreFacade.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class KotlinDataStoreFacade$Observation$waitForStart$4 extends AbstractC8199i implements InterfaceC2142f {
    final /* synthetic */ Cancelable $cancelable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinDataStoreFacade$Observation$waitForStart$4(Cancelable cancelable, InterfaceC7559c<? super KotlinDataStoreFacade$Observation$waitForStart$4> interfaceC7559c) {
        super(3, interfaceC7559c);
        this.$cancelable = cancelable;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        this.$cancelable.cancel();
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(InterfaceC8210k interfaceC8210k, Throwable th2, InterfaceC7559c<? super a0> interfaceC7559c) {
        return new KotlinDataStoreFacade$Observation$waitForStart$4(this.$cancelable, interfaceC7559c).invokeSuspend(a0.f30746a);
    }
}
