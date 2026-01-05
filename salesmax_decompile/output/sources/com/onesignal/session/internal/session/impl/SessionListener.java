package com.onesignal.session.internal.session.impl;

import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.TrackSessionEndOperation;
import com.onesignal.user.internal.operations.TrackSessionStartOperation;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SessionListener implements IStartableService, ISessionLifecycleHandler {
    public static final Companion Companion = new Companion(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private final IOutcomeEventsController _outcomeEventsController;
    private final ISessionService _sessionService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.session.impl.SessionListener$onSessionEnded$1", m36648f = "SessionListener.kt", m36649l = {62}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.session.impl.SessionListener$onSessionEnded$1 */
    public static final class C118471 extends jgg implements xk7 {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118471(long j, n64 n64Var) {
            super(1, n64Var);
            this.$durationInSeconds = j;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SessionListener.this.new C118471(this.$durationInSeconds, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                IOutcomeEventsController iOutcomeEventsController = SessionListener.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (iOutcomeEventsController.sendSessionEndOutcomeEvent(j, this) == objM51918f) {
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
            return ((C118471) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public SessionListener(IOperationRepo iOperationRepo, ISessionService iSessionService, ConfigModelStore configModelStore, IdentityModelStore identityModelStore, IOutcomeEventsController iOutcomeEventsController) {
        sq8.m48649h(iOperationRepo, "_operationRepo");
        sq8.m48649h(iSessionService, "_sessionService");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(iOutcomeEventsController, "_outcomeEventsController");
        this._operationRepo = iOperationRepo;
        this._sessionService = iSessionService;
        this._configModelStore = configModelStore;
        this._identityModelStore = identityModelStore;
        this._outcomeEventsController = iOutcomeEventsController;
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j) {
        long j2 = j / 1000;
        if (j2 < 1 || j2 > SECONDS_IN_A_DAY) {
            Logging.error$default("SessionListener.onSessionEnded sending duration of " + j2 + " seconds", null, 2, null);
        }
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new TrackSessionEndOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), j2), false, 2, null);
        ThreadUtilsKt.suspendifyOnThread$default(0, new C118471(j2, null), 1, null);
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        this._operationRepo.enqueue(new TrackSessionStartOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._sessionService.subscribe(this);
    }
}
