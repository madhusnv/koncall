package p001o;

import p001o.j27;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class i27 implements zaf {

    /* renamed from: a */
    public final j27 f27962a;

    /* renamed from: b */
    public final long f27963b;

    public i27(j27 j27Var, long j) {
        this.f27962a = j27Var;
        this.f27963b = j;
    }

    /* renamed from: a */
    public final bbf m31404a(long j, long j2) {
        return new bbf((j * 1000000) / this.f27962a.f29618e, this.f27963b + j2);
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        op0.m42519i(this.f27962a.f29624k);
        j27 j27Var = this.f27962a;
        j27.C14432a c14432a = j27Var.f29624k;
        long[] jArr = c14432a.f29626a;
        long[] jArr2 = c14432a.f29627b;
        int iM48728g = sqi.m48728g(jArr, j27Var.m33096i(j), true, false);
        bbf bbfVarM31404a = m31404a(iM48728g == -1 ? 0L : jArr[iM48728g], iM48728g != -1 ? jArr2[iM48728g] : 0L);
        if (bbfVarM31404a.f15877a == j || iM48728g == jArr.length - 1) {
            return new zaf.C18603a(bbfVarM31404a);
        }
        int i = iM48728g + 1;
        return new zaf.C18603a(bbfVarM31404a, m31404a(jArr[i], jArr2[i]));
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f27962a.m33093f();
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }
}
