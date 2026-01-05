package mq;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.l */
/* loaded from: classes3.dex */
public final class C4844l extends AbstractC4854v {

    /* renamed from: a */
    public final int f24300a;

    public C4844l(int i10) {
        this.f24300a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4844l) && this.f24300a == ((C4844l) obj).f24300a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24300a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f24300a, "OnDownloadRecordingPressed(forCallLogId=", ")");
    }
}
