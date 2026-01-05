package yh;

import java.util.Iterator;
import java.util.ListIterator;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.c */
/* loaded from: classes.dex */
public final class C8659c extends AbstractC8660d {

    /* renamed from: c */
    public final transient int f41959c;

    /* renamed from: d */
    public final transient int f41960d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC8660d f41961e;

    public C8659c(AbstractC8660d abstractC8660d, int i10, int i11) {
        this.f41961e = abstractC8660d;
        this.f41959c = i10;
        this.f41960d = i11;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: b */
    public final Object[] mo15994b() {
        return this.f41961e.mo15994b();
    }

    @Override // yh.AbstractC8657a
    /* renamed from: c */
    public final int mo15995c() {
        return this.f41961e.mo15996e() + this.f41959c + this.f41960d;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: e */
    public final int mo15996e() {
        return this.f41961e.mo15996e() + this.f41959c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s7.m11859b(i10, this.f41960d);
        return this.f41961e.get(i10 + this.f41959c);
    }

    @Override // yh.AbstractC8660d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yh.AbstractC8660d, java.util.List
    /* renamed from: k */
    public final AbstractC8660d subList(int i10, int i11) {
        s7.m11861d(i10, i11, this.f41960d);
        int i12 = this.f41959c;
        return this.f41961e.subList(i10 + i12, i11 + i12);
    }

    @Override // yh.AbstractC8660d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41960d;
    }

    @Override // yh.AbstractC8660d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
