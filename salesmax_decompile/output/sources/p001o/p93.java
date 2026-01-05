package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.e9b;
import p001o.lef;
import p001o.mz5;
import p001o.sga;
import p001o.xga;

/* loaded from: classes2.dex */
public class p93 implements t0f, lef, xga.InterfaceC18150b, xga.InterfaceC18154f {

    /* renamed from: H */
    public final s0f f39643H;

    /* renamed from: L */
    public final s0f[] f39644L;

    /* renamed from: M */
    public final ae1 f39645M;

    /* renamed from: Q */
    public k93 f39646Q;

    /* renamed from: X */
    public C2181a f39647X;

    /* renamed from: Y */
    public InterfaceC16035b f39648Y;

    /* renamed from: Z */
    public long f39649Z;

    /* renamed from: a */
    public final int f39650a;

    /* renamed from: b */
    public final int[] f39651b;

    /* renamed from: c */
    public final C2181a[] f39652c;

    /* renamed from: d */
    public final boolean[] f39653d;

    /* renamed from: e */
    public final q93 f39654e;

    /* renamed from: f */
    public final lef.InterfaceC15066a f39655f;

    /* renamed from: g */
    public final e9b.C13130a f39656g;

    /* renamed from: h */
    public final sga f39657h;
    public long h0;
    public int i0;
    public yd1 j0;
    public boolean k0;

    /* renamed from: q */
    public final xga f39658q;

    /* renamed from: s */
    public final m93 f39659s;

    /* renamed from: x */
    public final ArrayList f39660x;

    /* renamed from: y */
    public final List f39661y;

    /* renamed from: o.p93$a */
    public final class C16034a implements t0f {

        /* renamed from: a */
        public final p93 f39662a;

        /* renamed from: b */
        public final s0f f39663b;

        /* renamed from: c */
        public final int f39664c;

        /* renamed from: d */
        public boolean f39665d;

        public C16034a(p93 p93Var, s0f s0fVar, int i) {
            this.f39662a = p93Var;
            this.f39663b = s0fVar;
            this.f39664c = i;
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() {
        }

        /* renamed from: b */
        public final void m43241b() {
            if (this.f39665d) {
                return;
            }
            p93.this.f39656g.m24552h(p93.this.f39651b[this.f39664c], p93.this.f39652c[this.f39664c], 0, null, p93.this.h0);
            this.f39665d = true;
        }

        /* renamed from: c */
        public void m43242c() {
            op0.m42517g(p93.this.f39653d[this.f39664c]);
            p93.this.f39653d[this.f39664c] = false;
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            if (p93.this.m43227H()) {
                return -3;
            }
            if (p93.this.j0 != null && p93.this.j0.m57614g(this.f39664c + 1) <= this.f39663b.m47400D()) {
                return -3;
            }
            m43241b();
            return this.f39663b.m47414S(if7Var, a85Var, i, p93.this.k0);
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return !p93.this.m43227H() && this.f39663b.m47408L(p93.this.k0);
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            if (p93.this.m43227H()) {
                return 0;
            }
            int iM47402F = this.f39663b.m47402F(j, p93.this.k0);
            if (p93.this.j0 != null) {
                iM47402F = Math.min(iM47402F, p93.this.j0.m57614g(this.f39664c + 1) - this.f39663b.m47400D());
            }
            this.f39663b.e0(iM47402F);
            if (iM47402F > 0) {
                m43241b();
            }
            return iM47402F;
        }
    }

    /* renamed from: o.p93$b */
    public interface InterfaceC16035b {
        /* renamed from: a */
        void mo7001a(p93 p93Var);
    }

