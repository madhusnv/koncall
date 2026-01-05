package t3;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import s4.C6754j;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a */
    public boolean f34028a;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m13316a(v0 v0Var, w0 w0Var) {
        v0Var.getClass();
        if (w0Var instanceof v3.b1) {
            ((v3.b1) w0Var).mo14532E(v0Var.f34028a);
        }
    }

    /* renamed from: f */
    public static void m13318f(v0 v0Var, w0 w0Var, long j6) {
        v0Var.getClass();
        m13316a(v0Var, w0Var);
        w0Var.k0(C6754j.m12942c(j6, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, null);
    }

    /* renamed from: g */
    public static void m13319g(v0 v0Var, w0 w0Var, int i10, int i11) {
        long j6 = (i10 << 32) | (i11 & 4294967295L);
        if (v0Var.mo13293b() == EnumC6757m.Ltr || v0Var.mo13294c() == 0) {
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c(j6, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, null);
        } else {
            int iMo13294c = (v0Var.mo13294c() - w0Var.f34030a) - ((int) (j6 >> 32));
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c((iMo13294c << 32) | (((int) (j6 & 4294967295L)) & 4294967295L), w0Var.f34034e), DefinitionKt.NO_Float_VALUE, null);
        }
    }

    /* renamed from: h */
    public static void m13320h(v0 v0Var, w0 w0Var, int i10, int i11) {
        int i12 = y0.f34047b;
        x0 x0Var = x0.f34037b;
        long j6 = (i10 << 32) | (i11 & 4294967295L);
        if (v0Var.mo13293b() == EnumC6757m.Ltr || v0Var.mo13294c() == 0) {
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c(j6, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, x0Var);
        } else {
            int iMo13294c = (v0Var.mo13294c() - w0Var.f34030a) - ((int) (j6 >> 32));
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c((iMo13294c << 32) | (((int) (j6 & 4294967295L)) & 4294967295L), w0Var.f34034e), DefinitionKt.NO_Float_VALUE, x0Var);
        }
    }

    /* renamed from: i */
    public static void m13321i(v0 v0Var, w0 w0Var, long j6) {
        int i10 = y0.f34047b;
        x0 x0Var = x0.f34037b;
        if (v0Var.mo13293b() == EnumC6757m.Ltr || v0Var.mo13294c() == 0) {
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c(j6, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, x0Var);
        } else {
            int iMo13294c = (v0Var.mo13294c() - w0Var.f34030a) - ((int) (j6 >> 32));
            m13316a(v0Var, w0Var);
            w0Var.k0(C6754j.m12942c((((int) (j6 & 4294967295L)) & 4294967295L) | (iMo13294c << 32), w0Var.f34034e), DefinitionKt.NO_Float_VALUE, x0Var);
        }
    }

    /* renamed from: l */
    public static void m13323l(v0 v0Var, w0 w0Var, long j6) {
        int i10 = y0.f34047b;
        x0 x0Var = x0.f34037b;
        v0Var.getClass();
        m13316a(v0Var, w0Var);
        w0Var.k0(C6754j.m12942c(j6, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, x0Var);
    }

    /* renamed from: b */
    public abstract EnumC6757m mo13293b();

    /* renamed from: c */
    public abstract int mo13294c();

    /* renamed from: d */
    public final void m13324d(w0 w0Var, int i10, int i11, float f6) {
        m13316a(this, w0Var);
        w0Var.k0(C6754j.m12942c((i11 & 4294967295L) | (i10 << 32), w0Var.f34034e), f6, null);
    }

    /* renamed from: j */
    public final void m13325j(w0 w0Var, int i10, int i11, float f6, InterfaceC2139c interfaceC2139c) {
        m13316a(this, w0Var);
        w0Var.k0(C6754j.m12942c((i11 & 4294967295L) | (i10 << 32), w0Var.f34034e), f6, interfaceC2139c);
    }
}
