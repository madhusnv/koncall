package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
public final class BuildDataCollector implements DataCollector {
    public static final String BOOTLOADER = "Bootloader";
    public static final String BRAND = "DeviceBrand";
    public static final String BUILD_TYPE = "BuildType";
    public static final Companion Companion = new Companion(null);
    public static final String FINGERPRINT = "DeviceFingerprint";
    public static final String HARDWARE = "DeviceHardware";
    public static final String MANUFACTURER = "DeviceManufacturer";
    public static final String MODEL = "DeviceName";
    public static final String PRODUCT = "Product";
    public static final String VERSION_RELEASE = "DeviceOsReleaseVersion";
    public static final String VERSION_SDK = "DeviceSdkVersion";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(Context context) {
        sq8.m48649h(context, "context");
        return isa.m32684k(vyh.m53620a(BRAND, Build.BRAND), vyh.m53620a(FINGERPRINT, Build.FINGERPRINT), vyh.m53620a(HARDWARE, Build.HARDWARE), vyh.m53620a(MODEL, Build.MODEL), vyh.m53620a(PRODUCT, Build.PRODUCT), vyh.m53620a(BUILD_TYPE, Build.TYPE), vyh.m53620a(VERSION_RELEASE, Build.VERSION.RELEASE), vyh.m53620a(VERSION_SDK, Build.VERSION.SDK));
    }
}
