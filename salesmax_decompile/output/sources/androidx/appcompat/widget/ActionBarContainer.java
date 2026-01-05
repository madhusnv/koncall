package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import org.objectweb.asm.Opcodes;
import p001o.bbe;
import p001o.lm;
import p001o.r8e;

/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f5692a;

    /* renamed from: b */
    public View f5693b;

    /* renamed from: c */
    public View f5694c;

    /* renamed from: d */
    public View f5695d;

    /* renamed from: e */
    public Drawable f5696e;

    /* renamed from: f */
    public Drawable f5697f;

    /* renamed from: g */
    public Drawable f5698g;

    /* renamed from: h */
    public boolean f5699h;

    /* renamed from: q */
    public boolean f5700q;

    /* renamed from: s */
    public int f5701s;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    public static class C1800a {
        /* renamed from: a */
        public static void m4112a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int m4110a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m4111b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5696e;
        if (drawable != null && drawable.isStateful()) {
            this.f5696e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f5697f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f5697f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f5698g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f5698g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f5693b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5696e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5697f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f5698g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5694c = findViewById(r8e.action_bar);
        this.f5695d = findViewById(r8e.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5692a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f5693b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f5699h) {
            Drawable drawable2 = this.f5698g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f5696e != null) {
                if (this.f5694c.getVisibility() == 0) {
                    this.f5696e.setBounds(this.f5694c.getLeft(), this.f5694c.getTop(), this.f5694c.getRight(), this.f5694c.getBottom());
                } else {
                    View view2 = this.f5695d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f5696e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f5696e.setBounds(this.f5695d.getLeft(), this.f5695d.getTop(), this.f5695d.getRight(), this.f5695d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f5700q = z4;
            if (z4 && (drawable = this.f5697f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f5694c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f5701s) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f5694c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f5693b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m4111b(this.f5694c) ? m4110a(this.f5694c) : !m4111b(this.f5695d) ? m4110a(this.f5695d) : 0) + m4110a(this.f5693b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5696e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5696e);
        }
        this.f5696e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f5694c;
            if (view != null) {
                this.f5696e.setBounds(view.getLeft(), this.f5694c.getTop(), this.f5694c.getRight(), this.f5694c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f5699h ? this.f5696e != null || this.f5697f != null : this.f5698g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C1800a.m4112a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5698g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5698g);
        }
        this.f5698g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5699h && (drawable2 = this.f5698g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f5699h ? !(this.f5696e != null || this.f5697f != null) : this.f5698g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C1800a.m4112a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5697f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5697f);
        }
        this.f5697f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5700q && (drawable2 = this.f5697f) != null) {
                drawable2.setBounds(this.f5693b.getLeft(), this.f5693b.getTop(), this.f5693b.getRight(), this.f5693b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f5699h ? this.f5696e != null || this.f5697f != null : this.f5698g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C1800a.m4112a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f5693b;
        if (view != null) {
            removeView(view);
        }
        this.f5693b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f5692a = z;
        setDescendantFocusability(z ? Opcodes.ASM6 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5696e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f5697f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f5698g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f5696e && !this.f5699h) || (drawable == this.f5697f && this.f5700q) || ((drawable == this.f5698g && this.f5699h) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new lm(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ActionBar);
        this.f5696e = typedArrayObtainStyledAttributes.getDrawable(bbe.ActionBar_background);
        this.f5697f = typedArrayObtainStyledAttributes.getDrawable(bbe.ActionBar_backgroundStacked);
        this.f5701s = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.ActionBar_height, -1);
        boolean z = true;
        if (getId() == r8e.split_action_bar) {
            this.f5699h = true;
            this.f5698g = typedArrayObtainStyledAttributes.getDrawable(bbe.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f5699h ? this.f5696e != null || this.f5697f != null : this.f5698g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
