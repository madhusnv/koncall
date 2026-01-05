package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.widget.Toolbar;
import p001o.anh;
import p001o.azi;
import p001o.bbe;
import p001o.e85;
import p001o.lk0;
import p001o.n7e;
import p001o.r8e;
import p001o.um;
import p001o.wvi;
import p001o.xyi;
import p001o.y9e;
import p001o.z5e;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes2.dex */
public class C1884a implements e85 {

    /* renamed from: a */
    public Toolbar f6014a;

    /* renamed from: b */
    public int f6015b;

    /* renamed from: c */
    public View f6016c;

    /* renamed from: d */
    public View f6017d;

    /* renamed from: e */
    public Drawable f6018e;

    /* renamed from: f */
    public Drawable f6019f;

    /* renamed from: g */
    public Drawable f6020g;

    /* renamed from: h */
    public boolean f6021h;

    /* renamed from: i */
    public CharSequence f6022i;

    /* renamed from: j */
    public CharSequence f6023j;

    /* renamed from: k */
    public CharSequence f6024k;

    /* renamed from: l */
    public Window.Callback f6025l;

    /* renamed from: m */
    public boolean f6026m;

    /* renamed from: n */
    public ActionMenuPresenter f6027n;

    /* renamed from: o */
    public int f6028o;

    /* renamed from: p */
    public int f6029p;

    /* renamed from: q */
    public Drawable f6030q;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final um f6031a;

