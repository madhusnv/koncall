package p001o;

import p001o.m18;
import p001o.oq1;

/* loaded from: classes3.dex */
public final class qq1 extends m18.AbstractC15194b implements rq1 {

    /* renamed from: a */
    public final oq1.AbstractC15864b f42281a;

    /* renamed from: b */
    public final Long f42282b;

    /* renamed from: c */
    public final boolean f42283c;

    public qq1(oq1.AbstractC15864b abstractC15864b) {
        sq8.m48649h(abstractC15864b, "stream");
        this.f42281a = abstractC15864b;
        this.f42282b = getStream().mo39989a();
        this.f42283c = getStream().mo39991b();
    }

    @Override // p001o.rq1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oq1.AbstractC15864b getStream() {
        return this.f42281a;
    }

    @Override // p001o.m18
    public Long getContentLength() {
        return this.f42282b;
    }

    @Override // p001o.m18
    public boolean isOneShot() {
        return this.f42283c;
    }

    @Override // p001o.m18.AbstractC15194b
    public y6f readFrom() {
        return getStream().mo39992c();
    }
}
