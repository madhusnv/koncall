package q2;

import e1.h0;
import java.util.Iterator;
import n2.InterfaceC4946e;
import p2.C5790b;
import r2.C6443b;
import rw.AbstractC6659i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q2.b */
/* loaded from: classes.dex */
public final class C6100b extends AbstractC6659i implements InterfaceC4946e {

    /* renamed from: d */
    public static final C6100b f29795d;

    /* renamed from: a */
    public final Object f29796a;

    /* renamed from: b */
    public final Object f29797b;

    /* renamed from: c */
    public final C5790b f29798c;

    static {
        C6443b c6443b = C6443b.f31098a;
        f29795d = new C6100b(c6443b, c6443b, C5790b.f28376c);
    }

    public C6100b(Object obj, Object obj2, C5790b c5790b) {
        this.f29796a = obj;
        this.f29797b = obj2;
        this.f29798c = c5790b;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        C5790b c5790b = this.f29798c;
        c5790b.getClass();
        return c5790b.f28378b;
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f29798c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h0(this.f29798c, this.f29796a);
    }
}
