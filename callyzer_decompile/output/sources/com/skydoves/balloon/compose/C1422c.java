package com.skydoves.balloon.compose;

import android.content.Context;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import s4.C6756l;
import t3.v0;
import w3.j1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.compose.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1422c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f7226a;

    /* renamed from: b */
    public final /* synthetic */ Object f7227b;

    public /* synthetic */ C1422c(int i10, Object obj) {
        this.f7226a = i10;
        this.f7227b = obj;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f7226a) {
            case 0:
                return BalloonKt.Balloon$lambda$24$lambda$23((j1) this.f7227b, (C6756l) obj);
            case 1:
                return BalloonKt.Balloon$lambda$27$lambda$26$lambda$25((j1) this.f7227b, (Context) obj);
            default:
                return BalloonKt$BalloonLayout$1$1.measure_3p2s80s$lambda$4((ArrayList) this.f7227b, (v0) obj);
        }
    }
}
