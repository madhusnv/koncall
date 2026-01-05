package p001o;

import android.net.Uri;
import p001o.lmh;
import p001o.s2b;

/* loaded from: classes2.dex */
public final class nuf extends lmh {

    /* renamed from: r */
    public static final Object f37319r = new Object();

    /* renamed from: s */
    public static final s2b f37320s = new s2b.C16718c().m47472c("SinglePeriodTimeline").m47475f(Uri.EMPTY).m47470a();

    /* renamed from: e */
    public final long f37321e;

    /* renamed from: f */
    public final long f37322f;

    /* renamed from: g */
    public final long f37323g;

    /* renamed from: h */
    public final long f37324h;

    /* renamed from: i */
    public final long f37325i;

    /* renamed from: j */
    public final long f37326j;

    /* renamed from: k */
    public final long f37327k;

    /* renamed from: l */
    public final boolean f37328l;

    /* renamed from: m */
    public final boolean f37329m;

    /* renamed from: n */
    public final boolean f37330n;

    /* renamed from: o */
    public final Object f37331o;

    /* renamed from: p */
    public final s2b f37332p;

    /* renamed from: q */
    public final s2b.C16722g f37333q;

    public nuf(long j, boolean z, boolean z2, boolean z3, Object obj, s2b s2bVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, s2bVar);
    }

    @Override // p001o.lmh
    /* renamed from: b */
    public int mo6949b(Object obj) {
        return f37319r.equals(obj) ? 0 : -1;
    }

    @Override // p001o.lmh
    /* renamed from: g */
    public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
        op0.m42513c(i, 0, 1);
        return c15105b.m37497s(null, z ? f37319r : null, 0, this.f37324h, -this.f37326j);
    }

    @Override // p001o.lmh
    /* renamed from: i */
    public int mo6951i() {
        return 1;
    }

    @Override // p001o.lmh
    /* renamed from: m */
    public Object mo6952m(int i) {
        op0.m42513c(i, 0, 1);
        return f37319r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.lmh
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
        long j2;
        op0.m42513c(i, 0, 1);
        long j3 = this.f37327k;
        boolean z = this.f37329m;
        if (!z || this.f37330n || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f37325i;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 > j4) {
                }
            }
            j2 = -9223372036854775807L;
        }
        return c15106c.m37505g(lmh.C15106c.f34070q, this.f37332p, this.f37331o, this.f37321e, this.f37322f, this.f37323g, this.f37328l, z, this.f37333q, j2, this.f37325i, 0, 0, this.f37326j);
    }

    @Override // p001o.lmh
    /* renamed from: p */
    public int mo6954p() {
        return 1;
    }

    public nuf(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, s2b s2bVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, s2bVar, z3 ? s2bVar.f44482d : null);
    }

    public nuf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, s2b s2bVar, s2b.C16722g c16722g) {
        this.f37321e = j;
        this.f37322f = j2;
        this.f37323g = j3;
        this.f37324h = j4;
        this.f37325i = j5;
        this.f37326j = j6;
        this.f37327k = j7;
        this.f37328l = z;
        this.f37329m = z2;
        this.f37330n = z3;
        this.f37331o = obj;
        this.f37332p = (s2b) op0.m42515e(s2bVar);
        this.f37333q = c16722g;
    }
}
