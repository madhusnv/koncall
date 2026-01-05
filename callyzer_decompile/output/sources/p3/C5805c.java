package p3;

import android.graphics.Matrix;
import com.google.android.gms.internal.measurement.j4;
import e1.C1915q;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import m2.C4640e;
import t3.InterfaceC7033t;
import w2.AbstractC7878q;
import w3.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.c */
/* loaded from: classes.dex */
public final class C5805c {

    /* renamed from: a */
    public boolean f28414a;

    /* renamed from: b */
    public boolean f28415b;

    /* renamed from: c */
    public boolean f28416c;

    /* renamed from: d */
    public boolean f28417d;

    /* renamed from: e */
    public final Object f28418e;

    /* renamed from: f */
    public Object f28419f;

    /* renamed from: g */
    public final Object f28420g;

    /* renamed from: h */
    public final Object f28421h;

    /* JADX WARN: Multi-variable type inference failed */
    public C5805c(InterfaceC2141e interfaceC2141e) {
        this.f28418e = (AbstractC4155m) interfaceC2141e;
        this.f28420g = d3.b0.m5094a();
        this.f28421h = d3.b0.m5094a();
        this.f28416c = true;
        this.f28417d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11375a(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C5805c.m11375a(long, java.util.List, boolean):void");
    }

    /* renamed from: b */
    public float[] m11376b(Object obj) {
        float[] fArr = (float[]) this.f28421h;
        if (this.f28415b) {
            this.f28416c = m0.m14987n(m11377c(obj), fArr);
            this.f28415b = false;
        }
        if (this.f28416c) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ex.e, kotlin.jvm.internal.m] */
    /* renamed from: c */
    public float[] m11377c(Object obj) {
        float[] fArr = (float[]) this.f28420g;
        if (!this.f28414a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f28419f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f28419f = matrix;
        }
        ((AbstractC4155m) this.f28418e).invoke(obj, matrix);
        d3.h0.m5145q(matrix, fArr);
        this.f28414a = false;
        this.f28417d = d3.h0.m5141m(fArr);
        return fArr;
    }

    /* renamed from: d */
    public boolean m11378d(j4 j4Var, boolean z6) {
        e1.e0 e0Var = (e1.e0) this.f28419f;
        C5811i c5811i = (C5811i) this.f28420g;
        boolean zMo11390a = c5811i.mo11390a((C1915q) j4Var.f6252c, (InterfaceC7033t) this.f28418e, j4Var, z6);
        C4640e c4640e = c5811i.f28465a;
        if (!zMo11390a) {
            return false;
        }
        boolean z10 = true;
        this.f28414a = true;
        Object[] objArr = c4640e.f22884a;
        int i10 = c4640e.f22886c;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((C5810h) objArr[i11]).m11394e(j4Var, z6) || z11;
        }
        Object[] objArr2 = c4640e.f22884a;
        int i12 = c4640e.f22886c;
        boolean z12 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z12 = ((C5810h) objArr2[i13]).m11393d(j4Var) || z12;
        }
        c5811i.mo11391b(j4Var);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.f28414a = false;
        if (this.f28417d) {
            this.f28417d = false;
            int i14 = e0Var.f8957b;
            for (int i15 = 0; i15 < i14; i15++) {
                m11381g((AbstractC7878q) e0Var.m5547e(i15));
            }
            e0Var.m5545c();
        }
        if (this.f28415b) {
            this.f28415b = false;
            m11380f();
        }
        if (this.f28416c) {
            this.f28416c = false;
            c5811i.f28465a.m9511h();
        }
        return z10;
    }

    /* renamed from: e */
    public void m11379e() {
        this.f28414a = true;
        this.f28415b = true;
    }

    /* renamed from: f */
    public void m11380f() {
        C5811i c5811i = (C5811i) this.f28420g;
        if (this.f28414a) {
            this.f28415b = true;
            return;
        }
        C4640e c4640e = c5811i.f28465a;
        Object[] objArr = c4640e.f22884a;
        int i10 = c4640e.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C5810h) objArr[i11]).m11392c();
        }
        if (this.f28416c) {
            this.f28416c = true;
        } else {
            c5811i.f28465a.m9511h();
        }
    }

    /* renamed from: g */
    public void m11381g(AbstractC7878q abstractC7878q) {
        if (this.f28414a) {
            this.f28417d = true;
            ((e1.e0) this.f28419f).m5543a(abstractC7878q);
            return;
        }
        C5811i c5811i = (C5811i) this.f28420g;
        e1.e0 e0Var = c5811i.f28466b;
        e0Var.m5545c();
        e0Var.m5543a(c5811i);
        while (e0Var.m5550h()) {
            C5811i c5811i2 = (C5811i) e0Var.m5552j(e0Var.f8957b - 1);
            int i10 = 0;
            while (true) {
                C4640e c4640e = c5811i2.f28465a;
                if (i10 < c4640e.f22886c) {
                    C5810h c5810h = (C5810h) c4640e.f22884a[i10];
                    if (AbstractC4154l.m8918a(c5810h.f28446c, abstractC7878q)) {
                        c5811i2.f28465a.m9514l(c5810h);
                        c5810h.m11392c();
                    } else {
                        e0Var.m5543a(c5810h);
                        i10++;
                    }
                }
            }
        }
    }

    public C5805c(InterfaceC7033t interfaceC7033t) {
        this.f28418e = interfaceC7033t;
        this.f28419f = new e1.e0();
        this.f28420g = new C5811i();
        this.f28421h = new e1.a0(10);
    }
}
