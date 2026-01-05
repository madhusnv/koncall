package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.aza;
import p001o.b9e;
import p001o.c64;
import p001o.fgd;
import p001o.gh0;
import p001o.gue;
import p001o.jk1;
import p001o.lh0;
import p001o.nd8;
import p001o.r6e;
import p001o.rlf;
import p001o.rza;
import p001o.smb;
import p001o.umb;
import p001o.vkf;
import p001o.x5e;
import p001o.ykf;
import p001o.zya;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes3.dex */
public class C11060a {

    /* renamed from: C */
    public static final TimeInterpolator f12601C = gh0.f25148c;

    /* renamed from: D */
    public static final int f12602D = x5e.motionDurationLong2;

    /* renamed from: E */
    public static final int f12603E = x5e.motionEasingEmphasizedInterpolator;

    /* renamed from: F */
    public static final int f12604F = x5e.motionDurationMedium1;

    /* renamed from: G */
    public static final int f12605G = x5e.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: H */
    public static final int[] f12606H = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: I */
    public static final int[] f12607I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J */
    public static final int[] f12608J = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K */
    public static final int[] f12609K = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: L */
    public static final int[] f12610L = {R.attr.state_enabled};

    /* renamed from: M */
    public static final int[] f12611M = new int[0];

    /* renamed from: B */
    public ViewTreeObserver.OnPreDrawListener f12613B;

    /* renamed from: a */
    public ykf f12614a;

    /* renamed from: b */
    public zya f12615b;

    /* renamed from: c */
    public Drawable f12616c;

    /* renamed from: d */
    public jk1 f12617d;

    /* renamed from: e */
    public Drawable f12618e;

    /* renamed from: f */
    public boolean f12619f;

    /* renamed from: h */
    public float f12621h;

    /* renamed from: i */
    public float f12622i;

    /* renamed from: j */
    public float f12623j;

    /* renamed from: k */
    public int f12624k;

    /* renamed from: l */
    public StateListAnimator f12625l;

    /* renamed from: m */
    public Animator f12626m;

    /* renamed from: n */
    public smb f12627n;

    /* renamed from: o */
    public smb f12628o;

    /* renamed from: q */
    public int f12630q;

    /* renamed from: s */
    public ArrayList f12632s;

    /* renamed from: t */
    public ArrayList f12633t;

    /* renamed from: u */
    public ArrayList f12634u;

    /* renamed from: v */
    public final FloatingActionButton f12635v;

    /* renamed from: w */
    public final vkf f12636w;

    /* renamed from: g */
    public boolean f12620g = true;

    /* renamed from: p */
    public float f12629p = 1.0f;

    /* renamed from: r */
    public int f12631r = 0;

    /* renamed from: x */
    public final Rect f12637x = new Rect();

    /* renamed from: y */
    public final RectF f12638y = new RectF();

    /* renamed from: z */
    public final RectF f12639z = new RectF();

    /* renamed from: A */
    public final Matrix f12612A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f12640a;

        /* renamed from: b */
        public final /* synthetic */ boolean f12641b;

        /* renamed from: c */
        public final /* synthetic */ g f12642c;

