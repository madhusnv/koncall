package ue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ue.b */
/* loaded from: classes.dex */
public final class C7420b {

    /* renamed from: a */
    public final Integer f35228a;

    public C7420b(Integer num) {
        this.f35228a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7420b)) {
            return false;
        }
        Integer num = ((C7420b) obj).f35228a;
        Integer num2 = this.f35228a;
        return num2 == null ? num == null : num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.f35228a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f35228a + "}";
    }
}
