package ug;

import android.os.Bundle;
import android.os.SystemClock;
import com.sun.mail.imap.IMAPStore;
import java.util.concurrent.ConcurrentHashMap;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b3 extends h0 {

    /* renamed from: c */
    public volatile x2 f35289c;

    /* renamed from: d */
    public volatile x2 f35290d;

    /* renamed from: e */
    public x2 f35291e;

    /* renamed from: f */
    public final ConcurrentHashMap f35292f;

    /* renamed from: g */
    public com.google.android.gms.internal.measurement.w0 f35293g;

    /* renamed from: h */
    public volatile boolean f35294h;

    /* renamed from: j */
    public volatile x2 f35295j;

    /* renamed from: k */
    public x2 f35296k;

    /* renamed from: l */
    public boolean f35297l;

    /* renamed from: m */
    public final Object f35298m;

    public b3(n1 n1Var) {
        super(n1Var);
        this.f35298m = new Object();
        this.f35292f = new ConcurrentHashMap();
    }

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return false;
    }

    /* renamed from: Q */
    public final void m13840Q(x2 x2Var, boolean z6, long j6) {
        n1 n1Var = (n1) this.f482a;
        c0 c0Var = n1Var.f35677p;
        n1.m14082h(c0Var);
        n1Var.f35674l.getClass();
        c0Var.m13852P(SystemClock.elapsedRealtime());
        boolean z10 = x2Var != null && x2Var.f35925d;
        s3 s3Var = n1Var.f35671h;
        n1.m14084k(s3Var);
        if (!s3Var.f35825f.m6803d(j6, z10, z6) || x2Var == null) {
            return;
        }
        x2Var.f35925d = false;
    }

    /* renamed from: R */
    public final x2 m13841R(com.google.android.gms.internal.measurement.w0 w0Var) {
        AbstractC6840z.m13036g(w0Var);
        Integer numValueOf = Integer.valueOf(w0Var.f6426a);
        ConcurrentHashMap concurrentHashMap = this.f35292f;
        x2 x2Var = (x2) concurrentHashMap.get(numValueOf);
        if (x2Var == null) {
            String strM13843T = m13843T(w0Var.f6427b);
            l4 l4Var = ((n1) this.f482a).f35672j;
            n1.m14083i(l4Var);
            x2 x2Var2 = new x2(null, strM13843T, l4Var.J0());
            concurrentHashMap.put(numValueOf, x2Var2);
            x2Var = x2Var2;
        }
        return this.f35295j != null ? this.f35295j : x2Var;
    }

    /* renamed from: S */
    public final x2 m13842S(boolean z6) {
        m13936N();
        mo325M();
        if (!z6) {
            return this.f35291e;
        }
        x2 x2Var = this.f35291e;
        return x2Var != null ? x2Var : this.f35296k;
    }

    /* renamed from: T */
    public final String m13843T(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        n1 n1Var = (n1) this.f482a;
        int length2 = str2.length();
        n1Var.f35667d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        n1Var.f35667d.getClass();
        return str2.substring(0, 500);
    }

    /* renamed from: U */
    public final void m13844U(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((n1) this.f482a).f35667d.a0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f35292f.put(Integer.valueOf(w0Var.f6426a), new x2(bundle2.getString(IMAPStore.ID_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: V */
    public final void m13845V(String str, x2 x2Var, boolean z6) {
        x2 x2Var2;
        x2 x2Var3 = this.f35289c == null ? this.f35290d : this.f35289c;
        if (x2Var.f35923b == null) {
            x2Var2 = new x2(x2Var.f35922a, str != null ? m13843T(str) : null, x2Var.f35924c, x2Var.f35926e, x2Var.f35927f);
        } else {
            x2Var2 = x2Var;
        }
        this.f35290d = this.f35289c;
        this.f35289c = x2Var2;
        n1 n1Var = (n1) this.f482a;
        n1Var.f35674l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new y2(this, x2Var2, x2Var3, jElapsedRealtime, z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13846W(ug.x2 r18, ug.x2 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.b3.m13846W(ug.x2, ug.x2, long, boolean, android.os.Bundle):void");
    }
}
