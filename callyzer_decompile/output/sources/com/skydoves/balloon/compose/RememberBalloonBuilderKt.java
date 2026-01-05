package com.skydoves.balloon.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.skydoves.balloon.Balloon;
import ex.InterfaceC2139c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RememberBalloonBuilderKt {
    @BalloonDsl
    public static final Balloon.Builder rememberBalloonBuilder(Object obj, Context context, InterfaceC2139c block, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        AbstractC4154l.m8923f(block, "block");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(1887512655);
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
        }
        c3966o.m8607Y(-1325085354);
        boolean zM8614g = c3966o.m8614g(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new Balloon.Builder(context);
            block.invoke(objM8596M);
            c3966o.j0(objM8596M);
        }
        Balloon.Builder builder = (Balloon.Builder) objM8596M;
        c3966o.m8623p(false);
        c3966o.m8623p(false);
        return builder;
    }

    @BalloonDsl
    public static final w0 rememberBalloonWindow(BalloonWindow balloonWindow, Object obj, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-1806639781);
        if ((i11 & 2) != 0) {
            obj = null;
        }
        c3966o.m8607Y(-1528537149);
        boolean zM8614g = c3966o.m8614g(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = C3953b.m8517t(balloonWindow);
            c3966o.j0(objM8596M);
        }
        w0 w0Var = (w0) objM8596M;
        c3966o.m8623p(false);
        c3966o.m8623p(false);
        return w0Var;
    }
}