    public p93(int i, int[] iArr, C2181a[] c2181aArr, q93 q93Var, lef.InterfaceC15066a interfaceC15066a, ob0 ob0Var, long j, nz5 nz5Var, mz5.C15451a c15451a, sga sgaVar, e9b.C13130a c13130a) {
        this.f39650a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f39651b = iArr;
        this.f39652c = c2181aArr == null ? new C2181a[0] : c2181aArr;
        this.f39654e = q93Var;
        this.f39655f = interfaceC15066a;
        this.f39656g = c13130a;
        this.f39657h = sgaVar;
        this.f39658q = new xga("ChunkSampleStream");
        this.f39659s = new m93();
        ArrayList arrayList = new ArrayList();
        this.f39660x = arrayList;
        this.f39661y = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f39644L = new s0f[length];
        this.f39653d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        s0f[] s0fVarArr = new s0f[i3];
        s0f s0fVarM47395k = s0f.m47395k(ob0Var, nz5Var, c15451a);
        this.f39643H = s0fVarM47395k;
        iArr2[0] = i;
        s0fVarArr[0] = s0fVarM47395k;
        while (i2 < length) {
            s0f s0fVarM47396l = s0f.m47396l(ob0Var);
            this.f39644L[i2] = s0fVarM47396l;
            int i4 = i2 + 1;
            s0fVarArr[i4] = s0fVarM47396l;
            iArr2[i4] = this.f39651b[i2];
            i2 = i4;
        }
        this.f39645M = new ae1(iArr2, s0fVarArr);
        this.f39649Z = j;
        this.h0 = j;
    }

    /* renamed from: A */
    public final void m43220A(int i) {
        int iMin = Math.min(m43233N(i, 0), this.i0);
        if (iMin > 0) {
            sqi.Y0(this.f39660x, 0, iMin);
            this.i0 -= iMin;
        }
    }

