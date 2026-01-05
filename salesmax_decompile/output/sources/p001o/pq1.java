package p001o;

import p001o.m18;
import p001o.oq1;

/* loaded from: classes3.dex */
public final class pq1 extends m18.AbstractC15193a implements rq1 {

    /* renamed from: b */
    public final oq1.AbstractC15863a f40403b;

    /* renamed from: c */
    public final Long f40404c;

    public pq1(oq1.AbstractC15863a abstractC15863a) {
        sq8.m48649h(abstractC15863a, "stream");
        this.f40403b = abstractC15863a;
        this.f40404c = getStream().mo39989a();
    }

    @Override // p001o.m18.AbstractC15193a
    /* renamed from: a */
    public byte[] mo38177a() {
        return getStream().mo39990c();
    }

    @Override // p001o.rq1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public oq1.AbstractC15863a getStream() {
        return this.f40403b;
    }

    @Override // p001o.m18
    public Long getContentLength() {
        return this.f40404c;
    }
}
