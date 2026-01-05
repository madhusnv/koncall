package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001o.anh;
import p001o.azb;
import p001o.e06;
import p001o.ebe;
import p001o.fy5;
import p001o.gjh;
import p001o.jjh;
import p001o.lk0;
import p001o.n8e;
import p001o.n9e;
import p001o.qa8;
import p001o.ra3;
import p001o.tq;
import p001o.ud4;
import p001o.v9e;
import p001o.vzc;
import p001o.w76;
import p001o.x6e;
import p001o.xzi;
import p001o.yya;

/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes3.dex */
public class C11154a extends LinearLayout {

    /* renamed from: H */
    public int f13125H;

    /* renamed from: L */
    public ImageView.ScaleType f13126L;

    /* renamed from: M */
    public View.OnLongClickListener f13127M;

    /* renamed from: Q */
    public CharSequence f13128Q;

    /* renamed from: a */
    public final TextInputLayout f13129a;

    /* renamed from: b */
    public final FrameLayout f13130b;

    /* renamed from: c */
    public final CheckableImageButton f13131c;

    /* renamed from: d */
    public ColorStateList f13132d;

    /* renamed from: e */
    public PorterDuff.Mode f13133e;

    /* renamed from: f */
    public View.OnLongClickListener f13134f;

    /* renamed from: g */
    public final CheckableImageButton f13135g;

    /* renamed from: h */
    public final d f13136h;
    public final TextView h0;
    public boolean i0;
    public EditText j0;
    public final AccessibilityManager k0;
    public AccessibilityManager.TouchExplorationStateChangeListener l0;
    public final TextWatcher m0;
    public final TextInputLayout.InterfaceC11153f n0;

    /* renamed from: q */
    public int f13137q;

    /* renamed from: s */
    public final LinkedHashSet f13138s;

    /* renamed from: x */
    public ColorStateList f13139x;

    /* renamed from: y */
    public PorterDuff.Mode f13140y;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class a extends jjh {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C11154a.this.m15429n().mo24009a(editable);
        }

