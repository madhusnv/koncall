package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.nf8;

/* loaded from: classes2.dex */
public final class jbb implements id4 {

    /* renamed from: b */
    public static final mfc f30091b = mfc.m38937c().m38939d(new ol7() { // from class: o.hbb
        @Override // p001o.ol7
        public final Object apply(Object obj) {
            return jbb.m33477h((jd4) obj);
        }
    }).m38938a(mfc.m38937c().mo29478e().m38939d(new ol7() { // from class: o.ibb
        @Override // p001o.ol7
        public final Object apply(Object obj) {
            return jbb.m33478i((jd4) obj);
        }
    }));

    /* renamed from: a */
    public final List f30092a = new ArrayList();

    /* renamed from: h */
    public static /* synthetic */ Long m33477h(jd4 jd4Var) {
        return Long.valueOf(jd4Var.f30187b);
    }

    /* renamed from: i */
    public static /* synthetic */ Long m33478i(jd4 jd4Var) {
        return Long.valueOf(jd4Var.f30188c);
    }

    @Override // p001o.id4
    /* renamed from: a */
    public nf8 mo31914a(long j) {
        if (!this.f30092a.isEmpty()) {
            if (j >= ((jd4) this.f30092a.get(0)).f30187b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f30092a.size(); i++) {
                    jd4 jd4Var = (jd4) this.f30092a.get(i);
                    if (j >= jd4Var.f30187b && j < jd4Var.f30189d) {
                        arrayList.add(jd4Var);
                    }
                    if (j < jd4Var.f30187b) {
                        break;
                    }
                }
                nf8 nf8VarM40505M = nf8.m40505M(f30091b, arrayList);
                nf8.C15566a c15566aM40508q = nf8.m40508q();
                for (int i2 = 0; i2 < nf8VarM40505M.size(); i2++) {
                    c15566aM40508q.m40519j(((jd4) nf8VarM40505M.get(i2)).f30186a);
                }
                return c15566aM40508q.m40520k();
            }
        }
        return nf8.m40499E();
    }

    @Override // p001o.id4
    /* renamed from: b */
    public long mo31915b(long j) {
        if (this.f30092a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((jd4) this.f30092a.get(0)).f30187b) {
            return -9223372036854775807L;
        }
        long jMax = ((jd4) this.f30092a.get(0)).f30187b;
        for (int i = 0; i < this.f30092a.size(); i++) {
            long j2 = ((jd4) this.f30092a.get(i)).f30187b;
            long j3 = ((jd4) this.f30092a.get(i)).f30189d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // p001o.id4
    /* renamed from: c */
    public long mo31916c(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i >= this.f30092a.size()) {
                break;
            }
            long j2 = ((jd4) this.f30092a.get(i)).f30187b;
            long j3 = ((jd4) this.f30092a.get(i)).f30189d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p001o.id4
    public void clear() {
        this.f30092a.clear();
    }

    @Override // p001o.id4
    /* renamed from: d */
    public boolean mo31917d(jd4 jd4Var, long j) {
        op0.m42511a(jd4Var.f30187b != -9223372036854775807L);
        op0.m42511a(jd4Var.f30188c != -9223372036854775807L);
        boolean z = jd4Var.f30187b <= j && j < jd4Var.f30189d;
        for (int size = this.f30092a.size() - 1; size >= 0; size--) {
            if (jd4Var.f30187b >= ((jd4) this.f30092a.get(size)).f30187b) {
                this.f30092a.add(size + 1, jd4Var);
                return z;
            }
        }
        this.f30092a.add(0, jd4Var);
        return z;
    }

    @Override // p001o.id4
    /* renamed from: e */
    public void mo31918e(long j) {
        int i = 0;
        while (i < this.f30092a.size()) {
            long j2 = ((jd4) this.f30092a.get(i)).f30187b;
            if (j > j2 && j > ((jd4) this.f30092a.get(i)).f30189d) {
                this.f30092a.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
