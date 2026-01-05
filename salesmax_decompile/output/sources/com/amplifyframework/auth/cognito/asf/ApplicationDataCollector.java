package com.amplifyframework.auth.cognito.asf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
public final class ApplicationDataCollector implements DataCollector {
    private static final int ALL_FLAGS_OFF = 0;
    public static final String APP_NAME = "ApplicationName";
    public static final String APP_TARGET_SDK = "ApplicationTargetSdk";
    public static final String APP_VERSION = "ApplicationVersion";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ApplicationDataCollector.class.getSimpleName();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
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
        sq8.m48649h(context, "context");
        return isa.m32684k(vyh.m53620a(APP_NAME, getAppName(context)), vyh.m53620a(APP_TARGET_SDK, getAppTargetSdk(context)), vyh.m53620a(APP_VERSION, getAppVersion(context)));
    }
}
