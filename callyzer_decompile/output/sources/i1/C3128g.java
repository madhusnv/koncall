package i1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import gx.AbstractC2747a;
import og.d2;
import p3.C5812j;
import s4.InterfaceC6747c;
import v3.AbstractC7642n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.g */
/* loaded from: classes.dex */
public final class C3128g {

    /* renamed from: a */
    public final InterfaceC6747c f16863a;

    /* renamed from: b */
    public long f16864b = 9205357640488583168L;

    /* renamed from: c */
    public final d0 f16865c;

    /* renamed from: d */
    public final k2.e1 f16866d;

    /* renamed from: e */
    public final boolean f16867e;

    /* renamed from: f */
    public boolean f16868f;

    /* renamed from: g */
    public long f16869g;

    /* renamed from: h */
    public long f16870h;

    /* renamed from: i */
    public final AbstractC7642n f16871i;

    public C3128g(Context context, InterfaceC6747c interfaceC6747c, long j6, o1.h1 h1Var) {
        this.f16863a = interfaceC6747c;
        d0 d0Var = new d0(context, d3.h0.m5149u(j6));
        this.f16865c = d0Var;
        this.f16866d = new k2.e1(qw.a0.f30746a, k2.s0.f20544c);
        this.f16867e = true;
        this.f16869g = 0L;
        this.f16870h = -1L;
        b2.a1 a1Var = new b2.a1(2, this);
        C5812j c5812j = p3.b0.f28413a;
        p3.h0 h0Var = new p3.h0(null, null, a1Var);
        this.f16871i = Build.VERSION.SDK_INT >= 31 ? new r1(h0Var, this, d0Var) : new i0(h0Var, this, d0Var, h1Var);
    }

    /* renamed from: a */
    public final void m7497a() {
        boolean z6;
        d0 d0Var = this.f16865c;
        EdgeEffect edgeEffect = d0Var.f16822d;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = !edgeEffect.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = d0Var.f16823e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 = !edgeEffect2.isFinished() || z6;
        }
        EdgeEffect edgeEffect3 = d0Var.f16824f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 = !edgeEffect3.isFinished() || z6;
        }
        EdgeEffect edgeEffect4 = d0Var.f16825g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z6) {
                z10 = false;
            }
            z6 = z10;
        }
        if (z6) {
            m7500d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7498b(long r18, k1.w1 r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C3128g.m7498b(long, k1.w1, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public final long m7499c() {
        long jM10602e = this.f16864b;
        if ((9223372034707292159L & jM10602e) == 9205357640488583168L) {
            jM10602e = d2.m10602e(this.f16869g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10602e >> 32)) / Float.intBitsToFloat((int) (this.f16869g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10602e & 4294967295L)) / Float.intBitsToFloat((int) (this.f16869g & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: d */
    public final void m7500d() {
        if (this.f16867e) {
            this.f16866d.setValue(qw.a0.f30746a);
        }
    }

    /* renamed from: e */
    public final float m7501e(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m7499c() >> 32));
        int i10 = (int) (j6 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16869g & 4294967295L));
        EdgeEffect edgeEffectM7487b = this.f16865c.m7487b();
        float fM7517g = -fIntBitsToFloat2;
        float f6 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fM7517g = AbstractC3131j.m7517g(edgeEffectM7487b, fM7517g, f6);
        } else {
            edgeEffectM7487b.onPull(fM7517g, f6);
        }
        return (i11 >= 31 ? AbstractC3131j.m7513c(edgeEffectM7487b) : 0.0f) == DefinitionKt.NO_Float_VALUE ? Float.intBitsToFloat((int) (4294967295L & this.f16869g)) * (-fM7517g) : Float.intBitsToFloat(i10);
    }

    /* renamed from: f */
    public final float m7502f(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m7499c() & 4294967295L));
        int i10 = (int) (j6 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16869g >> 32));
        EdgeEffect edgeEffectM7488c = this.f16865c.m7488c();
        float f6 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = AbstractC3131j.m7517g(edgeEffectM7488c, fIntBitsToFloat2, f6);
        } else {
            edgeEffectM7488c.onPull(fIntBitsToFloat2, f6);
        }
        return (i11 >= 31 ? AbstractC3131j.m7513c(edgeEffectM7488c) : 0.0f) == DefinitionKt.NO_Float_VALUE ? Float.intBitsToFloat((int) (this.f16869g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    /* renamed from: g */
    public final float m7503g(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m7499c() & 4294967295L));
        int i10 = (int) (j6 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16869g >> 32));
        EdgeEffect edgeEffectM7489d = this.f16865c.m7489d();
        float fM7517g = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fM7517g = AbstractC3131j.m7517g(edgeEffectM7489d, fM7517g, fIntBitsToFloat);
        } else {
            edgeEffectM7489d.onPull(fM7517g, fIntBitsToFloat);
        }
        return (i11 >= 31 ? AbstractC3131j.m7513c(edgeEffectM7489d) : 0.0f) == DefinitionKt.NO_Float_VALUE ? Float.intBitsToFloat((int) (this.f16869g >> 32)) * (-fM7517g) : Float.intBitsToFloat(i10);
    }

    /* renamed from: h */
    public final float m7504h(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m7499c() >> 32));
        int i10 = (int) (j6 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16869g & 4294967295L));
        EdgeEffect edgeEffectM7490e = this.f16865c.m7490e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = AbstractC3131j.m7517g(edgeEffectM7490e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM7490e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? AbstractC3131j.m7513c(edgeEffectM7490e) : 0.0f) == DefinitionKt.NO_Float_VALUE ? Float.intBitsToFloat((int) (this.f16869g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    /* renamed from: i */
    public final void m7505i(long j6) {
        boolean zM2290a = C0850e.m2290a(this.f16869g, 0L);
        boolean zM2290a2 = C0850e.m2290a(j6, this.f16869g);
        this.f16869g = j6;
        if (!zM2290a2) {
            long jM6747k = (AbstractC2747a.m6747k(Float.intBitsToFloat((int) (j6 & 4294967295L))) & 4294967295L) | (AbstractC2747a.m6747k(Float.intBitsToFloat((int) (j6 >> 32))) << 32);
            d0 d0Var = this.f16865c;
            d0Var.f16821c = jM6747k;
            EdgeEffect edgeEffect = d0Var.f16822d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM6747k >> 32), (int) (jM6747k & 4294967295L));
            }
            EdgeEffect edgeEffect2 = d0Var.f16823e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM6747k >> 32), (int) (jM6747k & 4294967295L));
            }
            EdgeEffect edgeEffect3 = d0Var.f16824f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM6747k & 4294967295L), (int) (jM6747k >> 32));
            }
            EdgeEffect edgeEffect4 = d0Var.f16825g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM6747k & 4294967295L), (int) (jM6747k >> 32));
            }
            EdgeEffect edgeEffect5 = d0Var.f16826h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM6747k >> 32), (int) (jM6747k & 4294967295L));
            }
            EdgeEffect edgeEffect6 = d0Var.f16827i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM6747k >> 32), (int) (jM6747k & 4294967295L));
            }
            EdgeEffect edgeEffect7 = d0Var.f16828j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM6747k & 4294967295L), (int) (jM6747k >> 32));
            }
            EdgeEffect edgeEffect8 = d0Var.f16829k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM6747k), (int) (jM6747k >> 32));
            }
        }
        if (zM2290a || zM2290a2) {
            return;
        }
        m7497a();
    }
}
