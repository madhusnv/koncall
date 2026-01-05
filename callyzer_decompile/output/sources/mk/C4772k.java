package mk;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.k */
/* loaded from: classes.dex */
public final class C4772k extends Number {

    /* renamed from: a */
    public final String f23789a;

    public C4772k(String str) {
        this.f23789a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f23789a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4772k) {
            return this.f23789a.equals(((C4772k) obj).f23789a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f23789a);
    }

    public final int hashCode() {
        return this.f23789a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f23789a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC4770i.m9697j(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f23789a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC4770i.m9697j(str).longValue();
        }
    }

    public final String toString() {
        return this.f23789a;
    }
}
