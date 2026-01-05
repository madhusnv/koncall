package com.onesignal.user.internal.backend;

import com.onesignal.core.internal.device.IDeviceService;
import p001o.e9g;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes6.dex */
public enum SubscriptionObjectType {
    IOS_PUSH("iOSPush"),
    ANDROID_PUSH("AndroidPush"),
    FIREOS_PUSH("FireOSPush"),
    CHROME_EXTENSION("ChromeExtensionPush"),
    CHROME_PUSH("ChromePush"),
    WINDOWS_PUSH("WindowsPush"),
    SAFARI_PUSH("SafariPush"),
    SAFARI_PUSH_LEGACY("SafariLegacyPush"),
    FIREFOX_PUSH("FirefoxPush"),
    MACOS_PUSH("macOSPush"),
    EMAIL("Email"),
    HUAWEI_PUSH("HuaweiPush"),
    SMS("SMS");

    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IDeviceService.DeviceType.values().length];
                iArr[IDeviceService.DeviceType.Android.ordinal()] = 1;
                iArr[IDeviceService.DeviceType.Fire.ordinal()] = 2;
                iArr[IDeviceService.DeviceType.Huawei.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final SubscriptionObjectType fromDeviceType(IDeviceService.DeviceType deviceType) {
            sq8.m48649h(deviceType, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
            if (i == 1) {
                return SubscriptionObjectType.ANDROID_PUSH;
            }
            if (i == 2) {
                return SubscriptionObjectType.FIREOS_PUSH;
            }
            if (i == 3) {
                return SubscriptionObjectType.HUAWEI_PUSH;
            }
            throw new szb();
        }

        public final SubscriptionObjectType fromString(String str) {
            sq8.m48649h(str, "type");
            for (SubscriptionObjectType subscriptionObjectType : SubscriptionObjectType.values()) {
                if (e9g.m24606x(subscriptionObjectType.getValue(), str, true)) {
                    return subscriptionObjectType;
                }
            }
            return null;
        }
    }

    SubscriptionObjectType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
