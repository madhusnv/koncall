package p001o;

/* loaded from: classes3.dex */
public final class exc {

    /* renamed from: a */
    public final int f22298a;

    /* renamed from: b */
    public final int f22299b;

    /* renamed from: c */
    public final int f22300c;

    public exc(int i, int i2, int i3) {
        this.f22298a = i;
        this.f22299b = i2;
        this.f22300c = i3;
    }

    /* renamed from: a */
    public final int m25719a() {
        return this.f22300c;
    }

    /* renamed from: b */
    public final int m25720b() {
        return this.f22299b;
    }

    /* renamed from: c */
    public final int m25721c() {
        return this.f22298a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exc)) {
            return false;
        }
        exc excVar = (exc) obj;
        return this.f22298a == excVar.f22298a && this.f22299b == excVar.f22299b && this.f22300c == excVar.f22300c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22298a) * 31) + Integer.hashCode(this.f22299b)) * 31) + Integer.hashCode(this.f22300c);
    }

    public String toString() {
        return "ParsedDate(year=" + this.f22298a + ", month=" + this.f22299b + ", day=" + this.f22300c + ')';
    }
}
