package com.onesignal.user.internal.service;

import com.onesignal.common.IDManager;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class UserRefreshService implements IStartableService, ISessionLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private final ISessionService _sessionService;

    public UserRefreshService(IApplicationService iApplicationService, ISessionService iSessionService, IOperationRepo iOperationRepo, ConfigModelStore configModelStore, IdentityModelStore identityModelStore) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iSessionService, "_sessionService");
        sq8.m48649h(iOperationRepo, "_operationRepo");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        this._applicationService = iApplicationService;
        this._sessionService = iSessionService;
        this._operationRepo = iOperationRepo;
        this._configModelStore = configModelStore;
        this._identityModelStore = identityModelStore;
    }

    private final void refreshUser() {
        if (IDManager.INSTANCE.isLocalId(this._identityModelStore.getModel().getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new RefreshUserOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId()), false, 2, null);
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._sessionService.subscribe(this);
    }
}
