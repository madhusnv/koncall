package p015q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q.f */
/* loaded from: classes.dex */
public class C6059f implements Iterable {

    /* renamed from: a */
    public C6056c f29556a;

    /* renamed from: b */
    public C6056c f29557b;

    /* renamed from: c */
    public final WeakHashMap f29558c = new WeakHashMap();

    /* renamed from: d */
    public int f29559d = 0;

    /* renamed from: a */
    public C6056c mo12061a(Object obj) {
        C6056c c6056c = this.f29556a;
        while (c6056c != null && !c6056c.f29549a.equals(obj)) {
            c6056c = c6056c.f29551c;
        }
        return c6056c;
    }

    /* renamed from: b */
    public Object mo12062b(Object obj) {
        C6056c c6056cMo12061a = mo12061a(obj);
        if (c6056cMo12061a == null) {
            return null;
        }
        this.f29559d--;
        WeakHashMap weakHashMap = this.f29558c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC6058e) it.next()).mo12063a(c6056cMo12061a);
            }
        }
        C6056c c6056c = c6056cMo12061a.f29552d;
        if (c6056c != null) {
            c6056c.f29551c = c6056cMo12061a.f29551c;
        } else {
            this.f29556a = c6056cMo12061a.f29551c;
        }
        C6056c c6056c2 = c6056cMo12061a.f29551c;
        if (c6056c2 != null) {
            c6056c2.f29552d = c6056c;
        } else {
            this.f29557b = c6056c;
        }
        c6056cMo12061a.f29551c = null;
        c6056cMo12061a.f29552d = null;
        return c6056cMo12061a.f29550b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p015q.C6055b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p015q.C6059f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q.f r7 = (p015q.C6059f) r7
            int r1 = r6.f29559d
            int r3 = r7.f29559d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            q.b r3 = (p015q.C6055b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            q.b r4 = (p015q.C6055b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            q.b r7 = (p015q.C6055b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015q.C6059f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C6055b c6055b = (C6055b) it;
            if (!c6055b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c6055b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C6055b c6055b = new C6055b(this.f29556a, this.f29557b, 0);
        this.f29558c.put(c6055b, Boolean.FALSE);
        return c6055b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C6055b c6055b = (C6055b) it;
            if (!c6055b.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c6055b.next()).toString());
            if (c6055b.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
