package p001o;

import java.util.Arrays;
import java.util.HashMap;
import p001o.fzf;
import p001o.tt3;

/* loaded from: classes2.dex */
public class sda {

    /* renamed from: s */
    public static boolean f45258s = false;

    /* renamed from: t */
    public static boolean f45259t = true;

    /* renamed from: u */
    public static boolean f45260u = true;

    /* renamed from: v */
    public static boolean f45261v = true;

    /* renamed from: w */
    public static boolean f45262w = false;

    /* renamed from: x */
    public static long f45263x;

    /* renamed from: y */
    public static long f45264y;

    /* renamed from: e */
    public InterfaceC16812a f45269e;

    /* renamed from: o */
    public final tr1 f45279o;

    /* renamed from: r */
    public InterfaceC16812a f45282r;

    /* renamed from: a */
    public int f45265a = 1000;

    /* renamed from: b */
    public boolean f45266b = false;

    /* renamed from: c */
    public int f45267c = 0;

    /* renamed from: d */
    public HashMap f45268d = null;

    /* renamed from: f */
    public int f45270f = 32;

    /* renamed from: g */
    public int f45271g = 32;

    /* renamed from: i */
    public boolean f45273i = false;

    /* renamed from: j */
    public boolean f45274j = false;

    /* renamed from: k */
    public boolean[] f45275k = new boolean[32];

    /* renamed from: l */
    public int f45276l = 1;

    /* renamed from: m */
    public int f45277m = 0;

    /* renamed from: n */
    public int f45278n = 32;

    /* renamed from: p */
    public fzf[] f45280p = new fzf[1000];

    /* renamed from: q */
    public int f45281q = 0;

    /* renamed from: h */
    public zo0[] f45272h = new zo0[32];

    /* renamed from: o.sda$a */
    public interface InterfaceC16812a {
        /* renamed from: a */
        fzf mo30641a(sda sdaVar, boolean[] zArr);

        /* renamed from: b */
        void mo48259b(InterfaceC16812a interfaceC16812a);

        /* renamed from: c */
        void mo30642c(fzf fzfVar);

        void clear();

        fzf getKey();

        boolean isEmpty();
    }

    /* renamed from: o.sda$b */
    public static class C16813b extends zo0 {
        public C16813b(tr1 tr1Var) {
            this.f57441e = new gzf(this, tr1Var);
        }
    }

    public sda() {
        m48233D();
        tr1 tr1Var = new tr1();
        this.f45279o = tr1Var;
        this.f45269e = new hid(tr1Var);
        if (f45262w) {
            this.f45282r = new C16813b(tr1Var);
        } else {
            this.f45282r = new zo0(tr1Var);
        }
    }

    /* renamed from: s */
    public static zo0 m48228s(sda sdaVar, fzf fzfVar, fzf fzfVar2, float f) {
        return sdaVar.m48252r().m59646j(fzfVar, fzfVar2, f);
    }

    /* renamed from: x */
    public static meb m48229x() {
        return null;
    }

