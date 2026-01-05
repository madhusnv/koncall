package sw;

import fx.InterfaceC2398d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.e */
/* loaded from: classes3.dex */
public final class C6961e implements Map.Entry, InterfaceC2398d {

    /* renamed from: a */
    public final C6962f f33704a;

    /* renamed from: b */
    public final int f33705b;

    /* renamed from: c */
    public final int f33706c;

    public C6961e(C6962f map, int i10) {
        AbstractC4154l.m8923f(map, "map");
        this.f33704a = map;
        this.f33705b = i10;
        this.f33706c = map.f33715h;
    }

    /* renamed from: b */
    public final void m13228b() {
        if (this.f33704a.f33715h != this.f33706c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC4154l.m8918a(entry.getKey(), getKey()) && AbstractC4154l.m8918a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m13228b();
        return this.f33704a.f33708a[this.f33705b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m13228b();
        Object[] objArr = this.f33704a.f33709b;
        AbstractC4154l.m8920c(objArr);
        return objArr[this.f33705b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m13228b();
        C6962f c6962f = this.f33704a;
        c6962f.m13231f();
        Object[] objArr = c6962f.f33709b;
        if (objArr == null) {
            int length = c6962f.f33708a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c6962f.f33709b = objArr;
        }
        int i10 = this.f33705b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
