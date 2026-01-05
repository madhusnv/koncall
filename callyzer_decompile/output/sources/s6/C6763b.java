package s6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s6.b */
/* loaded from: classes.dex */
public final class C6763b {

    /* renamed from: a */
    public final LinkedHashMap f32218a;

    /* renamed from: b */
    public final C4327p f32219b;

    public C6763b(LinkedHashMap linkedHashMap, boolean z6) {
        this.f32218a = linkedHashMap;
        this.f32219b = new C4327p(z6);
    }

    /* renamed from: a */
    public final Map m12964a() {
        C6361k c6361k;
        Set<Map.Entry> setEntrySet = this.f32218a.entrySet();
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(setEntrySet, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC4154l.m8922e(bArrCopyOf, "copyOf(this, size)");
                c6361k = new C6361k(key, bArrCopyOf);
            } else {
                c6361k = new C6361k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c6361k.f30755a, c6361k.f30756b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC4154l.m8922e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    /* renamed from: b */
    public final void m12965b() {
        if (((AtomicBoolean) this.f32219b.f21788b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* renamed from: c */
    public final Object m12966c(C6765d key) {
        AbstractC4154l.m8923f(key, "key");
        Object obj = this.f32218a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC4154l.m8922e(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* renamed from: d */
    public final void m12967d(C6765d key) {
        AbstractC4154l.m8923f(key, "key");
        m12965b();
        this.f32218a.remove(key);
    }

    /* renamed from: e */
    public final void m12968e(C6765d key, Object obj) {
        AbstractC4154l.m8923f(key, "key");
        m12969f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s6.C6763b
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            s6.b r7 = (s6.C6763b) r7
            java.util.LinkedHashMap r7 = r7.f32218a
            java.util.LinkedHashMap r0 = r6.f32218a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C6763b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m12969f(C6765d key, Object obj) {
        AbstractC4154l.m8923f(key, "key");
        m12965b();
        if (obj == null) {
            m12967d(key);
            return;
        }
        boolean z6 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f32218a;
        if (z6) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC6663m.g0((Set) obj));
            AbstractC4154l.m8922e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC4154l.m8922e(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f32218a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return AbstractC6663m.m12748L(this.f32218a.entrySet(), ",\n", "{\n", "\n}", C6762a.f32217a, 24);
    }

    public /* synthetic */ C6763b(boolean z6) {
        this(new LinkedHashMap(), z6);
    }
}
