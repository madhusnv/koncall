package wi;

import a9.C0073l;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b3.C0575g;
import com.google.firebase.installations.C1401a;
import eb.g2;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import pg.l8;
import rj.C6555a;
import rj.InterfaceC6558d;
import xi.C8385c;
import xi.C8386d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.v */
/* loaded from: classes.dex */
public final class C8072v {

    /* renamed from: g */
    public static final Pattern f38655g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f38656h = Pattern.quote("/");

    /* renamed from: a */
    public final g2 f38657a;

    /* renamed from: b */
    public final Context f38658b;

    /* renamed from: c */
    public final String f38659c;

    /* renamed from: d */
    public final InterfaceC6558d f38660d;

    /* renamed from: e */
    public final C0073l f38661e;

    /* renamed from: f */
    public C8053c f38662f;

    public C8072v(Context context, String str, InterfaceC6558d interfaceC6558d, C0073l c0073l) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f38658b = context;
        this.f38659c = str;
        this.f38660d = interfaceC6558d;
        this.f38661e = c0073l;
        this.f38657a = new g2();
    }

    /* renamed from: a */
    public final synchronized String m15210a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f38655g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* renamed from: b */
    public final C8071u m15211b(boolean z6) {
        String str;
        if (!((Boolean) new C0575g(0, C8386d.f40062d, C8385c.class, "isNotMainThread", "isNotMainThread()Z", 0, 12).invoke()).booleanValue()) {
            Thread.currentThread().getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        InterfaceC6558d interfaceC6558d = this.f38660d;
        String str2 = null;
        if (z6) {
            try {
                str = ((C6555a) l8.m11761b(((C1401a) interfaceC6558d).m4472d(), 10000L, TimeUnit.MILLISECONDS)).f31407a;
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) l8.m11761b(((C1401a) interfaceC6558d).m4471c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused2) {
        }
        return new C8071u(str2, str);
    }

    /* renamed from: c */
    public final synchronized C8053c m15212c() {
        String str;
        C8053c c8053c = this.f38662f;
        if (c8053c != null && (c8053c.f38574b != null || !this.f38661e.m194C())) {
            return this.f38662f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.f38658b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f38661e.m194C()) {
            C8071u c8071uM15211b = m15211b(false);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (c8071uM15211b.f38653a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c8071uM15211b = new C8071u(str, null);
            }
            if (Objects.equals(c8071uM15211b.f38653a, string)) {
                this.f38662f = new C8053c(sharedPreferences.getString("crashlytics.installation.id", null), c8071uM15211b.f38653a, c8071uM15211b.f38654b);
            } else {
                this.f38662f = new C8053c(m15210a(sharedPreferences, c8071uM15211b.f38653a), c8071uM15211b.f38653a, c8071uM15211b.f38654b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f38662f = new C8053c(m15210a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f38662f = new C8053c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f38662f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f38662f;
    }

    /* renamed from: d */
    public final String m15213d() {
        String str;
        g2 g2Var = this.f38657a;
        Context context = this.f38658b;
        synchronized (g2Var) {
            try {
                if (g2Var.f9320a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    g2Var.f9320a = installerPackageName;
                }
                str = "".equals(g2Var.f9320a) ? null : g2Var.f9320a;
            } finally {
            }
        }
        return str;
    }
}
