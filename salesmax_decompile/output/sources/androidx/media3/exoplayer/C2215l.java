package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.C2214k;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.List;
import p001o.ac0;
import p001o.jad;
import p001o.lmh;
import p001o.nf8;
import p001o.op0;
import p001o.uw7;
import p001o.x4b;
import p001o.x8b;
import p001o.y4b;

/* renamed from: androidx.media3.exoplayer.l */
/* loaded from: classes2.dex */
public final class C2215l {

    /* renamed from: c */
    public final ac0 f8444c;

    /* renamed from: d */
    public final uw7 f8445d;

    /* renamed from: e */
    public final C2214k.a f8446e;

    /* renamed from: f */
    public long f8447f;

    /* renamed from: g */
    public int f8448g;

    /* renamed from: h */
    public boolean f8449h;

    /* renamed from: i */
    public C2214k f8450i;

    /* renamed from: j */
    public C2214k f8451j;

    /* renamed from: k */
    public C2214k f8452k;

    /* renamed from: l */
    public int f8453l;

    /* renamed from: m */
    public Object f8454m;

    /* renamed from: n */
    public long f8455n;

    /* renamed from: o */
    public ExoPlayer.C2190c f8456o;

    /* renamed from: a */
    public final lmh.C15105b f8442a = new lmh.C15105b();

    /* renamed from: b */
    public final lmh.C15106c f8443b = new lmh.C15106c();

    /* renamed from: p */
    public List f8457p = new ArrayList();

    public C2215l(ac0 ac0Var, uw7 uw7Var, C2214k.a aVar, ExoPlayer.C2190c c2190c) {
        this.f8444c = ac0Var;
        this.f8445d = uw7Var;
        this.f8446e = aVar;
        this.f8456o = c2190c;
    }

