package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.amplifyframework.statemachine.codegen.events.WebAuthnEvent;
import org.objectweb.asm.TypeReference;
import p001o.bj8;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1 */
/* loaded from: classes5.dex */
public final class C10511xb51bce42 implements Action {
    final /* synthetic */ nl7 $block$inlined;
    final /* synthetic */ WebAuthnSignInContext $context$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1", m36648f = "WebAuthnSignInCognitoActions.kt", m36649l = {TypeReference.NEW}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.WebAuthnSignInCognitoActions$safeAction$$inlined$invoke$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10511xb51bce42.this.execute(null, null, this);
        }
    }

    public C10511xb51bce42(String str, nl7 nl7Var, WebAuthnSignInContext webAuthnSignInContext) {
        this.$block$inlined = nl7Var;
        this.$context$inlined = webAuthnSignInContext;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        AnonymousClass1 anonymousClass1;
        C10511xb51bce42 c10511xb51bce42;
        StateMachineEvent webAuthnEvent;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(objInvoke);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            getId();
            AuthEnvironment authEnvironment = (AuthEnvironment) environment;
            try {
                nl7 nl7Var = this.$block$inlined;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = eventDispatcher;
                anonymousClass1.label = 1;
                bj8.m19245c(6);
                objInvoke = nl7Var.invoke(authEnvironment, anonymousClass1);
                bj8.m19245c(7);
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                c10511xb51bce42 = this;
            } catch (Exception e) {
                e = e;
                c10511xb51bce42 = this;
                webAuthnEvent = new WebAuthnEvent(new WebAuthnEvent.EventType.ThrowError(e, c10511xb51bce42.$context$inlined), null, 2, null);
                eventDispatcher.send(webAuthnEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eventDispatcher = (EventDispatcher) anonymousClass1.L$1;
            c10511xb51bce42 = (C10511xb51bce42) anonymousClass1.L$0;
            try {
                wre.m54934b(objInvoke);
            } catch (Exception e2) {
                e = e2;
                webAuthnEvent = new WebAuthnEvent(new WebAuthnEvent.EventType.ThrowError(e, c10511xb51bce42.$context$inlined), null, 2, null);
                eventDispatcher.send(webAuthnEvent);
                return y3i.f54824a;
            }
        }
        webAuthnEvent = (StateMachineEvent) objInvoke;
        eventDispatcher.send(webAuthnEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
