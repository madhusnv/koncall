package ng;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.l */
/* loaded from: classes.dex */
public final class C5061l implements Map, Serializable {

    /* renamed from: g */
    public static final C5061l f24848g = new C5061l(0, null, new Object[0]);

    /* renamed from: a */
    public transient C5058i f24849a;

    /* renamed from: b */
    public transient C5059j f24850b;

    /* renamed from: c */
    public transient C5060k f24851c;

    /* renamed from: d */
    public final transient Object f24852d;

    /* renamed from: e */
    public final transient Object[] f24853e;

    /* renamed from: f */
    public final transient int f24854f;

    public C5061l(int i10, Object obj, Object[] objArr) {
        this.f24852d = obj;
        this.f24853e = objArr;
        this.f24854f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ng.C5061l m9995b(int r19, java.lang.Object[] r20, b2.C0554l r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C5061l.m9995b(int, java.lang.Object[], b2.l):ng.l");
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
        C5060k c5060k = this.f24851c;
        if (c5060k == null) {
            c5060k = new C5060k(this.f24853e, 1, this.f24854f);
            this.f24851c = c5060k;
        }
        return c5060k.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C5058i c5058i = this.f24849a;
        if (c5058i != null) {
            return c5058i;
        }
        C5058i c5058i2 = new C5058i(this, this.f24853e, this.f24854f);
        this.f24849a = c5058i2;
        return c5058i2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f24854f
            java.lang.Object[] r3 = r9.f24853e
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f24852d
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = og.y1.m11062b(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = og.y1.m11062b(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = og.y1.m11062b(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.C5061l.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C5058i c5058i = this.f24849a;
        if (c5058i == null) {
            c5058i = new C5058i(this, this.f24853e, this.f24854f);
            this.f24849a = c5058i;
        }
        Iterator it = c5058i.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5059j c5059j = this.f24850b;
        if (c5059j != null) {
            return c5059j;
        }
        C5059j c5059j2 = new C5059j(this, new C5060k(this.f24853e, 0, this.f24854f));
        this.f24850b = c5059j2;
        return c5059j2;
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

    @Override // java.util.Map
    public final int size() {
        return this.f24854f;
    }

    public final String toString() {
        int i10 = this.f24854f;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((C5058i) entrySet()).iterator();
        boolean z6 = true;
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
    }

    @Override // java.util.Map
    public final Collection values() {
        C5060k c5060k = this.f24851c;
        if (c5060k != null) {
            return c5060k;
        }
        C5060k c5060k2 = new C5060k(this.f24853e, 1, this.f24854f);
        this.f24851c = c5060k2;
        return c5060k2;
    }
}
