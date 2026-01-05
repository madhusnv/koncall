package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import c6.b1;
import c9.C0917l;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.w0;
import e1.C1903e;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l0.RunnableC4307g;
import sf.AbstractC6840z;
import ug.C7439j;
import ug.C7448s;
import ug.C7449t;
import ug.a2;
import ug.b3;
import ug.b4;
import ug.c0;
import ug.e2;
import ug.f2;
import ug.g2;
import ug.i2;
import ug.j2;
import ug.k2;
import ug.l4;
import ug.m1;
import ug.m2;
import ug.m4;
import ug.n1;
import ug.q2;
import ug.t0;
import ug.t2;
import ug.v0;
import ug.v2;
import ug.x0;
import ug.x2;
import ug.z3;
import yk.C8687a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends k0 {

    /* renamed from: e */
    public n1 f6714e;

    /* renamed from: f */
    public final C1903e f6715f;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f6714e = null;
        this.f6715f = new C1903e(0);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void beginAdUnitExposure(String str, long j6) {
        m4017f();
        c0 c0Var = this.f6714e.f35677p;
        n1.m14082h(c0Var);
        c0Var.m13850N(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.a0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearMeasurementEnabled(long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m13936N();
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC4307g(18, q2Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void endAdUnitExposure(String str, long j6) {
        m4017f();
        c0 c0Var = this.f6714e.f35677p;
        n1.m14082h(c0Var);
        c0Var.m13851O(str, j6);
    }

    /* renamed from: f */
    public final void m4017f() {
        if (this.f6714e == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: g */
    public final void m4018g(String str, n0 n0Var) {
        m4017f();
        l4 l4Var = this.f6714e.f35672j;
        n1.m14083i(l4Var);
        l4Var.v0(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void generateEventId(n0 n0Var) {
        m4017f();
        l4 l4Var = this.f6714e.f35672j;
        n1.m14083i(l4Var);
        long jJ0 = l4Var.J0();
        m4017f();
        l4 l4Var2 = this.f6714e.f35672j;
        n1.m14083i(l4Var2);
        l4Var2.w0(n0Var, jJ0);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getAppInstanceId(n0 n0Var) {
        m4017f();
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC4307g(16, this, n0Var, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCachedAppInstanceId(n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m4018g((String) q2Var.f35774g.get(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        m4017f();
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new b1(8, this, n0Var, str, str2, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenClass(n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        b3 b3Var = ((n1) q2Var.f482a).f35675m;
        n1.m14084k(b3Var);
        x2 x2Var = b3Var.f35289c;
        m4018g(x2Var != null ? x2Var.f35923b : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenName(n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        b3 b3Var = ((n1) q2Var.f482a).f35675m;
        n1.m14084k(b3Var);
        x2 x2Var = b3Var.f35289c;
        m4018g(x2Var != null ? x2Var.f35922a : null, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getGmpAppId(n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m4018g(q2Var.b0(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getMaxUserProperties(String str, n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        AbstractC6840z.m13033d(str);
        ((n1) q2Var.f482a).getClass();
        m4017f();
        l4 l4Var = this.f6714e.f35672j;
        n1.m14083i(l4Var);
        l4Var.x0(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getSessionId(n0 n0Var) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC8956c(q2Var, n0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getTestFlag(n0 n0Var, int i10) {
        m4017f();
        if (i10 == 0) {
            l4 l4Var = this.f6714e.f35672j;
            n1.m14083i(l4Var);
            q2 q2Var = this.f6714e.f35676n;
            n1.m14084k(q2Var);
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var = ((n1) q2Var.f482a).f35670g;
            n1.m14085m(m1Var);
            l4Var.v0((String) m1Var.m14048W(atomicReference, 15000L, "String test flag value", new i2(q2Var, atomicReference, 1)), n0Var);
            return;
        }
        if (i10 == 1) {
            l4 l4Var2 = this.f6714e.f35672j;
            n1.m14083i(l4Var2);
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            m1 m1Var2 = ((n1) q2Var2.f482a).f35670g;
            n1.m14085m(m1Var2);
            l4Var2.w0(n0Var, ((Long) m1Var2.m14048W(atomicReference2, 15000L, "long test flag value", new k2(q2Var2, atomicReference2, 0))).longValue());
            return;
        }
        if (i10 == 2) {
            l4 l4Var3 = this.f6714e.f35672j;
            n1.m14083i(l4Var3);
            q2 q2Var3 = this.f6714e.f35676n;
            n1.m14084k(q2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            m1 m1Var3 = ((n1) q2Var3.f482a).f35670g;
            n1.m14085m(m1Var3);
            double dDoubleValue = ((Double) m1Var3.m14048W(atomicReference3, 15000L, "double test flag value", new k2(q2Var3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                n0Var.mo3311E(bundle);
                return;
            } catch (RemoteException e2) {
                v0 v0Var = ((n1) l4Var3.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(e2, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            l4 l4Var4 = this.f6714e.f35672j;
            n1.m14083i(l4Var4);
            q2 q2Var4 = this.f6714e.f35676n;
            n1.m14084k(q2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            m1 m1Var4 = ((n1) q2Var4.f482a).f35670g;
            n1.m14085m(m1Var4);
            l4Var4.x0(n0Var, ((Integer) m1Var4.m14048W(atomicReference4, 15000L, "int test flag value", new i2(q2Var4, atomicReference4, 2))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        l4 l4Var5 = this.f6714e.f35672j;
        n1.m14083i(l4Var5);
        q2 q2Var5 = this.f6714e.f35676n;
        n1.m14084k(q2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        m1 m1Var5 = ((n1) q2Var5.f482a).f35670g;
        n1.m14085m(m1Var5);
        l4Var5.z0(n0Var, ((Boolean) m1Var5.m14048W(atomicReference5, 15000L, "boolean test flag value", new i2(q2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getUserProperties(String str, String str2, boolean z6, n0 n0Var) {
        m4017f();
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new f2(this, n0Var, str, str2, z6));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initForTests(Map map) {
        m4017f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initialize(InterfaceC0968a interfaceC0968a, u0 u0Var, long j6) {
        n1 n1Var = this.f6714e;
        if (n1Var == null) {
            Context context = (Context) BinderC0969b.m2727S(interfaceC0968a);
            AbstractC6840z.m13036g(context);
            this.f6714e = n1.m14086s(context, u0Var, Long.valueOf(j6));
        } else {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14140a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void isDataCollectionEnabled(n0 n0Var) {
        m4017f();
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC8956c(21, this, n0Var, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m14120R(str, str2, bundle, z6, z10, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j6) {
        m4017f();
        AbstractC6840z.m13033d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C7449t c7449t = new C7449t(str2, new C7448s(bundle), "app", j6);
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new b1(5, this, n0Var, c7449t, str, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logHealthData(int i10, String str, InterfaceC0968a interfaceC0968a, InterfaceC0968a interfaceC0968a2, InterfaceC0968a interfaceC0968a3) {
        m4017f();
        Object objM2727S = interfaceC0968a == null ? null : BinderC0969b.m2727S(interfaceC0968a);
        Object objM2727S2 = interfaceC0968a2 == null ? null : BinderC0969b.m2727S(interfaceC0968a2);
        Object objM2727S3 = interfaceC0968a3 != null ? BinderC0969b.m2727S(interfaceC0968a3) : null;
        v0 v0Var = this.f6714e.f35669f;
        n1.m14085m(v0Var);
        v0Var.m14164V(i10, true, false, str, objM2727S, objM2727S2, objM2727S3);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreated(InterfaceC0968a interfaceC0968a, Bundle bundle, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityCreatedByScionActivityInfo(w0.m3730b(activity), bundle, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m2 m2Var = q2Var.f35770c;
        if (m2Var != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
            m2Var.m14061j(w0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyed(InterfaceC0968a interfaceC0968a, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityDestroyedByScionActivityInfo(w0.m3730b(activity), j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m2 m2Var = q2Var.f35770c;
        if (m2Var != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
            m2Var.m14062k(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPaused(InterfaceC0968a interfaceC0968a, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityPausedByScionActivityInfo(w0.m3730b(activity), j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPausedByScionActivityInfo(w0 w0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m2 m2Var = q2Var.f35770c;
        if (m2Var != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
            m2Var.m14063l(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumed(InterfaceC0968a interfaceC0968a, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityResumedByScionActivityInfo(w0.m3730b(activity), j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumedByScionActivityInfo(w0 w0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m2 m2Var = q2Var.f35770c;
        if (m2Var != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
            m2Var.m14064m(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceState(InterfaceC0968a interfaceC0968a, n0 n0Var, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(w0.m3730b(activity), n0Var, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, n0 n0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m2 m2Var = q2Var.f35770c;
        Bundle bundle = new Bundle();
        if (m2Var != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
            m2Var.m14065n(w0Var, bundle);
        }
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = this.f6714e.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStarted(InterfaceC0968a interfaceC0968a, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityStartedByScionActivityInfo(w0.m3730b(activity), j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStartedByScionActivityInfo(w0 w0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        if (q2Var.f35770c != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStopped(InterfaceC0968a interfaceC0968a, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        onActivityStoppedByScionActivityInfo(w0.m3730b(activity), j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStoppedByScionActivityInfo(w0 w0Var, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        if (q2Var.f35770c != null) {
            q2 q2Var2 = this.f6714e.f35676n;
            n1.m14084k(q2Var2);
            q2Var2.f0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void performAction(Bundle bundle, n0 n0Var, long j6) {
        m4017f();
        n0Var.mo3311E(null);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void registerOnMeasurementEventListener(r0 r0Var) {
        Object m4Var;
        m4017f();
        C1903e c1903e = this.f6715f;
        synchronized (c1903e) {
            try {
                m4Var = (a2) c1903e.get(Integer.valueOf(r0Var.mo3313c()));
                if (m4Var == null) {
                    m4Var = new m4(this, r0Var);
                    c1903e.put(Integer.valueOf(r0Var.mo3313c()), m4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m13936N();
        if (q2Var.f35772e.add(m4Var)) {
            return;
        }
        v0 v0Var = ((n1) q2Var.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35865j.m14140a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void resetAnalyticsData(long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.f35774g.set(null);
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new g2(q2Var, j6, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void retrieveAndUploadBatches(p0 p0Var) throws MalformedURLException {
        v2 v2Var;
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m13936N();
        n1 n1Var = (n1) q2Var.f482a;
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        if (m1Var.m14044S()) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        if (Thread.currentThread() == m1Var2.f35610d) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14140a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (C8687a.m16043t()) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35862f.m14140a("Cannot retrieve and upload batches from main thread");
            return;
        }
        v0 v0Var4 = n1Var.f35669f;
        n1.m14085m(v0Var4);
        v0Var4.f35870p.m14140a("[sgtm] Started client-side batch upload work.");
        boolean z6 = false;
        int size = 0;
        int i10 = 0;
        while (!z6) {
            v0 v0Var5 = n1Var.f35669f;
            n1.m14085m(v0Var5);
            v0Var5.f35870p.m14140a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var3 = n1Var.f35670g;
            n1.m14085m(m1Var3);
            m1Var3.m14048W(atomicReference, 10000L, "[sgtm] Getting upload batches", new i2(q2Var, atomicReference, 3));
            b4 b4Var = (b4) atomicReference.get();
            if (b4Var == null) {
                break;
            }
            List list = b4Var.f35299a;
            if (list.isEmpty()) {
                break;
            }
            v0 v0Var6 = n1Var.f35669f;
            n1.m14085m(v0Var6);
            v0Var6.f35870p.m14141b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                z3 z3Var = (z3) it.next();
                try {
                    URL url = new URI(z3Var.f36040c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    ug.n0 n0VarM14095r = ((n1) q2Var.f482a).m14095r();
                    n0VarM14095r.m13936N();
                    AbstractC6840z.m13036g(n0VarM14095r.f35645g);
                    String str = n0VarM14095r.f35645g;
                    n1 n1Var2 = (n1) q2Var.f482a;
                    v0 v0Var7 = n1Var2.f35669f;
                    n1.m14085m(v0Var7);
                    t0 t0Var = v0Var7.f35870p;
                    Long lValueOf = Long.valueOf(z3Var.f36038a);
                    t0Var.m14143d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, z3Var.f36040c, Integer.valueOf(z3Var.f36039b.length));
                    if (!TextUtils.isEmpty(z3Var.f36044g)) {
                        v0 v0Var8 = n1Var2.f35669f;
                        n1.m14085m(v0Var8);
                        v0Var8.f35870p.m14142c("[sgtm] Uploading data from app. row_id", lValueOf, z3Var.f36044g);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = z3Var.f36041d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    t2 t2Var = n1Var2.f35678q;
                    n1.m14085m(t2Var);
                    byte[] bArr = z3Var.f36039b;
                    C7439j c7439j = new C7439j(2, q2Var, atomicReference2, z3Var);
                    t2Var.m14144O();
                    AbstractC6840z.m13036g(url);
                    AbstractC6840z.m13036g(bArr);
                    m1 m1Var4 = ((n1) t2Var.f482a).f35670g;
                    n1.m14085m(m1Var4);
                    m1Var4.m14050Y(new x0(t2Var, str, url, bArr, map, c7439j));
                    try {
                        l4 l4Var = n1Var2.f35672j;
                        n1.m14083i(l4Var);
                        n1 n1Var3 = (n1) l4Var.f482a;
                        n1Var3.f35674l.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    n1Var3.f35674l.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        v0 v0Var9 = ((n1) q2Var.f482a).f35669f;
                        n1.m14085m(v0Var9);
                        v0Var9.f35865j.m14140a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    v2Var = atomicReference2.get() == null ? v2.UNKNOWN : (v2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e2) {
                    v0 v0Var10 = ((n1) q2Var.f482a).f35669f;
                    n1.m14085m(v0Var10);
                    v0Var10.f35862f.m14143d("[sgtm] Bad upload url for row_id", z3Var.f36040c, Long.valueOf(z3Var.f36038a), e2);
                    v2Var = v2.FAILURE;
                }
                if (v2Var != v2.SUCCESS) {
                    if (v2Var == v2.BACKOFF) {
                        z6 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        v0 v0Var11 = n1Var.f35669f;
        n1.m14085m(v0Var11);
        v0Var11.f35870p.m14142c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        try {
            p0Var.mo3184a();
        } catch (RemoteException e10) {
            n1 n1Var4 = this.f6714e;
            AbstractC6840z.m13036g(n1Var4);
            v0 v0Var12 = n1Var4.f35669f;
            n1.m14085m(v0Var12);
            v0Var12.f35865j.m14141b(e10, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConditionalUserProperty(Bundle bundle, long j6) {
        m4017f();
        if (bundle == null) {
            v0 v0Var = this.f6714e.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Conditional user property must not be null");
        } else {
            q2 q2Var = this.f6714e.f35676n;
            n1.m14084k(q2Var);
            q2Var.m14128Z(bundle, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsentThirdParty(Bundle bundle, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.g0(bundle, -20, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setCurrentScreen(InterfaceC0968a interfaceC0968a, String str, String str2, long j6) {
        m4017f();
        Activity activity = (Activity) BinderC0969b.m2727S(interfaceC0968a);
        AbstractC6840z.m13036g(activity);
        setCurrentScreenByScionActivityInfo(w0.m3730b(activity), str, str2, j6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0 r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDataCollectionEnabled(boolean z6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m13936N();
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new e2(q2Var, z6));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDefaultEventParameters(Bundle bundle) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new j2(q2Var, bundle2, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setEventInterceptor(r0 r0Var) {
        m4017f();
        C0917l c0917l = new C0917l(18, this, r0Var, false);
        m1 m1Var = this.f6714e.f35670g;
        n1.m14085m(m1Var);
        if (!m1Var.m14044S()) {
            m1 m1Var2 = this.f6714e.f35670g;
            n1.m14085m(m1Var2);
            m1Var2.m14047V(new RunnableC4307g(19, this, c0917l, false));
            return;
        }
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.mo325M();
        q2Var.m13936N();
        C0917l c0917l2 = q2Var.f35771d;
        if (c0917l != c0917l2) {
            AbstractC6840z.m13038i("EventInterceptor already set.", c0917l2 == null);
        }
        q2Var.f35771d = c0917l;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.t0 t0Var) {
        m4017f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMeasurementEnabled(boolean z6, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        Boolean boolValueOf = Boolean.valueOf(z6);
        q2Var.m13936N();
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new RunnableC4307g(18, q2Var, boolValueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMinimumSessionDuration(long j6) {
        m4017f();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSessionTimeoutDuration(long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        m1 m1Var = ((n1) q2Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new g2(q2Var, j6, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSgtmDebugInfo(Intent intent) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        n1 n1Var = (n1) q2Var.f482a;
        Uri data = intent.getData();
        if (data == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35868m.m14140a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35868m.m14140a("[sgtm] Preview Mode was not enabled.");
            n1Var.f35667d.f35445c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        v0 v0Var3 = n1Var.f35669f;
        n1.m14085m(v0Var3);
        v0Var3.f35868m.m14141b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        n1Var.f35667d.f35445c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserId(String str, long j6) {
        m4017f();
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        n1 n1Var = (n1) q2Var.f482a;
        if (str != null && TextUtils.isEmpty(str)) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14140a("User ID must be non-empty or null");
        } else {
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new RunnableC8956c(19, q2Var, str));
            q2Var.m14125W(null, TransferTable.COLUMN_ID, str, true, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserProperty(String str, String str2, InterfaceC0968a interfaceC0968a, boolean z6, long j6) throws SecurityException {
        m4017f();
        Object objM2727S = BinderC0969b.m2727S(interfaceC0968a);
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m14125W(str, str2, objM2727S, z6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void unregisterOnMeasurementEventListener(r0 r0Var) {
        Object m4Var;
        m4017f();
        C1903e c1903e = this.f6715f;
        synchronized (c1903e) {
            m4Var = (a2) c1903e.remove(Integer.valueOf(r0Var.mo3313c()));
        }
        if (m4Var == null) {
            m4Var = new m4(this, r0Var);
        }
        q2 q2Var = this.f6714e.f35676n;
        n1.m14084k(q2Var);
        q2Var.m13936N();
        if (q2Var.f35772e.remove(m4Var)) {
            return;
        }
        v0 v0Var = ((n1) q2Var.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35865j.m14140a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsent(Bundle bundle, long j6) {
    }
}
