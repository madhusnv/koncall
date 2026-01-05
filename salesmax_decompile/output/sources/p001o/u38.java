package p001o;

import java.io.IOException;
import p001o.nvi;
import p001o.ul1;

/* loaded from: classes6.dex */
public class u38 implements ixc {

    /* renamed from: a */
    public lm1 f48248a;

    /* renamed from: b */
    public y76 f48249b;

    /* renamed from: c */
    public sl1 f48250c;

    /* renamed from: d */
    public sl1 f48251d;

    /* renamed from: e */
    public sl1 f48252e;

    /* renamed from: g */
    public int f48254g;

    /* renamed from: h */
    public int f48255h;

    /* renamed from: i */
    public AbstractC17288a f48256i;

    /* renamed from: j */
    public ul1.C17390a f48257j;

    /* renamed from: k */
    public nvi.C15675a f48258k;

    /* renamed from: l */
    public nvi.C15675a f48259l;

    /* renamed from: m */
    public String f48260m;

    /* renamed from: n */
    public int f48261n;

    /* renamed from: o */
    public boolean f48262o;

    /* renamed from: p */
    public C17289b f48263p;

    /* renamed from: r */
    public byte f48265r;

    /* renamed from: s */
    public int f48266s;

    /* renamed from: t */
    public long f48267t;

    /* renamed from: u */
    public long f48268u;

    /* renamed from: v */
    public int f48269v;

    /* renamed from: w */
    public int f48270w;

    /* renamed from: f */
    public nvi f48253f = new nvi();

    /* renamed from: q */
    public int f48264q = -13;

    /* renamed from: o.u38$a */
    public static abstract class AbstractC17288a {
        /* renamed from: a */
        public abstract void mo26005a(sl1 sl1Var);

        /* renamed from: b */
        public abstract void mo26006b();

        /* renamed from: c */
        public abstract void mo26007c(long j);

        /* renamed from: d */
        public abstract void mo26008d(sl1 sl1Var, sl1 sl1Var2);

        /* renamed from: e */
        public abstract void mo26009e(sl1 sl1Var, sl1 sl1Var2, sl1 sl1Var3);

        /* renamed from: f */
        public abstract void mo26010f(sl1 sl1Var, int i, sl1 sl1Var2);
    }

    public u38(lm1 lm1Var, y76 y76Var, AbstractC17288a abstractC17288a, int i, int i2) {
        this.f48248a = lm1Var;
        this.f48249b = y76Var;
        this.f48256i = abstractC17288a;
        this.f48254g = i;
        this.f48255h = i2;
    }

    @Override // p001o.ixc
    /* renamed from: a */
    public void mo32882a(boolean z) {
        lm1 lm1Var;
        synchronized (this) {
            nvi nviVar = this.f48253f;
            nviVar.w2(nviVar.Y2());
            this.f48264q = -13;
            this.f48267t = -3L;
            this.f48268u = 0L;
            this.f48266s = 0;
            this.f48261n = 0;
            sl1 sl1Var = this.f48252e;
            if (sl1Var != null && sl1Var.length() > 0 && this.f48265r == 13 && this.f48252e.peek() == 10) {
                this.f48252e.mo48450d(1);
                this.f48265r = (byte) 10;
            }
            sl1 sl1Var2 = this.f48251d;
            if (sl1Var2 != null) {
                if (sl1Var2.D2()) {
                    this.f48250c.q3(-1);
                    this.f48250c.R0();
                    int iV0 = this.f48250c.V0();
                    if (iV0 > this.f48251d.length()) {
                        iV0 = this.f48251d.length();
                    }
                    sl1 sl1Var3 = this.f48251d;
                    sl1Var3.O1(sl1Var3.mo48451r(), iV0);
                    sl1 sl1Var4 = this.f48251d;
                    sl1Var4.mo48450d(this.f48250c.s2(sl1Var4.O1(sl1Var4.mo48451r(), iV0)));
                }
                if (this.f48251d.length() == 0) {
                    lm1 lm1Var2 = this.f48248a;
                    if (lm1Var2 != null && z) {
                        lm1Var2.mo37461j(this.f48251d);
                    }
                    this.f48251d = null;
                } else {
                    this.f48251d.q3(-1);
                    this.f48251d.R0();
                }
            }
            sl1 sl1Var5 = this.f48250c;
            if (sl1Var5 != null) {
                sl1Var5.q3(-1);
                if (this.f48250c.D2() || (lm1Var = this.f48248a) == null || !z) {
                    this.f48250c.R0();
                    this.f48258k.m41184h(this.f48250c);
                    this.f48258k.m41183g(0, 0);
                    this.f48259l.m41184h(this.f48250c);
                    this.f48259l.m41183g(0, 0);
                } else {
                    lm1Var.mo37461j(this.f48250c);
                    this.f48250c = null;
                    this.f48252e = null;
                }
            }
            this.f48252e = this.f48250c;
        }
    }

