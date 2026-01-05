package p001o;

import p001o.fve;

/* loaded from: classes6.dex */
public final class ts6 implements fve.InterfaceC13582b {

    /* renamed from: a */
    public final fve.C13581a f47667a;

    /* renamed from: b */
    public final boolean f47668b;

    public ts6(Throwable th) {
        sq8.m48649h(th, "e");
        this.f47667a = new fve.C13581a(this, null, th, 2, null);
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ zce mo25596a() {
        return (zce) m50433g();
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    /* renamed from: c */
    public final fve.C13581a m50432c() {
        return this.f47667a;
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: d */
    public fve.C13581a mo25599d() {
        return this.f47667a;
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: e */
    public /* bridge */ /* synthetic */ fve.InterfaceC13582b mo25600e() {
        return (fve.InterfaceC13582b) m50434h();
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: f */
    public fve.C13581a mo25601f() {
        return this.f47667a;
    }

    /* renamed from: g */
    public Void m50433g() {
        throw new IllegalStateException("unexpected call".toString());
    }

    /* renamed from: h */
    public Void m50434h() {
        throw new IllegalStateException("unexpected retry".toString());
    }

    @Override // p001o.fve.InterfaceC13582b
    public boolean isReady() {
        return this.f47668b;
    }
}
