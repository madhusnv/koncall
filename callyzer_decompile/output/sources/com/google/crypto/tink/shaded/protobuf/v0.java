package com.google.crypto.tink.shaded.protobuf;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements f1 {

    /* renamed from: a */
    public final AbstractC1374a f7122a;

    /* renamed from: b */
    public final h1 f7123b;

    /* renamed from: c */
    public final C1391r f7124c;

    public v0(h1 h1Var, C1391r c1391r, AbstractC1374a abstractC1374a) {
        this.f7123b = h1Var;
        c1391r.getClass();
        this.f7124c = c1391r;
        this.f7122a = abstractC1374a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: a */
    public final void mo4214a(Object obj) {
        ((j1) this.f7123b).getClass();
        ((a0) obj).unknownFields.f7053e = false;
        this.f7124c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: b */
    public final boolean mo4215b(Object obj) {
        this.f7124c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: c */
    public final Object mo4216c() {
        a0 a0Var = (a0) this.f7122a;
        a0Var.getClass();
        return ((AbstractC1397x) a0Var.mo4165f(EnumC1399z.NEW_BUILDER)).m4459b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: d */
    public final boolean mo4217d(a0 a0Var, a0 a0Var2) {
        j1 j1Var = (j1) this.f7123b;
        j1Var.getClass();
        i1 i1Var = a0Var.unknownFields;
        j1Var.getClass();
        return i1Var.equals(a0Var2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: e */
    public final void mo4218e(Object obj, C1387n c1387n) {
        this.f7124c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: f */
    public final int mo4219f(a0 a0Var) {
        ((j1) this.f7123b).getClass();
        return a0Var.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: g */
    public final void mo4220g(Object obj, byte[] bArr, int i10, int i11, C1377d c1377d) {
        a0 a0Var = (a0) obj;
        if (a0Var.unknownFields == i1.f7048f) {
            a0Var.unknownFields = i1.m4283b();
        }
        throw i0.m0.m7376i(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: h */
    public final void mo4221h(Object obj, e1 e1Var, C1390q c1390q) {
        ((j1) this.f7123b).getClass();
        a0 a0Var = (a0) obj;
        if (a0Var.unknownFields == i1.f7048f) {
            a0Var.unknownFields = i1.m4283b();
        }
        this.f7124c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: i */
    public final int mo4222i(AbstractC1374a abstractC1374a) {
        ((j1) this.f7123b).getClass();
        i1 i1Var = ((a0) abstractC1374a).unknownFields;
        int i10 = i1Var.f7052d;
        if (i10 != -1) {
            return i10;
        }
        int iM4320z = 0;
        for (int i11 = 0; i11 < i1Var.f7049a; i11++) {
            int i12 = i1Var.f7050b[i11] >>> 3;
            iM4320z += C1386m.m4320z(3, (AbstractC1382i) i1Var.f7051c[i11]) + C1386m.m4318H(i12) + C1386m.m4317G(2) + (C1386m.m4317G(1) * 2);
        }
        i1Var.f7052d = iM4320z;
        return iM4320z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    /* renamed from: j */
    public final void mo4223j(a0 a0Var, a0 a0Var2) {
        g1.m4272x(this.f7123b, a0Var, a0Var2);
    }
}
