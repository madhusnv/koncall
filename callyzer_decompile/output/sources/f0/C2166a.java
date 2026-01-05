package f0;

import c0.a0;
import c0.b2;
import c0.d1;
import d0.AbstractC1545b;
import i0.e0;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C2166a extends AbstractC1545b {

    /* renamed from: c */
    public static final /* synthetic */ int f10029c = 0;

    /* renamed from: a */
    public final a0 f10030a = a0.f5036e;

    /* renamed from: b */
    public final EnumC2167b f10031b = EnumC2167b.DYNAMIC_RANGE;

    @Override // d0.AbstractC1545b
    /* renamed from: a */
    public final EnumC2167b mo5083a() {
        return this.f10031b;
    }

    @Override // d0.AbstractC1545b
    /* renamed from: b */
    public final boolean mo5084b(d1 d1Var, e0 e0Var) {
        Set setMo7321c = e0Var.mo7321c();
        AbstractC4154l.m8922e(setMo7321c, "getSupportedDynamicRanges(...)");
        setMo7321c.toString();
        toString();
        u1.m10942a("DynamicRangeFeature");
        a0 a0Var = this.f10030a;
        if (!setMo7321c.contains(a0Var)) {
            return false;
        }
        for (b2 b2Var : (List) d1Var.f5069d) {
            Set setMo2159j = b2Var.mo2159j(e0Var);
            Objects.toString(setMo2159j);
            toString();
            b2Var.toString();
            u1.m10942a("DynamicRangeFeature");
            if (setMo2159j != null && !setMo2159j.contains(a0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f10030a + ')';
    }
}
