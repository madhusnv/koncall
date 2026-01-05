package qi;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.sun.mail.util.AbstractC1452a;
import mm.AbstractC4801l;
import og.fd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.k */
/* loaded from: classes.dex */
public final class C6228k {

    /* renamed from: a */
    public final C6234q f30238a;

    /* renamed from: b */
    public final int f30239b;

    /* renamed from: c */
    public final int f30240c;

    public C6228k(int i10, int i11, Class cls) {
        this(C6234q.m12250a(cls), i10, i11);
    }

    /* renamed from: a */
    public static C6228k m12246a(Class cls) {
        return new C6228k(1, 0, cls);
    }

    /* renamed from: b */
    public static C6228k m12247b(C6234q c6234q) {
        return new C6228k(c6234q, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6228k)) {
            return false;
        }
        C6228k c6228k = (C6228k) obj;
        return this.f30238a.equals(c6228k.f30238a) && this.f30239b == c6228k.f30239b && this.f30240c == c6228k.f30240c;
    }

    public final int hashCode() {
        return ((((this.f30238a.hashCode() ^ 1000003) * 1000003) ^ this.f30239b) * 1000003) ^ this.f30240c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f30238a);
        sb2.append(", type=");
        int i10 = this.f30239b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f30240c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = AWSCognitoLegacyCredentialStore.PROVIDER_KEY;
        } else {
            if (i11 != 2) {
                throw new AssertionError(AbstractC4801l.m9730d(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC1452a.m4564k(sb2, str, "}");
    }

    public C6228k(C6234q c6234q, int i10, int i11) {
        fd.m10650a(c6234q, "Null dependency anInterface.");
        this.f30238a = c6234q;
        this.f30239b = i10;
        this.f30240c = i11;
    }
}
