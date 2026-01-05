package ur;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.b */
/* loaded from: classes3.dex */
public final class C7509b extends AbstractC7523p {

    /* renamed from: a */
    public final InterfaceC2139c f36205a;

    public C7509b(InterfaceC2139c interfaceC2139c) {
        this.f36205a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7509b) && AbstractC4154l.m8918a(this.f36205a, ((C7509b) obj).f36205a);
    }

    public final int hashCode() {
        return this.f36205a.hashCode();
    }

    public final String toString() {
        return "ApplyAllFilters(onValidationResult=" + this.f36205a + ")";
    }
}
