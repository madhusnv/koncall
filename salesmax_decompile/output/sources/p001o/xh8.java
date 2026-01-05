package p001o;

import java.math.RoundingMode;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class xh8 implements cbf {

    /* renamed from: a */
    public final long f53788a;

    /* renamed from: b */
    public final bla f53789b;

    /* renamed from: c */
    public final bla f53790c;

    /* renamed from: d */
    public final int f53791d;

    /* renamed from: e */
    public long f53792e;

    public xh8(long j, long j2, long j3) {
        this.f53792e = j;
        this.f53788a = j3;
        bla blaVar = new bla();
        this.f53789b = blaVar;
        bla blaVar2 = new bla();
        this.f53790c = blaVar2;
        blaVar.m19329a(0L);
        blaVar2.m19329a(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.f53791d = -2147483647;
            return;
        }
        long jD1 = sqi.d1(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jD1 > 0 && jD1 <= 2147483647L) {
            i = (int) jD1;
        }
        this.f53791d = i;
    }

    /* renamed from: a */
    public boolean m56311a(long j) {
        bla blaVar = this.f53789b;
        return j - blaVar.m19330b(blaVar.m19331c() - 1) < 100000;
    }

    @Override // p001o.cbf
    /* renamed from: b */
    public long mo20725b(long j) {
        return this.f53789b.m19330b(sqi.m48726e(this.f53790c, j, true, true));
    }

    /* renamed from: c */
    public void m56312c(long j, long j2) {
        if (m56311a(j)) {
            return;
        }
        this.f53789b.m19329a(j);
        this.f53790c.m19329a(j2);
    }

    /* renamed from: d */
    public void m56313d(long j) {
        this.f53792e = j;
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        int iM48726e = sqi.m48726e(this.f53789b, j, true, true);
        bbf bbfVar = new bbf(this.f53789b.m19330b(iM48726e), this.f53790c.m19330b(iM48726e));
        if (bbfVar.f15877a == j || iM48726e == this.f53789b.m19331c() - 1) {
            return new zaf.C18603a(bbfVar);
        }
        int i = iM48726e + 1;
        return new zaf.C18603a(bbfVar, new bbf(this.f53789b.m19330b(i), this.f53790c.m19330b(i)));
    }

    @Override // p001o.cbf
    /* renamed from: g */
    public long mo20726g() {
        return this.f53788a;
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f53792e;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    @Override // p001o.cbf
    /* renamed from: j */
    public int mo20727j() {
        return this.f53791d;
    }
}
