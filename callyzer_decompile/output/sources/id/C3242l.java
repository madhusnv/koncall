package id;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.l */
/* loaded from: classes.dex */
public final class C3242l extends AbstractC3243m {

    /* renamed from: a */
    public final int f17415a;

    /* renamed from: b */
    public final String f17416b;

    public C3242l(int i10, String str) {
        this.f17415a = i10;
        this.f17416b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242l)) {
            return false;
        }
        C3242l c3242l = (C3242l) obj;
        return this.f17415a == c3242l.f17415a && AbstractC4154l.m8918a(this.f17416b, c3242l.f17416b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17415a) * 31;
        String str = this.f17416b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17416b);
        sb2.append(" (");
        return AbstractC1452a.m4563j(sb2, this.f17415a, ')');
    }
}
