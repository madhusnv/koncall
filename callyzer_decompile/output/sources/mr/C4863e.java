package mr;

import bs.AbstractC0755m;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mr.e */
/* loaded from: classes3.dex */
public final class C4863e extends AbstractC4865g {

    /* renamed from: a */
    public final AbstractC0755m f24372a;

    public C4863e(AbstractC0755m abstractC0755m) {
        this.f24372a = abstractC0755m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4863e) && AbstractC4154l.m8918a(this.f24372a, ((C4863e) obj).f24372a);
    }

    public final int hashCode() {
        return this.f24372a.hashCode();
    }

    public final String toString() {
        return "SubmitLeadForm(saveProcess=" + this.f24372a + ")";
    }
}
