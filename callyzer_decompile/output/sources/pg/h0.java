package pg;

import android.os.Build;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;
import gx.AbstractC2747a;
import i1.AbstractC3131j;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a */
    public static final /* synthetic */ int f28913a = 0;

    /* renamed from: a */
    public static float m11671a(EdgeEffect edgeEffect, float f6, float f10, InterfaceC6747c interfaceC6747c) {
        float f11 = i1.c0.f16812a;
        double dMo155a = interfaceC6747c.mo155a() * 386.0878f * 160.0f * 0.84f;
        double d2 = i1.c0.f16812a * dMo155a;
        float fExp = (float) (Math.exp((i1.c0.f16813b / i1.c0.f16814c) * Math.log((Math.abs(f6) * 0.35f) / d2)) * d2);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? AbstractC3131j.m7513c(edgeEffect) : 0.0f) * f10) {
            return DefinitionKt.NO_Float_VALUE;
        }
        int iM6747k = AbstractC2747a.m6747k(f6);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iM6747k);
            return f6;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM6747k);
        }
        return f6;
    }
}
