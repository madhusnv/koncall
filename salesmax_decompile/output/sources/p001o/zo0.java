package p001o;

import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import p001o.fzf;
import p001o.sda;

/* loaded from: classes2.dex */
public class zo0 implements sda.InterfaceC16812a {

    /* renamed from: e */
    public InterfaceC18686a f57441e;

    /* renamed from: a */
    public fzf f57437a = null;

    /* renamed from: b */
    public float f57438b = 0.0f;

    /* renamed from: c */
    public boolean f57439c = false;

    /* renamed from: d */
    public ArrayList f57440d = new ArrayList();

    /* renamed from: f */
    public boolean f57442f = false;

    /* renamed from: o.zo0$a */
    public interface InterfaceC18686a {
        /* renamed from: a */
        float mo29688a(fzf fzfVar);

        /* renamed from: b */
        fzf mo29689b(int i);

        /* renamed from: c */
        float mo29690c(fzf fzfVar, boolean z);

        void clear();

        /* renamed from: d */
        void mo29691d();

        /* renamed from: e */
        void mo29692e(fzf fzfVar, float f);

        /* renamed from: f */
        boolean mo29693f(fzf fzfVar);

        /* renamed from: g */
        int mo29694g();

        /* renamed from: h */
        float mo29695h(int i);

        /* renamed from: i */
        void mo29696i(fzf fzfVar, float f, boolean z);

        /* renamed from: j */
        float mo29697j(zo0 zo0Var, boolean z);

        /* renamed from: k */
        void mo29698k(float f);
    }

    public zo0() {
    }

    /* renamed from: A */
    public void m59637A(sda sdaVar, fzf fzfVar, boolean z) {
        if (fzfVar == null || !fzfVar.f24299g) {
            return;
        }
        this.f57438b += fzfVar.f24298f * this.f57441e.mo29688a(fzfVar);
        this.f57441e.mo29690c(fzfVar, z);
        if (z) {
            fzfVar.m27823e(this);
        }
        if (sda.f45260u && this.f57441e.mo29694g() == 0) {
            this.f57442f = true;
            sdaVar.f45266b = true;
        }
    }

    /* renamed from: B */
    public void mo30638B(sda sdaVar, zo0 zo0Var, boolean z) {
        this.f57438b += zo0Var.f57438b * this.f57441e.mo29697j(zo0Var, z);
        if (z) {
            zo0Var.f57437a.m27823e(this);
        }
        if (sda.f45260u && this.f57437a != null && this.f57441e.mo29694g() == 0) {
            this.f57442f = true;
            sdaVar.f45266b = true;
        }
    }

    /* renamed from: C */
    public void m59638C(sda sdaVar, fzf fzfVar, boolean z) {
        if (fzfVar == null || !fzfVar.f24289L) {
            return;
        }
        float fMo29688a = this.f57441e.mo29688a(fzfVar);
        this.f57438b += fzfVar.f24291Q * fMo29688a;
        this.f57441e.mo29690c(fzfVar, z);
        if (z) {
            fzfVar.m27823e(this);
        }
        this.f57441e.mo29696i(sdaVar.f45279o.f47646d[fzfVar.f24290M], fMo29688a, z);
        if (sda.f45260u && this.f57441e.mo29694g() == 0) {
            this.f57442f = true;
            sdaVar.f45266b = true;
        }
    }

