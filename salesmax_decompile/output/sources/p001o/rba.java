package p001o;

import java.util.List;
import p001o.qbg;

/* loaded from: classes2.dex */
public abstract class rba {
    /* renamed from: a */
    public static int m46484a(gbg gbgVar, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int iMo21115a = gbgVar.mo21115a(j);
        if (iMo21115a == -1) {
            iMo21115a = gbgVar.mo21118e();
        }
        return (iMo21115a <= 0 || gbgVar.mo21117d(iMo21115a + (-1)) != j) ? iMo21115a : iMo21115a - 1;
    }

    /* renamed from: b */
    public static void m46485b(gbg gbgVar, int i, fu3 fu3Var) {
        long jMo21117d = gbgVar.mo21117d(i);
        List listMo21116c = gbgVar.mo21116c(jMo21117d);
        if (listMo21116c.isEmpty()) {
            return;
        }
        if (i == gbgVar.mo21118e() - 1) {
            throw new IllegalStateException();
        }
        long jMo21117d2 = gbgVar.mo21117d(i + 1) - gbgVar.mo21117d(i);
        if (jMo21117d2 > 0) {
            fu3Var.accept(new jd4(listMo21116c, jMo21117d, jMo21117d2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m46486c(gbg gbgVar, qbg.C16330b c16330b, fu3 fu3Var) {
        boolean z;
        int iM46484a = m46484a(gbgVar, c16330b.f41602a);
        if (c16330b.f41602a == -9223372036854775807L || iM46484a >= gbgVar.mo21118e()) {
            z = false;
        } else {
            List listMo21116c = gbgVar.mo21116c(c16330b.f41602a);
            long jMo21117d = gbgVar.mo21117d(iM46484a);
            if (!listMo21116c.isEmpty()) {
                long j = c16330b.f41602a;
                if (j < jMo21117d) {
                    fu3Var.accept(new jd4(listMo21116c, j, jMo21117d - j));
                    z = true;
                }
            }
        }
        for (int i = iM46484a; i < gbgVar.mo21118e(); i++) {
            m46485b(gbgVar, i, fu3Var);
        }
        if (c16330b.f41603b) {
            if (z) {
                iM46484a--;
            }
            for (int i2 = 0; i2 < iM46484a; i2++) {
                m46485b(gbgVar, i2, fu3Var);
            }
            if (z) {
                fu3Var.accept(new jd4(gbgVar.mo21116c(c16330b.f41602a), gbgVar.mo21117d(iM46484a), c16330b.f41602a - gbgVar.mo21117d(iM46484a)));
            }
        }
    }
}