        public a(boolean z, g gVar) {
            this.f12641b = z;
            this.f12642c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12640a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11060a.this.f12631r = 0;
            C11060a.this.f12626m = null;
            if (this.f12640a) {
                return;
            }
            FloatingActionButton floatingActionButton = C11060a.this.f12635v;
            boolean z = this.f12641b;
            floatingActionButton.m14768b(z ? 8 : 4, z);
            g gVar = this.f12642c;
            if (gVar != null) {
                gVar.mo14661b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11060a.this.f12635v.m14768b(0, this.f12641b);
            C11060a.this.f12631r = 1;
            C11060a.this.f12626m = animator;
            this.f12640a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f12644a;

        /* renamed from: b */
        public final /* synthetic */ g f12645b;

        public b(boolean z, g gVar) {
            this.f12644a = z;
            this.f12645b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C11060a.this.f12631r = 0;
            C11060a.this.f12626m = null;
            g gVar = this.f12645b;
            if (gVar != null) {
                gVar.mo14660a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11060a.this.f12635v.m14768b(0, this.f12644a);
            C11060a.this.f12631r = 2;
            C11060a.this.f12626m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    public class c extends rza {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C11060a.this.f12629p = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    public class d implements TypeEvaluator {

        /* renamed from: a */
        public final FloatEvaluator f12648a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f, Float f2, Float f3) {
            float fFloatValue = this.f12648a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    public static class e extends zya {
        public e(ykf ykfVar) {
            super(ykfVar);
        }

        @Override // p001o.zya, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    public interface f {
        /* renamed from: a */
        void mo14665a();

        /* renamed from: b */
        void mo14666b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    public interface g {
        /* renamed from: a */
        void mo14660a();

        /* renamed from: b */
        void mo14661b();
    }

    public C11060a(FloatingActionButton floatingActionButton, vkf vkfVar) {
        this.f12635v = floatingActionButton;
        this.f12636w = vkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m14667D(float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f12635v.setAlpha(gh0.m28648b(f2, f3, 0.0f, 0.2f, fFloatValue));
        this.f12635v.setScaleX(gh0.m28647a(f4, f5, fFloatValue));
        this.f12635v.setScaleY(gh0.m28647a(f6, f5, fFloatValue));
        this.f12629p = gh0.m28647a(f7, f8, fFloatValue);
        m14700h(gh0.m28647a(f7, f8, fFloatValue), matrix);
        this.f12635v.setImageMatrix(matrix);
    }

    /* renamed from: A */
    public void m14672A(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        zya zyaVarM14706n = m14706n();
        this.f12615b = zyaVarM14706n;
        zyaVarM14706n.setTintList(colorStateList);
        if (mode != null) {
            this.f12615b.setTintMode(mode);
        }
        this.f12615b.m60115U(this.f12635v.getContext());
        if (i > 0) {
            this.f12617d = m14702j(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) fgd.m26663g(this.f12617d), (Drawable) fgd.m26663g(this.f12615b)});
        } else {
            this.f12617d = null;
            layerDrawable = this.f12615b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(gue.m29519d(colorStateList2), layerDrawable, null);
        this.f12616c = rippleDrawable;
        this.f12618e = rippleDrawable;
    }

    /* renamed from: B */
    public boolean m14673B() {
        return this.f12635v.getVisibility() == 0 ? this.f12631r == 1 : this.f12631r != 2;
    }

    /* renamed from: C */
    public boolean m14674C() {
        return this.f12635v.getVisibility() != 0 ? this.f12631r == 2 : this.f12631r != 1;
    }

    /* renamed from: E */
    public void m14675E() {
        zya zyaVar = this.f12615b;
        if (zyaVar != null) {
            aza.m18045f(this.f12635v, zyaVar);
        }
    }

    /* renamed from: F */
    public void m14676F() {
        d0();
    }

    /* renamed from: G */
    public void m14677G() {
        ViewTreeObserver viewTreeObserver = this.f12635v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f12613B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f12613B = null;
        }
    }

    /* renamed from: H */
    public void m14678H(float f2, float f3, float f4) {
        if (this.f12635v.getStateListAnimator() == this.f12625l) {
            StateListAnimator stateListAnimatorM14704l = m14704l(f2, f3, f4);
            this.f12625l = stateListAnimatorM14704l;
            this.f12635v.setStateListAnimator(stateListAnimatorM14704l);
        }
        if (m14696Z()) {
            d0();
        }
    }

    /* renamed from: I */
    public void m14679I(Rect rect) {
        fgd.m26664h(this.f12618e, "Didn't initialize content background");
        if (!m14696Z()) {
            this.f12636w.mo14663b(this.f12618e);
        } else {
            this.f12636w.mo14663b(new InsetDrawable(this.f12618e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    /* renamed from: J */
    public void m14680J() {
        ArrayList arrayList = this.f12634u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo14666b();
            }
        }
    }

    /* renamed from: K */
    public void m14681K() {
        ArrayList arrayList = this.f12634u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo14665a();
            }
        }
    }

    /* renamed from: L */
    public void m14682L(ColorStateList colorStateList) {
        zya zyaVar = this.f12615b;
        if (zyaVar != null) {
            zyaVar.setTintList(colorStateList);
        }
        jk1 jk1Var = this.f12617d;
        if (jk1Var != null) {
            jk1Var.m33894c(colorStateList);
        }
    }

    /* renamed from: M */
    public void m14683M(PorterDuff.Mode mode) {
        zya zyaVar = this.f12615b;
        if (zyaVar != null) {
            zyaVar.setTintMode(mode);
        }
    }

    /* renamed from: N */
    public final void m14684N(float f2) {
        if (this.f12621h != f2) {
            this.f12621h = f2;
            m14678H(f2, this.f12622i, this.f12623j);
        }
    }

    /* renamed from: O */
    public void m14685O(boolean z) {
        this.f12619f = z;
    }

    /* renamed from: P */
    public final void m14686P(smb smbVar) {
        this.f12628o = smbVar;
    }

    /* renamed from: Q */
    public final void m14687Q(float f2) {
        if (this.f12622i != f2) {
            this.f12622i = f2;
            m14678H(this.f12621h, f2, this.f12623j);
        }
    }

    /* renamed from: R */
    public final void m14688R(float f2) {
        this.f12629p = f2;
        Matrix matrix = this.f12612A;
        m14700h(f2, matrix);
        this.f12635v.setImageMatrix(matrix);
    }

    /* renamed from: S */
    public final void m14689S(int i) {
        if (this.f12630q != i) {
            this.f12630q = i;
            c0();
        }
    }

    /* renamed from: T */
    public void m14690T(int i) {
        this.f12624k = i;
    }

    /* renamed from: U */
    public final void m14691U(float f2) {
        if (this.f12623j != f2) {
            this.f12623j = f2;
            m14678H(this.f12621h, this.f12622i, f2);
        }
    }

    /* renamed from: V */
    public void m14692V(ColorStateList colorStateList) {
        Drawable drawable = this.f12616c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(gue.m29519d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(gue.m29519d(colorStateList));
        }
    }

    /* renamed from: W */
    public void m14693W(boolean z) {
        this.f12620g = z;
        d0();
    }

    /* renamed from: X */
    public final void m14694X(ykf ykfVar) {
        this.f12614a = ykfVar;
        zya zyaVar = this.f12615b;
        if (zyaVar != null) {
            zyaVar.setShapeAppearanceModel(ykfVar);
        }
        Object obj = this.f12616c;
        if (obj instanceof rlf) {
            ((rlf) obj).setShapeAppearanceModel(ykfVar);
        }
        jk1 jk1Var = this.f12617d;
        if (jk1Var != null) {
            jk1Var.m33897f(ykfVar);
        }
    }

    /* renamed from: Y */
    public final void m14695Y(smb smbVar) {
        this.f12627n = smbVar;
    }

    /* renamed from: Z */
    public boolean m14696Z() {
        return this.f12636w.mo14664c() || m14718z();
    }

    public final boolean a0() {
        return this.f12635v.isLaidOut() && !this.f12635v.isInEditMode();
    }

    public void b0(g gVar, boolean z) {
        if (m14674C()) {
            return;
        }
        Animator animator = this.f12626m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.f12627n == null;
        if (!a0()) {
            this.f12635v.m14768b(0, z);
            this.f12635v.setAlpha(1.0f);
            this.f12635v.setScaleY(1.0f);
            this.f12635v.setScaleX(1.0f);
            m14688R(1.0f);
            if (gVar != null) {
                gVar.mo14660a();
                return;
            }
            return;
        }
        if (this.f12635v.getVisibility() != 0) {
            this.f12635v.setAlpha(0.0f);
            this.f12635v.setScaleY(z2 ? 0.4f : 0.0f);
            this.f12635v.setScaleX(z2 ? 0.4f : 0.0f);
            m14688R(z2 ? 0.4f : 0.0f);
        }
        smb smbVar = this.f12627n;
        AnimatorSet animatorSetM14701i = smbVar != null ? m14701i(smbVar, 1.0f, 1.0f, 1.0f) : m14703k(1.0f, 1.0f, 1.0f, f12602D, f12603E);
        animatorSetM14701i.addListener(new b(z, gVar));
        ArrayList arrayList = this.f12632s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM14701i.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetM14701i.start();
    }

    public final void c0() {
        m14688R(this.f12629p);
    }

    public final void d0() {
        Rect rect = this.f12637x;
        m14712t(rect);
        m14679I(rect);
        this.f12636w.mo14662a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: e */
    public void m14697e(Animator.AnimatorListener animatorListener) {
        if (this.f12633t == null) {
            this.f12633t = new ArrayList();
        }
        this.f12633t.add(animatorListener);
    }

    public void e0(float f2) {
        zya zyaVar = this.f12615b;
        if (zyaVar != null) {
            zyaVar.f0(f2);
        }
    }

    /* renamed from: f */
    public void m14698f(Animator.AnimatorListener animatorListener) {
        if (this.f12632s == null) {
            this.f12632s = new ArrayList();
        }
        this.f12632s.add(animatorListener);
    }

    public final void f0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    /* renamed from: g */
    public void m14699g(f fVar) {
        if (this.f12634u == null) {
            this.f12634u = new ArrayList();
        }
        this.f12634u.add(fVar);
    }

    /* renamed from: h */
    public final void m14700h(float f2, Matrix matrix) {
        matrix.reset();
        if (this.f12635v.getDrawable() == null || this.f12630q == 0) {
            return;
        }
        RectF rectF = this.f12638y;
        RectF rectF2 = this.f12639z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.f12630q;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f12630q;
        matrix.postScale(f2, f2, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: i */
    public final AnimatorSet m14701i(smb smbVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12635v, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        smbVar.m48552h("opacity").m50200a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f12635v, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        smbVar.m48552h("scale").m50200a(objectAnimatorOfFloat2);
        f0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f12635v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        smbVar.m48552h("scale").m50200a(objectAnimatorOfFloat3);
        f0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        m14700h(f4, this.f12612A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f12635v, new nd8(), new c(), new Matrix(this.f12612A));
        smbVar.m48552h("iconScale").m50200a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        lh0.m37166a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    public jk1 m14702j(int i, ColorStateList colorStateList) {
        Context context = this.f12635v.getContext();
        jk1 jk1Var = new jk1((ykf) fgd.m26663g(this.f12614a));
        jk1Var.m33896e(c64.getColor(context, r6e.design_fab_stroke_top_outer_color), c64.getColor(context, r6e.design_fab_stroke_top_inner_color), c64.getColor(context, r6e.design_fab_stroke_end_inner_color), c64.getColor(context, r6e.design_fab_stroke_end_outer_color));
        jk1Var.m33895d(i);
        jk1Var.m33894c(colorStateList);
        return jk1Var;
    }

    /* renamed from: k */
    public final AnimatorSet m14703k(final float f2, final float f3, final float f4, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f12635v.getAlpha();
        final float scaleX = this.f12635v.getScaleX();
        final float scaleY = this.f12635v.getScaleY();
        final float f5 = this.f12629p;
        final Matrix matrix = new Matrix(this.f12612A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.q37
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41210a.m14667D(alpha, f2, scaleX, f3, scaleY, f5, f4, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        lh0.m37166a(animatorSet, arrayList);
        animatorSet.setDuration(umb.m51785f(this.f12635v.getContext(), i, this.f12635v.getContext().getResources().getInteger(b9e.material_motion_duration_long_1)));
        animatorSet.setInterpolator(umb.m51786g(this.f12635v.getContext(), i2, gh0.f25147b));
        return animatorSet;
    }

    /* renamed from: l */
    public final StateListAnimator m14704l(float f2, float f3, float f4) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f12606H, m14705m(f2, f4));
        stateListAnimator.addState(f12607I, m14705m(f2, f3));
        stateListAnimator.addState(f12608J, m14705m(f2, f3));
        stateListAnimator.addState(f12609K, m14705m(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f12635v, "elevation", f2).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f12635v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f12635v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f12601C);
        stateListAnimator.addState(f12610L, animatorSet);
        stateListAnimator.addState(f12611M, m14705m(0.0f, 0.0f));
        return stateListAnimator;
    }

    /* renamed from: m */
    public final Animator m14705m(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f12635v, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f12635v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(f12601C);
        return animatorSet;
    }

    /* renamed from: n */
    public zya m14706n() {
        return new e((ykf) fgd.m26663g(this.f12614a));
    }

    /* renamed from: o */
    public final Drawable m14707o() {
        return this.f12618e;
    }

    /* renamed from: p */
    public float m14708p() {
        return this.f12635v.getElevation();
    }

    /* renamed from: q */
    public boolean m14709q() {
        return this.f12619f;
    }

    /* renamed from: r */
    public final smb m14710r() {
        return this.f12628o;
    }

    /* renamed from: s */
    public float m14711s() {
        return this.f12622i;
    }

    /* renamed from: t */
    public void m14712t(Rect rect) {
        if (this.f12636w.mo14664c()) {
            int iM14716x = m14716x();
            int iMax = Math.max(iM14716x, (int) Math.ceil(this.f12620g ? m14708p() + this.f12623j : 0.0f));
            int iMax2 = Math.max(iM14716x, (int) Math.ceil(r1 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!m14718z()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f12624k - this.f12635v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    /* renamed from: u */
    public float m14713u() {
        return this.f12623j;
    }

    /* renamed from: v */
    public final ykf m14714v() {
        return this.f12614a;
    }

    /* renamed from: w */
    public final smb m14715w() {
        return this.f12627n;
    }

    /* renamed from: x */
    public int m14716x() {
        if (this.f12619f) {
            return Math.max((this.f12624k - this.f12635v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* renamed from: y */
    public void m14717y(g gVar, boolean z) {
        if (m14673B()) {
            return;
        }
        Animator animator = this.f12626m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f12635v.m14768b(z ? 8 : 4, z);
            if (gVar != null) {
                gVar.mo14661b();
                return;
            }
            return;
        }
        smb smbVar = this.f12628o;
        AnimatorSet animatorSetM14701i = smbVar != null ? m14701i(smbVar, 0.0f, 0.0f, 0.0f) : m14703k(0.0f, 0.4f, 0.4f, f12604F, f12605G);
        animatorSetM14701i.addListener(new a(z, gVar));
        ArrayList arrayList = this.f12633t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM14701i.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetM14701i.start();
    }

    /* renamed from: z */
    public final boolean m14718z() {
        return this.f12619f && this.f12635v.getSizeDimension() < this.f12624k;
    }
}
