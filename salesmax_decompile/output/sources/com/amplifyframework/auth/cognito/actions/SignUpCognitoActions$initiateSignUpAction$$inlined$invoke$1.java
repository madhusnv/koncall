package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import com.amplifyframework.auth.result.step.AuthSignUpStep;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.TypeReference;
import p001o.dh3;
import p001o.hc0;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.lx0;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xl5;
import p001o.xrf;
import p001o.y3i;
import p001o.yrf;
import p001o.ze3;

/* loaded from: classes5.dex */
public final class SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignUpEvent.EventType.InitiateSignUp $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1", m36648f = "SignUpCognitoActions.kt", m36649l = {TypeReference.METHOD_REFERENCE, TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1$1 */
    public static final class C105071 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C105071(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1(String str, SignUpEvent.EventType.InitiateSignUp initiateSignUp) {
        this.$event$inlined = initiateSignUp;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0255 A[Catch: Exception -> 0x02a4, TryCatch #5 {Exception -> 0x02a4, blocks: (B:73:0x01df, B:75:0x01e3, B:77:0x01e9, B:81:0x01f3, B:83:0x01f9, B:85:0x01ff, B:87:0x0205, B:89:0x020b, B:91:0x0211, B:93:0x0217, B:95:0x0232, B:98:0x023b, B:100:0x0242, B:102:0x0249, B:107:0x0255, B:109:0x025d, B:110:0x025f, B:111:0x027f, B:113:0x028e, B:115:0x0294), top: B:140:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027f A[Catch: Exception -> 0x02a4, TryCatch #5 {Exception -> 0x02a4, blocks: (B:73:0x01df, B:75:0x01e3, B:77:0x01e9, B:81:0x01f3, B:83:0x01f9, B:85:0x01ff, B:87:0x0205, B:89:0x020b, B:91:0x0211, B:93:0x0217, B:95:0x0232, B:98:0x023b, B:100:0x0242, B:102:0x0249, B:107:0x0255, B:109:0x025d, B:110:0x025f, B:111:0x027f, B:113:0x028e, B:115:0x0294), top: B:140:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[Catch: Exception -> 0x02a7, TryCatch #3 {Exception -> 0x02a7, blocks: (B:31:0x00c2, B:33:0x00d2, B:35:0x00eb, B:36:0x00fa, B:38:0x0100, B:40:0x0119, B:42:0x0126, B:44:0x012c, B:46:0x013b, B:48:0x0141, B:50:0x014b, B:52:0x0151, B:54:0x015a, B:56:0x016a, B:57:0x0172, B:59:0x018b, B:60:0x0198, B:62:0x019e, B:64:0x01b1, B:66:0x01b6), top: B:136:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3 A[Catch: Exception -> 0x02a4, TryCatch #5 {Exception -> 0x02a4, blocks: (B:73:0x01df, B:75:0x01e3, B:77:0x01e9, B:81:0x01f3, B:83:0x01f9, B:85:0x01ff, B:87:0x0205, B:89:0x020b, B:91:0x0211, B:93:0x0217, B:95:0x0232, B:98:0x023b, B:100:0x0242, B:102:0x0249, B:107:0x0255, B:109:0x025d, B:110:0x025f, B:111:0x027f, B:113:0x028e, B:115:0x0294), top: B:140:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0232 A[Catch: Exception -> 0x02a4, TryCatch #5 {Exception -> 0x02a4, blocks: (B:73:0x01df, B:75:0x01e3, B:77:0x01e9, B:81:0x01f3, B:83:0x01f9, B:85:0x01ff, B:87:0x0205, B:89:0x020b, B:91:0x0211, B:93:0x0217, B:95:0x0232, B:98:0x023b, B:100:0x0242, B:102:0x0249, B:107:0x0255, B:109:0x025d, B:110:0x025f, B:111:0x027f, B:113:0x028e, B:115:0x0294), top: B:140:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023b A[Catch: Exception -> 0x02a4, TryCatch #5 {Exception -> 0x02a4, blocks: (B:73:0x01df, B:75:0x01e3, B:77:0x01e9, B:81:0x01f3, B:83:0x01f9, B:85:0x01ff, B:87:0x0205, B:89:0x020b, B:91:0x0211, B:93:0x0217, B:95:0x0232, B:98:0x023b, B:100:0x0242, B:102:0x0249, B:107:0x0255, B:109:0x025d, B:110:0x025f, B:111:0x027f, B:113:0x028e, B:115:0x0294), top: B:140:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C105071 c105071;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String username;
        SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1;
        AuthEnvironment authEnvironment2;
        String str;
        kg3 cognitoIdentityProviderClient;
        String str2;
        AuthEnvironment authEnvironment3;
        yrf yrfVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 signUpCognitoActions$initiateSignUpAction$$inlined$invoke$12;
        SignUpEvent signUpEvent;
        String strM59325c;
        ze3 ze3VarM58141a;
        ze3 ze3VarM58141a2;
        xl5 xl5VarM59324b;
        ze3 ze3VarM58141a3;
        if (n64Var instanceof C105071) {
            c105071 = (C105071) n64Var;
            int i = c105071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105071.label = i - Integer.MIN_VALUE;
            } else {
                c105071 = new C105071(n64Var);
            }
        }
        Object objH2 = c105071.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105071.label;
        if (i2 == 0) {
            wre.m54934b(objH2);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
            authEnvironment4.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$event$inlined.getSignUpData().getUsername();
                c105071.L$0 = this;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            }
            try {
                c105071.L$1 = eventDispatcher2;
                c105071.L$2 = id;
                c105071.L$3 = authEnvironment4;
                c105071.L$4 = username;
                c105071.label = 1;
                Object userContextData = authEnvironment4.getUserContextData(username, c105071);
                if (userContextData == objM51918f) {
                    return objM51918f;
                }
                signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 = this;
                authEnvironment2 = authEnvironment4;
                objH2 = userContextData;
                str = id;
                String str3 = (String) objH2;
                String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                }
            } catch (Exception e2) {
                e = e2;
                authEnvironment = authEnvironment4;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3 = authEnvironment;
                str = id;
                authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
        } else if (i2 == 1) {
            username = (String) c105071.L$4;
            authEnvironment2 = (AuthEnvironment) c105071.L$3;
            String str4 = (String) c105071.L$2;
            EventDispatcher eventDispatcher3 = (EventDispatcher) c105071.L$1;
            signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 = (SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1) c105071.L$0;
            try {
                wre.m54934b(objH2);
                str = str4;
                eventDispatcher2 = eventDispatcher3;
            } catch (Exception e3) {
                e = e3;
                authEnvironment = authEnvironment2;
                id = str4;
                eventDispatcher2 = eventDispatcher3;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3 = authEnvironment;
                str = id;
                authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
            try {
                String str32 = (String) objH2;
                String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                    xrf.C18230a c18230a = new xrf.C18230a();
                    c18230a.m56726q(username);
                    c18230a.m56723n(signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getPassword());
                    List<AuthUserAttribute> userAttributes = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getUserAttributes();
                    if (userAttributes != null) {
                        arrayList = new ArrayList(dh3.m23088v(userAttributes, 10));
                        Iterator<T> it = userAttributes.iterator();
                        while (it.hasNext()) {
                            arrayList.add(lx0.f34484c.m38093a(new SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$1$1((AuthUserAttribute) it.next())));
                        }
                    } else {
                        arrayList = null;
                    }
                    c18230a.m56725p(arrayList);
                    UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                    c18230a.m56721l(userPool != null ? userPool.getAppClient() : null);
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    UserPoolConfiguration userPool2 = authEnvironment2.getConfiguration().getUserPool();
                    String appClient = userPool2 != null ? userPool2.getAppClient() : null;
                    UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                    c18230a.m56724o(companion.getSecretHash(username, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
                    if (pinpointEndpointId2 != null) {
                        c18230a.m56720k(hc0.f26603b.m30167a(new SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$2$1(pinpointEndpointId2)));
                    }
                    if (str32 != null) {
                        c18230a.m56728s(new SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$3$1(str32));
                    }
                    c18230a.m56722m(signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getClientMetadata());
                    Map<String, String> validationData = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getValidationData();
                    if (validationData != null) {
                        arrayList2 = new ArrayList();
                        Iterator<Map.Entry<String, String>> it2 = validationData.entrySet().iterator();
                        while (it2.hasNext()) {
                            lx0 lx0VarM38093a = lx0.f34484c.m38093a(new SignUpCognitoActions$initiateSignUpAction$1$evt$response$1$4$1(it2.next()));
                            if (lx0VarM38093a != null) {
                                arrayList2.add(lx0VarM38093a);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    c18230a.m56727r(arrayList2);
                    xrf xrfVarM56710a = c18230a.m56710a();
                    c105071.L$0 = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1;
                    c105071.L$1 = eventDispatcher2;
                    c105071.L$2 = str;
                    c105071.L$3 = authEnvironment2;
                    c105071.L$4 = username;
                    c105071.label = 2;
                    objH2 = cognitoIdentityProviderClient.h2(xrfVarM56710a, c105071);
                    if (objH2 == objM51918f) {
                        return objM51918f;
                    }
                    authEnvironment = authEnvironment2;
                    id = str;
                    signUpCognitoActions$initiateSignUpAction$$inlined$invoke$12 = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1;
                    yrfVar = (yrf) objH2;
                    signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$12;
                    authEnvironment3 = authEnvironment;
                    str = id;
                    str2 = username;
                    if (yrfVar == null) {
                        strM59325c = "";
                        if (yrfVar != null) {
                            if (yrfVar != null) {
                                AuthCodeDeliveryDetails authCodeDeliveryDetails = new AuthCodeDeliveryDetails(strM59325c, AuthCodeDeliveryDetails.DeliveryMedium.fromString((yrfVar != null || (ze3VarM58141a2 = yrfVar.m58141a()) == null || (xl5VarM59324b = ze3VarM58141a2.m59324b()) == null) ? null : xl5VarM59324b.mo56446a()), (yrfVar != null || (ze3VarM58141a = yrfVar.m58141a()) == null) ? null : ze3VarM58141a.m59323a());
                                SignUpData signUpData = new SignUpData(str2, signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getValidationData(), signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getClientMetadata(), yrfVar == null ? yrfVar.m58142b() : null, yrfVar == null ? yrfVar.m58144d() : null);
                                if (yrfVar == null) {
                                    if (yrfVar == null && yrfVar.m58143c()) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str2 = username;
                    authEnvironment3 = authEnvironment2;
                    yrfVar = null;
                    if (yrfVar == null) {
                    }
                }
            } catch (Exception e4) {
                e = e4;
                authEnvironment = authEnvironment2;
                id = str;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3 = authEnvironment;
                str = id;
                authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            username = (String) c105071.L$4;
            authEnvironment = (AuthEnvironment) c105071.L$3;
            id = (String) c105071.L$2;
            eventDispatcher2 = (EventDispatcher) c105071.L$1;
            signUpCognitoActions$initiateSignUpAction$$inlined$invoke$12 = (SignUpCognitoActions$initiateSignUpAction$$inlined$invoke$1) c105071.L$0;
            try {
                wre.m54934b(objH2);
                yrfVar = (yrf) objH2;
                signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1 = signUpCognitoActions$initiateSignUpAction$$inlined$invoke$12;
                authEnvironment3 = authEnvironment;
                str = id;
                str2 = username;
            } catch (Exception e5) {
                e = e5;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3 = authEnvironment;
                str = id;
                authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
            try {
                if (yrfVar == null || (ze3VarM58141a3 = yrfVar.m58141a()) == null || (strM59325c = ze3VarM58141a3.m59325c()) == null) {
                    strM59325c = "";
                }
                AuthCodeDeliveryDetails authCodeDeliveryDetails2 = new AuthCodeDeliveryDetails(strM59325c, AuthCodeDeliveryDetails.DeliveryMedium.fromString((yrfVar != null || (ze3VarM58141a2 = yrfVar.m58141a()) == null || (xl5VarM59324b = ze3VarM58141a2.m59324b()) == null) ? null : xl5VarM59324b.mo56446a()), (yrfVar != null || (ze3VarM58141a = yrfVar.m58141a()) == null) ? null : ze3VarM58141a.m59323a());
                SignUpData signUpData2 = new SignUpData(str2, signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getValidationData(), signUpCognitoActions$initiateSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getClientMetadata(), yrfVar == null ? yrfVar.m58142b() : null, yrfVar == null ? yrfVar.m58144d() : null);
                if (yrfVar == null && yrfVar.m58143c()) {
                    signUpEvent = new SignUpEvent(new SignUpEvent.EventType.InitiateSignUpComplete(signUpData2, new AuthSignUpResult(false, new AuthNextSignUpStep(AuthSignUpStep.CONFIRM_SIGN_UP_STEP, isa.m32681h(), authCodeDeliveryDetails2), yrfVar != null ? yrfVar.m58144d() : null)), null, 2, null);
                } else {
                    AuthSignUpStep authSignUpStep = AuthSignUpStep.DONE;
                    if (yrfVar.m58142b() != null) {
                        authSignUpStep = AuthSignUpStep.COMPLETE_AUTO_SIGN_IN;
                    }
                    signUpEvent = new SignUpEvent(new SignUpEvent.EventType.SignedUp(signUpData2, new AuthSignUpResult(true, new AuthNextSignUpStep(authSignUpStep, isa.m32681h(), authCodeDeliveryDetails2), yrfVar.m58144d())), null, 2, null);
                }
            } catch (Exception e6) {
                e = e6;
                authEnvironment = authEnvironment3;
                id = str;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3 = authEnvironment;
                str = id;
                authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment3.getLogger().verbose(str + " Sending event " + signUpEvent.getType());
        eventDispatcher2.send(signUpEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
