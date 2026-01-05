package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.gk8;
import p001o.k16;
import p001o.kg3;
import p001o.l75;
import p001o.m0c;
import p001o.m16;
import p001o.ml1;
import p001o.n64;
import p001o.o16;
import p001o.o64;
import p001o.q01;
import p001o.sq8;
import p001o.sz0;
import p001o.uq8;
import p001o.wi8;
import p001o.wre;
import p001o.xi8;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10469xf78af94c implements Action {
    final /* synthetic */ SignedInData $signedInData$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1", m36648f = "FetchAuthSessionCognitoActions.kt", m36649l = {Opcodes.DASTORE, Opcodes.AASTORE, Opcodes.POP2}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10469xf78af94c.this.execute(null, null, this);
        }
    }

    public C10469xf78af94c(String str, SignedInData signedInData) {
        this.$signedInData$inlined = signedInData;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0264 A[Catch: Exception -> 0x01fa, m0c -> 0x01fd, TryCatch #9 {m0c -> 0x01fd, Exception -> 0x01fa, blocks: (B:80:0x01f5, B:87:0x0207, B:89:0x020d, B:91:0x0215, B:93:0x0219, B:95:0x021f, B:98:0x0227, B:100:0x022d, B:102:0x0233, B:104:0x025c, B:107:0x026a, B:109:0x0271, B:114:0x027f, B:116:0x0297, B:118:0x02a3, B:120:0x02a9, B:122:0x02b3, B:124:0x02b9, B:125:0x02cf, B:106:0x0264), top: B:163:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0297 A[Catch: Exception -> 0x01fa, m0c -> 0x01fd, TryCatch #9 {m0c -> 0x01fd, Exception -> 0x01fa, blocks: (B:80:0x01f5, B:87:0x0207, B:89:0x020d, B:91:0x0215, B:93:0x0219, B:95:0x021f, B:98:0x0227, B:100:0x022d, B:102:0x0233, B:104:0x025c, B:107:0x026a, B:109:0x0271, B:114:0x027f, B:116:0x0297, B:118:0x02a3, B:120:0x02a9, B:122:0x02b3, B:124:0x02b9, B:125:0x02cf, B:106:0x0264), top: B:163:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf A[Catch: Exception -> 0x01fa, m0c -> 0x01fd, TRY_LEAVE, TryCatch #9 {m0c -> 0x01fd, Exception -> 0x01fa, blocks: (B:80:0x01f5, B:87:0x0207, B:89:0x020d, B:91:0x0215, B:93:0x0219, B:95:0x021f, B:98:0x0227, B:100:0x022d, B:102:0x0233, B:104:0x025c, B:107:0x026a, B:109:0x0271, B:114:0x027f, B:116:0x0297, B:118:0x02a3, B:120:0x02a9, B:122:0x02b3, B:124:0x02b9, B:125:0x02cf, B:106:0x0264), top: B:163:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188 A[Catch: Exception -> 0x02db, m0c -> 0x02df, TryCatch #14 {m0c -> 0x02df, Exception -> 0x02db, blocks: (B:62:0x0184, B:64:0x0188, B:65:0x0191, B:67:0x019f, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:75:0x01cb, B:76:0x01d3), top: B:153:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f A[Catch: Exception -> 0x02db, m0c -> 0x02df, TryCatch #14 {m0c -> 0x02df, Exception -> 0x02db, blocks: (B:62:0x0184, B:64:0x0188, B:65:0x0191, B:67:0x019f, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:75:0x01cb, B:76:0x01d3), top: B:153:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207 A[Catch: Exception -> 0x01fa, m0c -> 0x01fd, TryCatch #9 {m0c -> 0x01fd, Exception -> 0x01fa, blocks: (B:80:0x01f5, B:87:0x0207, B:89:0x020d, B:91:0x0215, B:93:0x0219, B:95:0x021f, B:98:0x0227, B:100:0x022d, B:102:0x0233, B:104:0x025c, B:107:0x026a, B:109:0x0271, B:114:0x027f, B:116:0x0297, B:118:0x02a3, B:120:0x02a9, B:122:0x02b3, B:124:0x02b9, B:125:0x02cf, B:106:0x0264), top: B:163:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        AnonymousClass1 anonymousClass1;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        String str;
        m0c m0cVar;
        CognitoUserPoolTokens cognitoUserPoolTokens;
        C10469xf78af94c c10469xf78af94c;
        String str2;
        Map map;
        String str3;
        String str4;
        Object deviceMetadata;
        Map map2;
        CognitoUserPoolTokens cognitoUserPoolTokens2;
        String str5;
        AuthEnvironment authEnvironment2;
        DeviceMetadata.Metadata metadata;
        kg3 cognitoIdentityProviderClient;
        xi8 xi8Var;
        String str6;
        C10469xf78af94c c10469xf78af94c2;
        StateMachineEvent authorizationEvent;
        String accessToken;
        String username;
        q01 q01VarM56334a;
        q01 q01VarM56334a2;
        q01 q01VarM56334a3;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object objI0 = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(objI0);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                String username2 = this.$signedInData$inlined.getUsername();
                cognitoUserPoolTokens = this.$signedInData$inlined.getCognitoUserPoolTokens();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username2, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                String refreshToken = cognitoUserPoolTokens.getRefreshToken();
                if (refreshToken != null) {
                    linkedHashMap.put("REFRESH_TOKEN", refreshToken);
                }
                if (secretHash != null) {
                    linkedHashMap.put("SECRET_HASH", secretHash);
                }
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = username2;
                    anonymousClass1.L$5 = cognitoUserPoolTokens;
                    anonymousClass1.L$6 = linkedHashMap;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment.getUserContextData(username2, anonymousClass1);
                    if (userContextData == objM51918f) {
                        return objM51918f;
                    }
                    c10469xf78af94c = this;
                    str2 = username2;
                    map = linkedHashMap;
                    str3 = id;
                    objI0 = userContextData;
                    str4 = (String) objI0;
                    anonymousClass1.L$0 = c10469xf78af94c;
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = str3;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = str2;
                    anonymousClass1.L$5 = cognitoUserPoolTokens;
                    anonymousClass1.L$6 = map;
                    anonymousClass1.L$7 = str4;
                    anonymousClass1.label = 2;
                    deviceMetadata = authEnvironment.getDeviceMetadata(str2, anonymousClass1);
                    if (deviceMetadata != objM51918f) {
                    }
                } catch (m0c e) {
                    e = e;
                    m0cVar = e;
                    str = id;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                } catch (Exception e2) {
                    e = e2;
                    str = id;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                }
            } catch (m0c e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher;
            }
        } else if (i2 == 1) {
            map = (Map) anonymousClass1.L$6;
            CognitoUserPoolTokens cognitoUserPoolTokens3 = (CognitoUserPoolTokens) anonymousClass1.L$5;
            str2 = (String) anonymousClass1.L$4;
            AuthEnvironment authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
            str3 = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            c10469xf78af94c = (C10469xf78af94c) anonymousClass1.L$0;
            try {
                wre.m54934b(objI0);
                cognitoUserPoolTokens = cognitoUserPoolTokens3;
                authEnvironment = authEnvironment3;
                try {
                    str4 = (String) objI0;
                    anonymousClass1.L$0 = c10469xf78af94c;
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = str3;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = str2;
                    anonymousClass1.L$5 = cognitoUserPoolTokens;
                    anonymousClass1.L$6 = map;
                    anonymousClass1.L$7 = str4;
                    anonymousClass1.label = 2;
                    deviceMetadata = authEnvironment.getDeviceMetadata(str2, anonymousClass1);
                    if (deviceMetadata != objM51918f) {
                        return objM51918f;
                    }
                    AuthEnvironment authEnvironment4 = authEnvironment;
                    map2 = map;
                    cognitoUserPoolTokens2 = cognitoUserPoolTokens;
                    str5 = str3;
                    authEnvironment2 = authEnvironment4;
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                    }
                    String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                    }
                } catch (m0c e5) {
                    m0cVar = e5;
                    str = str3;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                } catch (Exception e6) {
                    e = e6;
                    str = str3;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                }
            } catch (m0c e7) {
                m0cVar = e7;
                authEnvironment = authEnvironment3;
                str = str3;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            } catch (Exception e8) {
                e = e8;
                authEnvironment = authEnvironment3;
                str = str3;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            }
        } else if (i2 == 2) {
            String str7 = (String) anonymousClass1.L$7;
            map2 = (Map) anonymousClass1.L$6;
            CognitoUserPoolTokens cognitoUserPoolTokens4 = (CognitoUserPoolTokens) anonymousClass1.L$5;
            String str8 = (String) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            String str9 = (String) anonymousClass1.L$2;
            EventDispatcher eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            C10469xf78af94c c10469xf78af94c3 = (C10469xf78af94c) anonymousClass1.L$0;
            try {
                wre.m54934b(objI0);
                str4 = str7;
                cognitoUserPoolTokens2 = cognitoUserPoolTokens4;
                str2 = str8;
                str5 = str9;
                eventDispatcher2 = eventDispatcher3;
                c10469xf78af94c = c10469xf78af94c3;
                deviceMetadata = objI0;
                try {
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                        map2.put("DEVICE_KEY", metadata.getDeviceKey());
                    }
                    String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        wi8.C17918a c17918a = new wi8.C17918a();
                        c17918a.m54591j(sz0.C16939e.f46135c);
                        UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                        c17918a.m54593l(userPool3 != null ? userPool3.getAppClient() : null);
                        c17918a.m54592k(map2);
                        if (pinpointEndpointId2 != null) {
                            c17918a.m54582a(new C10472x3e1384d2(pinpointEndpointId2));
                        }
                        if (str4 != null) {
                            c17918a.m54596o(new C10473x3e138893(str4));
                        }
                        wi8 wi8VarM54583b = c17918a.m54583b();
                        anonymousClass1.L$0 = c10469xf78af94c;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str5;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = str2;
                        anonymousClass1.L$5 = cognitoUserPoolTokens2;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 3;
                        objI0 = cognitoIdentityProviderClient.i0(wi8VarM54583b, anonymousClass1);
                        if (objI0 == objM51918f) {
                            return objM51918f;
                        }
                        str6 = str2;
                        str = str5;
                        authEnvironment = authEnvironment2;
                        c10469xf78af94c2 = c10469xf78af94c;
                        xi8Var = (xi8) objI0;
                        c10469xf78af94c = c10469xf78af94c2;
                        str2 = str6;
                        if (xi8Var == null) {
                            if (xi8Var != null) {
                                if (xi8Var != null) {
                                    String refreshToken2 = cognitoUserPoolTokens2.getRefreshToken();
                                    gk8 gk8VarM28963g = gk8.f25374b.m28963g();
                                    k16.C14700a c14700a = k16.f31358b;
                                    CognitoUserPoolTokens cognitoUserPoolTokens5 = new CognitoUserPoolTokens(strM44575c, strM44573a, refreshToken2, ml1.m39305e(gk8VarM28963g.m28956m(m16.m38176t(jM44574b, o16.SECONDS)).m28952e()));
                                    SignedInData signedInData = c10469xf78af94c.$signedInData$inlined;
                                    accessToken = cognitoUserPoolTokens5.getAccessToken();
                                    if (accessToken != null) {
                                        String userId = c10469xf78af94c.$signedInData$inlined.getUserId();
                                        String str10 = userId;
                                        String accessToken2 = cognitoUserPoolTokens5.getAccessToken();
                                        if (accessToken2 != null) {
                                            SignedInData signedInDataCopy$default = SignedInData.copy$default(signedInData, str10, (accessToken2 != null || (username = SessionHelper.INSTANCE.getUsername(accessToken2)) == null) ? str2 : username, null, null, cognitoUserPoolTokens5, 12, null);
                                            if (authEnvironment.getConfiguration().getIdentityPool() == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        xi8Var = null;
                        str = str5;
                        authEnvironment = authEnvironment2;
                        if (xi8Var == null) {
                        }
                    }
                } catch (m0c e9) {
                    m0cVar = e9;
                    str = str5;
                    authEnvironment = authEnvironment2;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                } catch (Exception e10) {
                    e = e10;
                    str = str5;
                    authEnvironment = authEnvironment2;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                    return y3i.f54824a;
                }
            } catch (m0c e11) {
                m0cVar = e11;
                authEnvironment = authEnvironment2;
                str = str9;
                eventDispatcher2 = eventDispatcher3;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            } catch (Exception e12) {
                e = e12;
                authEnvironment = authEnvironment2;
                str = str9;
                eventDispatcher2 = eventDispatcher3;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cognitoUserPoolTokens2 = (CognitoUserPoolTokens) anonymousClass1.L$5;
            str6 = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
            c10469xf78af94c2 = (C10469xf78af94c) anonymousClass1.L$0;
            try {
                wre.m54934b(objI0);
                eventDispatcher2 = eventDispatcher4;
            } catch (m0c e13) {
                m0cVar = e13;
                eventDispatcher2 = eventDispatcher4;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            } catch (Exception e14) {
                e = e14;
                eventDispatcher2 = eventDispatcher4;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            }
            try {
                xi8Var = (xi8) objI0;
                c10469xf78af94c = c10469xf78af94c2;
                str2 = str6;
                long jM44574b = (xi8Var == null || (q01VarM56334a3 = xi8Var.m56334a()) == null) ? 0L : q01VarM56334a3.m44574b();
                String strM44575c = (xi8Var != null || (q01VarM56334a2 = xi8Var.m56334a()) == null) ? null : q01VarM56334a2.m44575c();
                String strM44573a = (xi8Var != null || (q01VarM56334a = xi8Var.m56334a()) == null) ? null : q01VarM56334a.m44573a();
                String refreshToken22 = cognitoUserPoolTokens2.getRefreshToken();
                gk8 gk8VarM28963g2 = gk8.f25374b.m28963g();
                k16.C14700a c14700a2 = k16.f31358b;
                CognitoUserPoolTokens cognitoUserPoolTokens52 = new CognitoUserPoolTokens(strM44575c, strM44573a, refreshToken22, ml1.m39305e(gk8VarM28963g2.m28956m(m16.m38176t(jM44574b, o16.SECONDS)).m28952e()));
                SignedInData signedInData2 = c10469xf78af94c.$signedInData$inlined;
                accessToken = cognitoUserPoolTokens52.getAccessToken();
                if (accessToken != null || (userId = SessionHelper.INSTANCE.getUserSub(accessToken)) == null) {
                    String userId2 = c10469xf78af94c.$signedInData$inlined.getUserId();
                }
                String str102 = userId2;
                String accessToken22 = cognitoUserPoolTokens52.getAccessToken();
                SignedInData signedInDataCopy$default2 = SignedInData.copy$default(signedInData2, str102, (accessToken22 != null || (username = SessionHelper.INSTANCE.getUsername(accessToken22)) == null) ? str2 : username, null, null, cognitoUserPoolTokens52, 12, null);
                if (authEnvironment.getConfiguration().getIdentityPool() == null) {
                    UserPoolConfiguration userPool4 = authEnvironment.getConfiguration().getUserPool();
                    String region = userPool4 != null ? userPool4.getRegion() : null;
                    UserPoolConfiguration userPool5 = authEnvironment.getConfiguration().getUserPool();
                    String poolId = userPool5 != null ? userPool5.getPoolId() : null;
                    String idToken = cognitoUserPoolTokens52.getIdToken();
                    sq8.m48646e(idToken);
                    authorizationEvent = new RefreshSessionEvent(new RefreshSessionEvent.EventType.RefreshAuthSession(signedInDataCopy$default2, new LoginsMapProvider.CognitoUserPoolLogins(region, poolId, idToken)), null, 2, null);
                } else {
                    authorizationEvent = new RefreshSessionEvent(new RefreshSessionEvent.EventType.Refreshed(signedInDataCopy$default2), null, 2, null);
                }
            } catch (m0c e15) {
                m0cVar = e15;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, m0cVar, 3, null)), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            } catch (Exception e16) {
                e = e16;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
        eventDispatcher2.send(authorizationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
