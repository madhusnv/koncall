package g2;

import kotlin.jvm.internal.AbstractC4154l;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class qa {

    /* renamed from: a */
    public final ra f12514a;

    /* renamed from: b */
    public final C7251k f12515b;

    public qa(ra raVar, C7251k c7251k) {
        this.f12514a = raVar;
        this.f12515b = c7251k;
    }

    /* renamed from: a */
    public final void m6292a() {
        C7251k c7251k = this.f12515b;
        if (c7251k.m13544v()) {
            c7251k.resumeWith(bb.Dismissed);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa.class != obj.getClass()) {
            return false;
        }
        qa qaVar = (qa) obj;
        return AbstractC4154l.m8918a(this.f12514a, qaVar.f12514a) && this.f12515b.equals(qaVar.f12515b);
    }

    public final int hashCode() {
        return this.f12515b.hashCode() + (this.f12514a.hashCode() * 31);
    }
}
