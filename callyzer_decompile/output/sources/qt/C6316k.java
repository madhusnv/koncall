package qt;

import kotlin.jvm.internal.AbstractC4154l;
import og.kd;
import rt.C6620d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.k */
/* loaded from: classes3.dex */
public final class C6316k extends kd {

    /* renamed from: a */
    public final C6620d f30648a;

    public C6316k(C6620d messageTemplateTag) {
        AbstractC4154l.m8923f(messageTemplateTag, "messageTemplateTag");
        this.f30648a = messageTemplateTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6316k) && AbstractC4154l.m8918a(this.f30648a, ((C6316k) obj).f30648a);
    }

    public final int hashCode() {
        return this.f30648a.hashCode();
    }

    public final String toString() {
        return "UpdateTags(messageTemplateTag=" + this.f30648a + ")";
    }
}
