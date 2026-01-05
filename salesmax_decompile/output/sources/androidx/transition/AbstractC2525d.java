package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p001o.zzi;

/* renamed from: androidx.transition.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2525d {

    /* renamed from: a */
    public static final boolean f10432a;

    /* renamed from: androidx.transition.d$a */
    public static class a {
        /* renamed from: a */
        public static Bitmap m9957a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* renamed from: androidx.transition.d$b */
    public static class b implements TypeEvaluator {

        /* renamed from: a */
        public final float[] f10433a = new float[9];

        /* renamed from: b */
        public final float[] f10434b = new float[9];

        /* renamed from: c */
        public final Matrix f10435c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f10433a);
            matrix2.getValues(this.f10434b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f10434b;
                float f2 = fArr[i];
                float f3 = this.f10433a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f10435c.setValues(this.f10434b);
            return this.f10435c;
        }
    }

    static {
        f10432a = Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public static View m9954a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        zzi.m60175h(view, matrix);
        zzi.m60176i(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapM9955b = m9955b(view, matrix, rectF, viewGroup);
        if (bitmapM9955b != null) {
            imageView.setImageBitmap(bitmapM9955b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    /* renamed from: b */
    public static Bitmap m9955b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        boolean z = !view.isAttachedToWindow();
        int iIndexOfChild = 0;
        boolean z2 = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (!z) {
            viewGroup2 = null;
        } else {
            if (!z2) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f10432a) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = a.m9957a(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: c */
    public static Animator m9956c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
