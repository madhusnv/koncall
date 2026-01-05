package aa;

import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.f */
/* loaded from: classes.dex */
public final class C0079f {

    /* renamed from: a */
    public final String f293a;

    /* renamed from: b */
    public final String f294b;

    public C0079f(C0078e c0078e) {
        String str = c0078e.f291a;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for arn");
        }
        this.f293a = str;
        String str2 = c0078e.f292b;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for assumedRoleId");
        }
        this.f294b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0079f.class != obj.getClass()) {
            return false;
        }
        C0079f c0079f = (C0079f) obj;
        return AbstractC4154l.m8918a(this.f293a, c0079f.f293a) && AbstractC4154l.m8918a(this.f294b, c0079f.f294b);
    }

    public final int hashCode() {
        return this.f294b.hashCode() + (this.f293a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssumedRoleUser(");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("arn="), this.f293a, ',', sb2, "assumedRoleId="), this.f294b, sb2, ")");
    }
}
