package p001o;

import p001o.inb;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class esi implements cbf {

    /* renamed from: a */
    public final long[] f22120a;

    /* renamed from: b */
    public final long[] f22121b;

    /* renamed from: c */
    public final long f22122c;

    /* renamed from: d */
    public final long f22123d;

    /* renamed from: e */
    public final int f22124e;

    public esi(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f22120a = jArr;
        this.f22121b = jArr2;
        this.f22122c = j;
        this.f22123d = j2;
        this.f22124e = i;
    }

    /* renamed from: a */
    public static esi m25529a(long j, long j2, inb.C14334a c14334a, zwc zwcVar) {
        int iM60004H;
        zwcVar.m60018V(10);
        int iM60036q = zwcVar.m60036q();
        if (iM60036q <= 0) {
            return null;
        }
        int i = c14334a.f28966d;
        long jA1 = sqi.a1(iM60036q, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int iM60010N = zwcVar.m60010N();
        int iM60010N2 = zwcVar.m60010N();
        int iM60010N3 = zwcVar.m60010N();
        zwcVar.m60018V(2);
        long j3 = j2 + c14334a.f28965c;
        long[] jArr = new long[iM60010N];
        long[] jArr2 = new long[iM60010N];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iM60010N) {
            int i3 = iM60010N2;
            long j5 = j3;
            jArr[i2] = (i2 * jA1) / iM60010N;
            jArr2[i2] = Math.max(j4, j5);
            if (iM60010N3 == 1) {
                iM60004H = zwcVar.m60004H();
            } else if (iM60010N3 == 2) {
                iM60004H = zwcVar.m60010N();
            } else if (iM60010N3 == 3) {
                iM60004H = zwcVar.m60007K();
            } else {
                if (iM60010N3 != 4) {
                    return null;
                }
                iM60004H = zwcVar.m60008L();
            }
            j4 += iM60004H * i3;
            i2++;
            iM60010N = iM60010N;
            iM60010N2 = i3;
            j3 = j5;
        }
        if (j != -1 && j != j4) {
            ria.m46824h("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new esi(jArr, jArr2, jA1, j4, c14334a.f28968f);
    }

    @Override // p001o.cbf
    /* renamed from: b */
    public long mo20725b(long j) {
        return this.f22120a[sqi.m48728g(this.f22121b, j, true, true)];
    }

    @Override // p001o.zaf
    /* renamed from: e */
    public zaf.C18603a mo25530e(long j) {
        int iM48728g = sqi.m48728g(this.f22120a, j, true, true);
        bbf bbfVar = new bbf(this.f22120a[iM48728g], this.f22121b[iM48728g]);
        if (bbfVar.f15877a >= j || iM48728g == this.f22120a.length - 1) {
            return new zaf.C18603a(bbfVar);
        }
        int i = iM48728g + 1;
        return new zaf.C18603a(bbfVar, new bbf(this.f22120a[i], this.f22121b[i]));
    }

    @Override // p001o.cbf
    /* renamed from: g */
    public long mo20726g() {
        return this.f22123d;
    }

    @Override // p001o.zaf
    public long getDurationUs() {
        return this.f22122c;
    }

    @Override // p001o.zaf
    /* renamed from: h */
    public boolean mo25531h() {
        return true;
    }

    @Override // p001o.cbf
    /* renamed from: j */
    public int mo20727j() {
        return this.f22124e;
    }
}
