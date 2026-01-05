package j5;

import ap.C0390c;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.g */
/* loaded from: classes.dex */
public final class C3590g extends C3586c {

    /* renamed from: f */
    public C3592i[] f19187f;

    /* renamed from: g */
    public C3592i[] f19188g;

    /* renamed from: h */
    public int f19189h;

    /* renamed from: i */
    public C3589f f19190i;

    @Override // j5.C3586c
    /* renamed from: d */
    public final C3592i mo8126d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f19189h; i11++) {
            C3592i[] c3592iArr = this.f19187f;
            C3592i c3592i = c3592iArr[i11];
            if (!zArr[c3592i.f19192b]) {
                C3589f c3589f = this.f19190i;
                c3589f.f19185a = c3592i;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f6 = c3589f.f19185a.f19198h[i12];
                        if (f6 <= DefinitionKt.NO_Float_VALUE) {
                            if (f6 < DefinitionKt.NO_Float_VALUE) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    C3592i c3592i2 = c3592iArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f10 = c3592i2.f19198h[i12];
                            float f11 = c3589f.f19185a.f19198h[i12];
                            if (f11 == f10) {
                                i12--;
                            } else if (f11 < f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f19187f[i10];
    }

    @Override // j5.C3586c
    /* renamed from: h */
    public final void mo8130h(C3586c c3586c, boolean z6) {
        C3592i c3592i = c3586c.f19164a;
        if (c3592i == null) {
            return;
        }
        float[] fArr = c3592i.f19198h;
        InterfaceC3585b interfaceC3585b = c3586c.f19167d;
        int iMo8109b = interfaceC3585b.mo8109b();
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            C3592i c3592iMo8112e = interfaceC3585b.mo8112e(i10);
            float fMo8115h = interfaceC3585b.mo8115h(i10);
            C3589f c3589f = this.f19190i;
            c3589f.f19185a = c3592iMo8112e;
            if (c3592iMo8112e.f19191a) {
                boolean z10 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = c3589f.f19185a.f19198h;
                    float f6 = (fArr[i11] * fMo8115h) + fArr2[i11];
                    fArr2[i11] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        c3589f.f19185a.f19198h[i11] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    c3589f.f19186b.m8150j(c3589f.f19185a);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != DefinitionKt.NO_Float_VALUE) {
                        float f11 = f10 * fMo8115h;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        c3589f.f19185a.f19198h[i12] = f11;
                    } else {
                        c3589f.f19185a.f19198h[i12] = 0.0f;
                    }
                }
                m8149i(c3592iMo8112e);
            }
            this.f19165b = (c3586c.f19165b * fMo8115h) + this.f19165b;
        }
        m8150j(c3592i);
    }

    /* renamed from: i */
    public final void m8149i(C3592i c3592i) {
        int i10;
        int i11 = this.f19189h + 1;
        C3592i[] c3592iArr = this.f19187f;
        if (i11 > c3592iArr.length) {
            C3592i[] c3592iArr2 = (C3592i[]) Arrays.copyOf(c3592iArr, c3592iArr.length * 2);
            this.f19187f = c3592iArr2;
            this.f19188g = (C3592i[]) Arrays.copyOf(c3592iArr2, c3592iArr2.length * 2);
        }
        C3592i[] c3592iArr3 = this.f19187f;
        int i12 = this.f19189h;
        c3592iArr3[i12] = c3592i;
        int i13 = i12 + 1;
        this.f19189h = i13;
        if (i13 > 1 && c3592iArr3[i12].f19192b > c3592i.f19192b) {
            int i14 = 0;
            while (true) {
                i10 = this.f19189h;
                if (i14 >= i10) {
                    break;
                }
                this.f19188g[i14] = this.f19187f[i14];
                i14++;
            }
            Arrays.sort(this.f19188g, 0, i10, new C0390c(16));
            for (int i15 = 0; i15 < this.f19189h; i15++) {
                this.f19187f[i15] = this.f19188g[i15];
            }
        }
        c3592i.f19191a = true;
        c3592i.m8151a(this);
    }

    /* renamed from: j */
    public final void m8150j(C3592i c3592i) {
        int i10 = 0;
        while (i10 < this.f19189h) {
            if (this.f19187f[i10] == c3592i) {
                while (true) {
                    int i11 = this.f19189h;
                    if (i10 >= i11 - 1) {
                        this.f19189h = i11 - 1;
                        c3592i.f19191a = false;
                        return;
                    } else {
                        C3592i[] c3592iArr = this.f19187f;
                        int i12 = i10 + 1;
                        c3592iArr[i10] = c3592iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // j5.C3586c
    public final String toString() {
        C3589f c3589f = this.f19190i;
        String str = " goal -> (" + this.f19165b + ") : ";
        for (int i10 = 0; i10 < this.f19189h; i10++) {
            c3589f.f19185a = this.f19187f[i10];
            str = str + c3589f + " ";
        }
        return str;
    }
}
