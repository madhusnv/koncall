package p001o;

import p001o.m18;
import p001o.oq1;

/* loaded from: classes3.dex */
public final class uq1 extends m18.AbstractC15197e implements rq1 {

    /* renamed from: a */
    public final oq1.AbstractC15866d f49368a;

    /* renamed from: b */
    public final Long f49369b;

    /* renamed from: c */
    public final boolean f49370c;

    public uq1(oq1.AbstractC15866d abstractC15866d) {
        sq8.m48649h(abstractC15866d, "stream");
        this.f49368a = abstractC15866d;
        this.f49369b = getStream().mo39989a();
        this.f49370c = getStream().mo39991b();
    }

    @Override // p001o.rq1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oq1.AbstractC15866d getStream() {
        return this.f49368a;
    }

    @Override // p001o.m18
    public Long getContentLength() {
        return this.f49369b;
    }

    @Override // p001o.m18
    public boolean isOneShot() {
        return this.f49370c;
    }

    @Override // p001o.m18.AbstractC15197e
    public h8f readFrom() {
        return getStream().mo39993c();
    }
}
