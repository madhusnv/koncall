package zp;

import kotlin.jvm.internal.AbstractC4154l;
import om.C5419u;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.q */
/* loaded from: classes3.dex */
public final class C9017q {

    /* renamed from: a */
    public final C5419u f43430a;

    /* renamed from: b */
    public final String f43431b;

    /* renamed from: c */
    public final String f43432c;

    /* renamed from: d */
    public final String f43433d;

    /* renamed from: e */
    public final String f43434e;

    public C9017q(C5419u dataModel) {
        String strM16160g;
        AbstractC4154l.m8923f(dataModel, "dataModel");
        this.f43430a = dataModel;
        this.f43431b = dataModel.f27232a;
        this.f43432c = "+" + dataModel.f27234c + dataModel.f27233b + " ";
        Long l9 = dataModel.f27236e;
        this.f43433d = (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g;
        this.f43434e = dataModel.f27235d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9017q) && AbstractC4154l.m8918a(this.f43430a, ((C9017q) obj).f43430a);
    }

    public final int hashCode() {
        return this.f43430a.hashCode();
    }

    public final String toString() {
        return "UniqueCallsSummaryDataUiModel(dataModel=" + this.f43430a + ")";
    }
}
