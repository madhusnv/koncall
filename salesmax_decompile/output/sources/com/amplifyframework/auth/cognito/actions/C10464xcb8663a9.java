package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import org.objectweb.asm.TypeReference;
import p001o.bp7;
import p001o.cg3;
import p001o.cp7;
import p001o.gk8;
import p001o.hc4;
import p001o.l0c;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10464xcb8663a9 implements Action {
    final /* synthetic */ String $identityId$inlined;
    final /* synthetic */ LoginsMapProvider $loginsMap$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1", m36648f = "FetchAuthSessionCognitoActions.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10464xcb8663a9.this.execute(null, null, this);
        }
    }

    public C10464xcb8663a9(String str, String str2, LoginsMapProvider loginsMapProvider) {
        this.$identityId$inlined = str2;
        this.$loginsMap$inlined = loginsMapProvider;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[Catch: Exception -> 0x0043, l0c -> 0x0046, TryCatch #4 {l0c -> 0x0046, Exception -> 0x0043, blocks: (B:12:0x003f, B:29:0x00a9, B:36:0x00b8, B:38:0x00be, B:40:0x00d2, B:42:0x00dc, B:43:0x00ec, B:44:0x00f3), top: B:59:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws Exception {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher3;
        l0c l0cVar;
        C10464xcb8663a9 c10464xcb8663a9;
        cp7 cp7Var;
        StateMachineEvent authorizationEvent;
        hc4 hc4VarM21565a;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object obj = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            try {
                bp7 bp7VarM19546a = bp7.f16661d.m19546a(new C10470xf6b5d4f(this.$identityId$inlined, this.$loginsMap$inlined));
                cg3 cognitoIdentityClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityClient();
                if (cognitoIdentityClient == null) {
                    c10464xcb8663a9 = this;
                    authEnvironment = authEnvironment2;
                    cp7Var = null;
                    eventDispatcher3 = eventDispatcher;
                    if (cp7Var != null) {
                    }
                    throw new Exception("Fetching AWS credentials failed.");
                }
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment2;
                    anonymousClass1.label = 1;
                    Object objV2 = cognitoIdentityClient.V2(bp7VarM19546a, anonymousClass1);
                    if (objV2 == objM51918f) {
                        return objM51918f;
                    }
                    authEnvironment = authEnvironment2;
                    eventDispatcher3 = eventDispatcher2;
                    obj = objV2;
                    c10464xcb8663a9 = this;
                    cp7Var = (cp7) obj;
                    if (cp7Var != null) {
                    }
                    throw new Exception("Fetching AWS credentials failed.");
                } catch (l0c e) {
                    e = e;
                    l0cVar = e;
                    authEnvironment = authEnvironment2;
                    eventDispatcher3 = eventDispatcher2;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar, 1, null)), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                    eventDispatcher3.send(authorizationEvent);
                    return y3i.f54824a;
                } catch (Exception e2) {
                    e = e2;
                    authEnvironment = authEnvironment2;
                    eventDispatcher3 = eventDispatcher2;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                    eventDispatcher3.send(authorizationEvent);
                    return y3i.f54824a;
                }
            } catch (l0c e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            c10464xcb8663a9 = (C10464xcb8663a9) anonymousClass1.L$0;
            try {
                wre.m54934b(obj);
                cp7Var = (cp7) obj;
                if (cp7Var != null || (hc4VarM21565a = cp7Var.m21565a()) == null) {
                    throw new Exception("Fetching AWS credentials failed.");
                }
                String strM30202a = hc4VarM21565a.m30202a();
                String strM30204c = hc4VarM21565a.m30204c();
                String strM30205d = hc4VarM21565a.m30205d();
                gk8 gk8VarM30203b = hc4VarM21565a.m30203b();
                authorizationEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.Fetched(c10464xcb8663a9.$identityId$inlined, new AWSCredentials(strM30202a, strM30204c, strM30205d, gk8VarM30203b != null ? ml1.m39305e(gk8VarM30203b.m28952e()) : null)), null, 2, null);
            } catch (l0c e5) {
                l0cVar = e5;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar, 1, null)), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher3.send(authorizationEvent);
                return y3i.f54824a;
            } catch (Exception e6) {
                e = e6;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher3.send(authorizationEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
        eventDispatcher3.send(authorizationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
