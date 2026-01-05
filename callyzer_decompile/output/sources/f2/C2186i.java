package f2;

import a1.RunnableC0024w;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import c3.C0847b;
import c3.C0850e;
import d3.C1565s;
import d3.h0;
import ex.InterfaceC2137a;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4154l;
import m1.C4633o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.i */
/* loaded from: classes.dex */
public final class C2186i extends View {

    /* renamed from: f */
    public static final int[] f10091f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g */
    public static final int[] f10092g = new int[0];

    /* renamed from: a */
    public C2194q f10093a;

    /* renamed from: b */
    public Boolean f10094b;

    /* renamed from: c */
    public Long f10095c;

    /* renamed from: d */
    public RunnableC0024w f10096d;

    /* renamed from: e */
    public InterfaceC2137a f10097e;

    private final void setRippleState(boolean z6) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f10096d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l9 = this.f10095c;
        long jLongValue = jCurrentAnimationTimeMillis - (l9 != null ? l9.longValue() : 0L);
        if (z6 || jLongValue >= 5) {
            int[] iArr = z6 ? f10091f : f10092g;
            C2194q c2194q = this.f10093a;
            if (c2194q != null) {
                c2194q.setState(iArr);
            }
        } else {
            RunnableC0024w runnableC0024w = new RunnableC0024w(15, this);
            this.f10096d = runnableC0024w;
            postDelayed(runnableC0024w, 50L);
        }
        this.f10095c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(C2186i c2186i) {
        C2194q c2194q = c2186i.f10093a;
        if (c2194q != null) {
            c2194q.setState(f10092g);
        }
        c2186i.f10096d = null;
    }

    /* renamed from: b */
    public final void m5885b(C4633o c4633o, boolean z6, long j6, int i10, long j10, float f6, InterfaceC2137a interfaceC2137a) {
        if (this.f10093a == null || !Boolean.valueOf(z6).equals(this.f10094b)) {
            C2194q c2194q = new C2194q(z6);
            setBackground(c2194q);
            this.f10093a = c2194q;
            this.f10094b = Boolean.valueOf(z6);
        }
        C2194q c2194q2 = this.f10093a;
        AbstractC4154l.m8920c(c2194q2);
        this.f10097e = interfaceC2137a;
        m5888e(j6, i10, j10, f6);
        if (z6) {
            c2194q2.setHotspot(C0847b.m2273d(c4633o.f22875a), C0847b.m2274e(c4633o.f22875a));
        } else {
            c2194q2.setHotspot(c2194q2.getBounds().centerX(), c2194q2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: c */
    public final void m5886c() {
        this.f10097e = null;
        RunnableC0024w runnableC0024w = this.f10096d;
        if (runnableC0024w != null) {
            removeCallbacks(runnableC0024w);
            RunnableC0024w runnableC0024w2 = this.f10096d;
            AbstractC4154l.m8920c(runnableC0024w2);
            runnableC0024w2.run();
        } else {
            C2194q c2194q = this.f10093a;
            if (c2194q != null) {
                c2194q.setState(f10092g);
            }
        }
        C2194q c2194q2 = this.f10093a;
        if (c2194q2 == null) {
            return;
        }
        c2194q2.setVisible(false, false);
        unscheduleDrawable(c2194q2);
    }

    /* renamed from: d */
    public final void m5887d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m5886c();
        }
    }

    /* renamed from: e */
    public final void m5888e(long j6, int i10, long j10, float f6) {
        C2194q c2194q = this.f10093a;
        if (c2194q == null) {
            return;
        }
        Integer num = c2194q.f10117c;
        if (num == null || num.intValue() != i10) {
            c2194q.f10117c = Integer.valueOf(i10);
            c2194q.setRadius(i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f6 *= 2;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        long jM5186b = C1565s.m5186b(f6, 14, j10);
        C1565s c1565s = c2194q.f10116b;
        if (!(c1565s == null ? false : C1565s.m5187c(c1565s.f7819a, jM5186b))) {
            c2194q.f10116b = new C1565s(jM5186b);
            c2194q.setColor(ColorStateList.valueOf(h0.m5149u(jM5186b)));
        }
        Rect rect = new Rect(0, 0, AbstractC2747a.m6747k(C0850e.m2293d(j6)), AbstractC2747a.m6747k(C0850e.m2291b(j6)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c2194q.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        InterfaceC2137a interfaceC2137a = this.f10097e;
        if (interfaceC2137a != null) {
            interfaceC2137a.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
