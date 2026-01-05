package d4;

import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4262d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.g */
/* loaded from: classes.dex */
public final class C1579g {

    /* renamed from: c */
    public static final C1579g f7834c = new C1579g(DefinitionKt.NO_Float_VALUE, new C4262d(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE));

    /* renamed from: a */
    public final float f7835a;

    /* renamed from: b */
    public final C4262d f7836b;

    public C1579g(float f6, C4262d c4262d) {
        this.f7835a = f6;
        this.f7836b = c4262d;
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579g)) {
            return false;
        }
        C1579g c1579g = (C1579g) obj;
        return this.f7835a == c1579g.f7835a && AbstractC4154l.m8918a(this.f7836b, c1579g.f7836b);
    }

    public final int hashCode() {
        return (this.f7836b.hashCode() + (Float.hashCode(this.f7835a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f7835a + ", range=" + this.f7836b + ", steps=0)";
    }
}
