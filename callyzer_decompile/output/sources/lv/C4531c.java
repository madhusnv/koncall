package lv;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ik.C3279c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import l4.d0;
import og.vb;
import ph.AbstractC5963r;
import ph.C5952g;
import ph.C5955j;
import ph.C5957l;
import ph.C5964s;
import ph.InterfaceC5948c;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lv.c */
/* loaded from: classes3.dex */
public final class C4531c {

    /* renamed from: a */
    public boolean f22510a;

    /* renamed from: b */
    public final Serializable f22511b;

    /* renamed from: c */
    public final Object f22512c;

    /* renamed from: d */
    public final Object f22513d;

    /* renamed from: e */
    public final Object f22514e;

    /* renamed from: f */
    public final Object f22515f;

    /* renamed from: g */
    public final Object f22516g;

    /* renamed from: h */
    public final Object f22517h;

    /* renamed from: i */
    public final Serializable f22518i;

    /* renamed from: j */
    public final Object f22519j;

    /* renamed from: k */
    public final Object f22520k;

    /* renamed from: l */
    public Object f22521l;

    /* JADX WARN: Multi-variable type inference failed */
    public C4531c(Serializable serializable, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, InterfaceC2141e interfaceC2141e3, C3279c c3279c, InterfaceC2141e interfaceC2141e4, InterfaceC2141e interfaceC2141e5, InterfaceC2142f interfaceC2142f, int i10) {
        c3279c = (i10 & 64) != 0 ? null : c3279c;
        this.f22511b = serializable;
        this.f22512c = interfaceC2139c;
        this.f22513d = interfaceC2139c2;
        this.f22514e = (AbstractC8199i) interfaceC2141e;
        this.f22515f = (AbstractC8199i) interfaceC2141e2;
        this.f22516g = (AbstractC8199i) interfaceC2141e3;
        this.f22519j = c3279c;
        this.f22520k = interfaceC2141e4;
        this.f22517h = (AbstractC8199i) interfaceC2141e5;
        this.f22518i = (AbstractC8199i) interfaceC2142f;
        this.f22510a = false;
        this.f22521l = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: a */
    public void m9377a(C5955j c5955j, float f6, RectF rectF, d0 d0Var, Path path) {
        int i10;
        boolean z6;
        float f10;
        d0 d0Var2;
        boolean z10;
        d0 d0Var3 = d0Var;
        Matrix[] matrixArr = (Matrix[]) this.f22513d;
        float[] fArr = (float[]) this.f22518i;
        C5964s[] c5964sArr = (C5964s[]) this.f22511b;
        Matrix[] matrixArr2 = (Matrix[]) this.f22512c;
        path.rewind();
        Path path2 = (Path) this.f22515f;
        path2.rewind();
        Path path3 = (Path) this.f22516g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            z6 = 0;
            if (i11 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f22514e;
            InterfaceC5948c interfaceC5948c = i11 != 1 ? i11 != 2 ? i11 != 3 ? c5955j.f29180f : c5955j.f29179e : c5955j.f29182h : c5955j.f29181g;
            vb vbVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? c5955j.f29176b : c5955j.f29175a : c5955j.f29178d : c5955j.f29177c;
            C5964s c5964s = c5964sArr[i11];
            vbVar.getClass();
            Matrix[] matrixArr3 = matrixArr;
            vbVar.mo11013b(c5964s, f6, interfaceC5948c.mo11975a(rectF));
            int i12 = i11 + 1;
            float f11 = i12 * 90;
            matrixArr2[i11].reset();
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            C5964s c5964s2 = c5964sArr[i11];
            fArr[0] = c5964s2.f29206b;
            fArr[1] = c5964s2.f29207c;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr3[i11].reset();
            matrixArr3[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i11].preRotate(f11);
            i11 = i12;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            C5964s c5964s3 = c5964sArr[i13];
            c5964s3.getClass();
            fArr[z6] = 0.0f;
            fArr[1] = c5964s3.f29205a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[z6], fArr[1]);
            } else {
                path.lineTo(fArr[z6], fArr[1]);
            }
            c5964sArr[i13].m12001b(matrixArr2[i13], path);
            if (d0Var3 != null) {
                C5964s c5964s4 = c5964sArr[i13];
                Matrix matrix = matrixArr2[i13];
                C5952g c5952g = (C5952g) d0Var3.f21881b;
                BitSet bitSet = c5952g.f29155d;
                c5964s4.getClass();
                f10 = 0.0f;
                bitSet.set(i13, z6);
                AbstractC5963r[] abstractC5963rArr = c5952g.f29153b;
                c5964s4.m12000a(c5964s4.f29209e);
                abstractC5963rArr[i13] = new C5957l(new ArrayList(c5964s4.f29211g), new Matrix(matrix));
            } else {
                f10 = 0.0f;
            }
            Path path4 = (Path) this.f22520k;
            C5964s c5964s5 = (C5964s) this.f22517h;
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            C5964s c5964s6 = c5964sArr[i13];
            fArr[0] = c5964s6.f29206b;
            fArr[1] = c5964s6.f29207c;
            matrixArr2[i13].mapPoints(fArr);
            float[] fArr2 = (float[]) this.f22519j;
            C5964s c5964s7 = c5964sArr[i15];
            c5964s7.getClass();
            fArr2[0] = f10;
            fArr2[1] = c5964s7.f29205a;
            matrixArr2[i15].mapPoints(fArr2);
            C5964s[] c5964sArr2 = c5964sArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f10);
            C5964s c5964s8 = c5964sArr2[i13];
            fArr[0] = c5964s8.f29206b;
            fArr[1] = c5964s8.f29207c;
            matrixArr5[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            c5964s5.m12003d(DefinitionKt.NO_Float_VALUE, 270.0f, DefinitionKt.NO_Float_VALUE);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? c5955j.f29184j : c5955j.f29183i : c5955j.f29186l : c5955j.f29185k).getClass();
            c5964s5.m12002c(fMax, DefinitionKt.NO_Float_VALUE);
            path4.reset();
            c5964s5.m12001b(matrixArr4[i13], path4);
            if (this.f22510a && (m9379c(path4, i13) || m9379c(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c5964s5.f29205a;
                matrixArr4[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c5964s5.m12001b(matrixArr4[i13], path2);
            } else {
                c5964s5.m12001b(matrixArr4[i13], path);
            }
            if (d0Var != null) {
                Matrix matrix2 = matrixArr4[i13];
                d0Var2 = d0Var;
                C5952g c5952g2 = (C5952g) d0Var2.f21881b;
                z10 = false;
                c5952g2.f29155d.set(i13 + 4, false);
                AbstractC5963r[] abstractC5963rArr2 = c5952g2.f29154c;
                c5964s5.m12000a(c5964s5.f29209e);
                abstractC5963rArr2[i13] = new C5957l(new ArrayList(c5964s5.f29211g), new Matrix(matrix2));
            } else {
                d0Var2 = d0Var;
                z10 = false;
            }
            z6 = z10;
            d0Var3 = d0Var2;
            i13 = i14;
            c5964sArr = c5964sArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r12.invoke(r3, r6, r1) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r12.invoke(r3, r1) == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v10, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r12v13, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r12v18, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ex.e, ww.i] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9378b(uw.InterfaceC7559c r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f22512c
            ex.c r0 = (ex.InterfaceC2139c) r0
            boolean r1 = r12 instanceof lv.C4529a
            if (r1 == 0) goto L17
            r1 = r12
            lv.a r1 = (lv.C4529a) r1
            int r2 = r1.f22505d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f22505d = r2
            goto L1c
        L17:
            lv.a r1 = new lv.a
            r1.<init>(r11, r12)
        L1c:
            java.lang.Object r12 = r1.f22503b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f22505d
            qw.a0 r4 = qw.a0.f30746a
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L52
            if (r3 == r9) goto L4e
            if (r3 == r7) goto L46
            if (r3 == r6) goto L40
            if (r3 != r5) goto L38
            og.od.m10798c(r12)
            goto L9c
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            java.util.List r3 = r1.f22502a
            og.od.m10798c(r12)
            goto L87
        L46:
            java.util.List r1 = r1.f22502a
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            og.od.m10798c(r12)
            goto Lb3
        L4e:
            og.od.m10798c(r12)
            goto L6b
        L52:
            og.od.m10798c(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r0.invoke(r12)
            r11.f22510a = r9
            java.lang.Object r12 = r11.f22514e
            ww.i r12 = (ww.AbstractC8199i) r12
            java.lang.Object r3 = r11.f22521l
            r1.f22505d = r9
            java.lang.Object r12 = r12.invoke(r3, r1)
            if (r12 != r2) goto L6b
            goto Lb2
        L6b:
            qw.n r12 = (qw.C6364n) r12
            java.lang.Object r12 = r12.f30758a
            java.lang.Throwable r3 = qw.C6364n.m12363a(r12)
            if (r3 != 0) goto La4
            r3 = r12
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r12 = r11.f22516g
            ww.i r12 = (ww.AbstractC8199i) r12
            r1.f22502a = r3
            r1.f22505d = r6
            java.lang.Object r12 = r12.invoke(r3, r1)
            if (r12 != r2) goto L87
            goto Lb2
        L87:
            if (r12 == 0) goto L8b
            r11.f22521l = r12
        L8b:
            java.io.Serializable r12 = r11.f22518i
            ww.i r12 = (ww.AbstractC8199i) r12
            java.lang.Object r6 = r11.f22521l
            r1.f22502a = r10
            r1.f22505d = r5
            java.lang.Object r12 = r12.invoke(r3, r6, r1)
            if (r12 != r2) goto L9c
            goto Lb2
        L9c:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            r11.f22510a = r8
            return r4
        La4:
            java.lang.Object r12 = r11.f22517h
            ww.i r12 = (ww.AbstractC8199i) r12
            r1.f22502a = r10
            r1.f22505d = r7
            java.lang.Object r12 = r12.invoke(r3, r1)
            if (r12 != r2) goto Lb3
        Lb2:
            return r2
        Lb3:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r0.invoke(r12)
            r11.f22510a = r8
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4531c.m9378b(uw.c):java.lang.Object");
    }

    /* renamed from: c */
    public boolean m9379c(Path path, int i10) {
        Path path2 = (Path) this.f22521l;
        path2.reset();
        ((C5964s[]) this.f22511b)[i10].m12001b(((Matrix[]) this.f22512c)[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r14 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r13.f22520k.invoke(r3, r1) != r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r14.invoke(r3, r1) == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v12, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r14v18, types: [ex.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [ex.e, ww.i] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9380d(uw.InterfaceC7559c r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f22513d
            ex.c r0 = (ex.InterfaceC2139c) r0
            boolean r1 = r14 instanceof lv.C4530b
            if (r1 == 0) goto L17
            r1 = r14
            lv.b r1 = (lv.C4530b) r1
            int r2 = r1.f22509d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f22509d = r2
            goto L1c
        L17:
            lv.b r1 = new lv.b
            r1.<init>(r13, r14)
        L1c:
            java.lang.Object r14 = r1.f22507b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f22509d
            qw.a0 r4 = qw.a0.f30746a
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L5a
            if (r3 == r9) goto L56
            if (r3 == r8) goto L52
            if (r3 == r7) goto L49
            if (r3 == r6) goto L43
            if (r3 != r5) goto L3b
            og.od.m10798c(r14)
            goto Laf
        L3b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L43:
            java.util.List r3 = r1.f22506a
            og.od.m10798c(r14)
            goto L9e
        L49:
            java.util.List r1 = r1.f22506a
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            og.od.m10798c(r14)
            goto Lc4
        L52:
            og.od.m10798c(r14)
            goto L80
        L56:
            og.od.m10798c(r14)
            goto L6c
        L5a:
            og.od.m10798c(r14)
            boolean r14 = r13.f22510a
            if (r14 == 0) goto L6c
            r1.f22509d = r9
            r11 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r14 = tx.c0.m13489l(r11, r1)
            if (r14 != r2) goto L6c
            goto Lc3
        L6c:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r0.invoke(r14)
            java.lang.Object r14 = r13.f22515f
            ww.i r14 = (ww.AbstractC8199i) r14
            java.lang.Object r3 = r13.f22521l
            r1.f22509d = r8
            java.lang.Object r14 = r14.invoke(r3, r1)
            if (r14 != r2) goto L80
            goto Lc3
        L80:
            qw.n r14 = (qw.C6364n) r14
            java.lang.Object r14 = r14.f30758a
            java.lang.Throwable r3 = qw.C6364n.m12363a(r14)
            if (r3 != 0) goto Lb5
            r3 = r14
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r14 = r13.f22519j
            ex.e r14 = (ex.InterfaceC2141e) r14
            if (r14 == 0) goto La2
            r1.f22506a = r3
            r1.f22509d = r6
            java.lang.Object r14 = r14.invoke(r3, r1)
            if (r14 != r2) goto L9e
            goto Lc3
        L9e:
            if (r14 == 0) goto La2
            r13.f22521l = r14
        La2:
            r1.f22506a = r10
            r1.f22509d = r5
            java.lang.Object r14 = r13.f22520k
            java.lang.Object r14 = r14.invoke(r3, r1)
            if (r14 != r2) goto Laf
            goto Lc3
        Laf:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r0.invoke(r14)
            return r4
        Lb5:
            java.lang.Object r14 = r13.f22517h
            ww.i r14 = (ww.AbstractC8199i) r14
            r1.f22506a = r10
            r1.f22509d = r7
            java.lang.Object r14 = r14.invoke(r3, r1)
            if (r14 != r2) goto Lc4
        Lc3:
            return r2
        Lc4:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r0.invoke(r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4531c.m9380d(uw.c):java.lang.Object");
    }

    /* renamed from: e */
    public Object m9381e(InterfaceC7559c interfaceC7559c) {
        this.f22521l = this.f22511b;
        Object objM9378b = m9378b(interfaceC7559c);
        return objM9378b == EnumC7794a.COROUTINE_SUSPENDED ? objM9378b : a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, ph.s[]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [float[], java.io.Serializable] */
    public C4531c() {
        this.f22511b = new C5964s[4];
        this.f22512c = new Matrix[4];
        this.f22513d = new Matrix[4];
        this.f22514e = new PointF();
        this.f22515f = new Path();
        this.f22516g = new Path();
        this.f22517h = new C5964s();
        this.f22518i = new float[2];
        this.f22519j = new float[2];
        this.f22520k = new Path();
        this.f22521l = new Path();
        this.f22510a = true;
        for (int i10 = 0; i10 < 4; i10++) {
            ((C5964s[]) this.f22511b)[i10] = new C5964s();
            ((Matrix[]) this.f22512c)[i10] = new Matrix();
            ((Matrix[]) this.f22513d)[i10] = new Matrix();
        }
    }
}