    /* renamed from: A */
    public void m48230A() {
        if (this.f45269e.isEmpty()) {
            m48248n();
            return;
        }
        if (!this.f45273i && !this.f45274j) {
            m48231B(this.f45269e);
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f45277m) {
                z = true;
                break;
            } else if (!this.f45272h[i].f57442f) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m48248n();
        } else {
            m48231B(this.f45269e);
        }
    }

    /* renamed from: B */
    public void m48231B(InterfaceC16812a interfaceC16812a) {
        m48254u(interfaceC16812a);
        m48232C(interfaceC16812a, false);
        m48248n();
    }

    /* renamed from: C */
    public final int m48232C(InterfaceC16812a interfaceC16812a, boolean z) {
        for (int i = 0; i < this.f45276l; i++) {
            this.f45275k[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f45276l * 2) {
                return i2;
            }
            if (interfaceC16812a.getKey() != null) {
                this.f45275k[interfaceC16812a.getKey().f24295c] = true;
            }
            fzf fzfVarMo30641a = interfaceC16812a.mo30641a(this, this.f45275k);
            if (fzfVarMo30641a != null) {
                boolean[] zArr = this.f45275k;
                int i3 = fzfVarMo30641a.f24295c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (fzfVarMo30641a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f45277m; i5++) {
                    zo0 zo0Var = this.f45272h[i5];
                    if (zo0Var.f57437a.f24302s != fzf.EnumC13593a.UNRESTRICTED && !zo0Var.f57442f && zo0Var.m59656t(fzfVarMo30641a)) {
                        float fMo29688a = zo0Var.f57441e.mo29688a(fzfVarMo30641a);
                        if (fMo29688a < 0.0f) {
                            float f2 = (-zo0Var.f57438b) / fMo29688a;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    zo0 zo0Var2 = this.f45272h[i4];
                    zo0Var2.f57437a.f24296d = -1;
                    zo0Var2.m59660x(fzfVarMo30641a);
                    fzf fzfVar = zo0Var2.f57437a;
                    fzfVar.f24296d = i4;
                    fzfVar.m27827m(this, zo0Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    public final void m48233D() {
        int i = 0;
        if (f45262w) {
            while (i < this.f45277m) {
                zo0 zo0Var = this.f45272h[i];
                if (zo0Var != null) {
                    this.f45279o.f47643a.mo30308a(zo0Var);
                }
                this.f45272h[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f45277m) {
            zo0 zo0Var2 = this.f45272h[i];
            if (zo0Var2 != null) {
                this.f45279o.f47644b.mo30308a(zo0Var2);
            }
            this.f45272h[i] = null;
            i++;
        }
    }

    /* renamed from: E */
    public void m48234E() {
        tr1 tr1Var;
        int i = 0;
        while (true) {
            tr1Var = this.f45279o;
            fzf[] fzfVarArr = tr1Var.f47646d;
            if (i >= fzfVarArr.length) {
                break;
            }
            fzf fzfVar = fzfVarArr[i];
            if (fzfVar != null) {
                fzfVar.m27824g();
            }
            i++;
        }
        tr1Var.f47645c.mo30310c(this.f45280p, this.f45281q);
        this.f45281q = 0;
        Arrays.fill(this.f45279o.f47646d, (Object) null);
        HashMap map = this.f45268d;
        if (map != null) {
            map.clear();
        }
        this.f45267c = 0;
        this.f45269e.clear();
        this.f45276l = 1;
        for (int i2 = 0; i2 < this.f45277m; i2++) {
            zo0 zo0Var = this.f45272h[i2];
            if (zo0Var != null) {
                zo0Var.f57439c = false;
            }
        }
        m48233D();
        this.f45277m = 0;
        if (f45262w) {
            this.f45282r = new C16813b(this.f45279o);
        } else {
            this.f45282r = new zo0(this.f45279o);
        }
    }

    /* renamed from: a */
    public final fzf m48235a(fzf.EnumC13593a enumC13593a, String str) {
        fzf fzfVar = (fzf) this.f45279o.f47645c.mo30309b();
        if (fzfVar == null) {
            fzfVar = new fzf(enumC13593a, str);
            fzfVar.m27826j(enumC13593a, str);
        } else {
            fzfVar.m27824g();
            fzfVar.m27826j(enumC13593a, str);
        }
        int i = this.f45281q;
        int i2 = this.f45265a;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.f45265a = i3;
            this.f45280p = (fzf[]) Arrays.copyOf(this.f45280p, i3);
        }
        fzf[] fzfVarArr = this.f45280p;
        int i4 = this.f45281q;
        this.f45281q = i4 + 1;
        fzfVarArr[i4] = fzfVar;
        return fzfVar;
    }

    /* renamed from: b */
    public void m48236b(zt3 zt3Var, zt3 zt3Var2, float f, int i) {
        tt3.EnumC17197a enumC17197a = tt3.EnumC17197a.LEFT;
        fzf fzfVarM48251q = m48251q(zt3Var.mo47185q(enumC17197a));
        tt3.EnumC17197a enumC17197a2 = tt3.EnumC17197a.TOP;
        fzf fzfVarM48251q2 = m48251q(zt3Var.mo47185q(enumC17197a2));
        tt3.EnumC17197a enumC17197a3 = tt3.EnumC17197a.RIGHT;
        fzf fzfVarM48251q3 = m48251q(zt3Var.mo47185q(enumC17197a3));
        tt3.EnumC17197a enumC17197a4 = tt3.EnumC17197a.BOTTOM;
        fzf fzfVarM48251q4 = m48251q(zt3Var.mo47185q(enumC17197a4));
        fzf fzfVarM48251q5 = m48251q(zt3Var2.mo47185q(enumC17197a));
        fzf fzfVarM48251q6 = m48251q(zt3Var2.mo47185q(enumC17197a2));
        fzf fzfVarM48251q7 = m48251q(zt3Var2.mo47185q(enumC17197a3));
        fzf fzfVarM48251q8 = m48251q(zt3Var2.mo47185q(enumC17197a4));
        zo0 zo0VarM48252r = m48252r();
        double d = f;
        double d2 = i;
        zo0VarM48252r.m59653q(fzfVarM48251q2, fzfVarM48251q4, fzfVarM48251q6, fzfVarM48251q8, (float) (Math.sin(d) * d2));
        m48238d(zo0VarM48252r);
        zo0 zo0VarM48252r2 = m48252r();
        zo0VarM48252r2.m59653q(fzfVarM48251q, fzfVarM48251q3, fzfVarM48251q5, fzfVarM48251q7, (float) (Math.cos(d) * d2));
        m48238d(zo0VarM48252r2);
    }

    /* renamed from: c */
    public void m48237c(fzf fzfVar, fzf fzfVar2, int i, float f, fzf fzfVar3, fzf fzfVar4, int i2, int i3) {
        zo0 zo0VarM48252r = m48252r();
        zo0VarM48252r.m59644h(fzfVar, fzfVar2, i, f, fzfVar3, fzfVar4, i2);
        if (i3 != 8) {
            zo0VarM48252r.m59640d(this, i3);
        }
        m48238d(zo0VarM48252r);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m48238d(zo0 zo0Var) {
        fzf fzfVarM59658v;
        if (zo0Var == null) {
            return;
        }
        boolean z = true;
        if (this.f45277m + 1 >= this.f45278n || this.f45276l + 1 >= this.f45271g) {
            m48258z();
        }
        boolean z2 = false;
        if (!zo0Var.f57442f) {
            zo0Var.m59639D(this);
            if (zo0Var.isEmpty()) {
                return;
            }
            zo0Var.m59654r();
            if (zo0Var.m59642f(this)) {
                fzf fzfVarM48250p = m48250p();
                zo0Var.f57437a = fzfVarM48250p;
                int i = this.f45277m;
                m48246l(zo0Var);
                if (this.f45277m == i + 1) {
                    this.f45282r.mo48259b(zo0Var);
                    m48232C(this.f45282r, true);
                    if (fzfVarM48250p.f24296d == -1) {
                        if (zo0Var.f57437a == fzfVarM48250p && (fzfVarM59658v = zo0Var.m59658v(fzfVarM48250p)) != null) {
                            zo0Var.m59660x(fzfVarM59658v);
                        }
                        if (!zo0Var.f57442f) {
                            zo0Var.f57437a.m27827m(this, zo0Var);
                        }
                        if (f45262w) {
                            this.f45279o.f47643a.mo30308a(zo0Var);
                        } else {
                            this.f45279o.f47644b.mo30308a(zo0Var);
                        }
                        this.f45277m--;
                    }
                } else {
                    z = false;
                }
                if (!zo0Var.m59655s()) {
                    return;
                } else {
                    z2 = z;
                }
            }
        }
        if (z2) {
            return;
        }
        m48246l(zo0Var);
    }

    /* renamed from: e */
    public zo0 m48239e(fzf fzfVar, fzf fzfVar2, int i, int i2) {
        if (f45259t && i2 == 8 && fzfVar2.f24299g && fzfVar.f24296d == -1) {
            fzfVar.m27825h(this, fzfVar2.f24298f + i);
            return null;
        }
        zo0 zo0VarM48252r = m48252r();
        zo0VarM48252r.m59650n(fzfVar, fzfVar2, i);
        if (i2 != 8) {
            zo0VarM48252r.m59640d(this, i2);
        }
        m48238d(zo0VarM48252r);
        return zo0VarM48252r;
    }

    /* renamed from: f */
    public void m48240f(fzf fzfVar, int i) {
        if (f45259t && fzfVar.f24296d == -1) {
            float f = i;
            fzfVar.m27825h(this, f);
            for (int i2 = 0; i2 < this.f45267c + 1; i2++) {
                fzf fzfVar2 = this.f45279o.f47646d[i2];
                if (fzfVar2 != null && fzfVar2.f24289L && fzfVar2.f24290M == fzfVar.f24295c) {
                    fzfVar2.m27825h(this, fzfVar2.f24291Q + f);
                }
            }
            return;
        }
        int i3 = fzfVar.f24296d;
        if (i3 == -1) {
            zo0 zo0VarM48252r = m48252r();
            zo0VarM48252r.m59645i(fzfVar, i);
            m48238d(zo0VarM48252r);
            return;
        }
        zo0 zo0Var = this.f45272h[i3];
        if (zo0Var.f57442f) {
            zo0Var.f57438b = i;
            return;
        }
        if (zo0Var.f57441e.mo29694g() == 0) {
            zo0Var.f57442f = true;
            zo0Var.f57438b = i;
        } else {
            zo0 zo0VarM48252r2 = m48252r();
            zo0VarM48252r2.m59649m(fzfVar, i);
            m48238d(zo0VarM48252r2);
        }
    }

    /* renamed from: g */
    public void m48241g(fzf fzfVar, fzf fzfVar2, int i, boolean z) {
        zo0 zo0VarM48252r = m48252r();
        fzf fzfVarM48253t = m48253t();
        fzfVarM48253t.f24297e = 0;
        zo0VarM48252r.m59651o(fzfVar, fzfVar2, fzfVarM48253t, i);
        m48238d(zo0VarM48252r);
    }

    /* renamed from: h */
    public void m48242h(fzf fzfVar, fzf fzfVar2, int i, int i2) {
        zo0 zo0VarM48252r = m48252r();
        fzf fzfVarM48253t = m48253t();
        fzfVarM48253t.f24297e = 0;
        zo0VarM48252r.m59651o(fzfVar, fzfVar2, fzfVarM48253t, i);
        if (i2 != 8) {
            m48247m(zo0VarM48252r, (int) (zo0VarM48252r.f57441e.mo29688a(fzfVarM48253t) * (-1.0f)), i2);
        }
        m48238d(zo0VarM48252r);
    }

    /* renamed from: i */
    public void m48243i(fzf fzfVar, fzf fzfVar2, int i, boolean z) {
        zo0 zo0VarM48252r = m48252r();
        fzf fzfVarM48253t = m48253t();
        fzfVarM48253t.f24297e = 0;
        zo0VarM48252r.m59652p(fzfVar, fzfVar2, fzfVarM48253t, i);
        m48238d(zo0VarM48252r);
    }

    /* renamed from: j */
    public void m48244j(fzf fzfVar, fzf fzfVar2, int i, int i2) {
        zo0 zo0VarM48252r = m48252r();
        fzf fzfVarM48253t = m48253t();
        fzfVarM48253t.f24297e = 0;
        zo0VarM48252r.m59652p(fzfVar, fzfVar2, fzfVarM48253t, i);
        if (i2 != 8) {
            m48247m(zo0VarM48252r, (int) (zo0VarM48252r.f57441e.mo29688a(fzfVarM48253t) * (-1.0f)), i2);
        }
        m48238d(zo0VarM48252r);
    }

    /* renamed from: k */
    public void m48245k(fzf fzfVar, fzf fzfVar2, fzf fzfVar3, fzf fzfVar4, float f, int i) {
        zo0 zo0VarM48252r = m48252r();
        zo0VarM48252r.m59647k(fzfVar, fzfVar2, fzfVar3, fzfVar4, f);
        if (i != 8) {
            zo0VarM48252r.m59640d(this, i);
        }
        m48238d(zo0VarM48252r);
    }

    /* renamed from: l */
    public final void m48246l(zo0 zo0Var) {
        int i;
        if (f45260u && zo0Var.f57442f) {
            zo0Var.f57437a.m27825h(this, zo0Var.f57438b);
        } else {
            zo0[] zo0VarArr = this.f45272h;
            int i2 = this.f45277m;
            zo0VarArr[i2] = zo0Var;
            fzf fzfVar = zo0Var.f57437a;
            fzfVar.f24296d = i2;
            this.f45277m = i2 + 1;
            fzfVar.m27827m(this, zo0Var);
        }
        if (f45260u && this.f45266b) {
            int i3 = 0;
            while (i3 < this.f45277m) {
                if (this.f45272h[i3] == null) {
                    System.out.println("WTF");
                }
                zo0 zo0Var2 = this.f45272h[i3];
                if (zo0Var2 != null && zo0Var2.f57442f) {
                    zo0Var2.f57437a.m27825h(this, zo0Var2.f57438b);
                    if (f45262w) {
                        this.f45279o.f47643a.mo30308a(zo0Var2);
                    } else {
                        this.f45279o.f47644b.mo30308a(zo0Var2);
                    }
                    this.f45272h[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f45277m;
                        if (i4 >= i) {
                            break;
                        }
                        zo0[] zo0VarArr2 = this.f45272h;
                        int i6 = i4 - 1;
                        zo0 zo0Var3 = zo0VarArr2[i4];
                        zo0VarArr2[i6] = zo0Var3;
                        fzf fzfVar2 = zo0Var3.f57437a;
                        if (fzfVar2.f24296d == i4) {
                            fzfVar2.f24296d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f45272h[i5] = null;
                    }
                    this.f45277m = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f45266b = false;
        }
    }

    /* renamed from: m */
    public void m48247m(zo0 zo0Var, int i, int i2) {
        zo0Var.m59641e(m48249o(i2, null), i);
    }

    /* renamed from: n */
    public final void m48248n() {
        for (int i = 0; i < this.f45277m; i++) {
            zo0 zo0Var = this.f45272h[i];
            zo0Var.f57437a.f24298f = zo0Var.f57438b;
        }
    }

    /* renamed from: o */
    public fzf m48249o(int i, String str) {
        if (this.f45276l + 1 >= this.f45271g) {
            m48258z();
        }
        fzf fzfVarM48235a = m48235a(fzf.EnumC13593a.ERROR, str);
        int i2 = this.f45267c + 1;
        this.f45267c = i2;
        this.f45276l++;
        fzfVarM48235a.f24295c = i2;
        fzfVarM48235a.f24297e = i;
        this.f45279o.f47646d[i2] = fzfVarM48235a;
        this.f45269e.mo30642c(fzfVarM48235a);
        return fzfVarM48235a;
    }

    /* renamed from: p */
    public fzf m48250p() {
        if (this.f45276l + 1 >= this.f45271g) {
            m48258z();
        }
        fzf fzfVarM48235a = m48235a(fzf.EnumC13593a.SLACK, null);
        int i = this.f45267c + 1;
        this.f45267c = i;
        this.f45276l++;
        fzfVarM48235a.f24295c = i;
        this.f45279o.f47646d[i] = fzfVarM48235a;
        return fzfVarM48235a;
    }

    /* renamed from: q */
    public fzf m48251q(Object obj) {
        fzf fzfVarM50476i = null;
        if (obj == null) {
            return null;
        }
        if (this.f45276l + 1 >= this.f45271g) {
            m48258z();
        }
        if (obj instanceof tt3) {
            tt3 tt3Var = (tt3) obj;
            fzfVarM50476i = tt3Var.m50476i();
            if (fzfVarM50476i == null) {
                tt3Var.m50486s(this.f45279o);
                fzfVarM50476i = tt3Var.m50476i();
            }
            int i = fzfVarM50476i.f24295c;
            if (i == -1 || i > this.f45267c || this.f45279o.f47646d[i] == null) {
                if (i != -1) {
                    fzfVarM50476i.m27824g();
                }
                int i2 = this.f45267c + 1;
                this.f45267c = i2;
                this.f45276l++;
                fzfVarM50476i.f24295c = i2;
                fzfVarM50476i.f24302s = fzf.EnumC13593a.UNRESTRICTED;
                this.f45279o.f47646d[i2] = fzfVarM50476i;
            }
        }
        return fzfVarM50476i;
    }

    /* renamed from: r */
    public zo0 m48252r() {
        zo0 zo0Var;
        if (f45262w) {
            zo0Var = (zo0) this.f45279o.f47643a.mo30309b();
            if (zo0Var == null) {
                zo0Var = new C16813b(this.f45279o);
                f45264y++;
            } else {
                zo0Var.m59661y();
            }
        } else {
            zo0Var = (zo0) this.f45279o.f47644b.mo30309b();
            if (zo0Var == null) {
                zo0Var = new zo0(this.f45279o);
                f45263x++;
            } else {
                zo0Var.m59661y();
            }
        }
        fzf.m27820d();
        return zo0Var;
    }

    /* renamed from: t */
    public fzf m48253t() {
        if (this.f45276l + 1 >= this.f45271g) {
            m48258z();
        }
        fzf fzfVarM48235a = m48235a(fzf.EnumC13593a.SLACK, null);
        int i = this.f45267c + 1;
        this.f45267c = i;
        this.f45276l++;
        fzfVarM48235a.f24295c = i;
        this.f45279o.f47646d[i] = fzfVarM48235a;
        return fzfVarM48235a;
    }

    /* renamed from: u */
    public final int m48254u(InterfaceC16812a interfaceC16812a) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f45277m) {
                z = false;
                break;
            }
            zo0 zo0Var = this.f45272h[i];
            if (zo0Var.f57437a.f24302s != fzf.EnumC13593a.UNRESTRICTED && zo0Var.f57438b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f45277m; i6++) {
                zo0 zo0Var2 = this.f45272h[i6];
                if (zo0Var2.f57437a.f24302s != fzf.EnumC13593a.UNRESTRICTED && !zo0Var2.f57442f && zo0Var2.f57438b < 0.0f) {
                    int i7 = 9;
                    if (f45261v) {
                        int iMo29694g = zo0Var2.f57441e.mo29694g();
                        int i8 = 0;
                        while (i8 < iMo29694g) {
                            fzf fzfVarMo29689b = zo0Var2.f57441e.mo29689b(i8);
                            float fMo29688a = zo0Var2.f57441e.mo29688a(fzfVarMo29689b);
                            if (fMo29688a > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = fzfVarMo29689b.f24300h[i9] / fMo29688a;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = fzfVarMo29689b.f24295c;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f45276l; i10++) {
                            fzf fzfVar = this.f45279o.f47646d[i10];
                            float fMo29688a2 = zo0Var2.f57441e.mo29688a(fzfVar);
                            if (fMo29688a2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = fzfVar.f24300h[i11] / fMo29688a2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i3 = i6;
                                        i5 = i11;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                zo0 zo0Var3 = this.f45272h[i3];
                zo0Var3.f57437a.f24296d = -1;
                zo0Var3.m59660x(this.f45279o.f47646d[i4]);
                fzf fzfVar2 = zo0Var3.f57437a;
                fzfVar2.f24296d = i3;
                fzfVar2.m27827m(this, zo0Var3);
            } else {
                z2 = true;
            }
            if (i2 > this.f45276l / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public void m48255v(meb mebVar) {
    }

    /* renamed from: w */
    public tr1 m48256w() {
        return this.f45279o;
    }

    /* renamed from: y */
    public int m48257y(Object obj) {
        fzf fzfVarM50476i = ((tt3) obj).m50476i();
        if (fzfVarM50476i != null) {
            return (int) (fzfVarM50476i.f24298f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public final void m48258z() {
        int i = this.f45270f * 2;
        this.f45270f = i;
        this.f45272h = (zo0[]) Arrays.copyOf(this.f45272h, i);
        tr1 tr1Var = this.f45279o;
        tr1Var.f47646d = (fzf[]) Arrays.copyOf(tr1Var.f47646d, this.f45270f);
        int i2 = this.f45270f;
        this.f45275k = new boolean[i2];
        this.f45271g = i2;
        this.f45278n = i2;
    }
}
