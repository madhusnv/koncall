package qb;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qb.a */
/* loaded from: classes.dex */
public final class C6152a {

    /* renamed from: a */
    public final String f29994a;

    /* renamed from: b */
    public final String f29995b;

    /* renamed from: c */
    public final String f29996c;

    public C6152a(String str, String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f29994a = str;
        this.f29995b = value;
        this.f29996c = m0.m7379l(str, ": ", value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6152a.class != obj.getClass()) {
            return false;
        }
        C6152a c6152a = (C6152a) obj;
        return AbstractC4154l.m8918a(this.f29994a, c6152a.f29994a) && AbstractC4154l.m8918a(this.f29995b, c6152a.f29995b);
    }

    public final int hashCode() {
        return this.f29995b.hashCode() + (this.f29994a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientErrorContext(key='");
        sb2.append(this.f29994a);
        sb2.append("', value='");
        return AbstractC1452a.m4564k(sb2, this.f29995b, "')");
    }
}
