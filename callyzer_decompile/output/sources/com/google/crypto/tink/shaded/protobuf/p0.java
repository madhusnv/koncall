package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends LinkedHashMap {

    /* renamed from: b */
    public static final p0 f7085b;

    /* renamed from: a */
    public boolean f7086a = true;

    static {
        p0 p0Var = new p0();
        f7085b = p0Var;
        p0Var.f7086a = false;
    }

    /* renamed from: b */
    public static int m4363b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof c0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = g0.f7037a;
        int i10 = length;
        for (byte b10 : bArr) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4364d();
        super.clear();
    }

    /* renamed from: d */
    public final void m4364d() {
        if (!this.f7086a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            return r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final p0 m4365f() {
        if (isEmpty()) {
            return new p0();
        }
        p0 p0Var = new p0(this);
        p0Var.f7086a = true;
        return p0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM4363b = 0;
        for (Map.Entry entry : entrySet()) {
            iM4363b += m4363b(entry.getValue()) ^ m4363b(entry.getKey());
        }
        return iM4363b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4364d();
        Charset charset = g0.f7037a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4364d();
        for (Object obj : map.keySet()) {
            Charset charset = g0.f7037a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4364d();
        return super.remove(obj);
    }
}
