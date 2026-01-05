package p001o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public class wi9 extends g9 implements yi9, RandomAccess {

    /* renamed from: c */
    public static final wi9 f52212c;

    /* renamed from: d */
    public static final yi9 f52213d;

    /* renamed from: b */
    public final List f52214b;

    static {
        wi9 wi9Var = new wi9();
        f52212c = wi9Var;
        wi9Var.mo28211f();
        f52213d = wi9Var;
    }

    public wi9() {
        this(10);
    }

    /* renamed from: e */
    public static String m54597e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof xq1 ? ((xq1) obj).m56593N() : yn8.m58021j((byte[]) obj);
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m28210b();
        this.f52214b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        m28210b();
        this.f52214b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p001o.yi9
    /* renamed from: g */
    public List mo46221g() {
        return Collections.unmodifiableList(this.f52214b);
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.f52214b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof xq1) {
            xq1 xq1Var = (xq1) obj;
            String strM56593N = xq1Var.m56593N();
            if (xq1Var.mo53614y()) {
                this.f52214b.set(i, strM56593N);
            }
            return strM56593N;
        }
        byte[] bArr = (byte[]) obj;
        String strM58021j = yn8.m58021j(bArr);
        if (yn8.m58018g(bArr)) {
            this.f52214b.set(i, strM58021j);
        }
        return strM58021j;
    }

    @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public wi9 mo17923a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f52214b);
        return new wi9(arrayList);
    }

    @Override // p001o.g9, p001o.yn8.InterfaceC18446j
    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo28212k() {
        return super.mo28212k();
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        m28210b();
        Object objRemove = this.f52214b.remove(i);
        ((AbstractList) this).modCount++;
        return m54597e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        m28210b();
        return m54597e(this.f52214b.set(i, str));
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // p001o.yi9
    /* renamed from: s */
    public yi9 mo46222s() {
        return mo28212k() ? new r4i(this) : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52214b.size();
    }

    @Override // p001o.yi9
    /* renamed from: u */
    public Object mo46223u(int i) {
        return this.f52214b.get(i);
    }

    @Override // p001o.yi9
    public void z0(xq1 xq1Var) {
        m28210b();
        this.f52214b.add(xq1Var);
        ((AbstractList) this).modCount++;
    }

    public wi9(int i) {
        this(new ArrayList(i));
    }

    @Override // p001o.g9, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        m28210b();
        if (collection instanceof yi9) {
            collection = ((yi9) collection).mo46221g();
        }
        boolean zAddAll = this.f52214b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p001o.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public wi9(ArrayList arrayList) {
        this.f52214b = arrayList;
    }
}
