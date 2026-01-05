package p001o;

import android.net.Uri;
import android.util.Pair;
import p001o.rv;
import p001o.s2b;

/* loaded from: classes2.dex */
public abstract class lmh {

    /* renamed from: a */
    public static final lmh f34048a = new C15104a();

    /* renamed from: b */
    public static final String f34049b = sqi.B0(0);

    /* renamed from: c */
    public static final String f34050c = sqi.B0(1);

    /* renamed from: d */
    public static final String f34051d = sqi.B0(2);

    /* renamed from: o.lmh$a */
    public class C15104a extends lmh {
        @Override // p001o.lmh
        /* renamed from: b */
        public int mo6949b(Object obj) {
            return -1;
        }

        @Override // p001o.lmh
        /* renamed from: g */
        public C15105b mo6950g(int i, C15105b c15105b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p001o.lmh
        /* renamed from: i */
        public int mo6951i() {
            return 0;
        }

        @Override // p001o.lmh
        /* renamed from: m */
        public Object mo6952m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p001o.lmh
        /* renamed from: o */
        public C15106c mo6953o(int i, C15106c c15106c, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p001o.lmh
        /* renamed from: p */
        public int mo6954p() {
            return 0;
        }
    }

    /* renamed from: o.lmh$b */
    public static final class C15105b {

        /* renamed from: h */
        public static final String f34052h = sqi.B0(0);

        /* renamed from: i */
        public static final String f34053i = sqi.B0(1);

        /* renamed from: j */
        public static final String f34054j = sqi.B0(2);

        /* renamed from: k */
        public static final String f34055k = sqi.B0(3);

        /* renamed from: l */
        public static final String f34056l = sqi.B0(4);

        /* renamed from: a */
        public Object f34057a;

        /* renamed from: b */
        public Object f34058b;

        /* renamed from: c */
        public int f34059c;

        /* renamed from: d */
        public long f34060d;

        /* renamed from: e */
        public long f34061e;

        /* renamed from: f */
        public boolean f34062f;

        /* renamed from: g */
        public rv f34063g = rv.f44094g;

        /* renamed from: a */
        public int m37479a(int i) {
            return this.f34063g.m47168a(i).f44116b;
        }

        /* renamed from: b */
        public long m37480b(int i, int i2) {
            rv.C16672a c16672aM47168a = this.f34063g.m47168a(i);
            if (c16672aM47168a.f44116b != -1) {
                return c16672aM47168a.f44121g[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m37481c() {
            return this.f34063g.f44101b;
        }

        /* renamed from: d */
        public int m37482d(long j) {
            return this.f34063g.m47169b(j, this.f34060d);
        }

        /* renamed from: e */
        public int m37483e(long j) {
            return this.f34063g.m47170c(j, this.f34060d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C15105b.class.equals(obj.getClass())) {
                return false;
            }
            C15105b c15105b = (C15105b) obj;
            return sqi.m48724c(this.f34057a, c15105b.f34057a) && sqi.m48724c(this.f34058b, c15105b.f34058b) && this.f34059c == c15105b.f34059c && this.f34060d == c15105b.f34060d && this.f34061e == c15105b.f34061e && this.f34062f == c15105b.f34062f && sqi.m48724c(this.f34063g, c15105b.f34063g);
        }

        /* renamed from: f */
        public long m37484f(int i) {
            return this.f34063g.m47168a(i).f44115a;
        }

        /* renamed from: g */
        public long m37485g() {
            return this.f34063g.f44102c;
        }

        /* renamed from: h */
        public int m37486h(int i, int i2) {
            rv.C16672a c16672aM47168a = this.f34063g.m47168a(i);
            if (c16672aM47168a.f44116b != -1) {
                return c16672aM47168a.f44120f[i2];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f34057a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f34058b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f34059c) * 31;
            long j = this.f34060d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f34061e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f34062f ? 1 : 0)) * 31) + this.f34063g.hashCode();
        }

        /* renamed from: i */
        public long m37487i(int i) {
            return this.f34063g.m47168a(i).f44122h;
        }

        /* renamed from: j */
        public long m37488j() {
            return this.f34060d;
        }

        /* renamed from: k */
        public int m37489k(int i) {
            return this.f34063g.m47168a(i).m47176d();
        }

        /* renamed from: l */
        public int m37490l(int i, int i2) {
            return this.f34063g.m47168a(i).m47177e(i2);
        }

        /* renamed from: m */
        public long m37491m() {
            return sqi.q1(this.f34061e);
        }

        /* renamed from: n */
        public long m37492n() {
            return this.f34061e;
        }

        /* renamed from: o */
        public int m37493o() {
            return this.f34063g.f44104e;
        }

        /* renamed from: p */
        public boolean m37494p(int i) {
            return !this.f34063g.m47168a(i).m47178f();
        }

        /* renamed from: q */
        public boolean m37495q(int i) {
            return i == m37481c() - 1 && this.f34063g.m47171d(i);
        }

        /* renamed from: r */
        public boolean m37496r(int i) {
            return this.f34063g.m47168a(i).f44123i;
        }

        /* renamed from: s */
        public C15105b m37497s(Object obj, Object obj2, int i, long j, long j2) {
            return m37498t(obj, obj2, i, j, j2, rv.f44094g, false);
        }

        /* renamed from: t */
        public C15105b m37498t(Object obj, Object obj2, int i, long j, long j2, rv rvVar, boolean z) {
            this.f34057a = obj;
            this.f34058b = obj2;
            this.f34059c = i;
            this.f34060d = j;
            this.f34061e = j2;
            this.f34063g = rvVar;
            this.f34062f = z;
            return this;
        }
    }

    /* renamed from: o.lmh$c */
    public static final class C15106c {

        /* renamed from: b */
        public Object f34081b;

        /* renamed from: d */
        public Object f34083d;

        /* renamed from: e */
        public long f34084e;

        /* renamed from: f */
        public long f34085f;

        /* renamed from: g */
        public long f34086g;

        /* renamed from: h */
        public boolean f34087h;

        /* renamed from: i */
        public boolean f34088i;

        /* renamed from: j */
        public s2b.C16722g f34089j;

        /* renamed from: k */
        public boolean f34090k;

        /* renamed from: l */
        public long f34091l;

        /* renamed from: m */
        public long f34092m;

        /* renamed from: n */
        public int f34093n;

        /* renamed from: o */
        public int f34094o;

        /* renamed from: p */
        public long f34095p;

        /* renamed from: q */
        public static final Object f34070q = new Object();

        /* renamed from: r */
        public static final Object f34071r = new Object();

        /* renamed from: s */
        public static final s2b f34072s = new s2b.C16718c().m47472c("androidx.media3.common.Timeline").m47475f(Uri.EMPTY).m47470a();

        /* renamed from: t */
        public static final String f34073t = sqi.B0(1);

        /* renamed from: u */
        public static final String f34074u = sqi.B0(2);

        /* renamed from: v */
        public static final String f34075v = sqi.B0(3);

        /* renamed from: w */
        public static final String f34076w = sqi.B0(4);

        /* renamed from: x */
        public static final String f34077x = sqi.B0(5);

        /* renamed from: y */
        public static final String f34078y = sqi.B0(6);

        /* renamed from: z */
        public static final String f34079z = sqi.B0(7);

        /* renamed from: A */
        public static final String f34064A = sqi.B0(8);

        /* renamed from: B */
        public static final String f34065B = sqi.B0(9);

        /* renamed from: C */
        public static final String f34066C = sqi.B0(10);

        /* renamed from: D */
        public static final String f34067D = sqi.B0(11);

        /* renamed from: E */
        public static final String f34068E = sqi.B0(12);

        /* renamed from: F */
        public static final String f34069F = sqi.B0(13);

        /* renamed from: a */
        public Object f34080a = f34070q;

        /* renamed from: c */
        public s2b f34082c = f34072s;

        /* renamed from: a */
        public long m37499a() {
            return sqi.f0(this.f34086g);
        }

        /* renamed from: b */
        public long m37500b() {
            return sqi.q1(this.f34091l);
        }

        /* renamed from: c */
        public long m37501c() {
            return this.f34091l;
        }

        /* renamed from: d */
        public long m37502d() {
            return sqi.q1(this.f34092m);
        }

        /* renamed from: e */
        public long m37503e() {
            return this.f34095p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C15106c.class.equals(obj.getClass())) {
                return false;
            }
            C15106c c15106c = (C15106c) obj;
            return sqi.m48724c(this.f34080a, c15106c.f34080a) && sqi.m48724c(this.f34082c, c15106c.f34082c) && sqi.m48724c(this.f34083d, c15106c.f34083d) && sqi.m48724c(this.f34089j, c15106c.f34089j) && this.f34084e == c15106c.f34084e && this.f34085f == c15106c.f34085f && this.f34086g == c15106c.f34086g && this.f34087h == c15106c.f34087h && this.f34088i == c15106c.f34088i && this.f34090k == c15106c.f34090k && this.f34091l == c15106c.f34091l && this.f34092m == c15106c.f34092m && this.f34093n == c15106c.f34093n && this.f34094o == c15106c.f34094o && this.f34095p == c15106c.f34095p;
        }

        /* renamed from: f */
        public boolean m37504f() {
            return this.f34089j != null;
        }

        /* renamed from: g */
        public C15106c m37505g(Object obj, s2b s2bVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, s2b.C16722g c16722g, long j4, long j5, int i, int i2, long j6) {
            s2b.C16723h c16723h;
            this.f34080a = obj;
            this.f34082c = s2bVar != null ? s2bVar : f34072s;
            this.f34081b = (s2bVar == null || (c16723h = s2bVar.f44480b) == null) ? null : c16723h.f44579h;
            this.f34083d = obj2;
            this.f34084e = j;
            this.f34085f = j2;
            this.f34086g = j3;
            this.f34087h = z;
            this.f34088i = z2;
            this.f34089j = c16722g;
            this.f34091l = j4;
            this.f34092m = j5;
            this.f34093n = i;
            this.f34094o = i2;
            this.f34095p = j6;
            this.f34090k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f34080a.hashCode()) * 31) + this.f34082c.hashCode()) * 31;
            Object obj = this.f34083d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            s2b.C16722g c16722g = this.f34089j;
            int iHashCode3 = (iHashCode2 + (c16722g != null ? c16722g.hashCode() : 0)) * 31;
            long j = this.f34084e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f34085f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f34086g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f34087h ? 1 : 0)) * 31) + (this.f34088i ? 1 : 0)) * 31) + (this.f34090k ? 1 : 0)) * 31;
            long j4 = this.f34091l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f34092m;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f34093n) * 31) + this.f34094o) * 31;
            long j6 = this.f34095p;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo22377a(boolean z) {
        return m37477q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo6949b(Object obj);

    /* renamed from: c */
    public int mo22378c(boolean z) {
        if (m37477q()) {
            return -1;
        }
        return mo6954p() - 1;
    }

    /* renamed from: d */
    public final int m37472d(int i, C15105b c15105b, C15106c c15106c, int i2, boolean z) {
        int i3 = m37473f(i, c15105b).f34059c;
        if (m37476n(i3, c15106c).f34094o != i) {
            return i + 1;
        }
        int iMo22379e = mo22379e(i3, i2, z);
        if (iMo22379e == -1) {
            return -1;
        }
        return m37476n(iMo22379e, c15106c).f34093n;
    }

    /* renamed from: e */
    public int mo22379e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo22378c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo22378c(z) ? mo22377a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iMo22378c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmh)) {
            return false;
        }
        lmh lmhVar = (lmh) obj;
        if (lmhVar.mo6954p() != mo6954p() || lmhVar.mo6951i() != mo6951i()) {
            return false;
        }
        C15106c c15106c = new C15106c();
        C15105b c15105b = new C15105b();
        C15106c c15106c2 = new C15106c();
        C15105b c15105b2 = new C15105b();
        for (int i = 0; i < mo6954p(); i++) {
            if (!m37476n(i, c15106c).equals(lmhVar.m37476n(i, c15106c2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6951i(); i2++) {
            if (!mo6950g(i2, c15105b, true).equals(lmhVar.mo6950g(i2, c15105b2, true))) {
                return false;
            }
        }
        int iMo22377a = mo22377a(true);
        if (iMo22377a != lmhVar.mo22377a(true) || (iMo22378c = mo22378c(true)) != lmhVar.mo22378c(true)) {
            return false;
        }
        while (iMo22377a != iMo22378c) {
            int iMo22379e = mo22379e(iMo22377a, 0, true);
            if (iMo22379e != lmhVar.mo22379e(iMo22377a, 0, true)) {
                return false;
            }
            iMo22377a = iMo22379e;
        }
        return true;
    }

    /* renamed from: f */
    public final C15105b m37473f(int i, C15105b c15105b) {
        return mo6950g(i, c15105b, false);
    }

    /* renamed from: g */
    public abstract C15105b mo6950g(int i, C15105b c15105b, boolean z);

    /* renamed from: h */
    public C15105b mo22380h(Object obj, C15105b c15105b) {
        return mo6950g(mo6949b(obj), c15105b, true);
    }

    public int hashCode() {
        C15106c c15106c = new C15106c();
        C15105b c15105b = new C15105b();
        int iMo6954p = 217 + mo6954p();
        for (int i = 0; i < mo6954p(); i++) {
            iMo6954p = (iMo6954p * 31) + m37476n(i, c15106c).hashCode();
        }
        int iMo6951i = (iMo6954p * 31) + mo6951i();
        for (int i2 = 0; i2 < mo6951i(); i2++) {
            iMo6951i = (iMo6951i * 31) + mo6950g(i2, c15105b, true).hashCode();
        }
        int iMo22377a = mo22377a(true);
        while (iMo22377a != -1) {
            iMo6951i = (iMo6951i * 31) + iMo22377a;
            iMo22377a = mo22379e(iMo22377a, 0, true);
        }
        return iMo6951i;
    }

    /* renamed from: i */
    public abstract int mo6951i();

    /* renamed from: j */
    public final Pair m37474j(C15106c c15106c, C15105b c15105b, int i, long j) {
        return (Pair) op0.m42515e(m37475k(c15106c, c15105b, i, j, 0L));
    }

    /* renamed from: k */
    public final Pair m37475k(C15106c c15106c, C15105b c15105b, int i, long j, long j2) {
        op0.m42513c(i, 0, mo6954p());
        mo6953o(i, c15106c, j2);
        if (j == -9223372036854775807L) {
            j = c15106c.m37501c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c15106c.f34093n;
        m37473f(i2, c15105b);
        while (i2 < c15106c.f34094o && c15105b.f34061e != j) {
            int i3 = i2 + 1;
            if (m37473f(i3, c15105b).f34061e > j) {
                break;
            }
            i2 = i3;
        }
        mo6950g(i2, c15105b, true);
        long jMin = j - c15105b.f34061e;
        long j3 = c15105b.f34060d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(op0.m42515e(c15105b.f34058b), Long.valueOf(Math.max(0L, jMin)));
    }

    /* renamed from: l */
    public int mo22381l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo22377a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo22377a(z) ? mo22378c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public abstract Object mo6952m(int i);

    /* renamed from: n */
    public final C15106c m37476n(int i, C15106c c15106c) {
        return mo6953o(i, c15106c, 0L);
    }

    /* renamed from: o */
    public abstract C15106c mo6953o(int i, C15106c c15106c, long j);

    /* renamed from: p */
    public abstract int mo6954p();

    /* renamed from: q */
    public final boolean m37477q() {
        return mo6954p() == 0;
    }

    /* renamed from: r */
    public final boolean m37478r(int i, C15105b c15105b, C15106c c15106c, int i2, boolean z) {
        return m37472d(i, c15105b, c15106c, i2, z) == -1;
    }
}
