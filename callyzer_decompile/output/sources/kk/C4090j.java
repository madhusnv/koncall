package kk;

import java.util.ArrayList;
import java.util.Iterator;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.j */
/* loaded from: classes.dex */
public final class C4090j extends AbstractC4092l implements Iterable {

    /* renamed from: a */
    public final ArrayList f20996a = new ArrayList();

    @Override // kk.AbstractC4092l
    /* renamed from: a */
    public final int mo8867a() {
        return m8869e().mo8867a();
    }

    @Override // kk.AbstractC4092l
    /* renamed from: c */
    public final String mo8868c() {
        return m8869e().mo8868c();
    }

    /* renamed from: e */
    public final AbstractC4092l m8869e() {
        ArrayList arrayList = this.f20996a;
        int size = arrayList.size();
        if (size == 1) {
            return (AbstractC4092l) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC4801l.m9730d(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4090j) && ((C4090j) obj).f20996a.equals(this.f20996a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20996a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20996a.iterator();
    }
}
