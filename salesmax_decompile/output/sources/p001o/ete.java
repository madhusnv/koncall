package p001o;

import p001o.fve;

/* loaded from: classes6.dex */
public final class ete implements fve.InterfaceC13582b {

    /* renamed from: a */
    public final zce f22155a;

    /* renamed from: b */
    public final boolean f22156b;

    public ete(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        this.f22155a = zceVar;
        this.f22156b = true;
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: a */
    public zce mo25596a() {
        return this.f22155a;
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    /* renamed from: c */
    public Void m25598c() {
        throw new IllegalStateException("already connected".toString());
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: d */
    public /* bridge */ /* synthetic */ fve.C13581a mo25599d() {
        return (fve.C13581a) m25602g();
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: e */
    public /* bridge */ /* synthetic */ fve.InterfaceC13582b mo25600e() {
        return (fve.InterfaceC13582b) m25604i();
    }

    @Override // p001o.fve.InterfaceC13582b
    /* renamed from: f */
    public /* bridge */ /* synthetic */ fve.C13581a mo25601f() {
        return (fve.C13581a) m25598c();
    }

    /* renamed from: g */
    public Void m25602g() {
        throw new IllegalStateException("already connected".toString());
    }

    /* renamed from: h */
    public final zce m25603h() {
        return this.f22155a;
    }

    /* renamed from: i */
    public Void m25604i() {
        throw new IllegalStateException("unexpected retry".toString());
    }

    @Override // p001o.fve.InterfaceC13582b
    public boolean isReady() {
        return this.f22156b;
    }
}
