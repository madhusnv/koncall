package p001o;

import androidx.media3.common.C2181a;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import p001o.a7g;
import p001o.p2j;

/* loaded from: classes2.dex */
public final class o2j extends a7g {

    /* renamed from: n */
    public C15701a f37673n;

    /* renamed from: o */
    public int f37674o;

    /* renamed from: p */
    public boolean f37675p;

    /* renamed from: q */
    public p2j.C15953c f37676q;

    /* renamed from: r */
    public p2j.C15951a f37677r;

    /* renamed from: o.o2j$a */
    public static final class C15701a {

        /* renamed from: a */
        public final p2j.C15953c f37678a;

        /* renamed from: b */
        public final p2j.C15951a f37679b;

        /* renamed from: c */
        public final byte[] f37680c;

        /* renamed from: d */
        public final p2j.C15952b[] f37681d;

        /* renamed from: e */
        public final int f37682e;

        public C15701a(p2j.C15953c c15953c, p2j.C15951a c15951a, byte[] bArr, p2j.C15952b[] c15952bArr, int i) {
            this.f37678a = c15953c;
            this.f37679b = c15951a;
            this.f37680c = bArr;
            this.f37681d = c15952bArr;
            this.f37682e = i;
        }
    }

    /* renamed from: n */
    public static void m41474n(zwc zwcVar, long j) {
        if (zwcVar.m60021b() < zwcVar.m60026g() + 4) {
            zwcVar.m60014R(Arrays.copyOf(zwcVar.m60024e(), zwcVar.m60026g() + 4));
        } else {
            zwcVar.m60016T(zwcVar.m60026g() + 4);
        }
        byte[] bArrM60024e = zwcVar.m60024e();
        bArrM60024e[zwcVar.m60026g() - 4] = (byte) (j & 255);
        bArrM60024e[zwcVar.m60026g() - 3] = (byte) ((j >>> 8) & 255);
        bArrM60024e[zwcVar.m60026g() - 2] = (byte) ((j >>> 16) & 255);
        bArrM60024e[zwcVar.m60026g() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: o */
    public static int m41475o(byte b, C15701a c15701a) {
        return !c15701a.f37681d[m41476p(b, c15701a.f37682e, 1)].f39258a ? c15701a.f37678a.f39268g : c15701a.f37678a.f39269h;
    }

    /* renamed from: p */
    public static int m41476p(byte b, int i, int i2) {
        return (b >> i2) & (Constants.MAX_HOST_LENGTH >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m41477r(zwc zwcVar) {
        try {
            return p2j.m42936o(1, zwcVar, true);
        } catch (byc unused) {
            return false;
        }
    }

    @Override // p001o.a7g
    /* renamed from: e */
    public void mo16567e(long j) {
        super.mo16567e(j);
        this.f37675p = j != 0;
        p2j.C15953c c15953c = this.f37676q;
        this.f37674o = c15953c != null ? c15953c.f39268g : 0;
    }

    @Override // p001o.a7g
    /* renamed from: f */
    public long mo16568f(zwc zwcVar) {
        if ((zwcVar.m60024e()[0] & 1) == 1) {
            return -1L;
        }
        int iM41475o = m41475o(zwcVar.m60024e()[0], (C15701a) op0.m42519i(this.f37673n));
        long j = this.f37675p ? (this.f37674o + iM41475o) / 4 : 0;
        m41474n(zwcVar, j);
        this.f37675p = true;
        this.f37674o = iM41475o;
        return j;
    }

    @Override // p001o.a7g
    /* renamed from: i */
    public boolean mo16571i(zwc zwcVar, long j, a7g.C12107b c12107b) throws byc {
        if (this.f37673n != null) {
            op0.m42515e(c12107b.f14257a);
            return false;
        }
        C15701a c15701aM41478q = m41478q(zwcVar);
        this.f37673n = c15701aM41478q;
        if (c15701aM41478q == null) {
            return true;
        }
        p2j.C15953c c15953c = c15701aM41478q.f37678a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c15953c.f39271j);
        arrayList.add(c15701aM41478q.f37680c);
        c12107b.f14257a = new C2181a.b().o0("audio/vorbis").m6750M(c15953c.f39266e).j0(c15953c.f39265d).m6751N(c15953c.f39263b).p0(c15953c.f39264c).b0(arrayList).h0(p2j.m42925d(nf8.m40512z(c15701aM41478q.f37679b.f39256b))).m6748K();
        return true;
    }

    @Override // p001o.a7g
    /* renamed from: l */
    public void mo16574l(boolean z) {
        super.mo16574l(z);
        if (z) {
            this.f37673n = null;
            this.f37676q = null;
            this.f37677r = null;
        }
        this.f37674o = 0;
        this.f37675p = false;
    }

    /* renamed from: q */
    public C15701a m41478q(zwc zwcVar) throws byc {
        p2j.C15953c c15953c = this.f37676q;
        if (c15953c == null) {
            this.f37676q = p2j.m42933l(zwcVar);
            return null;
        }
        p2j.C15951a c15951a = this.f37677r;
        if (c15951a == null) {
            this.f37677r = p2j.m42931j(zwcVar);
            return null;
        }
        byte[] bArr = new byte[zwcVar.m60026g()];
        System.arraycopy(zwcVar.m60024e(), 0, bArr, 0, zwcVar.m60026g());
        return new C15701a(c15953c, c15951a, bArr, p2j.m42934m(zwcVar, c15953c.f39263b), p2j.m42923b(r4.length - 1));
    }
}
