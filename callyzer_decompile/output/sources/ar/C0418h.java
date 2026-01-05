package ar;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.h */
/* loaded from: classes3.dex */
public final class C0418h extends AbstractC0427q {

    /* renamed from: a */
    public final int f3136a;

    public C0418h(int i10) {
        this.f3136a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0418h) && this.f3136a == ((C0418h) obj).f3136a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3136a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f3136a, "OnRecordingDownloadClick(callLogId=", ")");
    }
}
