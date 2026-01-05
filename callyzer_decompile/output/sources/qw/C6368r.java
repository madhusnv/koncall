package qw;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.r */
/* loaded from: classes3.dex */
public final class C6368r implements Comparable {

    /* renamed from: a */
    public final byte f30768a;

    public /* synthetic */ C6368r(byte b10) {
        this.f30768a = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4154l.m8924g(this.f30768a & 255, ((C6368r) obj).f30768a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6368r) {
            return this.f30768a == ((C6368r) obj).f30768a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f30768a);
    }

    public final String toString() {
        return String.valueOf(this.f30768a & 255);
    }
}
