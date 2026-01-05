package j5;

import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.j */
/* loaded from: classes.dex */
public final class C3593j implements InterfaceC3585b {

    /* renamed from: a */
    public int f19203a = 16;

    /* renamed from: b */
    public final int[] f19204b = new int[16];

    /* renamed from: c */
    public int[] f19205c = new int[16];

    /* renamed from: d */
    public int[] f19206d = new int[16];

    /* renamed from: e */
    public float[] f19207e = new float[16];

    /* renamed from: f */
    public int[] f19208f = new int[16];

    /* renamed from: g */
    public int[] f19209g = new int[16];

    /* renamed from: h */
    public int f19210h = 0;

    /* renamed from: i */
    public int f19211i = -1;

    /* renamed from: j */
    public final C3587d f19212j;

    /* renamed from: k */
    public final C0919n f19213k;

    public C3593j(C3587d c3587d, C0919n c0919n) {
        this.f19212j = c3587d;
        this.f19213k = c0919n;
        clear();
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: a */
    public final boolean mo8108a(C3592i c3592i) {
        return m8157m(c3592i) != -1;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: b */
    public final int mo8109b() {
        return this.f19210h;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: c */
    public final float mo8110c(C3592i c3592i) {
        int iM8157m = m8157m(c3592i);
        return iM8157m != -1 ? this.f19207e[iM8157m] : DefinitionKt.NO_Float_VALUE;
    }

    @Override // j5.InterfaceC3585b
    public final void clear() {
        int i10 = this.f19210h;
        for (int i11 = 0; i11 < i10; i11++) {
            C3592i c3592iMo8112e = mo8112e(i11);
            if (c3592iMo8112e != null) {
                c3592iMo8112e.m8152b(this.f19212j);
            }
        }
        for (int i12 = 0; i12 < this.f19203a; i12++) {
            this.f19206d[i12] = -1;
            this.f19205c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f19204b[i13] = -1;
        }
        this.f19210h = 0;
        this.f19211i = -1;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: d */
    public final float mo8111d(C3592i c3592i, boolean z6) {
        int[] iArr;
        int i10;
        int iM8157m = m8157m(c3592i);
        if (iM8157m == -1) {
            return DefinitionKt.NO_Float_VALUE;
        }
        int i11 = c3592i.f19192b;
        int i12 = i11 % 16;
        int[] iArr2 = this.f19204b;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f19206d[i13] == i11) {
                int[] iArr3 = this.f19205c;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
            } else {
                while (true) {
                    iArr = this.f19205c;
                    i10 = iArr[i13];
                    if (i10 == -1 || this.f19206d[i10] == i11) {
                        break;
                    }
                    i13 = i10;
                }
                if (i10 != -1 && this.f19206d[i10] == i11) {
                    iArr[i13] = iArr[i10];
                    iArr[i10] = -1;
                }
            }
        }
        float f6 = this.f19207e[iM8157m];
        if (this.f19211i == iM8157m) {
            this.f19211i = this.f19209g[iM8157m];
        }
        this.f19206d[iM8157m] = -1;
        int[] iArr4 = this.f19208f;
        int i14 = iArr4[iM8157m];
        if (i14 != -1) {
            int[] iArr5 = this.f19209g;
            iArr5[i14] = iArr5[iM8157m];
        }
        int i15 = this.f19209g[iM8157m];
        if (i15 != -1) {
            iArr4[i15] = iArr4[iM8157m];
        }
        this.f19210h--;
        c3592i.f19202l--;
        if (z6) {
            c3592i.m8152b(this.f19212j);
        }
        return f6;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: e */
    public final C3592i mo8112e(int i10) {
        int i11 = this.f19210h;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f19211i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return ((C3592i[]) this.f19213k.f5601d)[this.f19206d[i12]];
            }
            i12 = this.f19209g[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: f */
    public final void mo8113f(C3592i c3592i, float f6) {
        if (f6 > -0.001f && f6 < 0.001f) {
            mo8111d(c3592i, true);
            return;
        }
        int i10 = 0;
        if (this.f19210h == 0) {
            m8156l(0, c3592i, f6);
            m8155k(c3592i, 0);
            this.f19211i = 0;
            return;
        }
        int iM8157m = m8157m(c3592i);
        if (iM8157m != -1) {
            this.f19207e[iM8157m] = f6;
            return;
        }
        int i11 = this.f19210h + 1;
        int i12 = this.f19203a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f19206d = Arrays.copyOf(this.f19206d, i13);
            this.f19207e = Arrays.copyOf(this.f19207e, i13);
            this.f19208f = Arrays.copyOf(this.f19208f, i13);
            this.f19209g = Arrays.copyOf(this.f19209g, i13);
            this.f19205c = Arrays.copyOf(this.f19205c, i13);
            for (int i14 = this.f19203a; i14 < i13; i14++) {
                this.f19206d[i14] = -1;
                this.f19205c[i14] = -1;
            }
            this.f19203a = i13;
        }
        int i15 = this.f19210h;
        int i16 = this.f19211i;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f19206d[i16];
            int i20 = c3592i.f19192b;
            if (i19 == i20) {
                this.f19207e[i16] = f6;
                return;
            }
            if (i19 < i20) {
                i17 = i16;
            }
            i16 = this.f19209g[i16];
            if (i16 == -1) {
                break;
            }
        }
        while (true) {
            if (i10 >= this.f19203a) {
                i10 = -1;
                break;
            } else if (this.f19206d[i10] == -1) {
                break;
            } else {
                i10++;
            }
        }
        m8156l(i10, c3592i, f6);
        if (i17 != -1) {
            this.f19208f[i10] = i17;
            int[] iArr = this.f19209g;
            iArr[i10] = iArr[i17];
            iArr[i17] = i10;
        } else {
            this.f19208f[i10] = -1;
            if (this.f19210h > 0) {
                this.f19209g[i10] = this.f19211i;
                this.f19211i = i10;
            } else {
                this.f19209g[i10] = -1;
            }
        }
        int i21 = this.f19209g[i10];
        if (i21 != -1) {
            this.f19208f[i21] = i10;
        }
        m8155k(c3592i, i10);
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: g */
    public final void mo8114g(C3592i c3592i, float f6, boolean z6) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int iM8157m = m8157m(c3592i);
            if (iM8157m == -1) {
                mo8113f(c3592i, f6);
                return;
            }
            float[] fArr = this.f19207e;
            float f10 = fArr[iM8157m] + f6;
            fArr[iM8157m] = f10;
            if (f10 <= -0.001f || f10 >= 0.001f) {
                return;
            }
            fArr[iM8157m] = 0.0f;
            mo8111d(c3592i, z6);
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: h */
    public final float mo8115h(int i10) {
        int i11 = this.f19210h;
        int i12 = this.f19211i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f19207e[i12];
            }
            i12 = this.f19209g[i12];
            if (i12 == -1) {
                return DefinitionKt.NO_Float_VALUE;
            }
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: i */
    public final float mo8116i(C3586c c3586c, boolean z6) {
        float fMo8110c = mo8110c(c3586c.f19164a);
        mo8111d(c3586c.f19164a, z6);
        C3593j c3593j = (C3593j) c3586c.f19167d;
        int i10 = c3593j.f19210h;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = c3593j.f19206d[i12];
            if (i13 != -1) {
                mo8114g(((C3592i[]) this.f19213k.f5601d)[i13], c3593j.f19207e[i12] * fMo8110c, z6);
                i11++;
            }
            i12++;
        }
        return fMo8110c;
    }

    @Override // j5.InterfaceC3585b
    public final void invert() {
        int i10 = this.f19210h;
        int i11 = this.f19211i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f19207e;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f19209g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: j */
    public final void mo8117j(float f6) {
        int i10 = this.f19210h;
        int i11 = this.f19211i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f19207e;
            fArr[i11] = fArr[i11] / f6;
            i11 = this.f19209g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m8155k(C3592i c3592i, int i10) {
        int[] iArr;
        int i11 = c3592i.f19192b % 16;
        int[] iArr2 = this.f19204b;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f19205c;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f19205c[i10] = -1;
    }

    /* renamed from: l */
    public final void m8156l(int i10, C3592i c3592i, float f6) {
        this.f19206d[i10] = c3592i.f19192b;
        this.f19207e[i10] = f6;
        this.f19208f[i10] = -1;
        this.f19209g[i10] = -1;
        c3592i.m8151a(this.f19212j);
        c3592i.f19202l++;
        this.f19210h++;
    }

    /* renamed from: m */
    public final int m8157m(C3592i c3592i) {
        if (this.f19210h == 0) {
            return -1;
        }
        int i10 = c3592i.f19192b;
        int i11 = this.f19204b[i10 % 16];
        if (i11 == -1) {
            return -1;
        }
        if (this.f19206d[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f19205c[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f19206d[i11] != i10);
        if (i11 != -1 && this.f19206d[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public final String toString() {
        String strM4561h;
        String strM4561h2;
        String strM4561h3 = hashCode() + " { ";
        int i10 = this.f19210h;
        for (int i11 = 0; i11 < i10; i11++) {
            C3592i c3592iMo8112e = mo8112e(i11);
            if (c3592iMo8112e != null) {
                String str = strM4561h3 + c3592iMo8112e + " = " + mo8115h(i11) + " ";
                int iM8157m = m8157m(c3592iMo8112e);
                String strM4561h4 = AbstractC1452a.m4561h(str, "[p: ");
                int i12 = this.f19208f[iM8157m];
                C0919n c0919n = this.f19213k;
                if (i12 != -1) {
                    StringBuilder sbM4568o = AbstractC1452a.m4568o(strM4561h4);
                    sbM4568o.append(((C3592i[]) c0919n.f5601d)[this.f19206d[this.f19208f[iM8157m]]]);
                    strM4561h = sbM4568o.toString();
                } else {
                    strM4561h = AbstractC1452a.m4561h(strM4561h4, "none");
                }
                String strM4561h5 = AbstractC1452a.m4561h(strM4561h, ", n: ");
                if (this.f19209g[iM8157m] != -1) {
                    StringBuilder sbM4568o2 = AbstractC1452a.m4568o(strM4561h5);
                    sbM4568o2.append(((C3592i[]) c0919n.f5601d)[this.f19206d[this.f19209g[iM8157m]]]);
                    strM4561h2 = sbM4568o2.toString();
                } else {
                    strM4561h2 = AbstractC1452a.m4561h(strM4561h5, "none");
                }
                strM4561h3 = AbstractC1452a.m4561h(strM4561h2, "]");
            }
        }
        return AbstractC1452a.m4561h(strM4561h3, " }");
    }
}
