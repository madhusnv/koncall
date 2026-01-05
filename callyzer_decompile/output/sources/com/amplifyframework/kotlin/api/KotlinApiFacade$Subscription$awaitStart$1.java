package com.amplifyframework.kotlin.api;

import com.amplifyframework.kotlin.api.KotlinApiFacade;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.api.KotlinApiFacade$Subscription", m15344f = "KotlinApiFacade.kt", m15345l = {252}, m15346m = "awaitStart$core_kotlin_release")
/* loaded from: classes.dex */
public final class KotlinApiFacade$Subscription$awaitStart$1 extends AbstractC8193c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KotlinApiFacade.Subscription<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinApiFacade$Subscription$awaitStart$1(KotlinApiFacade.Subscription<T> subscription, InterfaceC7559c<? super KotlinApiFacade$Subscription$awaitStart$1> interfaceC7559c) {
        super(interfaceC7559c);
        this.this$0 = subscription;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitStart$core_kotlin_release(this);
    }
}
