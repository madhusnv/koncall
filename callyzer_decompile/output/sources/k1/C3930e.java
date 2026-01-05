package k1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.e */
/* loaded from: classes.dex */
public final class C3930e implements InterfaceC3928c {
    @Override // k1.InterfaceC3928c
    /* renamed from: a */
    public final float mo8444a(float f6, float f10, float f11) {
        float fAbs = Math.abs((f10 + f6) - f6);
        boolean z6 = fAbs <= f11;
        float f12 = (0.3f * f11) - (DefinitionKt.NO_Float_VALUE * fAbs);
        float f13 = f11 - f12;
        if (z6 && f13 < fAbs) {
            f12 = f11 - fAbs;
        }
        return f6 - f12;
    }
}
