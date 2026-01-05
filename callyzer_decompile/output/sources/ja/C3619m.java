package ja;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.m */
/* loaded from: classes.dex */
public final class C3619m {

    /* renamed from: a */
    public final int f19260a;

    /* renamed from: b */
    public final String f19261b;

    public C3619m(int i10, String content) {
        AbstractC4154l.m8923f(content, "content");
        this.f19260a = i10;
        this.f19261b = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3619m)) {
            return false;
        }
        C3619m c3619m = (C3619m) obj;
        return this.f19260a == c3619m.f19260a && AbstractC4154l.m8918a(this.f19261b, c3619m.f19261b);
    }

    public final int hashCode() {
        return this.f19261b.hashCode() + (Integer.hashCode(this.f19260a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileLine(lineNumber=");
        sb2.append(this.f19260a);
        sb2.append(", content=");
        return AbstractC0030c.m123n(sb2, this.f19261b, ')');
    }
}
