package g4;

import a1.C0005d;
import android.text.Layout;
import c3.C0848c;
import c4.C0859i;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1552f;
import d3.C1559m;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.C2196b;
import f3.C2202h;
import f3.InterfaceC2198d;
import g1.y0;
import h4.C2841r;
import i2.AbstractC3154g;
import k2.h2;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4165w;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import m4.AbstractC4646a;
import nf.C5047i;
import og.d2;
import og.yf;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.p */
/* loaded from: classes.dex */
public final class C2500p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f13691a;

    /* renamed from: b */
    public final /* synthetic */ long f13692b;

    /* renamed from: c */
    public final /* synthetic */ Object f13693c;

    /* renamed from: d */
    public final /* synthetic */ Object f13694d;

    /* renamed from: e */
    public final /* synthetic */ Object f13695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2500p(long j6, float[] fArr, C4166x c4166x, C4165w c4165w) {
        super(1);
        this.f13691a = 0;
        this.f13692b = j6;
        this.f13693c = fArr;
        this.f13694d = c4166x;
        this.f13695e = c4165w;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Throwable {
        float[] fArr;
        int i10;
        boolean z6;
        float fM2298a;
        float fM2298a2;
        long j6;
        switch (this.f13691a) {
            case 0:
                C2503s c2503s = (C2503s) obj;
                float[] fArr2 = (float[]) this.f13693c;
                C4166x c4166x = (C4166x) this.f13694d;
                C4165w c4165w = (C4165w) this.f13695e;
                int i11 = c2503s.f13710b;
                C2486b c2486b = c2503s.f13709a;
                int iM6457d = c2503s.f13711c;
                long j10 = this.f13692b;
                int iM6458e = i11 > n0.m6458e(j10) ? c2503s.f13710b : n0.m6458e(j10);
                if (iM6457d >= n0.m6457d(j10)) {
                    iM6457d = n0.m6457d(j10);
                }
                long jM11072a = yf.m11072a(c2503s.m6482d(iM6458e), c2503s.m6482d(iM6457d));
                int i12 = c4166x.f21162a;
                C2841r c2841r = c2486b.f13558d;
                int iM6458e2 = n0.m6458e(jM11072a);
                int iM6457d2 = n0.m6457d(jM11072a);
                Layout layout = c2841r.f15832f;
                int length = layout.getText().length();
                if (iM6458e2 < 0) {
                    AbstractC4646a.m9525a("startOffset must be > 0");
                }
                if (iM6458e2 >= length) {
                    AbstractC4646a.m9525a("startOffset must be less than text length");
                }
                if (iM6457d2 <= iM6458e2) {
                    AbstractC4646a.m9525a("endOffset must be greater than startOffset");
                }
                if (iM6457d2 > length) {
                    AbstractC4646a.m9525a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i12 < (iM6457d2 - iM6458e2) * 4) {
                    AbstractC4646a.m9525a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM6458e2);
                int lineForOffset2 = layout.getLineForOffset(iM6457d2 - 1);
                C0859i c0859i = new C0859i(c2841r);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i13 = i12;
                        int iM6972f = c2841r.m6972f(lineForOffset);
                        int iMax = Math.max(iM6458e2, lineStart);
                        int iMin = Math.min(iM6457d2, iM6972f);
                        float fM6973g = c2841r.m6973g(lineForOffset);
                        float fM6971e = c2841r.m6971e(lineForOffset);
                        fArr = fArr2;
                        C2841r c2841r2 = c2841r;
                        boolean z10 = false;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i14 = iMax;
                        int i15 = i13;
                        while (i14 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i14);
                            if (!z11 || zIsRtlCharAt) {
                                i10 = iMin;
                                if (z11 && zIsRtlCharAt) {
                                    z10 = false;
                                    float fM2298a3 = c0859i.m2298a(i14, false, false, false);
                                    z6 = z11;
                                    fM2298a = c0859i.m2298a(i14 + 1, true, true, false);
                                    fM2298a2 = fM2298a3;
                                } else {
                                    z6 = z11;
                                    z10 = false;
                                    if (z6 || !zIsRtlCharAt) {
                                        fM2298a = c0859i.m2298a(i14, false, false, false);
                                        fM2298a2 = c0859i.m2298a(i14 + 1, true, true, false);
                                    } else {
                                        fM2298a2 = c0859i.m2298a(i14, false, false, true);
                                        fM2298a = c0859i.m2298a(i14 + 1, true, true, true);
                                    }
                                }
                                fArr[i15] = fM2298a;
                                fArr[i15 + 1] = fM6973g;
                                fArr[i15 + 2] = fM2298a2;
                                fArr[i15 + 3] = fM6971e;
                                i15 += 4;
                                i14++;
                                z11 = z6;
                                iMin = i10;
                            } else {
                                i10 = iMin;
                                fM2298a = c0859i.m2298a(i14, z10, z10, true);
                                z6 = z11;
                                fM2298a2 = c0859i.m2298a(i14 + 1, true, true, true);
                            }
                            z10 = false;
                            fArr[i15] = fM2298a;
                            fArr[i15 + 1] = fM6973g;
                            fArr[i15 + 2] = fM2298a2;
                            fArr[i15 + 3] = fM6971e;
                            i15 += 4;
                            i14++;
                            z11 = z6;
                            iMin = i10;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i12 = i15;
                            fArr2 = fArr;
                            c2841r = c2841r2;
                        }
                    }
                } else {
                    fArr = fArr2;
                }
                int iM6456c = (n0.m6456c(jM11072a) * 4) + c4166x.f21162a;
                for (int i16 = c4166x.f21162a; i16 < iM6456c; i16 += 4) {
                    int i17 = i16 + 1;
                    float f6 = fArr[i17];
                    float f10 = c4165w.f21161a;
                    fArr[i17] = f6 + f10;
                    int i18 = i16 + 3;
                    fArr[i18] = fArr[i18] + f10;
                }
                c4166x.f21162a = iM6456c;
                c4165w.f21161a = c2486b.m6414b() + c4165w.f21161a;
                return qw.a0.f30746a;
            case 1:
                v3.i0 i0Var = (v3.i0) obj;
                i0Var.m14622b();
                C0848c c0848c = (C0848c) this.f13693c;
                float f11 = c0848c.f5354a;
                float f12 = c0848c.f5355b;
                C4168z c4168z = (C4168z) this.f13694d;
                long j11 = this.f13692b;
                C1559m c1559m = (C1559m) this.f13695e;
                C2196b c2196b = i0Var.f36917a;
                ((C5047i) c2196b.f10124b.f24b).m9985W(f11, f12);
                try {
                    InterfaceC2198d.y0(i0Var, (C1552f) c4168z.f21164a, j11, 0L, DefinitionKt.NO_Float_VALUE, c1559m, 0, 890);
                    ((C5047i) c2196b.f10124b.f24b).m9985W(-f11, -f12);
                    return qw.a0.f30746a;
                } catch (Throwable th2) {
                    ((C5047i) c2196b.f10124b.f24b).m9985W(-f11, -f12);
                    throw th2;
                }
            default:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                float fFloatValue = ((Number) ((InterfaceC2137a) this.f13693c).invoke()).floatValue();
                float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, DefinitionKt.NO_Float_VALUE) * 5) / 3;
                float fM11911b = w9.m11911b(Math.abs(fFloatValue) - 1.0f, DefinitionKt.NO_Float_VALUE, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fM11911b - (((float) Math.pow(fM11911b, 2)) / 4))) * 0.5f;
                float f13 = 360;
                float f14 = fPow * f13;
                float f15 = ((0.8f * fMax) + fPow) * f13;
                float fMin = Math.min(1.0f, fMax);
                y0 y0Var = new y0();
                y0Var.f11118a = f15;
                y0Var.f11119b = fMin;
                float fFloatValue2 = ((Number) ((h2) this.f13694d).getValue()).floatValue();
                long j12 = this.f13692b;
                d3.g0 g0Var = (d3.g0) this.f13695e;
                long jI0 = interfaceC2198d.i0();
                C0005d c0005dMo5899X = interfaceC2198d.mo5899X();
                long jM81z = c0005dMo5899X.m81z();
                c0005dMo5899X.m75t().mo5107i();
                try {
                    ((C5047i) c0005dMo5899X.f24b).m9983U(fPow, jI0);
                    float fMo8435T = interfaceC2198d.mo8435T(AbstractC3154g.f17043b);
                    float f16 = AbstractC3154g.f17042a;
                    float fMo8435T2 = (interfaceC2198d.mo8435T(f16) / 2.0f) + fMo8435T;
                    long jM10602e = d2.m10602e(interfaceC2198d.mo5913e());
                    int i19 = (int) (jM10602e >> 32);
                    int i20 = (int) (jM10602e & 4294967295L);
                    C0848c c0848c2 = new C0848c(Float.intBitsToFloat(i19) - fMo8435T2, Float.intBitsToFloat(i20) - fMo8435T2, Float.intBitsToFloat(i19) + fMo8435T2, Float.intBitsToFloat(i20) + fMo8435T2);
                    try {
                        interfaceC2198d.mo5904i(j12, f14, f15 - f14, c0848c2.m2282d(), c0848c2.m2281c(), (832 & 64) != 0 ? 1.0f : fFloatValue2, new C2202h(interfaceC2198d.mo8435T(f16), DefinitionKt.NO_Float_VALUE, 0, 0, 26));
                        AbstractC3154g.m7529c(interfaceC2198d, g0Var, c0848c2, j12, fFloatValue2, y0Var);
                        i0.m0.m7392y(c0005dMo5899X, jM81z);
                        return qw.a0.f30746a;
                    } catch (Throwable th3) {
                        th = th3;
                        j6 = jM81z;
                        i0.m0.m7392y(c0005dMo5899X, j6);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j6 = jM81z;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2500p(Object obj, Object obj2, long j6, Object obj3, int i10) {
        super(1);
        this.f13691a = i10;
        this.f13693c = obj;
        this.f13694d = obj2;
        this.f13692b = j6;
        this.f13695e = obj3;
    }
}
