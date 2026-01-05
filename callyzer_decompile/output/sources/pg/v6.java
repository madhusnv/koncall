package pg;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import ji.C3773g;
import ni.C5074c;
import ni.InterfaceC5073b;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v6 {

    /* renamed from: a */
    public static final /* synthetic */ int f29088a = 0;

    /* renamed from: a */
    public static boolean m11893a() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C3773g.m8291c();
            C3773g c3773gM8291c = C3773g.m8291c();
            c3773gM8291c.m8293a();
            context = c3773gM8291c.f19662a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[PHI: r5
      0x00cb: PHI (r5v23 java.lang.String) = (r5v22 java.lang.String), (r5v36 java.lang.String) binds: [B:43:0x00b3, B:47:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m11894b(android.content.Intent r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.v6.m11894b(android.content.Intent):void");
    }

    /* renamed from: c */
    public static void m11895c(String str, Bundle bundle) {
        try {
            C3773g.m8291c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString(AnnotatedPrivateKey.LABEL, string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = C7622f.m14509w(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            InterfaceC5073b interfaceC5073b = (InterfaceC5073b) C3773g.m8291c().m8294b(InterfaceC5073b.class);
            if (interfaceC5073b != null) {
                ((C5074c) interfaceC5073b).m10007a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: d */
    public static boolean m11896d(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
