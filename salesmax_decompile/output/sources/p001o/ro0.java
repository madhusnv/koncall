package p001o;

import java.util.Arrays;
import p001o.zo0;

/* loaded from: classes2.dex */
public class ro0 implements zo0.InterfaceC18686a {

    /* renamed from: l */
    public static float f43869l = 0.001f;

    /* renamed from: b */
    public final zo0 f43871b;

    /* renamed from: c */
    public final tr1 f43872c;

    /* renamed from: a */
    public int f43870a = 0;

    /* renamed from: d */
    public int f43873d = 8;

    /* renamed from: e */
    public fzf f43874e = null;

    /* renamed from: f */
    public int[] f43875f = new int[8];

    /* renamed from: g */
    public int[] f43876g = new int[8];

    /* renamed from: h */
    public float[] f43877h = new float[8];

    /* renamed from: i */
    public int f43878i = -1;

    /* renamed from: j */
    public int f43879j = -1;

    /* renamed from: k */
    public boolean f43880k = false;

    public ro0(zo0 zo0Var, tr1 tr1Var) {
        this.f43871b = zo0Var;
        this.f43872c = tr1Var;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: a */
    public final float mo29688a(fzf fzfVar) {
        int i = this.f43878i;
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            if (this.f43875f[i] == fzfVar.f24295c) {
                return this.f43877h[i];
            }
            i = this.f43876g[i];
        }
        return 0.0f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: b */
    public fzf mo29689b(int i) {
        int i2 = this.f43878i;
        for (int i3 = 0; i2 != -1 && i3 < this.f43870a; i3++) {
            if (i3 == i) {
                return this.f43872c.f47646d[this.f43875f[i2]];
            }
            i2 = this.f43876g[i2];
        }
        return null;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: c */
    public final float mo29690c(fzf fzfVar, boolean z) {
        if (this.f43874e == fzfVar) {
            this.f43874e = null;
        }
        int i = this.f43878i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f43870a) {
            if (this.f43875f[i] == fzfVar.f24295c) {
                if (i == this.f43878i) {
                    this.f43878i = this.f43876g[i];
                } else {
                    int[] iArr = this.f43876g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    fzfVar.m27823e(this.f43871b);
                }
                fzfVar.f24288H--;
                this.f43870a--;
                this.f43875f[i] = -1;
                if (this.f43880k) {
                    this.f43879j = i;
                }
                return this.f43877h[i];
            }
            i2++;
            i3 = i;
            i = this.f43876g[i];
        }
        return 0.0f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    public final void clear() {
        int i = this.f43878i;
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            fzf fzfVar = this.f43872c.f47646d[this.f43875f[i]];
            if (fzfVar != null) {
                fzfVar.m27823e(this.f43871b);
            }
            i = this.f43876g[i];
        }
        this.f43878i = -1;
        this.f43879j = -1;
        this.f43880k = false;
        this.f43870a = 0;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: d */
    public void mo29691d() {
        int i = this.f43878i;
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            float[] fArr = this.f43877h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f43876g[i];
        }
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: e */
    public final void mo29692e(fzf fzfVar, float f) {
        if (f == 0.0f) {
            mo29690c(fzfVar, true);
            return;
        }
        int i = this.f43878i;
        if (i == -1) {
            this.f43878i = 0;
            this.f43877h[0] = f;
            this.f43875f[0] = fzfVar.f24295c;
            this.f43876g[0] = -1;
            fzfVar.f24288H++;
            fzfVar.m27821a(this.f43871b);
            this.f43870a++;
            if (this.f43880k) {
                return;
            }
            int i2 = this.f43879j + 1;
            this.f43879j = i2;
            int[] iArr = this.f43875f;
            if (i2 >= iArr.length) {
                this.f43880k = true;
                this.f43879j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f43870a; i4++) {
            int i5 = this.f43875f[i];
            int i6 = fzfVar.f24295c;
            if (i5 == i6) {
                this.f43877h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f43876g[i];
        }
        int length = this.f43879j;
        int i7 = length + 1;
        if (this.f43880k) {
            int[] iArr2 = this.f43875f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f43875f;
        if (length >= iArr3.length && this.f43870a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f43875f;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f43875f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f43873d * 2;
            this.f43873d = i9;
            this.f43880k = false;
            this.f43879j = length - 1;
            this.f43877h = Arrays.copyOf(this.f43877h, i9);
            this.f43875f = Arrays.copyOf(this.f43875f, this.f43873d);
            this.f43876g = Arrays.copyOf(this.f43876g, this.f43873d);
        }
        this.f43875f[length] = fzfVar.f24295c;
        this.f43877h[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f43876g;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f43876g[length] = this.f43878i;
            this.f43878i = length;
        }
        fzfVar.f24288H++;
        fzfVar.m27821a(this.f43871b);
        int i10 = this.f43870a + 1;
        this.f43870a = i10;
        if (!this.f43880k) {
            this.f43879j++;
        }
        int[] iArr7 = this.f43875f;
        if (i10 >= iArr7.length) {
            this.f43880k = true;
        }
        if (this.f43879j >= iArr7.length) {
            this.f43880k = true;
            this.f43879j = iArr7.length - 1;
        }
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: f */
    public boolean mo29693f(fzf fzfVar) {
        int i = this.f43878i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            if (this.f43875f[i] == fzfVar.f24295c) {
                return true;
            }
            i = this.f43876g[i];
        }
        return false;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: g */
    public int mo29694g() {
        return this.f43870a;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: h */
    public float mo29695h(int i) {
        int i2 = this.f43878i;
        for (int i3 = 0; i2 != -1 && i3 < this.f43870a; i3++) {
            if (i3 == i) {
                return this.f43877h[i2];
            }
            i2 = this.f43876g[i2];
        }
        return 0.0f;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: i */
    public void mo29696i(fzf fzfVar, float f, boolean z) {
        float f2 = f43869l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f43878i;
            if (i == -1) {
                this.f43878i = 0;
                this.f43877h[0] = f;
                this.f43875f[0] = fzfVar.f24295c;
                this.f43876g[0] = -1;
                fzfVar.f24288H++;
                fzfVar.m27821a(this.f43871b);
                this.f43870a++;
                if (this.f43880k) {
                    return;
                }
                int i2 = this.f43879j + 1;
                this.f43879j = i2;
                int[] iArr = this.f43875f;
                if (i2 >= iArr.length) {
                    this.f43880k = true;
                    this.f43879j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f43870a; i4++) {
                int i5 = this.f43875f[i];
                int i6 = fzfVar.f24295c;
                if (i5 == i6) {
                    float[] fArr = this.f43877h;
                    float f3 = fArr[i] + f;
                    float f4 = f43869l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f43878i) {
                            this.f43878i = this.f43876g[i];
                        } else {
                            int[] iArr2 = this.f43876g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            fzfVar.m27823e(this.f43871b);
                        }
                        if (this.f43880k) {
                            this.f43879j = i;
                        }
                        fzfVar.f24288H--;
                        this.f43870a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f43876g[i];
            }
            int length = this.f43879j;
            int i7 = length + 1;
            if (this.f43880k) {
                int[] iArr3 = this.f43875f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f43875f;
            if (length >= iArr4.length && this.f43870a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f43875f;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f43875f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f43873d * 2;
                this.f43873d = i9;
                this.f43880k = false;
                this.f43879j = length - 1;
                this.f43877h = Arrays.copyOf(this.f43877h, i9);
                this.f43875f = Arrays.copyOf(this.f43875f, this.f43873d);
                this.f43876g = Arrays.copyOf(this.f43876g, this.f43873d);
            }
            this.f43875f[length] = fzfVar.f24295c;
            this.f43877h[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f43876g;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f43876g[length] = this.f43878i;
                this.f43878i = length;
            }
            fzfVar.f24288H++;
            fzfVar.m27821a(this.f43871b);
            this.f43870a++;
            if (!this.f43880k) {
                this.f43879j++;
            }
            int i10 = this.f43879j;
            int[] iArr8 = this.f43875f;
            if (i10 >= iArr8.length) {
                this.f43880k = true;
                this.f43879j = iArr8.length - 1;
            }
        }
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: j */
    public float mo29697j(zo0 zo0Var, boolean z) {
        float fMo29688a = mo29688a(zo0Var.f57437a);
        mo29690c(zo0Var.f57437a, z);
        zo0.InterfaceC18686a interfaceC18686a = zo0Var.f57441e;
        int iMo29694g = interfaceC18686a.mo29694g();
        for (int i = 0; i < iMo29694g; i++) {
            fzf fzfVarMo29689b = interfaceC18686a.mo29689b(i);
            mo29696i(fzfVarMo29689b, interfaceC18686a.mo29688a(fzfVarMo29689b) * fMo29688a, z);
        }
        return fMo29688a;
    }

    @Override // p001o.zo0.InterfaceC18686a
    /* renamed from: k */
    public void mo29698k(float f) {
        int i = this.f43878i;
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            float[] fArr = this.f43877h;
            fArr[i] = fArr[i] / f;
            i = this.f43876g[i];
        }
    }

    public String toString() {
        int i = this.f43878i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f43870a; i2++) {
            str = ((str + " -> ") + this.f43877h[i] + " : ") + this.f43872c.f47646d[this.f43875f[i]];
            i = this.f43876g[i];
        }
        return str;
    }
}
