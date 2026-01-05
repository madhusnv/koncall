package mk;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.m */
/* loaded from: classes.dex */
public final class C4774m extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f23795a;

    /* renamed from: b */
    public final /* synthetic */ C4776o f23796b;

    public /* synthetic */ C4774m(C4776o c4776o, int i10) {
        this.f23795a = i10;
        this.f23796b = c4776o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f23795a) {
            case 0:
                this.f23796b.clear();
                break;
            default:
                this.f23796b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C4775n c4775nM9703b;
        switch (this.f23795a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C4776o c4776o = this.f23796b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C4775n c4775n = null;
                if (key != null) {
                    try {
                        c4775nM9703b = c4776o.m9703b(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c4775nM9703b = null;
                }
                if (c4775nM9703b != null && Objects.equals(c4775nM9703b.f23804h, entry.getValue())) {
                    c4775n = c4775nM9703b;
                }
                return c4775n != null;
            default:
                return this.f23796b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f23795a) {
            case 0:
                return new C4773l(this.f23796b, 0);
            default:
                return new C4773l(this.f23796b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C4775n c4775nM9703b;
        switch (this.f23795a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C4776o c4776o = this.f23796b;
                    C4775n c4775n = null;
                    if (key != null) {
                        try {
                            c4775nM9703b = c4776o.m9703b(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c4775nM9703b = null;
                    }
                    if (c4775nM9703b != null && Objects.equals(c4775nM9703b.f23804h, entry.getValue())) {
                        c4775n = c4775nM9703b;
                    }
                    if (c4775n != null) {
                        c4776o.m9705f(c4775n, true);
                        break;
                    }
                }
                break;
            default:
                C4776o c4776o2 = this.f23796b;
                C4775n c4775nM9703b2 = null;
                if (obj != null) {
                    try {
                        c4775nM9703b2 = c4776o2.m9703b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c4775nM9703b2 != null) {
                    c4776o2.m9705f(c4775nM9703b2, true);
                }
                if (c4775nM9703b2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f23795a) {
        }
        return this.f23796b.f23810d;
    }
}