    @Override // p001o.ixc
    /* renamed from: b */
    public boolean mo32883b() {
        return m50889l(-13);
    }

    @Override // p001o.ixc
    /* renamed from: c */
    public boolean mo32884c() {
        sl1 sl1Var = this.f48250c;
        if (sl1Var != null && sl1Var.D2()) {
            return true;
        }
        sl1 sl1Var2 = this.f48251d;
        return sl1Var2 != null && sl1Var2.D2();
    }

    @Override // p001o.ixc
    /* renamed from: d */
    public long mo32885d() throws IOException {
        sl1 sl1Var;
        long jM50890m = m50890m();
        if (jM50890m <= 0) {
            jM50890m = 0;
        }
        while (!isComplete() && (sl1Var = this.f48252e) != null && sl1Var.length() > 0) {
            long jM50890m2 = m50890m();
            if (jM50890m2 > 0) {
                jM50890m += jM50890m2;
            }
        }
        return jM50890m;
    }

    /* renamed from: h */
    public long m50885h() {
        return this.f48267t;
    }

    /* renamed from: i */
    public sl1 m50886i() {
        if (this.f48250c == null) {
            this.f48250c = this.f48248a.mo37460f(this.f48254g);
        }
        return this.f48250c;
    }

    @Override // p001o.ixc
    public boolean isComplete() {
        return m50889l(0);
    }

    /* renamed from: j */
    public int m50887j() {
        return this.f48264q;
    }

    /* renamed from: k */
    public boolean m50888k() {
        return this.f48267t == -2;
    }

    /* renamed from: l */
    public boolean m50889l(int i) {
        return this.f48264q == i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:316:0x0663
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m50890m() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.u38.m50890m():long");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("state=");
        stringBuffer.append(this.f48264q);
        stringBuffer.append(" length=");
        stringBuffer.append(this.f48266s);
        stringBuffer.append(" len=");
        stringBuffer.append(this.f48267t);
        return stringBuffer.toString();
    }

    /* renamed from: o.u38$b */
    public static class C17289b extends xgf {

        /* renamed from: a */
        public u38 f48271a;

        /* renamed from: b */
        public y76 f48272b;

        /* renamed from: c */
        public long f48273c;

        /* renamed from: d */
        public sl1 f48274d;

        public C17289b(u38 u38Var, long j) {
            this.f48271a = u38Var;
            this.f48272b = u38Var.f48249b;
            this.f48273c = j;
            this.f48274d = this.f48271a.f48253f;
            this.f48271a.f48263p = this;
        }

        /* renamed from: a */
        public final boolean m50891a() throws IOException {
            if (this.f48274d.length() > 0) {
                return true;
            }
            if (this.f48271a.m50887j() <= 0) {
                return false;
            }
            y76 y76Var = this.f48272b;
            if (y76Var == null) {
                this.f48271a.m50890m();
            } else if (y76Var.mo51046c()) {
                try {
                    this.f48271a.m50890m();
                    while (this.f48274d.length() == 0 && !this.f48271a.m50889l(0) && this.f48272b.isOpen()) {
                        this.f48271a.m50890m();
                    }
                } catch (IOException e) {
                    this.f48272b.close();
                    throw e;
                }
            } else {
                this.f48271a.m50890m();
                while (this.f48274d.length() == 0 && !this.f48271a.m50889l(0) && this.f48272b.isOpen()) {
                    if (!this.f48272b.mo51052l() || this.f48271a.m50890m() <= 0) {
                        if (!this.f48272b.mo51051i(this.f48273c)) {
                            this.f48272b.close();
                            throw new dj6("timeout");
                        }
                        this.f48271a.m50890m();
                    }
                }
            }
            return this.f48274d.length() > 0;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            sl1 sl1Var = this.f48274d;
            if (sl1Var != null && sl1Var.length() > 0) {
                return this.f48274d.length();
            }
            if (!this.f48272b.mo51046c()) {
                this.f48271a.m50890m();
            }
            sl1 sl1Var2 = this.f48274d;
            if (sl1Var2 == null) {
                return 0;
            }
            return sl1Var2.length();
        }

        @Override // java.io.InputStream
        public int read() {
            if (m50891a()) {
                return this.f48274d.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (m50891a()) {
                return this.f48274d.K0(bArr, i, i2);
            }
            return -1;
        }
    }
}
