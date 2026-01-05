package xh;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xh.g */
/* loaded from: classes.dex */
public final class C8382g implements InterfaceC8379d, Serializable {

    /* renamed from: a */
    public final Object f40057a;

    public C8382g(Object obj) {
        this.f40057a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8382g)) {
            return false;
        }
        Object obj2 = ((C8382g) obj).f40057a;
        Object obj3 = this.f40057a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // xh.InterfaceC8379d
    public final Object get() {
        return this.f40057a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40057a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f40057a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
