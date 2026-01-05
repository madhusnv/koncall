package z4;

import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import j5.C3584a;
import java.util.Arrays;
import sr.C6911b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z4.c */
/* loaded from: classes.dex */
public final class C8865c extends C8863a {

    /* renamed from: f */
    public C8867e[] f42666f;

    /* renamed from: g */
    public C8867e[] f42667g;

    /* renamed from: h */
    public int f42668h;

    /* renamed from: i */
    public C0917l f42669i;

    @Override // z4.C8863a
    /* renamed from: d */
    public final C8867e mo16342d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f42668h; i11++) {
            C8867e[] c8867eArr = this.f42666f;
            C8867e c8867e = c8867eArr[i11];
            if (!zArr[c8867e.f42671b]) {
                C0917l c0917l = this.f42669i;
                c0917l.f5594b = c8867e;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f6 = ((C8867e) c0917l.f5594b).f42677h[i12];
                        if (f6 <= DefinitionKt.NO_Float_VALUE) {
                            if (f6 < DefinitionKt.NO_Float_VALUE) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    C8867e c8867e2 = c8867eArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f10 = c8867e2.f42677h[i12];
                            float f11 = ((C8867e) c0917l.f5594b).f42677h[i12];
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
        return this.f42666f[i10];
    }

    @Override // z4.C8863a
    /* renamed from: e */
    public final boolean mo16343e() {
        return this.f42668h == 0;
    }

    @Override // z4.C8863a
    /* renamed from: i */
    public final void mo16347i(C8864b c8864b, C8863a c8863a, boolean z6) {
        C8867e c8867e = c8863a.f42644a;
        if (c8867e == null) {
            return;
        }
        float[] fArr = c8867e.f42677h;
        C3584a c3584a = c8863a.f42647d;
        int iMo8109b = c3584a.mo8109b();
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            C8867e c8867eM8120m = c3584a.m8120m(i10);
            float fMo8115h = c3584a.mo8115h(i10);
            C0917l c0917l = this.f42669i;
            c0917l.f5594b = c8867eM8120m;
            if (c8867eM8120m.f42670a) {
                boolean z10 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((C8867e) c0917l.f5594b).f42677h;
                    float f6 = (fArr[i11] * fMo8115h) + fArr2[i11];
                    fArr2[i11] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        ((C8867e) c0917l.f5594b).f42677h[i11] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((C8865c) c0917l.f5595c).m16368k((C8867e) c0917l.f5594b);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != DefinitionKt.NO_Float_VALUE) {
                        float f11 = f10 * fMo8115h;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((C8867e) c0917l.f5594b).f42677h[i12] = f11;
                    } else {
                        ((C8867e) c0917l.f5594b).f42677h[i12] = 0.0f;
                    }
                }
                m16367j(c8867eM8120m);
            }
            this.f42645b = (c8863a.f42645b * fMo8115h) + this.f42645b;
        }
        m16368k(c8867e);
    }

    /* renamed from: j */
    public final void m16367j(C8867e c8867e) {
        int i10;
        int i11 = this.f42668h + 1;
        C8867e[] c8867eArr = this.f42666f;
        if (i11 > c8867eArr.length) {
            C8867e[] c8867eArr2 = (C8867e[]) Arrays.copyOf(c8867eArr, c8867eArr.length * 2);
            this.f42666f = c8867eArr2;
            this.f42667g = (C8867e[]) Arrays.copyOf(c8867eArr2, c8867eArr2.length * 2);
        }
        C8867e[] c8867eArr3 = this.f42666f;
        int i12 = this.f42668h;
        c8867eArr3[i12] = c8867e;
        int i13 = i12 + 1;
        this.f42668h = i13;
        if (i13 > 1 && c8867eArr3[i12].f42671b > c8867e.f42671b) {
            int i14 = 0;
            while (true) {
                i10 = this.f42668h;
                if (i14 >= i10) {
                    break;
                }
                this.f42667g[i14] = this.f42666f[i14];
                i14++;
            }
            Arrays.sort(this.f42667g, 0, i10, new C6911b(12));
            for (int i15 = 0; i15 < this.f42668h; i15++) {
                this.f42666f[i15] = this.f42667g[i15];
            }
        }
        c8867e.f42670a = true;
        c8867e.m16369a(this);
    }

    /* renamed from: k */
    public final void m16368k(C8867e c8867e) {
        int i10 = 0;
        while (i10 < this.f42668h) {
            if (this.f42666f[i10] == c8867e) {
                while (true) {
                    int i11 = this.f42668h;
                    if (i10 >= i11 - 1) {
                        this.f42668h = i11 - 1;
                        c8867e.f42670a = false;
                        return;
                    } else {
                        C8867e[] c8867eArr = this.f42666f;
                        int i12 = i10 + 1;
                        c8867eArr[i10] = c8867eArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // z4.C8863a
    public final String toString() {
        C0917l c0917l = this.f42669i;
        String str = " goal -> (" + this.f42645b + ") : ";
        for (int i10 = 0; i10 < this.f42668h; i10++) {
            c0917l.f5594b = this.f42666f[i10];
            str = str + c0917l + " ";
        }
        return str;
    }
}
