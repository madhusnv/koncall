package k1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.c */
/* loaded from: classes.dex */
public interface InterfaceC3928c {

    /* renamed from: a */
    public static final C3927b f20031a = C3927b.f20019a;

    /* renamed from: a */
    default float mo8444a(float f6, float f10, float f11) {
        f20031a.getClass();
        float f12 = f10 + f6;
        if ((f6 >= DefinitionKt.NO_Float_VALUE && f12 <= f11) || (f6 < DefinitionKt.NO_Float_VALUE && f12 > f11)) {
            return DefinitionKt.NO_Float_VALUE;
        }
        float f13 = f12 - f11;
        return Math.abs(f6) < Math.abs(f13) ? f6 : f13;
    }
}
