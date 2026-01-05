package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import y7.C8575j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.i */
/* loaded from: classes.dex */
public final class C5848i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f28585a = 0;

    /* renamed from: b */
    public boolean f28586b = false;

    /* renamed from: c */
    public final Object f28587c;

    public C5848i(View view) {
        this.f28587c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f28585a) {
            case 1:
                this.f28586b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28585a) {
            case 0:
                View view = (View) this.f28587c;
                AbstractC5865z.f28643a.mo11416d(view, 1.0f);
                if (this.f28586b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
            default:
                C8575j c8575j = (C8575j) this.f28587c;
                if (!this.f28586b) {
                    if (((Float) c8575j.f41686z.getAnimatedValue()).floatValue() != DefinitionKt.NO_Float_VALUE) {
                        c8575j.f41659A = 2;
                        c8575j.f41679s.invalidate();
                        break;
                    } else {
                        c8575j.f41659A = 0;
                        c8575j.m15869f(0);
                        break;
                    }
                } else {
                    this.f28586b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f28585a) {
            case 0:
                View view = (View) this.f28587c;
                Field field = v0.f5527a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f28586b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C5848i(C8575j c8575j) {
        this.f28587c = c8575j;
    }
}
