package t8;

import c9.C0915j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import og.mg;
import rw.AbstractC6663m;
import u8.C7361i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.h */
/* loaded from: classes.dex */
public final class C7062h {

    /* renamed from: a */
    public final LinkedHashMap f34155a;

    public C7062h(int i10) {
        switch (i10) {
            case 1:
                this.f34155a = new LinkedHashMap();
                break;
            default:
                this.f34155a = new LinkedHashMap();
                break;
        }
    }

    /* renamed from: a */
    public C7064j m13358a() {
        C7064j c7064j = new C7064j(this.f34155a);
        mg.m10769b(c7064j);
        return c7064j;
    }

    /* renamed from: b */
    public void m13359b(String key, Object obj) {
        Object[] objArr;
        AbstractC4154l.m8923f(key, "key");
        if (obj == null) {
            obj = null;
        } else {
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(obj.getClass());
            if (!(c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Boolean.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Byte.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Integer.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Long.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Float.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Double.TYPE)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(String.class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Boolean[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Byte[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Integer[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Long[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Float[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(Double[].class)) ? true : c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(String[].class)))) {
                int i10 = 0;
                if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    int i11 = AbstractC7065k.f34162a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i10 < length) {
                        objArr[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    int i12 = AbstractC7065k.f34162a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i10 < length2) {
                        objArr[i10] = Byte.valueOf(bArr[i10]);
                        i10++;
                    }
                } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    int i13 = AbstractC7065k.f34162a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i10 < length3) {
                        objArr[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    int i14 = AbstractC7065k.f34162a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i10 < length4) {
                        objArr[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    int i15 = AbstractC7065k.f34162a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i10 < length5) {
                        objArr[i10] = Float.valueOf(fArr[i10]);
                        i10++;
                    }
                } else {
                    if (!c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(double[].class))) {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + c4147eM8901a);
                    }
                    double[] dArr = (double[]) obj;
                    int i16 = AbstractC7065k.f34162a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i10 < length6) {
                        objArr[i10] = Double.valueOf(dArr[i10]);
                        i10++;
                    }
                }
                obj = objArr;
            }
        }
        this.f34155a.put(key, obj);
    }

    /* renamed from: c */
    public void m13360c(Map values) {
        AbstractC4154l.m8923f(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            m13359b((String) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: d */
    public List m13361d(String workSpecId) {
        AbstractC4154l.m8923f(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f34155a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (AbstractC4154l.m8918a(((C0915j) entry.getKey()).f5589a, workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((C0915j) it.next());
        }
        return AbstractC6663m.c0(linkedHashMap.values());
    }

    /* renamed from: e */
    public C7361i m13362e(C0915j id2) {
        AbstractC4154l.m8923f(id2, "id");
        return (C7361i) this.f34155a.remove(id2);
    }

    /* renamed from: f */
    public C7361i m13363f(C0915j c0915j) {
        LinkedHashMap linkedHashMap = this.f34155a;
        Object c7361i = linkedHashMap.get(c0915j);
        if (c7361i == null) {
            c7361i = new C7361i(c0915j);
            linkedHashMap.put(c0915j, c7361i);
        }
        return (C7361i) c7361i;
    }
}
