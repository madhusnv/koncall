package yh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pg.m8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.m */
/* loaded from: classes.dex */
public final class C8669m implements Map, Serializable {

    /* renamed from: g */
    public static final C8669m f41982g = new C8669m(0, null, new Object[0]);

    /* renamed from: a */
    public transient C8666j f41983a;

    /* renamed from: b */
    public transient C8667k f41984b;

    /* renamed from: c */
    public transient C8668l f41985c;

    /* renamed from: d */
    public final transient Object f41986d;

    /* renamed from: e */
    public final transient Object[] f41987e;

    /* renamed from: f */
    public final transient int f41988f;

    public C8669m(int i10, Object obj, Object[] objArr) {
        this.f41986d = obj;
        this.f41987e = objArr;
        this.f41988f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
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
    public static yh.C8669m m16009b(int r19, java.lang.Object[] r20, b2.C0554l r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.C8669m.m16009b(int, java.lang.Object[], b2.l):yh.m");
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
        C8668l c8668l = this.f41985c;
        if (c8668l == null) {
            c8668l = new C8668l(this.f41987e, 1, this.f41988f);
            this.f41985c = c8668l;
        }
        return c8668l.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C8666j c8666j = this.f41983a;
        if (c8666j != null) {
            return c8666j;
        }
        C8666j c8666j2 = new C8666j(this, this.f41987e, this.f41988f);
        this.f41983a = c8666j2;
        return c8666j2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((AbstractC8662f) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r8.f41987e
            int r2 = r8.f41988f
            r3 = 1
            if (r2 != r3) goto L20
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L3
            r9 = r1[r3]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r2 = r8.f41986d
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = pg.n8.m11802a(r2)
        L37:
            r2 = r2 & r5
            r6 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r2 = r2 + 1
            goto L37
        L50:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = pg.n8.m11802a(r2)
        L62:
            r2 = r2 & r5
            short r6 = r4[r2]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r2 = r2 + 1
            goto L62
        L7c:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 - r3
            int r5 = r9.hashCode()
            int r5 = pg.n8.m11802a(r5)
        L88:
            r5 = r5 & r4
            r6 = r2[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.C8669m.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C8666j c8666j = this.f41983a;
        if (c8666j == null) {
            c8666j = new C8666j(this, this.f41987e, this.f41988f);
            this.f41983a = c8666j;
        }
        Iterator it = c8666j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C8667k c8667k = this.f41984b;
        if (c8667k != null) {
            return c8667k;
        }
        C8667k c8667k2 = new C8667k(this, new C8668l(this.f41987e, 0, this.f41988f));
        this.f41984b = c8667k2;
        return c8667k2;
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
        return this.f41988f;
    }

    public final String toString() {
        int i10 = this.f41988f;
        m8.m11791b(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append('{');
        o0 it = ((C8666j) entrySet()).iterator();
        boolean z6 = true;
        while (true) {
            C8658b c8658b = (C8658b) it;
            if (!c8658b.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) c8658b.next();
            if (!z6) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z6 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C8668l c8668l = this.f41985c;
        if (c8668l != null) {
            return c8668l;
        }
        C8668l c8668l2 = new C8668l(this.f41987e, 1, this.f41988f);
        this.f41985c = c8668l2;
        return c8668l2;
    }
}
