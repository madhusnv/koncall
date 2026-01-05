package b4;

import com.sun.mail.util.AbstractC1452a;
import j3.C3552f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0595a {

    /* renamed from: a */
    public final C3552f f3970a;

    /* renamed from: b */
    public final int f3971b;

    public C0595a(C3552f c3552f, int i10) {
        this.f3970a = c3552f;
        this.f3971b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0595a)) {
            return false;
        }
        C0595a c0595a = (C0595a) obj;
        return AbstractC4154l.m8918a(this.f3970a, c0595a.f3970a) && this.f3971b == c0595a.f3971b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3971b) + (this.f3970a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f3970a);
        sb2.append(", configFlags=");
        return AbstractC1452a.m4563j(sb2, this.f3971b, ')');
    }
}
