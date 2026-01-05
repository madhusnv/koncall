package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes2.dex */
public final class kke implements rgc {

    /* renamed from: H */
    public static final C14855b f32340H = new C14855b(null);

    /* renamed from: L */
    public static final nl7 f32341L = C14854a.f32354a;

    /* renamed from: a */
    public final AndroidComposeView f32342a;

    /* renamed from: b */
    public xk7 f32343b;

    /* renamed from: c */
    public uk7 f32344c;

    /* renamed from: d */
    public boolean f32345d;

    /* renamed from: e */
    public final cgc f32346e;

    /* renamed from: f */
    public boolean f32347f;

    /* renamed from: g */
    public boolean f32348g;

    /* renamed from: h */
    public ewc f32349h;

    /* renamed from: q */
    public final hh9 f32350q;

    /* renamed from: s */
    public final qc2 f32351s;

    /* renamed from: x */
    public long f32352x;

    /* renamed from: y */
    public final hr5 f32353y;

    /* renamed from: o.kke$a */
    public static final class C14854a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C14854a f32354a = new C14854a();

        public C14854a() {
            super(2);
        }

        /* renamed from: a */
        public final void m35811a(hr5 hr5Var, Matrix matrix) {
            sq8.m48649h(hr5Var, "rn");
            sq8.m48649h(matrix, "matrix");
            hr5Var.mo30736u(matrix);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m35811a((hr5) obj, (Matrix) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.kke$b */
    public static final class C14855b {
        public C14855b() {
        }

        public /* synthetic */ C14855b(id5 id5Var) {
            this();
        }
    }

    public kke(AndroidComposeView androidComposeView, xk7 xk7Var, uk7 uk7Var) {
        sq8.m48649h(androidComposeView, "ownerView");
        sq8.m48649h(xk7Var, "drawBlock");
        sq8.m48649h(uk7Var, "invalidateParentLayer");
        this.f32342a = androidComposeView;
        this.f32343b = xk7Var;
        this.f32344c = uk7Var;
        this.f32346e = new cgc(androidComposeView.getDensity());
        this.f32350q = new hh9(f32341L);
        this.f32351s = new qc2();
        this.f32352x = uuh.f49519a.m52046a();
        hr5 hkeVar = Build.VERSION.SDK_INT >= 29 ? new hke(androidComposeView) : new tie(androidComposeView);
        hkeVar.mo30734s(true);
        this.f32353y = hkeVar;
    }

    @Override // p001o.rgc
    /* renamed from: a */
    public void mo5102a(xk7 xk7Var, uk7 uk7Var) {
        sq8.m48649h(xk7Var, "drawBlock");
        sq8.m48649h(uk7Var, "invalidateParentLayer");
        m35809l(false);
        this.f32347f = false;
        this.f32348g = false;
        this.f32352x = uuh.f49519a.m52046a();
        this.f32343b = xk7Var;
        this.f32344c = uk7Var;
    }

    @Override // p001o.rgc
    /* renamed from: b */
    public void mo5103b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, xkf xkfVar, boolean z, qie qieVar, long j2, long j3, int i, qh9 qh9Var, zl5 zl5Var) {
        uk7 uk7Var;
        sq8.m48649h(xkfVar, "shape");
        sq8.m48649h(qh9Var, "layoutDirection");
        sq8.m48649h(zl5Var, "density");
        this.f32352x = j;
        boolean z2 = this.f32353y.mo30732q() && !this.f32346e.m21188d();
        this.f32353y.mo30731p(f);
        this.f32353y.mo30708C(f2);
        this.f32353y.mo30718c(f3);
        this.f32353y.mo30712G(f4);
        this.f32353y.mo30721f(f5);
        this.f32353y.mo30725j(f6);
        this.f32353y.mo30711F(rh3.m46769d(j2));
        this.f32353y.mo30714I(rh3.m46769d(j3));
        this.f32353y.mo30741z(f9);
        this.f32353y.mo30735t(f7);
        this.f32353y.mo30737v(f8);
        this.f32353y.mo30733r(f10);
        this.f32353y.mo30706A(uuh.m52044d(j) * this.f32353y.getWidth());
        this.f32353y.mo30707B(uuh.m52045e(j) * this.f32353y.getHeight());
        this.f32353y.mo30713H(z && xkfVar != tfe.m49810a());
        this.f32353y.mo30722g(z && xkfVar == tfe.m49810a());
        this.f32353y.mo30740y(qieVar);
        this.f32353y.mo30727l(i);
        boolean zM21191g = this.f32346e.m21191g(xkfVar, this.f32353y.mo30717b(), this.f32353y.mo30732q(), this.f32353y.mo30715J(), qh9Var, zl5Var);
        this.f32353y.mo30709D(this.f32346e.m21187c());
        boolean z3 = this.f32353y.mo30732q() && !this.f32346e.m21188d();
        if (z2 != z3 || (z3 && zM21191g)) {
            invalidate();
        } else {
            m35810m();
        }
        if (!this.f32348g && this.f32353y.mo30715J() > 0.0f && (uk7Var = this.f32344c) != null) {
            uk7Var.invoke();
        }
        this.f32350q.m30464c();
    }

    @Override // p001o.rgc
    /* renamed from: c */
    public long mo5104c(long j, boolean z) {
        if (!z) {
            return qza.m45994c(this.f32350q.m30463b(this.f32353y), j);
        }
        float[] fArrM30462a = this.f32350q.m30462a(this.f32353y);
        return fArrM30462a != null ? qza.m45994c(fArrM30462a, j) : s9c.f45035b.m48061a();
    }

    @Override // p001o.rgc
    /* renamed from: d */
    public void mo5105d(long j) {
        int iM39312e = ml8.m39312e(j);
        int iM39311d = ml8.m39311d(j);
        float f = iM39312e;
        this.f32353y.mo30706A(uuh.m52044d(this.f32352x) * f);
        float f2 = iM39311d;
        this.f32353y.mo30707B(uuh.m52045e(this.f32352x) * f2);
        hr5 hr5Var = this.f32353y;
        if (hr5Var.mo30723h(hr5Var.mo30716a(), this.f32353y.mo30730o(), this.f32353y.mo30716a() + iM39312e, this.f32353y.mo30730o() + iM39311d)) {
            this.f32346e.m21192h(jvf.m34585a(f, f2));
            this.f32353y.mo30709D(this.f32346e.m21187c());
            invalidate();
            this.f32350q.m30464c();
        }
    }

    @Override // p001o.rgc
    /* renamed from: e */
    public void mo5106e(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        Canvas canvasM38750b = md0.m38750b(mc2Var);
        if (canvasM38750b.isHardwareAccelerated()) {
            mo5111j();
            boolean z = this.f32353y.mo30715J() > 0.0f;
            this.f32348g = z;
            if (z) {
                mc2Var.mo20335e();
            }
            this.f32353y.mo30720e(canvasM38750b);
            if (this.f32348g) {
                mc2Var.mo20337h();
                return;
            }
            return;
        }
        float fMo30716a = this.f32353y.mo30716a();
        float fMo30730o = this.f32353y.mo30730o();
        float fMo30719d = this.f32353y.mo30719d();
        float fMo30739x = this.f32353y.mo30739x();
        if (this.f32353y.mo30717b() < 1.0f) {
            ewc ewcVarM18808a = this.f32349h;
            if (ewcVarM18808a == null) {
                ewcVarM18808a = bf0.m18808a();
                this.f32349h = ewcVarM18808a;
            }
            ewcVarM18808a.mo16980c(this.f32353y.mo30717b());
            canvasM38750b.saveLayer(fMo30716a, fMo30730o, fMo30719d, fMo30739x, ewcVarM18808a.mo16979b());
        } else {
            mc2Var.mo20336g();
        }
        mc2Var.mo20333c(fMo30716a, fMo30730o);
        mc2Var.mo20339j(this.f32350q.m30463b(this.f32353y));
        m35808k(mc2Var);
        xk7 xk7Var = this.f32343b;
        if (xk7Var != null) {
            xk7Var.invoke(mc2Var);
        }
        mc2Var.mo20334d();
        m35809l(false);
    }

    @Override // p001o.rgc
    /* renamed from: f */
    public void mo5107f() {
        if (this.f32353y.mo30728m()) {
            this.f32353y.mo30724i();
        }
        this.f32343b = null;
        this.f32344c = null;
        this.f32347f = true;
        m35809l(false);
        this.f32342a.i0();
        this.f32342a.g0(this);
    }

    @Override // p001o.rgc
    /* renamed from: g */
    public boolean mo5108g(long j) {
        float fM48052k = s9c.m48052k(j);
        float fM48053l = s9c.m48053l(j);
        if (this.f32353y.mo30729n()) {
            return 0.0f <= fM48052k && fM48052k < ((float) this.f32353y.getWidth()) && 0.0f <= fM48053l && fM48053l < ((float) this.f32353y.getHeight());
        }
        if (this.f32353y.mo30732q()) {
            return this.f32346e.m21189e(j);
        }
        return true;
    }

    @Override // p001o.rgc
    /* renamed from: h */
    public void mo5109h(vpb vpbVar, boolean z) {
        sq8.m48649h(vpbVar, "rect");
        if (!z) {
            qza.m45995d(this.f32350q.m30463b(this.f32353y), vpbVar);
            return;
        }
        float[] fArrM30462a = this.f32350q.m30462a(this.f32353y);
        if (fArrM30462a == null) {
            vpbVar.m53186g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            qza.m45995d(fArrM30462a, vpbVar);
        }
    }

    @Override // p001o.rgc
    /* renamed from: i */
    public void mo5110i(long j) {
        int iMo30716a = this.f32353y.mo30716a();
        int iMo30730o = this.f32353y.mo30730o();
        int iM29001f = gl8.m29001f(j);
        int iM29002g = gl8.m29002g(j);
        if (iMo30716a == iM29001f && iMo30730o == iM29002g) {
            return;
        }
        if (iMo30716a != iM29001f) {
            this.f32353y.mo30738w(iM29001f - iMo30716a);
        }
        if (iMo30730o != iM29002g) {
            this.f32353y.mo30726k(iM29002g - iMo30730o);
        }
        m35810m();
        this.f32350q.m30464c();
    }

    @Override // p001o.rgc
    public void invalidate() {
        if (this.f32345d || this.f32347f) {
            return;
        }
        this.f32342a.invalidate();
        m35809l(true);
    }

    @Override // p001o.rgc
    /* renamed from: j */
    public void mo5111j() {
        if (this.f32345d || !this.f32353y.mo30728m()) {
            m35809l(false);
            xzc xzcVarM21186b = (!this.f32353y.mo30732q() || this.f32346e.m21188d()) ? null : this.f32346e.m21186b();
            xk7 xk7Var = this.f32343b;
            if (xk7Var != null) {
                this.f32353y.mo30710E(this.f32351s, xzcVarM21186b, xk7Var);
            }
        }
    }

    /* renamed from: k */
    public final void m35808k(mc2 mc2Var) {
        if (this.f32353y.mo30732q() || this.f32353y.mo30729n()) {
            this.f32346e.m21185a(mc2Var);
        }
    }

    /* renamed from: l */
    public final void m35809l(boolean z) {
        if (z != this.f32345d) {
            this.f32345d = z;
            this.f32342a.b0(this, z);
        }
    }

    /* renamed from: m */
    public final void m35810m() {
        if (Build.VERSION.SDK_INT >= 26) {
            tcj.f46877a.m49750a(this.f32342a);
        } else {
            this.f32342a.invalidate();
        }
    }
}
