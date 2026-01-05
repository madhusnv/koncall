package ar;

import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.i */
/* loaded from: classes3.dex */
public final class C0419i extends AbstractC0427q {

    /* renamed from: a */
    public final C6361k f3137a;

    public C0419i(C6361k c6361k) {
        this.f3137a = c6361k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0419i) && AbstractC4154l.m8918a(this.f3137a, ((C0419i) obj).f3137a);
    }

    public final int hashCode() {
        C6361k c6361k = this.f3137a;
        if (c6361k == null) {
            return 0;
        }
        return c6361k.hashCode();
    }

    public final String toString() {
        return "OnRecordingPlayClicked(idAndSource=" + this.f3137a + ")";
    }
}
