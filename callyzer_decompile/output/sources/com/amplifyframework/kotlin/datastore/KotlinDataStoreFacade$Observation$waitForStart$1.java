package com.amplifyframework.kotlin.datastore;

import com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.datastore.KotlinDataStoreFacade$Observation", m15344f = "KotlinDataStoreFacade.kt", m15345l = {207}, m15346m = "waitForStart$core_kotlin_release")
/* loaded from: classes.dex */
public final class KotlinDataStoreFacade$Observation$waitForStart$1 extends AbstractC8193c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KotlinDataStoreFacade.Observation<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinDataStoreFacade$Observation$waitForStart$1(KotlinDataStoreFacade.Observation<T> observation, InterfaceC7559c<? super KotlinDataStoreFacade$Observation$waitForStart$1> interfaceC7559c) {
        super(interfaceC7559c);
        this.this$0 = observation;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForStart$core_kotlin_release(this);
    }
}
