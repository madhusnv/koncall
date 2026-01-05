package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C11131a;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.bkh;
import p001o.cbc;
import p001o.cc;
import p001o.db;
import p001o.dbj;
import p001o.ebe;
import p001o.fy5;
import p001o.gh0;
import p001o.gua;
import p001o.gza;
import p001o.n9e;
import p001o.r9j;
import p001o.t54;
import p001o.umb;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.ykf;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a */
    public final int f12941a;

    /* renamed from: b */
    public final int f12942b;

    /* renamed from: c */
    public final int f12943c;

    /* renamed from: d */
    public final TimeInterpolator f12944d;

    /* renamed from: e */
    public final TimeInterpolator f12945e;

    /* renamed from: f */
    public final TimeInterpolator f12946f;

    /* renamed from: g */
    public final ViewGroup f12947g;

    /* renamed from: h */
    public final Context f12948h;

    /* renamed from: i */
    public final SnackbarBaseLayout f12949i;

    /* renamed from: j */
    public final t54 f12950j;

    /* renamed from: k */
    public int f12951k;

    /* renamed from: l */
    public boolean f12952l;

    /* renamed from: o */
    public int f12955o;

    /* renamed from: p */
    public int f12956p;

    /* renamed from: q */
    public int f12957q;

    /* renamed from: r */
    public int f12958r;

    /* renamed from: s */
    public int f12959s;

    /* renamed from: t */
    public int f12960t;

    /* renamed from: u */
    public boolean f12961u;

    /* renamed from: v */
    public List f12962v;

    /* renamed from: w */
    public Behavior f12963w;

    /* renamed from: x */
    public final AccessibilityManager f12964x;

    /* renamed from: z */
    public static final TimeInterpolator f12940z = gh0.f25147b;

    /* renamed from: A */
    public static final TimeInterpolator f12935A = gh0.f25146a;

    /* renamed from: B */
    public static final TimeInterpolator f12936B = gh0.f25149d;

    /* renamed from: D */
    public static final int[] f12938D = {x5e.snackbarStyle};

    /* renamed from: E */
    public static final String f12939E = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: C */
    public static final Handler f12937C = new Handler(Looper.getMainLooper(), new C11119h());

    /* renamed from: m */
    public boolean f12953m = false;

    /* renamed from: n */
    public final Runnable f12954n = new RunnableC11120i();

    /* renamed from: y */
    public C11131a.b f12965y = new C11123l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: y */
        public final C11129r f12966y = new C11129r(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: J */
        public boolean mo14114J(View view) {
            return this.f12966y.m15182a(view);
        }

        /* renamed from: U */
        public final void m15174U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f12966y.m15184c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: o */
        public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f12966y.m15183b(coordinatorLayout, view, motionEvent);
            return super.mo5778o(coordinatorLayout, view, motionEvent);
        }
    }

    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: y */
        public static final View.OnTouchListener f12967y = new ViewOnTouchListenerC11111a();

        /* renamed from: a */
        public BaseTransientBottomBar f12968a;

        /* renamed from: b */
        public ykf f12969b;

        /* renamed from: c */
        public int f12970c;

        /* renamed from: d */
        public final float f12971d;

        /* renamed from: e */
        public final float f12972e;

        /* renamed from: f */
        public final int f12973f;

        /* renamed from: g */
        public final int f12974g;

        /* renamed from: h */
        public ColorStateList f12975h;

        /* renamed from: q */
        public PorterDuff.Mode f12976q;

        /* renamed from: s */
        public Rect f12977s;

        /* renamed from: x */
        public boolean f12978x;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        public class ViewOnTouchListenerC11111a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f12968a = baseTransientBottomBar;
        }

        /* renamed from: c */
        public void m15177c(ViewGroup viewGroup) {
            this.f12978x = true;
            viewGroup.addView(this);
            this.f12978x = false;
        }

        /* renamed from: d */
        public final Drawable m15178d() {
            int iM29513l = gua.m29513l(this, x5e.colorSurface, x5e.colorOnSurface, getBackgroundOverlayColorAlpha());
            ykf ykfVar = this.f12969b;
            Drawable drawableM15139w = ykfVar != null ? BaseTransientBottomBar.m15139w(iM29513l, ykfVar) : BaseTransientBottomBar.m15138v(iM29513l, getResources());
            if (this.f12975h == null) {
                return fy5.m27744r(drawableM15139w);
            }
            Drawable drawableM27744r = fy5.m27744r(drawableM15139w);
            drawableM27744r.setTintList(this.f12975h);
            return drawableM27744r;
        }

        /* renamed from: e */
        public final void m15179e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f12977s = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f12972e;
        }

        public int getAnimationMode() {
            return this.f12970c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f12971d;
        }

        public int getMaxInlineActionWidth() {
            return this.f12974g;
        }

        public int getMaxWidth() {
            return this.f12973f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f12968a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m15152M();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f12968a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m15153N();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.f12968a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m15154O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f12973f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f12973f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.f12970c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f12975h != null) {
                drawable = fy5.m27744r(drawable.mutate());
                drawable.setTintList(this.f12975h);
                drawable.setTintMode(this.f12976q);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f12975h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableM27744r = fy5.m27744r(getBackground().mutate());
                drawableM27744r.setTintList(colorStateList);
                drawableM27744r.setTintMode(this.f12976q);
                if (drawableM27744r != getBackground()) {
                    super.setBackgroundDrawable(drawableM27744r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f12976q = mode;
            if (getBackground() != null) {
                Drawable drawableM27744r = fy5.m27744r(getBackground().mutate());
                drawableM27744r.setTintMode(mode);
                if (drawableM27744r != getBackground()) {
                    super.setBackgroundDrawable(drawableM27744r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f12978x || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m15179e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f12968a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f12967y);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(gza.m29680d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ebe.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(ebe.SnackbarLayout_elevation)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.SnackbarLayout_elevation, 0));
            }
            this.f12970c = typedArrayObtainStyledAttributes.getInt(ebe.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(ebe.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(ebe.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f12969b = ykf.m57925e(context2, attributeSet, 0, 0).m57970m();
            }
            this.f12971d = typedArrayObtainStyledAttributes.getFloat(ebe.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(yya.m58494a(context2, typedArrayObtainStyledAttributes, ebe.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(xzi.m57081q(typedArrayObtainStyledAttributes.getInt(ebe.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f12972e = typedArrayObtainStyledAttributes.getFloat(ebe.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f12973f = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.SnackbarLayout_android_maxWidth, -1);
            this.f12974g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f12967y);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(m15178d());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C11112a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f12979a;

        public C11112a(int i) {
            this.f12979a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m15155P(this.f12979a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C11113b implements ValueAnimator.AnimatorUpdateListener {
        public C11113b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f12949i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C11114c implements ValueAnimator.AnimatorUpdateListener {
        public C11114c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f12949i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f12949i.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C11115d extends AnimatorListenerAdapter {
        public C11115d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m15156Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f12950j.mo15187a(BaseTransientBottomBar.this.f12943c - BaseTransientBottomBar.this.f12941a, BaseTransientBottomBar.this.f12941a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C11116e implements ValueAnimator.AnimatorUpdateListener {
        public C11116e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f12949i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C11117f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f12985a;

        public C11117f(int i) {
            this.f12985a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m15155P(this.f12985a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f12950j.mo15188b(0, BaseTransientBottomBar.this.f12942b);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C11118g implements ValueAnimator.AnimatorUpdateListener {
        public C11118g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f12949i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C11119h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m15163X();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).m15149J(message.arg1);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    public class RunnableC11120i implements Runnable {
        public RunnableC11120i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f12949i == null || baseTransientBottomBar.f12948h == null) {
                return;
            }
            int iHeight = (dbj.m22763a(BaseTransientBottomBar.this.f12948h).height() - BaseTransientBottomBar.this.m15147H()) + ((int) BaseTransientBottomBar.this.f12949i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f12959s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f12960t = baseTransientBottomBar2.f12959s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f12949i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.f12939E;
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f12960t = baseTransientBottomBar3.f12959s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f12959s - iHeight;
            BaseTransientBottomBar.this.f12949i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    public class C11121j implements cbc {
        public C11121j() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            BaseTransientBottomBar.this.f12955o = r9jVar.m46394i();
            BaseTransientBottomBar.this.f12956p = r9jVar.m46395j();
            BaseTransientBottomBar.this.f12957q = r9jVar.m46396k();
            BaseTransientBottomBar.this.d0();
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    public class C11122k extends db {
        public C11122k() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.m20777a(1048576);
            ccVar.u0(true);
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo5939j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo15170x();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public class C11123l implements C11131a.b {
        public C11123l() {
        }

        @Override // com.google.android.material.snackbar.C11131a.b
        /* renamed from: a */
        public void mo15180a(int i) {
            Handler handler = BaseTransientBottomBar.f12937C;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C11131a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.f12937C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public class RunnableC11124m implements Runnable {
        public RunnableC11124m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m15155P(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C11125n implements SwipeDismissBehavior.InterfaceC10944c {
        public C11125n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC10944c
        /* renamed from: a */
        public void mo14122a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m15171y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC10944c
        /* renamed from: b */
        public void mo14123b(int i) {
            if (i == 0) {
                C11131a.m15191c().m15201k(BaseTransientBottomBar.this.f12965y);
            } else if (i == 1 || i == 2) {
                C11131a.m15191c().m15200j(BaseTransientBottomBar.this.f12965y);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class RunnableC11126o implements Runnable {
        public RunnableC11126o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f12949i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f12949i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f12949i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m15165Z();
            } else {
                BaseTransientBottomBar.this.b0();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C11127p extends AnimatorListenerAdapter {
        public C11127p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m15156Q();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public static abstract class AbstractC11128q {
        /* renamed from: a */
        public abstract void mo15181a(Object obj, int i);

        /* renamed from: b */
        public abstract void mo25b(Object obj);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static class C11129r {

        /* renamed from: a */
        public C11131a.b f12996a;

        public C11129r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.m14118Q(0.1f);
            swipeDismissBehavior.m14116O(0.6f);
            swipeDismissBehavior.m14119R(0);
        }

        /* renamed from: a */
        public boolean m15182a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void m15183b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m5730F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C11131a.m15191c().m15200j(this.f12996a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C11131a.m15191c().m15201k(this.f12996a);
            }
        }

        /* renamed from: c */
        public void m15184c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f12996a = baseTransientBottomBar.f12965y;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, t54 t54Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (t54Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f12947g = viewGroup;
        this.f12950j = t54Var;
        this.f12948h = context;
        bkh.m19297a(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(m15144E(), viewGroup, false);
        this.f12949i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.m15189c(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        wvi.x0(snackbarBaseLayout, new C11121j());
        wvi.m0(snackbarBaseLayout, new C11122k());
        this.f12964x = (AccessibilityManager) context.getSystemService("accessibility");
        this.f12943c = umb.m51785f(context, x5e.motionDurationLong2, 250);
        this.f12941a = umb.m51785f(context, x5e.motionDurationLong2, Opcodes.FCMPG);
        this.f12942b = umb.m51785f(context, x5e.motionDurationMedium1, 75);
        this.f12944d = umb.m51786g(context, x5e.motionEasingEmphasizedInterpolator, f12935A);
        this.f12946f = umb.m51786g(context, x5e.motionEasingEmphasizedInterpolator, f12936B);
        this.f12945e = umb.m51786g(context, x5e.motionEasingEmphasizedInterpolator, f12940z);
    }

    /* renamed from: v */
    public static GradientDrawable m15138v(int i, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(x6e.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: w */
    public static zya m15139w(int i, ykf ykfVar) {
        zya zyaVar = new zya(ykfVar);
        zyaVar.g0(ColorStateList.valueOf(i));
        return zyaVar;
    }

    /* renamed from: A */
    public View m15140A() {
        return null;
    }

    /* renamed from: B */
    public int mo15141B() {
        return this.f12951k;
    }

    /* renamed from: C */
    public SwipeDismissBehavior m15142C() {
        return new Behavior();
    }

    /* renamed from: D */
    public final ValueAnimator m15143D(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f12946f);
        valueAnimatorOfFloat.addUpdateListener(new C11114c());
        return valueAnimatorOfFloat;
    }

    /* renamed from: E */
    public int m15144E() {
        return m15148I() ? n9e.mtrl_layout_snackbar : n9e.design_layout_snackbar;
    }

    /* renamed from: F */
    public final int m15145F() {
        int height = this.f12949i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f12949i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: G */
    public View m15146G() {
        return this.f12949i;
    }

    /* renamed from: H */
    public final int m15147H() {
        int[] iArr = new int[2];
        this.f12949i.getLocationInWindow(iArr);
        return iArr[1] + this.f12949i.getHeight();
    }

    /* renamed from: I */
    public boolean m15148I() {
        TypedArray typedArrayObtainStyledAttributes = this.f12948h.obtainStyledAttributes(f12938D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: J */
    public final void m15149J(int i) {
        if (m15160U() && this.f12949i.getVisibility() == 0) {
            m15168t(i);
        } else {
            m15155P(i);
        }
    }

    /* renamed from: K */
    public boolean m15150K() {
        return C11131a.m15191c().m15195e(this.f12965y);
    }

    /* renamed from: L */
    public final boolean m15151L() {
        ViewGroup.LayoutParams layoutParams = this.f12949i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C2012e) && (((CoordinatorLayout.C2012e) layoutParams).m5798f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: M */
    public void m15152M() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f12949i.getRootWindowInsets()) == null) {
            return;
        }
        this.f12959s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        d0();
    }

    /* renamed from: N */
    public void m15153N() {
        if (m15150K()) {
            f12937C.post(new RunnableC11124m());
        }
    }

    /* renamed from: O */
    public void m15154O() {
        if (this.f12961u) {
            m15164Y();
            this.f12961u = false;
        }
    }

    /* renamed from: P */
    public void m15155P(int i) {
        C11131a.m15191c().m15198h(this.f12965y);
        List list = this.f12962v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC11128q) this.f12962v.get(size)).mo15181a(this, i);
            }
        }
        ViewParent parent = this.f12949i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f12949i);
        }
    }

    /* renamed from: Q */
    public void m15156Q() {
        C11131a.m15191c().m15199i(this.f12965y);
        List list = this.f12962v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC11128q) this.f12962v.get(size)).mo25b(this);
            }
        }
    }

    /* renamed from: R */
    public final void m15157R() {
        this.f12958r = m15169u();
        d0();
    }

    /* renamed from: S */
    public BaseTransientBottomBar m15158S(int i) {
        this.f12951k = i;
        return this;
    }

    /* renamed from: T */
    public final void m15159T(CoordinatorLayout.C2012e c2012e) {
        SwipeDismissBehavior swipeDismissBehaviorM15142C = this.f12963w;
        if (swipeDismissBehaviorM15142C == null) {
            swipeDismissBehaviorM15142C = m15142C();
        }
        if (swipeDismissBehaviorM15142C instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorM15142C).m15174U(this);
        }
        swipeDismissBehaviorM15142C.m14117P(new C11125n());
        c2012e.m5807o(swipeDismissBehaviorM15142C);
        if (m15140A() == null) {
            c2012e.f7101g = 80;
        }
    }

    /* renamed from: U */
    public boolean m15160U() {
        AccessibilityManager accessibilityManager = this.f12964x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: V */
    public final boolean m15161V() {
        return this.f12959s > 0 && !this.f12952l && m15151L();
    }

    /* renamed from: W */
    public void mo15162W() {
        C11131a.m15191c().m15203m(mo15141B(), this.f12965y);
    }

    /* renamed from: X */
    public final void m15163X() {
        if (this.f12949i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f12949i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2012e) {
                m15159T((CoordinatorLayout.C2012e) layoutParams);
            }
            this.f12949i.m15177c(this.f12947g);
            m15157R();
            this.f12949i.setVisibility(4);
        }
        if (this.f12949i.isLaidOut()) {
            m15164Y();
        } else {
            this.f12961u = true;
        }
    }

    /* renamed from: Y */
    public final void m15164Y() {
        if (m15160U()) {
            m15167s();
            return;
        }
        if (this.f12949i.getParent() != null) {
            this.f12949i.setVisibility(0);
        }
        m15156Q();
    }

    /* renamed from: Z */
    public final void m15165Z() {
        ValueAnimator valueAnimatorM15172z = m15172z(0.0f, 1.0f);
        ValueAnimator valueAnimatorM15143D = m15143D(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorM15172z, valueAnimatorM15143D);
        animatorSet.setDuration(this.f12941a);
        animatorSet.addListener(new C11127p());
        animatorSet.start();
    }

    public final void a0(int i) {
        ValueAnimator valueAnimatorM15172z = m15172z(1.0f, 0.0f);
        valueAnimatorM15172z.setDuration(this.f12942b);
        valueAnimatorM15172z.addListener(new C11112a(i));
        valueAnimatorM15172z.start();
    }

    public final void b0() {
        int iM15145F = m15145F();
        this.f12949i.setTranslationY(iM15145F);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iM15145F, 0);
        valueAnimator.setInterpolator(this.f12945e);
        valueAnimator.setDuration(this.f12943c);
        valueAnimator.addListener(new C11115d());
        valueAnimator.addUpdateListener(new C11116e());
        valueAnimator.start();
    }

    public final void c0(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m15145F());
        valueAnimator.setInterpolator(this.f12945e);
        valueAnimator.setDuration(this.f12943c);
        valueAnimator.addListener(new C11117f(i));
        valueAnimator.addUpdateListener(new C11118g());
        valueAnimator.start();
    }

    public final void d0() {
        ViewGroup.LayoutParams layoutParams = this.f12949i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f12949i.f12977s == null || this.f12949i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.f12949i.f12977s.bottom + (m15140A() != null ? this.f12958r : this.f12955o);
        int i2 = this.f12949i.f12977s.left + this.f12956p;
        int i3 = this.f12949i.f12977s.right + this.f12957q;
        int i4 = this.f12949i.f12977s.top;
        boolean z = (marginLayoutParams.bottomMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.topMargin == i4) ? false : true;
        if (z) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            this.f12949i.requestLayout();
        }
        if ((z || this.f12960t != this.f12959s) && Build.VERSION.SDK_INT >= 29 && m15161V()) {
            this.f12949i.removeCallbacks(this.f12954n);
            this.f12949i.post(this.f12954n);
        }
    }

    /* renamed from: r */
    public BaseTransientBottomBar m15166r(AbstractC11128q abstractC11128q) {
        if (abstractC11128q == null) {
            return this;
        }
        if (this.f12962v == null) {
            this.f12962v = new ArrayList();
        }
        this.f12962v.add(abstractC11128q);
        return this;
    }

    /* renamed from: s */
    public void m15167s() {
        this.f12949i.post(new RunnableC11126o());
    }

    /* renamed from: t */
    public final void m15168t(int i) {
        if (this.f12949i.getAnimationMode() == 1) {
            a0(i);
        } else {
            c0(i);
        }
    }

    /* renamed from: u */
    public final int m15169u() {
        if (m15140A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m15140A().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f12947g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f12947g.getHeight()) - i;
    }

    /* renamed from: x */
    public void mo15170x() {
        m15171y(3);
    }

    /* renamed from: y */
    public void m15171y(int i) {
        C11131a.m15191c().m15193b(this.f12965y, i);
    }

    /* renamed from: z */
    public final ValueAnimator m15172z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f12944d);
        valueAnimatorOfFloat.addUpdateListener(new C11113b());
        return valueAnimatorOfFloat;
    }
}
