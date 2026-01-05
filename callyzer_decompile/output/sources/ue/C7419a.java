package ue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ue.a */
/* loaded from: classes.dex */
public final class C7419a {

    /* renamed from: a */
    public final Object f35225a;

    /* renamed from: b */
    public final EnumC7422d f35226b;

    /* renamed from: c */
    public final C7420b f35227c;

    public C7419a(Object obj, EnumC7422d enumC7422d, C7420b c7420b) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f35225a = obj;
        if (enumC7422d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f35226b = enumC7422d;
        this.f35227c = c7420b;
    }

    public final boolean equals(Object obj) {
        C7420b c7420b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7419a) {
            C7419a c7419a = (C7419a) obj;
            C7420b c7420b2 = c7419a.f35227c;
            if (this.f35225a.equals(c7419a.f35225a) && this.f35226b.equals(c7419a.f35226b) && ((c7420b = this.f35227c) != null ? c7420b.equals(c7420b2) : c7420b2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f35225a.hashCode()) * 1000003) ^ this.f35226b.hashCode()) * 1000003;
        C7420b c7420b = this.f35227c;
        return (iHashCode ^ (c7420b == null ? 0 : c7420b.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f35225a + ", priority=" + this.f35226b + ", productData=" + this.f35227c + ", eventContext=null}";
    }
}
