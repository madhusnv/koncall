package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.camera.core.impl.C1896a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p001o.j5e;
import p001o.wja;
import p001o.zl7;

/* loaded from: classes2.dex */
public class QuirkSettingsLoader implements zl7 {

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public static C1896a m4691b(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM4692c = m4692c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrM4692c2 = m4692c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        wja.m54627a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        wja.m54627a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        wja.m54627a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrM4692c));
        wja.m54627a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrM4692c2));
        return new C1896a.b().m4701d(z).m4700c(m4694e(strArrM4692c)).m4699b(m4694e(strArrM4692c2)).m4698a();
    }

    /* renamed from: c */
    public static String[] m4692c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            wja.m54638l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            wja.m54639m("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    /* renamed from: d */
    public static Class m4693d(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (j5e.class.isAssignableFrom(cls)) {
                return cls;
            }
            wja.m54638l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e) {
            wja.m54639m("QuirkSettingsLoader", "Class not found: " + str, e);
            return null;
        }
    }

    /* renamed from: e */
    public static Set m4694e(String[] strArr) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class clsM4693d = m4693d(str);
            if (clsM4693d != null) {
                hashSet.add(clsM4693d);
            }
        }
        return hashSet;
    }

    @Override // p001o.zl7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1896a apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return m4691b(context, bundle);
            }
            wja.m54638l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            wja.m54627a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
