package ug;

import al.C0182j;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import ia.C3220l;
import sf.AbstractC6840z;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends t1 {

    /* renamed from: D */
    public static final Pair f35326D = new Pair("", 0L);

    /* renamed from: B */
    public final c1 f35327B;

    /* renamed from: C */
    public final C8090p f35328C;

    /* renamed from: c */
    public SharedPreferences f35329c;

    /* renamed from: d */
    public SharedPreferences f35330d;

    /* renamed from: e */
    public C3220l f35331e;

    /* renamed from: f */
    public final c1 f35332f;

    /* renamed from: g */
    public final C0182j f35333g;

    /* renamed from: h */
    public String f35334h;

    /* renamed from: j */
    public boolean f35335j;

    /* renamed from: k */
    public long f35336k;

    /* renamed from: l */
    public final c1 f35337l;

    /* renamed from: m */
    public final b1 f35338m;

    /* renamed from: n */
    public final C0182j f35339n;

    /* renamed from: p */
    public final C8090p f35340p;

    /* renamed from: q */
    public final b1 f35341q;

    /* renamed from: r */
    public final c1 f35342r;

    /* renamed from: s */
    public final c1 f35343s;

    /* renamed from: t */
    public boolean f35344t;

    /* renamed from: v */
    public final b1 f35345v;

    /* renamed from: w */
    public final b1 f35346w;

    /* renamed from: x */
    public final c1 f35347x;

    /* renamed from: y */
    public final C0182j f35348y;

    /* renamed from: z */
    public final C0182j f35349z;

    public d1(n1 n1Var) {
        super(n1Var);
        this.f35337l = new c1(this, "session_timeout", 1800000L);
        this.f35338m = new b1(this, "start_new_session", true);
        this.f35342r = new c1(this, "last_pause_time", 0L);
        this.f35343s = new c1(this, "session_id", 0L);
        this.f35339n = new C0182j(this, "non_personalized_ads");
        this.f35340p = new C8090p(this, "last_received_uri_timestamps_by_source");
        this.f35341q = new b1(this, "allow_remote_dynamite", false);
        this.f35332f = new c1(this, "first_open_time", 0L);
        AbstractC6840z.m13033d("app_install_time");
        this.f35333g = new C0182j(this, "app_instance_id");
        this.f35345v = new b1(this, "app_backgrounded", false);
        this.f35346w = new b1(this, "deep_link_retrieval_complete", false);
        this.f35347x = new c1(this, "deep_link_retrieval_attempts", 0L);
        this.f35348y = new C0182j(this, "firebase_feature_rollouts");
        this.f35349z = new C0182j(this, "deferred_attribution_cache");
        this.f35327B = new c1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f35328C = new C8090p(this, "default_event_parameters");
    }

    @Override // ug.t1
    /* renamed from: N */
    public final boolean mo13860N() {
        return true;
    }

    /* renamed from: Q */
    public final SharedPreferences m13861Q() {
        mo325M();
        m14144O();
        AbstractC6840z.m13036g(this.f35329c);
        return this.f35329c;
    }

    /* renamed from: R */
    public final SharedPreferences m13862R() {
        mo325M();
        m14144O();
        if (this.f35330d == null) {
            n1 n1Var = (n1) this.f482a;
            String strValueOf = String.valueOf(n1Var.f35664a.getPackageName());
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            t0 t0Var = v0Var.f35870p;
            String strConcat = strValueOf.concat("_preferences");
            t0Var.m14141b(strConcat, "Default prefs file");
            this.f35330d = n1Var.f35664a.getSharedPreferences(strConcat, 0);
        }
        return this.f35330d;
    }

    /* renamed from: S */
    public final SparseArray m13863S() {
        Bundle bundleM15246Y = this.f35340p.m15246Y();
        int[] intArray = bundleM15246Y.getIntArray("uriSources");
        long[] longArray = bundleM15246Y.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* renamed from: T */
    public final y1 m13864T() {
        mo325M();
        return y1.m14206c(m13861Q().getInt("consent_source", 100), m13861Q().getString("consent_settings", "G1"));
    }

    /* renamed from: U */
    public final boolean m13865U(t3 t3Var) {
        mo325M();
        String string = m13861Q().getString("stored_tcf_param", "");
        String strM14146a = t3Var.m14146a();
        if (strM14146a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m13861Q().edit();
        editorEdit.putString("stored_tcf_param", strM14146a);
        editorEdit.apply();
        return true;
    }

    /* renamed from: V */
    public final void m13866V(boolean z6) {
        mo325M();
        v0 v0Var = ((n1) this.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35870p.m14141b(Boolean.valueOf(z6), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m13861Q().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z6);
        editorEdit.apply();
    }

    /* renamed from: W */
    public final boolean m13867W(long j6) {
        return j6 - this.f35337l.m13856a() > this.f35342r.m13856a();
    }
}
