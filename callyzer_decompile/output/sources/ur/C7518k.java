package ur;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.k */
/* loaded from: classes3.dex */
public final class C7518k extends AbstractC7523p {

    /* renamed from: a */
    public final int f36233a;

    /* renamed from: b */
    public final h0 f36234b;

    public C7518k(int i10, h0 filterItemIdentificationMode) {
        AbstractC4154l.m8923f(filterItemIdentificationMode, "filterItemIdentificationMode");
        this.f36233a = i10;
        this.f36234b = filterItemIdentificationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7518k)) {
            return false;
        }
        C7518k c7518k = (C7518k) obj;
        return this.f36233a == c7518k.f36233a && this.f36234b == c7518k.f36234b;
    }

    public final int hashCode() {
        return this.f36234b.hashCode() + (Integer.hashCode(this.f36233a) * 31);
    }

    public final String toString() {
        return "UpdateFilterSelection(position=" + this.f36233a + ", filterItemIdentificationMode=" + this.f36234b + ")";
    }
}
