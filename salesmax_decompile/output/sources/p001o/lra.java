package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public class lra implements Map.Entry, sb9 {

    /* renamed from: a */
    public final Object f34305a;

    /* renamed from: b */
    public final Object f34306b;

    public lra(Object obj, Object obj2) {
        this.f34305a = obj;
        this.f34306b = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && sq8.m48644c(entry.getKey(), getKey()) && sq8.m48644c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f34305a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f34306b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
