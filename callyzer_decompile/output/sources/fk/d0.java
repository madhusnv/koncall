package fk;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {
    public static final c0 Companion = new c0();

    /* renamed from: a */
    public final int f10365a;

    /* renamed from: b */
    public final String f10366b;

    public /* synthetic */ d0(int i10, int i11, String str) {
        if (3 != (i10 & 3)) {
            jy.n0.m8426g(i10, 3, b0.f10342a.getDescriptor());
            throw null;
        }
        this.f10365a = i11;
        this.f10366b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f10365a == d0Var.f10365a && AbstractC4154l.m8918a(this.f10366b, d0Var.f10366b);
    }

    public final int hashCode() {
        return this.f10366b.hashCode() + (Integer.hashCode(this.f10365a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f10365a);
        sb2.append(", uuid=");
        return AbstractC0030c.m123n(sb2, this.f10366b, ')');
    }

    public d0(int i10, String uuid) {
        AbstractC4154l.m8923f(uuid, "uuid");
        this.f10365a = i10;
        this.f10366b = uuid;
    }
}
