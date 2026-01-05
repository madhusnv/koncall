package h2;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.p */
/* loaded from: classes.dex */
public final class C2811p {

    /* renamed from: a */
    public final String f15757a;

    /* renamed from: b */
    public final char f15758b;

    /* renamed from: c */
    public final String f15759c;

    public C2811p(String str, char c2) {
        this.f15757a = str;
        this.f15758b = c2;
        this.f15759c = AbstractC5185w.m10136r(str, String.valueOf(c2), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2811p)) {
            return false;
        }
        C2811p c2811p = (C2811p) obj;
        return AbstractC4154l.m8918a(this.f15757a, c2811p.f15757a) && this.f15758b == c2811p.f15758b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f15758b) + (this.f15757a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f15757a + ", delimiter=" + this.f15758b + ')';
    }
}
