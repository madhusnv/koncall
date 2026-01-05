package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import p001o.rie;
import p001o.th3;

/* loaded from: classes2.dex */
public class kt3 {

    /* renamed from: g */
    public static final C14919a f32675g;

    /* renamed from: h */
    public static final kt3 f32676h;

    /* renamed from: i */
    public static final kt3 f32677i;

    /* renamed from: j */
    public static final kt3 f32678j;

    /* renamed from: a */
    public final ei3 f32679a;

    /* renamed from: b */
    public final ei3 f32680b;

    /* renamed from: c */
    public final ei3 f32681c;

    /* renamed from: d */
    public final ei3 f32682d;

    /* renamed from: e */
    public final int f32683e;

    /* renamed from: f */
    public final float[] f32684f;

    /* renamed from: o.kt3$a */
    public static final class C14919a {

        /* renamed from: o.kt3$a$a */
        public static final class a extends kt3 {
            public a(ei3 ei3Var, int i) {
                super(ei3Var, ei3Var, i, null);
            }

            @Override // p001o.kt3
            /* renamed from: e */
            public long mo36194e(float f, float f2, float f3, float f4) {
                return rh3.m46766a(f, f2, f3, f4, m36193d());
            }
        }

        public C14919a() {
        }

        public /* synthetic */ C14919a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final float[] m36196b(ei3 ei3Var, ei3 ei3Var2, int i) {
            if (!rie.m46840e(i, rie.f43686a.m46841a())) {
                return null;
            }
            long jM25094e = ei3Var.m25094e();
            th3.C17111a c17111a = th3.f47123a;
            boolean zM49873e = th3.m49873e(jM25094e, c17111a.m49878b());
            boolean zM49873e2 = th3.m49873e(ei3Var2.m25094e(), c17111a.m49878b());
            if (zM49873e && zM49873e2) {
                return null;
            }
            if (!zM49873e && !zM49873e2) {
                return null;
            }
            if (!zM49873e) {
                ei3Var = ei3Var2;
            }
            sq8.m48647f(ei3Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            zte zteVar = (zte) ei3Var;
            float[] fArrM38579c = zM49873e ? zteVar.m59920J().m38579c() : ec8.f21384a.m24772c();
            float[] fArrM38579c2 = zM49873e2 ? zteVar.m59920J().m38579c() : ec8.f21384a.m24772c();
            return new float[]{fArrM38579c[0] / fArrM38579c2[0], fArrM38579c[1] / fArrM38579c2[1], fArrM38579c[2] / fArrM38579c2[2]};
        }

        /* renamed from: c */
        public final kt3 m36197c() {
            return kt3.f32678j;
        }

        /* renamed from: d */
        public final kt3 m36198d() {
            return kt3.f32676h;
        }

        /* renamed from: e */
        public final kt3 m36199e() {
            return kt3.f32677i;
        }

        /* renamed from: f */
        public final kt3 m36200f(ei3 ei3Var) {
            sq8.m48649h(ei3Var, "source");
            return new a(ei3Var, rie.f43686a.m46843c());
        }
    }

    /* renamed from: o.kt3$b */
    public static final class C14920b extends kt3 {

        /* renamed from: k */
        public final zte f32685k;

        /* renamed from: l */
        public final zte f32686l;

        /* renamed from: m */
        public final float[] f32687m;

        public /* synthetic */ C14920b(zte zteVar, zte zteVar2, int i, id5 id5Var) {
            this(zteVar, zteVar2, i);
        }

        @Override // p001o.kt3
        /* renamed from: e */
        public long mo36194e(float f, float f2, float f3, float f4) {
            float fMo28788a = (float) this.f32685k.m59914D().mo28788a(f);
            float fMo28788a2 = (float) this.f32685k.m59914D().mo28788a(f2);
            float fMo28788a3 = (float) this.f32685k.m59914D().mo28788a(f3);
            return rh3.m46766a((float) this.f32686l.m59917G().mo28788a(fi3.m26726n(this.f32687m, fMo28788a, fMo28788a2, fMo28788a3)), (float) this.f32686l.m59917G().mo28788a(fi3.m26727o(this.f32687m, fMo28788a, fMo28788a2, fMo28788a3)), (float) this.f32686l.m59917G().mo28788a(fi3.m26728p(this.f32687m, fMo28788a, fMo28788a2, fMo28788a3)), f4, this.f32686l);
        }

