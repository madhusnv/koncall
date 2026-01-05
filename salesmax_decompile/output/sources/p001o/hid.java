package p001o;

import java.util.Arrays;
import java.util.Comparator;
import p001o.zo0;

/* loaded from: classes2.dex */
public class hid extends zo0 {

    /* renamed from: g */
    public int f27027g;

    /* renamed from: h */
    public fzf[] f27028h;

    /* renamed from: i */
    public fzf[] f27029i;

    /* renamed from: j */
    public int f27030j;

    /* renamed from: k */
    public C13978b f27031k;

    /* renamed from: l */
    public tr1 f27032l;

    /* renamed from: o.hid$a */
    public class C13977a implements Comparator {
        public C13977a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(fzf fzfVar, fzf fzfVar2) {
            return fzfVar.f24295c - fzfVar2.f24295c;
        }
    }

    /* renamed from: o.hid$b */
    public class C13978b {

        /* renamed from: a */
        public fzf f27034a;

        /* renamed from: b */
        public hid f27035b;

        public C13978b(hid hidVar) {
            this.f27035b = hidVar;
        }

        /* renamed from: a */
        public boolean m30644a(fzf fzfVar, float f) {
            boolean z = true;
            if (!this.f27034a.f24293a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = fzfVar.f24301q[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f27034a.f24301q[i] = f3;
                    } else {
                        this.f27034a.f24301q[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f27034a.f24301q;
                float f4 = fArr[i2] + (fzfVar.f24301q[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f27034a.f24301q[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                hid.this.m30640G(this.f27034a);
            }
            return false;
        }

        /* renamed from: b */
        public void m30645b(fzf fzfVar) {
            this.f27034a = fzfVar;
        }

        /* renamed from: c */
        public final boolean m30646c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f27034a.f24301q[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m30647d(fzf fzfVar) {
            for (int i = 8; i >= 0; i--) {
                float f = fzfVar.f24301q[i];
                float f2 = this.f27034a.f24301q[i];
                if (f2 != f) {
                    return f2 < f;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m30648e() {
            Arrays.fill(this.f27034a.f24301q, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f27034a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f27034a.f24301q[i] + " ";
                }
            }
            return str + "] " + this.f27034a;
        }
    }

    public hid(tr1 tr1Var) {
        super(tr1Var);
        this.f27027g = 128;
        this.f27028h = new fzf[128];
        this.f27029i = new fzf[128];
        this.f27030j = 0;
        this.f27031k = new C13978b(this);
        this.f27032l = tr1Var;
    }

    @Override // p001o.zo0
    /* renamed from: B */
    public void mo30638B(sda sdaVar, zo0 zo0Var, boolean z) {
        fzf fzfVar = zo0Var.f57437a;
        if (fzfVar == null) {
            return;
        }
        zo0.InterfaceC18686a interfaceC18686a = zo0Var.f57441e;
        int iMo29694g = interfaceC18686a.mo29694g();
        for (int i = 0; i < iMo29694g; i++) {
            fzf fzfVarMo29689b = interfaceC18686a.mo29689b(i);
            float fMo29695h = interfaceC18686a.mo29695h(i);
            this.f27031k.m30645b(fzfVarMo29689b);
            if (this.f27031k.m30644a(fzfVar, fMo29695h)) {
                m30639F(fzfVarMo29689b);
            }
            this.f57438b += zo0Var.f57438b * fMo29695h;
        }
        m30640G(fzfVar);
    }

    /* renamed from: F */
    public final void m30639F(fzf fzfVar) {
        int i;
        int i2 = this.f27030j + 1;
        fzf[] fzfVarArr = this.f27028h;
        if (i2 > fzfVarArr.length) {
            fzf[] fzfVarArr2 = (fzf[]) Arrays.copyOf(fzfVarArr, fzfVarArr.length * 2);
            this.f27028h = fzfVarArr2;
            this.f27029i = (fzf[]) Arrays.copyOf(fzfVarArr2, fzfVarArr2.length * 2);
        }
        fzf[] fzfVarArr3 = this.f27028h;
        int i3 = this.f27030j;
        fzfVarArr3[i3] = fzfVar;
        int i4 = i3 + 1;
        this.f27030j = i4;
        if (i4 > 1 && fzfVarArr3[i4 - 1].f24295c > fzfVar.f24295c) {
            int i5 = 0;
            while (true) {
                i = this.f27030j;
                if (i5 >= i) {
                    break;
                }
                this.f27029i[i5] = this.f27028h[i5];
                i5++;
            }
            Arrays.sort(this.f27029i, 0, i, new C13977a());
            for (int i6 = 0; i6 < this.f27030j; i6++) {
                this.f27028h[i6] = this.f27029i[i6];
            }
        }
        fzfVar.f24293a = true;
        fzfVar.m27821a(this);
    }

    /* renamed from: G */
    public final void m30640G(fzf fzfVar) {
        int i = 0;
        while (i < this.f27030j) {
            if (this.f27028h[i] == fzfVar) {
                while (true) {
                    int i2 = this.f27030j;
                    if (i >= i2 - 1) {
                        this.f27030j = i2 - 1;
                        fzfVar.f24293a = false;
                        return;
                    } else {
                        fzf[] fzfVarArr = this.f27028h;
                        int i3 = i + 1;
                        fzfVarArr[i] = fzfVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // p001o.zo0, p001o.sda.InterfaceC16812a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fzf mo30641a(sda sdaVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f27030j; i2++) {
            fzf fzfVar = this.f27028h[i2];
            if (!zArr[fzfVar.f24295c]) {
                this.f27031k.m30645b(fzfVar);
                if (i == -1) {
                    if (this.f27031k.m30646c()) {
                        i = i2;
                    }
                } else if (this.f27031k.m30647d(this.f27028h[i])) {
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f27028h[i];
    }

    @Override // p001o.zo0, p001o.sda.InterfaceC16812a
    /* renamed from: c */
    public void mo30642c(fzf fzfVar) {
        this.f27031k.m30645b(fzfVar);
        this.f27031k.m30648e();
        fzfVar.f24301q[fzfVar.f24297e] = 1.0f;
        m30639F(fzfVar);
    }

    @Override // p001o.zo0, p001o.sda.InterfaceC16812a
    public void clear() {
        this.f27030j = 0;
        this.f57438b = 0.0f;
    }

    @Override // p001o.zo0, p001o.sda.InterfaceC16812a
    public boolean isEmpty() {
        return this.f27030j == 0;
    }

    @Override // p001o.zo0
    public String toString() {
        String str = " goal -> (" + this.f57438b + ") : ";
        for (int i = 0; i < this.f27030j; i++) {
            this.f27031k.m30645b(this.f27028h[i]);
            str = str + this.f27031k + " ";
        }
        return str;
    }
}
