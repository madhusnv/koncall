package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(Context context) {
        AbstractC4154l.m8923f(context, "context");
        return AbstractC6674x.m12778f(new C6361k(BRAND, Build.BRAND), new C6361k(FINGERPRINT, Build.FINGERPRINT), new C6361k(HARDWARE, Build.HARDWARE), new C6361k(MODEL, Build.MODEL), new C6361k(PRODUCT, Build.PRODUCT), new C6361k(BUILD_TYPE, Build.TYPE), new C6361k(VERSION_RELEASE, Build.VERSION.RELEASE), new C6361k(VERSION_SDK, Build.VERSION.SDK));
    }
}
