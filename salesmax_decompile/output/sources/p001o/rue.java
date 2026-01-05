package p001o;

/* loaded from: classes2.dex */
public final class rue {

    /* renamed from: a */
    public final float f44081a;

    /* renamed from: b */
    public final float f44082b;

    /* renamed from: c */
    public final long f44083c;

    public rue(float f, float f2, long j) {
        this.f44081a = f;
        this.f44082b = f2;
        this.f44083c = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rue)) {
            return false;
        }
        rue rueVar = (rue) obj;
        if (rueVar.f44081a == this.f44081a) {
            return ((rueVar.f44082b > this.f44082b ? 1 : (rueVar.f44082b == this.f44082b ? 0 : -1)) == 0) && rueVar.f44083c == this.f44083c;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f44081a) * 31) + Float.hashCode(this.f44082b)) * 31) + Long.hashCode(this.f44083c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f44081a + ",horizontalScrollPixels=" + this.f44082b + ",uptimeMillis=" + this.f44083c + ')';
    }
}
