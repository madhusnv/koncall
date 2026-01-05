package com.onesignal.session.internal.session.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.session.internal.session.SessionModel;
import com.onesignal.session.internal.session.SessionModelStore;
import java.util.UUID;
import p001o.kf9;
import p001o.n64;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SessionService implements ISessionService, IBootstrapService, IStartableService, IBackgroundService, IApplicationLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final SessionModelStore _sessionModelStore;
    private final ITime _time;
    private ConfigModel config;
    private boolean hasFocused;
    private SessionModel session;
    private final EventProducer<ISessionLifecycleHandler> sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    /* renamed from: com.onesignal.session.internal.session.impl.SessionService$endSession$1 */
    public static final class C118481 extends kf9 implements xk7 {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118481(long j) {
            super(1);
            this.$activeDuration = j;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISessionLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISessionLifecycleHandler iSessionLifecycleHandler) {
            sq8.m48649h(iSessionLifecycleHandler, "it");
            iSessionLifecycleHandler.onSessionEnded(this.$activeDuration);
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.SessionService$onFocus$1 */
    public static final class C118491 extends kf9 implements xk7 {
        public static final C118491 INSTANCE = new C118491();

        public C118491() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISessionLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISessionLifecycleHandler iSessionLifecycleHandler) {
            sq8.m48649h(iSessionLifecycleHandler, "it");
            iSessionLifecycleHandler.onSessionStarted();
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.SessionService$onFocus$2 */
    public static final class C118502 extends kf9 implements xk7 {
        public static final C118502 INSTANCE = new C118502();

        public C118502() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISessionLifecycleHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISessionLifecycleHandler iSessionLifecycleHandler) {
            sq8.m48649h(iSessionLifecycleHandler, "it");
            iSessionLifecycleHandler.onSessionActive();
        }
    }

    public SessionService(IApplicationService iApplicationService, ConfigModelStore configModelStore, SessionModelStore sessionModelStore, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(sessionModelStore, "_sessionModelStore");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._configModelStore = configModelStore;
        this._sessionModelStore = sessionModelStore;
        this._time = iTime;
        this.sessionLifeCycleNotifier = new EventProducer<>();
    }

    private final void endSession() {
        SessionModel sessionModel = this.session;
        sq8.m48646e(sessionModel);
        if (sessionModel.isValid()) {
            SessionModel sessionModel2 = this.session;
            sq8.m48646e(sessionModel2);
            long activeDuration = sessionModel2.getActiveDuration();
            Logging.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            SessionModel sessionModel3 = this.session;
            sq8.m48646e(sessionModel3);
            sessionModel3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new C118481(activeDuration));
            SessionModel sessionModel4 = this.session;
            sq8.m48646e(sessionModel4);
            sessionModel4.setActiveDuration(0L);
        }
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Object backgroundRun(n64 n64Var) {
        endSession();
        return y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this.session = this._sessionModelStore.getModel();
        this.config = this._configModelStore.getModel();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Long getScheduleBackgroundRunIn() {
        SessionModel sessionModel = this.session;
        sq8.m48646e(sessionModel);
        if (!sessionModel.isValid()) {
            return null;
        }
        ConfigModel configModel = this.config;
        sq8.m48646e(configModel);
        return Long.valueOf(configModel.getSessionFocusTimeout());
    }

    @Override // com.onesignal.session.internal.session.ISessionService
    public long getStartTime() {
        SessionModel sessionModel = this.session;
        sq8.m48646e(sessionModel);
        return sessionModel.getStartTime();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        Logging.log(LogLevel.DEBUG, "SessionService.onFocus() - fired from start: " + z);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        SessionModel sessionModel = this.session;
        sq8.m48646e(sessionModel);
        if (sessionModel.isValid()) {
            SessionModel sessionModel2 = this.session;
            sq8.m48646e(sessionModel2);
            sessionModel2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(C118502.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z;
        SessionModel sessionModel3 = this.session;
        sq8.m48646e(sessionModel3);
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "randomUUID().toString()");
        sessionModel3.setSessionId(string);
        SessionModel sessionModel4 = this.session;
        sq8.m48646e(sessionModel4);
        sessionModel4.setStartTime(this._time.getCurrentTimeMillis());
        SessionModel sessionModel5 = this.session;
        sq8.m48646e(sessionModel5);
        SessionModel sessionModel6 = this.session;
        sq8.m48646e(sessionModel6);
        sessionModel5.setFocusTime(sessionModel6.getStartTime());
        SessionModel sessionModel7 = this.session;
        sq8.m48646e(sessionModel7);
        sessionModel7.setValid(true);
        StringBuilder sb = new StringBuilder();
        sb.append("SessionService: New session started at ");
        SessionModel sessionModel8 = this.session;
        sq8.m48646e(sessionModel8);
        sb.append(sessionModel8.getStartTime());
        Logging.debug$default(sb.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C118491.INSTANCE);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        SessionModel sessionModel = this.session;
        sq8.m48646e(sessionModel);
        long focusTime = currentTimeMillis - sessionModel.getFocusTime();
        SessionModel sessionModel2 = this.session;
        sq8.m48646e(sessionModel2);
        sessionModel2.setActiveDuration(sessionModel2.getActiveDuration() + focusTime);
        LogLevel logLevel = LogLevel.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("SessionService.onUnfocused adding time ");
        sb.append(focusTime);
        sb.append(" for total: ");
        SessionModel sessionModel3 = this.session;
        sq8.m48646e(sessionModel3);
        sb.append(sessionModel3.getActiveDuration());
        Logging.log(logLevel, sb.toString());
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISessionLifecycleHandler iSessionLifecycleHandler) {
        sq8.m48649h(iSessionLifecycleHandler, "handler");
        this.sessionLifeCycleNotifier.subscribe(iSessionLifecycleHandler);
        if (this.shouldFireOnSubscribe) {
            iSessionLifecycleHandler.onSessionStarted();
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISessionLifecycleHandler iSessionLifecycleHandler) {
        sq8.m48649h(iSessionLifecycleHandler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(iSessionLifecycleHandler);
    }
}
