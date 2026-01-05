package ec;

import fx.InterfaceC2398d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.d */
/* loaded from: classes.dex */
public final class C2006d implements Map.Entry, InterfaceC2398d {

    /* renamed from: a */
    public final Object f9535a;

    /* renamed from: b */
    public Object f9536b;

    public C2006d(String str, Object obj) {
        this.f9535a = str;
        this.f9536b = obj;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC4154l.m8918a(entry.getKey(), this.f9535a) && AbstractC4154l.m8918a(entry.getValue(), this.f9536b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9535a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9536b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f9535a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f9536b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9536b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9535a);
        sb2.append('=');
        sb2.append(this.f9536b);
        return sb2.toString();
    }
}
