package p001o;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p001o.gc0;
import p001o.lad;
import p001o.lmh;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class yf5 implements lad {

    /* renamed from: i */
    public static final hdg f55417i = new hdg() { // from class: o.xf5
        @Override // p001o.hdg
        public final Object get() {
            return yf5.m57724m();
        }
    };

    /* renamed from: j */
    public static final Random f55418j = new Random();

    /* renamed from: a */
    public final lmh.C15106c f55419a;

    /* renamed from: b */
    public final lmh.C15105b f55420b;

    /* renamed from: c */
    public final HashMap f55421c;

    /* renamed from: d */
    public final hdg f55422d;

    /* renamed from: e */
    public lad.InterfaceC15048a f55423e;

    /* renamed from: f */
    public lmh f55424f;

    /* renamed from: g */
    public String f55425g;

    /* renamed from: h */
    public long f55426h;

    /* renamed from: o.yf5$a */
    public final class C18394a {

        /* renamed from: a */
        public final String f55427a;

        /* renamed from: b */
        public int f55428b;

        /* renamed from: c */
        public long f55429c;

        /* renamed from: d */
        public x8b.C18076b f55430d;

        /* renamed from: e */
        public boolean f55431e;

        /* renamed from: f */
        public boolean f55432f;

        public C18394a(String str, int i, x8b.C18076b c18076b) {
            this.f55427a = str;
            this.f55428b = i;
            this.f55429c = c18076b == null ? -1L : c18076b.f53359d;
            if (c18076b == null || !c18076b.m55842b()) {
                return;
            }
            this.f55430d = c18076b;
        }

        /* renamed from: i */
        public boolean m57737i(int i, x8b.C18076b c18076b) {
            if (c18076b == null) {
                return i == this.f55428b;
            }
            x8b.C18076b c18076b2 = this.f55430d;
            return c18076b2 == null ? !c18076b.m55842b() && c18076b.f53359d == this.f55429c : c18076b.f53359d == c18076b2.f53359d && c18076b.f53357b == c18076b2.f53357b && c18076b.f53358c == c18076b2.f53358c;
        }

        /* renamed from: j */
        public boolean m57738j(gc0.C13667a c13667a) {
            x8b.C18076b c18076b = c13667a.f24883d;
            if (c18076b == null) {
                return this.f55428b != c13667a.f24882c;
            }
            long j = this.f55429c;
            if (j == -1) {
                return false;
            }
            if (c18076b.f53359d > j) {
                return true;
            }
            if (this.f55430d == null) {
                return false;
            }
            int iMo6949b = c13667a.f24881b.mo6949b(c18076b.f53356a);
            int iMo6949b2 = c13667a.f24881b.mo6949b(this.f55430d.f53356a);
            x8b.C18076b c18076b2 = c13667a.f24883d;
            if (c18076b2.f53359d < this.f55430d.f53359d || iMo6949b < iMo6949b2) {
                return false;
            }
            if (iMo6949b > iMo6949b2) {
                return true;
            }
            if (!c18076b2.m55842b()) {
                int i = c13667a.f24883d.f53360e;
                return i == -1 || i > this.f55430d.f53357b;
            }
            x8b.C18076b c18076b3 = c13667a.f24883d;
            int i2 = c18076b3.f53357b;
            int i3 = c18076b3.f53358c;
            x8b.C18076b c18076b4 = this.f55430d;
            int i4 = c18076b4.f53357b;
            if (i2 <= i4) {
                return i2 == i4 && i3 > c18076b4.f53358c;
            }
            return true;
        }

        /* renamed from: k */
        public void m57739k(int i, x8b.C18076b c18076b) {
            if (this.f55429c != -1 || i != this.f55428b || c18076b == null || c18076b.f53359d < yf5.this.m57726n()) {
                return;
            }
            this.f55429c = c18076b.f53359d;
        }

        /* renamed from: l */
        public final int m57740l(lmh lmhVar, lmh lmhVar2, int i) {
            if (i >= lmhVar.mo6954p()) {
                if (i < lmhVar2.mo6954p()) {
                    return i;
                }
                return -1;
            }
            lmhVar.m37476n(i, yf5.this.f55419a);
            for (int i2 = yf5.this.f55419a.f34093n; i2 <= yf5.this.f55419a.f34094o; i2++) {
                int iMo6949b = lmhVar2.mo6949b(lmhVar.mo6952m(i2));
                if (iMo6949b != -1) {
                    return lmhVar2.m37473f(iMo6949b, yf5.this.f55420b).f34059c;
                }
            }
            return -1;
        }

        /* renamed from: m */
        public boolean m57741m(lmh lmhVar, lmh lmhVar2) {
            int iM57740l = m57740l(lmhVar, lmhVar2, this.f55428b);
            this.f55428b = iM57740l;
            if (iM57740l == -1) {
                return false;
            }
            x8b.C18076b c18076b = this.f55430d;
            return c18076b == null || lmhVar2.mo6949b(c18076b.f53356a) != -1;
        }
    }

    public yf5() {
        this(f55417i);
    }

    /* renamed from: m */
    public static String m57724m() {
        byte[] bArr = new byte[12];
        f55418j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p001o.lad
    /* renamed from: a */
    public synchronized String mo36837a() {
        return this.f55425g;
    }

    @Override // p001o.lad
    /* renamed from: b */
    public synchronized String mo36838b(lmh lmhVar, x8b.C18076b c18076b) {
        return m57727o(lmhVar.mo22380h(c18076b.f53356a, this.f55420b).f34059c, c18076b).f55427a;
    }

    @Override // p001o.lad
    /* renamed from: c */
    public void mo36839c(lad.InterfaceC15048a interfaceC15048a) {
        this.f55423e = interfaceC15048a;
    }

    @Override // p001o.lad
    /* renamed from: d */
    public synchronized void mo36840d(gc0.C13667a c13667a, int i) {
        op0.m42515e(this.f55423e);
        boolean z = i == 0;
        Iterator it = this.f55421c.values().iterator();
        while (it.hasNext()) {
            C18394a c18394a = (C18394a) it.next();
            if (c18394a.m57738j(c13667a)) {
                it.remove();
                if (c18394a.f55431e) {
                    boolean zEquals = c18394a.f55427a.equals(this.f55425g);
                    boolean z2 = z && zEquals && c18394a.f55432f;
                    if (zEquals) {
                        m57725l(c18394a);
                    }
                    this.f55423e.mo36844R(c13667a, c18394a.f55427a, z2);
                }
            }
        }
        m57728p(c13667a);
    }

    @Override // p001o.lad
    /* renamed from: e */
    public synchronized void mo36841e(gc0.C13667a c13667a) {
        lad.InterfaceC15048a interfaceC15048a;
        String str = this.f55425g;
        if (str != null) {
            m57725l((C18394a) op0.m42515e((C18394a) this.f55421c.get(str)));
        }
        Iterator it = this.f55421c.values().iterator();
        while (it.hasNext()) {
            C18394a c18394a = (C18394a) it.next();
            it.remove();
            if (c18394a.f55431e && (interfaceC15048a = this.f55423e) != null) {
                interfaceC15048a.mo36844R(c13667a, c18394a.f55427a, false);
            }
        }
    }

    @Override // p001o.lad
    /* renamed from: f */
    public synchronized void mo36842f(gc0.C13667a c13667a) {
        op0.m42515e(this.f55423e);
        lmh lmhVar = this.f55424f;
        this.f55424f = c13667a.f24881b;
        Iterator it = this.f55421c.values().iterator();
        while (it.hasNext()) {
            C18394a c18394a = (C18394a) it.next();
            if (!c18394a.m57741m(lmhVar, this.f55424f) || c18394a.m57738j(c13667a)) {
                it.remove();
                if (c18394a.f55431e) {
                    if (c18394a.f55427a.equals(this.f55425g)) {
                        m57725l(c18394a);
                    }
                    this.f55423e.mo36844R(c13667a, c18394a.f55427a, false);
                }
            }
        }
        m57728p(c13667a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:15:0x0024, B:17:0x0030, B:19:0x003a, B:23:0x0044, B:25:0x0050, B:26:0x0056, B:28:0x005b, B:30:0x0061, B:32:0x007a, B:34:0x00d5, B:36:0x00db, B:38:0x00f1, B:40:0x00fd, B:42:0x0103), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    @Override // p001o.lad
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void mo36843g(gc0.C13667a c13667a) {
        C18394a c18394a;
        gc0.C13667a c13667a2;
        C18394a c18394a2;
        op0.m42515e(this.f55423e);
        if (c13667a.f24881b.m37477q()) {
            return;
        }
        x8b.C18076b c18076b = c13667a.f24883d;
        if (c18076b != null) {
            if (c18076b.f53359d < m57726n()) {
                return;
            }
            C18394a c18394a3 = (C18394a) this.f55421c.get(this.f55425g);
            if (c18394a3 != null && c18394a3.f55429c == -1 && c18394a3.f55428b != c13667a.f24882c) {
                return;
            }
        }
        C18394a c18394aM57727o = m57727o(c13667a.f24882c, c13667a.f24883d);
        if (this.f55425g == null) {
            this.f55425g = c18394aM57727o.f55427a;
        }
        x8b.C18076b c18076b2 = c13667a.f24883d;
        if (c18076b2 == null || !c18076b2.m55842b()) {
            c18394a = c18394aM57727o;
            if (c18394a.f55431e) {
                c18394a2 = c18394a;
                c18394a2.f55431e = true;
                c13667a2 = c13667a;
                this.f55423e.mo36845m(c13667a2, c18394a2.f55427a);
            } else {
                c13667a2 = c13667a;
                c18394a2 = c18394a;
            }
            if (c18394a2.f55427a.equals(this.f55425g) && !c18394a2.f55432f) {
                c18394a2.f55432f = true;
                this.f55423e.e0(c13667a2, c18394a2.f55427a);
            }
            return;
        }
        x8b.C18076b c18076b3 = c13667a.f24883d;
        x8b.C18076b c18076b4 = new x8b.C18076b(c18076b3.f53356a, c18076b3.f53359d, c18076b3.f53357b);
        C18394a c18394aM57727o2 = m57727o(c13667a.f24882c, c18076b4);
        if (!c18394aM57727o2.f55431e) {
            c18394aM57727o2.f55431e = true;
            c13667a.f24881b.mo22380h(c13667a.f24883d.f53356a, this.f55420b);
            c18394a = c18394aM57727o;
            this.f55423e.mo36845m(new gc0.C13667a(c13667a.f24880a, c13667a.f24881b, c13667a.f24882c, c18076b4, Math.max(0L, sqi.q1(this.f55420b.m37484f(c13667a.f24883d.f53357b)) + this.f55420b.m37491m()), c13667a.f24885f, c13667a.f24886g, c13667a.f24887h, c13667a.f24888i, c13667a.f24889j), c18394aM57727o2.f55427a);
        }
        if (c18394a.f55431e) {
        }
        if (c18394a2.f55427a.equals(this.f55425g)) {
            c18394a2.f55432f = true;
            this.f55423e.e0(c13667a2, c18394a2.f55427a);
        }
        return;
    }

    /* renamed from: l */
    public final void m57725l(C18394a c18394a) {
        if (c18394a.f55429c != -1) {
            this.f55426h = c18394a.f55429c;
        }
        this.f55425g = null;
    }

    /* renamed from: n */
    public final long m57726n() {
        C18394a c18394a = (C18394a) this.f55421c.get(this.f55425g);
        return (c18394a == null || c18394a.f55429c == -1) ? this.f55426h + 1 : c18394a.f55429c;
    }

    /* renamed from: o */
    public final C18394a m57727o(int i, x8b.C18076b c18076b) {
        C18394a c18394a = null;
        long j = Long.MAX_VALUE;
        for (C18394a c18394a2 : this.f55421c.values()) {
            c18394a2.m57739k(i, c18076b);
            if (c18394a2.m57737i(i, c18076b)) {
                long j2 = c18394a2.f55429c;
                if (j2 == -1 || j2 < j) {
                    c18394a = c18394a2;
                    j = j2;
                } else if (j2 == j && ((C18394a) sqi.m48729h(c18394a)).f55430d != null && c18394a2.f55430d != null) {
                    c18394a = c18394a2;
                }
            }
        }
        if (c18394a != null) {
            return c18394a;
        }
        String str = (String) this.f55422d.get();
        C18394a c18394a3 = new C18394a(str, i, c18076b);
        this.f55421c.put(str, c18394a3);
        return c18394a3;
    }

    /* renamed from: p */
    public final void m57728p(gc0.C13667a c13667a) {
        if (c13667a.f24881b.m37477q()) {
            String str = this.f55425g;
            if (str != null) {
                m57725l((C18394a) op0.m42515e((C18394a) this.f55421c.get(str)));
                return;
            }
            return;
        }
        C18394a c18394a = (C18394a) this.f55421c.get(this.f55425g);
        C18394a c18394aM57727o = m57727o(c13667a.f24882c, c13667a.f24883d);
        this.f55425g = c18394aM57727o.f55427a;
        mo36843g(c13667a);
        x8b.C18076b c18076b = c13667a.f24883d;
        if (c18076b == null || !c18076b.m55842b()) {
            return;
        }
        if (c18394a != null && c18394a.f55429c == c13667a.f24883d.f53359d && c18394a.f55430d != null && c18394a.f55430d.f53357b == c13667a.f24883d.f53357b && c18394a.f55430d.f53358c == c13667a.f24883d.f53358c) {
            return;
        }
        x8b.C18076b c18076b2 = c13667a.f24883d;
        this.f55423e.mo36846p(c13667a, m57727o(c13667a.f24882c, new x8b.C18076b(c18076b2.f53356a, c18076b2.f53359d)).f55427a, c18394aM57727o.f55427a);
    }

    public yf5(hdg hdgVar) {
        this.f55422d = hdgVar;
        this.f55419a = new lmh.C15106c();
        this.f55420b = new lmh.C15105b();
        this.f55421c = new HashMap();
        this.f55424f = lmh.f34048a;
        this.f55426h = -1L;
    }
}
