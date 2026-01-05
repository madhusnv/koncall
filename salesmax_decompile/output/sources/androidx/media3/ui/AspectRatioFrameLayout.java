package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p001o.rbe;

/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final RunnableC2267c f8747a;

    /* renamed from: b */
    public float f8748b;

    /* renamed from: c */
    public int f8749c;

    /* renamed from: androidx.media3.ui.AspectRatioFrameLayout$b */
    public interface InterfaceC2266b {
    }

    /* renamed from: androidx.media3.ui.AspectRatioFrameLayout$c */
    public final class RunnableC2267c implements Runnable {

        /* renamed from: a */
        public float f8750a;

        /* renamed from: b */
        public float f8751b;

        /* renamed from: c */
        public boolean f8752c;

        /* renamed from: d */
        public boolean f8753d;

        public RunnableC2267c() {
        }

        /* renamed from: a */
        public void m7611a(float f, float f2, boolean z) {
            this.f8750a = f;
            this.f8751b = f2;
            this.f8752c = z;
            if (this.f8753d) {
                return;
            }
            this.f8753d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8753d = false;
            AspectRatioFrameLayout.m7610a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC2266b m7610a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f8749c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f8748b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f8748b / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f8747a.m7611a(this.f8748b, f5, false);
            return;
        }
        int i3 = this.f8749c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f8748b;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f8748b;
                    } else {
                        f2 = this.f8748b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f8748b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f8748b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f8748b;
            measuredWidth = (int) (f4 * f);
        }
        this.f8747a.m7611a(this.f8748b, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f8748b != f) {
            this.f8748b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC2266b interfaceC2266b) {
    }

    public void setResizeMode(int i) {
        if (this.f8749c != i) {
            this.f8749c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8749c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rbe.AspectRatioFrameLayout, 0, 0);
            try {
                this.f8749c = typedArrayObtainStyledAttributes.getInt(rbe.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f8747a = new RunnableC2267c();
    }
}
