package og;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 implements Map, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f26552a;

    /* renamed from: b */
    public final transient Object[] f26553b;

    /* renamed from: c */
    public transient AbstractCollection f26554c;

    /* renamed from: d */
    public transient AbstractCollection f26555d;

    /* renamed from: e */
    public transient AbstractCollection f26556e;

    public /* synthetic */ j0(int i10, Object[] objArr) {
        this.f26552a = i10;
        this.f26553b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f26552a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f26552a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f26552a) {
            case 0:
                i0 i0Var = (i0) this.f26556e;
                if (i0Var == null) {
                    i0Var = new i0(1, this.f26553b);
                    this.f26556e = i0Var;
                }
                return i0Var.contains(obj);
            default:
                pg.xa xaVar = (pg.xa) this.f26556e;
                if (xaVar == null) {
                    xaVar = new pg.xa(1, this.f26553b);
                    this.f26556e = xaVar;
                }
                return xaVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f26552a) {
            case 0:
                g0 g0Var = (g0) this.f26554c;
                if (g0Var != null) {
                    return g0Var;
                }
                g0 g0Var2 = new g0(this, this.f26553b);
                this.f26554c = g0Var2;
                return g0Var2;
            default:
                pg.va vaVar = (pg.va) this.f26554c;
                if (vaVar != null) {
                    return vaVar;
                }
                pg.va vaVar2 = new pg.va(this, this.f26553b);
                this.f26554c = vaVar2;
                return vaVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f26552a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f26552a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r4 != 0) goto La
        L8:
            r4 = r0
            goto L1e
        La:
            r1 = 0
            java.lang.Object[] r2 = r3.f26553b
            r1 = r2[r1]
            r1.getClass()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8
            r4 = 1
            r4 = r2[r4]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r0 = r4
        L22:
            return r0
        L23:
            r0 = 0
            if (r4 != 0) goto L28
        L26:
            r4 = r0
            goto L3c
        L28:
            r1 = 0
            java.lang.Object[] r2 = r3.f26553b
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            r4 = r2[r4]
            java.util.Objects.requireNonNull(r4)
        L3c:
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: og.j0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f26552a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f26552a) {
            case 0:
                g0 g0Var = (g0) this.f26554c;
                if (g0Var == null) {
                    g0Var = new g0(this, this.f26553b);
                    this.f26554c = g0Var;
                }
                return ua.m10953a(g0Var);
            default:
                pg.va vaVar = (pg.va) this.f26554c;
                if (vaVar == null) {
                    vaVar = new pg.va(this, this.f26553b);
                    this.f26554c = vaVar;
                }
                Iterator it = vaVar.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f26552a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f26552a) {
            case 0:
                h0 h0Var = (h0) this.f26555d;
                if (h0Var != null) {
                    return h0Var;
                }
                h0 h0Var2 = new h0(this, new i0(0, this.f26553b));
                this.f26555d = h0Var2;
                return h0Var2;
            default:
                pg.wa waVar = (pg.wa) this.f26555d;
                if (waVar != null) {
                    return waVar;
                }
                pg.wa waVar2 = new pg.wa(this, new pg.xa(0, this.f26553b));
                this.f26555d = waVar2;
                return waVar2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f26552a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f26552a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f26552a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f26552a) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.f26552a) {
            case 0:
                boolean z6 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((g0) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
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
            default:
                boolean z10 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((pg.va) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f26552a) {
            case 0:
                i0 i0Var = (i0) this.f26556e;
                if (i0Var != null) {
                    return i0Var;
                }
                i0 i0Var2 = new i0(1, this.f26553b);
                this.f26556e = i0Var2;
                return i0Var2;
            default:
                pg.xa xaVar = (pg.xa) this.f26556e;
                if (xaVar != null) {
                    return xaVar;
                }
                pg.xa xaVar2 = new pg.xa(1, this.f26553b);
                this.f26556e = xaVar2;
                return xaVar2;
        }
    }
}
