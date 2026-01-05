package j5;

import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import ug.C7439j;
import z4.C8863a;
import z4.C8867e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.a */
/* loaded from: classes.dex */
public final class C3584a implements InterfaceC3585b {

    /* renamed from: a */
    public final /* synthetic */ int f19153a;

    /* renamed from: b */
    public int f19154b;

    /* renamed from: c */
    public int f19155c;

    /* renamed from: d */
    public int[] f19156d;

    /* renamed from: e */
    public int[] f19157e;

    /* renamed from: f */
    public float[] f19158f;

    /* renamed from: g */
    public int f19159g;

    /* renamed from: h */
    public int f19160h;

    /* renamed from: i */
    public boolean f19161i;

    /* renamed from: j */
    public final Object f19162j;

    /* renamed from: k */
    public final Object f19163k;

    public C3584a(C3586c c3586c, C0919n c0919n) {
        this.f19153a = 0;
        this.f19154b = 0;
        this.f19155c = 8;
        this.f19156d = new int[8];
        this.f19157e = new int[8];
        this.f19158f = new float[8];
        this.f19159g = -1;
        this.f19160h = -1;
        this.f19161i = false;
        this.f19162j = c3586c;
        this.f19163k = c0919n;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: a */
    public boolean mo8108a(C3592i c3592i) {
        int i10 = this.f19159g;
        if (i10 != -1) {
            for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
                if (this.f19156d[i10] == c3592i.f19192b) {
                    return true;
                }
                i10 = this.f19157e[i10];
            }
        }
        return false;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: b */
    public final int mo8109b() {
        switch (this.f19153a) {
        }
        return this.f19154b;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: c */
    public float mo8110c(C3592i c3592i) {
        int i10 = this.f19159g;
        for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
            if (this.f19156d[i10] == c3592i.f19192b) {
                return this.f19158f[i10];
            }
            i10 = this.f19157e[i10];
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    @Override // j5.InterfaceC3585b
    public final void clear() {
        switch (this.f19153a) {
            case 0:
                int i10 = this.f19159g;
                for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
                    C3592i c3592i = ((C3592i[]) ((C0919n) this.f19163k).f5601d)[this.f19156d[i10]];
                    if (c3592i != null) {
                        c3592i.m8152b((C3586c) this.f19162j);
                    }
                    i10 = this.f19157e[i10];
                }
                this.f19159g = -1;
                this.f19160h = -1;
                this.f19161i = false;
                this.f19154b = 0;
                break;
            default:
                int i12 = this.f19159g;
                for (int i13 = 0; i12 != -1 && i13 < this.f19154b; i13++) {
                    C8867e c8867e = ((C8867e[]) ((C7439j) this.f19163k).f35539d)[this.f19156d[i12]];
                    if (c8867e != null) {
                        c8867e.m16370b((C8863a) this.f19162j);
                    }
                    i12 = this.f19157e[i12];
                }
                this.f19159g = -1;
                this.f19160h = -1;
                this.f19161i = false;
                this.f19154b = 0;
                break;
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: d */
    public float mo8111d(C3592i c3592i, boolean z6) {
        int i10 = this.f19159g;
        if (i10 == -1) {
            return DefinitionKt.NO_Float_VALUE;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f19154b) {
            if (this.f19156d[i10] == c3592i.f19192b) {
                if (i10 == this.f19159g) {
                    this.f19159g = this.f19157e[i10];
                } else {
                    int[] iArr = this.f19157e;
                    iArr[i12] = iArr[i10];
                }
                if (z6) {
                    c3592i.m8152b((C3586c) this.f19162j);
                }
                c3592i.f19202l--;
                this.f19154b--;
                this.f19156d[i10] = -1;
                if (this.f19161i) {
                    this.f19160h = i10;
                }
                return this.f19158f[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f19157e[i10];
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: e */
    public C3592i mo8112e(int i10) {
        int i11 = this.f19159g;
        for (int i12 = 0; i11 != -1 && i12 < this.f19154b; i12++) {
            if (i12 == i10) {
                return ((C3592i[]) ((C0919n) this.f19163k).f5601d)[this.f19156d[i11]];
            }
            i11 = this.f19157e[i11];
        }
        return null;
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: f */
    public void mo8113f(C3592i c3592i, float f6) {
        C3586c c3586c = (C3586c) this.f19162j;
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            mo8111d(c3592i, true);
            return;
        }
        int i10 = this.f19159g;
        if (i10 == -1) {
            this.f19159g = 0;
            this.f19158f[0] = f6;
            this.f19156d[0] = c3592i.f19192b;
            this.f19157e[0] = -1;
            c3592i.f19202l++;
            c3592i.m8151a(c3586c);
            this.f19154b++;
            if (this.f19161i) {
                return;
            }
            int i11 = this.f19160h + 1;
            this.f19160h = i11;
            int[] iArr = this.f19156d;
            if (i11 >= iArr.length) {
                this.f19161i = true;
                this.f19160h = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f19154b; i13++) {
            int i14 = this.f19156d[i10];
            int i15 = c3592i.f19192b;
            if (i14 == i15) {
                this.f19158f[i10] = f6;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f19157e[i10];
        }
        int length = this.f19160h;
        int i16 = length + 1;
        if (this.f19161i) {
            int[] iArr2 = this.f19156d;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f19156d;
        if (length >= iArr3.length && this.f19154b < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f19156d;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f19156d;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f19155c * 2;
            this.f19155c = i18;
            this.f19161i = false;
            this.f19160h = length - 1;
            this.f19158f = Arrays.copyOf(this.f19158f, i18);
            this.f19156d = Arrays.copyOf(this.f19156d, this.f19155c);
            this.f19157e = Arrays.copyOf(this.f19157e, this.f19155c);
        }
        this.f19156d[length] = c3592i.f19192b;
        this.f19158f[length] = f6;
        if (i12 != -1) {
            int[] iArr6 = this.f19157e;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f19157e[length] = this.f19159g;
            this.f19159g = length;
        }
        c3592i.f19202l++;
        c3592i.m8151a(c3586c);
        int i19 = this.f19154b + 1;
        this.f19154b = i19;
        if (!this.f19161i) {
            this.f19160h++;
        }
        int[] iArr7 = this.f19156d;
        if (i19 >= iArr7.length) {
            this.f19161i = true;
        }
        if (this.f19160h >= iArr7.length) {
            this.f19161i = true;
            this.f19160h = iArr7.length - 1;
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: g */
    public void mo8114g(C3592i c3592i, float f6, boolean z6) {
        C3586c c3586c = (C3586c) this.f19162j;
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i10 = this.f19159g;
            if (i10 == -1) {
                this.f19159g = 0;
                this.f19158f[0] = f6;
                this.f19156d[0] = c3592i.f19192b;
                this.f19157e[0] = -1;
                c3592i.f19202l++;
                c3592i.m8151a(c3586c);
                this.f19154b++;
                if (this.f19161i) {
                    return;
                }
                int i11 = this.f19160h + 1;
                this.f19160h = i11;
                int[] iArr = this.f19156d;
                if (i11 >= iArr.length) {
                    this.f19161i = true;
                    this.f19160h = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f19154b; i13++) {
                int i14 = this.f19156d[i10];
                int i15 = c3592i.f19192b;
                if (i14 == i15) {
                    float[] fArr = this.f19158f;
                    float f10 = fArr[i10] + f6;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == DefinitionKt.NO_Float_VALUE) {
                        if (i10 == this.f19159g) {
                            this.f19159g = this.f19157e[i10];
                        } else {
                            int[] iArr2 = this.f19157e;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z6) {
                            c3592i.m8152b(c3586c);
                        }
                        if (this.f19161i) {
                            this.f19160h = i10;
                        }
                        c3592i.f19202l--;
                        this.f19154b--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f19157e[i10];
            }
            int length = this.f19160h;
            int i16 = length + 1;
            if (this.f19161i) {
                int[] iArr3 = this.f19156d;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f19156d;
            if (length >= iArr4.length && this.f19154b < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f19156d;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f19156d;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f19155c * 2;
                this.f19155c = i18;
                this.f19161i = false;
                this.f19160h = length - 1;
                this.f19158f = Arrays.copyOf(this.f19158f, i18);
                this.f19156d = Arrays.copyOf(this.f19156d, this.f19155c);
                this.f19157e = Arrays.copyOf(this.f19157e, this.f19155c);
            }
            this.f19156d[length] = c3592i.f19192b;
            this.f19158f[length] = f6;
            if (i12 != -1) {
                int[] iArr7 = this.f19157e;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f19157e[length] = this.f19159g;
                this.f19159g = length;
            }
            c3592i.f19202l++;
            c3592i.m8151a(c3586c);
            this.f19154b++;
            if (!this.f19161i) {
                this.f19160h++;
            }
            int i19 = this.f19160h;
            int[] iArr8 = this.f19156d;
            if (i19 >= iArr8.length) {
                this.f19161i = true;
                this.f19160h = iArr8.length - 1;
            }
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: h */
    public final float mo8115h(int i10) {
        switch (this.f19153a) {
            case 0:
                int i11 = this.f19159g;
                for (int i12 = 0; i11 != -1 && i12 < this.f19154b; i12++) {
                    if (i12 == i10) {
                        return this.f19158f[i11];
                    }
                    i11 = this.f19157e[i11];
                }
                return DefinitionKt.NO_Float_VALUE;
            default:
                int i13 = this.f19159g;
                for (int i14 = 0; i13 != -1 && i14 < this.f19154b; i14++) {
                    if (i14 == i10) {
                        return this.f19158f[i13];
                    }
                    i13 = this.f19157e[i13];
                }
                return DefinitionKt.NO_Float_VALUE;
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: i */
    public float mo8116i(C3586c c3586c, boolean z6) {
        float fMo8110c = mo8110c(c3586c.f19164a);
        mo8111d(c3586c.f19164a, z6);
        InterfaceC3585b interfaceC3585b = c3586c.f19167d;
        int iMo8109b = interfaceC3585b.mo8109b();
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            C3592i c3592iMo8112e = interfaceC3585b.mo8112e(i10);
            mo8114g(c3592iMo8112e, interfaceC3585b.mo8110c(c3592iMo8112e) * fMo8110c, z6);
        }
        return fMo8110c;
    }

    @Override // j5.InterfaceC3585b
    public final void invert() {
        switch (this.f19153a) {
            case 0:
                int i10 = this.f19159g;
                for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
                    float[] fArr = this.f19158f;
                    fArr[i10] = fArr[i10] * (-1.0f);
                    i10 = this.f19157e[i10];
                }
            default:
                int i12 = this.f19159g;
                for (int i13 = 0; i12 != -1 && i13 < this.f19154b; i13++) {
                    float[] fArr2 = this.f19158f;
                    fArr2[i12] = fArr2[i12] * (-1.0f);
                    i12 = this.f19157e[i12];
                }
        }
    }

    @Override // j5.InterfaceC3585b
    /* renamed from: j */
    public final void mo8117j(float f6) {
        switch (this.f19153a) {
            case 0:
                int i10 = this.f19159g;
                for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
                    float[] fArr = this.f19158f;
                    fArr[i10] = fArr[i10] / f6;
                    i10 = this.f19157e[i10];
                }
            default:
                int i12 = this.f19159g;
                for (int i13 = 0; i12 != -1 && i13 < this.f19154b; i13++) {
                    float[] fArr2 = this.f19158f;
                    fArr2[i12] = fArr2[i12] / f6;
                    i12 = this.f19157e[i12];
                }
        }
    }

    /* renamed from: k */
    public void m8118k(C8867e c8867e, float f6, boolean z6) {
        C8863a c8863a = (C8863a) this.f19162j;
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i10 = this.f19159g;
            if (i10 == -1) {
                this.f19159g = 0;
                this.f19158f[0] = f6;
                this.f19156d[0] = c8867e.f42671b;
                this.f19157e[0] = -1;
                c8867e.f42681m++;
                c8867e.m16369a(c8863a);
                this.f19154b++;
                if (this.f19161i) {
                    return;
                }
                int i11 = this.f19160h + 1;
                this.f19160h = i11;
                int[] iArr = this.f19156d;
                if (i11 >= iArr.length) {
                    this.f19161i = true;
                    this.f19160h = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f19154b; i13++) {
                int i14 = this.f19156d[i10];
                int i15 = c8867e.f42671b;
                if (i14 == i15) {
                    float[] fArr = this.f19158f;
                    float f10 = fArr[i10] + f6;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == DefinitionKt.NO_Float_VALUE) {
                        if (i10 == this.f19159g) {
                            this.f19159g = this.f19157e[i10];
                        } else {
                            int[] iArr2 = this.f19157e;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z6) {
                            c8867e.m16370b(c8863a);
                        }
                        if (this.f19161i) {
                            this.f19160h = i10;
                        }
                        c8867e.f42681m--;
                        this.f19154b--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f19157e[i10];
            }
            int length = this.f19160h;
            int i16 = length + 1;
            if (this.f19161i) {
                int[] iArr3 = this.f19156d;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f19156d;
            if (length >= iArr4.length && this.f19154b < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f19156d;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f19156d;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f19155c * 2;
                this.f19155c = i18;
                this.f19161i = false;
                this.f19160h = length - 1;
                this.f19158f = Arrays.copyOf(this.f19158f, i18);
                this.f19156d = Arrays.copyOf(this.f19156d, this.f19155c);
                this.f19157e = Arrays.copyOf(this.f19157e, this.f19155c);
            }
            this.f19156d[length] = c8867e.f42671b;
            this.f19158f[length] = f6;
            if (i12 != -1) {
                int[] iArr7 = this.f19157e;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f19157e[length] = this.f19159g;
                this.f19159g = length;
            }
            c8867e.f42681m++;
            c8867e.m16369a(c8863a);
            this.f19154b++;
            if (!this.f19161i) {
                this.f19160h++;
            }
            int i19 = this.f19160h;
            int[] iArr8 = this.f19156d;
            if (i19 >= iArr8.length) {
                this.f19161i = true;
                this.f19160h = iArr8.length - 1;
            }
        }
    }

    /* renamed from: l */
    public float m8119l(C8867e c8867e) {
        int i10 = this.f19159g;
        for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
            if (this.f19156d[i10] == c8867e.f42671b) {
                return this.f19158f[i10];
            }
            i10 = this.f19157e[i10];
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: m */
    public C8867e m8120m(int i10) {
        int i11 = this.f19159g;
        for (int i12 = 0; i11 != -1 && i12 < this.f19154b; i12++) {
            if (i12 == i10) {
                return ((C8867e[]) ((C7439j) this.f19163k).f35539d)[this.f19156d[i11]];
            }
            i11 = this.f19157e[i11];
        }
        return null;
    }

    /* renamed from: n */
    public void m8121n(C8867e c8867e, float f6) {
        C8863a c8863a = (C8863a) this.f19162j;
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            m8122o(c8867e, true);
            return;
        }
        int i10 = this.f19159g;
        if (i10 == -1) {
            this.f19159g = 0;
            this.f19158f[0] = f6;
            this.f19156d[0] = c8867e.f42671b;
            this.f19157e[0] = -1;
            c8867e.f42681m++;
            c8867e.m16369a(c8863a);
            this.f19154b++;
            if (this.f19161i) {
                return;
            }
            int i11 = this.f19160h + 1;
            this.f19160h = i11;
            int[] iArr = this.f19156d;
            if (i11 >= iArr.length) {
                this.f19161i = true;
                this.f19160h = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f19154b; i13++) {
            int i14 = this.f19156d[i10];
            int i15 = c8867e.f42671b;
            if (i14 == i15) {
                this.f19158f[i10] = f6;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f19157e[i10];
        }
        int length = this.f19160h;
        int i16 = length + 1;
        if (this.f19161i) {
            int[] iArr2 = this.f19156d;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f19156d;
        if (length >= iArr3.length && this.f19154b < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f19156d;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f19156d;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f19155c * 2;
            this.f19155c = i18;
            this.f19161i = false;
            this.f19160h = length - 1;
            this.f19158f = Arrays.copyOf(this.f19158f, i18);
            this.f19156d = Arrays.copyOf(this.f19156d, this.f19155c);
            this.f19157e = Arrays.copyOf(this.f19157e, this.f19155c);
        }
        this.f19156d[length] = c8867e.f42671b;
        this.f19158f[length] = f6;
        if (i12 != -1) {
            int[] iArr6 = this.f19157e;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f19157e[length] = this.f19159g;
            this.f19159g = length;
        }
        c8867e.f42681m++;
        c8867e.m16369a(c8863a);
        int i19 = this.f19154b + 1;
        this.f19154b = i19;
        if (!this.f19161i) {
            this.f19160h++;
        }
        int[] iArr7 = this.f19156d;
        if (i19 >= iArr7.length) {
            this.f19161i = true;
        }
        if (this.f19160h >= iArr7.length) {
            this.f19161i = true;
            this.f19160h = iArr7.length - 1;
        }
    }

    /* renamed from: o */
    public float m8122o(C8867e c8867e, boolean z6) {
        int i10 = this.f19159g;
        if (i10 == -1) {
            return DefinitionKt.NO_Float_VALUE;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f19154b) {
            if (this.f19156d[i10] == c8867e.f42671b) {
                if (i10 == this.f19159g) {
                    this.f19159g = this.f19157e[i10];
                } else {
                    int[] iArr = this.f19157e;
                    iArr[i12] = iArr[i10];
                }
                if (z6) {
                    c8867e.m16370b((C8863a) this.f19162j);
                }
                c8867e.f42681m--;
                this.f19154b--;
                this.f19156d[i10] = -1;
                if (this.f19161i) {
                    this.f19160h = i10;
                }
                return this.f19158f[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f19157e[i10];
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    public final String toString() {
        switch (this.f19153a) {
            case 0:
                int i10 = this.f19159g;
                String string = "";
                for (int i11 = 0; i10 != -1 && i11 < this.f19154b; i11++) {
                    StringBuilder sbM4568o = AbstractC1452a.m4568o(AbstractC1452a.m4561h(string, " -> "));
                    sbM4568o.append(this.f19158f[i10]);
                    sbM4568o.append(" : ");
                    StringBuilder sbM4568o2 = AbstractC1452a.m4568o(sbM4568o.toString());
                    sbM4568o2.append(((C3592i[]) ((C0919n) this.f19163k).f5601d)[this.f19156d[i10]]);
                    string = sbM4568o2.toString();
                    i10 = this.f19157e[i10];
                }
                return string;
            default:
                int i12 = this.f19159g;
                String string2 = "";
                for (int i13 = 0; i12 != -1 && i13 < this.f19154b; i13++) {
                    StringBuilder sbM4568o3 = AbstractC1452a.m4568o(AbstractC1452a.m4561h(string2, " -> "));
                    sbM4568o3.append(this.f19158f[i12]);
                    sbM4568o3.append(" : ");
                    StringBuilder sbM4568o4 = AbstractC1452a.m4568o(sbM4568o3.toString());
                    sbM4568o4.append(((C8867e[]) ((C7439j) this.f19163k).f35539d)[this.f19156d[i12]]);
                    string2 = sbM4568o4.toString();
                    i12 = this.f19157e[i12];
                }
                return string2;
        }
    }

    public C3584a(C8863a c8863a, C7439j c7439j) {
        this.f19153a = 1;
        this.f19154b = 0;
        this.f19155c = 8;
        this.f19156d = new int[8];
        this.f19157e = new int[8];
        this.f19158f = new float[8];
        this.f19159g = -1;
        this.f19160h = -1;
        this.f19161i = false;
        this.f19162j = c8863a;
        this.f19163k = c7439j;
    }
}
