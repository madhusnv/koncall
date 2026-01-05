package rm;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rm.b */
/* loaded from: classes3.dex */
public final class C6570b extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f31457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6570b(C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.f31457b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6570b) && AbstractC4154l.m8918a(this.f31457b, ((C6570b) obj).f31457b);
    }

    public final int hashCode() {
        return this.f31457b.hashCode();
    }

    public final String toString() {
        return "ExcludeNumberRequest(userSimDetail=" + this.f31457b + ")";
    }
}
