package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class t93 extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f46648a;

    /* renamed from: b */
    public int f46649b;

    /* renamed from: c */
    public int f46650c;

    /* renamed from: o.t93$a */
    public static class C17032a extends OvalShape {

        /* renamed from: a */
        public Paint f46651a = new Paint();

        /* renamed from: b */
        public int f46652b;

        /* renamed from: c */
        public t93 f46653c;

        public C17032a(t93 t93Var, int i) {
            this.f46653c = t93Var;
            this.f46652b = i;
            m49574a((int) rect().width());
        }

        /* renamed from: a */
        public final void m49574a(int i) {
            float f = i / 2;
            this.f46651a.setShader(new RadialGradient(f, f, this.f46652b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f46653c.getWidth() / 2;
            float height = this.f46653c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f46651a);
            canvas.drawCircle(width, height, r0 - this.f46652b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m49574a((int) f);
        }
    }

    public t93(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f46649b = (int) (3.5f * f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(wae.SwipeRefreshLayout);
        this.f46650c = typedArrayObtainStyledAttributes.getColor(wae.f51703xaa980688, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (m49572a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            wvi.s0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C17032a(this, this.f46649b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f46649b, i2, i, 503316480);
            int i3 = this.f46649b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f46650c);
        wvi.p0(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean m49572a() {
        return true;
    }

    /* renamed from: b */
    public void m49573b(Animation.AnimationListener animationListener) {
        this.f46648a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f46648a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f46648a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m49572a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f46649b * 2), getMeasuredHeight() + (this.f46649b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f46650c = i;
        }
    }
}
