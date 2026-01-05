package p001o;

/* loaded from: classes2.dex */
public final class fvf {

    /* renamed from: c */
    public static final fvf f24165c = new fvf(-1, -1);

    /* renamed from: d */
    public static final fvf f24166d = new fvf(0, 0);

    /* renamed from: a */
    public final int f24167a;

    /* renamed from: b */
    public final int f24168b;

    public fvf(int i, int i2) {
        op0.m42511a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f24167a = i;
        this.f24168b = i2;
    }

    /* renamed from: a */
    public int m27574a() {
        return this.f24168b;
    }

    /* renamed from: b */
    public int m27575b() {
        return this.f24167a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvf)) {
            return false;
        }
        fvf fvfVar = (fvf) obj;
        return this.f24167a == fvfVar.f24167a && this.f24168b == fvfVar.f24168b;
    }

    public int hashCode() {
        int i = this.f24168b;
        int i2 = this.f24167a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f24167a + "x" + this.f24168b;
    }
}
