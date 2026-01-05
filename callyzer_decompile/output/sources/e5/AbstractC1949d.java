package e5;

import com.skydoves.balloon.internals.DefinitionKt;
import d5.C1603g;
import d5.EnumC1605i;
import d5.EnumC1608l;
import java.util.HashMap;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.d */
/* loaded from: classes.dex */
public abstract class AbstractC1949d extends C1603g {

    /* renamed from: n0, reason: collision with root package name */
    public float f44188n0;

    /* renamed from: o0, reason: collision with root package name */
    public final HashMap f44189o0;

    /* renamed from: p0, reason: collision with root package name */
    public final HashMap f44190p0;

    /* renamed from: q0, reason: collision with root package name */
    public final HashMap f44191q0;

    /* renamed from: r0, reason: collision with root package name */
    public HashMap f44192r0;

    /* renamed from: s0, reason: collision with root package name */
    public HashMap f44193s0;

    /* renamed from: t0, reason: collision with root package name */
    public EnumC1605i f44194t0;

    public AbstractC1949d(C8553n c8553n, EnumC1608l enumC1608l) {
        super(c8553n, enumC1608l);
        this.f44188n0 = 0.5f;
        this.f44189o0 = new HashMap();
        this.f44190p0 = new HashMap();
        this.f44191q0 = new HashMap();
        this.f44194t0 = EnumC1605i.SPREAD;
    }

    /* renamed from: t */
    public final float m5701t(String str) {
        HashMap map = this.f44193s0;
        return (map == null || !map.containsKey(str)) ? DefinitionKt.NO_Float_VALUE : ((Float) this.f44193s0.get(str)).floatValue();
    }

    /* renamed from: u */
    public final float m5702u(String str) {
        HashMap map = this.f44191q0;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: v */
    public final float m5703v(String str) {
        HashMap map = this.f44192r0;
        return (map == null || !map.containsKey(str)) ? DefinitionKt.NO_Float_VALUE : ((Float) this.f44192r0.get(str)).floatValue();
    }

    /* renamed from: w */
    public final float m5704w(String str) {
        HashMap map = this.f44190p0;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : DefinitionKt.NO_Float_VALUE;
    }
}
