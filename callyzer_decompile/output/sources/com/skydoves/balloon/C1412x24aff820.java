package com.skydoves.balloon;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.BalloonKt$sam$com_skydoves_balloon_OnBalloonOverlayClickListener$0 */
/* loaded from: classes.dex */
public final class C1412x24aff820 implements OnBalloonOverlayClickListener, InterfaceC4149g {
    private final /* synthetic */ InterfaceC2137a function;

    public C1412x24aff820(InterfaceC2137a function) {
        AbstractC4154l.m8923f(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonOverlayClickListener) && (obj instanceof InterfaceC4149g)) {
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

    @Override // com.skydoves.balloon.OnBalloonOverlayClickListener
    public final /* synthetic */ void onBalloonOverlayClick() {
        this.function.invoke();
    }
}
