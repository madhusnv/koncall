package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class ld4 implements gbg {

    /* renamed from: c */
    public static final mfc f33639c = mfc.m38937c().m38939d(new ol7() { // from class: o.kd4
        @Override // p001o.ol7
        public final Object apply(Object obj) {
            return ld4.m36968g((jd4) obj);
        }
    });

    /* renamed from: a */
    public final nf8 f33640a;

    /* renamed from: b */
    public final long[] f33641b;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ld4(List list) {
        if (list.size() == 1) {
            jd4 jd4Var = (jd4) z59.m58775f(list);
            long jM36969h = m36969h(jd4Var.f30187b);
            if (jd4Var.f30188c == -9223372036854775807L) {
                this.f33640a = nf8.m40500F(jd4Var.f30186a);
                this.f33641b = new long[]{jM36969h};
                return;
            } else {
                this.f33640a = nf8.m40501G(jd4Var.f30186a, nf8.m40499E());
                this.f33641b = new long[]{jM36969h, jM36969h + jd4Var.f30188c};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f33641b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        nf8 nf8VarM40505M = nf8.m40505M(f33639c, list);
        int i = 0;
        for (int i2 = 0; i2 < nf8VarM40505M.size(); i2++) {
            jd4 jd4Var2 = (jd4) nf8VarM40505M.get(i2);
            long jM36969h2 = m36969h(jd4Var2.f30187b);
            long j = jd4Var2.f30188c + jM36969h2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.f33641b[i3];
                if (j2 < jM36969h2) {
                    this.f33641b[i] = jM36969h2;
                    arrayList.add(jd4Var2.f30186a);
                    i++;
                } else if (j2 == jM36969h2 && ((nf8) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, jd4Var2.f30186a);
                } else {
                    ria.m46824h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f33641b[i3] = jM36969h2;
                    arrayList.set(i3, jd4Var2.f30186a);
                }
            }
            if (jd4Var2.f30188c != -9223372036854775807L) {
                this.f33641b[i] = j;
                arrayList.add(nf8.m40499E());
                i++;
            }
        }
        this.f33640a = nf8.m40511y(arrayList);
    }

    /* renamed from: g */
    public static /* synthetic */ Comparable m36968g(jd4 jd4Var) {
        return Long.valueOf(m36969h(jd4Var.f30187b));
    }

    /* renamed from: h */
    public static long m36969h(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // p001o.gbg
    /* renamed from: a */
    public int mo21115a(long j) {
        int iM48725d = sqi.m48725d(this.f33641b, j, false, false);
        if (iM48725d < this.f33640a.size()) {
            return iM48725d;
        }
        return -1;
    }

    @Override // p001o.gbg
    /* renamed from: d */
    public long mo21117d(int i) {
        op0.m42511a(i < this.f33640a.size());
        return this.f33641b[i];
    }

    @Override // p001o.gbg
    /* renamed from: e */
    public int mo21118e() {
        return this.f33640a.size();
    }

    @Override // p001o.gbg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public nf8 mo21116c(long j) {
        int iM48728g = sqi.m48728g(this.f33641b, j, true, false);
        return iM48728g == -1 ? nf8.m40499E() : (nf8) this.f33640a.get(iM48728g);
    }
}
