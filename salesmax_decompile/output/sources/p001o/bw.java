package p001o;

import androidx.media3.common.C2181a;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001o.ko6;
import p001o.nf8;
import p001o.x8b;

/* loaded from: classes2.dex */
public class bw extends df1 {

    /* renamed from: h */
    public final ta1 f16887h;

    /* renamed from: i */
    public final long f16888i;

    /* renamed from: j */
    public final long f16889j;

    /* renamed from: k */
    public final long f16890k;

    /* renamed from: l */
    public final int f16891l;

    /* renamed from: m */
    public final int f16892m;

    /* renamed from: n */
    public final float f16893n;

    /* renamed from: o */
    public final float f16894o;

    /* renamed from: p */
    public final nf8 f16895p;

    /* renamed from: q */
    public final jb3 f16896q;

    /* renamed from: r */
    public float f16897r;

    /* renamed from: s */
    public int f16898s;

    /* renamed from: t */
    public int f16899t;

    /* renamed from: u */
    public long f16900u;

    /* renamed from: v */
    public j1b f16901v;

    /* renamed from: w */
    public long f16902w;

    /* renamed from: o.bw$a */
    public static final class C12512a {

        /* renamed from: a */
        public final long f16903a;

        /* renamed from: b */
        public final long f16904b;

