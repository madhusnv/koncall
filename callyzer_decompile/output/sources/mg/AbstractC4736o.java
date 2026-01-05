package mg;

import java.io.Serializable;
import java.util.Map;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.o */
/* loaded from: classes.dex */
public abstract class AbstractC4736o implements Map, Serializable {

    /* renamed from: b */
    public static final Map.Entry[] f23679b = new Map.Entry[0];

    /* renamed from: a */
    public transient AbstractC4737p f23680a;

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC4737p entrySet() {
        AbstractC4737p c4739r = this.f23680a;
        if (c4739r == null) {
            C4740s c4740s = (C4740s) this;
            c4739r = c4740s.isEmpty() ? C4747z.f23717k : new C4739r(c4740s);
            this.f23680a = c4739r;
        }
        return c4739r;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((C4740s) this).f23693d.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((C4740s) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC4723b.m9600b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C4740s) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        C4740s c4740s = (C4740s) this;
        int size = c4740s.size();
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z6 = true;
        for (Map.Entry entry : c4740s.entrySet()) {
            if (!z6) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z6 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
