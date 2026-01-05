package com.amplifyframework.kotlin.api;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription$awaitStart$3", m15344f = "KotlinApiFacade.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class KotlinApiFacade$Subscription$awaitStart$3 extends AbstractC8199i implements InterfaceC2141e {
    /* synthetic */ Object L$0;
    int label;

    public KotlinApiFacade$Subscription$awaitStart$3(InterfaceC7559c<? super KotlinApiFacade$Subscription$awaitStart$3> interfaceC7559c) {
        super(2, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        KotlinApiFacade$Subscription$awaitStart$3 kotlinApiFacade$Subscription$awaitStart$3 = new KotlinApiFacade$Subscription$awaitStart$3(interfaceC7559c);
        kotlinApiFacade$Subscription$awaitStart$3.L$0 = obj;
        return kotlinApiFacade$Subscription$awaitStart$3;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        return Boolean.valueOf(!(obj2 instanceof a0));
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, InterfaceC7559c<? super Boolean> interfaceC7559c) {
        return ((KotlinApiFacade$Subscription$awaitStart$3) create(obj, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
