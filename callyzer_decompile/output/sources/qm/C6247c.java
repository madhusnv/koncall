package qm;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.c */
/* loaded from: classes3.dex */
public final class C6247c {

    /* renamed from: a */
    public final int f30280a;

    /* renamed from: b */
    public final String f30281b;

    /* renamed from: c */
    public final String f30282c;

    /* renamed from: d */
    public final String f30283d;

    public C6247c(String name, int i10, String documentUrl, String messageTemplateId) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(documentUrl, "documentUrl");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        this.f30280a = i10;
        this.f30281b = name;
        this.f30282c = documentUrl;
        this.f30283d = messageTemplateId;
    }

    /* renamed from: a */
    public static C6247c m12252a(C6247c c6247c, String messageTemplateId) {
        int i10 = c6247c.f30280a;
        String name = c6247c.f30281b;
        String documentUrl = c6247c.f30282c;
        c6247c.getClass();
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(documentUrl, "documentUrl");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        return new C6247c(name, i10, documentUrl, messageTemplateId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6247c)) {
            return false;
        }
        C6247c c6247c = (C6247c) obj;
        return this.f30280a == c6247c.f30280a && AbstractC4154l.m8918a(this.f30281b, c6247c.f30281b) && AbstractC4154l.m8918a(this.f30282c, c6247c.f30282c) && AbstractC4154l.m8918a(this.f30283d, c6247c.f30283d);
    }

    public final int hashCode() {
        return this.f30283d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f30280a) * 31, 31, this.f30281b), 31, this.f30282c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(a1.m14337q(this.f30280a, "MessageTemplateDocuments(id=", ", name=", this.f30281b, ", documentUrl="), this.f30282c, ", messageTemplateId=", this.f30283d, ")");
    }
}
