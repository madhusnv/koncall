package th;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import eb.g2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import uh.AbstractC7456a;
import uh.AbstractC7463h;
import uh.C7469n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.h */
/* loaded from: classes.dex */
public final class C7158h {

    /* renamed from: e */
    public static final g2 f34402e = new g2("AppUpdateService");

    /* renamed from: f */
    public static final Intent f34403f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final C7469n f34404a;

    /* renamed from: b */
    public final String f34405b;

    /* renamed from: c */
    public final Context f34406c;

    /* renamed from: d */
    public final C7159i f34407d;

    public C7158h(Context context, C7159i c7159i) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f34405b = context.getPackageName();
        this.f34406c = context;
        this.f34407d = c7159i;
        g2 g2Var = AbstractC7456a.f36045a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    g2 g2Var2 = AbstractC7456a.f36045a;
                    Object[] objArr = new Object[0];
                    g2Var2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        g2.m5718f(g2Var2.f9320a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f34404a = new C7469n(applicationContext != null ? applicationContext : context, f34402e, f34403f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* renamed from: a */
    public static Bundle m13418a(C7158h c7158h, String str) {
        Map map;
        Integer numValueOf;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap map2 = AbstractC7463h.f36052a;
        synchronized (AbstractC7463h.class) {
            try {
                HashMap map3 = AbstractC7463h.f36052a;
                if (!map3.containsKey("app_update")) {
                    HashMap map4 = new HashMap();
                    map4.put("java", 11004);
                    map3.put("app_update", map4);
                }
                map = (Map) map3.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(c7158h.f34406c.getPackageManager().getPackageInfo(c7158h.f34406c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            g2 g2Var = f34402e;
            Object[] objArr = new Object[0];
            g2Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                g2.m5718f(g2Var.f9320a, "The current version of the app could not be retrieved", objArr);
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
