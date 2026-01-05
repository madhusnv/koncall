package o9;

import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o9.b */
/* loaded from: classes.dex */
public final class C5327b {

    /* renamed from: a */
    public final C5328c f26217a;

    public C5327b(C4327p c4327p) {
        this.f26217a = (C5328c) c4327p.f21788b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5327b.class == obj.getClass() && AbstractC4154l.m8918a(this.f26217a, ((C5327b) obj).f26217a);
    }

    public final int hashCode() {
        C5328c c5328c = this.f26217a;
        if (c5328c != null) {
            return c5328c.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetRoleCredentialsResponse(");
        sb2.append("roleCredentials=" + this.f26217a);
        sb2.append(")");
        return sb2.toString();
    }
}
