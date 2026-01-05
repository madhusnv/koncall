package g2;

import k2.C3953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class sd implements rd {

    /* renamed from: a */
    public final boolean f12722a;

    /* renamed from: b */
    public final k2.e1 f12723b;

    /* renamed from: c */
    public final k2.e1 f12724c;

    /* renamed from: d */
    public final k2.b1 f12725d;

    /* renamed from: e */
    public final k2.b1 f12726e;

    public sd(int i10, int i11, boolean z6) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f12722a = z6;
        this.f12723b = C3953b.m8517t(new qd(0));
        this.f12724c = C3953b.m8517t(Boolean.valueOf(i10 >= 12));
        this.f12725d = new k2.b1(i10 % 12);
        this.f12726e = new k2.b1(i11);
    }

    @Override // g2.rd
    /* renamed from: a */
    public final void mo6207a(boolean z6) {
        this.f12724c.setValue(Boolean.valueOf(z6));
    }

    @Override // g2.rd
    /* renamed from: b */
    public final void mo6208b(int i10) {
        mo6207a(i10 >= 12);
        this.f12725d.m8527g(i10 % 12);
    }

    @Override // g2.rd
    /* renamed from: c */
    public final void mo6209c(int i10) {
        this.f12726e.m8527g(i10);
    }

    @Override // g2.rd
    /* renamed from: d */
    public final int mo6210d() {
        return this.f12726e.m8526f();
    }

    @Override // g2.rd
    /* renamed from: e */
    public final void mo6211e(int i10) {
        this.f12723b.setValue(new qd(i10));
    }

    @Override // g2.rd
    /* renamed from: f */
    public final int mo6212f() {
        return ((qd) this.f12723b.getValue()).f12540a;
    }

    @Override // g2.rd
    /* renamed from: g */
    public final boolean mo6213g() {
        return this.f12722a;
    }

    @Override // g2.rd
    /* renamed from: h */
    public final int mo6214h() {
        return this.f12725d.m8526f() + (mo6215i() ? 12 : 0);
    }

    @Override // g2.rd
    /* renamed from: i */
    public final boolean mo6215i() {
        return ((Boolean) this.f12724c.getValue()).booleanValue();
    }
}
