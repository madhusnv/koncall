package ug;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import c9.C0908c;
import c9.C0917l;
import com.google.android.gms.internal.measurement.p8;
import com.sun.mail.imap.IMAPStore;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k0.ExecutorC3897g;
import sf.AbstractC6840z;
import sr.C6911b;
import u7.C7352b;
import yk.C8687a;
import zf.C8946a;
import zh.InterfaceFutureC8957d;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q2 extends h0 {

    /* renamed from: c */
    public m2 f35770c;

    /* renamed from: d */
    public C0917l f35771d;

    /* renamed from: e */
    public final CopyOnWriteArraySet f35772e;

    /* renamed from: f */
    public boolean f35773f;

    /* renamed from: g */
    public final AtomicReference f35774g;

    /* renamed from: h */
    public final Object f35775h;

    /* renamed from: j */
    public boolean f35776j;

    /* renamed from: k */
    public int f35777k;

    /* renamed from: l */
    public d2 f35778l;

    /* renamed from: m */
    public d2 f35779m;

    /* renamed from: n */
    public PriorityQueue f35780n;

    /* renamed from: p */
    public boolean f35781p;

    /* renamed from: q */
    public y1 f35782q;

    /* renamed from: r */
    public final AtomicLong f35783r;

    /* renamed from: s */
    public long f35784s;

    /* renamed from: t */
    public final l4.d0 f35785t;

    /* renamed from: v */
    public boolean f35786v;

    /* renamed from: w */
    public d2 f35787w;

    /* renamed from: x */
    public p2 f35788x;

    /* renamed from: y */
    public d2 f35789y;

    /* renamed from: z */
    public final l4.d0 f35790z;

    public q2(n1 n1Var) {
        super(n1Var);
        this.f35772e = new CopyOnWriteArraySet();
        this.f35775h = new Object();
        this.f35776j = false;
        this.f35777k = 1;
        this.f35786v = true;
        this.f35790z = new l4.d0(25, this);
        this.f35774g = new AtomicReference();
        this.f35782q = y1.f35951c;
        this.f35784s = -1L;
        this.f35783r = new AtomicLong(0L);
        this.f35785t = new l4.d0(27, n1Var);
    }

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return false;
    }

    /* renamed from: Q */
    public final void m14119Q(y1 y1Var) {
        mo325M();
        boolean z6 = (y1Var.m14213i(x1.ANALYTICS_STORAGE) && y1Var.m14213i(x1.AD_STORAGE)) || ((n1) this.f482a).m14093p().m14022V();
        n1 n1Var = (n1) this.f482a;
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.mo325M();
        if (z6 != n1Var.f35659D) {
            m1 m1Var2 = n1Var.f35670g;
            n1.m14085m(m1Var2);
            m1Var2.mo325M();
            n1Var.f35659D = z6;
            d1 d1Var = ((n1) this.f482a).f35668e;
            n1.m14083i(d1Var);
            d1Var.mo325M();
            Boolean boolValueOf = d1Var.m13861Q().contains("measurement_enabled_from_api") ? Boolean.valueOf(d1Var.m13861Q().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z6 || boolValueOf == null || boolValueOf.booleanValue()) {
                d0(Boolean.valueOf(z6), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14120R(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.m14120R(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: S */
    public final void m14121S() {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.m14121S():void");
    }

    /* renamed from: T */
    public final void m14122T(String str, String str2, Bundle bundle) {
        mo325M();
        ((n1) this.f482a).f35674l.getClass();
        m14123U(System.currentTimeMillis(), bundle, str, str2);
    }

    /* renamed from: U */
    public final void m14123U(long j6, Bundle bundle, String str, String str2) {
        mo325M();
        boolean z6 = true;
        if (this.f35771d != null && !l4.l0(str2)) {
            z6 = false;
        }
        m14124V(str, str2, j6, bundle, true, z6, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01eb  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14124V(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.m14124V(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14125W(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.m14125W(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14126X(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.m14126X(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    /* renamed from: Y */
    public final void m14127Y() {
        mo325M();
        m13936N();
        n1 n1Var = (n1) this.f482a;
        if (n1Var.m14089f()) {
            C7436g c7436g = n1Var.f35667d;
            ((n1) c7436g.f482a).getClass();
            Boolean boolM13891Y = c7436g.m13891Y("google_analytics_deferred_deep_link_enabled");
            if (boolM13891Y != null && boolM13891Y.booleanValue()) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35869n.m14140a("Deferred Deep Link feature enabled.");
                m1 m1Var = n1Var.f35670g;
                n1.m14085m(m1Var);
                m1Var.m14047V(new c2(this, 2));
            }
            k3 k3VarM14093p = n1Var.m14093p();
            k3VarM14093p.mo325M();
            k3VarM14093p.m13936N();
            n4 n4VarC0 = k3VarM14093p.c0(true);
            k3VarM14093p.m14025Y();
            n1 n1Var2 = (n1) k3VarM14093p.f482a;
            n1Var2.f35667d.m13889W(null, f0.f44801b1);
            n1Var2.m14092o().m14109T(3, new byte[0]);
            k3VarM14093p.a0(new g3(k3VarM14093p, n4VarC0, 0));
            this.f35786v = false;
            d1 d1Var = n1Var.f35668e;
            n1.m14083i(d1Var);
            d1Var.mo325M();
            String string = d1Var.m13861Q().getString("previous_os_version", null);
            ((n1) d1Var.f482a).m14094q().m14144O();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = d1Var.m13861Q().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            n1Var.m14094q().m14144O();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m14122T("auto", "_ou", bundle);
        }
    }

    /* renamed from: Z */
    public final void m14128Z(Bundle bundle, long j6) {
        n1 n1Var = (n1) this.f482a;
        AbstractC6840z.m13036g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14140a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        z1.m14267e(bundle2, "app_id", String.class, null);
        z1.m14267e(bundle2, "origin", String.class, null);
        z1.m14267e(bundle2, IMAPStore.ID_NAME, String.class, null);
        z1.m14267e(bundle2, "value", Object.class, null);
        z1.m14267e(bundle2, "trigger_event_name", String.class, null);
        z1.m14267e(bundle2, "trigger_timeout", Long.class, 0L);
        z1.m14267e(bundle2, "timed_out_event_name", String.class, null);
        z1.m14267e(bundle2, "timed_out_event_params", Bundle.class, null);
        z1.m14267e(bundle2, "triggered_event_name", String.class, null);
        z1.m14267e(bundle2, "triggered_event_params", Bundle.class, null);
        z1.m14267e(bundle2, "time_to_live", Long.class, 0L);
        z1.m14267e(bundle2, "expired_event_name", String.class, null);
        z1.m14267e(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC6840z.m13033d(bundle2.getString(IMAPStore.ID_NAME));
        AbstractC6840z.m13033d(bundle2.getString("origin"));
        AbstractC6840z.m13036g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j6);
        String string = bundle2.getString(IMAPStore.ID_NAME);
        Object obj = bundle2.get("value");
        l4 l4Var = n1Var.f35672j;
        q0 q0Var = n1Var.f35673k;
        v0 v0Var2 = n1Var.f35669f;
        n1.m14083i(l4Var);
        if (l4Var.S0(string) != 0) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(q0Var.m14115c(string), "Invalid conditional user property name");
            return;
        }
        n1.m14083i(l4Var);
        if (l4Var.m14037Z(obj, string) != 0) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Invalid conditional user property value", q0Var.m14115c(string), obj);
            return;
        }
        Object objA0 = l4Var.a0(obj, string);
        if (objA0 == null) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Unable to normalize conditional user property value", q0Var.m14115c(string), obj);
            return;
        }
        z1.m14265c(bundle2, objA0);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Invalid conditional user property timeout", q0Var.m14115c(string), Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 > 15552000000L || j11 < 1) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Invalid conditional user property time to live", q0Var.m14115c(string), Long.valueOf(j11));
        } else {
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new RunnableC8956c(16, this, bundle2, false));
        }
    }

    public final void a0(String str, String str2, Bundle bundle) {
        n1 n1Var = (n1) this.f482a;
        n1Var.f35674l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC6840z.m13033d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(IMAPStore.ID_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new j2(this, bundle2, 0));
    }

    public final String b0() {
        n1 n1Var = (n1) this.f482a;
        try {
            return z1.m14264b(n1Var.f35664a, n1Var.f35679r);
        } catch (IllegalStateException e2) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(e2, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void c0(y1 y1Var, long j6, boolean z6) {
        int i10 = y1Var.f35953b;
        mo325M();
        m13936N();
        n1 n1Var = (n1) this.f482a;
        d1 d1Var = n1Var.f35668e;
        v0 v0Var = n1Var.f35669f;
        n1.m14083i(d1Var);
        y1 y1VarM13864T = d1Var.m13864T();
        if (j6 <= this.f35784s && y1.m14210l(y1VarM13864T.f35953b, i10)) {
            n1.m14085m(v0Var);
            v0Var.f35868m.m14141b(y1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        d1 d1Var2 = n1Var.f35668e;
        n1.m14083i(d1Var2);
        d1Var2.mo325M();
        if (!y1.m14210l(i10, d1Var2.m13861Q().getInt("consent_source", 100))) {
            n1.m14085m(v0Var);
            v0Var.f35868m.m14141b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = d1Var2.m13861Q().edit();
        editorEdit.putString("consent_settings", y1Var.m14212g());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        n1.m14085m(v0Var);
        v0Var.f35870p.m14141b(y1Var, "Setting storage consent(FE)");
        this.f35784s = j6;
        if (n1Var.m14093p().m14023W()) {
            k3 k3VarM14093p = n1Var.m14093p();
            k3VarM14093p.mo325M();
            k3VarM14093p.m13936N();
            k3VarM14093p.a0(new i3(k3VarM14093p, 2));
        } else {
            k3 k3VarM14093p2 = n1Var.m14093p();
            k3VarM14093p2.mo325M();
            k3VarM14093p2.m13936N();
            if (k3VarM14093p2.m14022V()) {
                k3VarM14093p2.a0(new g3(k3VarM14093p2, k3VarM14093p2.c0(false), 1));
            }
        }
        if (z6) {
            n1Var.m14093p().m14017Q(new AtomicReference());
        }
    }

    public final void d0(Boolean bool, boolean z6) {
        mo325M();
        m13936N();
        n1 n1Var = (n1) this.f482a;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35869n.m14141b(bool, "Setting app measurement enabled (FE)");
        d1 d1Var = n1Var.f35668e;
        n1.m14083i(d1Var);
        d1Var.mo325M();
        SharedPreferences.Editor editorEdit = d1Var.m13861Q().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z6) {
            d1Var.mo325M();
            SharedPreferences.Editor editorEdit2 = d1Var.m13861Q().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.mo325M();
        if (n1Var.f35659D || !(bool == null || bool.booleanValue())) {
            e0();
        }
    }

    public final void e0() {
        mo325M();
        n1 n1Var = (n1) this.f482a;
        d1 d1Var = n1Var.f35668e;
        v0 v0Var = n1Var.f35669f;
        C8946a c8946a = n1Var.f35674l;
        n1.m14083i(d1Var);
        String strM428s = d1Var.f35339n.m428s();
        if (strM428s != null) {
            if ("unset".equals(strM428s)) {
                c8946a.getClass();
                m14126X(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM428s) ? 0L : 1L);
                c8946a.getClass();
                m14126X(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!n1Var.m14087d() || !this.f35786v) {
            n1.m14085m(v0Var);
            v0Var.f35869n.m14140a("Updating Scion state (FE)");
            k3 k3VarM14093p = n1Var.m14093p();
            k3VarM14093p.mo325M();
            k3VarM14093p.m13936N();
            k3VarM14093p.a0(new f3(k3VarM14093p, k3VarM14093p.c0(true), 2));
            return;
        }
        n1.m14085m(v0Var);
        v0Var.f35869n.m14140a("Recording app launch after enabling measurement for the first time (FE)");
        m14127Y();
        s3 s3Var = n1Var.f35671h;
        n1.m14084k(s3Var);
        s3Var.f35824e.m13917B();
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new c2(this, 1));
    }

    public final void f0() {
        n1 n1Var = (n1) this.f482a;
        if (!(n1Var.f35664a.getApplicationContext() instanceof Application) || this.f35770c == null) {
            return;
        }
        ((Application) n1Var.f35664a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f35770c);
    }

    public final void g0(Bundle bundle, int i10, long j6) {
        Object obj;
        String string;
        n1 n1Var = (n1) this.f482a;
        m13936N();
        y1 y1Var = y1.f35951c;
        x1[] x1VarArrZzb = w1.STORAGE.zzb();
        int length = x1VarArrZzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = x1VarArrZzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35867l.m14141b(obj, "Ignoring invalid consent setting");
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35867l.m14140a("Valid consent values are 'granted', 'denied'");
        }
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        boolean zM14044S = m1Var.m14044S();
        y1 y1VarM14205b = y1.m14205b(i10, bundle);
        Iterator it = y1VarM14205b.f35952a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((v1) it.next()) != v1.UNINITIALIZED) {
                i0(y1VarM14205b, zM14044S);
                break;
            }
        }
        C7445p c7445pM14102c = C7445p.m14102c(i10, bundle);
        Iterator it2 = c7445pM14102c.f35748e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((v1) it2.next()) != v1.UNINITIALIZED) {
                h0(c7445pM14102c, zM14044S);
                break;
            }
        }
        Boolean boolM14103d = C7445p.m14103d(bundle);
        if (boolM14103d != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zM14044S) {
                m14126X(j6, boolM14103d.toString(), str2, "allow_personalized_ads");
            } else {
                m14125W(str2, "allow_personalized_ads", boolM14103d.toString(), false, j6);
            }
        }
    }

    public final void h0(C7445p c7445p, boolean z6) {
        RunnableC8956c runnableC8956c = new RunnableC8956c(18, this, c7445p, false);
        if (z6) {
            mo325M();
            runnableC8956c.run();
        } else {
            m1 m1Var = ((n1) this.f482a).f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(runnableC8956c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void i0(ug.y1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.q2.i0(ug.y1, boolean):void");
    }

    public final void j0() {
        p8.m3595a();
        n1 n1Var = (n1) this.f482a;
        C7436g c7436g = n1Var.f35667d;
        m1 m1Var = n1Var.f35670g;
        v0 v0Var = n1Var.f35669f;
        if (c7436g.m13889W(null, f0.Q0)) {
            n1.m14085m(m1Var);
            if (m1Var.m14044S()) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14140a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C8687a.m16043t()) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14140a("Cannot get trigger URIs from main thread");
                return;
            }
            m13936N();
            n1.m14085m(v0Var);
            v0Var.f35870p.m14140a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            n1.m14085m(m1Var);
            m1Var.m14048W(atomicReference, 10000L, "get trigger URIs", new k2(this, atomicReference, 2));
            final List list = (List) atomicReference.get();
            if (list == null) {
                n1.m14085m(v0Var);
                v0Var.f35864h.m14140a("Timed out waiting for get trigger URIs");
            } else {
                n1.m14085m(m1Var);
                m1Var.m14047V(new Runnable() { // from class: ug.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        q2 q2Var = this.f35687a;
                        q2Var.mo325M();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        d1 d1Var = ((n1) q2Var.f482a).f35668e;
                        n1.m14083i(d1Var);
                        SparseArray sparseArrayM13863S = d1Var.m13863S();
                        for (w3 w3Var : list) {
                            int i10 = w3Var.f35894c;
                            if (!sparseArrayM13863S.contains(i10) || ((Long) sparseArrayM13863S.get(i10)).longValue() < w3Var.f35893b) {
                                q2Var.k0().add(w3Var);
                            }
                        }
                        q2Var.l0();
                    }
                });
            }
        }
    }

    public final PriorityQueue k0() {
        if (this.f35780n == null) {
            this.f35780n = new PriorityQueue(Comparator.comparing(o2.f35730a, C6911b.f33396b));
        }
        return this.f35780n;
    }

    public final void l0() {
        w3 w3Var;
        mo325M();
        this.f35781p = false;
        if (k0().isEmpty() || this.f35776j || (w3Var = (w3) k0().poll()) == null) {
            return;
        }
        n1 n1Var = (n1) this.f482a;
        l4 l4Var = n1Var.f35672j;
        n1.m14083i(l4Var);
        C7352b c7352bG0 = l4Var.g0();
        if (c7352bG0 != null) {
            this.f35776j = true;
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            t0 t0Var = v0Var.f35870p;
            String str = w3Var.f35892a;
            t0Var.m14141b(str, "Registering trigger URI");
            InterfaceFutureC8957d interfaceFutureC8957dM13763e = c7352bG0.m13763e(Uri.parse(str));
            if (interfaceFutureC8957dM13763e != null) {
                interfaceFutureC8957dM13763e.mo9026a(new RunnableC8956c(0, interfaceFutureC8957dM13763e, new C0908c(16, this, w3Var)), new ExecutorC3897g(2, this));
            } else {
                this.f35776j = false;
                k0().add(w3Var);
            }
        }
    }
}
