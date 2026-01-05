package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;
import p001o.a92;
import p001o.elh;
import p001o.sc8;
import p001o.wja;

/* loaded from: classes2.dex */
public final class ScreenFlashView extends View {

    /* renamed from: a */
    public Window f6151a;

    /* renamed from: b */
    public sc8.InterfaceC16805i f6152b;

    /* renamed from: androidx.camera.view.ScreenFlashView$a */
    public class C1904a implements sc8.InterfaceC16805i {

        /* renamed from: a */
        public float f6153a;

        /* renamed from: b */
        public ValueAnimator f6154b;

        public C1904a() {
        }

        @Override // p001o.sc8.InterfaceC16805i
        /* renamed from: a */
        public void mo4747a(long j, final sc8.InterfaceC16806j interfaceC16806j) {
            wja.m54627a("ScreenFlashView", "ScreenFlash#apply");
            this.f6153a = ScreenFlashView.this.getBrightness();
            ScreenFlashView.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f6154b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ScreenFlashView screenFlashView = ScreenFlashView.this;
            Objects.requireNonNull(interfaceC16806j);
            this.f6154b = screenFlashView.m4745e(new Runnable() { // from class: o.j6f
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC16806j.onCompleted();
                }
            });
        }

        @Override // p001o.sc8.InterfaceC16805i
        public void clear() {
            wja.m54627a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f6154b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f6154b = null;
            }
            ScreenFlashView.this.setAlpha(0.0f);
            ScreenFlashView.this.setBrightness(this.f6153a);
        }
    }

    /* renamed from: androidx.camera.view.ScreenFlashView$b */
    public class C1905b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f6156a;

        public C1905b(Runnable runnable) {
            this.f6156a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wja.m54627a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f6156a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m4744f(ValueAnimator valueAnimator) {
        wja.m54627a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f6151a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        wja.m54629c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f6151a == null) {
            wja.m54629c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            wja.m54629c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f6151a.getAttributes();
        attributes.screenBrightness = f;
        this.f6151a.setAttributes(attributes);
        wja.m54627a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(sc8.InterfaceC16805i interfaceC16805i) {
        wja.m54627a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* renamed from: e */
    public final ValueAnimator m4745e(Runnable runnable) {
        wja.m54627a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.i6f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28164a.m4744f(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C1905b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    /* renamed from: g */
    public final void m4746g(Window window) {
        if (this.f6151a != window) {
            this.f6152b = window == null ? null : new C1904a();
        }
    }

    public sc8.InterfaceC16805i getScreenFlash() {
        return this.f6152b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(a92 a92Var) {
        elh.m25220a();
    }

    public void setScreenFlashWindow(Window window) {
        elh.m25220a();
        m4746g(window);
        this.f6151a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
