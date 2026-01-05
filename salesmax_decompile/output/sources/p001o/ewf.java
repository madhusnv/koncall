package p001o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ewf implements ep3, Iterable, sb9 {

    /* renamed from: a */
    public final dwf f22253a;

    /* renamed from: b */
    public final int f22254b;

    /* renamed from: c */
    public final int f22255c;

    public ewf(dwf dwfVar, int i, int i2) {
        sq8.m48649h(dwfVar, "table");
        this.f22253a = dwfVar;
        this.f22254b = i;
        this.f22255c = i2;
    }

    /* renamed from: d */
    public final void m25665d() {
        if (this.f22253a.m23914y() != this.f22255c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        m25665d();
        dwf dwfVar = this.f22253a;
        int i = this.f22254b;
        return new kv7(dwfVar, i + 1, i + fwf.m27614G(dwfVar.m23910p(), this.f22254b));
    }
}
