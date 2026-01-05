package p001o;

import p001o.sl1;

/* loaded from: classes6.dex */
public class nvi extends t6 {

    /* renamed from: H */
    public sl1 f37357H;

    /* renamed from: o.nvi$a */
    public static class C15675a extends nvi implements sl1.InterfaceC16857a {
        public C15675a(sl1 sl1Var) {
            super(sl1Var);
        }

        @Override // p001o.nvi, p001o.t6
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof sl1) && ((sl1) obj).d0(this)) || super.equals(obj);
        }
    }

    public nvi(sl1 sl1Var, int i, int i2, int i3, int i4) {
        super(2, !sl1Var.y0());
        this.f37357H = sl1Var.mo41182e();
        k0(i3);
        w2(i2);
        q3(i);
        this.f46472a = i4;
    }

    @Override // p001o.sl1
    public int G0(int i, byte[] bArr, int i2, int i3) {
        return this.f37357H.G0(i, bArr, i2, i3);
    }

    @Override // p001o.t6, p001o.sl1
    public int I1(int i, byte[] bArr, int i2, int i3) {
        return this.f37357H.I1(i, bArr, i2, i3);
    }

    @Override // p001o.t6, p001o.sl1
    public sl1 O1(int i, int i2) {
        return this.f37357H.O1(i, i2);
    }

    @Override // p001o.sl1
    public void R0() {
    }

    @Override // p001o.sl1
    public int capacity() {
        return this.f37357H.capacity();
    }

    @Override // p001o.t6, p001o.sl1
    public void clear() {
        q3(-1);
        w2(0);
        k0(this.f37357H.mo48451r());
        w2(this.f37357H.mo48451r());
    }

    @Override // p001o.t6, p001o.sl1
    /* renamed from: e */
    public sl1 mo41182e() {
        return this.f37357H.mo41182e();
    }

    @Override // p001o.t6
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof sl1) && ((sl1) obj).equals(this)) || super.equals(obj);
    }

    /* renamed from: g */
    public void m41183g(int i, int i2) {
        int i3 = this.f46472a;
        this.f46472a = 2;
        w2(0);
        k0(i2);
        w2(i);
        q3(-1);
        this.f46472a = i3;
    }

    /* renamed from: h */
    public void m41184h(sl1 sl1Var) {
        this.f46472a = 2;
        this.f37357H = sl1Var.mo41182e();
        w2(0);
        k0(sl1Var.Y2());
        w2(sl1Var.mo48451r());
        q3(sl1Var.d2());
        this.f46472a = sl1Var.isReadOnly() ? 1 : 2;
    }

    @Override // p001o.t6, p001o.sl1
    public boolean isReadOnly() {
        return this.f37357H.isReadOnly();
    }

    @Override // p001o.sl1
    public byte[] j0() {
        return this.f37357H.j0();
    }

    @Override // p001o.sl1
    /* renamed from: o */
    public byte mo41185o(int i) {
        return this.f37357H.mo41185o(i);
    }

    @Override // p001o.t6, p001o.sl1
    public boolean o2() {
        return true;
    }

    @Override // p001o.t6, p001o.sl1
    public int p3(int i, sl1 sl1Var) {
        return this.f37357H.p3(i, sl1Var);
    }

    @Override // p001o.t6
    public String toString() {
        return this.f37357H == null ? "INVALID" : super.toString();
    }

    @Override // p001o.sl1
    public void v0(int i, byte b) {
        this.f37357H.v0(i, b);
    }

    public nvi(sl1 sl1Var) {
        super(2, !sl1Var.y0());
        this.f37357H = sl1Var.mo41182e();
        k0(sl1Var.Y2());
        w2(sl1Var.mo48451r());
        q3(sl1Var.d2());
        this.f46472a = sl1Var.isReadOnly() ? 1 : 2;
    }

    public nvi() {
        super(2, true);
    }
}
