package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p001o.n9e;
import p001o.t54;
import p001o.x5e;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* renamed from: H */
    public static final int[] f12997H;

    /* renamed from: I */
    public static final int[] f12998I;

    /* renamed from: F */
    public final AccessibilityManager f12999F;

    /* renamed from: G */
    public boolean f13000G;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    public static class C11130a extends BaseTransientBottomBar.AbstractC11128q {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC11128q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo15181a(Snackbar snackbar, int i) {
        }
    }

    static {
        int i = x5e.snackbarButtonStyle;
        f12997H = new int[]{i};
        f12998I = new int[]{i, x5e.snackbarTextViewStyle};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, t54 t54Var) {
        super(context, viewGroup, view, t54Var);
        this.f12999F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static ViewGroup f0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean j0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f12998I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        m15171y(1);
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i) {
        return m0(null, view, charSequence, i);
    }

    public static Snackbar m0(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroupF0 = f0(view);
        if (viewGroupF0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupF0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(j0(context) ? n9e.mtrl_layout_snackbar_include : n9e.design_layout_snackbar_include, viewGroupF0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupF0, snackbarContentLayout, snackbarContentLayout);
        snackbar.o0(charSequence);
        snackbar.m15158S(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: B */
    public int mo15141B() {
        int iMo15141B = super.mo15141B();
        if (iMo15141B == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f12999F.getRecommendedTimeoutMillis(iMo15141B, (this.f13000G ? 4 : 0) | 1 | 2);
        }
        if (this.f13000G && this.f12999F.isTouchExplorationEnabled()) {
            return -2;
        }
        return iMo15141B;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: W */
    public void mo15162W() {
        super.mo15162W();
    }

    public final Button g0() {
        return h0().getActionView();
    }

    public final SnackbarContentLayout h0() {
        return (SnackbarContentLayout) this.f12949i.getChildAt(0);
    }

    public final TextView i0() {
        return h0().getMessageView();
    }

    public Snackbar n0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonG0 = g0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonG0.setVisibility(8);
            buttonG0.setOnClickListener(null);
            this.f13000G = false;
        } else {
            this.f13000G = true;
            buttonG0.setVisibility(0);
            buttonG0.setText(charSequence);
            buttonG0.setOnClickListener(new View.OnClickListener() { // from class: o.vwf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50965a.k0(onClickListener, view);
                }
            });
        }
        return this;
    }

    public Snackbar o0(CharSequence charSequence) {
        i0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: x */
    public void mo15170x() {
        super.mo15170x();
    }
}
