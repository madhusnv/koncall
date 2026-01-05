package um;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: um.a */
/* loaded from: classes3.dex */
public final class C7474a {

    /* renamed from: a */
    public final boolean f36078a;

    /* renamed from: b */
    public final String f36079b;

    public C7474a(boolean z6, String str) {
        this.f36078a = z6;
        this.f36079b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7474a)) {
            return false;
        }
        C7474a c7474a = (C7474a) obj;
        return this.f36078a == c7474a.f36078a && this.f36079b.equals(c7474a.f36079b);
    }

    public final int hashCode() {
        return this.f36079b.hashCode() + (Boolean.hashCode(this.f36078a) * 31);
    }

    public final String toString() {
        return "ExtensionResponseData(connectionStatus=" + this.f36078a + ", extensionName=" + this.f36079b + ")";
    }
}
