package ky;

import kotlin.jvm.internal.AbstractC4154l;
import ly.AbstractC4600x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.r */
/* loaded from: classes3.dex */
public final class C4286r extends d0 {

    /* renamed from: a */
    public final boolean f21692a;

    /* renamed from: b */
    public final String f21693b;

    public C4286r(String body, boolean z6) {
        AbstractC4154l.m8923f(body, "body");
        this.f21692a = z6;
        this.f21693b = body.toString();
    }

    @Override // ky.d0
    /* renamed from: b */
    public final String mo8989b() {
        return this.f21693b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4286r.class != obj.getClass()) {
            return false;
        }
        C4286r c4286r = (C4286r) obj;
        return this.f21692a == c4286r.f21692a && AbstractC4154l.m8918a(this.f21693b, c4286r.f21693b);
    }

    public final int hashCode() {
        return this.f21693b.hashCode() + (Boolean.hashCode(this.f21692a) * 31);
    }

    @Override // ky.d0
    public final String toString() {
        boolean z6 = this.f21692a;
        String str = this.f21693b;
        if (!z6) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC4600x.m9474a(sb2, str);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
