package p001o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;
import p001o.zo0;

/* loaded from: classes2.dex */
public class gzf implements zo0.InterfaceC18686a {

    /* renamed from: n */
    public static float f26007n = 0.001f;

    /* renamed from: a */
    public final int f26008a = -1;

    /* renamed from: b */
    public int f26009b = 16;

    /* renamed from: c */
    public int f26010c = 16;

    /* renamed from: d */
    public int[] f26011d = new int[16];

    /* renamed from: e */
    public int[] f26012e = new int[16];

    /* renamed from: f */
    public int[] f26013f = new int[16];

    /* renamed from: g */
    public float[] f26014g = new float[16];

    /* renamed from: h */
    public int[] f26015h = new int[16];

    /* renamed from: i */
    public int[] f26016i = new int[16];

    /* renamed from: j */
    public int f26017j = 0;

    /* renamed from: k */
    public int f26018k = -1;

    /* renamed from: l */
    public final zo0 f26019l;

    /* renamed from: m */
    public final tr1 f26020m;

    public gzf(zo0 zo0Var, tr1 tr1Var) {
        this.f26019l = zo0Var;
        this.f26020m = tr1Var;
        clear();
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: a */
    public float mo29688a(fzf fzfVar) {
        int iM29703p = m29703p(fzfVar);
        if (iM29703p != -1) {
            return this.f26014g[iM29703p];
        }
        return 0.0f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: b */
    public fzf mo29689b(int i) {
        int i2 = this.f26017j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f26018k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f26020m.f47646d[this.f26013f[i3]];
            }
            i3 = this.f26016i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: c */
    public float mo29690c(fzf fzfVar, boolean z) {
        int iM29703p = m29703p(fzfVar);
        if (iM29703p == -1) {
            return 0.0f;
        }
        m29705r(fzfVar);
        float f = this.f26014g[iM29703p];
        if (this.f26018k == iM29703p) {
            this.f26018k = this.f26016i[iM29703p];
        }
        this.f26013f[iM29703p] = -1;
        int[] iArr = this.f26015h;
        int i = iArr[iM29703p];
        if (i != -1) {
            int[] iArr2 = this.f26016i;
            iArr2[i] = iArr2[iM29703p];
        }
        int i2 = this.f26016i[iM29703p];
        if (i2 != -1) {
            iArr[i2] = iArr[iM29703p];
        }
        this.f26017j--;
        fzfVar.f24288H--;
        if (z) {
            fzfVar.m27823e(this.f26019l);
        }
        return f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    public void clear() {
        int i = this.f26017j;
        for (int i2 = 0; i2 < i; i2++) {
            fzf fzfVarMo29689b = mo29689b(i2);
            if (fzfVarMo29689b != null) {
                fzfVarMo29689b.m27823e(this.f26019l);
            }
        }
        for (int i3 = 0; i3 < this.f26009b; i3++) {
            this.f26013f[i3] = -1;
            this.f26012e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f26010c; i4++) {
            this.f26011d[i4] = -1;
        }
        this.f26017j = 0;
        this.f26018k = -1;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: d */
    public void mo29691d() {
        int i = this.f26017j;
        int i2 = this.f26018k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f26014g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f26016i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: e */
    public void mo29692e(fzf fzfVar, float f) {
        float f2 = f26007n;
        if (f > (-f2) && f < f2) {
            mo29690c(fzfVar, true);
            return;
        }
        if (this.f26017j == 0) {
            m29700m(0, fzfVar, f);
            m29699l(fzfVar, 0);
            this.f26018k = 0;
            return;
        }
        int iM29703p = m29703p(fzfVar);
        if (iM29703p != -1) {
            this.f26014g[iM29703p] = f;
            return;
        }
        if (this.f26017j + 1 >= this.f26009b) {
            m29702o();
        }
        int i = this.f26017j;
        int i2 = this.f26018k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f26013f[i2];
            int i6 = fzfVar.f24295c;
            if (i5 == i6) {
                this.f26014g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f26016i[i2];
            if (i2 == -1) {
                break;
            }
        }
        m29704q(i3, fzfVar, f);
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: f */
    public boolean mo29693f(fzf fzfVar) {
        return m29703p(fzfVar) != -1;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: g */
    public int mo29694g() {
        return this.f26017j;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: h */
    public float mo29695h(int i) {
        int i2 = this.f26017j;
        int i3 = this.f26018k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f26014g[i3];
            }
            i3 = this.f26016i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: i */
    public void mo29696i(fzf fzfVar, float f, boolean z) {
        float f2 = f26007n;
        if (f <= (-f2) || f >= f2) {
            int iM29703p = m29703p(fzfVar);
            if (iM29703p == -1) {
                mo29692e(fzfVar, f);
                return;
            }
            float[] fArr = this.f26014g;
            float f3 = fArr[iM29703p] + f;
            fArr[iM29703p] = f3;
            float f4 = f26007n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iM29703p] = 0.0f;
            mo29690c(fzfVar, z);
        }
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: j */
    public float mo29697j(zo0 zo0Var, boolean z) {
        float fMo29688a = mo29688a(zo0Var.f57437a);
        mo29690c(zo0Var.f57437a, z);
        gzf gzfVar = (gzf) zo0Var.f57441e;
        int iMo29694g = gzfVar.mo29694g();
        int i = 0;
        int i2 = 0;
        while (i < iMo29694g) {
            int i3 = gzfVar.f26013f[i2];
            if (i3 != -1) {
                mo29696i(this.f26020m.f47646d[i3], gzfVar.f26014g[i2] * fMo29688a, z);
                i++;
            }
            i2++;
        }
        return fMo29688a;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: k */
    public void mo29698k(float f) {
        int i = this.f26017j;
        int i2 = this.f26018k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f26014g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f26016i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void m29699l(fzf fzfVar, int i) {
        int[] iArr;
        int i2 = fzfVar.f24295c % this.f26010c;
        int[] iArr2 = this.f26011d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f26012e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f26012e[i] = -1;
    }

    /* renamed from: m */
    public final void m29700m(int i, fzf fzfVar, float f) {
        this.f26013f[i] = fzfVar.f24295c;
        this.f26014g[i] = f;
        this.f26015h[i] = -1;
        this.f26016i[i] = -1;
        fzfVar.m27821a(this.f26019l);
        fzfVar.f24288H++;
        this.f26017j++;
    }

    /* renamed from: n */
    public final int m29701n() {
        for (int i = 0; i < this.f26009b; i++) {
            if (this.f26013f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m29702o() {
        int i = this.f26009b * 2;
        this.f26013f = Arrays.copyOf(this.f26013f, i);
        this.f26014g = Arrays.copyOf(this.f26014g, i);
        this.f26015h = Arrays.copyOf(this.f26015h, i);
        this.f26016i = Arrays.copyOf(this.f26016i, i);
        this.f26012e = Arrays.copyOf(this.f26012e, i);
        for (int i2 = this.f26009b; i2 < i; i2++) {
            this.f26013f[i2] = -1;
            this.f26012e[i2] = -1;
        }
        this.f26009b = i;
    }

    /* renamed from: p */
    public int m29703p(fzf fzfVar) {
        if (this.f26017j != 0 && fzfVar != null) {
            int i = fzfVar.f24295c;
            int i2 = this.f26011d[i % this.f26010c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f26013f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f26012e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f26013f[i2] != i);
            if (i2 != -1 && this.f26013f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final void m29704q(int i, fzf fzfVar, float f) {
        int iM29701n = m29701n();
        m29700m(iM29701n, fzfVar, f);
        if (i != -1) {
            this.f26015h[iM29701n] = i;
            int[] iArr = this.f26016i;
            iArr[iM29701n] = iArr[i];
            iArr[i] = iM29701n;
        } else {
            this.f26015h[iM29701n] = -1;
            if (this.f26017j > 0) {
                this.f26016i[iM29701n] = this.f26018k;
                this.f26018k = iM29701n;
            } else {
                this.f26016i[iM29701n] = -1;
            }
        }
        int i2 = this.f26016i[iM29701n];
        if (i2 != -1) {
            this.f26015h[i2] = iM29701n;
        }
        m29699l(fzfVar, iM29701n);
    }

    /* renamed from: r */
    public final void m29705r(fzf fzfVar) {
        int[] iArr;
        int i;
        int i2 = fzfVar.f24295c;
        int i3 = i2 % this.f26010c;
        int[] iArr2 = this.f26011d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f26013f[i4] == i2) {
            int[] iArr3 = this.f26012e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f26012e;
            i = iArr[i4];
            if (i == -1 || this.f26013f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f26013f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f26017j;
        for (int i2 = 0; i2 < i; i2++) {
            fzf fzfVarMo29689b = mo29689b(i2);
            if (fzfVarMo29689b != null) {
                String str2 = str + fzfVarMo29689b + " = " + mo29695h(i2) + " ";
                int iM29703p = m29703p(fzfVarMo29689b);
                String str3 = str2 + "[p: ";
                String str4 = (this.f26015h[iM29703p] != -1 ? str3 + this.f26020m.f47646d[this.f26013f[this.f26015h[iM29703p]]] : str3 + DevicePublicKeyStringDef.NONE) + ", n: ";
                str = (this.f26016i[iM29703p] != -1 ? str4 + this.f26020m.f47646d[this.f26013f[this.f26016i[iM29703p]]] : str4 + DevicePublicKeyStringDef.NONE) + "]";
            }
        }
        return str + " }";
    }
}
