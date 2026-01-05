package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class i7d implements Externalizable {
    public boolean A0;
    public boolean C0;
    public boolean E0;
    public boolean G0;

    /* renamed from: H */
    public boolean f28185H;
    public boolean I0;
    public boolean K0;

    /* renamed from: M */
    public boolean f28187M;
    public boolean M0;
    public boolean Q0;
    public boolean S0;
    public boolean U0;
    public boolean W0;

    /* renamed from: X */
    public boolean f28189X;

    /* renamed from: Z */
    public boolean f28191Z;

    /* renamed from: a */
    public boolean f28192a;

    /* renamed from: c */
    public boolean f28194c;

    /* renamed from: e */
    public boolean f28196e;

    /* renamed from: g */
    public boolean f28198g;
    public boolean i0;
    public boolean k0;
    public boolean m0;
    public boolean o0;

    /* renamed from: q */
    public boolean f28200q;
    public boolean q0;
    public boolean s0;
    public boolean u0;
    public boolean w0;

    /* renamed from: x */
    public boolean f28202x;
    public boolean y0;

    /* renamed from: b */
    public m7d f28193b = null;

    /* renamed from: d */
    public m7d f28195d = null;

    /* renamed from: f */
    public m7d f28197f = null;

    /* renamed from: h */
    public m7d f28199h = null;

    /* renamed from: s */
    public m7d f28201s = null;

    /* renamed from: y */
    public m7d f28203y = null;

    /* renamed from: L */
    public m7d f28186L = null;

    /* renamed from: Q */
    public m7d f28188Q = null;

    /* renamed from: Y */
    public m7d f28190Y = null;
    public m7d h0 = null;
    public m7d j0 = null;
    public m7d l0 = null;
    public m7d n0 = null;
    public m7d p0 = null;
    public m7d r0 = null;
    public m7d t0 = null;
    public m7d v0 = null;
    public String x0 = "";
    public int z0 = 0;
    public String B0 = "";
    public String D0 = "";
    public String F0 = "";
    public String H0 = "";
    public String J0 = "";
    public String L0 = "";
    public boolean N0 = false;
    public List O0 = new ArrayList();
    public List P0 = new ArrayList();
    public boolean R0 = false;
    public String T0 = "";
    public boolean V0 = false;
    public boolean X0 = false;

    /* renamed from: A */
    public List m31648A() {
        return this.O0;
    }

    /* renamed from: B */
    public i7d m31649B(m7d m7dVar) {
        m7dVar.getClass();
        this.q0 = true;
        this.r0 = m7dVar;
        return this;
    }

    /* renamed from: C */
    public i7d m31650C(int i) {
        this.y0 = true;
        this.z0 = i;
        return this;
    }

    /* renamed from: E */
    public i7d m31651E(m7d m7dVar) {
        m7dVar.getClass();
        this.i0 = true;
        this.j0 = m7dVar;
        return this;
    }

    /* renamed from: F */
    public i7d m31652F(m7d m7dVar) {
        m7dVar.getClass();
        this.f28194c = true;
        this.f28195d = m7dVar;
        return this;
    }

    /* renamed from: G */
    public i7d m31653G(m7d m7dVar) {
        m7dVar.getClass();
        this.f28192a = true;
        this.f28193b = m7dVar;
        return this;
    }

    /* renamed from: H */
    public i7d m31654H(String str) {
        this.w0 = true;
        this.x0 = str;
        return this;
    }

    /* renamed from: I */
    public i7d m31655I(String str) {
        this.A0 = true;
        this.B0 = str;
        return this;
    }

    /* renamed from: J */
    public i7d m31656J(String str) {
        this.S0 = true;
        this.T0 = str;
        return this;
    }

    /* renamed from: L */
    public i7d m31657L(boolean z) {
        this.U0 = true;
        this.V0 = z;
        return this;
    }

    /* renamed from: M */
    public i7d m31658M(boolean z) {
        this.Q0 = true;
        this.R0 = z;
        return this;
    }

    /* renamed from: N */
    public i7d m31659N(m7d m7dVar) {
        m7dVar.getClass();
        this.f28196e = true;
        this.f28197f = m7dVar;
        return this;
    }

    /* renamed from: O */
    public i7d m31660O(boolean z) {
        this.W0 = true;
        this.X0 = z;
        return this;
    }

    /* renamed from: P */
    public i7d m31661P(String str) {
        this.E0 = true;
        this.F0 = str;
        return this;
    }

    /* renamed from: Q */
    public i7d m31662Q(String str) {
        this.I0 = true;
        this.J0 = str;
        return this;
    }

    /* renamed from: R */
    public i7d m31663R(String str) {
        this.K0 = true;
        this.L0 = str;
        return this;
    }

    /* renamed from: S */
    public i7d m31664S(m7d m7dVar) {
        m7dVar.getClass();
        this.u0 = true;
        this.v0 = m7dVar;
        return this;
    }

    /* renamed from: T */
    public i7d m31665T(m7d m7dVar) {
        m7dVar.getClass();
        this.f28189X = true;
        this.f28190Y = m7dVar;
        return this;
    }

    /* renamed from: U */
    public i7d m31666U(m7d m7dVar) {
        m7dVar.getClass();
        this.f28185H = true;
        this.f28186L = m7dVar;
        return this;
    }

    /* renamed from: V */
    public i7d m31667V(String str) {
        this.G0 = true;
        this.H0 = str;
        return this;
    }

    /* renamed from: W */
    public i7d m31668W(String str) {
        this.C0 = true;
        this.D0 = str;
        return this;
    }

    /* renamed from: Y */
    public i7d m31669Y(m7d m7dVar) {
        m7dVar.getClass();
        this.f28200q = true;
        this.f28201s = m7dVar;
        return this;
    }

    /* renamed from: Z */
    public i7d m31670Z(boolean z) {
        this.M0 = true;
        this.N0 = z;
        return this;
    }

    /* renamed from: a */
    public int m31671a() {
        return this.z0;
    }

    public i7d a0(m7d m7dVar) {
        m7dVar.getClass();
        this.f28202x = true;
        this.f28203y = m7dVar;
        return this;
    }

    /* renamed from: b */
    public m7d m31672b() {
        return this.f28195d;
    }

    public i7d b0(m7d m7dVar) {
        m7dVar.getClass();
        this.m0 = true;
        this.n0 = m7dVar;
        return this;
    }

    /* renamed from: c */
    public m7d m31673c() {
        return this.f28193b;
    }

    public i7d c0(m7d m7dVar) {
        m7dVar.getClass();
        this.s0 = true;
        this.t0 = m7dVar;
        return this;
    }

    /* renamed from: d */
    public String m31674d() {
        return this.B0;
    }

    public i7d d0(m7d m7dVar) {
        m7dVar.getClass();
        this.o0 = true;
        this.p0 = m7dVar;
        return this;
    }

    /* renamed from: e */
    public String m31675e() {
        return this.T0;
    }

    public i7d e0(m7d m7dVar) {
        m7dVar.getClass();
        this.f28198g = true;
        this.f28199h = m7dVar;
        return this;
    }

    /* renamed from: f */
    public m7d m31676f() {
        return this.f28197f;
    }

    public i7d f0(m7d m7dVar) {
        m7dVar.getClass();
        this.f28191Z = true;
        this.h0 = m7dVar;
        return this;
    }

    /* renamed from: g */
    public String m31677g() {
        return this.J0;
    }

    public i7d g0(m7d m7dVar) {
        m7dVar.getClass();
        this.k0 = true;
        this.l0 = m7dVar;
        return this;
    }

    /* renamed from: h */
    public String m31678h() {
        return this.L0;
    }

    public i7d h0(m7d m7dVar) {
        m7dVar.getClass();
        this.f28187M = true;
        this.f28188Q = m7dVar;
        return this;
    }

    /* renamed from: i */
    public m7d m31679i() {
        return this.f28190Y;
    }

    /* renamed from: j */
    public m7d m31680j() {
        return this.f28186L;
    }

    /* renamed from: k */
    public String m31681k() {
        return this.H0;
    }

    /* renamed from: l */
    public m7d m31682l() {
        return this.f28201s;
    }

    /* renamed from: m */
    public boolean m31683m() {
        return this.N0;
    }

    /* renamed from: o */
    public m7d m31684o() {
        return this.f28203y;
    }

    /* renamed from: p */
    public m7d m31685p() {
        return this.f28199h;
    }

    /* renamed from: q */
    public m7d m31686q() {
        return this.h0;
    }

    /* renamed from: r */
    public m7d m31687r() {
        return this.l0;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            m7d m7dVar = new m7d();
            m7dVar.readExternal(objectInput);
            m31653G(m7dVar);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar2 = new m7d();
            m7dVar2.readExternal(objectInput);
            m31652F(m7dVar2);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar3 = new m7d();
            m7dVar3.readExternal(objectInput);
            m31659N(m7dVar3);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar4 = new m7d();
            m7dVar4.readExternal(objectInput);
            e0(m7dVar4);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar5 = new m7d();
            m7dVar5.readExternal(objectInput);
            m31669Y(m7dVar5);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar6 = new m7d();
            m7dVar6.readExternal(objectInput);
            a0(m7dVar6);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar7 = new m7d();
            m7dVar7.readExternal(objectInput);
            m31666U(m7dVar7);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar8 = new m7d();
            m7dVar8.readExternal(objectInput);
            h0(m7dVar8);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar9 = new m7d();
            m7dVar9.readExternal(objectInput);
            m31665T(m7dVar9);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar10 = new m7d();
            m7dVar10.readExternal(objectInput);
            f0(m7dVar10);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar11 = new m7d();
            m7dVar11.readExternal(objectInput);
            m31651E(m7dVar11);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar12 = new m7d();
            m7dVar12.readExternal(objectInput);
            g0(m7dVar12);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar13 = new m7d();
            m7dVar13.readExternal(objectInput);
            b0(m7dVar13);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar14 = new m7d();
            m7dVar14.readExternal(objectInput);
            d0(m7dVar14);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar15 = new m7d();
            m7dVar15.readExternal(objectInput);
            m31649B(m7dVar15);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar16 = new m7d();
            m7dVar16.readExternal(objectInput);
            c0(m7dVar16);
        }
        if (objectInput.readBoolean()) {
            m7d m7dVar17 = new m7d();
            m7dVar17.readExternal(objectInput);
            m31664S(m7dVar17);
        }
        m31654H(objectInput.readUTF());
        m31650C(objectInput.readInt());
        m31655I(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            m31668W(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m31661P(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m31667V(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m31662Q(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m31663R(objectInput.readUTF());
        }
        m31670Z(objectInput.readBoolean());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            g7d g7dVar = new g7d();
            g7dVar.readExternal(objectInput);
            this.O0.add(g7dVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            g7d g7dVar2 = new g7d();
            g7dVar2.readExternal(objectInput);
            this.P0.add(g7dVar2);
        }
        m31658M(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            m31656J(objectInput.readUTF());
        }
        m31657L(objectInput.readBoolean());
        m31660O(objectInput.readBoolean());
    }

    /* renamed from: s */
    public m7d m31688s() {
        return this.f28188Q;
    }

    /* renamed from: t */
    public boolean m31689t() {
        return this.S0;
    }

    /* renamed from: u */
    public boolean m31690u() {
        return this.G0;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f28192a);
        if (this.f28192a) {
            this.f28193b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28194c);
        if (this.f28194c) {
            this.f28195d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28196e);
        if (this.f28196e) {
            this.f28197f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28198g);
        if (this.f28198g) {
            this.f28199h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28200q);
        if (this.f28200q) {
            this.f28201s.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28202x);
        if (this.f28202x) {
            this.f28203y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28185H);
        if (this.f28185H) {
            this.f28186L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28187M);
        if (this.f28187M) {
            this.f28188Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28189X);
        if (this.f28189X) {
            this.f28190Y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f28191Z);
        if (this.f28191Z) {
            this.h0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i0);
        if (this.i0) {
            this.j0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.k0);
        if (this.k0) {
            this.l0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.m0);
        if (this.m0) {
            this.n0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.o0);
        if (this.o0) {
            this.p0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.q0);
        if (this.q0) {
            this.r0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.s0);
        if (this.s0) {
            this.t0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u0);
        if (this.u0) {
            this.v0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.x0);
        objectOutput.writeInt(this.z0);
        objectOutput.writeUTF(this.B0);
        objectOutput.writeBoolean(this.C0);
        if (this.C0) {
            objectOutput.writeUTF(this.D0);
        }
        objectOutput.writeBoolean(this.E0);
        if (this.E0) {
            objectOutput.writeUTF(this.F0);
        }
        objectOutput.writeBoolean(this.G0);
        if (this.G0) {
            objectOutput.writeUTF(this.H0);
        }
        objectOutput.writeBoolean(this.I0);
        if (this.I0) {
            objectOutput.writeUTF(this.J0);
        }
        objectOutput.writeBoolean(this.K0);
        if (this.K0) {
            objectOutput.writeUTF(this.L0);
        }
        objectOutput.writeBoolean(this.N0);
        int iM31693z = m31693z();
        objectOutput.writeInt(iM31693z);
        for (int i = 0; i < iM31693z; i++) {
            ((g7d) this.O0.get(i)).writeExternal(objectOutput);
        }
        int iM31691x = m31691x();
        objectOutput.writeInt(iM31691x);
        for (int i2 = 0; i2 < iM31691x; i2++) {
            ((g7d) this.P0.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R0);
        objectOutput.writeBoolean(this.S0);
        if (this.S0) {
            objectOutput.writeUTF(this.T0);
        }
        objectOutput.writeBoolean(this.V0);
        objectOutput.writeBoolean(this.X0);
    }

    /* renamed from: x */
    public int m31691x() {
        return this.P0.size();
    }

    /* renamed from: y */
    public List m31692y() {
        return this.P0;
    }

    /* renamed from: z */
    public int m31693z() {
        return this.O0.size();
    }
}
