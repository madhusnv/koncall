package e1;

import fx.InterfaceC2395a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.t */
/* loaded from: classes.dex */
public class C1918t implements Map.Entry, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f9055a;

    /* renamed from: b */
    public final Object f9056b;

    /* renamed from: c */
    public final Object f9057c;

    public /* synthetic */ C1918t(int i10, Object obj, Object obj2) {
        this.f9055a = i10;
        this.f9056b = obj;
        this.f9057c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f9055a) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && AbstractC4154l.m8918a(entry.getKey(), this.f9056b) && AbstractC4154l.m8918a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f9055a) {
        }
        return this.f9056b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f9055a) {
        }
        return this.f9057c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f9055a) {
            case 1:
                Object obj = this.f9056b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f9055a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f9055a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9056b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
