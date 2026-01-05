package com.skydoves.balloon.compose;

import ex.InterfaceC2142f;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ComposableSingletons$BalloonComposeViewKt {
    public static final ComposableSingletons$BalloonComposeViewKt INSTANCE = new ComposableSingletons$BalloonComposeViewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC2142f f43684lambda1 = new C6734c(new InterfaceC2142f() { // from class: com.skydoves.balloon.compose.ComposableSingletons$BalloonComposeViewKt$lambda-1$1
        @Override // ex.InterfaceC2142f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BalloonComposeView) obj, (InterfaceC3962k) obj2, ((Number) obj3).intValue());
            return a0.f30746a;
        }

        public final void invoke(BalloonComposeView it, InterfaceC3962k interfaceC3962k, int i10) {
            AbstractC4154l.m8923f(it, "it");
            if ((i10 & 17) == 16) {
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8586C()) {
                    c3966o.m8601S();
                }
            }
        }
    }, false, -1734990613);

    /* renamed from: getLambda-1$balloon_compose_release, reason: not valid java name */
    public final InterfaceC2142f m16688getLambda1$balloon_compose_release() {
        return f43684lambda1;
    }
}
