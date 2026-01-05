package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import p001o.id5;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes2.dex */
public final class RippleHostView extends View {

    /* renamed from: d */
    public static final C1914a f6224d = new C1914a(null);

    /* renamed from: e */
    public static final int[] f6225e = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: f */
    public static final int[] f6226f = new int[0];

    /* renamed from: a */
    public Long f6227a;

    /* renamed from: b */
    public Runnable f6228b;

    /* renamed from: c */
    public uk7 f6229c;

    /* renamed from: androidx.compose.material.ripple.RippleHostView$a */
    public static final class C1914a {
        public C1914a() {
        }

        public /* synthetic */ C1914a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
    }

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f6228b;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f6227a;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (!z && jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: o.fue
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f24087a);
                }
            };
            this.f6228b = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f6227a = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        sq8.m48649h(rippleHostView, "this$0");
        rippleHostView.getClass();
        rippleHostView.f6228b = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        sq8.m48649h(drawable, "who");
        uk7 uk7Var = this.f6229c;
        if (uk7Var != null) {
            uk7Var.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
