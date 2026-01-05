package com.razorpay;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes6.dex */
class CircularProgressView extends View {
    private static final float INDETERMINANT_MIN_SWEEP = 15.0f;
    private float actualProgress;
    private int animDuration;
    private int animSteps;
    private int animSwoopDuration;
    private int animSyncDuration;
    private boolean autostartAnimation;
    private RectF bounds;
    private int color;
    private Context context;
    private float currentProgress;
    private AnimatorSet indeterminateAnimator;
    private float indeterminateRotateOffset;
    private float indeterminateSweep;
    private float initialStartAngle;
    private boolean isIndeterminate;
    private float maxProgress;
    private Paint paint;
    private ValueAnimator progressAnimator;
    private int size;
    private float startAngle;
    private ValueAnimator startAngleRotate;
    private int thickness;

    public CircularProgressView(Context context) {
        super(context);
        this.size = 0;
        init(null, 0, context);
    }

    private int convertDPtoInt(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    private AnimatorSet createIndeterminateAnimator(float f) {
        float f2 = (((r0 - 1) * 360.0f) / this.animSteps) + INDETERMINANT_MIN_SWEEP;
        float f3 = ((f2 - INDETERMINANT_MIN_SWEEP) * f) - 90.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(INDETERMINANT_MIN_SWEEP, f2);
        valueAnimatorOfFloat.setDuration((this.animDuration / this.animSteps) / 2);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new r__Q_(this));
        int i = this.animSteps;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((f * 720.0f) / i, f4 / i);
        valueAnimatorOfFloat2.setDuration((this.animDuration / this.animSteps) / 2);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.a$_G$
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13722a.indeterminateRotateOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f3, (f3 + f2) - INDETERMINANT_MIN_SWEEP);
        valueAnimatorOfFloat3.setDuration((this.animDuration / this.animSteps) / 2);
        valueAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat3.addUpdateListener(new Q__8_(this, f2, f3));
        int i2 = this.animSteps;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f4 / i2, ((f + 1.0f) * 720.0f) / i2);
        valueAnimatorOfFloat4.setDuration((this.animDuration / this.animSteps) / 2);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.Y_$H_
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13718a.indeterminateRotateOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet.play(valueAnimatorOfFloat3).with(valueAnimatorOfFloat4).after(valueAnimatorOfFloat2);
        return animatorSet;
    }

    private void initAttributes(AttributeSet attributeSet, int i, Context context) {
        getResources();
        this.currentProgress = 0.0f;
        this.maxProgress = 100.0f;
        this.thickness = convertDPtoInt(context, 3);
        this.isIndeterminate = true;
        this.autostartAnimation = true;
        this.initialStartAngle = -90.0f;
        this.startAngle = -90.0f;
        this.color = Color.parseColor("#4aa3df");
        this.animDuration = 4000;
        this.animSwoopDuration = 5000;
        this.animSyncDuration = 500;
        this.animSteps = 3;
    }

    private void updateBounds() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.bounds;
        int i = this.thickness;
        int i2 = this.size;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    private void updatePaint() {
        this.paint.setColor(this.color);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.thickness);
        this.paint.setStrokeCap(Paint.Cap.BUTT);
    }

    public int getColor() {
        return this.color;
    }

    public float getMaxProgress() {
        return this.maxProgress;
    }

    public float getProgress() {
        return this.currentProgress;
    }

    public int getThickness() {
        return this.thickness;
    }

    public void init(AttributeSet attributeSet, int i, Context context) {
        initAttributes(attributeSet, i, context);
        this.paint = new Paint(1);
        updatePaint();
        this.bounds = new RectF();
    }

    public boolean isIndeterminate() {
        return this.isIndeterminate;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.autostartAnimation) {
            startAnimation();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = ((isInEditMode() ? this.currentProgress : this.actualProgress) / this.maxProgress) * 360.0f;
        if (this.isIndeterminate) {
            canvas.drawArc(this.bounds, this.startAngle + this.indeterminateRotateOffset, this.indeterminateSweep, false, this.paint);
        } else {
            canvas.drawArc(this.bounds, this.startAngle, f, false, this.paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.size = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.size = i;
        updateBounds();
    }

    public void resetAnimation() {
        ValueAnimator valueAnimator = this.startAngleRotate;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.startAngleRotate.cancel();
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.progressAnimator.cancel();
        }
        AnimatorSet animatorSet = this.indeterminateAnimator;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.indeterminateAnimator.cancel();
        }
        int i = 0;
        if (this.isIndeterminate) {
            this.indeterminateSweep = INDETERMINANT_MIN_SWEEP;
            this.indeterminateAnimator = new AnimatorSet();
            AnimatorSet animatorSet2 = null;
            while (i < this.animSteps) {
                AnimatorSet animatorSetCreateIndeterminateAnimator = createIndeterminateAnimator(i);
                AnimatorSet.Builder builderPlay = this.indeterminateAnimator.play(animatorSetCreateIndeterminateAnimator);
                if (animatorSet2 != null) {
                    builderPlay.after(animatorSet2);
                }
                i++;
                animatorSet2 = animatorSetCreateIndeterminateAnimator;
            }
            this.indeterminateAnimator.addListener(new v__i_(this));
            this.indeterminateAnimator.start();
            return;
        }
        float f = this.initialStartAngle;
        this.startAngle = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f + 360.0f);
        this.startAngleRotate = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.animSwoopDuration);
        this.startAngleRotate.setInterpolator(new DecelerateInterpolator(2.0f));
        this.startAngleRotate.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.q$_Y$
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f13805a.startAngle = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                this.f13805a.invalidate();
            }
        });
        this.startAngleRotate.start();
        this.actualProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.currentProgress);
        this.progressAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(this.animSyncDuration);
        this.progressAnimator.setInterpolator(new LinearInterpolator());
        this.progressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.q_$J$
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f13806a.actualProgress = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                this.f13806a.invalidate();
            }
        });
        this.progressAnimator.start();
    }

    public void setColor(int i) {
        this.color = i;
        updatePaint();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = this.isIndeterminate == z;
        this.isIndeterminate = z;
        if (z2) {
            resetAnimation();
        }
    }

    public void setMaxProgress(float f) {
        this.maxProgress = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.currentProgress = f;
        if (!this.isIndeterminate) {
            ValueAnimator valueAnimator = this.progressAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.progressAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actualProgress, f);
            this.progressAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.animSyncDuration);
            this.progressAnimator.setInterpolator(new LinearInterpolator());
            this.progressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.B$$Z_
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f13594a.actualProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    this.f13594a.invalidate();
                }
            });
            this.progressAnimator.start();
        }
        invalidate();
    }

    public void setThickness(int i) {
        this.thickness = i;
        updatePaint();
        updateBounds();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                resetAnimation();
            } else if (i == 8 || i == 4) {
                stopAnimation();
            }
        }
    }

    public void startAnimation() {
        resetAnimation();
    }

    public void stopAnimation() {
        ValueAnimator valueAnimator = this.startAngleRotate;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.startAngleRotate = null;
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.progressAnimator = null;
        }
        AnimatorSet animatorSet = this.indeterminateAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.indeterminateAnimator = null;
        }
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.size = 0;
        init(attributeSet, 0, context);
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.size = 0;
        init(attributeSet, i, context);
    }
}