    /* renamed from: B */
    public final void m43221B(int i) {
        op0.m42517g(!this.f39658q.m56266j());
        int size = this.f39660x.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!m43225F(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = m43224E().f31666h;
        yd1 yd1VarM43222C = m43222C(i);
        if (this.f39660x.isEmpty()) {
            this.f39649Z = this.h0;
        }
        this.k0 = false;
        this.f39656g.m24548C(this.f39650a, yd1VarM43222C.f31665g, j);
    }

    /* renamed from: C */
    public final yd1 m43222C(int i) {
        yd1 yd1Var = (yd1) this.f39660x.get(i);
        ArrayList arrayList = this.f39660x;
        sqi.Y0(arrayList, i, arrayList.size());
        this.i0 = Math.max(this.i0, this.f39660x.size());
        int i2 = 0;
        this.f39643H.m47433u(yd1Var.m57614g(0));
        while (true) {
            s0f[] s0fVarArr = this.f39644L;
            if (i2 >= s0fVarArr.length) {
                return yd1Var;
            }
            s0f s0fVar = s0fVarArr[i2];
            i2++;
            s0fVar.m47433u(yd1Var.m57614g(i2));
        }
    }

    /* renamed from: D */
    public q93 m43223D() {
        return this.f39654e;
    }

    /* renamed from: E */
    public final yd1 m43224E() {
        return (yd1) this.f39660x.get(r0.size() - 1);
    }

    /* renamed from: F */
    public final boolean m43225F(int i) {
        int iM47400D;
        yd1 yd1Var = (yd1) this.f39660x.get(i);
        if (this.f39643H.m47400D() > yd1Var.m57614g(0)) {
            return true;
        }
        int i2 = 0;
        do {
            s0f[] s0fVarArr = this.f39644L;
            if (i2 >= s0fVarArr.length) {
                return false;
            }
            iM47400D = s0fVarArr[i2].m47400D();
            i2++;
        } while (iM47400D <= yd1Var.m57614g(i2));
        return true;
    }

    /* renamed from: G */
    public final boolean m43226G(k93 k93Var) {
        return k93Var instanceof yd1;
    }

    /* renamed from: H */
    public boolean m43227H() {
        return this.f39649Z != -9223372036854775807L;
    }

    /* renamed from: I */
    public final void m43228I() {
        int iM43233N = m43233N(this.f39643H.m47400D(), this.i0 - 1);
        while (true) {
            int i = this.i0;
            if (i > iM43233N) {
                return;
            }
            this.i0 = i + 1;
            m43229J(i);
        }
    }

    /* renamed from: J */
    public final void m43229J(int i) {
        yd1 yd1Var = (yd1) this.f39660x.get(i);
        C2181a c2181a = yd1Var.f31662d;
        if (!c2181a.equals(this.f39647X)) {
            this.f39656g.m24552h(this.f39650a, c2181a, yd1Var.f31663e, yd1Var.f31664f, yd1Var.f31665g);
        }
        this.f39647X = c2181a;
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo6964m(k93 k93Var, long j, long j2, boolean z) {
        this.f39646Q = null;
        this.j0 = null;
        tga tgaVar = new tga(k93Var.f31659a, k93Var.f31660b, k93Var.m35187d(), k93Var.m35186c(), j, j2, k93Var.m35185a());
        this.f39657h.m48312c(k93Var.f31659a);
        this.f39656g.m24555q(tgaVar, k93Var.f31661c, this.f39650a, k93Var.f31662d, k93Var.f31663e, k93Var.f31664f, k93Var.f31665g, k93Var.f31666h);
        if (z) {
            return;
        }
        if (m43227H()) {
            m43236Q();
        } else if (m43226G(k93Var)) {
            m43222C(this.f39660x.size() - 1);
            if (this.f39660x.isEmpty()) {
                this.f39649Z = this.h0;
            }
        }
        this.f39655f.mo7010k(this);
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo6963k(k93 k93Var, long j, long j2) {
        this.f39646Q = null;
        this.f39654e.mo7025h(k93Var);
        tga tgaVar = new tga(k93Var.f31659a, k93Var.f31660b, k93Var.m35187d(), k93Var.m35186c(), j, j2, k93Var.m35185a());
        this.f39657h.m48312c(k93Var.f31659a);
        this.f39656g.m24558t(tgaVar, k93Var.f31661c, this.f39650a, k93Var.f31662d, k93Var.f31663e, k93Var.f31664f, k93Var.f31665g, k93Var.f31666h);
        this.f39655f.mo7010k(this);
    }

    @Override // p001o.xga.InterfaceC18150b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public xga.C18151c mo6965o(k93 k93Var, long j, long j2, IOException iOException, int i) {
        xga.C18151c c18151cM56262h;
        long jM35185a = k93Var.m35185a();
        boolean zM43226G = m43226G(k93Var);
        int size = this.f39660x.size() - 1;
        boolean z = (jM35185a != 0 && zM43226G && m43225F(size)) ? false : true;
        tga tgaVar = new tga(k93Var.f31659a, k93Var.f31660b, k93Var.m35187d(), k93Var.m35186c(), j, j2, jM35185a);
        sga.C16838c c16838c = new sga.C16838c(tgaVar, new u2b(k93Var.f31661c, this.f39650a, k93Var.f31662d, k93Var.f31663e, k93Var.f31664f, sqi.q1(k93Var.f31665g), sqi.q1(k93Var.f31666h)), iOException, i);
        if (!this.f39654e.mo7023f(k93Var, z, c16838c, this.f39657h)) {
            c18151cM56262h = null;
        } else if (z) {
            c18151cM56262h = xga.f53733f;
            if (zM43226G) {
                op0.m42517g(m43222C(size) == k93Var);
                if (this.f39660x.isEmpty()) {
                    this.f39649Z = this.h0;
                }
            }
        } else {
            ria.m46824h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c18151cM56262h = null;
        }
        if (c18151cM56262h == null) {
            long jMo48313d = this.f39657h.mo48313d(c16838c);
            c18151cM56262h = jMo48313d != -9223372036854775807L ? xga.m56262h(false, jMo48313d) : xga.f53734g;
        }
        boolean z2 = !c18151cM56262h.m56273c();
        this.f39656g.m24560v(tgaVar, k93Var.f31661c, this.f39650a, k93Var.f31662d, k93Var.f31663e, k93Var.f31664f, k93Var.f31665g, k93Var.f31666h, iOException, z2);
        if (z2) {
            this.f39646Q = null;
            this.f39657h.m48312c(k93Var.f31659a);
            this.f39655f.mo7010k(this);
        }
        return c18151cM56262h;
    }

    /* renamed from: N */
    public final int m43233N(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f39660x.size()) {
                return this.f39660x.size() - 1;
            }
        } while (((yd1) this.f39660x.get(i2)).m57614g(0) <= i);
        return i2 - 1;
    }

    /* renamed from: O */
    public void m43234O() {
        m43235P(null);
    }

