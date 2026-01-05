package uq;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4798i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.f */
/* loaded from: classes3.dex */
public final class C7500f extends AbstractC7507m {

    /* renamed from: a */
    public final C4798i f36192a;

    /* renamed from: b */
    public final boolean f36193b;

    public C7500f(C4798i contact, boolean z6) {
        AbstractC4154l.m8923f(contact, "contact");
        this.f36192a = contact;
        this.f36193b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7500f)) {
            return false;
        }
        C7500f c7500f = (C7500f) obj;
        return AbstractC4154l.m8918a(this.f36192a, c7500f.f36192a) && this.f36193b == c7500f.f36193b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36193b) + (this.f36192a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCheckedStateChanged(contact=" + this.f36192a + ", isChecked=" + this.f36193b + ")";
    }
}
