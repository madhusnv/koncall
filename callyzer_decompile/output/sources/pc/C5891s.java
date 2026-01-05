package pc;

import iz.C3389v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import jc.InterfaceC3738n;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.s */
/* loaded from: classes.dex */
public final class C5891s implements InterfaceC3738n {

    /* renamed from: c */
    public final C3389v f28719c;

    public C5891s(C3389v c3389v) {
        this.f28719c = c3389v;
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: a */
    public final Set mo5747a() {
        AbstractC5185w.m10131m();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C3389v c3389v = this.f28719c;
        int size = c3389v.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM7788h = c3389v.m7788h(i10);
            Locale US = Locale.US;
            AbstractC4154l.m8922e(US, "US");
            String lowerCase = strM7788h.toLowerCase(US);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(c3389v.m7790q(i10));
        }
        return treeMap.entrySet();
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: c */
    public final boolean mo5749c() {
        return true;
    }

    @Override // ec.InterfaceC2023u
    public final boolean contains(String name) {
        AbstractC4154l.m8923f(name, "name");
        return this.f28719c.m7787b(name) != null;
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: d */
    public final List mo5750d(String name) {
        AbstractC4154l.m8923f(name, "name");
        List listM7791r = this.f28719c.m7791r(name);
        if (listM7791r.isEmpty()) {
            return null;
        }
        return listM7791r;
    }

    @Override // ec.InterfaceC2023u
    public final Object get(String str) {
        return (String) super.get(str);
    }

    @Override // ec.InterfaceC2023u
    public final boolean isEmpty() {
        return this.f28719c.size() == 0;
    }

    @Override // ec.InterfaceC2023u
    public final Set names() {
        AbstractC5185w.m10131m();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        C3389v c3389v = this.f28719c;
        int size = c3389v.size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(c3389v.m7788h(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC4154l.m8922e(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
