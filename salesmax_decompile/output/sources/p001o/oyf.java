package p001o;

import ai.salesmax.ui.component.MenuRecyclerViewTeamChat;
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
import p001o.hv7;

/* loaded from: classes.dex */
public final class oyf extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: H */
    public boolean f39060H;

    /* renamed from: L */
    public boolean f39061L;

    /* renamed from: M */
    public int f39062M;

    /* renamed from: Q */
    public WeakReference f39063Q;

    /* renamed from: X */
    public WeakReference f39064X;

    /* renamed from: a */
    public Context f39065a;

    /* renamed from: b */
    public ViewGroup f39066b;

    /* renamed from: c */
    public AppCompatAutoCompleteTextView f39067c;

    /* renamed from: d */
    public View f39068d;

    /* renamed from: e */
    public View f39069e;

    /* renamed from: f */
    public boolean f39070f;

    /* renamed from: g */
    public View f39071g;

    /* renamed from: h */
    public final int f39072h;

    /* renamed from: q */
    public final int f39073q;

    /* renamed from: s */
    public final int f39074s;

    /* renamed from: x */
    public final int f39075x;

    /* renamed from: y */
    public boolean f39076y;

    /* renamed from: o.oyf$a */
    public static final class C15913a implements Animator.AnimatorListener {
        public C15913a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            oyf.super.dismiss();
            oyf.this.f39061L = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: o.oyf$b */
    public static final class C15914b implements hv7.InterfaceC14105a {
        public C15914b() {
        }

        @Override // p001o.hv7.InterfaceC14105a
        /* renamed from: b */
        public void mo1677b() {
            hv7.InterfaceC14105a interfaceC14105a;
            WeakReference weakReference = oyf.this.f39064X;
            if (weakReference == null || (interfaceC14105a = (hv7.InterfaceC14105a) weakReference.get()) == null) {
                return;
            }
            interfaceC14105a.mo1677b();
        }

        @Override // p001o.hv7.InterfaceC14105a
        /* renamed from: c */
        public void mo1678c(String str) {
            hv7.InterfaceC14105a interfaceC14105a;
            sq8.m48649h(str, "menuItem");
            WeakReference weakReference = oyf.this.f39064X;
            if (weakReference == null || (interfaceC14105a = (hv7.InterfaceC14105a) weakReference.get()) == null) {
                return;
            }
            interfaceC14105a.mo1678c(str);
        }
    }

    public oyf(Context context, ViewGroup viewGroup, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, View view, View view2, boolean z) {
        super(context);
        this.f39065a = context;
        this.f39066b = viewGroup;
        this.f39067c = appCompatAutoCompleteTextView;
        this.f39068d = view;
        this.f39069e = view2;
        this.f39070f = z;
        int iM0a = AbstractC0000a.m0a(120);
        this.f39072h = iM0a;
        this.f39073q = 100;
        this.f39074s = AbstractC0000a.m0a(16);
        this.f39075x = AbstractC0000a.m0a(6);
        this.f39062M = iM0a;
        this.f39063Q = new WeakReference(this.f39065a);
        m42794t();
        m42790o();
        m42791p();
    }

    /* renamed from: l */
    public static final void m42780l(oyf oyfVar) {
        sq8.m48649h(oyfVar, "this$0");
    }

    /* renamed from: q */
    public static final void m42781q(oyf oyfVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        sq8.m48649h(oyfVar, "this$0");
        oyfVar.m42792r();
    }

    /* renamed from: u */
    public static final boolean m42782u(oyf oyfVar, View view, MotionEvent motionEvent) {
        sq8.m48649h(oyfVar, "this$0");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        oyfVar.dismiss();
        return true;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.f39061L || !isShowing()) {
            return;
        }
        this.f39061L = true;
        int iM42784h = m42784h();
        float fM42786j = m42786j(iM42784h);
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(getContentView(), iM42784h, m42785i(), fM42786j, 0.0f);
        sq8.m48646e(animatorCreateCircularReveal);
        animatorCreateCircularReveal.addListener(new C15913a());
        animatorCreateCircularReveal.start();
    }

    /* renamed from: g */
    public void m42783g(hv7.InterfaceC14105a interfaceC14105a) {
        sq8.m48649h(interfaceC14105a, "lisner");
        this.f39064X = new WeakReference(interfaceC14105a);
    }

    /* renamed from: h */
    public final int m42784h() {
        View view = this.f39069e;
        int width = view != null ? view.getWidth() : 0;
        View view2 = this.f39069e;
        return view2 != null ? view2.getLeft() : width + 0;
    }

    /* renamed from: i */
    public final int m42785i() {
        View view;
        if (this.f39060H && (view = this.f39071g) != null) {
            sq8.m48646e(view);
            return view.getBottom();
        }
        View view2 = this.f39071g;
        sq8.m48646e(view2);
        return view2.getTop();
    }

    /* renamed from: j */
    public final float m42786j(int i) {
        int height = getContentView().getHeight();
        return (float) Math.sqrt((i * i) + (height * height));
    }

    /* renamed from: k */
    public final void m42787k() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewParent parent;
        MenuRecyclerViewTeamChat menuRecyclerViewTeamChat;
        View contentView = getContentView();
        if (contentView != null && (menuRecyclerViewTeamChat = (MenuRecyclerViewTeamChat) contentView.findViewById(z8e.rvMenuTeamChat)) != null) {
            menuRecyclerViewTeamChat.L1();
        }
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.f39067c;
        if (appCompatAutoCompleteTextView != null) {
            appCompatAutoCompleteTextView.setAdapter(null);
        }
        View view = this.f39071g;
        if (view != null && (parent = view.getParent()) != null) {
            ((ViewGroup) parent).removeView(this.f39071g);
        }
        View view2 = this.f39071g;
        if (view2 != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.lyf
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    oyf.m42780l(this.f34519a);
                }
            });
        }
        ViewGroup viewGroup = this.f39066b;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ViewGroup viewGroup2 = this.f39066b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        this.f39064X = null;
        setContentView(null);
        this.f39071g = null;
        this.f39065a = null;
        this.f39066b = null;
        this.f39067c = null;
        this.f39068d = null;
        this.f39069e = null;
    }

    /* renamed from: m */
    public final int m42788m() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: n */
    public final int m42789n() {
        Resources resources;
        Resources resources2;
        Context context = (Context) this.f39063Q.get();
        Integer numValueOf = null;
        Integer numValueOf2 = (context == null || (resources2 = context.getResources()) == null) ? null : Integer.valueOf(resources2.getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID));
        if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
            return 0;
        }
        Context context2 = (Context) this.f39063Q.get();
        if (context2 != null && (resources = context2.getResources()) != null) {
            numValueOf = Integer.valueOf(resources.getDimensionPixelSize(numValueOf2.intValue()));
        }
        sq8.m48646e(numValueOf);
        return numValueOf.intValue();
    }

    /* renamed from: o */
    public final void m42790o() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f39066b;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int iM42788m = m42788m();
        Rect rect = new Rect();
        ViewGroup viewGroup = this.f39066b;
        if (viewGroup != null) {
            viewGroup.getWindowVisibleDisplayFrame(rect);
        }
        int iM42789n = (iM42788m - (rect.bottom - rect.top)) - m42789n();
        boolean z = iM42789n > this.f39073q;
        this.f39076y = z;
        if (z) {
            this.f39062M = iM42789n;
        } else {
            dismiss();
        }
    }

    /* renamed from: p */
    public final void m42791p() {
        View viewInflate = LayoutInflater.from((Context) this.f39063Q.get()).inflate(p9e.menu_soft_keyboard_team_chat, this.f39066b, false);
        this.f39071g = viewInflate;
        if (viewInflate != null) {
            viewInflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.nyf
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    oyf.m42781q(this.f37404a, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        View view = this.f39071g;
        MenuRecyclerViewTeamChat menuRecyclerViewTeamChat = view != null ? (MenuRecyclerViewTeamChat) view.findViewById(z8e.rvMenuTeamChat) : null;
        C15914b c15914b = new C15914b();
        if (menuRecyclerViewTeamChat != null) {
            menuRecyclerViewTeamChat.K1(c15914b);
        }
        setContentView(this.f39071g);
    }

    /* renamed from: r */
    public final void m42792r() {
        int iM42784h = m42784h();
        ViewAnimationUtils.createCircularReveal(getContentView(), iM42784h, m42785i(), 0.0f, m42786j(iM42784h)).start();
    }

    /* renamed from: s */
    public final void m42793s(int i, int i2) {
        setWidth(i);
        setHeight(i2);
    }

    /* renamed from: t */
    public final void m42794t() {
        setSoftInputMode(5);
        m42793s(-1, this.f39062M);
        setBackgroundDrawable(null);
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener() { // from class: o.myf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return oyf.m42782u(this.f36102a, view, motionEvent);
            }
        });
    }

    /* renamed from: v */
    public final void m42795v() {
        if (this.f39076y) {
            m42797x();
        } else {
            m42796w();
        }
    }

    /* renamed from: w */
    public final void m42796w() {
        this.f39060H = true;
        setFocusable(true);
        ViewGroup viewGroup = this.f39066b;
        m42793s(viewGroup != null ? viewGroup.getWidth() : 0 - this.f39074s, this.f39062M);
        int[] iArr = new int[2];
        View view = this.f39068d;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        showAtLocation(this.f39066b, 0, 0, (iArr[1] - this.f39062M) - this.f39075x);
    }

    /* renamed from: x */
    public final void m42797x() {
        this.f39060H = false;
        setFocusable(false);
        m42793s(-1, this.f39062M);
        showAtLocation(this.f39066b, 80, 0, 0);
    }
}
