package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p001o.az5;
import p001o.aza;
import p001o.bkh;
import p001o.cbc;
import p001o.ebe;
import p001o.fy5;
import p001o.gjh;
import p001o.gua;
import p001o.gza;
import p001o.ish;
import p001o.l64;
import p001o.l91;
import p001o.lk0;
import p001o.n8e;
import p001o.n9e;
import p001o.o46;
import p001o.pae;
import p001o.ps6;
import p001o.qta;
import p001o.r9j;
import p001o.rta;
import p001o.tq;
import p001o.u7e;
import p001o.wvi;
import p001o.wya;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC2009b, qta {
    public static final int v0 = pae.Widget_Material3_SearchView;

    /* renamed from: H */
    public final View f12836H;

    /* renamed from: L */
    public final TouchObserverFrameLayout f12837L;

    /* renamed from: M */
    public final boolean f12838M;

    /* renamed from: Q */
    public final C11095a f12839Q;

    /* renamed from: a */
    public final View f12840a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f12841b;

    /* renamed from: c */
    public final View f12842c;

    /* renamed from: d */
    public final View f12843d;

    /* renamed from: e */
    public final FrameLayout f12844e;

    /* renamed from: f */
    public final FrameLayout f12845f;

    /* renamed from: g */
    public final MaterialToolbar f12846g;

    /* renamed from: h */
    public final Toolbar f12847h;
    public final rta h0;
    public final boolean i0;
    public final o46 j0;
    public final Set k0;
    public SearchBar l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;

    /* renamed from: q */
    public final TextView f12848q;
    public final int q0;
    public boolean r0;

    /* renamed from: s */
    public final LinearLayout f12849s;
    public boolean s0;
    public EnumC11094b t0;
    public Map u0;

    /* renamed from: x */
    public final EditText f12850x;

    /* renamed from: y */
    public final ImageButton f12851y;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.m14978x() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11092a();

        /* renamed from: c */
        public String f12852c;

        /* renamed from: d */
        public int f12853d;

        /* renamed from: com.google.android.material.search.SearchView$SavedState$a */
        public class C11092a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f12852c);
            parcel.writeInt(this.f12853d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12852c = parcel.readString();
            this.f12853d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$a */
    public class C11093a implements TextWatcher {
        public C11093a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.f12851y.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$b */
    public enum EnumC11094b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m14931A(View view) {
        m14972r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m14932B(View view) {
        m14971q();
        m14952J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ boolean m14933C(View view, MotionEvent motionEvent) {
        if (!m14973s()) {
            return false;
        }
        m14970p();
        return false;
    }

    /* renamed from: D */
    public static /* synthetic */ r9j m14934D(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, r9j r9jVar) {
        marginLayoutParams.leftMargin = i + r9jVar.m46395j();
        marginLayoutParams.rightMargin = i2 + r9jVar.m46396k();
        return r9jVar;
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m14935E(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ r9j m14936F(View view, r9j r9jVar) {
        int iM46397l = r9jVar.m46397l();
        setUpStatusBarSpacer(iM46397l);
        if (!this.s0) {
            setStatusBarSpacerEnabledInternal(iM46397l > 0);
        }
        return r9jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ r9j m14937G(View view, r9j r9jVar, xzi.C18288e c18288e) {
        boolean zM57079o = xzi.m57079o(this.f12846g);
        this.f12846g.setPadding((zM57079o ? c18288e.f54660c : c18288e.f54658a) + r9jVar.m46395j(), c18288e.f54659b, (zM57079o ? c18288e.f54658a : c18288e.f54660c) + r9jVar.m46396k(), c18288e.f54661d);
        return r9jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m14938H(View view) {
        m14964V();
    }

    private Window getActivityWindow() {
        Activity activityM36609a = l64.m36609a(getContext());
        if (activityM36609a == null) {
            return null;
        }
        return activityM36609a.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.l0;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(x6e.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.f12843d.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        o46 o46Var = this.j0;
        if (o46Var == null || this.f12842c == null) {
            return;
        }
        this.f12842c.setBackgroundColor(o46Var.m41514c(this.q0, f));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            m14969o(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f12844e, false));
        }
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.f12843d.getLayoutParams().height != i) {
            this.f12843d.getLayoutParams().height = i;
            this.f12843d.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m14949y() {
        this.f12850x.clearFocus();
        xzi.m57078n(this.f12850x, this.r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m14950z() {
        if (this.f12850x.requestFocus()) {
            this.f12850x.sendAccessibilityEvent(8);
        }
        xzi.m57084t(this.f12850x, this.r0);
    }

    /* renamed from: I */
    public void m14951I() {
        this.f12850x.postDelayed(new Runnable() { // from class: o.baf
            @Override // java.lang.Runnable
            public final void run() {
                this.f15830a.m14950z();
            }
        }, 100L);
    }

    /* renamed from: J */
    public void m14952J() {
        if (this.p0) {
            m14951I();
        }
    }

    /* renamed from: K */
    public final void m14953K(EnumC11094b enumC11094b, boolean z) {
        if (this.t0.equals(enumC11094b)) {
            return;
        }
        if (z) {
            m14967Y(enumC11094b);
        }
        this.t0 = enumC11094b;
        Iterator it = new LinkedHashSet(this.k0).iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        m14966X(enumC11094b);
        SearchBar searchBar = this.l0;
        if (searchBar == null || enumC11094b != EnumC11094b.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    /* renamed from: L */
    public final void m14954L(boolean z, boolean z2) {
        if (z2) {
            this.f12846g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f12846g.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.u9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48609a.m14931A(view);
            }
        });
        if (z) {
            az5 az5Var = new az5(getContext());
            az5Var.m18033d(gua.m29505d(this, x5e.colorOnSurface));
            this.f12846g.setNavigationIcon(az5Var);
        }
    }

    /* renamed from: M */
    public final void m14955M() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    /* renamed from: N */
    public final void m14956N() {
        this.f12851y.setOnClickListener(new View.OnClickListener() { // from class: o.z9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f56762a.m14932B(view);
            }
        });
        this.f12850x.addTextChangedListener(new C11093a());
    }

    /* renamed from: O */
    public final void m14957O() {
        this.f12837L.setOnTouchListener(new View.OnTouchListener() { // from class: o.r9f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f43253a.m14933C(view, motionEvent);
            }
        });
    }

    /* renamed from: P */
    public final void m14958P() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12836H.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        wvi.x0(this.f12836H, new cbc() { // from class: o.v9f
            @Override // p001o.cbc
            /* renamed from: a */
            public final r9j mo3830a(View view, r9j r9jVar) {
                return SearchView.m14934D(marginLayoutParams, i, i2, view, r9jVar);
            }
        });
    }

    /* renamed from: Q */
    public final void m14959Q(int i, String str, String str2) {
        if (i != -1) {
            gjh.m28914m(this.f12850x, i);
        }
        this.f12850x.setText(str);
        this.f12850x.setHint(str2);
    }

    /* renamed from: R */
    public final void m14960R() {
        m14963U();
        m14958P();
        m14962T();
    }

    /* renamed from: S */
    public final void m14961S() {
        this.f12841b.setOnTouchListener(new View.OnTouchListener() { // from class: o.t9f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m14935E(view, motionEvent);
            }
        });
    }

    /* renamed from: T */
    public final void m14962T() {
        setUpStatusBarSpacer(getStatusBarHeight());
        wvi.x0(this.f12843d, new cbc() { // from class: o.w9f
            @Override // p001o.cbc
            /* renamed from: a */
            public final r9j mo3830a(View view, r9j r9jVar) {
                return this.f51661a.m14936F(view, r9jVar);
            }
        });
    }

    /* renamed from: U */
    public final void m14963U() {
        xzi.m57070f(this.f12846g, new xzi.InterfaceC18287d() { // from class: o.aaf
            @Override // p001o.xzi.InterfaceC18287d
            /* renamed from: a */
            public final r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
                return this.f14393a.m14937G(view, r9jVar, c18288e);
            }
        });
    }

    /* renamed from: V */
    public void m14964V() {
        if (this.t0.equals(EnumC11094b.SHOWN) || this.t0.equals(EnumC11094b.SHOWING)) {
            return;
        }
        this.f12839Q.g0();
    }

    /* renamed from: W */
    public final void m14965W(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f12841b.getId()) != null) {
                    m14965W((ViewGroup) childAt, z);
                } else if (z) {
                    this.u0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.u0;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.u0.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: X */
    public final void m14966X(EnumC11094b enumC11094b) {
        if (this.l0 == null || !this.i0) {
            return;
        }
        if (enumC11094b.equals(EnumC11094b.SHOWN)) {
            this.h0.m47154c();
        } else if (enumC11094b.equals(EnumC11094b.HIDDEN)) {
            this.h0.m47157f();
        }
    }

    /* renamed from: Y */
    public final void m14967Y(EnumC11094b enumC11094b) {
        if (enumC11094b == EnumC11094b.SHOWN) {
            setModalForAccessibility(true);
        } else if (enumC11094b == EnumC11094b.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    /* renamed from: Z */
    public final void m14968Z() {
        MaterialToolbar materialToolbar = this.f12846g;
        if (materialToolbar == null || m14977w(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.l0 == null) {
            this.f12846g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableM27744r = fy5.m27744r(lk0.m37353b(getContext(), defaultNavigationIconResource).mutate());
        if (this.f12846g.getNavigationIconTint() != null) {
            drawableM27744r.setTint(this.f12846g.getNavigationIconTint().intValue());
        }
        fy5.m27739m(drawableM27744r, getLayoutDirection());
        this.f12846g.setNavigationIcon(new ps6(this.l0.getNavigationIcon(), drawableM27744r));
        a0();
    }

    @Override // p001o.qta
    /* renamed from: a */
    public void mo14172a() {
        if (m14975u() || this.l0 == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f12839Q.m15026r();
    }

    public final void a0() {
        ImageButton imageButtonM32700d = ish.m32700d(this.f12846g);
        if (imageButtonM32700d == null) {
            return;
        }
        int i = this.f12841b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableM27743q = fy5.m27743q(imageButtonM32700d.getDrawable());
        if (drawableM27743q instanceof az5) {
            ((az5) drawableM27743q).setProgress(i);
        }
        if (drawableM27743q instanceof ps6) {
            ((ps6) drawableM27743q).m44104a(i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f12838M) {
            this.f12837L.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // p001o.qta
    /* renamed from: b */
    public void mo14173b(l91 l91Var) {
        if (m14975u() || this.l0 == null) {
            return;
        }
        this.f12839Q.h0(l91Var);
    }

    public void b0() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.m0 = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // p001o.qta
    /* renamed from: c */
    public void mo14174c(l91 l91Var) {
        if (m14975u() || this.l0 == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f12839Q.m0(l91Var);
    }

    @Override // p001o.qta
    /* renamed from: d */
    public void mo14175d() {
        if (m14975u()) {
            return;
        }
        l91 l91VarM15019Z = this.f12839Q.m15019Z();
        if (Build.VERSION.SDK_INT < 34 || this.l0 == null || l91VarM15019Z == null) {
            m14972r();
        } else {
            this.f12839Q.m15027s();
        }
    }

    public wya getBackHelper() {
        return this.f12839Q.m15029u();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2009b
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    public EnumC11094b getCurrentTransitionState() {
        return this.t0;
    }

    public int getDefaultNavigationIconResource() {
        return u7e.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.f12850x;
    }

    public CharSequence getHint() {
        return this.f12850x.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f12848q;
    }

    public CharSequence getSearchPrefixText() {
        return this.f12848q.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.m0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f12850x.getText();
    }

    public Toolbar getToolbar() {
        return this.f12846g;
    }

    /* renamed from: o */
    public void m14969o(View view) {
        this.f12844e.addView(view);
        this.f12844e.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
        EnumC11094b currentTransitionState = getCurrentTransitionState();
        m14967Y(currentTransitionState);
        m14966X(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.h0.m47157f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        b0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        setText(savedState.f12852c);
        setVisible(savedState.f12853d == 0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f12852c = text == null ? null : text.toString();
        savedState.f12853d = this.f12841b.getVisibility();
        return savedState;
    }

    /* renamed from: p */
    public void m14970p() {
        this.f12850x.post(new Runnable() { // from class: o.s9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f45043a.m14949y();
            }
        });
    }

    /* renamed from: q */
    public void m14971q() {
        this.f12850x.setText("");
    }

    /* renamed from: r */
    public void m14972r() {
        if (this.t0.equals(EnumC11094b.HIDDEN) || this.t0.equals(EnumC11094b.HIDING)) {
            return;
        }
        this.f12839Q.m15018Q();
    }

    /* renamed from: s */
    public boolean m14973s() {
        return this.m0 == 48;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.n0 = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.p0 = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.f12850x.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.o0 = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.u0 = new HashMap(viewGroup.getChildCount());
        }
        m14965W(viewGroup, z);
        if (z) {
            return;
        }
        this.u0 = null;
    }

    public void setOnMenuItemClickListener(Toolbar.InterfaceC1882g interfaceC1882g) {
        this.f12846g.setOnMenuItemClickListener(interfaceC1882g);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f12848q.setText(charSequence);
        this.f12848q.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.s0 = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f12850x.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.f12846g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(EnumC11094b enumC11094b) {
        m14953K(enumC11094b, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.r0 = z;
    }

    public void setVisible(boolean z) {
        boolean z2 = this.f12841b.getVisibility() == 0;
        this.f12841b.setVisibility(z ? 0 : 8);
        a0();
        m14953K(z ? EnumC11094b.SHOWN : EnumC11094b.HIDDEN, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.l0 = searchBar;
        this.f12839Q.e0(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: o.x9f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f53404a.m14938H(view);
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: o.y9f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55114a.m14964V();
                        }
                    });
                    this.f12850x.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        m14968Z();
        m14955M();
        m14966X(getCurrentTransitionState());
    }

    /* renamed from: t */
    public boolean m14974t() {
        return this.n0;
    }

    /* renamed from: u */
    public final boolean m14975u() {
        return this.t0.equals(EnumC11094b.HIDDEN) || this.t0.equals(EnumC11094b.HIDING);
    }

    /* renamed from: v */
    public boolean m14976v() {
        return this.o0;
    }

    /* renamed from: w */
    public final boolean m14977w(Toolbar toolbar) {
        return fy5.m27743q(toolbar.getNavigationIcon()) instanceof az5;
    }

    /* renamed from: x */
    public boolean m14978x() {
        return this.l0 != null;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialSearchViewStyle);
    }

    public void setHint(int i) {
        this.f12850x.setHint(i);
    }

    public void setText(int i) {
        this.f12850x.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        int i2 = v0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.h0 = new rta(this);
        this.k0 = new LinkedHashSet();
        this.m0 = 16;
        this.t0 = EnumC11094b.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.SearchView, i, i2, new int[0]);
        this.q0 = typedArrayM19305i.getColor(ebe.SearchView_backgroundTint, 0);
        int resourceId = typedArrayM19305i.getResourceId(ebe.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayM19305i.getResourceId(ebe.SearchView_android_textAppearance, -1);
        String string = typedArrayM19305i.getString(ebe.SearchView_android_text);
        String string2 = typedArrayM19305i.getString(ebe.SearchView_android_hint);
        String string3 = typedArrayM19305i.getString(ebe.SearchView_searchPrefixText);
        boolean z = typedArrayM19305i.getBoolean(ebe.SearchView_useDrawerArrowDrawable, false);
        this.n0 = typedArrayM19305i.getBoolean(ebe.SearchView_animateNavigationIcon, true);
        this.o0 = typedArrayM19305i.getBoolean(ebe.SearchView_animateMenuItems, true);
        boolean z2 = typedArrayM19305i.getBoolean(ebe.SearchView_hideNavigationIcon, false);
        this.p0 = typedArrayM19305i.getBoolean(ebe.SearchView_autoShowKeyboard, true);
        this.i0 = typedArrayM19305i.getBoolean(ebe.SearchView_backHandlingEnabled, true);
        typedArrayM19305i.recycle();
        LayoutInflater.from(context2).inflate(n9e.mtrl_search_view, this);
        this.f12838M = true;
        this.f12840a = findViewById(n8e.open_search_view_scrim);
        this.f12841b = (ClippableRoundedCornerLayout) findViewById(n8e.open_search_view_root);
        this.f12842c = findViewById(n8e.open_search_view_background);
        this.f12843d = findViewById(n8e.open_search_view_status_bar_spacer);
        this.f12844e = (FrameLayout) findViewById(n8e.open_search_view_header_container);
        this.f12845f = (FrameLayout) findViewById(n8e.open_search_view_toolbar_container);
        this.f12846g = (MaterialToolbar) findViewById(n8e.open_search_view_toolbar);
        this.f12847h = (Toolbar) findViewById(n8e.open_search_view_dummy_toolbar);
        this.f12848q = (TextView) findViewById(n8e.open_search_view_search_prefix);
        this.f12849s = (LinearLayout) findViewById(n8e.open_search_view_text_container);
        this.f12850x = (EditText) findViewById(n8e.open_search_view_edit_text);
        this.f12851y = (ImageButton) findViewById(n8e.open_search_view_clear_button);
        this.f12836H = findViewById(n8e.open_search_view_divider);
        this.f12837L = (TouchObserverFrameLayout) findViewById(n8e.open_search_view_content_container);
        this.f12839Q = new C11095a(this);
        this.j0 = new o46(context2);
        m14961S();
        m14955M();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        m14959Q(resourceId2, string, string2);
        m14954L(z, z2);
        m14956N();
        m14957O();
        m14960R();
    }
}
