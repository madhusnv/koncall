package y4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.c */
/* loaded from: classes.dex */
public final class C8542c {

    /* renamed from: a */
    public final String f41497a;

    /* renamed from: b */
    public final int f41498b;

    /* renamed from: c */
    public final C8541b f41499c;

    public C8542c(String str, int i10, C8541b c8541b) {
        this.f41497a = str;
        this.f41498b = i10;
        this.f41499c = c8541b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8542c)) {
            return false;
        }
        C8542c c8542c = (C8542c) obj;
        return this.f41497a.equals(c8542c.f41497a) && this.f41498b == c8542c.f41498b && this.f41499c.equals(c8542c.f41499c);
    }

    public final int hashCode() {
        return this.f41499c.hashCode() + AbstractC1452a.m4556c(this.f41498b, this.f41497a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + ((Object) this.f41497a) + ", index=" + this.f41498b + ", reference=" + this.f41499c + ')';
    }
}
