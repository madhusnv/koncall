package ur;

import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.f */
/* loaded from: classes3.dex */
public final class C7513f extends AbstractC7523p {

    /* renamed from: a */
    public final String f36213a;

    /* renamed from: b */
    public final C5454q f36214b;

    public C7513f(String modelId, C5454q option) {
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(option, "option");
        this.f36213a = modelId;
        this.f36214b = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7513f)) {
            return false;
        }
        C7513f c7513f = (C7513f) obj;
        return AbstractC4154l.m8918a(this.f36213a, c7513f.f36213a) && AbstractC4154l.m8918a(this.f36214b, c7513f.f36214b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f36214b.hashCode() + (this.f36213a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RemoveDynamicCheckValue(modelId=" + this.f36213a + ", option=" + this.f36214b + ", quickApply=false)";
    }
}
