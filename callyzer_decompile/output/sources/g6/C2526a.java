package g6;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.a */
/* loaded from: classes.dex */
public final class C2526a {

    /* renamed from: a */
    public int f13833a;

    /* renamed from: b */
    public int f13834b;

    /* renamed from: c */
    public float f13835c;

    /* renamed from: d */
    public float f13836d;

    /* renamed from: e */
    public long f13837e;

    /* renamed from: f */
    public long f13838f;

    /* renamed from: g */
    public long f13839g;

    /* renamed from: h */
    public float f13840h;

    /* renamed from: i */
    public int f13841i;

    /* renamed from: a */
    public final float m6550a(long j6) {
        if (j6 < this.f13837e) {
            return DefinitionKt.NO_Float_VALUE;
        }
        long j10 = this.f13839g;
        if (j10 < 0 || j6 < j10) {
            return ViewOnTouchListenerC2530e.m6555b((j6 - r0) / this.f13833a, DefinitionKt.NO_Float_VALUE, 1.0f) * 0.5f;
        }
        float f6 = this.f13840h;
        return (ViewOnTouchListenerC2530e.m6555b((j6 - j10) / this.f13841i, DefinitionKt.NO_Float_VALUE, 1.0f) * f6) + (1.0f - f6);
    }
}
