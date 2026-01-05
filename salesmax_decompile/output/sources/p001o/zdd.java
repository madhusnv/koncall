package p001o;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import p001o.aed;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public class zdd implements zzc, gc1.InterfaceC13670b, ad9 {

    /* renamed from: b */
    public final String f56980b;

    /* renamed from: c */
    public final ema f56981c;

    /* renamed from: d */
    public final aed.EnumC12150a f56982d;

    /* renamed from: e */
    public final boolean f56983e;

    /* renamed from: f */
    public final gc1 f56984f;

    /* renamed from: g */
    public final gc1 f56985g;

    /* renamed from: h */
    public final gc1 f56986h;

    /* renamed from: i */
    public final gc1 f56987i;

    /* renamed from: j */
    public final gc1 f56988j;

    /* renamed from: k */
    public final gc1 f56989k;

    /* renamed from: l */
    public final gc1 f56990l;

    /* renamed from: n */
    public boolean f56992n;

    /* renamed from: a */
    public final Path f56979a = new Path();

    /* renamed from: m */
    public final qp3 f56991m = new qp3();

    /* renamed from: o.zdd$a */
    public static /* synthetic */ class C18618a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56993a;

        static {
            int[] iArr = new int[aed.EnumC12150a.values().length];
            f56993a = iArr;
            try {
                iArr[aed.EnumC12150a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56993a[aed.EnumC12150a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public zdd(ema emaVar, hc1 hc1Var, aed aedVar) {
        this.f56981c = emaVar;
        this.f56980b = aedVar.m16970d();
        aed.EnumC12150a enumC12150aM16976j = aedVar.m16976j();
        this.f56982d = enumC12150aM16976j;
        this.f56983e = aedVar.m16977k();
        gc1 gc1VarMo24960a = aedVar.m16973g().mo24960a();
        this.f56984f = gc1VarMo24960a;
        gc1 gc1VarMo24960a2 = aedVar.m16974h().mo24960a();
        this.f56985g = gc1VarMo24960a2;
        gc1 gc1VarMo24960a3 = aedVar.m16975i().mo24960a();
        this.f56986h = gc1VarMo24960a3;
        gc1 gc1VarMo24960a4 = aedVar.m16971e().mo24960a();
        this.f56988j = gc1VarMo24960a4;
        gc1 gc1VarMo24960a5 = aedVar.m16972f().mo24960a();
        this.f56990l = gc1VarMo24960a5;
        aed.EnumC12150a enumC12150a = aed.EnumC12150a.STAR;
        if (enumC12150aM16976j == enumC12150a) {
            this.f56987i = aedVar.m16968b().mo24960a();
            this.f56989k = aedVar.m16969c().mo24960a();
        } else {
            this.f56987i = null;
            this.f56989k = null;
        }
        hc1Var.m30184i(gc1VarMo24960a);
        hc1Var.m30184i(gc1VarMo24960a2);
        hc1Var.m30184i(gc1VarMo24960a3);
        hc1Var.m30184i(gc1VarMo24960a4);
        hc1Var.m30184i(gc1VarMo24960a5);
        if (enumC12150aM16976j == enumC12150a) {
            hc1Var.m30184i(this.f56987i);
            hc1Var.m30184i(this.f56989k);
        }
        gc1VarMo24960a.m28369a(this);
        gc1VarMo24960a2.m28369a(this);
        gc1VarMo24960a3.m28369a(this);
        gc1VarMo24960a4.m28369a(this);
        gc1VarMo24960a5.m28369a(this);
        if (enumC12150aM16976j == enumC12150a) {
            this.f56987i.m28369a(this);
            this.f56989k.m28369a(this);
        }
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        m59258i();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            j14 j14Var = (j14) list.get(i);
            if (j14Var instanceof txh) {
                txh txhVar = (txh) j14Var;
                if (txhVar.m50755i() == plf.EnumC16137a.SIMULTANEOUSLY) {
                    this.f56991m.m45742a(txhVar);
                    txhVar.m50751c(this);
                }
            }
        }
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        zeb.m59358m(yc9Var, i, list, yc9Var2, this);
    }

    @Override // p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        gc1 gc1Var;
        gc1 gc1Var2;
        if (obj == mma.f35732w) {
            this.f56984f.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35733x) {
            this.f56986h.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35723n) {
            this.f56985g.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35734y && (gc1Var2 = this.f56987i) != null) {
            gc1Var2.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35735z) {
            this.f56988j.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35696A && (gc1Var = this.f56989k) != null) {
            gc1Var.m28380n(qmaVar);
        } else if (obj == mma.f35697B) {
            this.f56990l.m28380n(qmaVar);
        }
    }

    /* renamed from: f */
    public final void m59256f() {
        int i;
        double d;
        double d2;
        double d3;
        int iFloor = (int) Math.floor(((Float) this.f56984f.mo28376h()).floatValue());
        double radians = Math.toRadians((this.f56986h == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Float) r2.mo28376h()).floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = ((Float) this.f56990l.mo28376h()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.f56988j.mo28376h()).floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.f56979a.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double dCeil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < dCeil) {
            float fCos2 = (float) (Math.cos(d7) * d5);
            double d8 = dCeil;
            float fSin2 = (float) (d5 * Math.sin(d7));
            if (fFloatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d3 = d6;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.f56979a.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f56979a.lineTo(fCos2, fSin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF pointF = (PointF) this.f56985g.mo28376h();
        this.f56979a.offset(pointF.x, pointF.y);
        this.f56979a.close();
    }

    @Override // p001o.j14
    public String getName() {
        return this.f56980b;
    }

    @Override // p001o.zzc
    public Path getPath() {
        if (this.f56992n) {
            return this.f56979a;
        }
        this.f56979a.reset();
        if (this.f56983e) {
            this.f56992n = true;
            return this.f56979a;
        }
        int i = C18618a.f56993a[this.f56982d.ordinal()];
        if (i == 1) {
            m59257h();
        } else if (i == 2) {
            m59256f();
        }
        this.f56979a.close();
        this.f56991m.m45743b(this.f56979a);
        this.f56992n = true;
        return this.f56979a;
    }

    /* renamed from: h */
    public final void m59257h() {
        int i;
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        double d3;
        float fFloatValue = ((Float) this.f56984f.mo28376h()).floatValue();
        double radians = Math.toRadians((this.f56986h == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((Float) r2.mo28376h()).floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f9 = (float) (6.283185307179586d / d4);
        float f10 = f9 / 2.0f;
        float f11 = fFloatValue - ((int) fFloatValue);
        int i2 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f11) * f10;
        }
        float fFloatValue2 = ((Float) this.f56988j.mo28376h()).floatValue();
        float fFloatValue3 = ((Float) this.f56987i.mo28376h()).floatValue();
        gc1 gc1Var = this.f56989k;
        float fFloatValue4 = gc1Var != null ? ((Float) gc1Var.mo28376h()).floatValue() / 100.0f : 0.0f;
        gc1 gc1Var2 = this.f56990l;
        float fFloatValue5 = gc1Var2 != null ? ((Float) gc1Var2.mo28376h()).floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((fFloatValue2 - fFloatValue3) * f11) + fFloatValue3;
            i = i2;
            double d5 = f3;
            float fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.f56979a.moveTo(fCos, fSin);
            d = radians + ((f9 * f11) / 2.0f);
            f = fCos;
            f2 = f10;
        } else {
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.f56979a.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f10;
            d = radians + f2;
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f12 = f2;
        float f13 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 >= dCeil) {
                PointF pointF = (PointF) this.f56985g.mo28376h();
                this.f56979a.offset(pointF.x, pointF.y);
                this.f56979a.close();
                return;
            }
            float f14 = z ? fFloatValue2 : fFloatValue3;
            if (f3 == 0.0f || d7 != dCeil - 2.0d) {
                f4 = f9;
                f5 = f12;
            } else {
                f4 = f9;
                f5 = (f9 * f11) / 2.0f;
            }
            if (f3 == 0.0f || d7 != dCeil - 1.0d) {
                d2 = d7;
                f6 = f3;
                f3 = f14;
            } else {
                d2 = d7;
                f6 = f3;
            }
            double d8 = f3;
            double d9 = dCeil;
            float fCos3 = (float) (d8 * Math.cos(d));
            float fSin3 = (float) (d8 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f56979a.lineTo(fCos3, fSin3);
                d3 = d;
                f7 = fFloatValue4;
                f8 = fFloatValue5;
            } else {
                f7 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f13) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f8 = fFloatValue5;
                d3 = d;
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f15 = z ? f7 : f8;
                float f16 = z ? f8 : f7;
                float f17 = (z ? fFloatValue3 : fFloatValue2) * f15 * 0.47829f;
                float f18 = fCos4 * f17;
                float f19 = f17 * fSin4;
                float f20 = (z ? fFloatValue2 : fFloatValue3) * f16 * 0.47829f;
                float f21 = fCos5 * f20;
                float f22 = f20 * fSin5;
                if (i != 0) {
                    if (i3 == 0) {
                        f18 *= f11;
                        f19 *= f11;
                    } else if (d2 == d9 - 1.0d) {
                        f21 *= f11;
                        f22 *= f11;
                    }
                }
                this.f56979a.cubicTo(f13 - f18, fSin - f19, fCos3 + f21, fSin3 + f22, fCos3, fSin3);
            }
            d = d3 + f5;
            z = !z;
            i3++;
            f13 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f8;
            fFloatValue4 = f7;
            f3 = f6;
            f9 = f4;
            dCeil = d9;
        }
    }

    /* renamed from: i */
    public final void m59258i() {
        this.f56992n = false;
        this.f56981c.invalidateSelf();
    }
}
