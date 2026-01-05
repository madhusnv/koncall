package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import p001o.fha;

/* loaded from: classes3.dex */
public class dha {

    /* renamed from: i */
    public static final Property f19842i = new C12914b(Float.class, "animationFraction");

    /* renamed from: j */
    public static final l37 f19843j = new C12915c("morphFactor");

    /* renamed from: a */
    public int f19844a;

    /* renamed from: b */
    public float f19845b;

    /* renamed from: c */
    public float f19846c;

    /* renamed from: d */
    public ObjectAnimator f19847d;

    /* renamed from: e */
    public y0g f19848e;

    /* renamed from: f */
    public LoadingIndicatorSpec f19849f;

    /* renamed from: g */
    public eha f19850g;

    /* renamed from: h */
    public fha.C13431a f19851h = new fha.C13431a();

    /* renamed from: o.dha$a */
    public class C12913a extends AnimatorListenerAdapter {
        public C12913a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            dha.this.f19848e.m57089s(dha.m23097a(dha.this));
        }
    }

    /* renamed from: o.dha$b */
    public class C12914b extends Property {
        public C12914b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(dha dhaVar) {
            return Float.valueOf(dhaVar.m23102f());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(dha dhaVar, Float f) {
            dhaVar.m23108l(f.floatValue());
        }
    }

    /* renamed from: o.dha$c */
    public class C12915c extends l37 {
        public C12915c(String str) {
            super(str);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(dha dhaVar) {
            return dhaVar.m23103g();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(dha dhaVar, float f) {
            dhaVar.m23109m(f);
        }
    }

    public dha(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f19849f = loadingIndicatorSpec;
    }

    /* renamed from: a */
    public static /* synthetic */ int m23097a(dha dhaVar) {
        int i = dhaVar.f19844a + 1;
        dhaVar.f19844a = i;
        return i;
    }

    /* renamed from: e */
    public void m23101e() {
        ObjectAnimator objectAnimator = this.f19847d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        y0g y0gVar = this.f19848e;
        if (y0gVar != null) {
            y0gVar.m57094x();
        }
    }

    /* renamed from: f */
    public final float m23102f() {
        return this.f19845b;
    }

    /* renamed from: g */
    public final float m23103g() {
        return this.f19846c;
    }

    /* renamed from: h */
    public void m23104h() {
        m23107k();
    }

    /* renamed from: i */
    public final void m23105i() {
        if (this.f19848e == null) {
            this.f19848e = (y0g) new y0g(this, f19843j).m57093w(new z0g().m58632h(200.0f).m58630f(0.6f)).m49137k(0.01f);
        }
        if (this.f19847d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<dha, Float>) f19842i, 0.0f, 1.0f);
            this.f19847d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            this.f19847d.setInterpolator(null);
            this.f19847d.setRepeatCount(-1);
            this.f19847d.addListener(new C12913a());
        }
    }

    /* renamed from: j */
    public void m23106j(eha ehaVar) {
        this.f19850g = ehaVar;
    }

    /* renamed from: k */
    public void m23107k() {
        this.f19844a = 1;
        m23109m(0.0f);
        this.f19851h.f23337a = this.f19849f.f12709e[0];
    }

    /* renamed from: l */
    public void m23108l(float f) {
        this.f19845b = f;
        m23111o((int) (f * 650.0f));
        eha ehaVar = this.f19850g;
        if (ehaVar != null) {
            ehaVar.invalidateSelf();
        }
    }

    /* renamed from: m */
    public void m23109m(float f) {
        this.f19846c = f;
        m23112p();
        eha ehaVar = this.f19850g;
        if (ehaVar != null) {
            ehaVar.invalidateSelf();
        }
    }

    /* renamed from: n */
    public void m23110n() {
        m23105i();
        m23107k();
        this.f19848e.m57089s(this.f19844a);
        this.f19847d.start();
    }

    /* renamed from: o */
    public final void m23111o(int i) {
        fha.C13431a c13431a = this.f19851h;
        c13431a.f23339c = ((this.f19844a - 1) * 50) + ((i / 650.0f) * 50.0f);
        c13431a.f23339c = (this.f19846c * 140.0f) % 360.0f;
    }

    /* renamed from: p */
    public final void m23112p() {
        fha.C13431a c13431a = this.f19851h;
        c13431a.f23338b = this.f19846c;
        int i = this.f19844a - 1;
        int[] iArr = this.f19849f.f12709e;
        int length = i % iArr.length;
        c13431a.f23337a = go0.m29179b().evaluate(pza.m44555a(this.f19846c - (this.f19844a - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }
}
