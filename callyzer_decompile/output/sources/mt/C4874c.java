package mt;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.c1;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.c */
/* loaded from: classes3.dex */
public final class C4874c extends c1 {

    /* renamed from: a */
    public final String f24384a;

    /* renamed from: b */
    public final String f24385b;

    /* renamed from: c */
    public final int f24386c;

    public C4874c(String url, String name, int i10) {
        AbstractC4154l.m8923f(url, "url");
        AbstractC4154l.m8923f(name, "name");
        this.f24384a = url;
        this.f24385b = name;
        this.f24386c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4874c)) {
            return false;
        }
        C4874c c4874c = (C4874c) obj;
        return AbstractC4154l.m8918a(this.f24384a, c4874c.f24384a) && AbstractC4154l.m8918a(this.f24385b, c4874c.f24385b) && this.f24386c == c4874c.f24386c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24386c) + AbstractC0030c.m113d(this.f24384a.hashCode() * 31, 31, this.f24385b);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f24386c, ")", AbstractC0030c.m127r("DownloadDoc(url=", this.f24384a, ", name=", this.f24385b, ", docId="));
    }
}
