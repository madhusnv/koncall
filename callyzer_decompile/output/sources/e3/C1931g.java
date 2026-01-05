package e3;

import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.g */
/* loaded from: classes.dex */
public class C1931g {

    /* renamed from: a */
    public final AbstractC1927c f9131a;

    /* renamed from: b */
    public final AbstractC1927c f9132b;

    /* renamed from: c */
    public final AbstractC1927c f9133c;

    /* renamed from: d */
    public final float[] f9134d;

    public C1931g(AbstractC1927c abstractC1927c, AbstractC1927c abstractC1927c2, AbstractC1927c abstractC1927c3, float[] fArr) {
        this.f9131a = abstractC1927c;
        this.f9132b = abstractC1927c2;
        this.f9133c = abstractC1927c3;
        this.f9134d = fArr;
    }

    /* renamed from: a */
    public long mo5683a(long j6) {
        float fM5192h = C1565s.m5192h(j6);
        float fM5191g = C1565s.m5191g(j6);
        float fM5189e = C1565s.m5189e(j6);
        float fM5188d = C1565s.m5188d(j6);
        AbstractC1927c abstractC1927c = this.f9132b;
        long jMo5676d = abstractC1927c.mo5676d(fM5192h, fM5191g, fM5189e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5676d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5676d & 4294967295L));
        float fMo5677e = abstractC1927c.mo5677e(fM5192h, fM5191g, fM5189e);
        float[] fArr = this.f9134d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo5677e *= fArr[2];
        }
        float f6 = fIntBitsToFloat;
        float f10 = fIntBitsToFloat2;
        return this.f9133c.mo5678f(f6, f10, fMo5677e, fM5188d, this.f9131a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1931g(e3.AbstractC1927c r9, e3.AbstractC1927c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f9101b
            long r2 = e3.AbstractC1926b.f9095a
            boolean r0 = e3.AbstractC1926b.m5671a(r0, r2)
            if (r0 == 0) goto Lf
            e3.c r0 = e3.AbstractC1934j.m5684a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f9101b
            boolean r1 = e3.AbstractC1926b.m5671a(r4, r2)
            if (r1 == 0) goto L1d
            e3.c r1 = e3.AbstractC1934j.m5684a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f9101b
            boolean r11 = e3.AbstractC1926b.m5671a(r5, r2)
            long r5 = r10.f9101b
            boolean r2 = e3.AbstractC1926b.m5671a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            e3.q r9 = (e3.C1941q) r9
            e3.s r9 = r9.f9155d
            float[] r3 = e3.AbstractC1934j.f9140e
            if (r11 == 0) goto L47
            float[] r11 = r9.m5692a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.m5692a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.C1931g.<init>(e3.c, e3.c, int):void");
    }
}
