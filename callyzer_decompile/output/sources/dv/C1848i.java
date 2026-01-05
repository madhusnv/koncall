package dv;

import kotlin.jvm.internal.AbstractC4154l;
import og.id;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.i */
/* loaded from: classes3.dex */
public final class C1848i extends id {

    /* renamed from: b */
    public final String f8826b;

    /* renamed from: c */
    public final String f8827c;

    public C1848i(String title, String description) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        this.f8826b = title;
        this.f8827c = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1848i)) {
            return false;
        }
        C1848i c1848i = (C1848i) obj;
        return AbstractC4154l.m8918a(this.f8826b, c1848i.f8826b) && AbstractC4154l.m8918a(this.f8827c, c1848i.f8827c);
    }

    public final int hashCode() {
        return this.f8827c.hashCode() + (this.f8826b.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("SaveAsTemplate(title=", this.f8826b, ", description=", this.f8827c, ")");
    }
}
