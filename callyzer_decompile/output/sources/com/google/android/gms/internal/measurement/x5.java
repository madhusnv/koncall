package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x5 extends LinkedHashMap {

    /* renamed from: b */
    public static final x5 f6446b;

    /* renamed from: a */
    public boolean f6447a = true;

    static {
        x5 x5Var = new x5();
        f6446b = x5Var;
        x5Var.f6447a = false;
    }

    /* renamed from: d */
    public static int m3773d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof k5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = p5.f6342a;
        int i10 = length;
        for (byte b10 : bArr) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    /* renamed from: b */
    public final x5 m3774b() {
        if (isEmpty()) {
            return new x5();
        }
        x5 x5Var = new x5(this);
        x5Var.f6447a = true;
        return x5Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3775f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m3775f() {
        if (!this.f6447a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM3773d = 0;
        for (Map.Entry entry : entrySet()) {
            iM3773d += m3773d(entry.getValue()) ^ m3773d(entry.getKey());
        }
        return iM3773d;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3775f();
        Charset charset = p5.f6342a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m3775f();
        for (Object obj : map.keySet()) {
            Charset charset = p5.f6342a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3775f();
        return super.remove(obj);
    }
}
