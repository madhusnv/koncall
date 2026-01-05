package kn;

import a2.AbstractC0030c;
import android.net.Uri;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.b */
/* loaded from: classes3.dex */
public final class C4122b {

    /* renamed from: a */
    public final Uri f21063a;

    /* renamed from: b */
    public final String f21064b;

    /* renamed from: c */
    public final long f21065c;

    /* renamed from: d */
    public final long f21066d;

    /* renamed from: e */
    public final String f21067e;

    /* renamed from: f */
    public final boolean f21068f;

    /* renamed from: g */
    public final boolean f21069g;

    public C4122b(Uri uri, String name, long j6, long j10, String str, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(name, "name");
        this.f21063a = uri;
        this.f21064b = name;
        this.f21065c = j6;
        this.f21066d = j10;
        this.f21067e = str;
        this.f21068f = z6;
        this.f21069g = z10;
    }

    /* renamed from: a */
    public final long m8897a() {
        return this.f21066d;
    }

    /* renamed from: b */
    public final Uri m8898b() {
        return this.f21063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4122b)) {
            return false;
        }
        C4122b c4122b = (C4122b) obj;
        return AbstractC4154l.m8918a(this.f21063a, c4122b.f21063a) && AbstractC4154l.m8918a(this.f21064b, c4122b.f21064b) && this.f21065c == c4122b.f21065c && this.f21066d == c4122b.f21066d && AbstractC4154l.m8918a(this.f21067e, c4122b.f21067e) && this.f21068f == c4122b.f21068f && this.f21069g == c4122b.f21069g;
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC0030c.m113d(this.f21063a.hashCode() * 31, 31, this.f21064b), 31, this.f21065c), 31, this.f21066d);
        String str = this.f21067e;
        return Boolean.hashCode(this.f21069g) + AbstractC1452a.m4558e((iM4557d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f21068f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallRecordingDocument(uri=");
        sb2.append(this.f21063a);
        sb2.append(", name=");
        sb2.append(this.f21064b);
        sb2.append(", lastModifyTime=");
        sb2.append(this.f21065c);
        sb2.append(", length=");
        sb2.append(this.f21066d);
        sb2.append(", mimeType=");
        AbstractC4801l.m9749w(sb2, this.f21067e, ", isFile=", this.f21068f, ", canRead=");
        return AbstractC5601a.m11242m(sb2, this.f21069g, ")");
    }
}
