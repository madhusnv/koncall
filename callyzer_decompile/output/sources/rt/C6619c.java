package rt;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.c */
/* loaded from: classes3.dex */
public final class C6619c {

    /* renamed from: a */
    public final int f31800a;

    /* renamed from: b */
    public final String f31801b;

    /* renamed from: c */
    public final String f31802c;

    /* renamed from: d */
    public final String f31803d;

    public C6619c(String title, int i10, String description, String messageTemplateId) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        this.f31800a = i10;
        this.f31801b = title;
        this.f31802c = description;
        this.f31803d = messageTemplateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6619c)) {
            return false;
        }
        C6619c c6619c = (C6619c) obj;
        return this.f31800a == c6619c.f31800a && AbstractC4154l.m8918a(this.f31801b, c6619c.f31801b) && AbstractC4154l.m8918a(this.f31802c, c6619c.f31802c) && AbstractC4154l.m8918a(this.f31803d, c6619c.f31803d);
    }

    public final int hashCode() {
        return this.f31803d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f31800a) * 31, 31, this.f31801b), 31, this.f31802c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(a1.m14337q(this.f31800a, "MessageTemplateData(id=", ", title=", this.f31801b, ", description="), this.f31802c, ", messageTemplateId=", this.f31803d, ")");
    }
}
