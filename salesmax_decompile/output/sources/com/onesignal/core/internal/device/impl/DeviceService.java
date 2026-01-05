package com.onesignal.core.internal.device.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
import java.lang.reflect.InvocationTargetException;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DeviceService implements IDeviceService {
    public static final Companion Companion = new Companion(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final IApplicationService _applicationService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public DeviceService(IApplicationService iApplicationService) {
        sq8.m48649h(iApplicationService, "_applicationService");
        this._applicationService = iApplicationService;
    }

    private final boolean hasHMSAGConnectLibrary() throws ClassNotFoundException {
        try {
            Class.forName("com.huawei.agconnect.config.AGConnectServicesConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSAvailabilityLibrary() throws ClassNotFoundException {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSPushKitLibrary() throws ClassNotFoundException {
        try {
            Class.forName("com.huawei.hms.aaid.HmsInstanceId");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabled() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object objInvoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this._applicationService.getAppContext());
            sq8.m48647f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    private final boolean packageInstalledAndEnabled(String str) {
        try {
            return this._applicationService.getAppContext().getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final boolean supportsADM() throws ClassNotFoundException {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public IDeviceService.DeviceType getDeviceType() {
        if (supportsADM()) {
            return IDeviceService.DeviceType.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean zSupportsGooglePush = supportsGooglePush();
        if (zSupportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? IDeviceService.DeviceType.Huawei : IDeviceService.DeviceType.Android;
        }
        return zSupportsGooglePush ? IDeviceService.DeviceType.Android : supportsHMS ? IDeviceService.DeviceType.Huawei : isGMSInstalledAndEnabled() ? IDeviceService.DeviceType.Android : isHMSCoreInstalledAndEnabledFallback() ? IDeviceService.DeviceType.Huawei : IDeviceService.DeviceType.Android;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean getHasFCMLibrary() {
        try {
            String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public IDeviceService.JetpackLibraryStatus getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? IDeviceService.JetpackLibraryStatus.MISSING : IDeviceService.JetpackLibraryStatus.OK;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean isAndroidDeviceType() {
        return getDeviceType() == IDeviceService.DeviceType.Android;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean isFireOSDeviceType() {
        return getDeviceType() == IDeviceService.DeviceType.Fire;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled("com.google.android.gms");
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == IDeviceService.DeviceType.Huawei;
    }

    @Override // com.onesignal.core.internal.device.IDeviceService
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
