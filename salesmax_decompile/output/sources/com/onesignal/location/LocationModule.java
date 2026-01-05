package com.onesignal.location;

import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.location.internal.LocationManager;
import com.onesignal.location.internal.background.LocationBackgroundService;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.capture.impl.LocationCapturer;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.impl.FusedLocationApiWrapperImpl;
import com.onesignal.location.internal.controller.impl.GmsLocationController;
import com.onesignal.location.internal.controller.impl.HmsLocationController;
import com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper;
import com.onesignal.location.internal.controller.impl.NullLocationController;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import com.onesignal.location.internal.preferences.impl.LocationPreferencesService;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes6.dex */
public final class LocationModule implements IModule {

    /* renamed from: com.onesignal.location.LocationModule$register$1 */
    public static final class C117041 extends kf9 implements xk7 {
        public static final C117041 INSTANCE = new C117041();

        public C117041() {
            super(1);
        }

        @Override // p001o.xk7
        public final ILocationController invoke(IServiceProvider iServiceProvider) {
            sq8.m48649h(iServiceProvider, "it");
            IDeviceService iDeviceService = (IDeviceService) iServiceProvider.getService(IDeviceService.class);
            return (iDeviceService.isAndroidDeviceType() && LocationUtils.INSTANCE.hasGMSLocationLibrary()) ? new GmsLocationController((IApplicationService) iServiceProvider.getService(IApplicationService.class), (IFusedLocationApiWrapper) iServiceProvider.getService(IFusedLocationApiWrapper.class)) : (iDeviceService.isHuaweiDeviceType() && LocationUtils.INSTANCE.hasHMSLocationLibrary()) ? new HmsLocationController((IApplicationService) iServiceProvider.getService(IApplicationService.class)) : new NullLocationController();
        }
    }

    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder serviceBuilder) {
        sq8.m48649h(serviceBuilder, "builder");
        serviceBuilder.register(LocationPermissionController.class).provides(LocationPermissionController.class).provides(IStartableService.class);
        serviceBuilder.register(FusedLocationApiWrapperImpl.class).provides(IFusedLocationApiWrapper.class);
        serviceBuilder.register((xk7) C117041.INSTANCE).provides(ILocationController.class);
        serviceBuilder.register(LocationPreferencesService.class).provides(ILocationPreferencesService.class);
        serviceBuilder.register(LocationCapturer.class).provides(ILocationCapturer.class);
        serviceBuilder.register(LocationBackgroundService.class).provides(IBackgroundService.class);
        serviceBuilder.register(LocationManager.class).provides(ILocationManager.class).provides(IStartableService.class);
    }
}