    /* renamed from: P */
    public void m43235P(InterfaceC16035b interfaceC16035b) {
        this.f39648Y = interfaceC16035b;
        this.f39643H.m47413R();
        for (s0f s0fVar : this.f39644L) {
            s0fVar.m47413R();
        }
        this.f39658q.m56269m(this);
    }

    /* renamed from: Q */
    public final void m43236Q() {
        this.f39643H.m47417V();
        for (s0f s0fVar : this.f39644L) {
            s0fVar.m47417V();
        }
    }

    /* renamed from: R */
    public void m43237R(long j) {
        yd1 yd1Var;
        this.h0 = j;
        if (m43227H()) {
            this.f39649Z = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f39660x.size(); i2++) {
            yd1Var = (yd1) this.f39660x.get(i2);
            long j2 = yd1Var.f31665g;
            if (j2 == j && yd1Var.f55283k == -9223372036854775807L) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        yd1Var = null;
        if (yd1Var != null ? this.f39643H.m47420Y(yd1Var.m57614g(0)) : this.f39643H.m47421Z(j, j < mo7004d())) {
            this.i0 = m43233N(this.f39643H.m47400D(), 0);
            s0f[] s0fVarArr = this.f39644L;
            int length = s0fVarArr.length;
            while (i < length) {
                s0fVarArr[i].m47421Z(j, true);
                i++;
            }
            return;
        }
        this.f39649Z = j;
        this.k0 = false;
        this.f39660x.clear();
        this.i0 = 0;
        if (!this.f39658q.m56266j()) {
            this.f39658q.m56264g();
            m43236Q();
            return;
        }
        this.f39643H.m47430r();
        s0f[] s0fVarArr2 = this.f39644L;
        int length2 = s0fVarArr2.length;
        while (i < length2) {
            s0fVarArr2[i].m47430r();
            i++;
        }
        this.f39658q.m56263f();
    }

    /* renamed from: S */
    public C16034a m43238S(long j, int i) {
        for (int i2 = 0; i2 < this.f39644L.length; i2++) {
            if (this.f39651b[i2] == i) {
                op0.m42517g(!this.f39653d[i2]);
                this.f39653d[i2] = true;
                this.f39644L[i2].m47421Z(j, true);
                return new C16034a(this, this.f39644L[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p001o.t0f
    /* renamed from: a */
    public void mo26371a() throws IOException {
        this.f39658q.mo6966a();
        this.f39643H.m47410O();
        if (this.f39658q.m56266j()) {
            return;
        }
        this.f39654e.mo7021a();
    }

    @Override // p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f39658q.m56266j();
    }

    @Override // p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        List listEmptyList;
        long j;
        if (this.k0 || this.f39658q.m56266j() || this.f39658q.m56265i()) {
            return false;
        }
        boolean zM43227H = m43227H();
        if (zM43227H) {
            listEmptyList = Collections.emptyList();
            j = this.f39649Z;
        } else {
            listEmptyList = this.f39661y;
            j = m43224E().f31666h;
        }
        this.f39654e.mo7026i(c2213j, j, listEmptyList, this.f39659s);
        m93 m93Var = this.f39659s;
        boolean z = m93Var.f35003b;
        k93 k93Var = m93Var.f35002a;
        m93Var.m38582a();
        if (z) {
            this.f39649Z = -9223372036854775807L;
            this.k0 = true;
            return true;
        }
        if (k93Var == null) {
            return false;
        }
        this.f39646Q = k93Var;
        if (m43226G(k93Var)) {
            yd1 yd1Var = (yd1) k93Var;
            if (zM43227H) {
                long j2 = yd1Var.f31665g;
                long j3 = this.f39649Z;
                if (j2 != j3) {
                    this.f39643H.b0(j3);
                    for (s0f s0fVar : this.f39644L) {
                        s0fVar.b0(this.f39649Z);
                    }
                }
                this.f39649Z = -9223372036854775807L;
            }
            yd1Var.m57616i(this.f39645M);
            this.f39660x.add(yd1Var);
        } else if (k93Var instanceof ki8) {
            ((ki8) k93Var).m35728e(this.f39645M);
        }
        this.f39656g.m24564z(new tga(k93Var.f31659a, k93Var.f31660b, this.f39658q.m56270n(k93Var, this, this.f39657h.mo48310a(k93Var.f31661c))), k93Var.f31661c, this.f39650a, k93Var.f31662d, k93Var.f31663e, k93Var.f31664f, k93Var.f31665g, k93Var.f31666h);
        return true;
    }

    @Override // p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        if (m43227H()) {
            return this.f39649Z;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return m43224E().f31666h;
    }

    /* renamed from: e */
    public long m43239e(long j, abf abfVar) {
        return this.f39654e.mo7022e(j, abfVar);
    }

    @Override // p001o.t0f
    /* renamed from: f */
    public int mo26373f(if7 if7Var, a85 a85Var, int i) {
        if (m43227H()) {
            return -3;
        }
        yd1 yd1Var = this.j0;
        if (yd1Var != null && yd1Var.m57614g(0) <= this.f39643H.m47400D()) {
            return -3;
        }
        m43228I();
        return this.f39643H.m47414S(if7Var, a85Var, i, this.k0);
    }

    @Override // p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (m43227H()) {
            return this.f39649Z;
        }
        long jMax = this.h0;
        yd1 yd1VarM43224E = m43224E();
        if (!yd1VarM43224E.mo31353f()) {
            if (this.f39660x.size() > 1) {
                yd1VarM43224E = (yd1) this.f39660x.get(r2.size() - 2);
            } else {
                yd1VarM43224E = null;
            }
        }
        if (yd1VarM43224E != null) {
            jMax = Math.max(jMax, yd1VarM43224E.f31666h);
        }
        return Math.max(jMax, this.f39643H.m47397A());
    }

    @Override // p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        if (this.f39658q.m56265i() || m43227H()) {
            return;
        }
        if (!this.f39658q.m56266j()) {
            int iMo7027j = this.f39654e.mo7027j(j, this.f39661y);
            if (iMo7027j < this.f39660x.size()) {
                m43221B(iMo7027j);
                return;
            }
            return;
        }
        k93 k93Var = (k93) op0.m42515e(this.f39646Q);
        if (!(m43226G(k93Var) && m43225F(this.f39660x.size() - 1)) && this.f39654e.mo7024g(j, k93Var, this.f39661y)) {
            this.f39658q.m56263f();
            if (m43226G(k93Var)) {
                this.j0 = (yd1) k93Var;
            }
        }
    }

