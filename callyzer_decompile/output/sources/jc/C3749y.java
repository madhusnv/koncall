package jc;

import hc.AbstractC2879b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.y */
/* loaded from: classes.dex */
public final class C3749y extends AbstractC2879b {

    /* renamed from: a */
    public final Long f19604a;

    /* renamed from: b */
    public final boolean f19605b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3745u f19606c;

    public C3749y(AbstractC3745u abstractC3745u) {
        this.f19606c = abstractC3745u;
        this.f19604a = abstractC3745u.getContentLength();
        this.f19605b = abstractC3745u.isOneShot();
    }

    @Override // hc.AbstractC2880c
    /* renamed from: a */
    public final Long mo6995a() {
        return this.f19604a;
    }

    @Override // hc.AbstractC2880c
    /* renamed from: b */
    public final boolean mo6996b() {
        return this.f19605b;
    }

    @Override // hc.AbstractC2879b
    /* renamed from: c */
    public final wc.e0 mo6994c() {
        return ((AbstractC3744t) this.f19606c).readFrom();
    }
}
