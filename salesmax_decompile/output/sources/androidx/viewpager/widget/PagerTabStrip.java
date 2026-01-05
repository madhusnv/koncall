package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.perf.util.Constants;
import p001o.c64;

/* loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final Paint n0;
    public final Rect o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public int s0;
    public boolean t0;
    public float u0;
    public float v0;
    public int w0;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    public class ViewOnClickListenerC2528a implements View.OnClickListener {
        public ViewOnClickListenerC2528a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            PagerTabStrip.this.f10451a.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    public class ViewOnClickListenerC2529b implements View.OnClickListener {
        public ViewOnClickListenerC2529b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            ViewPager viewPager = PagerTabStrip.this.f10451a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: c */
    public void mo9964c(int i, float f, boolean z) {
        Rect rect = this.o0;
        int height = getHeight();
        int left = this.f10453c.getLeft() - this.m0;
        int right = this.f10453c.getRight() + this.m0;
        int i2 = height - this.i0;
        rect.set(left, i2, right, height);
        super.mo9964c(i, f, z);
        this.p0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f10453c.getLeft() - this.m0, i2, this.f10453c.getRight() + this.m0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.q0;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.l0);
    }

    public int getTabIndicatorColor() {
        return this.h0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f10453c.getLeft() - this.m0;
        int right = this.f10453c.getRight() + this.m0;
        int i = height - this.i0;
        this.n0.setColor((this.p0 << 24) | (this.h0 & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.n0);
        if (this.q0) {
            this.n0.setColor((this.h0 & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.s0, getWidth() - getPaddingRight(), f, this.n0);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction();
        if (action != 0 && this.t0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.u0 = x;
            this.v0 = y;
            this.t0 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.u0) > this.w0 || Math.abs(y - this.v0) > this.w0)) {
                this.t0 = true;
            }
        } else if (x < this.f10453c.getLeft() - this.m0) {
            ViewPager viewPager = this.f10451a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > this.f10453c.getRight() + this.m0) {
            ViewPager viewPager2 = this.f10451a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.r0) {
            return;
        }
        this.q0 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.r0) {
            return;
        }
        this.q0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.r0) {
            return;
        }
        this.q0 = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.q0 = z;
        this.r0 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.j0;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.h0 = i;
        this.n0.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(c64.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.k0;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.n0 = paint;
        this.o0 = new Rect();
        this.p0 = Constants.MAX_HOST_LENGTH;
        this.q0 = false;
        this.r0 = false;
        int i = this.f10450L;
        this.h0 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.i0 = (int) ((3.0f * f) + 0.5f);
        this.j0 = (int) ((6.0f * f) + 0.5f);
        this.k0 = (int) (64.0f * f);
        this.m0 = (int) ((16.0f * f) + 0.5f);
        this.s0 = (int) ((1.0f * f) + 0.5f);
        this.l0 = (int) ((f * 32.0f) + 0.5f);
        this.w0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f10452b.setFocusable(true);
        this.f10452b.setOnClickListener(new ViewOnClickListenerC2528a());
        this.f10454d.setFocusable(true);
        this.f10454d.setOnClickListener(new ViewOnClickListenerC2529b());
        if (getBackground() == null) {
            this.q0 = true;
        }
    }
}
