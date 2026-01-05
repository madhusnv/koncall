package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001o.azi;
import p001o.bbe;
import p001o.bzi;
import p001o.e85;
import p001o.nm;
import p001o.r8e;
import p001o.tq;
import p001o.vm;
import p001o.wvi;
import p001o.xyi;
import p001o.yyi;
import p001o.z5e;
import p001o.zdg;
import p001o.zyi;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes2.dex */
public class C1785d extends ActionBar implements ActionBarOverlayLayout.InterfaceC1805d {

    /* renamed from: E */
    public static final Interpolator f5469E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f5470F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f5471A;

    /* renamed from: a */
    public Context f5475a;

    /* renamed from: b */
    public Context f5476b;

    /* renamed from: c */
    public Activity f5477c;

    /* renamed from: d */
    public ActionBarOverlayLayout f5478d;

    /* renamed from: e */
    public ActionBarContainer f5479e;

    /* renamed from: f */
    public e85 f5480f;

    /* renamed from: g */
    public ActionBarContextView f5481g;

    /* renamed from: h */
    public View f5482h;

    /* renamed from: i */
    public ScrollingTabContainerView f5483i;

    /* renamed from: l */
    public boolean f5486l;

    /* renamed from: m */
    public d f5487m;

    /* renamed from: n */
    public vm f5488n;

    /* renamed from: o */
    public vm.InterfaceC17615a f5489o;

    /* renamed from: p */
    public boolean f5490p;

    /* renamed from: r */
    public boolean f5492r;

    /* renamed from: u */
    public boolean f5495u;

    /* renamed from: v */
    public boolean f5496v;

    /* renamed from: w */
    public boolean f5497w;

    /* renamed from: y */
    public yyi f5499y;

    /* renamed from: z */
    public boolean f5500z;

    /* renamed from: j */
    public ArrayList f5484j = new ArrayList();

    /* renamed from: k */
    public int f5485k = -1;

    /* renamed from: q */
    public ArrayList f5491q = new ArrayList();

    /* renamed from: s */
    public int f5493s = 0;

    /* renamed from: t */
    public boolean f5494t = true;

    /* renamed from: x */
    public boolean f5498x = true;

    /* renamed from: B */
    public final zyi f5472B = new a();

    /* renamed from: C */
    public final zyi f5473C = new b();

    /* renamed from: D */
    public final bzi f5474D = new c();