    @Override // p001o.t0f
    public boolean isReady() {
        return !m43227H() && this.f39643H.m47408L(this.k0);
    }

    @Override // p001o.xga.InterfaceC18154f
    /* renamed from: l */
    public void mo32488l() {
        this.f39643H.m47415T();
        for (s0f s0fVar : this.f39644L) {
            s0fVar.m47415T();
        }
        this.f39654e.release();
        InterfaceC16035b interfaceC16035b = this.f39648Y;
        if (interfaceC16035b != null) {
            interfaceC16035b.mo7001a(this);
        }
    }

    @Override // p001o.t0f
    /* renamed from: p */
    public int mo26374p(long j) {
        if (m43227H()) {
            return 0;
        }
        int iM47402F = this.f39643H.m47402F(j, this.k0);
        yd1 yd1Var = this.j0;
        if (yd1Var != null) {
            iM47402F = Math.min(iM47402F, yd1Var.m57614g(0) - this.f39643H.m47400D());
        }
        this.f39643H.e0(iM47402F);
        m43228I();
        return iM47402F;
    }

    /* renamed from: t */
    public void m43240t(long j, boolean z) {
        if (m43227H()) {
            return;
        }
        int iM47437y = this.f39643H.m47437y();
        this.f39643H.m47429q(j, z, true);
        int iM47437y2 = this.f39643H.m47437y();
        if (iM47437y2 > iM47437y) {
            long jM47438z = this.f39643H.m47438z();
            int i = 0;
            while (true) {
                s0f[] s0fVarArr = this.f39644L;
                if (i >= s0fVarArr.length) {
                    break;
                }
                s0fVarArr[i].m47429q(jM47438z, z, this.f39653d[i]);
                i++;
            }
        }
        m43220A(iM47437y2);
    }
}
