package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.AbstractC2525d;
import androidx.transition.Transition;
import java.util.Map;
import p001o.g8e;
import p001o.pe8;
import p001o.svh;
import p001o.vza;

/* loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] E0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator F0 = new C2486a();
    public static final Property G0 = new C2487b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    public class C2486a implements TypeEvaluator {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    public class C2487b extends Property {
        public C2487b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            pe8.m43512a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C2488c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10312a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f10312a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10312a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$d */
    public static class C2489d extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final ImageView f10313a;

        /* renamed from: b */
        public final Matrix f10314b;

        /* renamed from: c */
        public final Matrix f10315c;

        /* renamed from: d */
        public boolean f10316d = true;

        public C2489d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f10313a = imageView;
            this.f10314b = matrix;
            this.f10315c = matrix2;
        }

        /* renamed from: a */
        public final void m9831a() {
            Matrix matrix = (Matrix) this.f10313a.getTag(g8e.transition_image_transform);
            if (matrix != null) {
                pe8.m43512a(this.f10313a, matrix);
                this.f10313a.setTag(g8e.transition_image_transform, null);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            m9831a();
        }

        /* renamed from: c */
        public final void m9832c(Matrix matrix) {
            this.f10313a.setTag(g8e.transition_image_transform, matrix);
            pe8.m43512a(this.f10313a, this.f10315c);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            if (this.f10316d) {
                m9832c(this.f10314b);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            this.f10316d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m9832c((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            m9831a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            this.f10316d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10316d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10316d = false;
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Matrix J0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = Math.max(width / f, height / f2);
        int iRound = Math.round((width - (f * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    public static Matrix L0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = C2488c.f10312a[imageView.getScaleType().ordinal()];
        return i != 1 ? i != 2 ? new Matrix(imageView.getImageMatrix()) : J0(imageView) : O0(imageView);
    }

    public static Matrix O0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public final void I0(svh svhVar, boolean z) {
        View view = svhVar.f46009b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map map = svhVar.f46008a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixL0 = z ? (Matrix) imageView.getTag(g8e.transition_image_transform) : null;
            if (matrixL0 == null) {
                matrixL0 = L0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixL0);
        }
    }

    public final ObjectAnimator M0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) G0, new AbstractC2525d.b(), matrix, matrix2);
    }

    public final ObjectAnimator N0(ImageView imageView) {
        Property property = G0;
        TypeEvaluator typeEvaluator = F0;
        Matrix matrix = vza.f51069a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix, matrix);
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return E0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar, false);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        I0(svhVar, true);
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        if (svhVar != null && svhVar2 != null) {
            Rect rect = (Rect) svhVar.f46008a.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) svhVar2.f46008a.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) svhVar.f46008a.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) svhVar2.f46008a.get("android:changeImageTransform:matrix");
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) svhVar2.f46009b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    return N0(imageView);
                }
                if (matrix == null) {
                    matrix = vza.f51069a;
                }
                if (matrix2 == null) {
                    matrix2 = vza.f51069a;
                }
                G0.set(imageView, matrix);
                ObjectAnimator objectAnimatorM0 = M0(imageView, matrix, matrix2);
                C2489d c2489d = new C2489d(imageView, matrix, matrix2);
                objectAnimatorM0.addListener(c2489d);
                objectAnimatorM0.addPauseListener(c2489d);
                mo9876c(c2489d);
                return objectAnimatorM0;
            }
        }
        return null;
    }
}
