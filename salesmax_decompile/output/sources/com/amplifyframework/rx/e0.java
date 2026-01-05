package com.amplifyframework.rx;

import com.amplifyframework.auth.AuthCategoryBehavior;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.rx.RxAdapters;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements RxAdapters.VoidBehaviors.ResultEmitter {

    /* renamed from: a */
    public final /* synthetic */ AuthCategoryBehavior f10854a;

    @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
    public final void emitTo(Consumer consumer, Consumer consumer2) {
        this.f10854a.listWebAuthnCredentials(consumer, consumer2);
    }
}
