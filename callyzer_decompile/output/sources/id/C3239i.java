package id;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.i */
/* loaded from: classes.dex */
public final class C3239i extends AbstractC3243m {

    /* renamed from: a */
    public final int f17409a;

    /* renamed from: b */
    public final C3241k f17410b;

    public C3239i(int i10, C3241k c3241k) {
        this.f17409a = i10;
        this.f17410b = c3241k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3239i)) {
            return false;
        }
        C3239i c3239i = (C3239i) obj;
        return this.f17409a == c3239i.f17409a && AbstractC4154l.m8918a(this.f17410b, c3239i.f17410b);
    }

    public final int hashCode() {
        return this.f17410b.hashCode() + (Integer.hashCode(this.f17409a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("</");
        sb2.append(this.f17410b);
        sb2.append("> (");
        return AbstractC1452a.m4563j(sb2, this.f17409a, ')');
    }
}
