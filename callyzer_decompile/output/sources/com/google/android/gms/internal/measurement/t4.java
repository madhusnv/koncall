package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t4 {
    protected int zza;

    /* renamed from: c */
    public static void m3668c(Iterable iterable, List list) {
        Charset charset = p5.f6342a;
        iterable.getClass();
        if (iterable instanceof r5) {
            List listZza = ((r5) iterable).zza();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof z4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                z4.m3801e(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof e6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof g6) {
                g6 g6Var = (g6) list;
                int i10 = g6Var.f6218c + size;
                int length = g6Var.f6217b.length;
                if (i10 > length) {
                    if (length != 0) {
                        while (length < i10) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        g6Var.f6217b = Arrays.copyOf(g6Var.f6217b, length);
                    } else {
                        g6Var.f6217b = new Object[Math.max(i10, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    h5.m3302a(list, size2);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object obj2 = list2.get(i11);
            if (obj2 == null) {
                h5.m3302a(list, size2);
                throw null;
            }
            list.add(obj2);
        }
    }

    /* renamed from: a */
    public final byte[] m3669a() {
        try {
            i5 i5Var = (i5) this;
            int iM3342k = i5Var.m3342k();
            byte[] bArr = new byte[iM3342k];
            a5 a5Var = new a5(bArr, iM3342k);
            i5Var.m3335d(a5Var);
            if (iM3342k - a5Var.f6062d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(p020v.a1.m14335o(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    /* renamed from: b */
    public abstract int mo3334b(i6 i6Var);
}
