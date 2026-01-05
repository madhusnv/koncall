package com.amplifyframework.kotlin.datastore;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation$waitForStart$2", m15344f = "KotlinDataStoreFacade.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class KotlinDataStoreFacade$Observation$waitForStart$2 extends AbstractC8199i implements InterfaceC2141e {
    /* synthetic */ Object L$0;
    int label;

    public KotlinDataStoreFacade$Observation$waitForStart$2(InterfaceC7559c<? super KotlinDataStoreFacade$Observation$waitForStart$2> interfaceC7559c) {
        super(2, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        KotlinDataStoreFacade$Observation$waitForStart$2 kotlinDataStoreFacade$Observation$waitForStart$2 = new KotlinDataStoreFacade$Observation$waitForStart$2(interfaceC7559c);
        kotlinDataStoreFacade$Observation$waitForStart$2.L$0 = obj;
        return kotlinDataStoreFacade$Observation$waitForStart$2;
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
        return ((KotlinDataStoreFacade$Observation$waitForStart$2) create(obj, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
