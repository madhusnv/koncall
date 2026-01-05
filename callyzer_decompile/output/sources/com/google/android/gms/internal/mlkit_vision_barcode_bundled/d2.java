package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 extends r0 {

    /* renamed from: h */
    public static final int[] f6518h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: c */
    public final int f6519c;

    /* renamed from: d */
    public final r0 f6520d;

    /* renamed from: e */
    public final r0 f6521e;

    /* renamed from: f */
    public final int f6522f;

    /* renamed from: g */
    public final int f6523g;

    public d2(r0 r0Var, r0 r0Var2) {
        this.f6520d = r0Var;
        this.f6521e = r0Var2;
        int iMo3818e = r0Var.mo3818e();
        this.f6522f = iMo3818e;
        this.f6519c = r0Var2.mo3818e() + iMo3818e;
        this.f6523g = Math.max(r0Var.mo3820h(), r0Var2.mo3820h()) + 1;
    }

    /* renamed from: z */
    public static int m3815z(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f6518h[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: a */
    public final byte mo3816a(int i10) {
        r0.m3949y(i10, this.f6519c);
        return mo3817b(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: b */
    public final byte mo3817b(int i10) {
        int i11 = this.f6522f;
        return i10 < i11 ? this.f6520d.mo3817b(i10) : this.f6521e.mo3817b(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: e */
    public final int mo3818e() {
        return this.f6519c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            int iMo3818e = r0Var.mo3818e();
            int i10 = this.f6519c;
            if (i10 == iMo3818e) {
                if (i10 == 0) {
                    return true;
                }
                int i11 = this.f6642a;
                int i12 = r0Var.f6642a;
                if (i11 == 0 || i12 == 0 || i11 == i12) {
                    c2 c2Var = new c2(this);
                    q0 q0VarM3814a = c2Var.m3814a();
                    c2 c2Var2 = new c2(r0Var);
                    q0 q0VarM3814a2 = c2Var2.m3814a();
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int iMo3818e2 = q0VarM3814a.mo3818e() - i13;
                        int iMo3818e3 = q0VarM3814a2.mo3818e() - i14;
                        int iMin = Math.min(iMo3818e2, iMo3818e3);
                        if (!(i13 == 0 ? q0VarM3814a.m3941A(q0VarM3814a2, i14, iMin) : q0VarM3814a2.m3941A(q0VarM3814a, i13, iMin))) {
                            break;
                        }
                        i15 += iMin;
                        if (i15 >= i10) {
                            if (i15 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == iMo3818e2) {
                            q0VarM3814a = c2Var.m3814a();
                            i13 = 0;
                        } else {
                            i13 += iMin;
                        }
                        if (iMin == iMo3818e3) {
                            q0VarM3814a2 = c2Var2.m3814a();
                            i14 = 0;
                        } else {
                            i14 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: g */
    public final void mo3819g(int i10, int i11, byte[] bArr, int i12) {
        int i13 = i10 + i12;
        r0 r0Var = this.f6520d;
        int i14 = this.f6522f;
        if (i13 <= i14) {
            r0Var.mo3819g(i10, i11, bArr, i12);
            return;
        }
        r0 r0Var2 = this.f6521e;
        if (i10 >= i14) {
            r0Var2.mo3819g(i10 - i14, i11, bArr, i12);
            return;
        }
        int i15 = i14 - i10;
        r0Var.mo3819g(i10, i11, bArr, i15);
        r0Var2.mo3819g(0, i11 + i15, bArr, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: h */
    public final int mo3820h() {
        return this.f6523g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new b2(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: j */
    public final boolean mo3821j() {
        return this.f6519c >= m3815z(this.f6523g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: k */
    public final int mo3822k(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        r0 r0Var = this.f6520d;
        int i14 = this.f6522f;
        if (i13 <= i14) {
            return r0Var.mo3822k(i10, i11, i12);
        }
        r0 r0Var2 = this.f6521e;
        if (i11 >= i14) {
            return r0Var2.mo3822k(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return r0Var2.mo3822k(r0Var.mo3822k(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: m */
    public final int mo3823m(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        r0 r0Var = this.f6520d;
        int i14 = this.f6522f;
        if (i13 <= i14) {
            return r0Var.mo3823m(i10, i11, i12);
        }
        r0 r0Var2 = this.f6521e;
        if (i11 >= i14) {
            return r0Var2.mo3823m(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return r0Var2.mo3823m(r0Var.mo3823m(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: q */
    public final r0 mo3824q(int i10, int i11) {
        int i12 = this.f6519c;
        int iM3946u = r0.m3946u(i10, i11, i12);
        if (iM3946u == 0) {
            return r0.f6641b;
        }
        if (iM3946u == i12) {
            return this;
        }
        r0 r0Var = this.f6520d;
        int i13 = this.f6522f;
        if (i11 <= i13) {
            return r0Var.mo3824q(i10, i11);
        }
        r0 r0Var2 = this.f6521e;
        if (i10 < i13) {
            return new d2(r0Var.mo3824q(i10, r0Var.mo3818e()), r0Var2.mo3824q(0, i11 - i13));
        }
        return r0Var2.mo3824q(i10 - i13, i11 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: r */
    public final String mo3825r(Charset charset) {
        byte[] bArr;
        int iMo3818e = mo3818e();
        if (iMo3818e == 0) {
            bArr = l1.f6595b;
        } else {
            byte[] bArr2 = new byte[iMo3818e];
            mo3819g(0, 0, bArr2, iMo3818e);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: s */
    public final void mo3826s(s0 s0Var) {
        this.f6520d.mo3826s(s0Var);
        this.f6521e.mo3826s(s0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: t */
    public final boolean mo3827t() {
        int iMo3823m = this.f6520d.mo3823m(0, 0, this.f6522f);
        r0 r0Var = this.f6521e;
        return r0Var.mo3823m(iMo3823m, 0, r0Var.mo3818e()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: v */
    public final o0 iterator() {
        return new b2(this);
    }
}
