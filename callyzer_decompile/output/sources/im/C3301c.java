package im;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.c */
/* loaded from: classes3.dex */
public final class C3301c implements InterfaceC3307i {

    /* renamed from: a */
    public final int f17540a;

    public C3301c(int i10) {
        this.f17540a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3301c) && this.f17540a == ((C3301c) obj).f17540a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17540a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f17540a, "CallLogNoteUpdate(callLogId=", ")");
    }
}