        @Override // p001o.jjh, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C11154a.this.m15429n().mo53633b(charSequence, i, i2, i3);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class b implements TextInputLayout.InterfaceC11153f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC11153f
        /* renamed from: a */
        public void mo15389a(TextInputLayout textInputLayout) {
            if (C11154a.this.j0 == textInputLayout.getEditText()) {
                return;
            }
            if (C11154a.this.j0 != null) {
                C11154a.this.j0.removeTextChangedListener(C11154a.this.m0);
                if (C11154a.this.j0.getOnFocusChangeListener() == C11154a.this.m15429n().mo24012e()) {
                    C11154a.this.j0.setOnFocusChangeListener(null);
                }
            }
            C11154a.this.j0 = textInputLayout.getEditText();
            if (C11154a.this.j0 != null) {
                C11154a.this.j0.addTextChangedListener(C11154a.this.m0);
            }
            C11154a.this.m15429n().mo24020n(C11154a.this.j0);
            C11154a c11154a = C11154a.this;
            c11154a.i0(c11154a.m15429n());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C11154a.this.m15422g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C11154a.this.m15409N();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public static class d {

        /* renamed from: a */
        public final SparseArray f13144a = new SparseArray();

        /* renamed from: b */
        public final C11154a f13145b;

        /* renamed from: c */
        public final int f13146c;

        /* renamed from: d */
        public final int f13147d;

        public d(C11154a c11154a, anh anhVar) {
            this.f13145b = c11154a;
            this.f13146c = anhVar.m17539n(ebe.TextInputLayout_endIconDrawable, 0);
            this.f13147d = anhVar.m17539n(ebe.TextInputLayout_passwordToggleDrawable, 0);
        }

        /* renamed from: b */
        public final w76 m15443b(int i) {
            if (i == -1) {
                return new ud4(this.f13145b);
            }
            if (i == 0) {
                return new azb(this.f13145b);
            }
            if (i == 1) {
                return new vzc(this.f13145b, this.f13147d);
            }
            if (i == 2) {
                return new ra3(this.f13145b);
            }
            if (i == 3) {
                return new e06(this.f13145b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        /* renamed from: c */
        public w76 m15444c(int i) {
            w76 w76Var = (w76) this.f13144a.get(i);
            if (w76Var != null) {
                return w76Var;
            }
            w76 w76VarM15443b = m15443b(i);
            this.f13144a.append(i, w76VarM15443b);
            return w76VarM15443b;
        }
    }

    public C11154a(TextInputLayout textInputLayout, anh anhVar) {
        super(textInputLayout.getContext());
        this.f13137q = 0;
        this.f13138s = new LinkedHashSet();
        this.m0 = new a();
        b bVar = new b();
        this.n0 = bVar;
        this.k0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f13129a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13130b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM15425j = m15425j(this, layoutInflaterFrom, n8e.text_input_error_icon);
        this.f13131c = checkableImageButtonM15425j;
        CheckableImageButton checkableImageButtonM15425j2 = m15425j(frameLayout, layoutInflaterFrom, n8e.text_input_end_icon);
        this.f13135g = checkableImageButtonM15425j2;
        this.f13136h = new d(this, anhVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.h0 = appCompatTextView;
        m15399D(anhVar);
        m15398C(anhVar);
        m15400E(anhVar);
        frameLayout.addView(checkableImageButtonM15425j2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonM15425j);
        textInputLayout.m15368j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* renamed from: A */
    public TextView m15396A() {
        return this.h0;
    }

    /* renamed from: B */
    public boolean m15397B() {
        return this.f13137q != 0;
    }

    /* renamed from: C */
    public final void m15398C(anh anhVar) {
        if (!anhVar.m17544s(ebe.TextInputLayout_passwordToggleEnabled)) {
            if (anhVar.m17544s(ebe.TextInputLayout_endIconTint)) {
                this.f13139x = yya.m58495b(getContext(), anhVar, ebe.TextInputLayout_endIconTint);
            }
            if (anhVar.m17544s(ebe.TextInputLayout_endIconTintMode)) {
                this.f13140y = xzi.m57081q(anhVar.m17536k(ebe.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (anhVar.m17544s(ebe.TextInputLayout_endIconMode)) {
            m15417V(anhVar.m17536k(ebe.TextInputLayout_endIconMode, 0));
            if (anhVar.m17544s(ebe.TextInputLayout_endIconContentDescription)) {
                m15413R(anhVar.m17541p(ebe.TextInputLayout_endIconContentDescription));
            }
            m15411P(anhVar.m17526a(ebe.TextInputLayout_endIconCheckable, true));
        } else if (anhVar.m17544s(ebe.TextInputLayout_passwordToggleEnabled)) {
            if (anhVar.m17544s(ebe.TextInputLayout_passwordToggleTint)) {
                this.f13139x = yya.m58495b(getContext(), anhVar, ebe.TextInputLayout_passwordToggleTint);
            }
            if (anhVar.m17544s(ebe.TextInputLayout_passwordToggleTintMode)) {
                this.f13140y = xzi.m57081q(anhVar.m17536k(ebe.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            m15417V(anhVar.m17526a(ebe.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            m15413R(anhVar.m17541p(ebe.TextInputLayout_passwordToggleContentDescription));
        }
        m15416U(anhVar.m17531f(ebe.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(x6e.mtrl_min_touch_target_size)));
        if (anhVar.m17544s(ebe.TextInputLayout_endIconScaleType)) {
            m15420Y(qa8.m45043b(anhVar.m17536k(ebe.TextInputLayout_endIconScaleType, -1)));
        }
    }

    /* renamed from: D */
    public final void m15399D(anh anhVar) {
        if (anhVar.m17544s(ebe.TextInputLayout_errorIconTint)) {
            this.f13132d = yya.m58495b(getContext(), anhVar, ebe.TextInputLayout_errorIconTint);
        }
        if (anhVar.m17544s(ebe.TextInputLayout_errorIconTintMode)) {
            this.f13133e = xzi.m57081q(anhVar.m17536k(ebe.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (anhVar.m17544s(ebe.TextInputLayout_errorIconDrawable)) {
            d0(anhVar.m17532g(ebe.TextInputLayout_errorIconDrawable));
        }
        this.f13131c.setContentDescription(getResources().getText(v9e.error_icon_content_description));
        this.f13131c.setImportantForAccessibility(2);
        this.f13131c.setClickable(false);
        this.f13131c.setPressable(false);
        this.f13131c.setCheckable(false);
        this.f13131c.setFocusable(false);
    }

    /* renamed from: E */
    public final void m15400E(anh anhVar) {
        this.h0.setVisibility(8);
        this.h0.setId(n8e.textinput_suffix_text);
        this.h0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.h0.setAccessibilityLiveRegion(1);
        r0(anhVar.m17539n(ebe.TextInputLayout_suffixTextAppearance, 0));
        if (anhVar.m17544s(ebe.TextInputLayout_suffixTextColor)) {
            s0(anhVar.m17528c(ebe.TextInputLayout_suffixTextColor));
        }
        q0(anhVar.m17541p(ebe.TextInputLayout_suffixText));
    }

    /* renamed from: F */
    public boolean m15401F() {
        return m15397B() && this.f13135g.isChecked();
    }

    /* renamed from: G */
    public boolean m15402G() {
        return this.f13130b.getVisibility() == 0 && this.f13135g.getVisibility() == 0;
    }

    /* renamed from: H */
    public boolean m15403H() {
        return this.f13131c.getVisibility() == 0;
    }

    /* renamed from: I */
    public void m15404I(boolean z) {
        this.i0 = z;
        z0();
    }

    /* renamed from: J */
    public void m15405J() {
        x0();
        m15407L();
        m15406K();
        if (m15429n().mo24024t()) {
            v0(this.f13129a.i0());
        }
    }

    /* renamed from: K */
    public void m15406K() {
        qa8.m45045d(this.f13129a, this.f13135g, this.f13139x);
    }

    /* renamed from: L */
    public void m15407L() {
        qa8.m45045d(this.f13129a, this.f13131c, this.f13132d);
    }

    /* renamed from: M */
    public void m15408M(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        w76 w76VarM15429n = m15429n();
        boolean z3 = true;
        if (!w76VarM15429n.mo24018l() || (zIsChecked = this.f13135g.isChecked()) == w76VarM15429n.mo24019m()) {
            z2 = false;
        } else {
            this.f13135g.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!w76VarM15429n.mo24016j() || (zIsActivated = this.f13135g.isActivated()) == w76VarM15429n.mo24017k()) {
            z3 = z2;
        } else {
            m15410O(!zIsActivated);
        }
        if (z || z3) {
            m15406K();
        }
    }

    /* renamed from: N */
    public final void m15409N() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.l0;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.k0) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* renamed from: O */
    public void m15410O(boolean z) {
        this.f13135g.setActivated(z);
    }

    /* renamed from: P */
    public void m15411P(boolean z) {
        this.f13135g.setCheckable(z);
    }

    /* renamed from: Q */
    public void m15412Q(int i) {
        m15413R(i != 0 ? getResources().getText(i) : null);
    }

    /* renamed from: R */
    public void m15413R(CharSequence charSequence) {
        if (m15428m() != charSequence) {
            this.f13135g.setContentDescription(charSequence);
        }
    }

    /* renamed from: S */
    public void m15414S(int i) {
        m15415T(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    /* renamed from: T */
    public void m15415T(Drawable drawable) {
        this.f13135g.setImageDrawable(drawable);
        if (drawable != null) {
            qa8.m45042a(this.f13129a, this.f13135g, this.f13139x, this.f13140y);
            m15406K();
        }
    }

    /* renamed from: U */
    public void m15416U(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.f13125H) {
            this.f13125H = i;
            qa8.m45048g(this.f13135g, i);
            qa8.m45048g(this.f13131c, i);
        }
    }

    /* renamed from: V */
    public void m15417V(int i) {
        if (this.f13137q == i) {
            return;
        }
        u0(m15429n());
        int i2 = this.f13137q;
        this.f13137q = i;
        m15426k(i2);
        b0(i != 0);
        w76 w76VarM15429n = m15429n();
        m15414S(m15436u(w76VarM15429n));
        m15412Q(w76VarM15429n.mo24010c());
        m15411P(w76VarM15429n.mo24018l());
        if (!w76VarM15429n.mo24015i(this.f13129a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f13129a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        t0(w76VarM15429n);
        m15418W(w76VarM15429n.mo24013f());
        EditText editText = this.j0;
        if (editText != null) {
            w76VarM15429n.mo24020n(editText);
            i0(w76VarM15429n);
        }
        qa8.m45042a(this.f13129a, this.f13135g, this.f13139x, this.f13140y);
        m15408M(true);
    }

    /* renamed from: W */
    public void m15418W(View.OnClickListener onClickListener) {
        qa8.m45049h(this.f13135g, onClickListener, this.f13127M);
    }

    /* renamed from: X */
    public void m15419X(View.OnLongClickListener onLongClickListener) {
        this.f13127M = onLongClickListener;
        qa8.m45050i(this.f13135g, onLongClickListener);
    }

    /* renamed from: Y */
    public void m15420Y(ImageView.ScaleType scaleType) {
        this.f13126L = scaleType;
        qa8.m45051j(this.f13135g, scaleType);
        qa8.m45051j(this.f13131c, scaleType);
    }

    /* renamed from: Z */
    public void m15421Z(ColorStateList colorStateList) {
        if (this.f13139x != colorStateList) {
            this.f13139x = colorStateList;
            qa8.m45042a(this.f13129a, this.f13135g, colorStateList, this.f13140y);
        }
    }

    public void a0(PorterDuff.Mode mode) {
        if (this.f13140y != mode) {
            this.f13140y = mode;
            qa8.m45042a(this.f13129a, this.f13135g, this.f13139x, mode);
        }
    }

    public void b0(boolean z) {
        if (m15402G() != z) {
            this.f13135g.setVisibility(z ? 0 : 8);
            w0();
            y0();
            this.f13129a.u0();
        }
    }

    public void c0(int i) {
        d0(i != 0 ? lk0.m37353b(getContext(), i) : null);
        m15407L();
    }

    public void d0(Drawable drawable) {
        this.f13131c.setImageDrawable(drawable);
        x0();
        qa8.m45042a(this.f13129a, this.f13131c, this.f13132d, this.f13133e);
    }

    public void e0(View.OnClickListener onClickListener) {
        qa8.m45049h(this.f13131c, onClickListener, this.f13134f);
    }

    public void f0(View.OnLongClickListener onLongClickListener) {
        this.f13134f = onLongClickListener;
        qa8.m45050i(this.f13131c, onLongClickListener);
    }

    /* renamed from: g */
    public final void m15422g() {
        if (this.l0 == null || this.k0 == null || !isAttachedToWindow()) {
            return;
        }
        this.k0.addTouchExplorationStateChangeListener(this.l0);
    }

    public void g0(ColorStateList colorStateList) {
        if (this.f13132d != colorStateList) {
            this.f13132d = colorStateList;
            qa8.m45042a(this.f13129a, this.f13131c, colorStateList, this.f13133e);
        }
    }

    /* renamed from: h */
    public void m15423h() {
        this.f13135g.performClick();
        this.f13135g.jumpDrawablesToCurrentState();
    }

    public void h0(PorterDuff.Mode mode) {
        if (this.f13133e != mode) {
            this.f13133e = mode;
            qa8.m45042a(this.f13129a, this.f13131c, this.f13132d, mode);
        }
    }

    /* renamed from: i */
    public void m15424i() {
        this.f13138s.clear();
    }

    public final void i0(w76 w76Var) {
        if (this.j0 == null) {
            return;
        }
        if (w76Var.mo24012e() != null) {
            this.j0.setOnFocusChangeListener(w76Var.mo24012e());
        }
        if (w76Var.mo46470g() != null) {
            this.f13135g.setOnFocusChangeListener(w76Var.mo46470g());
        }
    }

    /* renamed from: j */
    public final CheckableImageButton m15425j(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(n9e.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        qa8.m45046e(checkableImageButton);
        if (yya.m58504k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public void j0(int i) {
        k0(i != 0 ? getResources().getText(i) : null);
    }

    /* renamed from: k */
    public final void m15426k(int i) {
        Iterator it = this.f13138s.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    public void k0(CharSequence charSequence) {
        this.f13135g.setContentDescription(charSequence);
    }

    /* renamed from: l */
    public CheckableImageButton m15427l() {
        if (m15403H()) {
            return this.f13131c;
        }
        if (m15397B() && m15402G()) {
            return this.f13135g;
        }
        return null;
    }

    public void l0(int i) {
        m0(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    /* renamed from: m */
    public CharSequence m15428m() {
        return this.f13135g.getContentDescription();
    }

    public void m0(Drawable drawable) {
        this.f13135g.setImageDrawable(drawable);
    }

    /* renamed from: n */
    public w76 m15429n() {
        return this.f13136h.m15444c(this.f13137q);
    }

    public void n0(boolean z) {
        if (z && this.f13137q != 1) {
            m15417V(1);
        } else {
            if (z) {
                return;
            }
            m15417V(0);
        }
    }

    /* renamed from: o */
    public Drawable m15430o() {
        return this.f13135g.getDrawable();
    }

    public void o0(ColorStateList colorStateList) {
        this.f13139x = colorStateList;
        qa8.m45042a(this.f13129a, this.f13135g, colorStateList, this.f13140y);
    }

    /* renamed from: p */
    public int m15431p() {
        return this.f13125H;
    }

    public void p0(PorterDuff.Mode mode) {
        this.f13140y = mode;
        qa8.m45042a(this.f13129a, this.f13135g, this.f13139x, mode);
    }

    /* renamed from: q */
    public int m15432q() {
        return this.f13137q;
    }

    public void q0(CharSequence charSequence) {
        this.f13128Q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.h0.setText(charSequence);
        z0();
    }

    /* renamed from: r */
    public ImageView.ScaleType m15433r() {
        return this.f13126L;
    }

    public void r0(int i) {
        gjh.m28914m(this.h0, i);
    }

    /* renamed from: s */
    public CheckableImageButton m15434s() {
        return this.f13135g;
    }

    public void s0(ColorStateList colorStateList) {
        this.h0.setTextColor(colorStateList);
    }

    /* renamed from: t */
    public Drawable m15435t() {
        return this.f13131c.getDrawable();
    }

    public final void t0(w76 w76Var) {
        w76Var.mo24023s();
        this.l0 = w76Var.mo24014h();
        m15422g();
    }

    /* renamed from: u */
    public final int m15436u(w76 w76Var) {
        int i = this.f13136h.f13146c;
        return i == 0 ? w76Var.mo24011d() : i;
    }

    public final void u0(w76 w76Var) {
        m15409N();
        this.l0 = null;
        w76Var.mo24025u();
    }

    /* renamed from: v */
    public CharSequence m15437v() {
        return this.f13135g.getContentDescription();
    }

    public final void v0(boolean z) {
        if (!z || m15430o() == null) {
            qa8.m45042a(this.f13129a, this.f13135g, this.f13139x, this.f13140y);
            return;
        }
        Drawable drawableMutate = fy5.m27744r(m15430o()).mutate();
        drawableMutate.setTint(this.f13129a.getErrorCurrentTextColors());
        this.f13135g.setImageDrawable(drawableMutate);
    }

    /* renamed from: w */
    public Drawable m15438w() {
        return this.f13135g.getDrawable();
    }

    public final void w0() {
        this.f13130b.setVisibility((this.f13135g.getVisibility() != 0 || m15403H()) ? 8 : 0);
        setVisibility(m15402G() || m15403H() || !((this.f13128Q == null || this.i0) ? 8 : false) ? 0 : 8);
    }

    /* renamed from: x */
    public CharSequence m15439x() {
        return this.f13128Q;
    }

    public final void x0() {
        this.f13131c.setVisibility(m15435t() != null && this.f13129a.m15361Q() && this.f13129a.i0() ? 0 : 8);
        w0();
        y0();
        if (m15397B()) {
            return;
        }
        this.f13129a.u0();
    }

    /* renamed from: y */
    public ColorStateList m15440y() {
        return this.h0.getTextColors();
    }

    public void y0() {
        if (this.f13129a.f13109e == null) {
            return;
        }
        this.h0.setPaddingRelative(getContext().getResources().getDimensionPixelSize(x6e.material_input_text_to_prefix_suffix_padding), this.f13129a.f13109e.getPaddingTop(), (m15402G() || m15403H()) ? 0 : this.f13129a.f13109e.getPaddingEnd(), this.f13129a.f13109e.getPaddingBottom());
    }

    /* renamed from: z */
    public int m15441z() {
        return getPaddingEnd() + this.h0.getPaddingEnd() + ((m15402G() || m15403H()) ? this.f13135g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f13135g.getLayoutParams()).getMarginStart() : 0);
    }

    public final void z0() {
        int visibility = this.h0.getVisibility();
        int i = (this.f13128Q == null || this.i0) ? 8 : 0;
        if (visibility != i) {
            m15429n().mo46471q(i == 0);
        }
        w0();
        this.h0.setVisibility(i);
        this.f13129a.u0();
    }
}
