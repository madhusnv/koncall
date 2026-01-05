package e1;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.c */
/* loaded from: classes.dex */
public final class C1901c implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f8936a;

    /* renamed from: b */
    public int f8937b = -1;

    /* renamed from: c */
    public boolean f8938c;

    /* renamed from: d */
    public final /* synthetic */ C1903e f8939d;

    public C1901c(C1903e c1903e) {
        this.f8939d = c1903e;
        this.f8936a = c1903e.f9065c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8938c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f8937b;
        C1903e c1903e = this.f8939d;
        return AbstractC4154l.m8918a(key, c1903e.m5634j(i10)) && AbstractC4154l.m8918a(entry.getValue(), c1903e.m5637o(this.f8937b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8938c) {
            return this.f8939d.m5634j(this.f8937b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8938c) {
            return this.f8939d.m5637o(this.f8937b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8937b < this.f8936a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8938c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f8937b;
        C1903e c1903e = this.f8939d;
        Object objM5634j = c1903e.m5634j(i10);
        Object objM5637o = c1903e.m5637o(this.f8937b);
        return (objM5634j == null ? 0 : objM5634j.hashCode()) ^ (objM5637o != null ? objM5637o.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8937b++;
        this.f8938c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8938c) {
            throw new IllegalStateException();
        }
        this.f8939d.m5635l(this.f8937b);
        this.f8937b--;
        this.f8936a--;
        this.f8938c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8938c) {
            return this.f8939d.m5636n(this.f8937b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
