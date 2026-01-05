package p001o;

/* loaded from: classes3.dex */
public final class gxc {

    /* renamed from: a */
    public final int f25917a;

    /* renamed from: b */
    public final int f25918b;

    /* renamed from: c */
    public final int f25919c;

    /* renamed from: d */
    public final int f25920d;

    /* renamed from: e */
    public final int f25921e;

    public gxc(int i, int i2, int i3, int i4, int i5) {
        this.f25917a = i;
        this.f25918b = i2;
        this.f25919c = i3;
        this.f25920d = i4;
        this.f25921e = i5;
    }

    /* renamed from: a */
    public final int m29624a() {
        return this.f25917a;
    }

    /* renamed from: b */
    public final int m29625b() {
        return this.f25918b;
    }

    /* renamed from: c */
    public final int m29626c() {
        return this.f25920d;
    }

    /* renamed from: d */
    public final int m29627d() {
        return this.f25921e;
    }

    /* renamed from: e */
    public final int m29628e() {
        return this.f25919c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxc)) {
            return false;
        }
        gxc gxcVar = (gxc) obj;
        return this.f25917a == gxcVar.f25917a && this.f25918b == gxcVar.f25918b && this.f25919c == gxcVar.f25919c && this.f25920d == gxcVar.f25920d && this.f25921e == gxcVar.f25921e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f25917a) * 31) + Integer.hashCode(this.f25918b)) * 31) + Integer.hashCode(this.f25919c)) * 31) + Integer.hashCode(this.f25920d)) * 31) + Integer.hashCode(this.f25921e);
    }

    public String toString() {
        return "ParsedTime(hour=" + this.f25917a + ", min=" + this.f25918b + ", sec=" + this.f25919c + ", ns=" + this.f25920d + ", offsetSec=" + this.f25921e + ')';
    }
}
