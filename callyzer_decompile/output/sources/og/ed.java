package og;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import qi.C6219b;
import qi.C6226i;
import qi.C6227j;
import qi.C6228k;
import qi.C6234q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ed {

    /* renamed from: a */
    public static final /* synthetic */ int f26409a = 0;

    /* renamed from: a */
    public static void m10628a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C6219b c6219b = (C6219b) obj;
            C6226i c6226i = new C6226i(c6219b);
            for (C6234q c6234q : c6219b.f30214b) {
                boolean z6 = c6219b.f30217e == 0;
                C6227j c6227j = new C6227j(c6234q, !z6);
                if (!map.containsKey(c6227j)) {
                    map.put(c6227j, new HashSet());
                }
                Set set = (Set) map.get(c6227j);
                if (!set.isEmpty() && z6) {
                    throw new IllegalArgumentException("Multiple components provide " + c6234q + ".");
                }
                set.add(c6226i);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (C6226i c6226i2 : (Set) it.next()) {
                for (C6228k c6228k : c6226i2.f30233a.f30215c) {
                    if (c6228k.f30240c == 0) {
                        Set<C6226i> set2 = (Set) map.get(new C6227j(c6228k.f30238a, c6228k.f30239b == 2));
                        if (set2 != null) {
                            for (C6226i c6226i3 : set2) {
                                c6226i2.f30234b.add(c6226i3);
                                c6226i3.f30235c.add(c6226i2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            C6226i c6226i4 = (C6226i) it3.next();
            if (c6226i4.f30235c.isEmpty()) {
                hashSet2.add(c6226i4);
            }
        }
        while (!hashSet2.isEmpty()) {
            C6226i c6226i5 = (C6226i) hashSet2.iterator().next();
            hashSet2.remove(c6226i5);
            i10++;
            Iterator it4 = c6226i5.f30234b.iterator();
            while (it4.hasNext()) {
                C6226i c6226i6 = (C6226i) it4.next();
                c6226i6.f30235c.remove(c6226i5);
                if (c6226i6.f30235c.isEmpty()) {
                    hashSet2.add(c6226i6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C6226i c6226i7 = (C6226i) it5.next();
            if (!c6226i7.f30235c.isEmpty() && !c6226i7.f30234b.isEmpty()) {
                arrayList2.add(c6226i7.f30233a);
            }
        }
        throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
