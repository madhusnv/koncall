package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import c6.v0;
import com.google.android.material.datepicker.C1346j;
import java.lang.reflect.Field;
import lh.AbstractC4469e;
import og.ia;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p012n.InterfaceC4936p;
import p012n.MenuItemC4930j;
import p013o.a1;
import t5.AbstractC7052j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC4469e implements InterfaceC4936p {

    /* renamed from: K */
    public static final int[] f6923K = {R.attr.state_checked};

    /* renamed from: B */
    public boolean f6924B;

    /* renamed from: C */
    public final CheckedTextView f6925C;

    /* renamed from: D */
    public FrameLayout f6926D;

    /* renamed from: E */
    public MenuItemC4930j f6927E;

    /* renamed from: F */
    public ColorStateList f6928F;

    /* renamed from: G */
    public boolean f6929G;

    /* renamed from: H */
    public Drawable f6930H;

    /* renamed from: I */
    public final C1346j f6931I;

    /* renamed from: y */
    public int f6932y;

    /* renamed from: z */
    public boolean f6933z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1346j c1346j = new C1346j(3, this);
        this.f6931I = c1346j;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.websoptimization.callyzerbiz.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.websoptimization.callyzerbiz.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.websoptimization.callyzerbiz.R.id.design_menu_item_text);
        this.f6925C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v0.m2528j(checkedTextView, c1346j);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f6926D == null) {
                this.f6926D = (FrameLayout) ((ViewStub) findViewById(com.websoptimization.callyzerbiz.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f6926D.removeAllViews();
            this.f6926D.addView(view);
        }
    }

    @Override // p012n.InterfaceC4936p
    /* renamed from: a */
    public final void mo550a(MenuItemC4930j menuItemC4930j) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f6927E = menuItemC4930j;
        int i10 = menuItemC4930j.f24555a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(menuItemC4930j.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.websoptimization.callyzerbiz.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6923K, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = v0.f5527a;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemC4930j.isCheckable());
        setChecked(menuItemC4930j.isChecked());
        setEnabled(menuItemC4930j.isEnabled());
        setTitle(menuItemC4930j.f24559e);
        setIcon(menuItemC4930j.getIcon());
        View view = menuItemC4930j.f24580z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(menuItemC4930j.f24571q);
        ia.m10698b(this, menuItemC4930j.f24572r);
        MenuItemC4930j menuItemC4930j2 = this.f6927E;
        CharSequence charSequence = menuItemC4930j2.f24559e;
        CheckedTextView checkedTextView = this.f6925C;
        if (charSequence == null && menuItemC4930j2.getIcon() == null) {
            View view2 = this.f6927E.f24580z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f6926D;
                if (frameLayout != null) {
                    a1 a1Var = (a1) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) a1Var).width = -1;
                    this.f6926D.setLayoutParams(a1Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f6926D;
        if (frameLayout2 != null) {
            a1 a1Var2 = (a1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) a1Var2).width = -2;
            this.f6926D.setLayoutParams(a1Var2);
        }
    }

    @Override // p012n.InterfaceC4936p
    public MenuItemC4930j getItemData() {
        return this.f6927E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemC4930j menuItemC4930j = this.f6927E;
        if (menuItemC4930j != null && menuItemC4930j.isCheckable() && this.f6927E.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6923K);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f6924B != z6) {
            this.f6924B = z6;
            this.f6931I.mo2342h(this.f6925C, NewHope.SENDB_BYTES);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        this.f6925C.setChecked(z6);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f6929G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f6928F);
            }
            int i10 = this.f6932y;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f6933z) {
            if (this.f6930H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC7052j.f34088a;
                Drawable drawable2 = resources.getDrawable(com.websoptimization.callyzerbiz.R.drawable.navigation_empty_icon, theme);
                this.f6930H = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f6932y;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f6930H;
        }
        this.f6925C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f6925C.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f6932y = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f6928F = colorStateList;
        this.f6929G = colorStateList != null;
        MenuItemC4930j menuItemC4930j = this.f6927E;
        if (menuItemC4930j != null) {
            setIcon(menuItemC4930j.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f6925C.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f6933z = z6;
    }

    public void setTextAppearance(int i10) {
        this.f6925C.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6925C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6925C.setText(charSequence);
    }
}
