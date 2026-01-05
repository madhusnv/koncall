package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import p001o.mbe;

/* loaded from: classes2.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: d */
    public float f6817d;

    /* renamed from: e */
    public float f6818e;

    /* renamed from: f */
    public Path f6819f;

    /* renamed from: g */
    public ViewOutlineProvider f6820g;

    /* renamed from: h */
    public RectF f6821h;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    public class C1997a extends ViewOutlineProvider {
        public C1997a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.f6817d) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    public class C1998b extends ViewOutlineProvider {
        public C1998b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f6818e);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f6817d = 0.0f;
        this.f6818e = Float.NaN;
        m5576c(context, null);
    }

    /* renamed from: c */
    public final void m5576c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == mbe.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f6818e;
    }

    public float getRoundPercent() {
        return this.f6817d;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f6818e = f;
            float f2 = this.f6817d;
            this.f6817d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f6818e != f;
        this.f6818e = f;
        if (f != 0.0f) {
            if (this.f6819f == null) {
                this.f6819f = new Path();
            }
            if (this.f6821h == null) {
                this.f6821h = new RectF();
            }
            if (this.f6820g == null) {
                C1998b c1998b = new C1998b();
                this.f6820g = c1998b;
                setOutlineProvider(c1998b);
            }
            setClipToOutline(true);
            this.f6821h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f6819f.reset();
            Path path = this.f6819f;
            RectF rectF = this.f6821h;
            float f3 = this.f6818e;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f6817d != f;
        this.f6817d = f;
        if (f != 0.0f) {
            if (this.f6819f == null) {
                this.f6819f = new Path();
            }
            if (this.f6821h == null) {
                this.f6821h = new RectF();
            }
            if (this.f6820g == null) {
                C1997a c1997a = new C1997a();
                this.f6820g = c1997a;
                setOutlineProvider(c1997a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f6817d) / 2.0f;
            this.f6821h.set(0.0f, 0.0f, width, height);
            this.f6819f.reset();
            this.f6819f.addRoundRect(this.f6821h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6817d = 0.0f;
        this.f6818e = Float.NaN;
        m5576c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6817d = 0.0f;
        this.f6818e = Float.NaN;
        m5576c(context, attributeSet);
    }
}