    /* renamed from: C */
    public static boolean m7305C(lmh.C15105b c15105b) {
        int iM37481c = c15105b.m37481c();
        if (iM37481c == 0) {
            return false;
        }
        if ((iM37481c == 1 && c15105b.m37495q(0)) || !c15105b.m37496r(c15105b.m37493o())) {
            return false;
        }
        long jM37487i = 0;
        if (c15105b.m37483e(0L) != -1) {
            return false;
        }
        if (c15105b.f34060d == 0) {
            return true;
        }
        int i = iM37481c - (c15105b.m37495q(iM37481c + (-1)) ? 2 : 1);
        for (int i2 = 0; i2 <= i; i2++) {
            jM37487i += c15105b.m37487i(i2);
        }
        return c15105b.f34060d <= jM37487i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m7306D(nf8.C15566a c15566a, x8b.C18076b c18076b) {
        this.f8444c.m0(c15566a.m40520k(), c18076b);
    }

    /* renamed from: K */
    public static x8b.C18076b m7307K(lmh lmhVar, Object obj, long j, long j2, lmh.C15106c c15106c, lmh.C15105b c15105b) {
        lmhVar.mo22380h(obj, c15105b);
        lmhVar.m37476n(c15105b.f34059c, c15106c);
        Object objM42515e = obj;
        for (int iMo6949b = lmhVar.mo6949b(obj); m7305C(c15105b) && iMo6949b <= c15106c.f34094o; iMo6949b++) {
            lmhVar.mo6950g(iMo6949b, c15105b, true);
            objM42515e = op0.m42515e(c15105b.f34058b);
        }
        lmhVar.mo22380h(objM42515e, c15105b);
        int iM37483e = c15105b.m37483e(j);
        return iM37483e == -1 ? new x8b.C18076b(objM42515e, j2, c15105b.m37482d(j)) : new x8b.C18076b(objM42515e, iM37483e, c15105b.m37489k(iM37483e), j2);
    }

    /* renamed from: d */
    public static boolean m7309d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: A */
    public final boolean m7310A(lmh lmhVar, x8b.C18076b c18076b) {
        if (m7349y(c18076b)) {
            return lmhVar.m37476n(lmhVar.mo22380h(c18076b.f53356a, this.f8442a).f34059c, this.f8443b).f34094o == lmhVar.mo6949b(c18076b.f53356a);
        }
        return false;
    }

    /* renamed from: B */
    public boolean m7311B(x4b x4bVar) {
        C2214k c2214k = this.f8452k;
        return c2214k != null && c2214k.f8427a == x4bVar;
    }

    /* renamed from: E */
    public final void m7312E() {
        final nf8.C15566a c15566aM40508q = nf8.m40508q();
        for (C2214k c2214kM7289k = this.f8450i; c2214kM7289k != null; c2214kM7289k = c2214kM7289k.m7289k()) {
            c15566aM40508q.mo32056a(c2214kM7289k.f8432f.f54866a);
        }
        C2214k c2214k = this.f8451j;
        final x8b.C18076b c18076b = c2214k == null ? null : c2214k.f8432f.f54866a;
        this.f8445d.mo28839h(new Runnable() { // from class: o.z4b
            @Override // java.lang.Runnable
            public final void run() {
                this.f56513a.m7306D(c15566aM40508q, c18076b);
            }
        });
    }

    /* renamed from: F */
    public void m7313F(long j) {
        C2214k c2214k = this.f8452k;
        if (c2214k != null) {
            c2214k.m7299u(j);
        }
    }

    /* renamed from: G */
    public final void m7314G(List list) {
        for (int i = 0; i < this.f8457p.size(); i++) {
            ((C2214k) this.f8457p.get(i)).m7300v();
        }
        this.f8457p = list;
    }

    /* renamed from: H */
    public void m7315H() {
        if (this.f8457p.isEmpty()) {
            return;
        }
        m7314G(new ArrayList());
    }

    /* renamed from: I */
    public boolean m7316I(C2214k c2214k) {
        op0.m42519i(c2214k);
        boolean z = false;
        if (c2214k.equals(this.f8452k)) {
            return false;
        }
        this.f8452k = c2214k;
        while (c2214k.m7289k() != null) {
            c2214k = (C2214k) op0.m42515e(c2214k.m7289k());
            if (c2214k == this.f8451j) {
                this.f8451j = this.f8450i;
                z = true;
            }
            c2214k.m7300v();
            this.f8453l--;
        }
        ((C2214k) op0.m42515e(this.f8452k)).m7302y(null);
        m7312E();
        return z;
    }

    /* renamed from: J */
    public final C2214k m7317J(y4b y4bVar) {
        for (int i = 0; i < this.f8457p.size(); i++) {
            if (((C2214k) this.f8457p.get(i)).m7283d(y4bVar)) {
                return (C2214k) this.f8457p.remove(i);
            }
        }
        return null;
    }

    /* renamed from: L */
    public x8b.C18076b m7318L(lmh lmhVar, Object obj, long j) {
        long jM7319M = m7319M(lmhVar, obj);
        lmhVar.mo22380h(obj, this.f8442a);
        lmhVar.m37476n(this.f8442a.f34059c, this.f8443b);
        boolean z = false;
        for (int iMo6949b = lmhVar.mo6949b(obj); iMo6949b >= this.f8443b.f34093n; iMo6949b--) {
            lmhVar.mo6950g(iMo6949b, this.f8442a, true);
            boolean z2 = this.f8442a.m37481c() > 0;
            z |= z2;
            lmh.C15105b c15105b = this.f8442a;
            if (c15105b.m37483e(c15105b.f34060d) != -1) {
                obj = op0.m42515e(this.f8442a.f34058b);
            }
            if (z && (!z2 || this.f8442a.f34060d != 0)) {
                break;
            }
        }
        return m7307K(lmhVar, obj, j, jM7319M, this.f8443b, this.f8442a);
    }

    /* renamed from: M */
    public final long m7319M(lmh lmhVar, Object obj) {
        int iMo6949b;
        int i = lmhVar.mo22380h(obj, this.f8442a).f34059c;
        Object obj2 = this.f8454m;
        if (obj2 != null && (iMo6949b = lmhVar.mo6949b(obj2)) != -1 && lmhVar.m37473f(iMo6949b, this.f8442a).f34059c == i) {
            return this.f8455n;
        }
        for (C2214k c2214kM7289k = this.f8450i; c2214kM7289k != null; c2214kM7289k = c2214kM7289k.m7289k()) {
            if (c2214kM7289k.f8428b.equals(obj)) {
                return c2214kM7289k.f8432f.f54866a.f53359d;
            }
        }
        for (C2214k c2214kM7289k2 = this.f8450i; c2214kM7289k2 != null; c2214kM7289k2 = c2214kM7289k2.m7289k()) {
            int iMo6949b2 = lmhVar.mo6949b(c2214kM7289k2.f8428b);
            if (iMo6949b2 != -1 && lmhVar.m37473f(iMo6949b2, this.f8442a).f34059c == i) {
                return c2214kM7289k2.f8432f.f54866a.f53359d;
            }
        }
        long jM7320N = m7320N(obj);
        if (jM7320N != -1) {
            return jM7320N;
        }
        long j = this.f8447f;
        this.f8447f = 1 + j;
        if (this.f8450i == null) {
            this.f8454m = obj;
            this.f8455n = j;
        }
        return j;
    }

    /* renamed from: N */
    public final long m7320N(Object obj) {
        for (int i = 0; i < this.f8457p.size(); i++) {
            C2214k c2214k = (C2214k) this.f8457p.get(i);
            if (c2214k.f8428b.equals(obj)) {
                return c2214k.f8432f.f54866a.f53359d;
            }
        }
        return -1L;
    }

    /* renamed from: O */
    public boolean m7321O() {
        C2214k c2214k = this.f8452k;
        return c2214k == null || (!c2214k.f8432f.f54874i && c2214k.m7297s() && this.f8452k.f8432f.f54870e != -9223372036854775807L && this.f8453l < 100);
    }

    /* renamed from: P */
    public final boolean m7322P(lmh lmhVar) {
        C2214k c2214kM7289k = this.f8450i;
        if (c2214kM7289k == null) {
            return true;
        }
        int iMo6949b = lmhVar.mo6949b(c2214kM7289k.f8428b);
        while (true) {
            iMo6949b = lmhVar.m37472d(iMo6949b, this.f8442a, this.f8443b, this.f8448g, this.f8449h);
            while (((C2214k) op0.m42515e(c2214kM7289k)).m7289k() != null && !c2214kM7289k.f8432f.f54872g) {
                c2214kM7289k = c2214kM7289k.m7289k();
            }
            C2214k c2214kM7289k2 = c2214kM7289k.m7289k();
            if (iMo6949b == -1 || c2214kM7289k2 == null || lmhVar.mo6949b(c2214kM7289k2.f8428b) != iMo6949b) {
                break;
            }
            c2214kM7289k = c2214kM7289k2;
        }
        boolean zM7316I = m7316I(c2214kM7289k);
        c2214kM7289k.f8432f = m7346v(lmhVar, c2214kM7289k.f8432f);
        return !zM7316I;
    }

    /* renamed from: Q */
    public void m7323Q(lmh lmhVar, ExoPlayer.C2190c c2190c) {
        this.f8456o = c2190c;
        m7348x(lmhVar);
    }

    /* renamed from: R */
    public boolean m7324R(lmh lmhVar, long j, long j2) {
        y4b y4bVarM7346v;
        C2214k c2214kM7289k = this.f8450i;
        C2214k c2214k = null;
        while (c2214kM7289k != null) {
            y4b y4bVar = c2214kM7289k.f8432f;
            if (c2214k == null) {
                y4bVarM7346v = m7346v(lmhVar, y4bVar);
            } else {
                y4b y4bVarM7335k = m7335k(lmhVar, c2214k, j);
                if (y4bVarM7335k == null) {
                    return !m7316I(c2214k);
                }
                if (!m7329e(y4bVar, y4bVarM7335k)) {
                    return !m7316I(c2214k);
                }
                y4bVarM7346v = y4bVarM7335k;
            }
            c2214kM7289k.f8432f = y4bVarM7346v.m57199a(y4bVar.f54868c);
            if (!m7309d(y4bVar.f54870e, y4bVarM7346v.f54870e)) {
                c2214kM7289k.m7279C();
                long j3 = y4bVarM7346v.f54870e;
                return (m7316I(c2214kM7289k) || (c2214kM7289k == this.f8451j && !c2214kM7289k.f8432f.f54871f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c2214kM7289k.m7278B(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c2214kM7289k.m7278B(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c2214k = c2214kM7289k;
            c2214kM7289k = c2214kM7289k.m7289k();
        }
        return true;
    }

    /* renamed from: S */
    public boolean m7325S(lmh lmhVar, int i) {
        this.f8448g = i;
        return m7322P(lmhVar);
    }

    /* renamed from: T */
    public boolean m7326T(lmh lmhVar, boolean z) {
        this.f8449h = z;
        return m7322P(lmhVar);
    }

    /* renamed from: b */
    public C2214k m7327b() {
        C2214k c2214k = this.f8450i;
        if (c2214k == null) {
            return null;
        }
        if (c2214k == this.f8451j) {
            this.f8451j = c2214k.m7289k();
        }
        this.f8450i.m7300v();
        int i = this.f8453l - 1;
        this.f8453l = i;
        if (i == 0) {
            this.f8452k = null;
            C2214k c2214k2 = this.f8450i;
            this.f8454m = c2214k2.f8428b;
            this.f8455n = c2214k2.f8432f.f54866a.f53359d;
        }
        this.f8450i = this.f8450i.m7289k();
        m7312E();
        return this.f8450i;
    }

    /* renamed from: c */
    public C2214k m7328c() {
        this.f8451j = ((C2214k) op0.m42519i(this.f8451j)).m7289k();
        m7312E();
        return (C2214k) op0.m42519i(this.f8451j);
    }

    /* renamed from: e */
    public final boolean m7329e(y4b y4bVar, y4b y4bVar2) {
        return y4bVar.f54867b == y4bVar2.f54867b && y4bVar.f54866a.equals(y4bVar2.f54866a);
    }

    /* renamed from: f */
    public void m7330f() {
        if (this.f8453l == 0) {
            return;
        }
        C2214k c2214kM7289k = (C2214k) op0.m42519i(this.f8450i);
        this.f8454m = c2214kM7289k.f8428b;
        this.f8455n = c2214kM7289k.f8432f.f54866a.f53359d;
        while (c2214kM7289k != null) {
            c2214kM7289k.m7300v();
            c2214kM7289k = c2214kM7289k.m7289k();
        }
        this.f8450i = null;
        this.f8452k = null;
        this.f8451j = null;
        this.f8453l = 0;
        m7312E();
    }

    /* renamed from: g */
    public C2214k m7331g(y4b y4bVar) {
        C2214k c2214k = this.f8452k;
        long jM7291m = c2214k == null ? 1000000000000L : (c2214k.m7291m() + this.f8452k.f8432f.f54870e) - y4bVar.f54867b;
        C2214k c2214kM7317J = m7317J(y4bVar);
        if (c2214kM7317J == null) {
            c2214kM7317J = this.f8446e.mo7304a(y4bVar, jM7291m);
        } else {
            c2214kM7317J.f8432f = y4bVar;
            c2214kM7317J.m7303z(jM7291m);
        }
        C2214k c2214k2 = this.f8452k;
        if (c2214k2 != null) {
            c2214k2.m7302y(c2214kM7317J);
        } else {
            this.f8450i = c2214kM7317J;
            this.f8451j = c2214kM7317J;
        }
        this.f8454m = null;
        this.f8452k = c2214kM7317J;
        this.f8453l++;
        m7312E();
        return c2214kM7317J;
    }

    /* renamed from: h */
    public final Pair m7332h(lmh lmhVar, Object obj, long j) {
        int iMo22379e = lmhVar.mo22379e(lmhVar.mo22380h(obj, this.f8442a).f34059c, this.f8448g, this.f8449h);
        if (iMo22379e != -1) {
            return lmhVar.m37475k(this.f8443b, this.f8442a, iMo22379e, -9223372036854775807L, j);
        }
        return null;
    }

    /* renamed from: i */
    public final y4b m7333i(jad jadVar) {
        return m7338n(jadVar.f30041a, jadVar.f30042b, jadVar.f30043c, jadVar.f30059s);
    }

    /* renamed from: j */
    public final y4b m7334j(lmh lmhVar, C2214k c2214k, long j) {
        y4b y4bVar;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        long jM7320N;
        y4b y4bVar2 = c2214k.f8432f;
        int iM37472d = lmhVar.m37472d(lmhVar.mo6949b(y4bVar2.f54866a.f53356a), this.f8442a, this.f8443b, this.f8448g, this.f8449h);
        if (iM37472d == -1) {
            return null;
        }
        int i = lmhVar.mo6950g(iM37472d, this.f8442a, true).f34059c;
        Object objM42515e = op0.m42515e(this.f8442a.f34058b);
        long j6 = y4bVar2.f54866a.f53359d;
        if (lmhVar.m37476n(i, this.f8443b).f34093n == iM37472d) {
            y4bVar = y4bVar2;
            Pair pairM37475k = lmhVar.m37475k(this.f8443b, this.f8442a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairM37475k == null) {
                return null;
            }
            Object obj2 = pairM37475k.first;
            long jLongValue = ((Long) pairM37475k.second).longValue();
            C2214k c2214kM7289k = c2214k.m7289k();
            if (c2214kM7289k == null || !c2214kM7289k.f8428b.equals(obj2)) {
                jM7320N = m7320N(obj2);
                if (jM7320N == -1) {
                    jM7320N = this.f8447f;
                    this.f8447f = 1 + jM7320N;
                }
            } else {
                jM7320N = c2214kM7289k.f8432f.f54866a.f53359d;
            }
            j2 = jM7320N;
            j3 = -9223372036854775807L;
            obj = obj2;
            j4 = jLongValue;
        } else {
            y4bVar = y4bVar2;
            j2 = j6;
            j3 = 0;
            obj = objM42515e;
            j4 = 0;
        }
        x8b.C18076b c18076bM7307K = m7307K(lmhVar, obj, j4, j2, this.f8443b, this.f8442a);
        if (j3 == -9223372036854775807L || y4bVar.f54868c == -9223372036854775807L) {
            j5 = j4;
        } else {
            boolean zM7347w = m7347w(y4bVar.f54866a.f53356a, lmhVar);
            if (c18076bM7307K.m55842b() && zM7347w) {
                j3 = y4bVar.f54868c;
            } else if (zM7347w) {
                j5 = y4bVar.f54868c;
            }
            j5 = j4;
        }
        return m7338n(lmhVar, c18076bM7307K, j3, j5);
    }

    /* renamed from: k */
    public final y4b m7335k(lmh lmhVar, C2214k c2214k, long j) {
        y4b y4bVar = c2214k.f8432f;
        long jM7291m = (c2214k.m7291m() + y4bVar.f54870e) - j;
        return y4bVar.f54872g ? m7334j(lmhVar, c2214k, jM7291m) : m7336l(lmhVar, c2214k, jM7291m);
    }

    /* renamed from: l */
    public final y4b m7336l(lmh lmhVar, C2214k c2214k, long j) {
        y4b y4bVar = c2214k.f8432f;
        x8b.C18076b c18076b = y4bVar.f54866a;
        lmhVar.mo22380h(c18076b.f53356a, this.f8442a);
        if (!c18076b.m55842b()) {
            int i = c18076b.f53360e;
            if (i != -1 && this.f8442a.m37495q(i)) {
                return m7334j(lmhVar, c2214k, j);
            }
            int iM37489k = this.f8442a.m37489k(c18076b.f53360e);
            boolean z = this.f8442a.m37496r(c18076b.f53360e) && this.f8442a.m37486h(c18076b.f53360e, iM37489k) == 3;
            if (iM37489k == this.f8442a.m37479a(c18076b.f53360e) || z) {
                return m7340p(lmhVar, c18076b.f53356a, m7342r(lmhVar, c18076b.f53356a, c18076b.f53360e), y4bVar.f54870e, c18076b.f53359d);
            }
            return m7339o(lmhVar, c18076b.f53356a, c18076b.f53360e, iM37489k, y4bVar.f54870e, c18076b.f53359d);
        }
        int i2 = c18076b.f53357b;
        int iM37479a = this.f8442a.m37479a(i2);
        if (iM37479a == -1) {
            return null;
        }
        int iM37490l = this.f8442a.m37490l(i2, c18076b.f53358c);
        if (iM37490l < iM37479a) {
            return m7339o(lmhVar, c18076b.f53356a, i2, iM37490l, y4bVar.f54868c, c18076b.f53359d);
        }
        long jLongValue = y4bVar.f54868c;
        if (jLongValue == -9223372036854775807L) {
            lmh.C15106c c15106c = this.f8443b;
            lmh.C15105b c15105b = this.f8442a;
            Pair pairM37475k = lmhVar.m37475k(c15106c, c15105b, c15105b.f34059c, -9223372036854775807L, Math.max(0L, j));
            if (pairM37475k == null) {
                return null;
            }
            jLongValue = ((Long) pairM37475k.second).longValue();
        }
        return m7340p(lmhVar, c18076b.f53356a, Math.max(m7342r(lmhVar, c18076b.f53356a, c18076b.f53357b), jLongValue), y4bVar.f54868c, c18076b.f53359d);
    }

    /* renamed from: m */
    public C2214k m7337m() {
        return this.f8452k;
    }

    /* renamed from: n */
    public final y4b m7338n(lmh lmhVar, x8b.C18076b c18076b, long j, long j2) {
        lmhVar.mo22380h(c18076b.f53356a, this.f8442a);
        return c18076b.m55842b() ? m7339o(lmhVar, c18076b.f53356a, c18076b.f53357b, c18076b.f53358c, j, c18076b.f53359d) : m7340p(lmhVar, c18076b.f53356a, j2, j, c18076b.f53359d);
    }

    /* renamed from: o */
    public final y4b m7339o(lmh lmhVar, Object obj, int i, int i2, long j, long j2) {
        x8b.C18076b c18076b = new x8b.C18076b(obj, i, i2, j2);
        long jM37480b = lmhVar.mo22380h(c18076b.f53356a, this.f8442a).m37480b(c18076b.f53357b, c18076b.f53358c);
        long jM37485g = i2 == this.f8442a.m37489k(i) ? this.f8442a.m37485g() : 0L;
        return new y4b(c18076b, (jM37480b == -9223372036854775807L || jM37485g < jM37480b) ? jM37485g : Math.max(0L, jM37480b - 1), j, -9223372036854775807L, jM37480b, this.f8442a.m37496r(c18076b.f53357b), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y4b m7340p(lmh lmhVar, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long jM37484f;
        long j5;
        long jMax = j;
        lmhVar.mo22380h(obj, this.f8442a);
        int iM37482d = this.f8442a.m37482d(jMax);
        int i = 1;
        boolean z2 = iM37482d != -1 && this.f8442a.m37495q(iM37482d);
        if (iM37482d == -1) {
            if (this.f8442a.m37481c() > 0) {
                lmh.C15105b c15105b = this.f8442a;
                z = c15105b.m37496r(c15105b.m37493o());
            }
        } else if (this.f8442a.m37496r(iM37482d)) {
            long jM37484f2 = this.f8442a.m37484f(iM37482d);
            lmh.C15105b c15105b2 = this.f8442a;
            if (jM37484f2 == c15105b2.f34060d && c15105b2.m37494p(iM37482d)) {
                z = true;
                iM37482d = -1;
            }
        }
        x8b.C18076b c18076b = new x8b.C18076b(obj, j3, iM37482d);
        boolean zM7349y = m7349y(c18076b);
        boolean zM7310A = m7310A(lmhVar, c18076b);
        boolean zM7350z = m7350z(lmhVar, c18076b, zM7349y);
        boolean z3 = (iM37482d == -1 || !this.f8442a.m37496r(iM37482d) || z2) ? false : true;
        if (iM37482d != -1 && !z2) {
            jM37484f = this.f8442a.m37484f(iM37482d);
        } else {
            if (!z) {
                j4 = -9223372036854775807L;
                j5 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.f8442a.f34060d : j4;
                if (j5 != -9223372036854775807L && jMax >= j5) {
                    if (!zM7350z && z) {
                        i = 0;
                    }
                    jMax = Math.max(0L, j5 - i);
                }
                return new y4b(c18076b, jMax, j2, j4, j5, z3, zM7349y, zM7310A, zM7350z);
            }
            jM37484f = this.f8442a.f34060d;
        }
        j4 = jM37484f;
        if (j4 != -9223372036854775807L) {
        }
        if (j5 != -9223372036854775807L) {
            if (!zM7350z) {
                i = 0;
            }
            jMax = Math.max(0L, j5 - i);
        }
        return new y4b(c18076b, jMax, j2, j4, j5, z3, zM7349y, zM7310A, zM7350z);
    }

    /* renamed from: q */
    public final y4b m7341q(lmh lmhVar, Object obj, long j, long j2) {
        x8b.C18076b c18076bM7307K = m7307K(lmhVar, obj, j, j2, this.f8443b, this.f8442a);
        return c18076bM7307K.m55842b() ? m7339o(lmhVar, c18076bM7307K.f53356a, c18076bM7307K.f53357b, c18076bM7307K.f53358c, j, c18076bM7307K.f53359d) : m7340p(lmhVar, c18076bM7307K.f53356a, j, -9223372036854775807L, c18076bM7307K.f53359d);
    }

    /* renamed from: r */
    public final long m7342r(lmh lmhVar, Object obj, int i) {
        lmhVar.mo22380h(obj, this.f8442a);
        long jM37484f = this.f8442a.m37484f(i);
        return jM37484f == Long.MIN_VALUE ? this.f8442a.f34060d : jM37484f + this.f8442a.m37487i(i);
    }

    /* renamed from: s */
    public y4b m7343s(long j, jad jadVar) {
        C2214k c2214k = this.f8452k;
        return c2214k == null ? m7333i(jadVar) : m7335k(jadVar.f30041a, c2214k, j);
    }

    /* renamed from: t */
    public C2214k m7344t() {
        return this.f8450i;
    }

    /* renamed from: u */
    public C2214k m7345u() {
        return this.f8451j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y4b m7346v(lmh lmhVar, y4b y4bVar) {
        long jM37488j;
        long j;
        boolean zM37496r;
        int i;
        x8b.C18076b c18076b = y4bVar.f54866a;
        boolean zM7349y = m7349y(c18076b);
        boolean zM7310A = m7310A(lmhVar, c18076b);
        boolean zM7350z = m7350z(lmhVar, c18076b, zM7349y);
        lmhVar.mo22380h(y4bVar.f54866a.f53356a, this.f8442a);
        long jM37484f = (c18076b.m55842b() || (i = c18076b.f53360e) == -1) ? -9223372036854775807L : this.f8442a.m37484f(i);
        if (c18076b.m55842b()) {
            jM37488j = this.f8442a.m37480b(c18076b.f53357b, c18076b.f53358c);
        } else {
            if (jM37484f != -9223372036854775807L && jM37484f != Long.MIN_VALUE) {
                j = jM37484f;
                if (c18076b.m55842b()) {
                    int i2 = c18076b.f53360e;
                    zM37496r = i2 != -1 && this.f8442a.m37496r(i2);
                } else {
                    zM37496r = this.f8442a.m37496r(c18076b.f53357b);
                }
                return new y4b(c18076b, y4bVar.f54867b, y4bVar.f54868c, jM37484f, j, zM37496r, zM7349y, zM7310A, zM7350z);
            }
            jM37488j = this.f8442a.m37488j();
        }
        j = jM37488j;
        if (c18076b.m55842b()) {
        }
        return new y4b(c18076b, y4bVar.f54867b, y4bVar.f54868c, jM37484f, j, zM37496r, zM7349y, zM7310A, zM7350z);
    }

    /* renamed from: w */
    public final boolean m7347w(Object obj, lmh lmhVar) {
        int iM37481c = lmhVar.mo22380h(obj, this.f8442a).m37481c();
        int iM37493o = this.f8442a.m37493o();
        return iM37481c > 0 && this.f8442a.m37496r(iM37493o) && (iM37481c > 1 || this.f8442a.m37484f(iM37493o) != Long.MIN_VALUE);
    }

    /* renamed from: x */
    public void m7348x(lmh lmhVar) {
        C2214k c2214k;
        if (this.f8456o.f8122a == -9223372036854775807L || (c2214k = this.f8452k) == null) {
            m7315H();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairM7332h = m7332h(lmhVar, c2214k.f8432f.f54866a.f53356a, 0L);
        if (pairM7332h != null && !lmhVar.m37476n(lmhVar.mo22380h(pairM7332h.first, this.f8442a).f34059c, this.f8443b).m37504f()) {
            long jM7320N = m7320N(pairM7332h.first);
            if (jM7320N == -1) {
                jM7320N = this.f8447f;
                this.f8447f = 1 + jM7320N;
            }
            y4b y4bVarM7341q = m7341q(lmhVar, pairM7332h.first, ((Long) pairM7332h.second).longValue(), jM7320N);
            C2214k c2214kM7317J = m7317J(y4bVarM7341q);
            if (c2214kM7317J == null) {
                c2214kM7317J = this.f8446e.mo7304a(y4bVarM7341q, (c2214k.m7291m() + c2214k.f8432f.f54870e) - y4bVarM7341q.f54867b);
            }
            arrayList.add(c2214kM7317J);
        }
        m7314G(arrayList);
    }

    /* renamed from: y */
    public final boolean m7349y(x8b.C18076b c18076b) {
        return !c18076b.m55842b() && c18076b.f53360e == -1;
    }

    /* renamed from: z */
    public final boolean m7350z(lmh lmhVar, x8b.C18076b c18076b, boolean z) {
        int iMo6949b = lmhVar.mo6949b(c18076b.f53356a);
        return !lmhVar.m37476n(lmhVar.m37473f(iMo6949b, this.f8442a).f34059c, this.f8443b).f34088i && lmhVar.m37478r(iMo6949b, this.f8442a, this.f8443b, this.f8448g, this.f8449h) && z;
    }
}
