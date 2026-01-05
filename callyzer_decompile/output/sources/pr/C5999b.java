package pr;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pr.b */
/* loaded from: classes3.dex */
public final class C5999b {

    /* renamed from: a */
    public final List f29323a;

    /* renamed from: b */
    public final boolean f29324b;

    public C5999b(List excludeNumbers, boolean z6) {
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f29323a = excludeNumbers;
        this.f29324b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5999b)) {
            return false;
        }
        C5999b c5999b = (C5999b) obj;
        return AbstractC4154l.m8918a(this.f29323a, c5999b.f29323a) && this.f29324b == c5999b.f29324b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29324b) + (this.f29323a.hashCode() * 31);
    }

    public final String toString() {
        return "ExcludeNumberState(excludeNumbers=" + this.f29323a + ", isLoad=" + this.f29324b + ")";
    }
}
