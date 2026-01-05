package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class tke implements id4 {

    /* renamed from: a */
    public final ArrayList f47340a = new ArrayList();

    @Override // p001o.id4
    /* renamed from: a */
    public nf8 mo31914a(long j) {
        int iM50126f = m50126f(j);
        if (iM50126f == 0) {
            return nf8.m40499E();
        }
        jd4 jd4Var = (jd4) this.f47340a.get(iM50126f - 1);
        long j2 = jd4Var.f30189d;
        return (j2 == -9223372036854775807L || j < j2) ? jd4Var.f30186a : nf8.m40499E();
    }

    @Override // p001o.id4
    /* renamed from: b */
    public long mo31915b(long j) {
        if (this.f47340a.isEmpty() || j < ((jd4) this.f47340a.get(0)).f30187b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.f47340a.size(); i++) {
            long j2 = ((jd4) this.f47340a.get(i)).f30187b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                jd4 jd4Var = (jd4) this.f47340a.get(i - 1);
                long j3 = jd4Var.f30189d;
                return (j3 == -9223372036854775807L || j3 > j) ? jd4Var.f30187b : j3;
            }
        }
        jd4 jd4Var2 = (jd4) z59.m58773d(this.f47340a);
        long j4 = jd4Var2.f30189d;
        return (j4 == -9223372036854775807L || j < j4) ? jd4Var2.f30187b : j4;
    }

    @Override // p001o.id4
    /* renamed from: c */
    public long mo31916c(long j) {
        if (this.f47340a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((jd4) this.f47340a.get(0)).f30187b) {
            return ((jd4) this.f47340a.get(0)).f30187b;
        }
        for (int i = 1; i < this.f47340a.size(); i++) {
            jd4 jd4Var = (jd4) this.f47340a.get(i);
            if (j < jd4Var.f30187b) {
                long j2 = ((jd4) this.f47340a.get(i - 1)).f30189d;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= jd4Var.f30187b) ? jd4Var.f30187b : j2;
            }
        }
        long j3 = ((jd4) z59.m58773d(this.f47340a)).f30189d;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // p001o.id4
    public void clear() {
        this.f47340a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p001o.id4
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo31917d(jd4 jd4Var, long j) {
        boolean z;
        op0.m42511a(jd4Var.f30187b != -9223372036854775807L);
        if (jd4Var.f30187b <= j) {
            long j2 = jd4Var.f30189d;
            z = j2 == -9223372036854775807L || j < j2;
        }
        for (int size = this.f47340a.size() - 1; size >= 0; size--) {
            if (jd4Var.f30187b >= ((jd4) this.f47340a.get(size)).f30187b) {
                this.f47340a.add(size + 1, jd4Var);
                return z;
            }
            if (((jd4) this.f47340a.get(size)).f30187b <= j) {
                z = false;
            }
        }
        this.f47340a.add(0, jd4Var);
        return z;
    }

    @Override // p001o.id4
    /* renamed from: e */
    public void mo31918e(long j) {
        int iM50126f = m50126f(j);
        if (iM50126f > 0) {
            this.f47340a.subList(0, iM50126f).clear();
        }
    }

    /* renamed from: f */
    public final int m50126f(long j) {
        for (int i = 0; i < this.f47340a.size(); i++) {
            if (j < ((jd4) this.f47340a.get(i)).f30187b) {
                return i;
            }
        }
        return this.f47340a.size();
    }
}
