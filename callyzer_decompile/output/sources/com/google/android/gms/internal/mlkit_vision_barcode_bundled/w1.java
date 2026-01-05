package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import java.util.Iterator;
import java.util.Map;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 implements e2 {

    /* renamed from: a */
    public final j0 f6693a;

    /* renamed from: b */
    public final z0 f6694b;

    /* renamed from: c */
    public final boolean f6695c;

    public w1(z0 z0Var, j0 j0Var) {
        z0 z0Var2 = v0.f6675a;
        this.f6694b = z0Var;
        this.f6695c = j0Var instanceof b1;
        this.f6693a = j0Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: a */
    public final Object mo3842a() {
        j0 j0Var = this.f6693a;
        return j0Var instanceof e1 ? (e1) ((e1) j0Var).mo3803m(4, null) : ((a1) ((e1) j0Var).mo3803m(5, null)).mo3807d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: b */
    public final boolean mo3843b(Object obj) {
        return ((b1) obj).zzb.m4003f();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: c */
    public final void mo3844c(Object obj) {
        this.f6694b.getClass();
        i2 i2Var = ((e1) obj).zzc;
        if (i2Var.f6566e) {
            i2Var.f6566e = false;
        }
        z0 z0Var = v0.f6675a;
        ((b1) obj).zzb.m4001d();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3845d(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0 r15) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1 r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2.f6561f
            if (r1 != r2) goto Lf
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2.m3902b()
            r0.zzc = r1
        Lf:
            r6 = r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1 r11 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1) r11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r0 = r11.zzb
            boolean r1 = r0.f6692b
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 r0 = r0.clone()
            r11.zzb = r0
        L1e:
            r11 = 0
        L1f:
            if (r13 >= r14) goto La7
            int r4 = og.za.m11085f(r12, r13, r15)
            int r2 = r15.f6598a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0 r13 = r15.f6601d
            r0 = 11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0 r1 = r10.f6693a
            r3 = 2
            if (r2 == r0) goto L55
            r0 = r2 & 7
            if (r0 != r3) goto L4e
            int r0 = r2 >>> 3
            r13.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.t0 r3 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.t0
            r3.<init>(r1, r0)
            java.util.Map r13 = r13.f6670a
            java.lang.Object r13 = r13.get(r3)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1 r13 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1) r13
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = og.za.m11084e(r2, r3, r4, r5, r6, r7)
            goto L1f
        L4e:
            r5 = r14
            r7 = r15
            int r13 = og.za.m11091l(r2, r12, r4, r5, r7)
            goto L1f
        L55:
            r5 = r14
            r7 = r15
            r14 = 0
            r15 = r11
        L59:
            if (r4 >= r5) goto L9a
            int r0 = og.za.m11085f(r12, r4, r7)
            int r2 = r7.f6598a
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L76
            r9 = 3
            if (r4 == r9) goto L6b
            goto L8f
        L6b:
            if (r8 != r3) goto L8f
            int r4 = og.za.m11080a(r12, r0, r7)
            java.lang.Object r15 = r7.f6600c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0 r15 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0) r15
            goto L59
        L76:
            if (r8 != 0) goto L8f
            int r4 = og.za.m11085f(r12, r0, r7)
            int r14 = r7.f6598a
            r13.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.t0 r0 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.t0
            r0.<init>(r1, r14)
            java.util.Map r2 = r13.f6670a
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1 r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1) r0
            goto L59
        L8f:
            r4 = 12
            if (r2 == r4) goto L98
            int r4 = og.za.m11091l(r2, r12, r0, r5, r7)
            goto L59
        L98:
            r13 = r0
            goto L9b
        L9a:
            r13 = r4
        L9b:
            if (r15 == 0) goto La3
            int r14 = r14 << 3
            r14 = r14 | r3
            r6.m3904c(r14, r15)
        La3:
            r14 = r5
            r15 = r7
            goto L1f
        La7:
            r5 = r14
            if (r13 != r5) goto Lab
            return
        Lab:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer r11 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w1.mo3845d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: e */
    public final int mo3846e(e1 e1Var) {
        int iHashCode = e1Var.zzc.hashCode();
        if (!this.f6695c) {
            return iHashCode;
        }
        return ((b1) e1Var).zzb.f6691a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: f */
    public final int mo3847f(j0 j0Var) {
        i2 i2Var = ((e1) j0Var).zzc;
        int iM9725C = i2Var.f6565d;
        if (iM9725C == -1) {
            iM9725C = 0;
            for (int i10 = 0; i10 < i2Var.f6562a; i10++) {
                int i11 = i2Var.f6563b[i10] >>> 3;
                r0 r0Var = (r0) i2Var.f6564c[i10];
                int iM3951a = s0.m3951a(8);
                int iM3951a2 = s0.m3951a(i11) + s0.m3951a(16);
                int iM3951a3 = s0.m3951a(24);
                int iMo3818e = r0Var.mo3818e();
                iM9725C = AbstractC4801l.m9725C(iM3951a + iM3951a, iM3951a2, AbstractC0030c.m135z(iMo3818e, iMo3818e, iM3951a3), iM9725C);
            }
            i2Var.f6565d = iM9725C;
        }
        if (!this.f6695c) {
            return iM9725C;
        }
        g2 g2Var = ((b1) j0Var).zzb.f6691a;
        int i12 = g2Var.f6538b;
        int iM3998i = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            iM3998i += w0.m3998i(g2Var.m3886f(i13));
        }
        Iterator it = g2Var.m3884b().iterator();
        while (it.hasNext()) {
            iM3998i += w0.m3998i((Map.Entry) it.next());
        }
        return iM9725C + iM3998i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: g */
    public final void mo3848g(Object obj, Object obj2) {
        f2.m3872q(obj, obj2);
        if (this.f6695c) {
            z0 z0Var = v0.f6675a;
            f2.m3871p(obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: h */
    public final boolean mo3849h(e1 e1Var, e1 e1Var2) {
        if (!e1Var.zzc.equals(e1Var2.zzc)) {
            return false;
        }
        if (this.f6695c) {
            return ((b1) e1Var).zzb.equals(((b1) e1Var2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2
    /* renamed from: i */
    public final void mo3850i(Object obj, p1 p1Var) {
        Iterator itM4000c = ((b1) obj).zzb.m4000c();
        if (itM4000c.hasNext()) {
            ((c1) ((Map.Entry) itM4000c.next()).getKey()).getClass();
            throw null;
        }
        i2 i2Var = ((e1) obj).zzc;
        for (int i10 = 0; i10 < i2Var.f6562a; i10++) {
            int i11 = i2Var.f6563b[i10] >>> 3;
            Object obj2 = i2Var.f6564c[i10];
            s0 s0Var = (s0) p1Var.f6630a;
            if (obj2 instanceof r0) {
                s0Var.m3966o(11);
                s0Var.m3965n(2, i11);
                s0Var.m3956e(3, (r0) obj2);
                s0Var.m3966o(12);
            } else {
                s0Var.m3966o(11);
                s0Var.m3965n(2, i11);
                s0Var.m3966o(26);
                e1 e1Var = (e1) ((j0) obj2);
                s0Var.m3966o(e1Var.m3836c());
                e1Var.m3841l(s0Var);
                s0Var.m3966o(12);
            }
        }
    }
}
