package p001o;

import p001o.zaf;

/* loaded from: classes2.dex */
public final class f4j implements zaf {

    /* renamed from: a */
    public final d4j f22681a;

    /* renamed from: b */
    public final int f22682b;

    /* renamed from: c */
    public final long f22683c;

    /* renamed from: d */
    public final long f22684d;

    /* renamed from: e */
    public final long f22685e;

    public f4j(d4j d4jVar, int i, long j, long j2) {
        this.f22681a = d4jVar;
        this.f22682b = i;
        this.f22683c = j;
        long j3 = (j2 - j) / d4jVar.f19096e;
        this.f22684d = j3;
        this.f22685e = m26073a(j3);
    }

    /* renamed from: a */
    public final long m26073a(long j) {
        return sqi.a1(j * this.f22682b, 1000000L, this.f22681a.f19094c);
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        long jM48737p = sqi.m48737p((this.f22681a.f19094c * j) / (this.f22682b * 1000000), 0L, this.f22684d - 1);
        long j2 = this.f22683c + (this.f22681a.f19096e * jM48737p);
        long jM26073a = m26073a(jM48737p);
        bbf bbfVar = new bbf(jM26073a, j2);
        if (jM26073a >= j || jM48737p == this.f22684d - 1) {
            return new zaf.C18603a(bbfVar);
        }
        long j3 = jM48737p + 1;
        return new zaf.C18603a(bbfVar, new bbf(m26073a(j3), this.f22683c + (this.f22681a.f19096e * j3)));
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f22685e;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }
}
