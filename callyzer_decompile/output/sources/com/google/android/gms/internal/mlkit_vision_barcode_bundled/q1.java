package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 extends LinkedHashMap {

    /* renamed from: b */
    public static final q1 f6635b;

    /* renamed from: a */
    public boolean f6636a = true;

    static {
        q1 q1Var = new q1();
        f6635b = q1Var;
        q1Var.f6636a = false;
    }

    /* renamed from: b */
    public static int m3942b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof g1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = l1.f6594a;
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
        m3943d();
        super.clear();
    }

    /* renamed from: d */
    public final void m3943d() {
        if (!this.f6636a) {
            throw new UnsupportedOperationException();
        }
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM3942b = 0;
        for (Map.Entry entry : entrySet()) {
            iM3942b += m3942b(entry.getValue()) ^ m3942b(entry.getKey());
        }
        return iM3942b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3943d();
        Charset charset = l1.f6594a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m3943d();
        for (Object obj : map.keySet()) {
            Charset charset = l1.f6594a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3943d();
        return super.remove(obj);
    }
}
