package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements s1 {

    /* renamed from: b */
    public static final z0 f6629b = new z0(3);

    /* renamed from: a */
    public final Object f6630a;

    public p1(s1... s1VarArr) {
        this.f6630a = s1VarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1
    /* renamed from: a */
    public a2 mo3932a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            s1 s1Var = ((s1[]) this.f6630a)[i10];
            if (s1Var.mo3933b(cls)) {
                return s1Var.mo3932a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1
    /* renamed from: b */
    public boolean mo3933b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((s1[]) this.f6630a)[i10].mo3933b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m3934c(r0 r0Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f6630a;
        if (!r0Var.mo3821j()) {
            if (!(r0Var instanceof d2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(r0Var.getClass())));
            }
            d2 d2Var = (d2) r0Var;
            m3934c(d2Var.f6520d);
            m3934c(d2Var.f6521e);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(d2.f6518h, r0Var.mo3818e());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iM3815z = d2.m3815z(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((r0) arrayDeque.peek()).mo3818e() >= iM3815z) {
            arrayDeque.push(r0Var);
            return;
        }
        int iM3815z2 = d2.m3815z(iBinarySearch);
        r0 d2Var2 = (r0) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((r0) arrayDeque.peek()).mo3818e() < iM3815z2) {
            d2Var2 = new d2((r0) arrayDeque.pop(), d2Var2);
        }
        d2 d2Var3 = new d2(d2Var2, r0Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(d2.f6518h, d2Var3.f6519c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((r0) arrayDeque.peek()).mo3818e() >= d2.m3815z(iBinarySearch2 + 1)) {
                break;
            } else {
                d2Var3 = new d2((r0) arrayDeque.pop(), d2Var3);
            }
        }
        arrayDeque.push(d2Var3);
    }

    /* renamed from: d */
    public void m3935d(int i10, Object obj, e2 e2Var) {
        s0 s0Var = (s0) this.f6630a;
        s0Var.m3964m(i10, 3);
        e2Var.mo3850i((j0) obj, s0Var.f6661b);
        s0Var.m3964m(i10, 4);
    }

    /* renamed from: e */
    public void m3936e(int i10, Object obj, e2 e2Var) {
        j0 j0Var = (j0) obj;
        s0 s0Var = (s0) this.f6630a;
        s0Var.m3966o((i10 << 3) | 2);
        s0Var.m3966o(j0Var.mo3835b(e2Var));
        e2Var.mo3850i(j0Var, s0Var.f6661b);
    }

    public p1(int i10) {
        switch (i10) {
            case 3:
                this.f6630a = new ArrayDeque();
                break;
            default:
                y1 y1Var = y1.f6701c;
                p1 p1Var = new p1(z0.f6704b, f6629b);
                Charset charset = l1.f6594a;
                this.f6630a = p1Var;
                break;
        }
    }

    public p1(s0 s0Var) {
        Charset charset = l1.f6594a;
        this.f6630a = s0Var;
        s0Var.f6661b = this;
    }
}
