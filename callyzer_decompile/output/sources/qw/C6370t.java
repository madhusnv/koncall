package qw;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.t */
/* loaded from: classes3.dex */
public final class C6370t implements Comparable {

    /* renamed from: a */
    public final int f30770a;

    public /* synthetic */ C6370t(int i10) {
        this.f30770a = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4154l.m8924g(this.f30770a ^ Integer.MIN_VALUE, ((C6370t) obj).f30770a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6370t) {
            return this.f30770a == ((C6370t) obj).f30770a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30770a);
    }

    public final String toString() {
        return String.valueOf(this.f30770a & 4294967295L);
    }
}
