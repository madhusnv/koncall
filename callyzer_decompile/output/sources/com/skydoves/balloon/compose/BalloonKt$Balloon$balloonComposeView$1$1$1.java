package com.skydoves.balloon.compose;

import d4.AbstractC1586n;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import s2.AbstractC6740i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonKt$Balloon$balloonComposeView$1$1$1 implements InterfaceC2142f {
    final /* synthetic */ h2 $currentContent$delegate;

    public BalloonKt$Balloon$balloonComposeView$1$1$1(h2 h2Var) {
        this.$currentContent$delegate = h2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 invoke$lambda$1$lambda$0(InterfaceC1596x semantics) {
        AbstractC4154l.m8923f(semantics, "$this$semantics");
        BalloonSemanticsKt.balloon(semantics);
        return a0.f30746a;
    }

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
                return;
            }
        }
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.m8607Y(-829360011);
        Object objM8596M = c3966o2.m8596M();
        if (objM8596M == C3961j.f20408a) {
            objM8596M = new C1425f(0);
            c3966o2.j0(objM8596M);
        }
        c3966o2.m8623p(false);
        InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(C7876o.f37669a, false, (InterfaceC2139c) objM8596M);
        final h2 h2Var = this.$currentContent$delegate;
        BalloonKt.BalloonLayout(interfaceC7879rM5204b, AbstractC6740i.m12902d(1986328809, new InterfaceC2141e() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1.2
            @Override // ex.InterfaceC2141e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC3962k) obj, ((Number) obj2).intValue());
                return a0.f30746a;
            }

            public final void invoke(InterfaceC3962k interfaceC3962k2, int i11) {
                if ((i11 & 3) == 2) {
                    C3966o c3966o3 = (C3966o) interfaceC3962k2;
                    if (c3966o3.m8586C()) {
                        c3966o3.m8601S();
                        return;
                    }
                }
                InterfaceC2141e interfaceC2141eBalloon$lambda$8 = BalloonKt.Balloon$lambda$8(h2Var);
                if (interfaceC2141eBalloon$lambda$8 == null) {
                    return;
                }
                interfaceC2141eBalloon$lambda$8.invoke(interfaceC3962k2, 0);
            }
        }, c3966o2), c3966o2, 48, 0);
    }
}
