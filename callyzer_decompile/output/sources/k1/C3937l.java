package k1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.l */
/* loaded from: classes.dex */
public final class C3937l implements d1 {

    /* renamed from: a */
    public final /* synthetic */ C3938m f20163a;

    public C3937l(C3938m c3938m) {
        this.f20163a = c3938m;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // k1.d1
    /* renamed from: a */
    public final float mo8445a(float f6) {
        if (Float.isNaN(f6)) {
            return DefinitionKt.NO_Float_VALUE;
        }
        C3938m c3938m = this.f20163a;
        float fFloatValue = ((Number) c3938m.f20175a.invoke(Float.valueOf(f6))).floatValue();
        c3938m.f20179e.setValue(Boolean.valueOf(fFloatValue > DefinitionKt.NO_Float_VALUE));
        c3938m.f20180f.setValue(Boolean.valueOf(fFloatValue < DefinitionKt.NO_Float_VALUE));
        return fFloatValue;
    }
}
