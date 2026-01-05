package na;

import kotlin.jvm.internal.AbstractC4154l;
import ra.C6487a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.b */
/* loaded from: classes.dex */
public final class C4980b {

    /* renamed from: a */
    public final C4988j f24709a;

    /* renamed from: b */
    public final C4979a f24710b;

    /* renamed from: c */
    public final C4987i f24711c;

    /* renamed from: d */
    public final C4985g f24712d;

    /* renamed from: e */
    public final C4983e f24713e;

    /* renamed from: f */
    public final C4984f f24714f;

    /* renamed from: g */
    public final String f24715g;

    /* renamed from: h */
    public final C6487a f24716h;

    public C4980b(C4988j c4988j, C4979a c4979a, C4987i c4987i, C4985g c4985g, C4983e c4983e, C4984f c4984f, String str, C6487a c6487a) {
        this.f24709a = c4988j;
        this.f24710b = c4979a;
        this.f24711c = c4987i;
        this.f24712d = c4985g;
        this.f24713e = c4983e;
        this.f24714f = c4984f;
        this.f24715g = str;
        this.f24716h = c6487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4980b)) {
            return false;
        }
        C4980b c4980b = (C4980b) obj;
        return AbstractC4154l.m8918a(this.f24709a, c4980b.f24709a) && AbstractC4154l.m8918a(this.f24710b, c4980b.f24710b) && AbstractC4154l.m8918a(this.f24711c, c4980b.f24711c) && AbstractC4154l.m8918a(this.f24712d, c4980b.f24712d) && AbstractC4154l.m8918a(this.f24713e, c4980b.f24713e) && AbstractC4154l.m8918a(this.f24714f, c4980b.f24714f) && AbstractC4154l.m8918a(this.f24715g, c4980b.f24715g) && AbstractC4154l.m8918a(this.f24716h, c4980b.f24716h);
    }

    public final int hashCode() {
        int iHashCode = (this.f24712d.hashCode() + ((this.f24711c.hashCode() + ((this.f24710b.hashCode() + (this.f24709a.hashCode() * 31)) * 31)) * 31)) * 31;
        C4983e c4983e = this.f24713e;
        int iHashCode2 = (iHashCode + (c4983e == null ? 0 : c4983e.f24719a.hashCode())) * 31;
        C4984f c4984f = this.f24714f;
        int iHashCode3 = (iHashCode2 + (c4984f == null ? 0 : c4984f.hashCode())) * 31;
        String str = this.f24715g;
        return this.f24716h.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AwsUserAgentMetadata(sdkMetadata=" + this.f24709a + ", apiMetadata=" + this.f24710b + ", osMetadata=" + this.f24711c + ", languageMetadata=" + this.f24712d + ", execEnvMetadata=" + this.f24713e + ", frameworkMetadata=" + this.f24714f + ", appId=" + this.f24715g + ", customMetadata=" + this.f24716h + ')';
    }
}
