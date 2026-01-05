package e1;

import androidx.datastore.preferences.protobuf.f1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.e */
/* loaded from: classes.dex */
public final class C1903e extends u0 implements Map {

    /* renamed from: d */
    public f1 f8953d;

    /* renamed from: e */
    public C1900b f8954e;

    /* renamed from: f */
    public C1902d f8955f;

    public C1903e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f1 f1Var = this.f8953d;
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(this, 3);
        this.f8953d = f1Var2;
        return f1Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1900b c1900b = this.f8954e;
        if (c1900b != null) {
            return c1900b;
        }
        C1900b c1900b2 = new C1900b(this);
        this.f8954e = c1900b2;
        return c1900b2;
    }

    /* renamed from: p */
    public final boolean m5540p(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m5630d(map.size() + this.f9065c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: q */
    public final boolean m5541q(Collection collection) {
        int i10 = this.f9065c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f9065c;
    }

    /* renamed from: r */
    public final boolean m5542r(Collection collection) {
        int i10 = this.f9065c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(m5634j(i11))) {
                m5635l(i11);
            }
        }
        return i10 != this.f9065c;
    }

    @Override // java.util.Map
    public final Collection values() {
        C1902d c1902d = this.f8955f;
        if (c1902d != null) {
            return c1902d;
        }
        C1902d c1902d2 = new C1902d(this);
        this.f8955f = c1902d2;
        return c1902d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1903e(u0 u0Var) {
        super(0);
        int i10 = u0Var.f9065c;
        m5630d(this.f9065c + i10);
        if (this.f9065c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(u0Var.m5634j(i11), u0Var.m5637o(i11));
            }
        } else if (i10 > 0) {
            AbstractC6662l.m12717g(0, u0Var.f9063a, 0, i10, this.f9063a);
            AbstractC6662l.m12715e(0, 0, i10 << 1, u0Var.f9064b, this.f9064b);
            this.f9065c = i10;
        }
    }
}
