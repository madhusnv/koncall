package com.skydoves.balloon;

import android.view.View;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0 implements OnBalloonClickListener, InterfaceC4149g {
    private final /* synthetic */ InterfaceC2139c function;

    public BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0(InterfaceC2139c function) {
        AbstractC4154l.m8923f(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonClickListener) && (obj instanceof InterfaceC4149g)) {
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

    @Override // com.skydoves.balloon.OnBalloonClickListener
    public final /* synthetic */ void onBalloonClick(View view) {
        this.function.invoke(view);
    }
}
