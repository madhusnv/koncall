package sg;

import android.os.Bundle;
import android.os.SystemClock;
import c6.b1;
import e1.C1903e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import sf.AbstractC6840z;
import ug.b3;
import ug.c0;
import ug.f2;
import ug.j4;
import ug.l4;
import ug.m1;
import ug.n1;
import ug.q2;
import ug.v0;
import ug.x2;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sg.a */
/* loaded from: classes.dex */
public final class C6841a extends AbstractC6843c {

    /* renamed from: a */
    public final n1 f32503a;

    /* renamed from: b */
    public final q2 f32504b;

    public C6841a(n1 n1Var) {
        AbstractC6840z.m13036g(n1Var);
        this.f32503a = n1Var;
        q2 q2Var = n1Var.f35676n;
        n1.m14084k(q2Var);
        this.f32504b = q2Var;
    }

    @Override // ug.r2
    /* renamed from: a */
    public final String mo9662a() {
        b3 b3Var = ((n1) this.f32504b.f482a).f35675m;
        n1.m14084k(b3Var);
        x2 x2Var = b3Var.f35289c;
        if (x2Var != null) {
            return x2Var.f35922a;
        }
        return null;
    }

    @Override // ug.r2
    /* renamed from: b */
    public final String mo9663b() {
        b3 b3Var = ((n1) this.f32504b.f482a).f35675m;
        n1.m14084k(b3Var);
        x2 x2Var = b3Var.f35289c;
        if (x2Var != null) {
            return x2Var.f35923b;
        }
        return null;
    }

    @Override // ug.r2
    /* renamed from: c */
    public final void mo9664c(Bundle bundle) {
        q2 q2Var = this.f32504b;
        ((n1) q2Var.f482a).f35674l.getClass();
        q2Var.m14128Z(bundle, System.currentTimeMillis());
    }

    @Override // ug.r2
    /* renamed from: d */
    public final void mo9665d(String str) {
        n1 n1Var = this.f32503a;
        c0 c0Var = n1Var.f35677p;
        n1.m14082h(c0Var);
        n1Var.f35674l.getClass();
        c0Var.m13851O(str, SystemClock.elapsedRealtime());
    }

    @Override // ug.r2
    /* renamed from: e */
    public final void mo9666e(String str, String str2, Bundle bundle) {
        q2 q2Var = this.f32504b;
        ((n1) q2Var.f482a).f35674l.getClass();
        q2Var.m14120R(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // ug.r2
    /* renamed from: f */
    public final void mo9667f(String str) {
        n1 n1Var = this.f32503a;
        c0 c0Var = n1Var.f35677p;
        n1.m14082h(c0Var);
        n1Var.f35674l.getClass();
        c0Var.m13850N(str, SystemClock.elapsedRealtime());
    }

    @Override // ug.r2
    /* renamed from: g */
    public final long mo9668g() {
        l4 l4Var = this.f32503a.f35672j;
        n1.m14083i(l4Var);
        return l4Var.J0();
    }

    @Override // ug.r2
    /* renamed from: h */
    public final void mo9669h(String str, String str2, Bundle bundle) {
        q2 q2Var = this.f32503a.f35676n;
        n1.m14084k(q2Var);
        q2Var.a0(str, str2, bundle);
    }

    @Override // ug.r2
    /* renamed from: i */
    public final List mo9670i(String str, String str2) {
        q2 q2Var = this.f32504b;
        n1 n1Var = (n1) q2Var.f482a;
        m1 m1Var = n1Var.f35670g;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(m1Var);
        if (m1Var.m14044S()) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C8687a.m16043t()) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.m14048W(atomicReference, 5000L, "get conditional user properties", new b1(q2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return l4.C0(list);
        }
        n1.m14085m(v0Var);
        v0Var.f35862f.m14141b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // ug.r2
    /* renamed from: j */
    public final int mo9671j(String str) {
        q2 q2Var = this.f32504b;
        q2Var.getClass();
        AbstractC6840z.m13033d(str);
        ((n1) q2Var.f482a).getClass();
        return 25;
    }

    @Override // ug.r2
    /* renamed from: k */
    public final String mo9672k() {
        return (String) this.f32504b.f35774g.get();
    }

    @Override // ug.r2
    /* renamed from: l */
    public final String mo9673l() {
        return this.f32504b.b0();
    }

    @Override // ug.r2
    /* renamed from: m */
    public final Map mo9674m(String str, String str2, boolean z6) {
        q2 q2Var = this.f32504b;
        n1 n1Var = (n1) q2Var.f482a;
        m1 m1Var = n1Var.f35670g;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(m1Var);
        if (m1Var.m14044S()) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C8687a.m16043t()) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.m14048W(atomicReference, 5000L, "get user properties", new f2(q2Var, atomicReference, str, str2, z6));
        List<j4> list = (List) atomicReference.get();
        if (list == null) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(Boolean.valueOf(z6), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C1903e c1903e = new C1903e(list.size());
        for (j4 j4Var : list) {
            Object objM14016b = j4Var.m14016b();
            if (objM14016b != null) {
                c1903e.put(j4Var.f35549b, objM14016b);
            }
        }
        return c1903e;
    }
}
