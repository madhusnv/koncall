package p001o;

import java.io.EOFException;
import p001o.hyh;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class m70 implements tq6 {

    /* renamed from: m */
    public static final yq6 f34902m = new yq6() { // from class: o.l70
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return m70.m38466j();
        }
    };

    /* renamed from: a */
    public final int f34903a;

    /* renamed from: b */
    public final n70 f34904b;

    /* renamed from: c */
    public final zwc f34905c;

    /* renamed from: d */
    public final zwc f34906d;

    /* renamed from: e */
    public final ywc f34907e;

    /* renamed from: f */
    public vq6 f34908f;

    /* renamed from: g */
    public long f34909g;

    /* renamed from: h */
    public long f34910h;

    /* renamed from: i */
    public int f34911i;

    /* renamed from: j */
    public boolean f34912j;

    /* renamed from: k */
    public boolean f34913k;

    /* renamed from: l */
    public boolean f34914l;

    public m70() {
        this(0);
    }

    /* renamed from: g */
    public static int m38465g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: j */
    public static /* synthetic */ tq6[] m38466j() {
        return new tq6[]{new m70()};
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f34913k = false;
        this.f34904b.mo24647b();
        this.f34909g = j2;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        int iM38470m = m38470m(uq6Var);
        int i = iM38470m;
        int i2 = 0;
        int i3 = 0;
        do {
            uq6Var.mo40498m(this.f34906d.m60024e(), 0, 2);
            this.f34906d.m60017U(0);
            if (n70.m40173m(this.f34906d.m60010N())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                uq6Var.mo40498m(this.f34906d.m60024e(), 0, 4);
                this.f34907e.m58452p(14);
                int iM58444h = this.f34907e.m58444h(13);
                if (iM58444h <= 6) {
                    i++;
                    uq6Var.mo40490c();
                    uq6Var.mo40494h(i);
                } else {
                    uq6Var.mo40494h(iM58444h - 6);
                    i3 += iM58444h;
                }
            } else {
                i++;
                uq6Var.mo40490c();
                uq6Var.mo40494h(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iM38470m < 8192);
        return false;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f34908f = vq6Var;
        this.f34904b.mo24649d(vq6Var, new hyh.C14129d(0, 1));
        vq6Var.mo32489p();
    }

    /* renamed from: e */
    public final void m38467e(uq6 uq6Var) throws byc {
        int iM58444h;
        if (this.f34912j) {
            return;
        }
        this.f34911i = -1;
        uq6Var.mo40490c();
        long j = 0;
        if (uq6Var.getPosition() == 0) {
            m38470m(uq6Var);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!uq6Var.mo40489a(this.f34906d.m60024e(), 0, 2, true)) {
                    break;
                }
                this.f34906d.m60017U(0);
                if (!n70.m40173m(this.f34906d.m60010N())) {
                    break;
                }
                if (!uq6Var.mo40489a(this.f34906d.m60024e(), 0, 4, true)) {
                    break;
                }
                this.f34907e.m58452p(14);
                iM58444h = this.f34907e.m58444h(13);
                if (iM58444h <= 6) {
                    this.f34912j = true;
                    throw byc.m19921a("Malformed ADTS stream", null);
                }
                j += iM58444h;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (uq6Var.mo40497l(iM58444h - 6, true));
        i = i2;
        uq6Var.mo40490c();
        if (i > 0) {
            this.f34911i = (int) (j / i);
        } else {
            this.f34911i = -1;
        }
        this.f34912j = true;
    }

    /* renamed from: h */
    public final zaf m38468h(long j, boolean z) {
        return new pt3(j, this.f34910h, m38465g(this.f34911i, this.f34904b.m40179k()), this.f34911i, z);
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        op0.m42519i(this.f34908f);
        long length = uq6Var.getLength();
        int i = this.f34903a;
        if (((i & 2) == 0 && ((i & 1) == 0 || length == -1)) ? false : true) {
            m38467e(uq6Var);
        }
        int i2 = uq6Var.read(this.f34905c.m60024e(), 0, 2048);
        boolean z = i2 == -1;
        m38469l(length, z);
        if (z) {
            return -1;
        }
        this.f34905c.m60017U(0);
        this.f34905c.m60016T(i2);
        if (!this.f34913k) {
            this.f34904b.mo24650e(this.f34909g, 4);
            this.f34913k = true;
        }
        this.f34904b.mo24646a(this.f34905c);
        return 0;
    }

    /* renamed from: l */
    public final void m38469l(long j, boolean z) {
        if (this.f34914l) {
            return;
        }
        boolean z2 = (this.f34903a & 1) != 0 && this.f34911i > 0;
        if (z2 && this.f34904b.m40179k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.f34904b.m40179k() == -9223372036854775807L) {
            this.f34908f.mo32490r(new zaf.C18604b(-9223372036854775807L));
        } else {
            this.f34908f.mo32490r(m38468h(j, (this.f34903a & 2) != 0));
        }
        this.f34914l = true;
    }

    /* renamed from: m */
    public final int m38470m(uq6 uq6Var) {
        int i = 0;
        while (true) {
            uq6Var.mo40498m(this.f34906d.m60024e(), 0, 10);
            this.f34906d.m60017U(0);
            if (this.f34906d.m60007K() != 4801587) {
                break;
            }
            this.f34906d.m60018V(3);
            int iM60003G = this.f34906d.m60003G();
            i += iM60003G + 10;
            uq6Var.mo40494h(iM60003G);
        }
        uq6Var.mo40490c();
        uq6Var.mo40494h(i);
        if (this.f34910h == -1) {
            this.f34910h = i;
        }
        return i;
    }

    @Override // p001o.tq6
    public void release() {
    }

    public m70(int i) {
        this.f34903a = (i & 2) != 0 ? i | 1 : i;
        this.f34904b = new n70(true);
        this.f34905c = new zwc(2048);
        this.f34911i = -1;
        this.f34910h = -1L;
        zwc zwcVar = new zwc(10);
        this.f34906d = zwcVar;
        this.f34907e = new ywc(zwcVar.m60024e());
    }
}
