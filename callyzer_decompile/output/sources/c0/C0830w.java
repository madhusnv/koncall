package c0;

import i0.v2;
import i0.w2;
import i0.y2;
import java.util.UUID;
import m0.InterfaceC4617k;
import u0.C7294d;
import u0.C7295e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.w */
/* loaded from: classes.dex */
public final class C0830w implements v2 {

    /* renamed from: a */
    public final i0.j1 f5255a;

    public C0830w(i0.j1 j1Var) {
        Object objMo7406k;
        this.f5255a = j1Var;
        Object objMo7406k2 = null;
        try {
            objMo7406k = j1Var.mo7406k(InterfaceC4617k.N0);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        Class cls = (Class) objMo7406k;
        if (cls != null && !cls.equals(C7294d.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.f5255a.m7352n(w2.C0, y2.STREAM_SHARING);
        i0.j1 j1Var2 = this.f5255a;
        j1Var2.m7352n(InterfaceC4617k.N0, C7294d.class);
        try {
            objMo7406k2 = j1Var2.mo7406k(InterfaceC4617k.M0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo7406k2 == null) {
            j1Var2.m7352n(InterfaceC4617k.M0, C7294d.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // c0.b0
    /* renamed from: a */
    public i0.i1 mo1513a() {
        return this.f5255a;
    }

    @Override // i0.v2
    /* renamed from: b */
    public w2 mo1514b() {
        return new C7295e(i0.o1.m7399a(this.f5255a));
    }

    public C0830w() {
        Object objMo7406k;
        i0.j1 j1VarM7349b = i0.j1.m7349b();
        this.f5255a = j1VarM7349b;
        Object objMo7406k2 = null;
        try {
            objMo7406k = j1VarM7349b.mo7406k(InterfaceC4617k.N0);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        Class cls = (Class) objMo7406k;
        if (cls != null && !cls.equals(C0829v.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        i0.j1 j1Var = this.f5255a;
        j1Var.m7352n(InterfaceC4617k.N0, C0829v.class);
        try {
            objMo7406k2 = j1Var.mo7406k(InterfaceC4617k.M0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo7406k2 == null) {
            j1Var.m7352n(InterfaceC4617k.M0, C0829v.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
