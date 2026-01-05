package l7;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.h */
/* loaded from: classes.dex */
public final class C4408h {

    /* renamed from: a */
    public final k0 f22040a;

    /* renamed from: b */
    public final boolean f22041b;

    /* renamed from: c */
    public final boolean f22042c;

    /* renamed from: d */
    public final Object f22043d;

    public C4408h(k0 k0Var, boolean z6, Object obj, boolean z10) {
        if (!k0Var.f22075a && z6) {
            throw new IllegalArgumentException(k0Var.mo9204b().concat(" does not allow nullable values").toString());
        }
        if (!z6 && z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + k0Var.mo9204b() + " has null value but is not nullable.").toString());
        }
        this.f22040a = k0Var;
        this.f22041b = z6;
        this.f22043d = obj;
        this.f22042c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4408h.class == obj.getClass()) {
            C4408h c4408h = (C4408h) obj;
            Object obj2 = c4408h.f22043d;
            if (this.f22041b != c4408h.f22041b || this.f22042c != c4408h.f22042c || !AbstractC4154l.m8918a(this.f22040a, c4408h.f22040a)) {
                return false;
            }
            Object obj3 = this.f22043d;
            if (obj3 != null) {
                return AbstractC4154l.m8918a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f22040a.hashCode() * 31) + (this.f22041b ? 1 : 0)) * 31) + (this.f22042c ? 1 : 0)) * 31;
        Object obj = this.f22043d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.a0.m8901a(C4408h.class).m8914c());
        sb2.append(" Type: " + this.f22040a);
        sb2.append(" Nullable: " + this.f22041b);
        if (this.f22042c) {
            sb2.append(" DefaultValue: " + this.f22043d);
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
