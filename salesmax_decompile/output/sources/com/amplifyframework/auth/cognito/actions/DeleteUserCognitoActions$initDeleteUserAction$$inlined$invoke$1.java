package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import java.util.Date;
import org.objectweb.asm.TypeReference;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.ol5;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xhi;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ String $accessToken$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1", m36648f = "DeleteUserCognitoActions.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1$1 */
    public static final class C104551 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C104551(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1(String str, String str2) {
        this.$accessToken$inlined = str2;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104551 c104551;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String str;
        Exception e;
        kg3 cognitoIdentityProviderClient;
        if (n64Var instanceof C104551) {
            c104551 = (C104551) n64Var;
            int i = c104551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104551.label = i - Integer.MIN_VALUE;
            } else {
                c104551 = new C104551(n64Var);
            }
        }
        Object obj = c104551.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104551.label;
        int i3 = 2;
        Date date = null;
        Object[] objArr = 0;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            try {
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
            } catch (Exception e2) {
                eventDispatcher2 = eventDispatcher;
                authEnvironment = authEnvironment2;
                str = id;
                e = e2;
                authEnvironment.getLogger().warn("Failed to delete user.", e);
                if (e instanceof xhi) {
                }
                return y3i.f54824a;
            }
            if (cognitoIdentityProviderClient == null) {
                eventDispatcher2 = eventDispatcher;
                authEnvironment = authEnvironment2;
                str = id;
                DeleteUserEvent deleteUserEvent = new DeleteUserEvent(new DeleteUserEvent.EventType.UserDeleted(null, 1, null), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent.getType());
                eventDispatcher2.send(deleteUserEvent);
                return y3i.f54824a;
            }
            ol5 ol5VarM42376a = ol5.f38534b.m42376a(new DeleteUserCognitoActions$initDeleteUserAction$1$1(this.$accessToken$inlined));
            c104551.L$0 = eventDispatcher;
            c104551.L$1 = id;
            c104551.L$2 = authEnvironment2;
            c104551.label = 1;
            Object objF1 = cognitoIdentityProviderClient.f1(ol5VarM42376a, c104551);
            if (objF1 == objM51918f) {
                return objM51918f;
            }
            eventDispatcher2 = eventDispatcher;
            authEnvironment = authEnvironment2;
            str = id;
            obj = objF1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) c104551.L$2;
            str = (String) c104551.L$1;
            eventDispatcher2 = (EventDispatcher) c104551.L$0;
            try {
                wre.m54934b(obj);
            } catch (Exception e3) {
                e = e3;
                authEnvironment.getLogger().warn("Failed to delete user.", e);
                if (e instanceof xhi) {
                    DeleteUserEvent deleteUserEvent2 = new DeleteUserEvent(new DeleteUserEvent.EventType.ThrowError(e, false), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent2.getType());
                    eventDispatcher2.send(deleteUserEvent2);
                    AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), date, i3, objArr == true ? 1 : 0);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher2.send(authorizationEvent);
                } else {
                    DeleteUserEvent deleteUserEvent3 = new DeleteUserEvent(new DeleteUserEvent.EventType.ThrowError(e, true), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent3.getType());
                    eventDispatcher2.send(deleteUserEvent3);
                }
                return y3i.f54824a;
            }
        }
        DeleteUserEvent deleteUserEvent4 = new DeleteUserEvent(new DeleteUserEvent.EventType.UserDeleted(null, 1, null), null, 2, null);
        authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent4.getType());
        eventDispatcher2.send(deleteUserEvent4);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
