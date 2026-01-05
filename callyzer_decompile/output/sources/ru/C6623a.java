package ru;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ru.a */
/* loaded from: classes3.dex */
public final class C6623a {

    /* renamed from: a */
    public final int f31812a;

    /* renamed from: b */
    public final int f31813b;

    /* renamed from: c */
    public final boolean f31814c;

    public C6623a(int i10, int i11, boolean z6) {
        this.f31812a = i10;
        this.f31813b = i11;
        this.f31814c = z6;
    }

    /* renamed from: a */
    public static C6623a m12671a(C6623a c6623a, boolean z6) {
        int i10 = c6623a.f31812a;
        int i11 = c6623a.f31813b;
        c6623a.getClass();
        return new C6623a(i10, i11, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6623a)) {
            return false;
        }
        C6623a c6623a = (C6623a) obj;
        return this.f31812a == c6623a.f31812a && this.f31813b == c6623a.f31813b && this.f31814c == c6623a.f31814c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31814c) + AbstractC1452a.m4556c(this.f31813b, Integer.hashCode(this.f31812a) * 31, 31);
    }

    public final String toString() {
        return AbstractC5601a.m11242m(AbstractC1452a.m4566m(this.f31812a, this.f31813b, "NotePopupUIModel(title=", ", tag=", ", selected="), this.f31814c, ")");
    }
}
