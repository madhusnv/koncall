package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class nbg extends b85 implements gbg {

    /* renamed from: e */
    public gbg f36659e;

    /* renamed from: f */
    public long f36660f;

    @Override // p001o.gbg
    /* renamed from: a */
    public int mo21115a(long j) {
        return ((gbg) op0.m42515e(this.f36659e)).mo21115a(j - this.f36660f);
    }

    @Override // p001o.gbg
    /* renamed from: c */
    public List mo21116c(long j) {
        return ((gbg) op0.m42515e(this.f36659e)).mo21116c(j - this.f36660f);
    }

    @Override // p001o.gbg
    /* renamed from: d */
    public long mo21117d(int i) {
        return ((gbg) op0.m42515e(this.f36659e)).mo21117d(i) + this.f36660f;
    }

    @Override // p001o.gbg
    /* renamed from: e */
    public int mo21118e() {
        return ((gbg) op0.m42515e(this.f36659e)).mo21118e();
    }

    @Override // p001o.b85, p001o.tl1
    /* renamed from: h */
    public void mo16674h() {
        super.mo16674h();
        this.f36659e = null;
    }

    /* renamed from: v */
    public void m40292v(long j, gbg gbgVar, long j2) {
        this.f15666b = j;
        this.f36659e = gbgVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f36660f = j;
    }
}
