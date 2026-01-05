package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.widget.LinearLayoutCompat;
import p001o.cc;
import p001o.db;
import p001o.fy5;
import p001o.gjh;
import p001o.jsh;
import p001o.n8e;
import p001o.n9e;
import p001o.ppe;
import p001o.u7e;
import p001o.wvi;
import p001o.x6e;
import p001o.z5e;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC1797j.a {
    public static final int[] x0 = {R.attr.state_checked};
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final CheckedTextView q0;
    public FrameLayout r0;
    public C1794g s0;
    public ColorStateList t0;
    public boolean u0;
    public Drawable v0;
    public final db w0;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C11066a extends db {
        public C11066a() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.m0(NavigationMenuItemView.this.o0);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.r0 == null) {
                this.r0 = (FrameLayout) ((ViewStub) findViewById(n8e.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.r0.removeAllViews();
            this.r0.addView(view);
        }
    }

    /* renamed from: B */
    public final void m14755B() {
        if (m14759F()) {
            this.q0.setVisibility(8);
            FrameLayout frameLayout = this.r0;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.r0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.q0.setVisibility(0);
        FrameLayout frameLayout2 = this.r0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.r0.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: C */
    public final StateListDrawable m14756C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(z5e.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(x0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    public void m14757D(C1794g c1794g, boolean z) {
        this.p0 = z;
        mo3948c(c1794g, 0);
    }

    /* renamed from: E */
    public void m14758E() {
        FrameLayout frameLayout = this.r0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.q0.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: F */
    public final boolean m14759F() {
        return this.s0.getTitle() == null && this.s0.getIcon() == null && this.s0.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        this.s0 = c1794g;
        if (c1794g.getItemId() > 0) {
            setId(c1794g.getItemId());
        }
        setVisibility(c1794g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(m14756C());
        }
        setCheckable(c1794g.isCheckable());
        setChecked(c1794g.isChecked());
        setEnabled(c1794g.isEnabled());
        setTitle(c1794g.getTitle());
        setIcon(c1794g.getIcon());
        setActionView(c1794g.getActionView());
        setContentDescription(c1794g.getContentDescription());
        jsh.m34483a(this, c1794g.getTooltipText());
        m14755B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1794g c1794g = this.s0;
        if (c1794g != null && c1794g.isCheckable() && this.s0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.o0 != z) {
            this.o0 = z;
            this.w0.mo9658l(this.q0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.q0.setChecked(z);
        CheckedTextView checkedTextView = this.q0;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.p0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.u0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = fy5.m27744r(drawable).mutate();
                drawable.setTintList(this.t0);
            }
            int i = this.m0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.n0) {
            if (this.v0 == null) {
                Drawable drawableM44034e = ppe.m44034e(getResources(), u7e.navigation_empty_icon, getContext().getTheme());
                this.v0 = drawableM44034e;
                if (drawableM44034e != null) {
                    int i2 = this.m0;
                    drawableM44034e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.v0;
        }
        this.q0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.q0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.m0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.u0 = colorStateList != null;
        C1794g c1794g = this.s0;
        if (c1794g != null) {
            setIcon(c1794g.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.q0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.n0 = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        gjh.m28914m(this.q0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.q0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.q0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p0 = true;
        C11066a c11066a = new C11066a();
        this.w0 = c11066a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(n9e.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(x6e.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(n8e.design_menu_item_text);
        this.q0 = checkedTextView;
        wvi.m0(checkedTextView, c11066a);
    }
}