    /* renamed from: D */
    public void m59639D(sda sdaVar) {
        if (sdaVar.f45272h.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iMo29694g = this.f57441e.mo29694g();
            for (int i = 0; i < iMo29694g; i++) {
                fzf fzfVarMo29689b = this.f57441e.mo29689b(i);
                if (fzfVarMo29689b.f24296d != -1 || fzfVarMo29689b.f24299g || fzfVarMo29689b.f24289L) {
                    this.f57440d.add(fzfVarMo29689b);
                }
            }
            int size = this.f57440d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    fzf fzfVar = (fzf) this.f57440d.get(i2);
                    if (fzfVar.f24299g) {
                        m59637A(sdaVar, fzfVar, true);
                    } else if (fzfVar.f24289L) {
                        m59638C(sdaVar, fzfVar, true);
                    } else {
                        mo30638B(sdaVar, sdaVar.f45272h[fzfVar.f24296d], true);
                    }
                }
                this.f57440d.clear();
            } else {
                z = true;
            }
        }
        if (sda.f45260u && this.f57437a != null && this.f57441e.mo29694g() == 0) {
            this.f57442f = true;
            sdaVar.f45266b = true;
        }
    }

    @Override // p001o.sda.InterfaceC16812a
    /* renamed from: a */
    public fzf mo30641a(sda sdaVar, boolean[] zArr) {
        return m59659w(zArr, null);
    }

    @Override // p001o.sda.InterfaceC16812a
    /* renamed from: b */
    public void mo48259b(sda.InterfaceC16812a interfaceC16812a) {
        if (interfaceC16812a instanceof zo0) {
            zo0 zo0Var = (zo0) interfaceC16812a;
            this.f57437a = null;
            this.f57441e.clear();
            for (int i = 0; i < zo0Var.f57441e.mo29694g(); i++) {
                this.f57441e.mo29696i(zo0Var.f57441e.mo29689b(i), zo0Var.f57441e.mo29695h(i), true);
            }
        }
    }

    @Override // p001o.sda.InterfaceC16812a
    /* renamed from: c */
    public void mo30642c(fzf fzfVar) {
        int i = fzfVar.f24297e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f57441e.mo29692e(fzfVar, f);
    }

    @Override // p001o.sda.InterfaceC16812a
    public void clear() {
        this.f57441e.clear();
        this.f57437a = null;
        this.f57438b = 0.0f;
    }

    /* renamed from: d */
    public zo0 m59640d(sda sdaVar, int i) {
        this.f57441e.mo29692e(sdaVar.m48249o(i, "ep"), 1.0f);
        this.f57441e.mo29692e(sdaVar.m48249o(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public zo0 m59641e(fzf fzfVar, int i) {
        this.f57441e.mo29692e(fzfVar, i);
        return this;
    }

    /* renamed from: f */
    public boolean m59642f(sda sdaVar) {
        boolean z;
        fzf fzfVarM59643g = m59643g(sdaVar);
        if (fzfVarM59643g == null) {
            z = true;
        } else {
            m59660x(fzfVarM59643g);
            z = false;
        }
        if (this.f57441e.mo29694g() == 0) {
            this.f57442f = true;
        }
        return z;
    }

    /* renamed from: g */
    public fzf m59643g(sda sdaVar) {
        int iMo29694g = this.f57441e.mo29694g();
        fzf fzfVar = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        fzf fzfVar2 = null;
        for (int i = 0; i < iMo29694g; i++) {
            float fMo29695h = this.f57441e.mo29695h(i);
            fzf fzfVarMo29689b = this.f57441e.mo29689b(i);
            if (fzfVarMo29689b.f24302s == fzf.EnumC13593a.UNRESTRICTED) {
                if (fzfVar == null || f > fMo29695h) {
                    boolean zM59657u = m59657u(fzfVarMo29689b, sdaVar);
                    z = zM59657u;
                    f = fMo29695h;
                    fzfVar = fzfVarMo29689b;
                } else if (!z && m59657u(fzfVarMo29689b, sdaVar)) {
                    f = fMo29695h;
                    fzfVar = fzfVarMo29689b;
                    z = true;
                }
            } else if (fzfVar == null && fMo29695h < 0.0f) {
                if (fzfVar2 == null || f2 > fMo29695h) {
                    boolean zM59657u2 = m59657u(fzfVarMo29689b, sdaVar);
                    z2 = zM59657u2;
                    f2 = fMo29695h;
                    fzfVar2 = fzfVarMo29689b;
                } else if (!z2 && m59657u(fzfVarMo29689b, sdaVar)) {
                    f2 = fMo29695h;
                    fzfVar2 = fzfVarMo29689b;
                    z2 = true;
                }
            }
        }
        return fzfVar != null ? fzfVar : fzfVar2;
    }

    @Override // p001o.sda.InterfaceC16812a
    public fzf getKey() {
        return this.f57437a;
    }

    /* renamed from: h */
    public zo0 m59644h(fzf fzfVar, fzf fzfVar2, int i, float f, fzf fzfVar3, fzf fzfVar4, int i2) {
        if (fzfVar2 == fzfVar3) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar4, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57441e.mo29692e(fzfVar3, -1.0f);
            this.f57441e.mo29692e(fzfVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f57438b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f57441e.mo29692e(fzfVar, -1.0f);
            this.f57441e.mo29692e(fzfVar2, 1.0f);
            this.f57438b = i;
        } else if (f >= 1.0f) {
            this.f57441e.mo29692e(fzfVar4, -1.0f);
            this.f57441e.mo29692e(fzfVar3, 1.0f);
            this.f57438b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f57441e.mo29692e(fzfVar, f2 * 1.0f);
            this.f57441e.mo29692e(fzfVar2, f2 * (-1.0f));
            this.f57441e.mo29692e(fzfVar3, (-1.0f) * f);
            this.f57441e.mo29692e(fzfVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f57438b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* renamed from: i */
    public zo0 m59645i(fzf fzfVar, int i) {
        this.f57437a = fzfVar;
        float f = i;
        fzfVar.f24298f = f;
        this.f57438b = f;
        this.f57442f = true;
        return this;
    }

    @Override // p001o.sda.InterfaceC16812a
    public boolean isEmpty() {
        return this.f57437a == null && this.f57438b == 0.0f && this.f57441e.mo29694g() == 0;
    }

    /* renamed from: j */
    public zo0 m59646j(fzf fzfVar, fzf fzfVar2, float f) {
        this.f57441e.mo29692e(fzfVar, -1.0f);
        this.f57441e.mo29692e(fzfVar2, f);
        return this;
    }

    /* renamed from: k */
    public zo0 m59647k(fzf fzfVar, fzf fzfVar2, fzf fzfVar3, fzf fzfVar4, float f) {
        this.f57441e.mo29692e(fzfVar, -1.0f);
        this.f57441e.mo29692e(fzfVar2, 1.0f);
        this.f57441e.mo29692e(fzfVar3, f);
        this.f57441e.mo29692e(fzfVar4, -f);
        return this;
    }

    /* renamed from: l */
    public zo0 m59648l(float f, float f2, float f3, fzf fzfVar, fzf fzfVar2, fzf fzfVar3, fzf fzfVar4) {
        this.f57438b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57441e.mo29692e(fzfVar4, 1.0f);
            this.f57441e.mo29692e(fzfVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f57441e.mo29692e(fzfVar3, 1.0f);
            this.f57441e.mo29692e(fzfVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57441e.mo29692e(fzfVar4, f4);
            this.f57441e.mo29692e(fzfVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public zo0 m59649m(fzf fzfVar, int i) {
        if (i < 0) {
            this.f57438b = i * (-1);
            this.f57441e.mo29692e(fzfVar, 1.0f);
        } else {
            this.f57438b = i;
            this.f57441e.mo29692e(fzfVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public zo0 m59650n(fzf fzfVar, fzf fzfVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f57438b = i;
        }
        if (z) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
        } else {
            this.f57441e.mo29692e(fzfVar, -1.0f);
            this.f57441e.mo29692e(fzfVar2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public zo0 m59651o(fzf fzfVar, fzf fzfVar2, fzf fzfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f57438b = i;
        }
        if (z) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57441e.mo29692e(fzfVar3, -1.0f);
        } else {
            this.f57441e.mo29692e(fzfVar, -1.0f);
            this.f57441e.mo29692e(fzfVar2, 1.0f);
            this.f57441e.mo29692e(fzfVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public zo0 m59652p(fzf fzfVar, fzf fzfVar2, fzf fzfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f57438b = i;
        }
        if (z) {
            this.f57441e.mo29692e(fzfVar, 1.0f);
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57441e.mo29692e(fzfVar3, 1.0f);
        } else {
            this.f57441e.mo29692e(fzfVar, -1.0f);
            this.f57441e.mo29692e(fzfVar2, 1.0f);
            this.f57441e.mo29692e(fzfVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public zo0 m59653q(fzf fzfVar, fzf fzfVar2, fzf fzfVar3, fzf fzfVar4, float f) {
        this.f57441e.mo29692e(fzfVar3, 0.5f);
        this.f57441e.mo29692e(fzfVar4, 0.5f);
        this.f57441e.mo29692e(fzfVar, -0.5f);
        this.f57441e.mo29692e(fzfVar2, -0.5f);
        this.f57438b = -f;
        return this;
    }

    /* renamed from: r */
    public void m59654r() {
        float f = this.f57438b;
        if (f < 0.0f) {
            this.f57438b = f * (-1.0f);
            this.f57441e.mo29691d();
        }
    }

    /* renamed from: s */
    public boolean m59655s() {
        fzf fzfVar = this.f57437a;
        return fzfVar != null && (fzfVar.f24302s == fzf.EnumC13593a.UNRESTRICTED || this.f57438b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m59656t(fzf fzfVar) {
        return this.f57441e.mo29693f(fzfVar);
    }

    public String toString() {
        return m59662z();
    }

    /* renamed from: u */
    public final boolean m59657u(fzf fzfVar, sda sdaVar) {
        return fzfVar.f24288H <= 1;
    }

    /* renamed from: v */
    public fzf m59658v(fzf fzfVar) {
        return m59659w(null, fzfVar);
    }

    /* renamed from: w */
    public final fzf m59659w(boolean[] zArr, fzf fzfVar) {
        fzf.EnumC13593a enumC13593a;
        int iMo29694g = this.f57441e.mo29694g();
        fzf fzfVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo29694g; i++) {
            float fMo29695h = this.f57441e.mo29695h(i);
            if (fMo29695h < 0.0f) {
                fzf fzfVarMo29689b = this.f57441e.mo29689b(i);
                if ((zArr == null || !zArr[fzfVarMo29689b.f24295c]) && fzfVarMo29689b != fzfVar && (((enumC13593a = fzfVarMo29689b.f24302s) == fzf.EnumC13593a.SLACK || enumC13593a == fzf.EnumC13593a.ERROR) && fMo29695h < f)) {
                    f = fMo29695h;
                    fzfVar2 = fzfVarMo29689b;
                }
            }
        }
        return fzfVar2;
    }

    /* renamed from: x */
    public void m59660x(fzf fzfVar) {
        fzf fzfVar2 = this.f57437a;
        if (fzfVar2 != null) {
            this.f57441e.mo29692e(fzfVar2, -1.0f);
            this.f57437a.f24296d = -1;
            this.f57437a = null;
        }
        float fMo29690c = this.f57441e.mo29690c(fzfVar, true) * (-1.0f);
        this.f57437a = fzfVar;
        if (fMo29690c == 1.0f) {
            return;
        }
        this.f57438b /= fMo29690c;
        this.f57441e.mo29698k(fMo29690c);
    }

    /* renamed from: y */
    public void m59661y() {
        this.f57437a = null;
        this.f57441e.clear();
        this.f57438b = 0.0f;
        this.f57442f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m59662z() {
        boolean z;
        String str = (this.f57437a == null ? "0" : "" + this.f57437a) + " = ";
        if (this.f57438b != 0.0f) {
            str = str + this.f57438b;
            z = true;
        } else {
            z = false;
        }
        int iMo29694g = this.f57441e.mo29694g();
        for (int i = 0; i < iMo29694g; i++) {
            fzf fzfVarMo29689b = this.f57441e.mo29689b(i);
            if (fzfVarMo29689b != null) {
                float fMo29695h = this.f57441e.mo29695h(i);
                if (fMo29695h != 0.0f) {
                    String string = fzfVarMo29689b.toString();
                    if (!z) {
                        if (fMo29695h < 0.0f) {
                            str = str + "- ";
                            fMo29695h *= -1.0f;
                        }
                        str = fMo29695h == 1.0f ? str + string : str + fMo29695h + " " + string;
                        z = true;
                    } else if (fMo29695h > 0.0f) {
                        str = str + " + ";
                        if (fMo29695h == 1.0f) {
                        }
                        z = true;
                    } else {
                        str = str + " - ";
                        fMo29695h *= -1.0f;
                        if (fMo29695h == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return str;
        }
        return str + IdManager.DEFAULT_VERSION_NAME;
    }

    public zo0(tr1 tr1Var) {
        this.f57441e = new ro0(this, tr1Var);
    }
}