        public a() {
            this.f6031a = new um(C1884a.this.f6014a.getContext(), 0, R.id.home, 0, 0, C1884a.this.f6022i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1884a c1884a = C1884a.this;
            Window.Callback callback = c1884a.f6025l;
            if (callback == null || !c1884a.f6026m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f6031a);
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    public class b extends azi {

        /* renamed from: a */
        public boolean f6033a = false;

        /* renamed from: b */
        public final /* synthetic */ int f6034b;

        public b(int i) {
            this.f6034b = i;
        }

        @Override // p001o.azi, p001o.zyi
        /* renamed from: a */
        public void mo4478a(View view) {
            this.f6033a = true;
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            if (this.f6033a) {
                return;
            }
            C1884a.this.f6014a.setVisibility(this.f6034b);
        }

        @Override // p001o.azi, p001o.zyi
        /* renamed from: c */
        public void mo3833c(View view) {
            C1884a.this.f6014a.setVisibility(0);
        }
    }

    public C1884a(Toolbar toolbar, boolean z) {
        this(toolbar, z, y9e.abc_action_bar_up_description, n7e.abc_ic_ab_back_material);
    }

    /* renamed from: A */
    public void m4445A(int i) {
        m4446B(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: B */
    public void m4446B(CharSequence charSequence) {
        this.f6024k = charSequence;
        m4449E();
    }

    /* renamed from: C */
    public void m4447C(Drawable drawable) {
        this.f6020g = drawable;
        m4450F();
    }

    /* renamed from: D */
    public final void m4448D(CharSequence charSequence) {
        this.f6022i = charSequence;
        if ((this.f6015b & 8) != 0) {
            this.f6014a.setTitle(charSequence);
            if (this.f6021h) {
                wvi.o0(this.f6014a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: E */
    public final void m4449E() {
        if ((this.f6015b & 4) != 0) {
            if (TextUtils.isEmpty(this.f6024k)) {
                this.f6014a.setNavigationContentDescription(this.f6029p);
            } else {
                this.f6014a.setNavigationContentDescription(this.f6024k);
            }
        }
    }

    /* renamed from: F */
    public final void m4450F() {
        if ((this.f6015b & 4) == 0) {
            this.f6014a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f6014a;
        Drawable drawable = this.f6020g;
        if (drawable == null) {
            drawable = this.f6030q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: G */
    public final void m4451G() {
        Drawable drawable;
        int i = this.f6015b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f6019f) == null) {
            drawable = this.f6018e;
        }
        this.f6014a.setLogo(drawable);
    }

    @Override // p001o.e85
    /* renamed from: a */
    public boolean mo4452a() {
        return this.f6014a.m4413d();
    }

    @Override // p001o.e85
    /* renamed from: b */
    public boolean mo4453b() {
        return this.f6014a.m4432w();
    }

    @Override // p001o.e85
    /* renamed from: c */
    public boolean mo4454c() {
        return this.f6014a.m4408L();
    }

    @Override // p001o.e85
    public void collapseActionView() {
        this.f6014a.m4414e();
    }

    @Override // p001o.e85
    /* renamed from: d */
    public boolean mo4455d() {
        return this.f6014a.m4398B();
    }

    @Override // p001o.e85
    /* renamed from: e */
    public boolean mo4456e() {
        return this.f6014a.m4397A();
    }

    @Override // p001o.e85
    /* renamed from: f */
    public boolean mo4457f() {
        return this.f6014a.m4431v();
    }

    @Override // p001o.e85
    /* renamed from: g */
    public void mo4458g(int i) {
        View view;
        int i2 = this.f6015b ^ i;
        this.f6015b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4449E();
                }
                m4450F();
            }
            if ((i2 & 3) != 0) {
                m4451G();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f6014a.setTitle(this.f6022i);
                    this.f6014a.setSubtitle(this.f6023j);
                } else {
                    this.f6014a.setTitle((CharSequence) null);
                    this.f6014a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f6017d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f6014a.addView(view);
            } else {
                this.f6014a.removeView(view);
            }
        }
    }

    @Override // p001o.e85
    public Context getContext() {
        return this.f6014a.getContext();
    }

    @Override // p001o.e85
    public CharSequence getTitle() {
        return this.f6014a.getTitle();
    }

    @Override // p001o.e85
    /* renamed from: h */
    public void mo4459h(CharSequence charSequence) {
        this.f6023j = charSequence;
        if ((this.f6015b & 8) != 0) {
            this.f6014a.setSubtitle(charSequence);
        }
    }

    @Override // p001o.e85
    /* renamed from: i */
    public Menu mo4460i() {
        return this.f6014a.getMenu();
    }

    @Override // p001o.e85
    /* renamed from: j */
    public int mo4461j() {
        return this.f6028o;
    }

    @Override // p001o.e85
    /* renamed from: k */
    public xyi mo4462k(int i, long j) {
        return wvi.m55118e(this.f6014a).m56973b(i == 0 ? 1.0f : 0.0f).m56976f(j).m56978h(new b(i));
    }

    @Override // p001o.e85
    /* renamed from: l */
    public ViewGroup mo4463l() {
        return this.f6014a;
    }

    @Override // p001o.e85
    /* renamed from: m */
    public void mo4464m(boolean z) {
    }

    @Override // p001o.e85
    /* renamed from: n */
    public void mo4465n() {
    }

    @Override // p001o.e85
    /* renamed from: o */
    public void mo4466o(boolean z) {
        this.f6014a.setCollapsible(z);
    }

    @Override // p001o.e85
    /* renamed from: p */
    public void mo4467p() {
        this.f6014a.m4415f();
    }

    @Override // p001o.e85
    /* renamed from: q */
    public void mo4468q(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f6016c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f6014a;
            if (parent == toolbar) {
                toolbar.removeView(this.f6016c);
            }
        }
        this.f6016c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f6028o != 2) {
            return;
        }
        this.f6014a.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f6016c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f5276a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // p001o.e85
    /* renamed from: r */
    public void mo4469r(int i) {
        m4477z(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    @Override // p001o.e85
    /* renamed from: s */
    public void mo4470s(int i) {
        m4447C(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    @Override // p001o.e85
    public void setIcon(int i) {
        setIcon(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    @Override // p001o.e85
    public void setMenu(Menu menu, InterfaceC1796i.a aVar) {
        if (this.f6027n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f6014a.getContext());
            this.f6027n = actionMenuPresenter;
            actionMenuPresenter.m3977s(r8e.action_menu_presenter);
        }
        this.f6027n.mo3965d(aVar);
        this.f6014a.setMenu((C1792e) menu, this.f6027n);
    }

    @Override // p001o.e85
    public void setMenuPrepared() {
        this.f6026m = true;
    }

    @Override // p001o.e85
    public void setTitle(CharSequence charSequence) {
        this.f6021h = true;
        m4448D(charSequence);
    }

    @Override // p001o.e85
    public void setVisibility(int i) {
        this.f6014a.setVisibility(i);
    }

    @Override // p001o.e85
    public void setWindowCallback(Window.Callback callback) {
        this.f6025l = callback;
    }

    @Override // p001o.e85
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f6021h) {
            return;
        }
        m4448D(charSequence);
    }

    @Override // p001o.e85
    /* renamed from: t */
    public void mo4471t(InterfaceC1796i.a aVar, C1792e.a aVar2) {
        this.f6014a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // p001o.e85
    /* renamed from: u */
    public int mo4472u() {
        return this.f6015b;
    }

    @Override // p001o.e85
    /* renamed from: v */
    public void mo4473v() {
    }

    /* renamed from: w */
    public final int m4474w() {
        if (this.f6014a.getNavigationIcon() == null) {
            return 11;
        }
        this.f6030q = this.f6014a.getNavigationIcon();
        return 15;
    }

    /* renamed from: x */
    public void m4475x(View view) {
        View view2 = this.f6017d;
        if (view2 != null && (this.f6015b & 16) != 0) {
            this.f6014a.removeView(view2);
        }
        this.f6017d = view;
        if (view == null || (this.f6015b & 16) == 0) {
            return;
        }
        this.f6014a.addView(view);
    }

    /* renamed from: y */
    public void m4476y(int i) {
        if (i == this.f6029p) {
            return;
        }
        this.f6029p = i;
        if (TextUtils.isEmpty(this.f6014a.getNavigationContentDescription())) {
            m4445A(this.f6029p);
        }
    }

    /* renamed from: z */
    public void m4477z(Drawable drawable) {
        this.f6019f = drawable;
        m4451G();
    }

    public C1884a(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f6028o = 0;
        this.f6029p = 0;
        this.f6014a = toolbar;
        this.f6022i = toolbar.getTitle();
        this.f6023j = toolbar.getSubtitle();
        this.f6021h = this.f6022i != null;
        this.f6020g = toolbar.getNavigationIcon();
        anh anhVarM17525v = anh.m17525v(toolbar.getContext(), null, bbe.ActionBar, z5e.actionBarStyle, 0);
        this.f6030q = anhVarM17525v.m17532g(bbe.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceM17541p = anhVarM17525v.m17541p(bbe.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceM17541p)) {
                setTitle(charSequenceM17541p);
            }
            CharSequence charSequenceM17541p2 = anhVarM17525v.m17541p(bbe.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceM17541p2)) {
                mo4459h(charSequenceM17541p2);
            }
            Drawable drawableM17532g = anhVarM17525v.m17532g(bbe.ActionBar_logo);
            if (drawableM17532g != null) {
                m4477z(drawableM17532g);
            }
            Drawable drawableM17532g2 = anhVarM17525v.m17532g(bbe.ActionBar_icon);
            if (drawableM17532g2 != null) {
                setIcon(drawableM17532g2);
            }
            if (this.f6020g == null && (drawable = this.f6030q) != null) {
                m4447C(drawable);
            }
            mo4458g(anhVarM17525v.m17536k(bbe.ActionBar_displayOptions, 0));
            int iM17539n = anhVarM17525v.m17539n(bbe.ActionBar_customNavigationLayout, 0);
            if (iM17539n != 0) {
                m4475x(LayoutInflater.from(this.f6014a.getContext()).inflate(iM17539n, (ViewGroup) this.f6014a, false));
                mo4458g(this.f6015b | 16);
            }
            int iM17538m = anhVarM17525v.m17538m(bbe.ActionBar_height, 0);
            if (iM17538m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f6014a.getLayoutParams();
                layoutParams.height = iM17538m;
                this.f6014a.setLayoutParams(layoutParams);
            }
            int iM17530e = anhVarM17525v.m17530e(bbe.ActionBar_contentInsetStart, -1);
            int iM17530e2 = anhVarM17525v.m17530e(bbe.ActionBar_contentInsetEnd, -1);
            if (iM17530e >= 0 || iM17530e2 >= 0) {
                this.f6014a.setContentInsetsRelative(Math.max(iM17530e, 0), Math.max(iM17530e2, 0));
            }
            int iM17539n2 = anhVarM17525v.m17539n(bbe.ActionBar_titleTextStyle, 0);
            if (iM17539n2 != 0) {
                Toolbar toolbar2 = this.f6014a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM17539n2);
            }
            int iM17539n3 = anhVarM17525v.m17539n(bbe.ActionBar_subtitleTextStyle, 0);
            if (iM17539n3 != 0) {
                Toolbar toolbar3 = this.f6014a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM17539n3);
            }
            int iM17539n4 = anhVarM17525v.m17539n(bbe.ActionBar_popupTheme, 0);
            if (iM17539n4 != 0) {
                this.f6014a.setPopupTheme(iM17539n4);
            }
        } else {
            this.f6015b = m4474w();
        }
        anhVarM17525v.m17546x();
        m4476y(i);
        this.f6024k = this.f6014a.getNavigationContentDescription();
        this.f6014a.setNavigationOnClickListener(new a());
    }

    @Override // p001o.e85
    public void setIcon(Drawable drawable) {
        this.f6018e = drawable;
        m4451G();
    }
}
