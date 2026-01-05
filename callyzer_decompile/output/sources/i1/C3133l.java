package i1;

import d3.C1549c;
import d3.C1552f;
import d3.C1555i;
import f3.C2196b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.l */
/* loaded from: classes.dex */
public final class C3133l {

    /* renamed from: a */
    public C1552f f16906a = null;

    /* renamed from: b */
    public C1549c f16907b = null;

    /* renamed from: c */
    public C2196b f16908c = null;

    /* renamed from: d */
    public C1555i f16909d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3133l)) {
            return false;
        }
        C3133l c3133l = (C3133l) obj;
        return AbstractC4154l.m8918a(this.f16906a, c3133l.f16906a) && AbstractC4154l.m8918a(this.f16907b, c3133l.f16907b) && AbstractC4154l.m8918a(this.f16908c, c3133l.f16908c) && AbstractC4154l.m8918a(this.f16909d, c3133l.f16909d);
    }

    public final int hashCode() {
        C1552f c1552f = this.f16906a;
        int iHashCode = (c1552f == null ? 0 : c1552f.hashCode()) * 31;
        C1549c c1549c = this.f16907b;
        int iHashCode2 = (iHashCode + (c1549c == null ? 0 : c1549c.hashCode())) * 31;
        C2196b c2196b = this.f16908c;
        int iHashCode3 = (iHashCode2 + (c2196b == null ? 0 : c2196b.hashCode())) * 31;
        C1555i c1555i = this.f16909d;
        return iHashCode3 + (c1555i != null ? c1555i.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f16906a + ", canvas=" + this.f16907b + ", canvasDrawScope=" + this.f16908c + ", borderPath=" + this.f16909d + ')';
    }
}
