package com.skydoves.balloon.extensions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ViewExtensionKt {
    public static final /* synthetic */ void circularRevealed(final View view, final long j6) {
        AbstractC4154l.m8923f(view, "<this>");
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.skydoves.balloon.extensions.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtensionKt.circularRevealed$lambda$1(view, j6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void circularRevealed$lambda$1(View view, long j6) {
        if (view.isAttachedToWindow()) {
            view.setVisibility(0);
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, DefinitionKt.NO_Float_VALUE, Math.max(view.getWidth(), view.getHeight()));
            animatorCreateCircularReveal.setDuration(j6);
            animatorCreateCircularReveal.start();
        }
    }

    public static final /* synthetic */ void circularUnRevealed(final View view, final long j6, final InterfaceC2137a doAfterFinish) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(doAfterFinish, "doAfterFinish");
        view.post(new Runnable() { // from class: com.skydoves.balloon.extensions.ViewExtensionKt.circularUnRevealed.1
            @Override // java.lang.Runnable
            public final void run() {
                if (view.isAttachedToWindow()) {
                    View view2 = view;
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, (view.getRight() + view2.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), DefinitionKt.NO_Float_VALUE);
                    animatorCreateCircularReveal.setDuration(j6);
                    animatorCreateCircularReveal.start();
                    final InterfaceC2137a interfaceC2137a = doAfterFinish;
                    animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.skydoves.balloon.extensions.ViewExtensionKt.circularUnRevealed.1.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            AbstractC4154l.m8923f(animation, "animation");
                            super.onAnimationEnd(animation);
                            interfaceC2137a.invoke();
                        }
                    });
                }
            }
        });
    }

    public static final /* synthetic */ int getStatusBarHeight(View view, boolean z6) {
        AbstractC4154l.m8923f(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if (!(context instanceof Activity) || !z6) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static final /* synthetic */ Point getViewPointOnScreen(View view) {
        AbstractC4154l.m8923f(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final /* synthetic */ void visible(View view, boolean z6) {
        AbstractC4154l.m8923f(view, "<this>");
        view.setVisibility(z6 ? 0 : 8);
    }
}
