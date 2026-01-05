package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.gh0;
import p001o.gza;
import p001o.pae;
import p001o.r9j;
import p001o.s5e;
import p001o.tq;
import p001o.umb;
import p001o.wk1;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.ykf;
import p001o.yuh;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC2009b {
    public static final int l1 = pae.Widget_MaterialComponents_BottomAppBar;
    public static final int m1 = x5e.motionDurationLong2;
    public static final int n1 = x5e.motionEasingEmphasizedInterpolator;
    public Integer L0;
    public final zya M0;
    public Animator N0;
    public Animator O0;
    public int P0;
    public int Q0;
    public int R0;
    public final int S0;
    public int T0;
    public int U0;
    public final boolean V0;
    public boolean W0;
    public final boolean X0;
    public final boolean Y0;
    public final boolean Z0;
    public int a1;
    public ArrayList b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public Behavior f1;
    public int g1;
    public int h1;
    public int i1;
    public AnimatorListenerAdapter j1;
    public yuh k1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10947a();

        /* renamed from: c */
        public int f12131c;

        /* renamed from: d */
        public boolean f12132d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public class C10947a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12131c);
            parcel.writeInt(this.f12132d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12131c = parcel.readInt();
            this.f12132d = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C10948a extends AnimatorListenerAdapter {
        public C10948a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.d1) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.L0(bottomAppBar.P0, BottomAppBar.this.e1);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C10949b implements yuh {
        public C10949b() {
        }

        @Override // p001o.yuh
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo14142a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.M0.h0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.R0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // p001o.yuh
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14143b(FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.R0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().m54652j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().m54658q(translationX);
                BottomAppBar.this.M0.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().m54647c() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().m54653k(fMax);
                BottomAppBar.this.M0.invalidateSelf();
            }
            BottomAppBar.this.M0.h0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C10950c implements xzi.InterfaceC18287d {
        public C10950c() {
        }

        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        public r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
            boolean z;
            if (BottomAppBar.this.X0) {
                BottomAppBar.this.g1 = r9jVar.m46394i();
            }
            boolean z2 = false;
            if (BottomAppBar.this.Y0) {
                z = BottomAppBar.this.i1 != r9jVar.m46395j();
                BottomAppBar.this.i1 = r9jVar.m46395j();
            } else {
                z = false;
            }
            if (BottomAppBar.this.Z0) {
                boolean z3 = BottomAppBar.this.h1 != r9jVar.m46396k();
                BottomAppBar.this.h1 = r9jVar.m46396k();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar.this.z0();
                BottomAppBar.this.Q0();
                BottomAppBar.this.P0();
            }
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C10951d extends AnimatorListenerAdapter {
        public C10951d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.D0();
            BottomAppBar.this.N0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.E0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C10952e extends FloatingActionButton.AbstractC11057b {

        /* renamed from: a */
        public final /* synthetic */ int f12137a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public class a extends FloatingActionButton.AbstractC11057b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC11057b
            /* renamed from: b */
            public void mo14148b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.D0();
            }
        }

        public C10952e(int i) {
            this.f12137a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC11057b
        /* renamed from: a */
        public void mo14147a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.I0(this.f12137a));
            floatingActionButton.m14649r(new a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C10953f extends AnimatorListenerAdapter {
        public C10953f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.D0();
            BottomAppBar.this.d1 = false;
            BottomAppBar.this.O0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.E0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public class C10954g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f12141a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f12142b;

        /* renamed from: c */
        public final /* synthetic */ int f12143c;

        /* renamed from: d */
        public final /* synthetic */ boolean f12144d;

        public C10954g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f12142b = actionMenuView;
            this.f12143c = i;
            this.f12144d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12141a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f12141a) {
                return;
            }
            boolean z = BottomAppBar.this.c1 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.O0(bottomAppBar.c1);
            BottomAppBar.this.T0(this.f12142b, this.f12143c, this.f12144d, z);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    public class RunnableC10955h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f12146a;

        /* renamed from: b */
        public final /* synthetic */ int f12147b;

        /* renamed from: c */
        public final /* synthetic */ boolean f12148c;

        public RunnableC10955h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f12146a = actionMenuView;
            this.f12147b = i;
            this.f12148c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12146a.setTranslationX(BottomAppBar.this.H0(r0, this.f12147b, this.f12148c));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    public class C10956i extends AnimatorListenerAdapter {
        public C10956i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j1.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonF0 = BottomAppBar.this.F0();
            if (floatingActionButtonF0 != null) {
                floatingActionButtonF0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void U0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.C2012e c2012e = (CoordinatorLayout.C2012e) view.getLayoutParams();
        c2012e.f7098d = 17;
        int i = bottomAppBar.R0;
        if (i == 1) {
            c2012e.f7098d = 17 | 48;
        }
        if (i == 0) {
            c2012e.f7098d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.g1;
    }

    private int getFabAlignmentAnimationDuration() {
        return umb.m51785f(getContext(), m1, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return I0(this.P0);
    }

    private float getFabTranslationY() {
        if (this.R0 == 1) {
            return -getTopEdgeTreatment().m54647c();
        }
        return G0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.i1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.h1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wk1 getTopEdgeTreatment() {
        return (wk1) this.M0.m60103I().m57936p();
    }

    public void A0(int i, List list) {
        FloatingActionButton floatingActionButtonF0 = F0();
        if (floatingActionButtonF0 == null || floatingActionButtonF0.m14644m()) {
            return;
        }
        E0();
        floatingActionButtonF0.m14642k(new C10952e(i));
    }

    public final void B0(int i, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(F0(), "translationX", I0(i));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    public final void C0(int i, boolean z, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - H0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat2.addListener(new C10954g(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void D0() {
        ArrayList arrayList;
        int i = this.a1 - 1;
        this.a1 = i;
        if (i != 0 || (arrayList = this.b1) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    public final void E0() {
        ArrayList arrayList;
        int i = this.a1;
        this.a1 = i + 1;
        if (i != 0 || (arrayList = this.b1) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    public final FloatingActionButton F0() {
        View viewG0 = G0();
        if (viewG0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewG0;
        }
        return null;
    }

    public final View G0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m5756w(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public int H0(ActionMenuView actionMenuView, int i, boolean z) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.U0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zM57079o = xzi.m57079o(this);
        int measuredWidth = zM57079o ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f5276a & 8388615) == 8388611) {
                measuredWidth = zM57079o ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zM57079o ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zM57079o ? this.h1 : -this.i1;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(x6e.m3_bottomappbar_horizontal_padding);
            if (!zM57079o) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    public final float I0(int i) {
        boolean zM57079o = xzi.m57079o(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((zM57079o ? this.i1 : this.h1) + ((this.T0 == -1 || G0() == null) ? this.S0 : (r6.getMeasuredWidth() / 2) + this.T0))) * (zM57079o ? -1 : 1);
    }

    public final boolean J0() {
        FloatingActionButton floatingActionButtonF0 = F0();
        return floatingActionButtonF0 != null && floatingActionButtonF0.m14645n();
    }

    public final void L0(int i, boolean z) {
        if (!isLaidOut()) {
            this.d1 = false;
            O0(this.c1);
            return;
        }
        Animator animator = this.O0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!J0()) {
            i = 0;
            z = false;
        }
        C0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.O0 = animatorSet;
        animatorSet.addListener(new C10953f());
        this.O0.start();
    }

    public final void M0(int i) {
        if (this.P0 == i || !isLaidOut()) {
            return;
        }
        Animator animator = this.N0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.Q0 == 1) {
            B0(i, arrayList);
        } else {
            A0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(umb.m51786g(getContext(), n1, gh0.f25146a));
        this.N0 = animatorSet;
        animatorSet.addListener(new C10951d());
        this.N0.start();
    }

    public final Drawable N0(Drawable drawable) {
        if (drawable == null || this.L0 == null) {
            return drawable;
        }
        Drawable drawableM27744r = fy5.m27744r(drawable.mutate());
        drawableM27744r.setTint(this.L0.intValue());
        return drawableM27744r;
    }

    public void O0(int i) {
        if (i != 0) {
            this.c1 = 0;
            getMenu().clear();
            mo4433x(i);
        }
    }

    public final void P0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.O0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (J0()) {
            S0(actionMenuView, this.P0, this.e1);
        } else {
            S0(actionMenuView, 0, false);
        }
    }

    public final void Q0() {
        getTopEdgeTreatment().m54658q(getFabTranslationX());
        this.M0.h0((this.e1 && J0() && this.R0 == 1) ? 1.0f : 0.0f);
        View viewG0 = G0();
        if (viewG0 != null) {
            viewG0.setTranslationY(getFabTranslationY());
            viewG0.setTranslationX(getFabTranslationX());
        }
    }

    public boolean R0(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().m54651i()) {
            return false;
        }
        getTopEdgeTreatment().m54657p(f);
        this.M0.invalidateSelf();
        return true;
    }

    public final void S0(ActionMenuView actionMenuView, int i, boolean z) {
        T0(actionMenuView, i, z, false);
    }

    public final void T0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC10955h runnableC10955h = new RunnableC10955h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC10955h);
        } else {
            runnableC10955h.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.M0.m60107M();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m54647c();
    }

    public int getFabAlignmentMode() {
        return this.P0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.T0;
    }

    public int getFabAnchorMode() {
        return this.R0;
    }

    public int getFabAnimationMode() {
        return this.Q0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m54649g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m54650h();
    }

    public boolean getHideOnScroll() {
        return this.W0;
    }

    public int getMenuAlignmentMode() {
        return this.U0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18045f(this, this.M0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            z0();
            Q0();
            final View viewG0 = G0();
            if (viewG0 != null && viewG0.isLaidOut()) {
                viewG0.post(new Runnable() { // from class: o.vk1
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewG0.requestLayout();
                    }
                });
            }
        }
        P0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        this.P0 = savedState.f12131c;
        this.e1 = savedState.f12132d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12131c = this.P0;
        savedState.f12132d = this.e1;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.M0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m54653k(f);
            this.M0.invalidateSelf();
            Q0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.M0.f0(f);
        getBehavior().m14086S(this, this.M0.m60102H() - this.M0.m60101G());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.c1 = i2;
        this.d1 = true;
        L0(i, this.e1);
        M0(i);
        this.P0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            Q0();
        }
    }

    public void setFabAnchorMode(int i) {
        this.R0 = i;
        Q0();
        View viewG0 = G0();
        if (viewG0 != null) {
            U0(this, viewG0);
            viewG0.requestLayout();
            this.M0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.Q0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().m54648f()) {
            getTopEdgeTreatment().m54654l(f);
            this.M0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m54655m(f);
            this.M0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m54656n(f);
            this.M0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                S0(actionMenuView, this.P0, J0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(N0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.L0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void y0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m14636e(this.j1);
        floatingActionButton.m14637f(new C10956i());
        floatingActionButton.m14638g(this.k1);
    }

    public final void z0() {
        Animator animator = this.O0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.N0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2009b
    public Behavior getBehavior() {
        if (this.f1 == null) {
            this.f1 = new Behavior();
        }
        return this.f1;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: Q */
        public final Rect f12126Q;

        /* renamed from: X */
        public WeakReference f12127X;

        /* renamed from: Y */
        public int f12128Y;

        /* renamed from: Z */
        public final View.OnLayoutChangeListener f12129Z;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC10946a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC10946a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f12127X.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m14639h(Behavior.this.f12126Q);
                    int iHeight = Behavior.this.f12126Q.height();
                    bottomAppBar.R0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m57938r().mo20547a(new RectF(Behavior.this.f12126Q)));
                    height = iHeight;
                }
                CoordinatorLayout.C2012e c2012e = (CoordinatorLayout.C2012e) view.getLayoutParams();
                if (Behavior.this.f12128Y == 0) {
                    if (bottomAppBar.R0 == 1) {
                        ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(x6e.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) c2012e).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c2012e).rightMargin = bottomAppBar.getRightInset();
                    if (xzi.m57079o(view)) {
                        ((ViewGroup.MarginLayoutParams) c2012e).leftMargin += bottomAppBar.S0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c2012e).rightMargin += bottomAppBar.S0;
                    }
                }
                bottomAppBar.Q0();
            }
        }

        public Behavior() {
            this.f12129Z = new ViewOnLayoutChangeListenerC10946a();
            this.f12126Q = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public boolean mo5779p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f12127X = new WeakReference(bottomAppBar);
            View viewG0 = bottomAppBar.G0();
            if (viewG0 != null && !viewG0.isLaidOut()) {
                BottomAppBar.U0(bottomAppBar, viewG0);
                this.f12128Y = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2012e) viewG0.getLayoutParams())).bottomMargin;
                if (viewG0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewG0;
                    if (bottomAppBar.R0 == 0 && bottomAppBar.V0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(s5e.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(s5e.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.y0(floatingActionButton);
                }
                viewG0.addOnLayoutChangeListener(this.f12129Z);
                bottomAppBar.Q0();
            }
            coordinatorLayout.m5737M(bottomAppBar, i);
            return super.mo5779p(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean mo5764E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo5764E(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12129Z = new ViewOnLayoutChangeListenerC10946a();
            this.f12126Q = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = l1;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        zya zyaVar = new zya();
        this.M0 = zyaVar;
        this.a1 = 0;
        this.c1 = 0;
        this.d1 = false;
        this.e1 = true;
        this.j1 = new C10948a();
        this.k1 = new C10949b();
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.BottomAppBar, i, i2, new int[0]);
        ColorStateList colorStateListM58494a = yya.m58494a(context2, typedArrayM19305i, ebe.BottomAppBar_backgroundTint);
        if (typedArrayM19305i.hasValue(ebe.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(typedArrayM19305i.getColor(ebe.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = typedArrayM19305i.getDimensionPixelSize(ebe.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayM19305i.getDimensionPixelOffset(ebe.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayM19305i.getDimensionPixelOffset(ebe.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayM19305i.getDimensionPixelOffset(ebe.BottomAppBar_fabCradleVerticalOffset, 0);
        this.P0 = typedArrayM19305i.getInt(ebe.BottomAppBar_fabAlignmentMode, 0);
        this.Q0 = typedArrayM19305i.getInt(ebe.BottomAppBar_fabAnimationMode, 0);
        this.R0 = typedArrayM19305i.getInt(ebe.BottomAppBar_fabAnchorMode, 1);
        this.V0 = typedArrayM19305i.getBoolean(ebe.BottomAppBar_removeEmbeddedFabElevation, true);
        this.U0 = typedArrayM19305i.getInt(ebe.BottomAppBar_menuAlignmentMode, 0);
        this.W0 = typedArrayM19305i.getBoolean(ebe.BottomAppBar_hideOnScroll, false);
        this.X0 = typedArrayM19305i.getBoolean(ebe.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.Y0 = typedArrayM19305i.getBoolean(ebe.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.Z0 = typedArrayM19305i.getBoolean(ebe.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.T0 = typedArrayM19305i.getDimensionPixelOffset(ebe.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = typedArrayM19305i.getBoolean(ebe.BottomAppBar_addElevationShadow, true);
        typedArrayM19305i.recycle();
        this.S0 = getResources().getDimensionPixelOffset(x6e.mtrl_bottomappbar_fabOffsetEndMode);
        zyaVar.setShapeAppearanceModel(ykf.m57921a().m57961B(new wk1(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m57970m());
        if (z) {
            zyaVar.n0(2);
        } else {
            zyaVar.n0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        zyaVar.j0(Paint.Style.FILL);
        zyaVar.m60115U(context2);
        zyaVar.setTintList(colorStateListM58494a);
        setElevation(dimensionPixelSize);
        setBackground(zyaVar);
        xzi.m57069e(this, attributeSet, i, i2, new C10950c());
    }
}
