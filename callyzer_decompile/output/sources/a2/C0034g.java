package a2;

import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.g */
/* loaded from: classes.dex */
public final class C0034g {

    /* renamed from: a */
    public final C2492h f149a;

    /* renamed from: b */
    public C2492h f150b;

    /* renamed from: c */
    public boolean f151c = false;

    /* renamed from: d */
    public C0032e f152d = null;

    public C0034g(C2492h c2492h, C2492h c2492h2) {
        this.f149a = c2492h;
        this.f150b = c2492h2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034g)) {
            return false;
        }
        C0034g c0034g = (C0034g) obj;
        return AbstractC4154l.m8918a(this.f149a, c0034g.f149a) && AbstractC4154l.m8918a(this.f150b, c0034g.f150b) && this.f151c == c0034g.f151c && AbstractC4154l.m8918a(this.f152d, c0034g.f152d);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e((this.f150b.hashCode() + (this.f149a.hashCode() * 31)) * 31, 31, this.f151c);
        C0032e c0032e = this.f152d;
        return iM4558e + (c0032e == null ? 0 : c0032e.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f149a) + ", substitution=" + ((Object) this.f150b) + ", isShowingSubstitution=" + this.f151c + ", layoutCache=" + this.f152d + ')';
    }
}
