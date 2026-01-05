package ug;

import ai.AbstractC0151h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import bg.C0658c;
import java.lang.reflect.InvocationTargetException;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.g */
/* loaded from: classes.dex */
public final class C7436g extends AbstractC0151h {

    /* renamed from: b */
    public Boolean f35444b;

    /* renamed from: c */
    public String f35445c;

    /* renamed from: d */
    public InterfaceC7435f f35446d;

    /* renamed from: e */
    public Boolean f35447e;

    /* renamed from: N */
    public final boolean m13880N(String str) {
        return "1".equals(this.f35446d.mo396e(str, "gaia_collection_enabled"));
    }

    /* renamed from: O */
    public final boolean m13881O(String str) {
        return "1".equals(this.f35446d.mo396e(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: P */
    public final boolean m13882P() {
        if (this.f35444b == null) {
            Boolean boolM13891Y = m13891Y("app_measurement_lite");
            this.f35444b = boolM13891Y;
            if (boolM13891Y == null) {
                this.f35444b = Boolean.FALSE;
            }
        }
        return this.f35444b.booleanValue() || !((n1) this.f482a).f35665b;
    }

    /* renamed from: Q */
    public final String m13883Q(String str) {
        n1 n1Var = (n1) this.f482a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC6840z.m13036g(str2);
            return str2;
        } catch (ClassNotFoundException e2) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(e2, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e10) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(e10, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e11) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35862f.m14141b(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e12) {
            v0 v0Var4 = n1Var.f35669f;
            n1.m14085m(v0Var4);
            v0Var4.f35862f.m14141b(e12, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* renamed from: R */
    public final void m13884R() {
        ((n1) this.f482a).getClass();
    }

    /* renamed from: S */
    public final String m13885S(String str, e0 e0Var) {
        return TextUtils.isEmpty(str) ? (String) e0Var.m13872a(null) : (String) e0Var.m13872a(this.f35446d.mo396e(str, e0Var.f35369a));
    }

    /* renamed from: T */
    public final long m13886T(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e0Var.m13872a(null)).longValue();
        }
        String strMo396e = this.f35446d.mo396e(str, e0Var.f35369a);
        if (TextUtils.isEmpty(strMo396e)) {
            return ((Long) e0Var.m13872a(null)).longValue();
        }
        try {
            return ((Long) e0Var.m13872a(Long.valueOf(Long.parseLong(strMo396e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e0Var.m13872a(null)).longValue();
        }
    }

    /* renamed from: U */
    public final int m13887U(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e0Var.m13872a(null)).intValue();
        }
        String strMo396e = this.f35446d.mo396e(str, e0Var.f35369a);
        if (TextUtils.isEmpty(strMo396e)) {
            return ((Integer) e0Var.m13872a(null)).intValue();
        }
        try {
            return ((Integer) e0Var.m13872a(Integer.valueOf(Integer.parseInt(strMo396e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e0Var.m13872a(null)).intValue();
        }
    }

    /* renamed from: V */
    public final double m13888V(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e0Var.m13872a(null)).doubleValue();
        }
        String strMo396e = this.f35446d.mo396e(str, e0Var.f35369a);
        if (TextUtils.isEmpty(strMo396e)) {
            return ((Double) e0Var.m13872a(null)).doubleValue();
        }
        try {
            return ((Double) e0Var.m13872a(Double.valueOf(Double.parseDouble(strMo396e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e0Var.m13872a(null)).doubleValue();
        }
    }

    /* renamed from: W */
    public final boolean m13889W(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e0Var.m13872a(null)).booleanValue();
        }
        String strMo396e = this.f35446d.mo396e(str, e0Var.f35369a);
        return TextUtils.isEmpty(strMo396e) ? ((Boolean) e0Var.m13872a(null)).booleanValue() : ((Boolean) e0Var.m13872a(Boolean.valueOf("1".equals(strMo396e)))).booleanValue();
    }

    /* renamed from: X */
    public final Bundle m13890X() {
        n1 n1Var = (n1) this.f482a;
        try {
            Context context = n1Var.f35664a;
            Context context2 = n1Var.f35664a;
            v0 v0Var = n1Var.f35669f;
            if (context.getPackageManager() == null) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14140a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM1919b = C0658c.m1928a(context2).m1919b(128, context2.getPackageName());
            if (applicationInfoM1919b != null) {
                return applicationInfoM1919b.metaData;
            }
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(e2, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* renamed from: Y */
    public final Boolean m13891Y(String str) {
        AbstractC6840z.m13033d(str);
        Bundle bundleM13890X = m13890X();
        if (bundleM13890X != null) {
            if (bundleM13890X.containsKey(str)) {
                return Boolean.valueOf(bundleM13890X.getBoolean(str));
            }
            return null;
        }
        v0 v0Var = ((n1) this.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35862f.m14140a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* renamed from: Z */
    public final boolean m13892Z() {
        ((n1) this.f482a).getClass();
        Boolean boolM13891Y = m13891Y("firebase_analytics_collection_deactivated");
        return boolM13891Y != null && boolM13891Y.booleanValue();
    }

    public final boolean a0() {
        Boolean boolM13891Y = m13891Y("google_analytics_automatic_screen_reporting_enabled");
        return boolM13891Y == null || boolM13891Y.booleanValue();
    }

    public final v1 b0(String str, boolean z6) {
        Object obj;
        AbstractC6840z.m13033d(str);
        n1 n1Var = (n1) this.f482a;
        Bundle bundleM13890X = m13890X();
        if (bundleM13890X == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM13890X.get(str);
        }
        if (obj == null) {
            return v1.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return v1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return v1.DENIED;
        }
        if (z6 && "eu_consent_policy".equals(obj)) {
            return v1.POLICY;
        }
        v0 v0Var2 = n1Var.f35669f;
        n1.m14085m(v0Var2);
        v0Var2.f35865j.m14141b(str, "Invalid manifest metadata for");
        return v1.UNINITIALIZED;
    }
}
