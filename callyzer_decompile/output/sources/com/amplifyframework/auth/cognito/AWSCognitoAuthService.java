package com.amplifyframework.auth.cognito;

import ab.C0083a;
import ab.C0085c;
import ab.C0087e;
import ab.InterfaceC0086d;
import bc.C0642a;
import cb.C0943b;
import cb.InterfaceC0944c;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.util.AmplifyHttpKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.ae;
import qw.C6364n;
import qw.a0;
import tc.InterfaceC7116a;
import ua.C7381a;
import ua.C7382b;
import ua.C7384d;
import ua.InterfaceC7383c;
import uc.C7394a;
import uw.InterfaceC7559c;
import vb.C7696c;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AWSCognitoAuthService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final a0 fromConfiguration$lambda$2$lambda$1(UserPoolConfiguration userPoolConfiguration, final Map map, C0083a CognitoIdentityProviderClient) {
            AbstractC4154l.m8923f(CognitoIdentityProviderClient, "$this$CognitoIdentityProviderClient");
            AmplifyHttpKt.setHttpEngine(CognitoIdentityProviderClient);
            CognitoIdentityProviderClient.f302d = userPoolConfiguration.getRegion();
            final String endpoint = userPoolConfiguration.getEndpoint();
            CognitoIdentityProviderClient.f305g = endpoint != null ? new InterfaceC0944c() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1$1$1
                public final Object resolveEndpoint(C0943b c0943b, InterfaceC7559c<? super C0642a> interfaceC7559c) {
                    return new C0642a(endpoint);
                }

                @Override // bc.InterfaceC0643b
                public /* bridge */ /* synthetic */ Object resolveEndpoint(Object obj, InterfaceC7559c interfaceC7559c) {
                    return resolveEndpoint((C0943b) obj, (InterfaceC7559c<? super C0642a>) interfaceC7559c);
                }
            } : null;
            CognitoIdentityProviderClient.f306h.add(new InterfaceC8909c() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1$2
                @Override // zb.InterfaceC8909c
                /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
                public Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                    return interfaceC8916j.mo12203c();
                }

                @Override // zb.InterfaceC8909c
                /* renamed from: modifyBeforeCompletion-gIAlu-s */
                public Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                    return interfaceC8916j.mo12203c();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c<? super C7394a> interfaceC7559c) {
                    return interfaceC8914h.mo12201a();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c<Object> interfaceC7559c) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        ae.m10531a(interfaceC8915i.mo12202b()).m12496a(entry.getKey(), entry.getValue());
                    }
                    return interfaceC8915i.mo12205e();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
                    super.readAfterAttempt(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
                    super.readAfterDeserialization(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterExecution(InterfaceC8916j interfaceC8916j) {
                    super.readAfterExecution(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
                    super.readAfterSerialization(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterSigning(InterfaceC8913g interfaceC8913g) {
                    super.readAfterSigning(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
                    super.readAfterTransmit(interfaceC8914h);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeAttempt(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
                    super.readBeforeDeserialization(interfaceC8914h);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
                    super.readBeforeExecution(interfaceC8915i);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
                    super.readBeforeSerialization(interfaceC8915i);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeSigning(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeTransmit(interfaceC8913g);
                }
            });
            return a0.f30746a;
        }

        private static final a0 fromConfiguration$lambda$4$lambda$3(IdentityPoolConfiguration identityPoolConfiguration, final Map map, C7381a CognitoIdentityClient) {
            AbstractC4154l.m8923f(CognitoIdentityClient, "$this$CognitoIdentityClient");
            AmplifyHttpKt.setHttpEngine(CognitoIdentityClient);
            CognitoIdentityClient.f35092d = identityPoolConfiguration.getRegion();
            CognitoIdentityClient.f35095g.add(new InterfaceC8909c() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityClient$1$1$1
                @Override // zb.InterfaceC8909c
                /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s, reason: not valid java name */
                public Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                    return interfaceC8916j.mo12203c();
                }

                @Override // zb.InterfaceC8909c
                /* renamed from: modifyBeforeCompletion-gIAlu-s, reason: not valid java name */
                public Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                    return interfaceC8916j.mo12203c();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c<? super C7394a> interfaceC7559c) {
                    return interfaceC8914h.mo12201a();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c<Object> interfaceC7559c) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        ae.m10531a(interfaceC8915i.mo12202b()).m12496a(entry.getKey(), entry.getValue());
                    }
                    return interfaceC8915i.mo12205e();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                    return interfaceC8913g.mo12204d();
                }

                @Override // zb.InterfaceC8909c
                public void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
                    super.readAfterAttempt(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
                    super.readAfterDeserialization(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterExecution(InterfaceC8916j interfaceC8916j) {
                    super.readAfterExecution(interfaceC8916j);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
                    super.readAfterSerialization(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterSigning(InterfaceC8913g interfaceC8913g) {
                    super.readAfterSigning(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
                    super.readAfterTransmit(interfaceC8914h);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeAttempt(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
                    super.readBeforeDeserialization(interfaceC8914h);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
                    super.readBeforeExecution(interfaceC8915i);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
                    super.readBeforeSerialization(interfaceC8915i);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeSigning(interfaceC8913g);
                }

                @Override // zb.InterfaceC8909c
                public void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
                    super.readBeforeTransmit(interfaceC8913g);
                }
            });
            return a0.f30746a;
        }

        public final AWSCognitoAuthService fromConfiguration$aws_auth_cognito_release(AuthConfiguration configuration) {
            final C0087e c0087e;
            AbstractC4154l.m8923f(configuration, "configuration");
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            UserPoolConfiguration userPool = configuration.getUserPool();
            final C7384d c7384d = null;
            if (userPool != null) {
                C0083a c0083a = new C0083a();
                fromConfiguration$lambda$2$lambda$1(userPool, linkedHashMap, c0083a);
                c0083a.f306h.add(0, new C7696c());
                C0085c config = (C0085c) ((InterfaceC8922p) c0083a.build());
                AbstractC4154l.m8923f(config, "config");
                c0087e = new C0087e(config);
            } else {
                c0087e = null;
            }
            IdentityPoolConfiguration identityPool = configuration.getIdentityPool();
            if (identityPool != null) {
                C7381a c7381a = new C7381a();
                fromConfiguration$lambda$4$lambda$3(identityPool, linkedHashMap, c7381a);
                c7381a.f35095g.add(0, new C7696c());
                C7382b config2 = (C7382b) ((InterfaceC8922p) c7381a.build());
                AbstractC4154l.m8923f(config2, "config");
                c7384d = new C7384d(config2);
            }
            return new AWSCognitoAuthService(c0087e, c7384d, linkedHashMap) { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$1
                private final InterfaceC7383c cognitoIdentityClient;
                private final InterfaceC0086d cognitoIdentityProviderClient;
                private final Map<String, String> customUserAgentPairs;

                {
                    this.cognitoIdentityProviderClient = c0087e;
                    this.cognitoIdentityClient = c7384d;
                    this.customUserAgentPairs = linkedHashMap;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public InterfaceC7383c getCognitoIdentityClient() {
                    return this.cognitoIdentityClient;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public InterfaceC0086d getCognitoIdentityProviderClient() {
                    return this.cognitoIdentityProviderClient;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public Map<String, String> getCustomUserAgentPairs() {
                    return this.customUserAgentPairs;
                }
            };
        }
    }

    InterfaceC7383c getCognitoIdentityClient();

    InterfaceC0086d getCognitoIdentityProviderClient();

    Map<String, String> getCustomUserAgentPairs();
}
