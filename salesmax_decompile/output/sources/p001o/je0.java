package p001o;

/* loaded from: classes2.dex */
public final class je0 implements s9d {

    /* renamed from: b */
    public final int f30232b;

    public je0(int i) {
        this.f30232b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je0) && this.f30232b == ((je0) obj).f30232b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f30232b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f30232b + ')';
    }
}
