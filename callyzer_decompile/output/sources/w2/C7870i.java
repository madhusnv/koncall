package w2;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.i */
/* loaded from: classes.dex */
public final class C7870i {

    /* renamed from: a */
    public final float f37661a;

    public C7870i(float f6) {
        this.f37661a = f6;
    }

    /* renamed from: a */
    public final int m14849a(int i10, int i11) {
        return AbstractC1452a.m4554a(1, this.f37661a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7870i) && Float.compare(this.f37661a, ((C7870i) obj).f37661a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37661a);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("Vertical(bias="), this.f37661a, ')');
    }
}
