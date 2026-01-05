package com.skydoves.balloon.compose;

import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonSemanticsKt {
    private static final C1595w IsBalloon = new C1595w("IsBalloon", new C1426g());

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 IsBalloon$lambda$0(a0 a0Var, a0 a0Var2) {
        AbstractC4154l.m8923f(a0Var2, "<unused var>");
        throw new IllegalStateException("merge function called on unmergeable property IsBalloon. A dialog should not be a child of a clickable/focusable node.");
    }

    public static final void balloon(InterfaceC1596x interfaceC1596x) {
        AbstractC4154l.m8923f(interfaceC1596x, "<this>");
        ((C1583k) interfaceC1596x).m5202q(IsBalloon, a0.f30746a);
    }

    public static final C1595w getIsBalloon() {
        return IsBalloon;
    }
}
