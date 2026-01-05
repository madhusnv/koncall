package k1;

import a2.C0036i;
import a3.C0045d;
import androidx.compose.foundation.gestures.AbstractC0241a;
import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import hp.C2995b;
import i1.C3128g;
import o3.C5281d;
import o3.C5284g;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a */
    public q1 f20309a;

    /* renamed from: b */
    public C3128g f20310b;

    /* renamed from: c */
    public k0 f20311c;

    /* renamed from: d */
    public x0 f20312d;

    /* renamed from: e */
    public boolean f20313e;

    /* renamed from: f */
    public C5281d f20314f;

    /* renamed from: g */
    public final C0036i f20315g;

    /* renamed from: h */
    public boolean f20316h;

    /* renamed from: i */
    public int f20317i = 1;

    /* renamed from: j */
    public d1 f20318j = AbstractC0241a.f1937a;

    /* renamed from: k */
    public final v1 f20319k = new v1(this);

    /* renamed from: l */
    public final C0045d f20320l = new C0045d(19, this);

    public x1(q1 q1Var, C3128g c3128g, k0 k0Var, x0 x0Var, boolean z6, C5281d c5281d, C0036i c0036i) {
        this.f20309a = q1Var;
        this.f20310b = c3128g;
        this.f20311c = k0Var;
        this.f20312d = x0Var;
        this.f20313e = z6;
        this.f20314f = c5281d;
        this.f20315g = c0036i;
    }

    /* renamed from: a */
    public static final long m8475a(x1 x1Var, d1 d1Var, long j6, int i10) {
        C5284g c5284g = x1Var.f20314f.f25935a;
        C5284g c5284g2 = null;
        C5284g c5284g3 = (c5284g == null || !c5284g.f37683p) ? null : (C5284g) AbstractC7634f.m14549j(c5284g);
        long jMo6161B = c5284g3 != null ? c5284g3.mo6161B(i10, j6) : 0L;
        long jM2275f = C0847b.m2275f(j6, jMo6161B);
        long jM8478d = x1Var.m8478d(x1Var.m8481g(d1Var.mo8445a(x1Var.m8480f(x1Var.m8478d(C0847b.m2270a(DefinitionKt.NO_Float_VALUE, x1Var.f20312d == x0.Horizontal ? 1 : 2, jM2275f))))));
        long jM2275f2 = C0847b.m2275f(jM2275f, jM8478d);
        C5284g c5284g4 = x1Var.f20314f.f25935a;
        if (c5284g4 != null && c5284g4.f37683p) {
            c5284g2 = (C5284g) AbstractC7634f.m14549j(c5284g4);
        }
        C5284g c5284g5 = c5284g2;
        return C0847b.m2276g(C0847b.m2276g(jMo6161B, jM8478d), c5284g5 != null ? c5284g5.d0(i10, jM8478d, jM2275f2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8476b(long r11, ww.AbstractC8193c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof k1.s1
            if (r0 == 0) goto L13
            r0 = r13
            k1.s1 r0 = (k1.s1) r0
            int r1 = r0.f20229e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20229e = r1
            goto L18
        L13:
            k1.s1 r0 = new k1.s1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f20227c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20229e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.y r11 = r0.f20226b
            k1.x1 r12 = r0.f20225a
            og.od.m10798c(r13)
            r5 = r10
            goto L59
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            og.od.m10798c(r13)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            r6.f21163a = r11
            r10.f20316h = r3
            i1.y0 r13 = i1.y0.Default
            k1.u1 r4 = new k1.u1
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.f20225a = r5
            r0.f20226b = r6
            r0.f20229e = r3
            java.lang.Object r11 = r10.m8479e(r13, r4, r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            r12 = r5
            r11 = r6
        L59:
            r13 = 0
            r12.f20316h = r13
            long r11 = r11.f21163a
            s4.q r13 = new s4.q
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.x1.m8476b(long, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final float m8477c(float f6) {
        return this.f20313e ? f6 * (-1) : f6;
    }

    /* renamed from: d */
    public final long m8478d(long j6) {
        return this.f20313e ? C0847b.m2277h(-1.0f, j6) : j6;
    }

    /* renamed from: e */
    public final Object m8479e(i1.y0 y0Var, InterfaceC2141e interfaceC2141e, AbstractC8193c abstractC8193c) {
        Object objMo7521b = this.f20309a.mo7521b(y0Var, new C2995b(this, interfaceC2141e, (InterfaceC7559c) null, 12), abstractC8193c);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    /* renamed from: f */
    public final float m8480f(long j6) {
        return Float.intBitsToFloat((int) (this.f20312d == x0.Horizontal ? j6 >> 32 : j6 & 4294967295L));
    }

    /* renamed from: g */
    public final long m8481g(float f6) {
        long jFloatToRawIntBits;
        long j6;
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            return 0L;
        }
        if (this.f20312d == x0.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
            jFloatToRawIntBits = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
            j6 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE);
            jFloatToRawIntBits = Float.floatToRawIntBits(f6);
            j6 = jFloatToRawIntBits3 << 32;
        }
        return j6 | (jFloatToRawIntBits & 4294967295L);
    }
}
