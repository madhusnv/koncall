package kb;

import kotlin.jvm.internal.AbstractC4154l;
import sb.InterfaceC6777d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.f */
/* loaded from: classes.dex */
public final class C4042f {

    /* renamed from: a */
    public final String f20879a;

    /* renamed from: b */
    public final InterfaceC6777d f20880b;

    public C4042f(String bucket, InterfaceC6777d baseCredentials) {
        AbstractC4154l.m8923f(bucket, "bucket");
        AbstractC4154l.m8923f(baseCredentials, "baseCredentials");
        this.f20879a = bucket;
        this.f20880b = baseCredentials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4042f)) {
            return false;
        }
        C4042f c4042f = (C4042f) obj;
        return AbstractC4154l.m8918a(this.f20879a, c4042f.f20879a) && AbstractC4154l.m8918a(this.f20880b, c4042f.f20880b);
    }

    public final int hashCode() {
        return this.f20880b.hashCode() + (this.f20879a.hashCode() * 31);
    }

    public final String toString() {
        return "S3ExpressCredentialsCacheKey(bucket=" + this.f20879a + ", baseCredentials=" + this.f20880b + ')';
    }
}
