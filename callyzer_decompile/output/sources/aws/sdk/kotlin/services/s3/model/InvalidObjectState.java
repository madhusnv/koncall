package aws.sdk.kotlin.services.s3.model;

import aws.smithy.kotlin.runtime.C0489b;
import aws.smithy.kotlin.runtime.ServiceException;
import c9.C0927v;
import kotlin.jvm.internal.AbstractC4154l;
import mb.m3;
import mb.t0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InvalidObjectState extends S3Exception {

    /* renamed from: e */
    public final t0 f3495e;

    /* renamed from: f */
    public final m3 f3496f;

    public InvalidObjectState(C0927v c0927v) {
        this.f3495e = (t0) c0927v.f5668b;
        this.f3496f = (m3) c0927v.f5669c;
        this.f3497d.f3503a.mo1862b(C0489b.f3506g, ServiceException.EnumC0487a.Client);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidObjectState.class != obj.getClass()) {
            return false;
        }
        InvalidObjectState invalidObjectState = (InvalidObjectState) obj;
        return AbstractC4154l.m8918a(this.f3495e, invalidObjectState.f3495e) && AbstractC4154l.m8918a(this.f3496f, invalidObjectState.f3496f);
    }

    public final int hashCode() {
        t0 t0Var = this.f3495e;
        int iHashCode = (t0Var != null ? t0Var.hashCode() : 0) * 31;
        m3 m3Var = this.f3496f;
        return iHashCode + (m3Var != null ? m3Var.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidObjectState(");
        sb2.append("accessTier=" + this.f3495e + ',');
        StringBuilder sb3 = new StringBuilder("storageClass=");
        sb3.append(this.f3496f);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
