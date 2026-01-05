package mg;

import a2.AbstractC0030c;
import ap.C0390c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.s */
/* loaded from: classes.dex */
public final class C4740s extends AbstractC4736o implements NavigableMap {

    /* renamed from: f */
    public static final C4740s f23691f;

    /* renamed from: c */
    public final transient a0 f23692c;

    /* renamed from: d */
    public final transient AbstractC4735n f23693d;

    /* renamed from: e */
    public final transient C4740s f23694e;

    static {
        a0 a0VarM9641s = AbstractC4741t.m9641s(C4744w.f23706b);
        C4731j c4731j = AbstractC4735n.f23678b;
        f23691f = new C4740s(a0VarM9641s, C4746y.f23712e, null);
    }

    public C4740s(a0 a0Var, AbstractC4735n abstractC4735n, C4740s c4740s) {
        this.f23692c = a0Var;
        this.f23693d = abstractC4735n;
        this.f23694e = c4740s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static C4740s m9635d(TreeMap treeMap) {
        C4744w c4744w = C4744w.f23706b;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        boolean zEquals = comparator == null ? true : c4744w.equals(comparator);
        Set setEntrySet = treeMap.entrySet();
        if (!(setEntrySet instanceof Collection)) {
            Iterator it = setEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            setEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(AbstractC4736o.f23679b);
        int length = entryArr.length;
        if (length == 0) {
            return m9636f(c4744w);
        }
        int i11 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr[i12] == null) {
                    throw new NullPointerException(AbstractC4801l.m9730d(i12, "at index "));
                }
            }
            a0 a0Var = new a0(AbstractC4735n.m9626k(1, objArr), c4744w);
            Object[] objArr2 = {value};
            while (i11 < 1) {
                if (objArr2[i11] == null) {
                    throw new NullPointerException(AbstractC4801l.m9730d(i11, "at index "));
                }
                i11++;
            }
            return new C4740s(a0Var, AbstractC4735n.m9626k(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i11 < length) {
                Map.Entry entry2 = entryArr[i11];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC4723b.m9604f(key2, value2);
                objArr3[i11] = key2;
                objArr4[i11] = value2;
                i11++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new C0390c(18));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC4723b.m9604f(objArr3[0], value3);
            while (i10 < length) {
                Map.Entry entry4 = entryArr[i10 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i10];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC4723b.m9604f(key4, value4);
                objArr3[i10] = key4;
                objArr4[i10] = value4;
                if (c4744w.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i10++;
                key3 = key4;
            }
        }
        return new C4740s(new a0(AbstractC4735n.m9626k(length, objArr3), c4744w), AbstractC4735n.m9626k(length, objArr4), null);
    }

    /* renamed from: f */
    public static C4740s m9636f(Comparator comparator) {
        if (C4744w.f23706b.equals(comparator)) {
            return f23691f;
        }
        a0 a0VarM9641s = AbstractC4741t.m9641s(comparator);
        C4731j c4731j = AbstractC4735n.f23678b;
        return new C4740s(a0VarM9641s, C4746y.f23712e, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f23692c.f23696d;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f23692c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C4740s c4740s = this.f23694e;
        if (c4740s != null) {
            return c4740s;
        }
        boolean zIsEmpty = isEmpty();
        a0 a0Var = this.f23692c;
        if (!zIsEmpty) {
            return new C4740s((a0) a0Var.descendingSet(), this.f23693d.mo9623h(), this);
        }
        Comparator comparator = a0Var.f23696d;
        return m9636f((comparator instanceof AbstractC4745x ? (AbstractC4745x) comparator : new C4729h(comparator)).mo9613a());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo9593k().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f23692c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // mg.AbstractC4736o, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            mg.a0 r0 = r3.f23692c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            mg.n r2 = r0.f23625f     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f23696d     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            mg.n r0 = r3.f23693d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C4740s.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C4740s headMap(Object obj, boolean z6) {
        obj.getClass();
        return m9640l(0, this.f23692c.m9594t(obj, z6));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C4740s subMap(Object obj, boolean z6, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f23692c.f23696d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z6);
        }
        throw new IllegalArgumentException(AbstractC4723b.m9601c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C4740s tailMap(Object obj, boolean z6) {
        obj.getClass();
        return m9640l(this.f23692c.m9595u(obj, z6), this.f23693d.size());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f23692c;
    }

    /* renamed from: l */
    public final C4740s m9640l(int i10, int i11) {
        AbstractC4735n abstractC4735n = this.f23693d;
        if (i10 == 0) {
            if (i11 == abstractC4735n.size()) {
                return this;
            }
            i10 = 0;
        }
        a0 a0Var = this.f23692c;
        return i10 == i11 ? m9636f(a0Var.f23696d) : new C4740s(a0Var.m9596v(i10, i11), abstractC4735n.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo9593k().get(this.f23693d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f23692c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f23692c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23693d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f23693d;
    }
}
