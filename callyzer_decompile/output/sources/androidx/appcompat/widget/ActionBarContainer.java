package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.websoptimization.callyzerbiz.R;
import p009j.AbstractC3500a;
import p013o.C5215a;
import p013o.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f1701a;

    /* renamed from: b */
    public View f1702b;

    /* renamed from: c */
    public View f1703c;

    /* renamed from: d */
    public Drawable f1704d;

    /* renamed from: e */
    public Drawable f1705e;

    /* renamed from: f */
    public Drawable f1706f;

    /* renamed from: g */
    public final boolean f1707g;

    /* renamed from: h */
    public boolean f1708h;

    /* renamed from: j */
    public final int f1709j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5215a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18344a);
        boolean z6 = false;
        this.f1704d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1705e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1709j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1707g = true;
            this.f1706f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1707g ? !(this.f1704d != null || this.f1705e != null) : this.f1706f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1704d;
        if (drawable != null && drawable.isStateful()) {
            this.f1704d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1705e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1705e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1706f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1706f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1704d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1705e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1706f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1702b = findViewById(R.id.action_bar);
        this.f1703c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1701a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.f1707g) {
            Drawable drawable = this.f1706f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f1704d == null) {
                z10 = false;
            } else if (this.f1702b.getVisibility() == 0) {
                this.f1704d.setBounds(this.f1702b.getLeft(), this.f1702b.getTop(), this.f1702b.getRight(), this.f1702b.getBottom());
            } else {
                View view = this.f1703c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1704d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1704d.setBounds(this.f1703c.getLeft(), this.f1703c.getTop(), this.f1703c.getRight(), this.f1703c.getBottom());
                }
            }
            this.f1708h = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f1702b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1709j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1702b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1704d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1704d);
        }
        this.f1704d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1702b;
            if (view != null) {
                this.f1704d.setBounds(view.getLeft(), this.f1702b.getTop(), this.f1702b.getRight(), this.f1702b.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f1707g ? !(this.f1704d != null || this.f1705e != null) : this.f1706f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1706f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1706f);
        }
        this.f1706f = drawable;
        boolean z6 = this.f1707g;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f1706f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f1704d != null || this.f1705e != null) : this.f1706f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1705e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1705e);
        }
        this.f1705e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1708h && this.f1705e != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f1707g ? !(this.f1704d != null || this.f1705e != null) : this.f1706f == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f1701a = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f1704d;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f1705e;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f1706f;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1704d;
        boolean z6 = this.f1707g;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f1705e && this.f1708h) {
            return true;
        }
        return (drawable == this.f1706f && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(t1 t1Var) {
    }
}
