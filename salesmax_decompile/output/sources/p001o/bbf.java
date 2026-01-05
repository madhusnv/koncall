package p001o;

/* loaded from: classes2.dex */
public final class bbf {

    /* renamed from: c */
    public static final bbf f15876c = new bbf(0, 0);

    /* renamed from: a */
    public final long f15877a;

    /* renamed from: b */
    public final long f15878b;

    public bbf(long j, long j2) {
        this.f15877a = j;
        this.f15878b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bbf.class != obj.getClass()) {
            return false;
        }
        bbf bbfVar = (bbf) obj;
        return this.f15877a == bbfVar.f15877a && this.f15878b == bbfVar.f15878b;
    }

    public int hashCode() {
        return (((int) this.f15877a) * 31) + ((int) this.f15878b);
    }

    public String toString() {
        return "[timeUs=" + this.f15877a + ", position=" + this.f15878b + "]";
    }
}
