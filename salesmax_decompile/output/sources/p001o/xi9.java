package p001o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class xi9 extends h9 implements zi9, RandomAccess {

    /* renamed from: c */
    public static final xi9 f53820c;

    /* renamed from: d */
    public static final zi9 f53821d;

    /* renamed from: b */
    public final List f53822b;

    static {
        xi9 xi9Var = new xi9();
        f53820c = xi9Var;
        xi9Var.mo29975f();
        f53821d = xi9Var;
    }

    public xi9() {
        this(10);
    }

    /* renamed from: e */
    public static String m56351e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof yq1 ? ((yq1) obj).m58089J() : xn8.m56508j((byte[]) obj);
    }

    @Override // p001o.zi9
    public void P1(yq1 yq1Var) {
        m29974b();
        this.f53822b.add(yq1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // p001o.h9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m29974b();
        this.f53822b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        m29974b();
        this.f53822b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p001o.zi9
    /* renamed from: g */
    public List mo47844g() {
        return Collections.unmodifiableList(this.f53822b);
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.f53822b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof yq1) {
            yq1 yq1Var = (yq1) obj;
            String strM58089J = yq1Var.m58089J();
            if (yq1Var.mo58095q()) {
                this.f53822b.set(i, strM58089J);
            }
            return strM58089J;
        }
        byte[] bArr = (byte[]) obj;
        String strM56508j = xn8.m56508j(bArr);
        if (xn8.m56505g(bArr)) {
            this.f53822b.set(i, strM56508j);
        }
        return strM56508j;
    }

    @Override // p001o.xn8.InterfaceC18196d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public xi9 mo56352a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f53822b);
        return new xi9(arrayList);
    }

    @Override // p001o.h9, p001o.xn8.InterfaceC18196d
    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo29976k() {
        return super.mo29976k();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        m29974b();
        Object objRemove = this.f53822b.remove(i);
        ((AbstractList) this).modCount++;
        return m56351e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        m29974b();
        return m56351e(this.f53822b.set(i, str));
    }

    @Override // p001o.h9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p001o.h9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // p001o.zi9
    /* renamed from: s */
    public zi9 mo47845s() {
        return mo29976k() ? new s4i(this) : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f53822b.size();
    }

    @Override // p001o.zi9
    /* renamed from: u */
    public Object mo47846u(int i) {
        return this.f53822b.get(i);
    }

    public xi9(int i) {
        this(new ArrayList(i));
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // p001o.h9, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        m29974b();
        if (collection instanceof zi9) {
            collection = ((zi9) collection).mo47844g();
        }
        boolean zAddAll = this.f53822b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p001o.h9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public xi9(ArrayList arrayList) {
        this.f53822b = arrayList;
    }
}
