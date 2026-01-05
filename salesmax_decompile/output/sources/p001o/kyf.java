package p001o;

import ai.salesmax.ui.component.MenuRecyclerView;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.google.android.gms.cast.CredentialsData;
import java.lang.ref.WeakReference;
import p000.AbstractC0000a;
import p001o.fv7;

/* loaded from: classes.dex */
public final class kyf extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: H */
    public boolean f32817H;

    /* renamed from: L */
    public boolean f32818L;

    /* renamed from: M */
    public int f32819M;

    /* renamed from: Q */
    public WeakReference f32820Q;

    /* renamed from: X */
    public WeakReference f32821X;

    /* renamed from: a */
    public Context f32822a;

    /* renamed from: b */
    public ViewGroup f32823b;

    /* renamed from: c */
    public AppCompatAutoCompleteTextView f32824c;

    /* renamed from: d */
    public View f32825d;

    /* renamed from: e */
    public View f32826e;

    /* renamed from: f */
    public boolean f32827f;

    /* renamed from: g */
    public View f32828g;

    /* renamed from: h */
    public final int f32829h;

    /* renamed from: q */
    public final int f32830q;

    /* renamed from: s */
    public final int f32831s;

    /* renamed from: x */
    public final int f32832x;

    /* renamed from: y */
    public boolean f32833y;

    /* renamed from: o.kyf$a */
    public static final class C14932a implements Animator.AnimatorListener {
        public C14932a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kyf.super.dismiss();
            kyf.this.f32818L = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: o.kyf$b */
    public static final class C14933b implements fv7.InterfaceC13576a {
        public C14933b() {
        }

        @Override // p001o.fv7.InterfaceC13576a
        /* renamed from: b */
        public void mo947b() {
            fv7.InterfaceC13576a interfaceC13576a;
            WeakReference weakReference = kyf.this.f32821X;
            if (weakReference == null || (interfaceC13576a = (fv7.InterfaceC13576a) weakReference.get()) == null) {
                return;
            }
            interfaceC13576a.mo947b();
        }

        @Override // p001o.fv7.InterfaceC13576a
        /* renamed from: c */
        public void mo948c(String str) {
            fv7.InterfaceC13576a interfaceC13576a;
            sq8.m48649h(str, "menuItem");
            WeakReference weakReference = kyf.this.f32821X;
            if (weakReference == null || (interfaceC13576a = (fv7.InterfaceC13576a) weakReference.get()) == null) {
                return;
            }
            interfaceC13576a.mo948c(str);
        }
    }

    public /* synthetic */ kyf(Context context, ViewGroup viewGroup, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, View view, View view2, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : viewGroup, (i & 4) != 0 ? null : appCompatAutoCompleteTextView, (i & 8) != 0 ? null : view, (i & 16) == 0 ? view2 : null, (i & 32) != 0 ? false : z);
    }

    /* renamed from: l */
    public static final void m36311l(kyf kyfVar) {
        sq8.m48649h(kyfVar, "this$0");
    }

    /* renamed from: q */
    public static final void m36312q(kyf kyfVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        sq8.m48649h(kyfVar, "this$0");
        kyfVar.m36323r();
    }

    /* renamed from: u */
    public static final boolean m36313u(kyf kyfVar, View view, MotionEvent motionEvent) {
        sq8.m48649h(kyfVar, "this$0");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        kyfVar.dismiss();
        return true;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.f32818L || !isShowing() || getContentView() == null) {
            return;
        }
        this.f32818L = true;
        View contentView = getContentView();
        if ((contentView != null ? contentView.getWindowToken() : null) == null) {
            super.dismiss();
            this.f32818L = false;
            return;
        }
        int iM36315h = m36315h();
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(getContentView(), iM36315h, m36316i(), m36317j(iM36315h), 0.0f);
        sq8.m48646e(animatorCreateCircularReveal);
        animatorCreateCircularReveal.addListener(new C14932a());
        animatorCreateCircularReveal.start();
    }

    /* renamed from: g */
    public void m36314g(fv7.InterfaceC13576a interfaceC13576a) {
        sq8.m48649h(interfaceC13576a, "lisner");
        this.f32821X = new WeakReference(interfaceC13576a);
    }

    /* renamed from: h */
    public final int m36315h() {
        View view = this.f32826e;
        int width = view != null ? view.getWidth() : 0;
        View view2 = this.f32826e;
        return view2 != null ? view2.getLeft() : width + 0;
    }

    /* renamed from: i */
    public final int m36316i() {
        View view;
        if (this.f32817H && (view = this.f32828g) != null) {
            sq8.m48646e(view);
            return view.getBottom();
        }
        View view2 = this.f32828g;
        sq8.m48646e(view2);
        return view2.getTop();
    }

    /* renamed from: j */
    public final float m36317j(int i) {
        int height = getContentView().getHeight();
        return (float) Math.sqrt((i * i) + (height * height));
    }

    /* renamed from: k */
    public final void m36318k() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        MenuRecyclerView menuRecyclerView;
        View contentView = getContentView();
        if (contentView != null && (menuRecyclerView = (MenuRecyclerView) contentView.findViewById(z8e.rvMenu)) != null) {
            menuRecyclerView.L1();
        }
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.f32824c;
        if (appCompatAutoCompleteTextView != null) {
            appCompatAutoCompleteTextView.setAdapter(null);
        }
        View view = this.f32828g;
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            View view2 = this.f32828g;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f32828g);
            }
        }
        View view3 = this.f32828g;
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.hyf
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    kyf.m36311l(this.f27797a);
                }
            });
        }
        ViewGroup viewGroup2 = this.f32823b;
        if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ViewGroup viewGroup3 = this.f32823b;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        this.f32821X = null;
        setContentView(null);
        this.f32828g = null;
        this.f32822a = null;
        this.f32823b = null;
        this.f32824c = null;
        this.f32825d = null;
        this.f32826e = null;
    }

    /* renamed from: m */
    public final int m36319m() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: n */
    public final int m36320n() {
        Context context;
        Resources resources;
        Resources resources2;
        Context context2 = (Context) this.f32820Q.get();
        Integer numValueOf = (context2 == null || (resources2 = context2.getResources()) == null) ? null : Integer.valueOf(resources2.getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID));
        if (numValueOf == null || numValueOf.intValue() <= 0 || (context = (Context) this.f32820Q.get()) == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getDimensionPixelSize(numValueOf.intValue());
    }

    /* renamed from: o */
    public final void m36321o() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f32823b;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        int iM36319m = m36319m();
        Rect rect = new Rect();
        ViewGroup viewGroup = this.f32823b;
        if (viewGroup != null) {
            viewGroup.getWindowVisibleDisplayFrame(rect);
        }
        int iM36320n = (iM36319m - (rect.bottom - rect.top)) - m36320n();
        boolean z = iM36320n > this.f32830q;
        this.f32833y = z;
        if (z) {
            this.f32819M = iM36320n;
            return;
        }
        ViewGroup viewGroup2 = this.f32823b;
        if (viewGroup2 != null && viewGroup2.isAttachedToWindow()) {
            dismiss();
            return;
        }
        ViewGroup viewGroup3 = this.f32823b;
        if (viewGroup3 == null || (viewTreeObserver = viewGroup3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    /* renamed from: p */
    public final void m36322p() {
        View viewInflate = LayoutInflater.from((Context) this.f32820Q.get()).inflate(p9e.menu_soft_keyboard, this.f32823b, false);
        this.f32828g = viewInflate;
        if (viewInflate != null) {
            viewInflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.iyf
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    kyf.m36312q(this.f29372a, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        View view = this.f32828g;
        MenuRecyclerView menuRecyclerView = view != null ? (MenuRecyclerView) view.findViewById(z8e.rvMenu) : null;
        C14933b c14933b = new C14933b();
        if (menuRecyclerView != null) {
            menuRecyclerView.K1(c14933b);
        }
        setContentView(this.f32828g);
    }

    /* renamed from: r */
    public final void m36323r() {
        int iM36315h = m36315h();
        ViewAnimationUtils.createCircularReveal(getContentView(), iM36315h, m36316i(), 0.0f, m36317j(iM36315h)).start();
    }

    /* renamed from: s */
    public final void m36324s(int i, int i2) {
        setWidth(i);
        setHeight(i2);
    }

    /* renamed from: t */
    public final void m36325t() {
        setSoftInputMode(5);
        m36324s(-1, this.f32819M);
        setBackgroundDrawable(null);
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener() { // from class: o.jyf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return kyf.m36313u(this.f31260a, view, motionEvent);
            }
        });
    }

    /* renamed from: v */
    public final void m36326v() {
        if (this.f32833y) {
            m36328x();
        } else {
            m36327w();
        }
    }

    /* renamed from: w */
    public final void m36327w() {
        this.f32817H = true;
        setFocusable(true);
        ViewGroup viewGroup = this.f32823b;
        m36324s(viewGroup != null ? viewGroup.getWidth() : 0 - this.f32831s, this.f32819M);
        int[] iArr = new int[2];
        View view = this.f32825d;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        showAtLocation(this.f32823b, 0, 0, (iArr[1] - this.f32819M) - this.f32832x);
    }

    /* renamed from: x */
    public final void m36328x() {
        this.f32817H = false;
        setFocusable(false);
        m36324s(-1, this.f32819M);
        showAtLocation(this.f32823b, 80, 0, 0);
    }

    public kyf(Context context, ViewGroup viewGroup, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, View view, View view2, boolean z) {
        super(context);
        this.f32822a = context;
        this.f32823b = viewGroup;
        this.f32824c = appCompatAutoCompleteTextView;
        this.f32825d = view;
        this.f32826e = view2;
        this.f32827f = z;
        int iM0a = AbstractC0000a.m0a(281);
        this.f32829h = iM0a;
        this.f32830q = 100;
        this.f32831s = AbstractC0000a.m0a(16);
        this.f32832x = AbstractC0000a.m0a(6);
        this.f32819M = iM0a;
        this.f32820Q = new WeakReference(this.f32822a);
        m36325t();
        m36321o();
        m36322p();
    }
}
