package com.amplifyframework.auth.cognito.actions;

import android.os.Build;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import p001o.er3;
import p001o.jr5;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignInCognitoActions$confirmDevice$1$evt$1 extends kf9 implements xk7 {
    final /* synthetic */ String $deviceKey;
    final /* synthetic */ Map<String, String> $deviceVerifierMap;
    final /* synthetic */ SignInEvent.EventType.ConfirmDevice $event;

    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$1$evt$1$1 */
    public static final class C104991 extends kf9 implements xk7 {
        final /* synthetic */ Map<String, String> $deviceVerifierMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104991(Map<String, String> map) {
            super(1);
            this.$deviceVerifierMap = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((jr5.C14637a) obj);
            return y3i.f54824a;
        }

        public final void invoke(jr5.C14637a c14637a) {
            sq8.m48649h(c14637a, "$this$invoke");
            c14637a.m34378d(this.$deviceVerifierMap.get("verifier"));
            c14637a.m34379e(this.$deviceVerifierMap.get("salt"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInCognitoActions$confirmDevice$1$evt$1(SignInEvent.EventType.ConfirmDevice confirmDevice, String str, Map<String, String> map) {
        super(1);
        this.$event = confirmDevice;
        this.$deviceKey = str;
        this.$deviceVerifierMap = map;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((er3.C13248a) obj);
        return y3i.f54824a;
    }

    public final void invoke(er3.C13248a c13248a) {
        sq8.m48649h(c13248a, "$this$invoke");
        c13248a.m25457f(this.$event.getSignedInData().getCognitoUserPoolTokens().getAccessToken());
        c13248a.m25458g(this.$deviceKey);
        c13248a.m25459h(Build.MODEL);
        c13248a.m25460i(jr5.f30990c.m34380a(new C104991(this.$deviceVerifierMap)));
    }
}
