package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.AbstractC11002a;
import com.google.android.material.circularreveal.InterfaceC11004c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.dy5;
import p001o.gh0;
import p001o.go0;
import p001o.i93;
import p001o.lh0;
import p001o.n8e;
import p001o.oza;
import p001o.smb;
import p001o.tmb;
import p001o.yed;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f13259c;

    /* renamed from: d */
    public final RectF f13260d;

    /* renamed from: e */
    public final RectF f13261e;

    /* renamed from: f */
    public final int[] f13262f;

    /* renamed from: g */
    public float f13263g;

    /* renamed from: h */
    public float f13264h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C11181a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f13265a;

        /* renamed from: b */
        public final /* synthetic */ View f13266b;

        /* renamed from: c */
        public final /* synthetic */ View f13267c;

        public C11181a(boolean z, View view, View view2) {
            this.f13265a = z;
            this.f13266b = view;
            this.f13267c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13265a) {
                return;
            }
            this.f13266b.setVisibility(4);
            this.f13267c.setAlpha(1.0f);
            this.f13267c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f13265a) {
                this.f13266b.setVisibility(0);
                this.f13267c.setAlpha(0.0f);
                this.f13267c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C11182b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f13269a;

        public C11182b(View view) {
            this.f13269a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13269a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C11183c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11004c f13271a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f13272b;

        public C11183c(InterfaceC11004c interfaceC11004c, Drawable drawable) {
            this.f13271a = interfaceC11004c;
            this.f13272b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13271a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13271a.setCircularRevealOverlayDrawable(this.f13272b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C11184d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11004c f13274a;

        public C11184d(InterfaceC11004c interfaceC11004c) {
            this.f13274a = interfaceC11004c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC11004c.e revealInfo = this.f13274a.getRevealInfo();
            revealInfo.f12377c = Float.MAX_VALUE;
            this.f13274a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C11185e {

        /* renamed from: a */
        public smb f13276a;

        /* renamed from: b */
        public yed f13277b;
    }

    public FabTransformationBehavior() {
        this.f13259c = new Rect();
        this.f13260d = new RectF();
        this.f13261e = new RectF();
        this.f13262f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: N */
    public AnimatorSet mo15593N(View view, View view2, boolean z, boolean z2) {
        C11185e c11185eI0 = i0(view2.getContext(), z);
        if (z) {
            this.f13263g = view.getTranslationX();
            this.f13264h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z, z2, c11185eI0, arrayList, arrayList2);
        RectF rectF = this.f13260d;
        g0(view, view2, z, z2, c11185eI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z, c11185eI0, arrayList);
        d0(view, view2, z, z2, c11185eI0, arrayList, arrayList2);
        c0(view, view2, z, z2, c11185eI0, fWidth, fHeight, arrayList, arrayList2);
        m15605Z(view, view2, z, z2, c11185eI0, arrayList, arrayList2);
        m15604Y(view, view2, z, z2, c11185eI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        lh0.m37166a(animatorSet, arrayList);
        animatorSet.addListener(new C11181a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: O */
    public final ViewGroup m15594O(View view) {
        View viewFindViewById = view.findViewById(n8e.mtrl_child_content_container);
        return viewFindViewById != null ? j0(viewFindViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    /* renamed from: P */
    public final void m15595P(View view, C11185e c11185e, tmb tmbVar, tmb tmbVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float fM15602W = m15602W(c11185e, tmbVar, f, f3);
        float fM15602W2 = m15602W(c11185e, tmbVar2, f2, f4);
        Rect rect = this.f13259c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f13260d;
        rectF2.set(rect);
        RectF rectF3 = this.f13261e;
        m15603X(view, rectF3);
        rectF3.offset(fM15602W, fM15602W2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: Q */
    public final void m15596Q(View view, RectF rectF) {
        m15603X(view, rectF);
        rectF.offset(this.f13263g, this.f13264h);
    }

    /* renamed from: R */
    public final Pair m15597R(float f, float f2, boolean z, C11185e c11185e) {
        tmb tmbVarM48552h;
        tmb tmbVarM48552h2;
        if (f == 0.0f || f2 == 0.0f) {
            tmbVarM48552h = c11185e.f13276a.m48552h("translationXLinear");
            tmbVarM48552h2 = c11185e.f13276a.m48552h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            tmbVarM48552h = c11185e.f13276a.m48552h("translationXCurveDownwards");
            tmbVarM48552h2 = c11185e.f13276a.m48552h("translationYCurveDownwards");
        } else {
            tmbVarM48552h = c11185e.f13276a.m48552h("translationXCurveUpwards");
            tmbVarM48552h2 = c11185e.f13276a.m48552h("translationYCurveUpwards");
        }
        return new Pair(tmbVarM48552h, tmbVarM48552h2);
    }

    /* renamed from: S */
    public final float m15598S(View view, View view2, yed yedVar) {
        RectF rectF = this.f13260d;
        RectF rectF2 = this.f13261e;
        m15596Q(view, rectF);
        m15603X(view2, rectF2);
        rectF2.offset(-m15600U(view, view2, yedVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: T */
    public final float m15599T(View view, View view2, yed yedVar) {
        RectF rectF = this.f13260d;
        RectF rectF2 = this.f13261e;
        m15596Q(view, rectF);
        m15603X(view2, rectF2);
        rectF2.offset(0.0f, -m15601V(view, view2, yedVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: U */
    public final float m15600U(View view, View view2, yed yedVar) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.f13260d;
        RectF rectF2 = this.f13261e;
        m15596Q(view, rectF);
        m15603X(view2, rectF2);
        int i = yedVar.f55378a & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i != 5) {
                f = 0.0f;
                return f + yedVar.f55379b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f = fCenterX - fCenterX2;
        return f + yedVar.f55379b;
    }

    /* renamed from: V */
    public final float m15601V(View view, View view2, yed yedVar) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.f13260d;
        RectF rectF2 = this.f13261e;
        m15596Q(view, rectF);
        m15603X(view2, rectF2);
        int i = yedVar.f55378a & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i != 80) {
                f = 0.0f;
                return f + yedVar.f55380c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f = fCenterY - fCenterY2;
        return f + yedVar.f55380c;
    }

    /* renamed from: W */
    public final float m15602W(C11185e c11185e, tmb tmbVar, float f, float f2) {
        long jM50201c = tmbVar.m50201c();
        long jM50202d = tmbVar.m50202d();
        tmb tmbVarM48552h = c11185e.f13276a.m48552h("expansion");
        return gh0.m28647a(f, f2, tmbVar.m50203e().getInterpolation((((tmbVarM48552h.m50201c() + tmbVarM48552h.m50202d()) + 17) - jM50201c) / jM50202d));
    }

    /* renamed from: X */
    public final void m15603X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f13262f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: Y */
    public final void m15604Y(View view, View view2, boolean z, boolean z2, C11185e c11185e, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            boolean z3 = view2 instanceof InterfaceC11004c;
            ViewGroup viewGroupM15594O = m15594O(view2);
            if (viewGroupM15594O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    i93.f28267a.set(viewGroupM15594O, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM15594O, (Property<ViewGroup, Float>) i93.f28267a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM15594O, (Property<ViewGroup, Float>) i93.f28267a, 0.0f);
            }
            c11185e.f13276a.m48552h("contentFade").m50200a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    public final void m15605Z(View view, View view2, boolean z, boolean z2, C11185e c11185e, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof InterfaceC11004c) {
            InterfaceC11004c interfaceC11004c = (InterfaceC11004c) view2;
            int iH0 = h0(view);
            int i = 16777215 & iH0;
            if (z) {
                if (!z2) {
                    interfaceC11004c.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC11004c, (Property<InterfaceC11004c, Integer>) InterfaceC11004c.d.f12374a, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC11004c, (Property<InterfaceC11004c, Integer>) InterfaceC11004c.d.f12374a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(go0.m29179b());
            c11185e.f13276a.m48552h("color").m50200a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    public final void a0(View view, View view2, boolean z, C11185e c11185e, List list) {
        float fM15600U = m15600U(view, view2, c11185e.f13277b);
        float fM15601V = m15601V(view, view2, c11185e.f13277b);
        Pair pairM15597R = m15597R(fM15600U, fM15601V, z, c11185e);
        tmb tmbVar = (tmb) pairM15597R.first;
        tmb tmbVar2 = (tmb) pairM15597R.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM15600U = this.f13263g;
        }
        fArr[0] = fM15600U;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fM15601V = this.f13264h;
        }
        fArr2[0] = fM15601V;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        tmbVar.m50200a(objectAnimatorOfFloat);
        tmbVar2.m50200a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final void b0(View view, View view2, boolean z, boolean z2, C11185e c11185e, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        c11185e.f13276a.m48552h("elevation").m50200a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(View view, View view2, boolean z, boolean z2, C11185e c11185e, float f, float f2, List list, List list2) {
        Animator animatorM14420a;
        if (view2 instanceof InterfaceC11004c) {
            InterfaceC11004c interfaceC11004c = (InterfaceC11004c) view2;
            float fM15598S = m15598S(view, view2, c11185e.f13277b);
            float fM15599T = m15599T(view, view2, c11185e.f13277b);
            ((FloatingActionButton) view).m14639h(this.f13259c);
            float fWidth = this.f13259c.width() / 2.0f;
            tmb tmbVarM48552h = c11185e.f13276a.m48552h("expansion");
            if (z) {
                if (!z2) {
                    interfaceC11004c.setRevealInfo(new InterfaceC11004c.e(fM15598S, fM15599T, fWidth));
                }
                if (z2) {
                    fWidth = interfaceC11004c.getRevealInfo().f12377c;
                }
                animatorM14420a = AbstractC11002a.m14420a(interfaceC11004c, fM15598S, fM15599T, oza.m42804c(fM15598S, fM15599T, 0.0f, 0.0f, f, f2));
                animatorM14420a.addListener(new C11184d(interfaceC11004c));
                f0(view2, tmbVarM48552h.m50201c(), (int) fM15598S, (int) fM15599T, fWidth, list);
            } else {
                float f3 = interfaceC11004c.getRevealInfo().f12377c;
                Animator animatorM14420a2 = AbstractC11002a.m14420a(interfaceC11004c, fM15598S, fM15599T, fWidth);
                int i = (int) fM15598S;
                int i2 = (int) fM15599T;
                f0(view2, tmbVarM48552h.m50201c(), i, i2, f3, list);
                e0(view2, tmbVarM48552h.m50201c(), tmbVarM48552h.m50202d(), c11185e.f13276a.m48553i(), i, i2, fWidth, list);
                animatorM14420a = animatorM14420a2;
            }
            tmbVarM48552h.m50200a(animatorM14420a);
            list.add(animatorM14420a);
            list2.add(AbstractC11002a.m14421b(interfaceC11004c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(View view, View view2, boolean z, boolean z2, C11185e c11185e, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof InterfaceC11004c) && (view instanceof ImageView)) {
            InterfaceC11004c interfaceC11004c = (InterfaceC11004c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(Constants.MAX_HOST_LENGTH);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) dy5.f20643a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) dy5.f20643a, Constants.MAX_HOST_LENGTH);
            }
            objectAnimatorOfInt.addUpdateListener(new C11182b(view2));
            c11185e.f13276a.m48552h("iconFade").m50200a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new C11183c(interfaceC11004c, drawable));
        }
    }

    public final void e0(View view, long j, long j2, long j3, int i, int i2, float f, List list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(j4);
            animatorCreateCircularReveal.setDuration(j3 - j4);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void f0(View view, long j, int i, int i2, float f, List list) {
        if (j > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void g0(View view, View view2, boolean z, boolean z2, C11185e c11185e, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM15600U = m15600U(view, view2, c11185e.f13277b);
        float fM15601V = m15601V(view, view2, c11185e.f13277b);
        Pair pairM15597R = m15597R(fM15600U, fM15601V, z, c11185e);
        tmb tmbVar = (tmb) pairM15597R.first;
        tmb tmbVar2 = (tmb) pairM15597R.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM15600U);
                view2.setTranslationY(-fM15601V);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m15595P(view2, c11185e, tmbVar, tmbVar2, -fM15600U, -fM15601V, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM15600U);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM15601V);
        }
        tmbVar.m50200a(objectAnimatorOfFloat);
        tmbVar2.m50200a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final int h0(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public abstract C11185e i0(Context context, boolean z);

    public final ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public void mo5774k(CoordinatorLayout.C2012e c2012e) {
        if (c2012e.f7102h == 0) {
            c2012e.f7102h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13259c = new Rect();
        this.f13260d = new RectF();
        this.f13261e = new RectF();
        this.f13262f = new int[2];
    }
}
