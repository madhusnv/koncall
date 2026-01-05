package qw;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.y */
/* loaded from: classes3.dex */
public final class C6375y implements Comparable {

    /* renamed from: a */
    public final short f30775a;

    public /* synthetic */ C6375y(short s5) {
        this.f30775a = s5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4154l.m8924g(this.f30775a & HPKE.aead_EXPORT_ONLY, ((C6375y) obj).f30775a & HPKE.aead_EXPORT_ONLY);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6375y) {
            return this.f30775a == ((C6375y) obj).f30775a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f30775a);
    }

    public final String toString() {
        return String.valueOf(this.f30775a & HPKE.aead_EXPORT_ONLY);
    }
}
