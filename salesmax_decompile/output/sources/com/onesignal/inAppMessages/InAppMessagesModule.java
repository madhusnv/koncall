package com.onesignal.inAppMessages;

import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.inAppMessages.internal.InAppMessagesManager;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer;
import com.onesignal.inAppMessages.internal.hydrators.InAppHydrator;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.preferences.impl.InAppPreferencesController;
import com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler;
import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController;
import com.onesignal.inAppMessages.internal.triggers.impl.TriggerController;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InAppMessagesModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder serviceBuilder) {
        sq8.m48649h(serviceBuilder, "builder");
        serviceBuilder.register(InAppStateService.class).provides(InAppStateService.class);
        serviceBuilder.register(InAppHydrator.class).provides(InAppHydrator.class);
        serviceBuilder.register(InAppPreferencesController.class).provides(IInAppPreferencesController.class);
        serviceBuilder.register(InAppRepository.class).provides(IInAppRepository.class);
        serviceBuilder.register(InAppBackendService.class).provides(IInAppBackendService.class);
        serviceBuilder.register(IAMLifecycleService.class).provides(IInAppLifecycleService.class);
        serviceBuilder.register(TriggerModelStore.class).provides(TriggerModelStore.class);
        serviceBuilder.register(TriggerController.class).provides(ITriggerController.class);
        serviceBuilder.register(DynamicTriggerController.class).provides(DynamicTriggerController.class);
        serviceBuilder.register(InAppDisplayer.class).provides(IInAppDisplayer.class);
        serviceBuilder.register(InAppMessagePreviewHandler.class).provides(IBootstrapService.class);
        serviceBuilder.register(InAppMessagePromptFactory.class).provides(IInAppMessagePromptFactory.class);
        serviceBuilder.register(InAppMessagesManager.class).provides(IInAppMessagesManager.class).provides(IStartableService.class);
    }
}
