package ph;

import com.skydoves.balloon.internals.DefinitionKt;
import og.vb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.d */
/* loaded from: classes.dex */
public final class C5949d extends vb {
    @Override // og.vb
    /* renamed from: b */
    public final void mo11013b(C5964s c5964s, float f6, float f10) {
        c5964s.m12003d(f10 * f6, 180.0f, 90.0f);
        double d2 = f10;
        double d10 = f6;
        c5964s.m12002c((float) (Math.sin(Math.toRadians(90.0f)) * d2 * d10), (float) (Math.sin(Math.toRadians(DefinitionKt.NO_Float_VALUE)) * d2 * d10));
    }
}
