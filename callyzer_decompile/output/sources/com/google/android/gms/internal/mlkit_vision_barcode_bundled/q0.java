package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.sun.mail.util.AbstractC1452a;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class q0 extends r0 {

    /* renamed from: c */
    public final byte[] f6634c;

    public q0(byte[] bArr) {
        bArr.getClass();
        this.f6634c = bArr;
    }

    /* renamed from: A */
    public final boolean m3941A(q0 q0Var, int i10, int i11) {
        if (i11 > q0Var.mo3818e()) {
            throw new IllegalArgumentException("Length too large: " + i11 + mo3818e());
        }
        if (i10 + i11 > q0Var.mo3818e()) {
            int iMo3818e = q0Var.mo3818e();
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "Ran off end of other: ", ", ", ", ");
            sbM4566m.append(iMo3818e);
            throw new IllegalArgumentException(sbM4566m.toString());
        }
        byte[] bArr = q0Var.f6634c;
        int iMo3931z = mo3931z() + i11;
        int iMo3931z2 = mo3931z();
        int iMo3931z3 = q0Var.mo3931z() + i10;
        while (iMo3931z2 < iMo3931z) {
            if (this.f6634c[iMo3931z2] != bArr[iMo3931z3]) {
                return false;
            }
            iMo3931z2++;
            iMo3931z3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: a */
    public byte mo3816a(int i10) {
        return this.f6634c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: b */
    public byte mo3817b(int i10) {
        return this.f6634c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: e */
    public int mo3818e() {
        return this.f6634c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r0) && mo3818e() == ((r0) obj).mo3818e()) {
            if (mo3818e() == 0) {
                return true;
            }
            if (!(obj instanceof q0)) {
                return obj.equals(this);
            }
            q0 q0Var = (q0) obj;
            int i10 = this.f6642a;
            int i11 = q0Var.f6642a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                return m3941A(q0Var, 0, mo3818e());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: g */
    public void mo3819g(int i10, int i11, byte[] bArr, int i12) {
        System.arraycopy(this.f6634c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: h */
    public final int mo3820h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: j */
    public final boolean mo3821j() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: k */
    public final int mo3822k(int i10, int i11, int i12) {
        int iMo3931z = mo3931z() + i11;
        Charset charset = l1.f6594a;
        for (int i13 = iMo3931z; i13 < iMo3931z + i12; i13++) {
            i10 = (i10 * 31) + this.f6634c[i13];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: m */
    public final int mo3823m(int i10, int i11, int i12) {
        int iMo3931z = mo3931z() + i11;
        p2.f6631a.getClass();
        return z0.m4008c(i10, iMo3931z, this.f6634c, i12 + iMo3931z);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: q */
    public final r0 mo3824q(int i10, int i11) {
        int iM3946u = r0.m3946u(i10, i11, mo3818e());
        if (iM3946u == 0) {
            return r0.f6641b;
        }
        return new p0(this.f6634c, mo3931z() + i10, iM3946u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: r */
    public final String mo3825r(Charset charset) {
        return new String(this.f6634c, mo3931z(), mo3818e(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: s */
    public final void mo3826s(s0 s0Var) {
        s0Var.m3955d(mo3931z(), mo3818e(), this.f6634c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: t */
    public final boolean mo3827t() {
        int iMo3931z = mo3931z();
        int iMo3818e = mo3818e() + iMo3931z;
        p2.f6631a.getClass();
        return z0.m4008c(0, iMo3931z, this.f6634c, iMo3818e) == 0;
    }

    /* renamed from: z */
    public int mo3931z() {
        return 0;
    }
}
