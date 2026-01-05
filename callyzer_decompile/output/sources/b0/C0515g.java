package b0;

import a1.C0004c;
import c0.b0;
import c0.j0;
import c0.v0;
import i0.i1;
import i0.j1;
import i0.o1;
import i0.s0;
import i0.v2;
import i0.w2;
import i0.y0;
import i0.y2;
import i0.z0;
import java.util.UUID;
import m0.InterfaceC4617k;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b0.g */
/* loaded from: classes.dex */
public final class C0515g implements b0, v2 {

    /* renamed from: a */
    public final /* synthetic */ int f3582a;

    /* renamed from: b */
    public final j1 f3583b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0515g(int i10) {
        this(j1.m7349b(), 2);
        this.f3582a = i10;
        switch (i10) {
            case 1:
                this(j1.m7349b(), 1);
                break;
            case 2:
                break;
            default:
                this.f3583b = j1.m7349b();
                break;
        }
    }

    /* renamed from: d */
    public static C0515g m1512d(s0 s0Var) {
        C0515g c0515g = new C0515g(0);
        s0Var.mo7402f(new C0004c(2, c0515g, s0Var));
        return c0515g;
    }

    @Override // c0.b0
    /* renamed from: a */
    public final i1 mo1513a() {
        switch (this.f3582a) {
            case 0:
                throw null;
            case 1:
                return this.f3583b;
            default:
                return this.f3583b;
        }
    }

    @Override // i0.v2
    /* renamed from: b */
    public w2 mo1514b() {
        switch (this.f3582a) {
            case 1:
                return new y0(o1.m7399a(this.f3583b));
            default:
                return new z0(o1.m7399a(this.f3583b));
        }
    }

    /* renamed from: c */
    public C8989c m1515c() {
        return new C8989c(3, o1.m7399a(this.f3583b));
    }

    public C0515g(j1 j1Var, int i10) {
        Object objMo7406k;
        Object objMo7406k2;
        this.f3582a = i10;
        switch (i10) {
            case 2:
                this.f3583b = j1Var;
                Object objMo7406k3 = null;
                try {
                    objMo7406k = j1Var.mo7406k(InterfaceC4617k.N0);
                } catch (IllegalArgumentException unused) {
                    objMo7406k = null;
                }
                Class cls = (Class) objMo7406k;
                if (cls != null && !cls.equals(v0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.f3583b.m7352n(w2.C0, y2.IMAGE_CAPTURE);
                j1 j1Var2 = this.f3583b;
                j1Var2.m7352n(InterfaceC4617k.N0, v0.class);
                try {
                    objMo7406k3 = j1Var2.mo7406k(InterfaceC4617k.M0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objMo7406k3 == null) {
                    this.f3583b.m7352n(InterfaceC4617k.M0, v0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.f3583b = j1Var;
                Object objMo7406k4 = null;
                try {
                    objMo7406k2 = j1Var.mo7406k(InterfaceC4617k.N0);
                } catch (IllegalArgumentException unused3) {
                    objMo7406k2 = null;
                }
                Class cls2 = (Class) objMo7406k2;
                if (cls2 != null && !cls2.equals(j0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.f3583b.m7352n(w2.C0, y2.IMAGE_ANALYSIS);
                j1 j1Var3 = this.f3583b;
                j1Var3.m7352n(InterfaceC4617k.N0, j0.class);
                try {
                    objMo7406k4 = j1Var3.mo7406k(InterfaceC4617k.M0);
                } catch (IllegalArgumentException unused4) {
                }
                if (objMo7406k4 == null) {
                    j1Var3.m7352n(InterfaceC4617k.M0, j0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
