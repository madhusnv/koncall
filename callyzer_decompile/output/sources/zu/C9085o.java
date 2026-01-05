package zu;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.o */
/* loaded from: classes3.dex */
public final class C9085o extends AbstractC9092v {

    /* renamed from: a */
    public final String f43617a;

    /* renamed from: b */
    public final String f43618b;

    public C9085o(String title, String description) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        this.f43617a = title;
        this.f43618b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9085o)) {
            return false;
        }
        C9085o c9085o = (C9085o) obj;
        return AbstractC4154l.m8918a(this.f43617a, c9085o.f43617a) && AbstractC4154l.m8918a(this.f43618b, c9085o.f43618b);
    }

    public final int hashCode() {
        return this.f43618b.hashCode() + (this.f43617a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("SaveAsTemplate(title=", this.f43617a, ", description=", this.f43618b, ")");
    }
}
