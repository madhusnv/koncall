package g1;

import a2.C0037j;
import androidx.compose.animation.AbstractC0236c;
import b2.C0566x;
import ex.InterfaceC2137a;
import h1.l1;
import h1.m1;
import h1.s1;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6754j;
import s4.C6756l;
import s4.EnumC6757m;
import w2.C7864c;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends a1 {

    /* renamed from: B */
    public InterfaceC7866e f11073B;

    /* renamed from: C */
    public final s0 f11074C;

    /* renamed from: D */
    public final s0 f11075D;

    /* renamed from: q */
    public s1 f11076q;

    /* renamed from: r */
    public m1 f11077r;

    /* renamed from: s */
    public m1 f11078s;

    /* renamed from: t */
    public m1 f11079t;

    /* renamed from: v */
    public u0 f11080v;

    /* renamed from: w */
    public v0 f11081w;

    /* renamed from: x */
    public InterfaceC2137a f11082x;

    /* renamed from: y */
    public g0 f11083y;

    /* renamed from: z */
    public long f11084z = AbstractC0236c.f1883a;

    public t0(s1 s1Var, m1 m1Var, m1 m1Var2, m1 m1Var3, u0 u0Var, v0 v0Var, InterfaceC2137a interfaceC2137a, g0 g0Var) {
        this.f11076q = s1Var;
        this.f11077r = m1Var;
        this.f11078s = m1Var2;
        this.f11079t = m1Var3;
        this.f11080v = u0Var;
        this.f11081w = v0Var;
        this.f11082x = interfaceC2137a;
        this.f11083y = g0Var;
        AbstractC6746b.m12924b(0, 0, 15);
        this.f11074C = new s0(this, 0);
        this.f11075D = new s0(this, 1);
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        this.f11084z = AbstractC0236c.f1883a;
    }

    public final InterfaceC7866e L0() {
        InterfaceC7866e interfaceC7866e;
        InterfaceC7866e interfaceC7866e2;
        if (this.f11076q.m6857f().m6841b(f0.PreEnter, f0.Visible)) {
            C2446z c2446z = this.f11080v.f11095a.f11019c;
            if (c2446z != null && (interfaceC7866e2 = c2446z.f11120a) != null) {
                return interfaceC7866e2;
            }
            C2446z c2446z2 = this.f11081w.f11104a.f11019c;
            if (c2446z2 != null) {
                return c2446z2.f11120a;
            }
            return null;
        }
        C2446z c2446z3 = this.f11081w.f11104a.f11019c;
        if (c2446z3 != null && (interfaceC7866e = c2446z3.f11120a) != null) {
            return interfaceC7866e;
        }
        C2446z c2446z4 = this.f11080v.f11095a.f11019c;
        if (c2446z4 != null) {
            return c2446z4.f11120a;
        }
        return null;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        long j10;
        if (this.f11076q.f15588a.mo345y() == this.f11076q.f15591d.getValue()) {
            this.f11073B = null;
        } else if (this.f11073B == null) {
            InterfaceC7866e interfaceC7866eL0 = L0();
            if (interfaceC7866eL0 == null) {
                interfaceC7866eL0 = C7864c.f37642a;
            }
            this.f11073B = interfaceC7866eL0;
        }
        boolean zMo12874R = l0Var.mo12874R();
        C6669s c6669s = C6669s.f31944a;
        if (zMo12874R) {
            t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
            long j11 = (w0VarMo13314z.f34030a << 32) | (w0VarMo13314z.f34031b & 4294967295L);
            this.f11084z = j11;
            return l0Var.g0((int) (j11 >> 32), (int) (4294967295L & j11), c6669s, new C0037j(w0VarMo13314z, 4));
        }
        if (!((Boolean) this.f11082x.invoke()).booleanValue()) {
            t3.w0 w0VarMo13314z2 = i0Var.mo13314z(j6);
            return l0Var.g0(w0VarMo13314z2.f34030a, w0VarMo13314z2.f34031b, c6669s, new C0037j(w0VarMo13314z2, 5));
        }
        g0 g0Var = this.f11083y;
        m1 m1Var = g0Var.f10989a;
        m1 m1Var2 = g0Var.f10990b;
        s1 s1Var = g0Var.f10991c;
        u0 u0Var = g0Var.f10992d;
        v0 v0Var = g0Var.f10993e;
        m1 m1Var3 = g0Var.f10994f;
        l1 l1VarM6838a = m1Var != null ? m1Var.m6838a(new h0(u0Var, v0Var, 0), new h0(u0Var, v0Var, 1)) : null;
        l1 l1VarM6838a2 = m1Var2 != null ? m1Var2.m6838a(new h0(u0Var, v0Var, 2), new h0(u0Var, v0Var, 3)) : null;
        if (s1Var.f15588a.mo345y() == f0.PreEnter) {
            i1 i1Var = v0Var.f11104a;
        } else {
            i1 i1Var2 = v0Var.f11104a;
        }
        C0566x c0566x = new C0566x(6, l1VarM6838a, l1VarM6838a2, m1Var3 != null ? m1Var3.m6838a(C2423c.f10938k, new C0566x(7, l1VarM6838a, u0Var, v0Var)) : null);
        t3.w0 w0VarMo13314z3 = i0Var.mo13314z(j6);
        long j12 = (w0VarMo13314z3.f34031b & 4294967295L) | (w0VarMo13314z3.f34030a << 32);
        long j13 = !C6756l.m12948a(this.f11084z, AbstractC0236c.f1883a) ? this.f11084z : j12;
        m1 m1Var4 = this.f11077r;
        l1VarM6838a = m1Var4 != null ? m1Var4.m6838a(this.f11074C, new r0(this, j13, 0)) : null;
        if (l1VarM6838a != null) {
            j12 = ((C6756l) l1VarM6838a.getValue()).f32210a;
        }
        long jM12926d = AbstractC6746b.m12926d(j6, j12);
        m1 m1Var5 = this.f11078s;
        long jMo14848a = 0;
        long j14 = m1Var5 != null ? ((C6754j) m1Var5.m6838a(C2423c.f10943q, new r0(this, j13, 1)).getValue()).f32204a : 0L;
        m1 m1Var6 = this.f11079t;
        long j15 = m1Var6 != null ? ((C6754j) m1Var6.m6838a(this.f11075D, new r0(this, j13, 2)).getValue()).f32204a : 0L;
        InterfaceC7866e interfaceC7866e = this.f11073B;
        if (interfaceC7866e != null) {
            long j16 = j13;
            j10 = j15;
            jMo14848a = interfaceC7866e.mo14848a(j16, jM12926d, EnumC6757m.Ltr);
        } else {
            j10 = j15;
        }
        return l0Var.g0((int) (jM12926d >> 32), (int) (jM12926d & 4294967295L), c6669s, new q0(w0VarMo13314z3, C6754j.m12942c(jMo14848a, j10), j14, c0566x, 0));
    }
}
