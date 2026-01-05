package p001o;

import android.animation.Animator;

/* loaded from: classes3.dex */
public class mh0 {

    /* renamed from: a */
    public Animator f35452a;

    /* renamed from: a */
    public void m39040a() {
        Animator animator = this.f35452a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m39041b() {
        this.f35452a = null;
    }

    /* renamed from: c */
    public void m39042c(Animator animator) {
        m39040a();
        this.f35452a = animator;
    }
}
