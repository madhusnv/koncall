package com.amplifyframework.auth.cognito.actions;

import java.util.Map;
import p001o.kf9;
import p001o.lx0;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$4$1 extends kf9 implements xk7 {
    final /* synthetic */ Map.Entry<String, String> $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$4$1(Map.Entry<String, String> entry) {
        super(1);
        this.$option = entry;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((lx0.C15174a) obj);
        return y3i.f54824a;
    }

    public final void invoke(lx0.C15174a c15174a) {
        sq8.m48649h(c15174a, "$this$invoke");
        c15174a.m38091e(this.$option.getKey());
        c15174a.m38092f(this.$option.getValue());
    }
}
