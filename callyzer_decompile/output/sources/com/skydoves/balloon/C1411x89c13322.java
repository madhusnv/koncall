package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.BalloonKt$sam$com_skydoves_balloon_OnBalloonOutsideTouchListener$0 */
/* loaded from: classes.dex */
public final class C1411x89c13322 implements OnBalloonOutsideTouchListener, InterfaceC4149g {
    private final /* synthetic */ InterfaceC2141e function;

    public C1411x89c13322(InterfaceC2141e function) {
        AbstractC4154l.m8923f(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonOutsideTouchListener) && (obj instanceof InterfaceC4149g)) {
            return AbstractC4154l.m8918a(getFunctionDelegate(), ((InterfaceC4149g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.skydoves.balloon.OnBalloonOutsideTouchListener
    public final /* synthetic */ void onBalloonOutsideTouch(View view, MotionEvent motionEvent) {
        this.function.invoke(view, motionEvent);
    }
}
