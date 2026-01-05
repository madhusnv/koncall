package com.onesignal.session.internal;

import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class SessionManager implements ISessionManager {
    private final IOutcomeEventsController _outcomeController;

    @l75(m36647c = "com.onesignal.session.internal.SessionManager$addOutcome$1", m36648f = "SessionManager.kt", m36649l = {16}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.SessionManager$addOutcome$1 */
    public static final class C118261 extends jgg implements xk7 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118261(String str, n64 n64Var) {
            super(1, n64Var);
            this.$name = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SessionManager.this.new C118261(this.$name, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOutcomeEventsController iOutcomeEventsController = SessionManager.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (iOutcomeEventsController.sendOutcomeEvent(str, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C118261) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.SessionManager$addOutcomeWithValue$1", m36648f = "SessionManager.kt", m36649l = {35}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.SessionManager$addOutcomeWithValue$1 */
    public static final class C118271 extends jgg implements xk7 {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118271(String str, float f, n64 n64Var) {
            super(1, n64Var);
            this.$name = str;
            this.$value = f;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SessionManager.this.new C118271(this.$name, this.$value, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOutcomeEventsController iOutcomeEventsController = SessionManager.this._outcomeController;
                String str = this.$name;
                float f = this.$value;
                this.label = 1;
                if (iOutcomeEventsController.sendOutcomeEventWithValue(str, f, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C118271) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.SessionManager$addUniqueOutcome$1", m36648f = "SessionManager.kt", m36649l = {24}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.SessionManager$addUniqueOutcome$1 */
    public static final class C118281 extends jgg implements xk7 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118281(String str, n64 n64Var) {
            super(1, n64Var);
            this.$name = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SessionManager.this.new C118281(this.$name, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOutcomeEventsController iOutcomeEventsController = SessionManager.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (iOutcomeEventsController.sendUniqueOutcomeEvent(str, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C118281) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public SessionManager(IOutcomeEventsController iOutcomeEventsController) {
        sq8.m48649h(iOutcomeEventsController, "_outcomeController");
        this._outcomeController = iOutcomeEventsController;
    }

    @Override // com.onesignal.session.ISessionManager
    public void addOutcome(String str) {
        sq8.m48649h(str, "name");
        Logging.log(LogLevel.DEBUG, "sendOutcome(name: " + str + ')');
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118261(str, null), 1, null);
    }

    @Override // com.onesignal.session.ISessionManager
    public void addOutcomeWithValue(String str, float f) {
        sq8.m48649h(str, "name");
        Logging.log(LogLevel.DEBUG, "sendOutcomeWithValue(name: " + str + ", value: " + f + ')');
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118271(str, f, null), 1, null);
    }

    @Override // com.onesignal.session.ISessionManager
    public void addUniqueOutcome(String str) {
        sq8.m48649h(str, "name");
        Logging.log(LogLevel.DEBUG, "sendUniqueOutcome(name: " + str + ')');
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118281(str, null), 1, null);
    }
}
