package qw;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.q */
/* loaded from: classes3.dex */
public final class C6367q implements Serializable {

    /* renamed from: a */
    public final Object f30765a;

    /* renamed from: b */
    public final Object f30766b;

    /* renamed from: c */
    public final Object f30767c;

    public C6367q(Object obj, Object obj2, Object obj3) {
        this.f30765a = obj;
        this.f30766b = obj2;
        this.f30767c = obj3;
    }

    /* renamed from: a */
    public final Object m12365a() {
        return this.f30765a;
    }

    /* renamed from: b */
    public final Object m12366b() {
        return this.f30766b;
    }

    /* renamed from: c */
    public final Object m12367c() {
        return this.f30767c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6367q)) {
            return false;
        }
        C6367q c6367q = (C6367q) obj;
        return AbstractC4154l.m8918a(this.f30765a, c6367q.f30765a) && AbstractC4154l.m8918a(this.f30766b, c6367q.f30766b) && AbstractC4154l.m8918a(this.f30767c, c6367q.f30767c);
    }

    public final int hashCode() {
        Object obj = this.f30765a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30766b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f30767c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f30765a + ", " + this.f30766b + ", " + this.f30767c + ')';
    }
}
