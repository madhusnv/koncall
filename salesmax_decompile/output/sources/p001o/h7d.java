package p001o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class h7d implements Externalizable {
    public boolean A0;
    public boolean C0;
    public boolean E0;
    public boolean G0;

    /* renamed from: H */
    public boolean f26348H;
    public boolean I0;
    public boolean K0;

    /* renamed from: M */
    public boolean f26350M;
    public boolean M0;
    public boolean Q0;
    public boolean S0;
    public boolean U0;
    public boolean W0;

    /* renamed from: X */
    public boolean f26352X;

    /* renamed from: Z */
    public boolean f26354Z;

    /* renamed from: a */
    public boolean f26355a;

    /* renamed from: c */
    public boolean f26357c;

    /* renamed from: e */
    public boolean f26359e;

    /* renamed from: g */
    public boolean f26361g;
    public boolean i0;
    public boolean k0;
    public boolean m0;
    public boolean o0;

    /* renamed from: q */
    public boolean f26363q;
    public boolean q0;
    public boolean s0;
    public boolean u0;
    public boolean w0;

    /* renamed from: x */
    public boolean f26365x;
    public boolean y0;

    /* renamed from: b */
    public l7d f26356b = null;

    /* renamed from: d */
    public l7d f26358d = null;

    /* renamed from: f */
    public l7d f26360f = null;

    /* renamed from: h */
    public l7d f26362h = null;

    /* renamed from: s */
    public l7d f26364s = null;

    /* renamed from: y */
    public l7d f26366y = null;

    /* renamed from: L */
    public l7d f26349L = null;

    /* renamed from: Q */
    public l7d f26351Q = null;

    /* renamed from: Y */
    public l7d f26353Y = null;
    public l7d h0 = null;
    public l7d j0 = null;
    public l7d l0 = null;
    public l7d n0 = null;
    public l7d p0 = null;
    public l7d r0 = null;
    public l7d t0 = null;
    public l7d v0 = null;
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
    public int m29900A() {
        return this.O0.size();
    }

    /* renamed from: B */
    public List m29901B() {
        return this.O0;
    }

    /* renamed from: C */
    public h7d m29902C(l7d l7dVar) {
        l7dVar.getClass();
        this.q0 = true;
        this.r0 = l7dVar;
        return this;
    }

    /* renamed from: E */
    public h7d m29903E(int i) {
        this.y0 = true;
        this.z0 = i;
        return this;
    }

    /* renamed from: F */
    public h7d m29904F(l7d l7dVar) {
        l7dVar.getClass();
        this.i0 = true;
        this.j0 = l7dVar;
        return this;
    }

    /* renamed from: G */
    public h7d m29905G(l7d l7dVar) {
        l7dVar.getClass();
        this.f26357c = true;
        this.f26358d = l7dVar;
        return this;
    }

    /* renamed from: H */
    public h7d m29906H(l7d l7dVar) {
        l7dVar.getClass();
        this.f26355a = true;
        this.f26356b = l7dVar;
        return this;
    }

    /* renamed from: I */
    public h7d m29907I(String str) {
        this.w0 = true;
        this.x0 = str;
        return this;
    }

    /* renamed from: J */
    public h7d m29908J(String str) {
        this.A0 = true;
        this.B0 = str;
        return this;
    }

    /* renamed from: L */
    public h7d m29909L(String str) {
        this.S0 = true;
        this.T0 = str;
        return this;
    }

    /* renamed from: M */
    public h7d m29910M(boolean z) {
        this.U0 = true;
        this.V0 = z;
        return this;
    }

    /* renamed from: N */
    public h7d m29911N(boolean z) {
        this.Q0 = true;
        this.R0 = z;
        return this;
    }

    /* renamed from: O */
    public h7d m29912O(l7d l7dVar) {
        l7dVar.getClass();
        this.f26359e = true;
        this.f26360f = l7dVar;
        return this;
    }

    /* renamed from: P */
    public h7d m29913P(boolean z) {
        this.W0 = true;
        this.X0 = z;
        return this;
    }

    /* renamed from: Q */
    public h7d m29914Q(String str) {
        this.E0 = true;
        this.F0 = str;
        return this;
    }

    /* renamed from: R */
    public h7d m29915R(String str) {
        this.I0 = true;
        this.J0 = str;
        return this;
    }

    /* renamed from: S */
    public h7d m29916S(String str) {
        this.K0 = true;
        this.L0 = str;
        return this;
    }

    /* renamed from: T */
    public h7d m29917T(l7d l7dVar) {
        l7dVar.getClass();
        this.u0 = true;
        this.v0 = l7dVar;
        return this;
    }

    /* renamed from: U */
    public h7d m29918U(l7d l7dVar) {
        l7dVar.getClass();
        this.f26352X = true;
        this.f26353Y = l7dVar;
        return this;
    }

    /* renamed from: V */
    public h7d m29919V(l7d l7dVar) {
        l7dVar.getClass();
        this.f26348H = true;
        this.f26349L = l7dVar;
        return this;
    }

    /* renamed from: W */
    public h7d m29920W(String str) {
        this.G0 = true;
        this.H0 = str;
        return this;
    }

    /* renamed from: Y */
    public h7d m29921Y(String str) {
        this.C0 = true;
        this.D0 = str;
        return this;
    }

    /* renamed from: Z */
    public h7d m29922Z(l7d l7dVar) {
        l7dVar.getClass();
        this.f26363q = true;
        this.f26364s = l7dVar;
        return this;
    }

    /* renamed from: a */
    public int m29923a() {
        return this.z0;
    }

    public h7d a0(boolean z) {
        this.M0 = true;
        this.N0 = z;
        return this;
    }

    /* renamed from: b */
    public l7d m29924b() {
        return this.f26358d;
    }

    public h7d b0(l7d l7dVar) {
        l7dVar.getClass();
        this.f26365x = true;
        this.f26366y = l7dVar;
        return this;
    }

    /* renamed from: c */
    public l7d m29925c() {
        return this.f26356b;
    }

    public h7d c0(l7d l7dVar) {
        l7dVar.getClass();
        this.m0 = true;
        this.n0 = l7dVar;
        return this;
    }

    /* renamed from: d */
    public String m29926d() {
        return this.B0;
    }

    public h7d d0(l7d l7dVar) {
        l7dVar.getClass();
        this.s0 = true;
        this.t0 = l7dVar;
        return this;
    }

    /* renamed from: e */
    public String m29927e() {
        return this.T0;
    }

    public h7d e0(l7d l7dVar) {
        l7dVar.getClass();
        this.o0 = true;
        this.p0 = l7dVar;
        return this;
    }

    /* renamed from: f */
    public l7d m29928f() {
        return this.f26360f;
    }

    public h7d f0(l7d l7dVar) {
        l7dVar.getClass();
        this.f26361g = true;
        this.f26362h = l7dVar;
        return this;
    }

    /* renamed from: g */
    public String m29929g() {
        return this.J0;
    }

    public h7d g0(l7d l7dVar) {
        l7dVar.getClass();
        this.f26354Z = true;
        this.h0 = l7dVar;
        return this;
    }

    /* renamed from: h */
    public String m29930h() {
        return this.L0;
    }

    public h7d h0(l7d l7dVar) {
        l7dVar.getClass();
        this.k0 = true;
        this.l0 = l7dVar;
        return this;
    }

    /* renamed from: i */
    public l7d m29931i() {
        return this.f26353Y;
    }

    public h7d i0(l7d l7dVar) {
        l7dVar.getClass();
        this.f26350M = true;
        this.f26351Q = l7dVar;
        return this;
    }

    /* renamed from: j */
    public l7d m29932j() {
        return this.f26349L;
    }

    /* renamed from: k */
    public String m29933k() {
        return this.H0;
    }

    /* renamed from: l */
    public l7d m29934l() {
        return this.f26364s;
    }

    /* renamed from: m */
    public boolean m29935m() {
        return this.N0;
    }

    /* renamed from: o */
    public l7d m29936o() {
        return this.f26366y;
    }

    /* renamed from: p */
    public l7d m29937p() {
        return this.f26362h;
    }

    /* renamed from: q */
    public l7d m29938q() {
        return this.h0;
    }

    /* renamed from: r */
    public l7d m29939r() {
        return this.l0;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            l7d l7dVar = new l7d();
            l7dVar.readExternal(objectInput);
            m29906H(l7dVar);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar2 = new l7d();
            l7dVar2.readExternal(objectInput);
            m29905G(l7dVar2);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar3 = new l7d();
            l7dVar3.readExternal(objectInput);
            m29912O(l7dVar3);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar4 = new l7d();
            l7dVar4.readExternal(objectInput);
            f0(l7dVar4);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar5 = new l7d();
            l7dVar5.readExternal(objectInput);
            m29922Z(l7dVar5);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar6 = new l7d();
            l7dVar6.readExternal(objectInput);
            b0(l7dVar6);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar7 = new l7d();
            l7dVar7.readExternal(objectInput);
            m29919V(l7dVar7);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar8 = new l7d();
            l7dVar8.readExternal(objectInput);
            i0(l7dVar8);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar9 = new l7d();
            l7dVar9.readExternal(objectInput);
            m29918U(l7dVar9);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar10 = new l7d();
            l7dVar10.readExternal(objectInput);
            g0(l7dVar10);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar11 = new l7d();
            l7dVar11.readExternal(objectInput);
            m29904F(l7dVar11);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar12 = new l7d();
            l7dVar12.readExternal(objectInput);
            h0(l7dVar12);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar13 = new l7d();
            l7dVar13.readExternal(objectInput);
            c0(l7dVar13);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar14 = new l7d();
            l7dVar14.readExternal(objectInput);
            e0(l7dVar14);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar15 = new l7d();
            l7dVar15.readExternal(objectInput);
            m29902C(l7dVar15);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar16 = new l7d();
            l7dVar16.readExternal(objectInput);
            d0(l7dVar16);
        }
        if (objectInput.readBoolean()) {
            l7d l7dVar17 = new l7d();
            l7dVar17.readExternal(objectInput);
            m29917T(l7dVar17);
        }
        m29907I(objectInput.readUTF());
        m29903E(objectInput.readInt());
        m29908J(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            m29921Y(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m29914Q(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m29920W(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m29915R(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m29916S(objectInput.readUTF());
        }
        a0(objectInput.readBoolean());
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            f7d f7dVar = new f7d();
            f7dVar.readExternal(objectInput);
            this.O0.add(f7dVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            f7d f7dVar2 = new f7d();
            f7dVar2.readExternal(objectInput);
            this.P0.add(f7dVar2);
        }
        m29911N(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            m29909L(objectInput.readUTF());
        }
        m29910M(objectInput.readBoolean());
        m29913P(objectInput.readBoolean());
    }

    /* renamed from: s */
    public l7d m29940s() {
        return this.f26351Q;
    }

    /* renamed from: t */
    public boolean m29941t() {
        return this.S0;
    }

    /* renamed from: u */
    public boolean m29942u() {
        return this.I0;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f26355a);
        if (this.f26355a) {
            this.f26356b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26357c);
        if (this.f26357c) {
            this.f26358d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26359e);
        if (this.f26359e) {
            this.f26360f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26361g);
        if (this.f26361g) {
            this.f26362h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26363q);
        if (this.f26363q) {
            this.f26364s.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26365x);
        if (this.f26365x) {
            this.f26366y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26348H);
        if (this.f26348H) {
            this.f26349L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26350M);
        if (this.f26350M) {
            this.f26351Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26352X);
        if (this.f26352X) {
            this.f26353Y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f26354Z);
        if (this.f26354Z) {
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
        int iM29900A = m29900A();
        objectOutput.writeInt(iM29900A);
        for (int i = 0; i < iM29900A; i++) {
            ((f7d) this.O0.get(i)).writeExternal(objectOutput);
        }
        int iM29944y = m29944y();
        objectOutput.writeInt(iM29944y);
        for (int i2 = 0; i2 < iM29944y; i2++) {
            ((f7d) this.P0.get(i2)).writeExternal(objectOutput);
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
    public boolean m29943x() {
        return this.G0;
    }

    /* renamed from: y */
    public int m29944y() {
        return this.P0.size();
    }

    /* renamed from: z */
    public List m29945z() {
        return this.P0;
    }
}
