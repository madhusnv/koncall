package we;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.n */
/* loaded from: classes.dex */
public final class C8012n extends AbstractC8023y {

    /* renamed from: a */
    public final EnumC8022x f38515a;

    /* renamed from: b */
    public final C8010l f38516b;

    public C8012n(EnumC8022x enumC8022x, C8010l c8010l) {
        this.f38515a = enumC8022x;
        this.f38516b = c8010l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8023y)) {
            return false;
        }
        AbstractC8023y abstractC8023y = (AbstractC8023y) obj;
        EnumC8022x enumC8022x = this.f38515a;
        if (enumC8022x == null) {
            if (((C8012n) abstractC8023y).f38515a != null) {
                return false;
            }
        } else if (!enumC8022x.equals(((C8012n) abstractC8023y).f38515a)) {
            return false;
        }
        return this.f38516b.equals(((C8012n) abstractC8023y).f38516b);
    }

    public final int hashCode() {
        EnumC8022x enumC8022x = this.f38515a;
        return (((enumC8022x == null ? 0 : enumC8022x.hashCode()) ^ 1000003) * 1000003) ^ this.f38516b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f38515a + ", androidClientInfo=" + this.f38516b + "}";
    }
}
