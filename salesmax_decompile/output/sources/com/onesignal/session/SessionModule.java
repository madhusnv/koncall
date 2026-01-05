package com.onesignal.session;

import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.session.internal.SessionManager;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.influence.impl.InfluenceManager;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.outcomes.impl.IOutcomeEventsBackendService;
import com.onesignal.session.internal.outcomes.impl.IOutcomeEventsPreferences;
import com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsBackendService;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsController;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsPreferences;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.session.internal.session.SessionModelStore;
import com.onesignal.session.internal.session.impl.SessionListener;
import com.onesignal.session.internal.session.impl.SessionService;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class SessionModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder serviceBuilder) {
        sq8.m48649h(serviceBuilder, "builder");
        serviceBuilder.register(OutcomeEventsPreferences.class).provides(IOutcomeEventsPreferences.class);
        serviceBuilder.register(OutcomeEventsRepository.class).provides(IOutcomeEventsRepository.class);
        serviceBuilder.register(OutcomeEventsBackendService.class).provides(IOutcomeEventsBackendService.class);
        serviceBuilder.register(OutcomeEventsController.class).provides(IOutcomeEventsController.class).provides(IStartableService.class);
        serviceBuilder.register(InfluenceManager.class).provides(IInfluenceManager.class);
        serviceBuilder.register(SessionModelStore.class).provides(SessionModelStore.class);
        serviceBuilder.register(SessionService.class).provides(ISessionService.class).provides(IStartableService.class).provides(IBackgroundService.class).provides(IBootstrapService.class);
        serviceBuilder.register(SessionListener.class).provides(IStartableService.class);
        serviceBuilder.register(SessionManager.class).provides(ISessionManager.class);
    }
}
