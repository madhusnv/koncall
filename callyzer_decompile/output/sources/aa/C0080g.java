package aa;

import a2.AbstractC0030c;
import c9.C0919n;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.g */
/* loaded from: classes.dex */
public final class C0080g {

    /* renamed from: a */
    public final String f295a;

    /* renamed from: b */
    public final C7126c f296b;

    /* renamed from: c */
    public final String f297c;

    /* renamed from: d */
    public final String f298d;

    public C0080g(C0919n c0919n) {
        String str = (String) c0919n.f5598a;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId");
        }
        this.f295a = str;
        C7126c c7126c = (C7126c) c0919n.f5599b;
        if (c7126c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiration");
        }
        this.f296b = c7126c;
        String str2 = (String) c0919n.f5600c;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey");
        }
        this.f297c = str2;
        String str3 = (String) c0919n.f5601d;
        if (str3 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken");
        }
        this.f298d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0080g.class != obj.getClass()) {
            return false;
        }
        C0080g c0080g = (C0080g) obj;
        return AbstractC4154l.m8918a(this.f295a, c0080g.f295a) && AbstractC4154l.m8918a(this.f296b, c0080g.f296b) && AbstractC4154l.m8918a(this.f297c, c0080g.f297c) && AbstractC4154l.m8918a(this.f298d, c0080g.f298d);
    }

    public final int hashCode() {
        return this.f298d.hashCode() + AbstractC0030c.m113d((this.f296b.f34346a.hashCode() + (this.f295a.hashCode() * 31)) * 31, 31, this.f297c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Credentials(");
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("accessKeyId="), this.f295a, ',', sb2, "expiration=");
        sbM7385r.append(this.f296b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(new StringBuilder("sessionToken="), this.f298d, sb2, ")");
    }
}
