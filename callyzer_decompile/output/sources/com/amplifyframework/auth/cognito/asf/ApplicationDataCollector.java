package com.amplifyframework.auth.cognito.asf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ApplicationDataCollector implements DataCollector {
    private static final int ALL_FLAGS_OFF = 0;
    public static final String APP_NAME = "ApplicationName";
    public static final String APP_TARGET_SDK = "ApplicationTargetSdk";
    public static final String APP_VERSION = "ApplicationVersion";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ApplicationDataCollector";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    private final String getAppName(Context context) {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    private final String getAppTargetSdk(Context context) {
        return String.valueOf(context.getApplicationInfo().targetSdkVersion);
    }

    @SuppressLint({"WrongConstant"})
    private final String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(Context context) {
        AbstractC4154l.m8923f(context, "context");
        return AbstractC6674x.m12778f(new C6361k(APP_NAME, getAppName(context)), new C6361k(APP_TARGET_SDK, getAppTargetSdk(context)), new C6361k(APP_VERSION, getAppVersion(context)));
    }
}