    /* renamed from: androidx.appcompat.app.d$a */
    public class a extends azi {
        public a() {
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            View view2;
            C1785d c1785d = C1785d.this;
            if (c1785d.f5494t && (view2 = c1785d.f5482h) != null) {
                view2.setTranslationY(0.0f);
                C1785d.this.f5479e.setTranslationY(0.0f);
            }
            C1785d.this.f5479e.setVisibility(8);
            C1785d.this.f5479e.setTransitioning(false);
            C1785d c1785d2 = C1785d.this;
            c1785d2.f5499y = null;
            c1785d2.m3908B();
            ActionBarOverlayLayout actionBarOverlayLayout = C1785d.this.f5478d;
            if (actionBarOverlayLayout != null) {
                wvi.j0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    public class b extends azi {
        public b() {
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            C1785d c1785d = C1785d.this;
            c1785d.f5499y = null;
            c1785d.f5479e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.d$c */
    public class c implements bzi {
        public c() {
        }

        @Override // p001o.bzi
        /* renamed from: a */
        public void mo3930a(View view) {
            ((View) C1785d.this.f5479e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.d$d */
    public class d extends vm implements C1792e.a {

        /* renamed from: c */
        public final Context f5504c;

        /* renamed from: d */
        public final C1792e f5505d;

        /* renamed from: e */
        public vm.InterfaceC17615a f5506e;

        /* renamed from: f */
        public WeakReference f5507f;

        public d(Context context, vm.InterfaceC17615a interfaceC17615a) {
            this.f5504c = context;
            this.f5506e = interfaceC17615a;
            C1792e c1792eM4037X = new C1792e(context).m4037X(1);
            this.f5505d = c1792eM4037X;
            c1792eM4037X.mo4036W(this);
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            vm.InterfaceC17615a interfaceC17615a = this.f5506e;
            if (interfaceC17615a != null) {
                return interfaceC17615a.mo3839c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
            if (this.f5506e == null) {
                return;
            }
            mo3937k();
            C1785d.this.f5481g.m4119l();
        }

        @Override // p001o.vm
        /* renamed from: c */
        public void mo3931c() {
            C1785d c1785d = C1785d.this;
            if (c1785d.f5487m != this) {
                return;
            }
            if (C1785d.m3907A(c1785d.f5495u, c1785d.f5496v, false)) {
                this.f5506e.mo3838b(this);
            } else {
                C1785d c1785d2 = C1785d.this;
                c1785d2.f5488n = this;
                c1785d2.f5489o = this.f5506e;
            }
            this.f5506e = null;
            C1785d.this.m3929z(false);
            C1785d.this.f5481g.m4114g();
            C1785d c1785d3 = C1785d.this;
            c1785d3.f5478d.setHideOnContentScrollEnabled(c1785d3.f5471A);
            C1785d.this.f5487m = null;
        }

        @Override // p001o.vm
        /* renamed from: d */
        public View mo3932d() {
            WeakReference weakReference = this.f5507f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // p001o.vm
        /* renamed from: e */
        public Menu mo3933e() {
            return this.f5505d;
        }

        @Override // p001o.vm
        /* renamed from: f */
        public MenuInflater mo3934f() {
            return new zdg(this.f5504c);
        }

        @Override // p001o.vm
        /* renamed from: g */
        public CharSequence mo3935g() {
            return C1785d.this.f5481g.getSubtitle();
        }

        @Override // p001o.vm
        /* renamed from: i */
        public CharSequence mo3936i() {
            return C1785d.this.f5481g.getTitle();
        }

        @Override // p001o.vm
        /* renamed from: k */
        public void mo3937k() {
            if (C1785d.this.f5487m != this) {
                return;
            }
            this.f5505d.i0();
            try {
                this.f5506e.mo3840d(this, this.f5505d);
            } finally {
                this.f5505d.h0();
            }
        }

        @Override // p001o.vm
        /* renamed from: l */
        public boolean mo3938l() {
            return C1785d.this.f5481g.m4117j();
        }

        @Override // p001o.vm
        /* renamed from: m */
        public void mo3939m(View view) {
            C1785d.this.f5481g.setCustomView(view);
            this.f5507f = new WeakReference(view);
        }

        @Override // p001o.vm
        /* renamed from: n */
        public void mo3940n(int i) {
            mo3941o(C1785d.this.f5475a.getResources().getString(i));
        }

        @Override // p001o.vm
        /* renamed from: o */
        public void mo3941o(CharSequence charSequence) {
            C1785d.this.f5481g.setSubtitle(charSequence);
        }

        @Override // p001o.vm
        /* renamed from: q */
        public void mo3942q(int i) {
            mo3943r(C1785d.this.f5475a.getResources().getString(i));
        }

        @Override // p001o.vm
        /* renamed from: r */
        public void mo3943r(CharSequence charSequence) {
            C1785d.this.f5481g.setTitle(charSequence);
        }

        @Override // p001o.vm
        /* renamed from: s */
        public void mo3944s(boolean z) {
            super.mo3944s(z);
            C1785d.this.f5481g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m3945t() {
            this.f5505d.i0();
            try {
                return this.f5506e.mo3837a(this, this.f5505d);
            } finally {
                this.f5505d.h0();
            }
        }
    }

    public C1785d(Activity activity, boolean z) {
        this.f5477c = activity;
        View decorView = activity.getWindow().getDecorView();
        m3914H(decorView);
        if (z) {
            return;
        }
        this.f5482h = decorView.findViewById(R.id.content);
    }

    /* renamed from: A */
    public static boolean m3907A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: B */
    public void m3908B() {
        vm.InterfaceC17615a interfaceC17615a = this.f5489o;
        if (interfaceC17615a != null) {
            interfaceC17615a.mo3838b(this.f5488n);
            this.f5488n = null;
            this.f5489o = null;
        }
    }

    /* renamed from: C */
    public void m3909C(boolean z) {
        View view;
        yyi yyiVar = this.f5499y;
        if (yyiVar != null) {
            yyiVar.m58542a();
        }
        if (this.f5493s != 0 || (!this.f5500z && !z)) {
            this.f5472B.mo3832b(null);
            return;
        }
        this.f5479e.setAlpha(1.0f);
        this.f5479e.setTransitioning(true);
        yyi yyiVar2 = new yyi();
        float f = -this.f5479e.getHeight();
        if (z) {
            this.f5479e.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        xyi xyiVarM56983m = wvi.m55118e(this.f5479e).m56983m(f);
        xyiVarM56983m.m56981k(this.f5474D);
        yyiVar2.m58544c(xyiVarM56983m);
        if (this.f5494t && (view = this.f5482h) != null) {
            yyiVar2.m58544c(wvi.m55118e(view).m56983m(f));
        }
        yyiVar2.m58547f(f5469E);
        yyiVar2.m58546e(250L);
        yyiVar2.m58548g(this.f5472B);
        this.f5499y = yyiVar2;
        yyiVar2.m58549h();
    }

    /* renamed from: D */
    public void m3910D(boolean z) {
        View view;
        View view2;
        yyi yyiVar = this.f5499y;
        if (yyiVar != null) {
            yyiVar.m58542a();
        }
        this.f5479e.setVisibility(0);
        if (this.f5493s == 0 && (this.f5500z || z)) {
            this.f5479e.setTranslationY(0.0f);
            float f = -this.f5479e.getHeight();
            if (z) {
                this.f5479e.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f5479e.setTranslationY(f);
            yyi yyiVar2 = new yyi();
            xyi xyiVarM56983m = wvi.m55118e(this.f5479e).m56983m(0.0f);
            xyiVarM56983m.m56981k(this.f5474D);
            yyiVar2.m58544c(xyiVarM56983m);
            if (this.f5494t && (view2 = this.f5482h) != null) {
                view2.setTranslationY(f);
                yyiVar2.m58544c(wvi.m55118e(this.f5482h).m56983m(0.0f));
            }
            yyiVar2.m58547f(f5470F);
            yyiVar2.m58546e(250L);
            yyiVar2.m58548g(this.f5473C);
            this.f5499y = yyiVar2;
            yyiVar2.m58549h();
        } else {
            this.f5479e.setAlpha(1.0f);
            this.f5479e.setTranslationY(0.0f);
            if (this.f5494t && (view = this.f5482h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f5473C.mo3832b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5478d;
        if (actionBarOverlayLayout != null) {
            wvi.j0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final e85 m3911E(View view) {
        if (view instanceof e85) {
            return (e85) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: F */
    public int m3912F() {
        return this.f5480f.mo4461j();
    }

    /* renamed from: G */
    public final void m3913G() {
        if (this.f5497w) {
            this.f5497w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f5478d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m3922P(false);
        }
    }

    /* renamed from: H */
    public final void m3914H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(r8e.decor_content_parent);
        this.f5478d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f5480f = m3911E(view.findViewById(r8e.action_bar));
        this.f5481g = (ActionBarContextView) view.findViewById(r8e.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(r8e.action_bar_container);
        this.f5479e = actionBarContainer;
        e85 e85Var = this.f5480f;
        if (e85Var == null || this.f5481g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f5475a = e85Var.getContext();
        boolean z = (this.f5480f.mo4472u() & 4) != 0;
        if (z) {
            this.f5486l = true;
        }
        nm nmVarM40771b = nm.m40771b(this.f5475a);
        m3919M(nmVarM40771b.m40772a() || z);
        m3917K(nmVarM40771b.m40777g());
        TypedArray typedArrayObtainStyledAttributes = this.f5475a.obtainStyledAttributes(null, bbe.ActionBar, z5e.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(bbe.ActionBar_hideOnContentScroll, false)) {
            m3918L(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m3916J(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    public void m3915I(int i, int i2) {
        int iMo4472u = this.f5480f.mo4472u();
        if ((i2 & 4) != 0) {
            this.f5486l = true;
        }
        this.f5480f.mo4458g((i & i2) | ((~i2) & iMo4472u));
    }

    /* renamed from: J */
    public void m3916J(float f) {
        wvi.s0(this.f5479e, f);
    }

    /* renamed from: K */
    public final void m3917K(boolean z) {
        this.f5492r = z;
        if (z) {
            this.f5479e.setTabContainer(null);
            this.f5480f.mo4468q(this.f5483i);
        } else {
            this.f5480f.mo4468q(null);
            this.f5479e.setTabContainer(this.f5483i);
        }
        boolean z2 = m3912F() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f5483i;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5478d;
                if (actionBarOverlayLayout != null) {
                    wvi.j0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f5480f.mo4466o(!this.f5492r && z2);
        this.f5478d.setHasNonEmbeddedTabs(!this.f5492r && z2);
    }

    /* renamed from: L */
    public void m3918L(boolean z) {
        if (z && !this.f5478d.m4142v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f5471A = z;
        this.f5478d.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: M */
    public void m3919M(boolean z) {
        this.f5480f.mo4464m(z);
    }

    /* renamed from: N */
    public final boolean m3920N() {
        return this.f5479e.isLaidOut();
    }

    /* renamed from: O */
    public final void m3921O() {
        if (this.f5497w) {
            return;
        }
        this.f5497w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5478d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m3922P(false);
    }

    /* renamed from: P */
    public final void m3922P(boolean z) {
        if (m3907A(this.f5495u, this.f5496v, this.f5497w)) {
            if (this.f5498x) {
                return;
            }
            this.f5498x = true;
            m3910D(z);
            return;
        }
        if (this.f5498x) {
            this.f5498x = false;
            m3909C(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: a */
    public void mo3923a() {
        if (this.f5496v) {
            this.f5496v = false;
            m3922P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: b */
    public void mo3924b(int i) {
        this.f5493s = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: c */
    public void mo3925c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: d */
    public void mo3926d(boolean z) {
        this.f5494t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: e */
    public void mo3927e() {
        if (this.f5496v) {
            return;
        }
        this.f5496v = true;
        m3922P(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1805d
    /* renamed from: f */
    public void mo3928f() {
        yyi yyiVar = this.f5499y;
        if (yyiVar != null) {
            yyiVar.m58542a();
            this.f5499y = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo3739h() {
        e85 e85Var = this.f5480f;
        if (e85Var == null || !e85Var.mo4457f()) {
            return false;
        }
        this.f5480f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo3740i(boolean z) {
        if (z == this.f5490p) {
            return;
        }
        this.f5490p = z;
        if (this.f5491q.size() <= 0) {
            return;
        }
        tq.m50332a(this.f5491q.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo3741j() {
        return this.f5480f.mo4472u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo3742k() {
        if (this.f5476b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5475a.getTheme().resolveAttribute(z5e.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f5476b = new ContextThemeWrapper(this.f5475a, i);
            } else {
                this.f5476b = this.f5475a;
            }
        }
        return this.f5476b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo3744m(Configuration configuration) {
        m3917K(nm.m40771b(this.f5475a).m40777g());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo3746o(int i, KeyEvent keyEvent) {
        Menu menuMo3933e;
        d dVar = this.f5487m;
        if (dVar == null || (menuMo3933e = dVar.mo3933e()) == null) {
            return false;
        }
        menuMo3933e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo3933e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo3749r(boolean z) {
        if (this.f5486l) {
            return;
        }
        mo3750s(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo3750s(boolean z) {
        m3915I(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo3751t(int i) {
        this.f5480f.mo4470s(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo3752u(boolean z) {
        yyi yyiVar;
        this.f5500z = z;
        if (z || (yyiVar = this.f5499y) == null) {
            return;
        }
        yyiVar.m58542a();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo3753v(CharSequence charSequence) {
        this.f5480f.mo4459h(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo3754w(CharSequence charSequence) {
        this.f5480f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo3755x(CharSequence charSequence) {
        this.f5480f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public vm mo3756y(vm.InterfaceC17615a interfaceC17615a) {
        d dVar = this.f5487m;
        if (dVar != null) {
            dVar.mo3931c();
        }
        this.f5478d.setHideOnContentScrollEnabled(false);
        this.f5481g.m4118k();
        d dVar2 = new d(this.f5481g.getContext(), interfaceC17615a);
        if (!dVar2.m3945t()) {
            return null;
        }
        this.f5487m = dVar2;
        dVar2.mo3937k();
        this.f5481g.m4115h(dVar2);
        m3929z(true);
        return dVar2;
    }

    /* renamed from: z */
    public void m3929z(boolean z) {
        xyi xyiVarMo4462k;
        xyi xyiVarMo4113f;
        if (z) {
            m3921O();
        } else {
            m3913G();
        }
        if (!m3920N()) {
            if (z) {
                this.f5480f.setVisibility(4);
                this.f5481g.setVisibility(0);
                return;
            } else {
                this.f5480f.setVisibility(0);
                this.f5481g.setVisibility(8);
                return;
            }
        }
        if (z) {
            xyiVarMo4113f = this.f5480f.mo4462k(4, 100L);
            xyiVarMo4462k = this.f5481g.mo4113f(0, 200L);
        } else {
            xyiVarMo4462k = this.f5480f.mo4462k(0, 200L);
            xyiVarMo4113f = this.f5481g.mo4113f(8, 100L);
        }
        yyi yyiVar = new yyi();
        yyiVar.m58545d(xyiVarMo4113f, xyiVarMo4462k);
        yyiVar.m58549h();
    }

    public C1785d(Dialog dialog) {
        m3914H(dialog.getWindow().getDecorView());
    }
}