        /* renamed from: f */
        public final float[] m36201f(zte zteVar, zte zteVar2, int i) {
            if (fi3.m26718f(zteVar.m59920J(), zteVar2.m59920J())) {
                return fi3.m26723k(zteVar2.m59916F(), zteVar.m59919I());
            }
            float[] fArrM59919I = zteVar.m59919I();
            float[] fArrM59916F = zteVar2.m59916F();
            float[] fArrM38579c = zteVar.m59920J().m38579c();
            float[] fArrM38579c2 = zteVar2.m59920J().m38579c();
            m8j m8jVarM59920J = zteVar.m59920J();
            ec8 ec8Var = ec8.f21384a;
            if (!fi3.m26718f(m8jVarM59920J, ec8Var.m24771b())) {
                float[] fArrM48953b = sv.f45989b.m48954a().m48953b();
                float[] fArrM24772c = ec8Var.m24772c();
                float[] fArrCopyOf = Arrays.copyOf(fArrM24772c, fArrM24772c.length);
                sq8.m48648g(fArrCopyOf, "copyOf(this, size)");
                fArrM59919I = fi3.m26723k(fi3.m26717e(fArrM48953b, fArrM38579c, fArrCopyOf), zteVar.m59919I());
            }
            if (!fi3.m26718f(zteVar2.m59920J(), ec8Var.m24771b())) {
                float[] fArrM48953b2 = sv.f45989b.m48954a().m48953b();
                float[] fArrM24772c2 = ec8Var.m24772c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrM24772c2, fArrM24772c2.length);
                sq8.m48648g(fArrCopyOf2, "copyOf(this, size)");
                fArrM59916F = fi3.m26722j(fi3.m26723k(fi3.m26717e(fArrM48953b2, fArrM38579c2, fArrCopyOf2), zteVar2.m59919I()));
            }
            if (rie.m46840e(i, rie.f43686a.m46841a())) {
                fArrM59919I = fi3.m26724l(new float[]{fArrM38579c[0] / fArrM38579c2[0], fArrM38579c[1] / fArrM38579c2[1], fArrM38579c[2] / fArrM38579c2[2]}, fArrM59919I);
            }
            return fi3.m26723k(fArrM59916F, fArrM59919I);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14920b(zte zteVar, zte zteVar2, int i) {
            super(zteVar, zteVar2, zteVar, zteVar2, i, null, null);
            sq8.m48649h(zteVar, "mSource");
            sq8.m48649h(zteVar2, "mDestination");
            this.f32685k = zteVar;
            this.f32686l = zteVar2;
            this.f32687m = m36201f(zteVar, zteVar2, i);
        }
    }

    static {
        id5 id5Var = null;
        C14919a c14919a = new C14919a(id5Var);
        f32675g = c14919a;
        ii3 ii3Var = ii3.f28698a;
        f32676h = c14919a.m36200f(ii3Var.m32167h());
        zte zteVarM32167h = ii3Var.m32167h();
        ei3 ei3VarM32166g = ii3Var.m32166g();
        rie.C16618a c16618a = rie.f43686a;
        f32677i = new kt3(zteVarM32167h, ei3VarM32166g, c16618a.m46842b(), id5Var);
        f32678j = new kt3(ii3Var.m32166g(), ii3Var.m32167h(), c16618a.m46842b(), id5Var);
    }

    public /* synthetic */ kt3(ei3 ei3Var, ei3 ei3Var2, int i, id5 id5Var) {
        this(ei3Var, ei3Var2, i);
    }

    /* renamed from: d */
    public final ei3 m36193d() {
        return this.f32680b;
    }

    /* renamed from: e */
    public long mo36194e(float f, float f2, float f3, float f4) {
        long jMo17013h = this.f32681c.mo17013h(f, f2, f3);
        e37 e37Var = e37.f20857a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo17013h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo17013h & 4294967295L));
        float fMo17014i = this.f32681c.mo17014i(f, f2, f3);
        float[] fArr = this.f32684f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo17014i *= fArr[2];
        }
        float f5 = fIntBitsToFloat2;
        float f6 = fIntBitsToFloat;
        return this.f32682d.mo17015j(f6, f5, fMo17014i, f4, this.f32680b);
    }

    public /* synthetic */ kt3(ei3 ei3Var, ei3 ei3Var2, ei3 ei3Var3, ei3 ei3Var4, int i, float[] fArr, id5 id5Var) {
        this(ei3Var, ei3Var2, ei3Var3, ei3Var4, i, fArr);
    }

    public kt3(ei3 ei3Var, ei3 ei3Var2, ei3 ei3Var3, ei3 ei3Var4, int i, float[] fArr) {
        sq8.m48649h(ei3Var, "source");
        sq8.m48649h(ei3Var2, FirebaseAnalytics.Param.DESTINATION);
        sq8.m48649h(ei3Var3, "transformSource");
        sq8.m48649h(ei3Var4, "transformDestination");
        this.f32679a = ei3Var;
        this.f32680b = ei3Var2;
        this.f32681c = ei3Var3;
        this.f32682d = ei3Var4;
        this.f32683e = i;
        this.f32684f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kt3(ei3 ei3Var, ei3 ei3Var2, int i) {
        sq8.m48649h(ei3Var, "source");
        sq8.m48649h(ei3Var2, FirebaseAnalytics.Param.DESTINATION);
        long jM25094e = ei3Var.m25094e();
        th3.C17111a c17111a = th3.f47123a;
        this(ei3Var, ei3Var2, th3.m49873e(jM25094e, c17111a.m49878b()) ? fi3.m26716d(ei3Var, ec8.f21384a.m24771b(), null, 2, null) : ei3Var, th3.m49873e(ei3Var2.m25094e(), c17111a.m49878b()) ? fi3.m26716d(ei3Var2, ec8.f21384a.m24771b(), null, 2, null) : ei3Var2, i, f32675g.m36196b(ei3Var, ei3Var2, i), null);
    }
}
