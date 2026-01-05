package com.gu.toolargetool;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.ce5;
import p001o.h8g;
import p001o.irh;
import p001o.jf7;
import p001o.lvf;
import p001o.nja;
import p001o.sq8;
import p001o.tja;
import p001o.zs;

/* loaded from: classes6.dex */
public final class TooLargeTool {
    public static final TooLargeTool INSTANCE = new TooLargeTool();
    private static zs activityLogger;

    private TooLargeTool() {
    }

    private final float KB(int i) {
        return i / 1000.0f;
    }

    public static final String bundleBreakdown(Bundle bundle) {
        sq8.m48649h(bundle, "bundle");
        lvf lvfVarM32647b = irh.m32647b(bundle);
        String strM37985a = lvfVarM32647b.m37985a();
        int iM37986b = lvfVarM32647b.m37986b();
        List<lvf> listM37987c = lvfVarM32647b.m37987c();
        h8g h8gVar = h8g.f26398a;
        String string = String.format(Locale.UK, "%s contains %d keys and measures %,.1f KB when serialized as a Parcel", Arrays.copyOf(new Object[]{strM37985a, Integer.valueOf(listM37987c.size()), Float.valueOf(INSTANCE.KB(iM37986b))}, 3));
        sq8.m48648g(string, "java.lang.String.format(locale, format, *args)");
        for (lvf lvfVar : listM37987c) {
            String strM37985a2 = lvfVar.m37985a();
            int iM37986b2 = lvfVar.m37986b();
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            h8g h8gVar2 = h8g.f26398a;
            String str = String.format(Locale.UK, "\n* %s = %,.1f KB", Arrays.copyOf(new Object[]{strM37985a2, Float.valueOf(INSTANCE.KB(iM37986b2))}, 2));
            sq8.m48648g(str, "java.lang.String.format(locale, format, *args)");
            sb.append(str);
            string = sb.toString();
        }
        return string;
    }

    public static final boolean isLogging() {
        zs zsVar = activityLogger;
        sq8.m48646e(zsVar);
        return zsVar.m59812a();
    }

    public static /* synthetic */ void isLogging$annotations() {
    }

    public static final void logBundleBreakdown(String str, Bundle bundle) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(bundle, "bundle");
        Log.println(3, str, bundleBreakdown(bundle));
    }

    public static final void startLogging(Application application) {
        startLogging$default(application, 0, null, 6, null);
    }

    public static /* synthetic */ void startLogging$default(Application application, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            str = "TooLargeTool";
        }
        startLogging(application, i, str);
    }

    public static final void stopLogging(Application application) {
        sq8.m48649h(application, "application");
        zs zsVar = activityLogger;
        sq8.m48646e(zsVar);
        if (zsVar.m59812a()) {
            zs zsVar2 = activityLogger;
            sq8.m48646e(zsVar2);
            zsVar2.m59815d();
            application.unregisterActivityLifecycleCallbacks(activityLogger);
        }
    }

    public static final void logBundleBreakdown(String str, int i, Bundle bundle) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(bundle, "bundle");
        Log.println(i, str, bundleBreakdown(bundle));
    }

    public static final void startLogging(Application application, int i) {
        startLogging$default(application, i, null, 4, null);
    }

    public static final void startLogging(Application application, int i, String str) {
        sq8.m48649h(application, "application");
        sq8.m48649h(str, "tag");
        startLogging(application, new ce5(), new nja(i, str));
    }

    public static final void startLogging(Application application, jf7 jf7Var, tja tjaVar) {
        sq8.m48649h(application, "application");
        sq8.m48649h(jf7Var, "formatter");
        sq8.m48649h(tjaVar, "logger");
        if (activityLogger == null) {
            activityLogger = new zs(jf7Var, tjaVar, true);
        }
        zs zsVar = activityLogger;
        sq8.m48646e(zsVar);
        if (zsVar.m59812a()) {
            return;
        }
        zs zsVar2 = activityLogger;
        sq8.m48646e(zsVar2);
        zsVar2.m59814c();
        application.registerActivityLifecycleCallbacks(activityLogger);
    }
}
