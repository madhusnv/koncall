package c9;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.j */
/* loaded from: classes.dex */
public final class C0915j {

    /* renamed from: a */
    public final String f5589a;

    /* renamed from: b */
    public final int f5590b;

    public C0915j(String workSpecId, int i10) {
        AbstractC4154l.m8923f(workSpecId, "workSpecId");
        this.f5589a = workSpecId;
        this.f5590b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0915j)) {
            return false;
        }
        C0915j c0915j = (C0915j) obj;
        return AbstractC4154l.m8918a(this.f5589a, c0915j.f5589a) && this.f5590b == c0915j.f5590b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5590b) + (this.f5589a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f5589a);
        sb2.append(", generation=");
        return AbstractC1452a.m4563j(sb2, this.f5590b, ')');
    }
}
