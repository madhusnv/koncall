package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h74 implements Iterable {

    /* renamed from: a */
    public final Object f26325a = new Object();

    /* renamed from: b */
    public final Map f26326b = new HashMap();

    /* renamed from: c */
    public Set f26327c = Collections.emptySet();

    /* renamed from: d */
    public List f26328d = Collections.emptyList();

    public Set D1() {
        Set set;
        synchronized (this.f26325a) {
            set = this.f26327c;
        }
        return set;
    }

    /* renamed from: b */
    public void m29869b(Object obj) {
        synchronized (this.f26325a) {
            ArrayList arrayList = new ArrayList(this.f26328d);
            arrayList.add(obj);
            this.f26328d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f26326b.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f26327c);
                hashSet.add(obj);
                this.f26327c = Collections.unmodifiableSet(hashSet);
            }
            this.f26326b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: d */
    public int m29870d(Object obj) {
        int iIntValue;
        synchronized (this.f26325a) {
            iIntValue = this.f26326b.containsKey(obj) ? ((Integer) this.f26326b.get(obj)).intValue() : 0;
        }
        return iIntValue;
    }

    /* renamed from: e */
    public void m29871e(Object obj) {
        synchronized (this.f26325a) {
            Integer num = (Integer) this.f26326b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f26328d);
            arrayList.remove(obj);
            this.f26328d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f26326b.remove(obj);
                HashSet hashSet = new HashSet(this.f26327c);
                hashSet.remove(obj);
                this.f26327c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f26326b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f26325a) {
            it = this.f26328d.iterator();
        }
        return it;
    }
}
