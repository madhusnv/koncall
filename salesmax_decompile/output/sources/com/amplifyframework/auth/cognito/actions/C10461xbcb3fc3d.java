package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import java.util.Map;
import p001o.cg2;
import p001o.kf9;
import p001o.sq8;
import p001o.wqe;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$1$evt$2$respondToAuthChallenge$1 */
/* loaded from: classes5.dex */
public final class C10461xbcb3fc3d extends kf9 implements xk7 {
    final /* synthetic */ Map<String, String> $challengeResponse;
    final /* synthetic */ String $encodedContextData;
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge $event;
    final /* synthetic */ String $pinpointEndpointId;
    final /* synthetic */ AuthEnvironment $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10461xbcb3fc3d(AuthEnvironment authEnvironment, Map<String, String> map, DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge, String str, String str2) {
        super(1);
        this.$this_invoke = authEnvironment;
        this.$challengeResponse = map;
        this.$event = respondDeviceSRPChallenge;
        this.$pinpointEndpointId = str;
        this.$encodedContextData = str2;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((wqe.C17950a) obj);
        return y3i.f54824a;
    }

    public final void invoke(wqe.C17950a c17950a) {
        sq8.m48649h(c17950a, "$this$invoke");
        c17950a.m54876j(cg2.C12660e.f18060c);
        UserPoolConfiguration userPool = this.$this_invoke.getConfiguration().getUserPool();
        c17950a.m54878l(userPool != null ? userPool.getAppClient() : null);
        c17950a.m54877k(this.$challengeResponse);
        c17950a.m54879m(this.$event.getMetadata());
        String str = this.$pinpointEndpointId;
        if (str != null) {
            c17950a.m54867a(new C10462xdc2af97(str));
        }
        String str2 = this.$encodedContextData;
        if (str2 != null) {
            c17950a.m54881o(new C10463xdc2b358(str2));
        }
    }
}