        public C12512a(long j, long j2) {
            this.f16903a = j;
            this.f16904b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12512a)) {
                return false;
            }
            C12512a c12512a = (C12512a) obj;
            return this.f16903a == c12512a.f16903a && this.f16904b == c12512a.f16904b;
        }

        public int hashCode() {
            return (((int) this.f16903a) * 31) + ((int) this.f16904b);
        }
    }

    /* renamed from: o.bw$b */
    public static class C12513b implements ko6.InterfaceC14893b {

        /* renamed from: a */
        public final int f16905a;

        /* renamed from: b */
        public final int f16906b;

        /* renamed from: c */
        public final int f16907c;

        /* renamed from: d */
        public final int f16908d;

        /* renamed from: e */
        public final int f16909e;

        /* renamed from: f */
        public final float f16910f;

        /* renamed from: g */
        public final float f16911g;

        /* renamed from: h */
        public final jb3 f16912h;

        public C12513b() {
            this(TransferRecord.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.7f);
        }

        @Override // p001o.ko6.InterfaceC14893b
        /* renamed from: a */
        public final ko6[] mo19895a(ko6.C14892a[] c14892aArr, ta1 ta1Var, x8b.C18076b c18076b, lmh lmhVar) {
            nf8 nf8VarM19883z = bw.m19883z(c14892aArr);
            ko6[] ko6VarArr = new ko6[c14892aArr.length];
            for (int i = 0; i < c14892aArr.length; i++) {
                ko6.C14892a c14892a = c14892aArr[i];
                if (c14892a != null) {
                    int[] iArr = c14892a.f32502b;
                    if (iArr.length != 0) {
                        ko6VarArr[i] = iArr.length == 1 ? new a27(c14892a.f32501a, iArr[0], c14892a.f32503c) : m19896b(c14892a.f32501a, iArr, c14892a.f32503c, ta1Var, (nf8) nf8VarM19883z.get(i));
                    }
                }
            }
            return ko6VarArr;
        }

        /* renamed from: b */
        public bw m19896b(qth qthVar, int[] iArr, int i, ta1 ta1Var, nf8 nf8Var) {
            return new bw(qthVar, iArr, i, ta1Var, this.f16905a, this.f16906b, this.f16907c, this.f16908d, this.f16909e, this.f16910f, this.f16911g, nf8Var, this.f16912h);
        }

        public C12513b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, jb3.f30077a);
        }

        public C12513b(int i, int i2, int i3, int i4, int i5, float f, float f2, jb3 jb3Var) {
            this.f16905a = i;
            this.f16906b = i2;
            this.f16907c = i3;
            this.f16908d = i4;
            this.f16909e = i5;
            this.f16910f = f;
            this.f16911g = f2;
            this.f16912h = jb3Var;
        }
    }

    public bw(qth qthVar, int[] iArr, int i, ta1 ta1Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, jb3 jb3Var) {
        ta1 ta1Var2;
        long j4;
        super(qthVar, iArr, i);
        if (j3 < j) {
            ria.m46824h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            ta1Var2 = ta1Var;
            j4 = j;
        } else {
            ta1Var2 = ta1Var;
            j4 = j3;
        }
        this.f16887h = ta1Var2;
        this.f16888i = j * 1000;
        this.f16889j = j2 * 1000;
        this.f16890k = j4 * 1000;
        this.f16891l = i2;
        this.f16892m = i3;
        this.f16893n = f;
        this.f16894o = f2;
        this.f16895p = nf8.m40511y(list);
        this.f16896q = jb3Var;
        this.f16897r = 1.0f;
        this.f16899t = 0;
        this.f16900u = -9223372036854775807L;
        this.f16902w = -2147483647L;
    }

    /* renamed from: E */
    public static long[][] m19879E(ko6.C14892a[] c14892aArr) {
        long[][] jArr = new long[c14892aArr.length][];
        for (int i = 0; i < c14892aArr.length; i++) {
            ko6.C14892a c14892a = c14892aArr[i];
            if (c14892a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c14892a.f32502b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = c14892a.f32502b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = c14892a.f32501a.m45839a(iArr[i2]).f7938i;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: F */
    public static nf8 m19880F(long[][] jArr) {
        zea zeaVarMo39462e = mob.m39458c().m39463a().mo39462e();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    int length2 = jArr3.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i2 >= length2) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    zeaVarMo39462e.put(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return nf8.m40511y(zeaVarMo39462e.values());
    }

    /* renamed from: w */
    public static void m19882w(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            nf8.C15566a c15566a = (nf8.C15566a) list.get(i);
            if (c15566a != null) {
                c15566a.mo32056a(new C12512a(j, jArr[i]));
            }
        }
    }

    /* renamed from: z */
    public static nf8 m19883z(ko6.C14892a[] c14892aArr) {
        ArrayList arrayList = new ArrayList();
        for (ko6.C14892a c14892a : c14892aArr) {
            if (c14892a == null || c14892a.f32502b.length <= 1) {
                arrayList.add(null);
            } else {
                nf8.C15566a c15566aM40508q = nf8.m40508q();
                c15566aM40508q.mo32056a(new C12512a(0L, 0L));
                arrayList.add(c15566aM40508q);
            }
        }
        long[][] jArrM19879E = m19879E(c14892aArr);
        int[] iArr = new int[jArrM19879E.length];
        long[] jArr = new long[jArrM19879E.length];
        for (int i = 0; i < jArrM19879E.length; i++) {
            long[] jArr2 = jArrM19879E[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m19882w(arrayList, jArr);
        nf8 nf8VarM19880F = m19880F(jArrM19879E);
        for (int i2 = 0; i2 < nf8VarM19880F.size(); i2++) {
            int iIntValue = ((Integer) nf8VarM19880F.get(i2)).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrM19879E[iIntValue][i3];
            m19882w(arrayList, jArr);
        }
        for (int i4 = 0; i4 < c14892aArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m19882w(arrayList, jArr);
        nf8.C15566a c15566aM40508q2 = nf8.m40508q();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            nf8.C15566a c15566a = (nf8.C15566a) arrayList.get(i5);
            c15566aM40508q2.mo32056a(c15566a == null ? nf8.m40499E() : c15566a.m40520k());
        }
        return c15566aM40508q2.m40520k();
    }

    /* renamed from: A */
    public final long m19884A(long j) {
        long jM19888G = m19888G(j);
        if (this.f16895p.isEmpty()) {
            return jM19888G;
        }
        int i = 1;
        while (i < this.f16895p.size() - 1 && ((C12512a) this.f16895p.get(i)).f16903a < jM19888G) {
            i++;
        }
        C12512a c12512a = (C12512a) this.f16895p.get(i - 1);
        C12512a c12512a2 = (C12512a) this.f16895p.get(i);
        long j2 = c12512a.f16903a;
        float f = (jM19888G - j2) / (c12512a2.f16903a - j2);
        return c12512a.f16904b + ((long) (f * (c12512a2.f16904b - r2)));
    }

    /* renamed from: B */
    public final long m19885B(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        j1b j1bVar = (j1b) z59.m58773d(list);
        long j = j1bVar.f31665g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = j1bVar.f31666h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: C */
    public long m19886C() {
        return this.f16890k;
    }

    /* renamed from: D */
    public final long m19887D(k1b[] k1bVarArr, List list) {
        int i = this.f16898s;
        if (i < k1bVarArr.length && k1bVarArr[i].next()) {
            k1b k1bVar = k1bVarArr[this.f16898s];
            return k1bVar.mo7053b() - k1bVar.mo7052a();
        }
        for (k1b k1bVar2 : k1bVarArr) {
            if (k1bVar2.next()) {
                return k1bVar2.mo7053b() - k1bVar2.mo7052a();
            }
        }
        return m19885B(list);
    }

    /* renamed from: G */
    public final long m19888G(long j) {
        long jMo24758e = this.f16887h.mo24758e();
        this.f16902w = jMo24758e;
        long j2 = (long) (jMo24758e * this.f16893n);
        long jM49585b = this.f16887h.m49585b();
        if (jM49585b == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.f16897r);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.f16897r) - jM49585b, 0.0f)) / f);
    }

    /* renamed from: H */
    public final long m19889H(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f16888i;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.f16894o), this.f16888i);
    }

    /* renamed from: I */
    public boolean m19890I(long j, List list) {
        long j2 = this.f16900u;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((j1b) z59.m58773d(list)).equals(this.f16901v));
    }

    @Override // p001o.ko6
    /* renamed from: d */
    public int mo16357d() {
        return this.f16898s;
    }

    @Override // p001o.df1, p001o.ko6
    public void disable() {
        this.f16901v = null;
    }

    @Override // p001o.df1, p001o.ko6
    public void enable() {
        this.f16900u = -9223372036854775807L;
        this.f16901v = null;
    }

    @Override // p001o.df1, p001o.ko6
    /* renamed from: h */
    public void mo19891h(float f) {
        this.f16897r = f;
    }

    @Override // p001o.ko6
    /* renamed from: i */
    public Object mo16358i() {
        return null;
    }

    @Override // p001o.ko6
    /* renamed from: k */
    public void mo16359k(long j, long j2, long j3, List list, k1b[] k1bVarArr) {
        long jElapsedRealtime = this.f16896q.elapsedRealtime();
        long jM19887D = m19887D(k1bVarArr, list);
        int i = this.f16899t;
        if (i == 0) {
            this.f16899t = 1;
            this.f16898s = m19894y(jElapsedRealtime, jM19887D);
            return;
        }
        int i2 = this.f16898s;
        int iMo22948b = list.isEmpty() ? -1 : mo22948b(((j1b) z59.m58773d(list)).f31662d);
        if (iMo22948b != -1) {
            i = ((j1b) z59.m58773d(list)).f31663e;
            i2 = iMo22948b;
        }
        int iM19894y = m19894y(jElapsedRealtime, jM19887D);
        if (iM19894y != i2 && !mo22947a(i2, jElapsedRealtime)) {
            C2181a c2181aMo22949e = mo22949e(i2);
            C2181a c2181aMo22949e2 = mo22949e(iM19894y);
            long jM19889H = m19889H(j3, jM19887D);
            int i3 = c2181aMo22949e2.f7938i;
            int i4 = c2181aMo22949e.f7938i;
            if ((i3 > i4 && j2 < jM19889H) || (i3 < i4 && j2 >= this.f16889j)) {
                iM19894y = i2;
            }
        }
        if (iM19894y != i2) {
            i = 3;
        }
        this.f16899t = i;
        this.f16898s = iM19894y;
    }

    @Override // p001o.df1, p001o.ko6
    /* renamed from: o */
    public int mo19892o(long j, List list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f16896q.elapsedRealtime();
        if (!m19890I(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f16900u = jElapsedRealtime;
        this.f16901v = list.isEmpty() ? null : (j1b) z59.m58773d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jJ0 = sqi.j0(((j1b) list.get(size - 1)).f31665g - j, this.f16897r);
        long jM19886C = m19886C();
        if (jJ0 < jM19886C) {
            return size;
        }
        C2181a c2181aMo22949e = mo22949e(m19894y(jElapsedRealtime, m19885B(list)));
        for (int i3 = 0; i3 < size; i3++) {
            j1b j1bVar = (j1b) list.get(i3);
            C2181a c2181a = j1bVar.f31662d;
            if (sqi.j0(j1bVar.f31665g - j, this.f16897r) >= jM19886C && c2181a.f7938i < c2181aMo22949e.f7938i && (i = c2181a.f7950u) != -1 && i <= this.f16892m && (i2 = c2181a.f7949t) != -1 && i2 <= this.f16891l && i < c2181aMo22949e.f7950u) {
                return i3;
            }
        }
        return size;
    }

    @Override // p001o.ko6
    /* renamed from: r */
    public int mo16360r() {
        return this.f16899t;
    }

    /* renamed from: x */
    public boolean m19893x(C2181a c2181a, int i, long j) {
        return ((long) i) <= j;
    }

    /* renamed from: y */
    public final int m19894y(long j, long j2) {
        long jM19884A = m19884A(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f19722b; i2++) {
            if (j == Long.MIN_VALUE || !mo22947a(i2, j)) {
                C2181a c2181aMo22949e = mo22949e(i2);
                if (m19893x(c2181aMo22949e, c2181aMo22949e.f7938i, jM19884A)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }
}
