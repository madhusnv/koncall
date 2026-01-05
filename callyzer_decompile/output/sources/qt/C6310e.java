package qt;

import kotlin.jvm.internal.AbstractC4154l;
import og.kd;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.e */
/* loaded from: classes3.dex */
public final class C6310e extends kd {

    /* renamed from: a */
    public final String f30639a;

    /* renamed from: b */
    public final String f30640b;

    public C6310e(String messageTemplateId, String title) {
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(title, "title");
        this.f30639a = messageTemplateId;
        this.f30640b = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6310e)) {
            return false;
        }
        C6310e c6310e = (C6310e) obj;
        return AbstractC4154l.m8918a(this.f30639a, c6310e.f30639a) && AbstractC4154l.m8918a(this.f30640b, c6310e.f30640b);
    }

    public final int hashCode() {
        return this.f30640b.hashCode() + (this.f30639a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("NavigateToMessageSubTemplate(messageTemplateId=", this.f30639a, ", title=", this.f30640b, ")");
    }
}
