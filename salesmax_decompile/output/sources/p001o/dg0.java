package p001o;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class dg0 {

    /* renamed from: a */
    public Animatable2.AnimationCallback f19765a;

    /* renamed from: o.dg0$a */
    public class C12898a extends Animatable2.AnimationCallback {
        public C12898a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            dg0.this.mo14364b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            dg0.this.mo14365c(drawable);
        }
    }

    /* renamed from: a */
    public Animatable2.AnimationCallback m22996a() {
        if (this.f19765a == null) {
            this.f19765a = new C12898a();
        }
        return this.f19765a;
    }

    /* renamed from: b */
    public void mo14364b(Drawable drawable) {
    }

    /* renamed from: c */
    public void mo14365c(Drawable drawable) {
    }
}
