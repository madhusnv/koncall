package com.onesignal.core;

import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.impl.ParamsBackendService;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.core.internal.background.impl.BackgroundManager;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.ConfigModelStoreListener;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.DatabaseProvider;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.device.impl.DeviceService;
import com.onesignal.core.internal.device.impl.InstallIdService;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.HttpClient;
import com.onesignal.core.internal.http.impl.HttpConnectionFactory;
import com.onesignal.core.internal.http.impl.IHttpConnectionFactory;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.language.impl.LanguageContext;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.impl.OperationModelStore;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.permissions.impl.RequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.impl.PreferencesService;
import com.onesignal.core.internal.purchases.impl.TrackAmazonPurchase;
import com.onesignal.core.internal.purchases.impl.TrackGooglePurchase;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.core.internal.time.impl.Time;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.internal.MisconfiguredIAMManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.MisconfiguredLocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.internal.MisconfiguredNotificationsManager;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class CoreModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder serviceBuilder) {
        sq8.m48649h(serviceBuilder, "builder");
        serviceBuilder.register(PreferencesService.class).provides(IPreferencesService.class).provides(IStartableService.class);
        serviceBuilder.register(HttpConnectionFactory.class).provides(IHttpConnectionFactory.class);
        serviceBuilder.register(HttpClient.class).provides(IHttpClient.class);
        serviceBuilder.register(ApplicationService.class).provides(IApplicationService.class);
        serviceBuilder.register(DeviceService.class).provides(IDeviceService.class);
        serviceBuilder.register(Time.class).provides(ITime.class);
        serviceBuilder.register(DatabaseProvider.class).provides(IDatabaseProvider.class);
        serviceBuilder.register(InstallIdService.class).provides(IInstallIdService.class);
        serviceBuilder.register(ConfigModelStore.class).provides(ConfigModelStore.class);
        serviceBuilder.register(ParamsBackendService.class).provides(IParamsBackendService.class);
        serviceBuilder.register(ConfigModelStoreListener.class).provides(IStartableService.class);
        serviceBuilder.register(OperationModelStore.class).provides(OperationModelStore.class);
        serviceBuilder.register(OperationRepo.class).provides(IOperationRepo.class).provides(IStartableService.class);
        serviceBuilder.register(RequestPermissionService.class).provides(RequestPermissionService.class).provides(IRequestPermissionService.class);
        serviceBuilder.register(LanguageContext.class).provides(ILanguageContext.class);
        serviceBuilder.register(BackgroundManager.class).provides(IBackgroundManager.class).provides(IStartableService.class);
        serviceBuilder.register(TrackAmazonPurchase.class).provides(IStartableService.class);
        serviceBuilder.register(TrackGooglePurchase.class).provides(IStartableService.class);
        serviceBuilder.register(MisconfiguredNotificationsManager.class).provides(INotificationsManager.class);
        serviceBuilder.register(MisconfiguredIAMManager.class).provides(IInAppMessagesManager.class);
        serviceBuilder.register(MisconfiguredLocationManager.class).provides(ILocationManager.class);
    }
}
