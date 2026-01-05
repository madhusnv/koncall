package ph;

import com.skydoves.balloon.internals.DefinitionKt;
import og.vb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.i */
/* loaded from: classes.dex */
public final class C5954i extends vb {
    @Override // og.vb
    /* renamed from: b */
    public final void mo11013b(C5964s c5964s, float f6, float f10) {
        c5964s.m12003d(f10 * f6, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f6;
        C5960o c5960o = new C5960o(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f11, f11);
        c5960o.f29199f = 180.0f;
        c5960o.f29200g = 90.0f;
        c5964s.f29210f.add(c5960o);
        C5958m c5958m = new C5958m(c5960o);
        c5964s.m12000a(180.0f);
        c5964s.f29211g.add(c5958m);
        c5964s.f29208d = 270.0f;
        float f12 = (DefinitionKt.NO_Float_VALUE + f11) * 0.5f;
        float f13 = (f11 - DefinitionKt.NO_Float_VALUE) / 2.0f;
        double d2 = 270.0f;
        c5964s.f29206b = (((float) Math.cos(Math.toRadians(d2))) * f13) + f12;
        c5964s.f29207c = (f13 * ((float) Math.sin(Math.toRadians(d2)))) + f12;
    }
}
