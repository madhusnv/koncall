package c3;

import android.graphics.Path;
import android.graphics.RectF;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1558l;
import d3.C1555i;
import d3.c0;
import d3.h0;
import d3.l0;
import kotlin.jvm.internal.AbstractC4154l;
import og.e1;
import og.z1;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c3.a */
/* loaded from: classes.dex */
public final class C0846a implements l0 {

    /* renamed from: a */
    public final /* synthetic */ int f5347a;

    /* renamed from: b */
    public float f5348b;

    /* renamed from: c */
    public float f5349c;

    /* renamed from: d */
    public float f5350d;

    /* renamed from: e */
    public float f5351e;

    public C0846a(float f6, float f10) {
        this.f5347a = 2;
        this.f5349c = f6;
        this.f5350d = f10;
    }

    /* renamed from: a */
    public float m2263a() {
        return this.f5351e;
    }

    /* renamed from: b */
    public float m2264b() {
        return this.f5349c;
    }

    /* renamed from: c */
    public float m2265c() {
        return this.f5350d;
    }

    /* renamed from: d */
    public float m2266d() {
        return this.f5348b;
    }

    /* renamed from: e */
    public void m2267e(float f6, float f10, float f11, float f12) {
        this.f5348b = Math.max(f6, this.f5348b);
        this.f5349c = Math.max(f10, this.f5349c);
        this.f5350d = Math.min(f11, this.f5350d);
        this.f5351e = Math.min(f12, this.f5351e);
    }

    /* renamed from: f */
    public boolean m2268f() {
        return (this.f5348b >= this.f5350d) | (this.f5349c >= this.f5351e);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2269g() {
        /*
            r6 = this;
            float r0 = r6.f5350d
            float r1 = r6.f5349c
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 > 0) goto L29
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L29
            r6.f5348b = r2
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L17
        L15:
            r2 = r5
            goto L26
        L17:
            if (r3 != 0) goto L1a
            goto L26
        L1a:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 != 0) goto L1f
            goto L15
        L1f:
            float r1 = r2 / r1
            float r0 = r2 / r0
            float r2 = r2 - r0
            float r1 = r1 - r0
            float r2 = r2 / r1
        L26:
            r6.f5351e = r2
            return
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Requested zoomRatio 1.0 is not within valid range ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " , "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C0846a.m2269g():void");
    }

    @Override // d3.l0
    /* renamed from: i */
    public h0 mo399i(long j6, EnumC6757m layoutDirection, InterfaceC6747c density) {
        float f6 = this.f5348b;
        AbstractC4154l.m8923f(layoutDirection, "layoutDirection");
        AbstractC4154l.m8923f(density, "density");
        int i10 = (int) (j6 >> 32);
        float fIntBitsToFloat = (Float.intBitsToFloat(i10) / 2.0f) * this.f5351e;
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i10) / 2.0f) * this.f5350d;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10) / 2.0f;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i10) / 2.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32);
        C1555i c1555iM5178a = AbstractC1558l.m5178a();
        Path path = c1555iM5178a.f7752a;
        float f10 = this.f5349c;
        if (f10 != 360.0f || fIntBitsToFloat2 == DefinitionKt.NO_Float_VALUE) {
            double d2 = f6 * 0.017453292519943295d;
            long jM2276g = C0847b.m2276g(jFloatToRawIntBits, e1.m10620b(fIntBitsToFloat2, d2));
            path.moveTo(Float.intBitsToFloat((int) (jM2276g >> 32)), Float.intBitsToFloat((int) (jM2276g & 4294967295L)));
            e1.m10619a(c1555iM5178a, C0847b.m2276g(jFloatToRawIntBits, e1.m10620b(fIntBitsToFloat, d2)));
            c1555iM5178a.m5154c(new C0848c((Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat), f6, f10);
            float f11 = f6 + f10;
            e1.m10619a(c1555iM5178a, C0847b.m2276g(jFloatToRawIntBits, e1.m10620b(fIntBitsToFloat2, f11 * 0.017453292519943295d)));
            if (fIntBitsToFloat2 != DefinitionKt.NO_Float_VALUE) {
                float fIntBitsToFloat5 = (Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat2;
                int i11 = (int) (j6 & 4294967295L);
                float fIntBitsToFloat6 = (Float.intBitsToFloat(i11) / 2.0f) - fIntBitsToFloat2;
                float fIntBitsToFloat7 = (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat2;
                float fIntBitsToFloat8 = (Float.intBitsToFloat(i11) / 2.0f) + fIntBitsToFloat2;
                float f12 = -f10;
                if (c1555iM5178a.f7753b == null) {
                    c1555iM5178a.f7753b = new RectF();
                }
                RectF rectF = c1555iM5178a.f7753b;
                AbstractC4154l.m8920c(rectF);
                rectF.set(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8);
                RectF rectF2 = c1555iM5178a.f7753b;
                AbstractC4154l.m8920c(rectF2);
                path.arcTo(rectF2, f11, f12, false);
            }
        } else {
            c1555iM5178a.m5154c(new C0848c((Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat), f6, f10);
            c1555iM5178a.m5154c(new C0848c((Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat2, (Float.intBitsToFloat(i10) / 2.0f) - fIntBitsToFloat2, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat2, (Float.intBitsToFloat(i10) / 2.0f) + fIntBitsToFloat2), f6, -f10);
        }
        return new c0(c1555iM5178a);
    }

    public String toString() {
        switch (this.f5347a) {
            case 0:
                return "MutableRect(" + z1.m11079a(this.f5348b) + ", " + z1.m11079a(this.f5349c) + ", " + z1.m11079a(this.f5350d) + ", " + z1.m11079a(this.f5351e) + ')';
            default:
                return super.toString();
        }
    }

    public C0846a() {
        this.f5347a = 0;
        this.f5348b = DefinitionKt.NO_Float_VALUE;
        this.f5349c = DefinitionKt.NO_Float_VALUE;
        this.f5350d = DefinitionKt.NO_Float_VALUE;
        this.f5351e = DefinitionKt.NO_Float_VALUE;
    }

    public C0846a(float f6, float f10, float f11, float f12) {
        this.f5347a = 1;
        this.f5348b = f6;
        this.f5349c = f10;
        this.f5350d = f11;
        this.f5351e = f12;
    }
}
