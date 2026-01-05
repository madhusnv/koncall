package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthUserAttribute;
import p001o.kf9;
import p001o.lx0;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class UpdateUserAttributesUseCase$updateAttributes$response$1$1$1 extends kf9 implements xk7 {
    final /* synthetic */ AuthUserAttribute $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserAttributesUseCase$updateAttributes$response$1$1$1(AuthUserAttribute authUserAttribute) {
        super(1);
        this.$it = authUserAttribute;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((lx0.C15174a) obj);
        return y3i.f54824a;
    }

    public final void invoke(lx0.C15174a c15174a) {
        sq8.m48649h(c15174a, "$this$invoke");
        c15174a.m38091e(this.$it.getKey().getKeyString());
        c15174a.m38092f(this.$it.getValue());
    }
}
