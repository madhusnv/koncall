package p001o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes2.dex */
public abstract class n6 extends ViewGroup {

    /* renamed from: a */
    public final C15508a f36419a;

    /* renamed from: b */
    public final Context f36420b;

    /* renamed from: c */
    public ActionMenuView f36421c;

    /* renamed from: d */
    public ActionMenuPresenter f36422d;

    /* renamed from: e */
    public int f36423e;

    /* renamed from: f */
    public xyi f36424f;

    /* renamed from: g */
    public boolean f36425g;

    /* renamed from: h */
    public boolean f36426h;

    /* renamed from: o.n6$a */
    public class C15508a implements zyi {

        /* renamed from: a */
        public boolean f36427a = false;

        /* renamed from: b */
        public int f36428b;

        public C15508a() {
        }

        @Override // p001o.zyi
        /* renamed from: a */
        public void mo4478a(View view) {
            this.f36427a = true;
        }

        @Override // p001o.zyi
        /* renamed from: b */
        public void mo3832b(View view) {
            if (this.f36427a) {
                return;
            }
            n6 n6Var = n6.this;
            n6Var.f36424f = null;
            n6.super.setVisibility(this.f36428b);
        }

        @Override // p001o.zyi
        /* renamed from: c */
        public void mo3833c(View view) {
            n6.super.setVisibility(0);
            this.f36427a = false;
        }

        /* renamed from: d */
        public C15508a m40138d(xyi xyiVar, int i) {
            n6.this.f36424f = xyiVar;
            this.f36428b = i;
            return this;
        }
    }

    public n6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36419a = new C15508a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(z5e.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f36420b = context;
        } else {
            this.f36420b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    public static int m40135d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public int m40136c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: e */
    public int m40137e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public xyi mo4113f(int i, long j) {
        xyi xyiVar = this.f36424f;
        if (xyiVar != null) {
            xyiVar.m56974c();
        }
        if (i != 0) {
            xyi xyiVarM56973b = wvi.m55118e(this).m56973b(0.0f);
            xyiVarM56973b.m56976f(j);
            xyiVarM56973b.m56978h(this.f36419a.m40138d(xyiVarM56973b, i));
            return xyiVarM56973b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        xyi xyiVarM56973b2 = wvi.m55118e(this).m56973b(1.0f);
        xyiVarM56973b2.m56976f(j);
        xyiVarM56973b2.m56978h(this.f36419a.m40138d(xyiVarM56973b2, i));
        return xyiVarM56973b2;
    }

    public int getAnimatedVisibility() {
        return this.f36424f != null ? this.f36419a.f36428b : getVisibility();
    }

    public int getContentHeight() {
        return this.f36423e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, bbe.ActionBar, z5e.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(bbe.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f36422d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m4161I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f36426h = false;
        }
        if (!this.f36426h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f36426h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f36426h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f36425g = false;
        }
        if (!this.f36425g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f36425g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f36425g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            xyi xyiVar = this.f36424f;
            if (xyiVar != null) {
                xyiVar.m56974c();
            }
            super.setVisibility(i);
        }
    }
}
