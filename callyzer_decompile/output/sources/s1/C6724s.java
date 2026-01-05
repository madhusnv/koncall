package s1;

import b2.C0554l;
import java.util.Comparator;
import pg.AbstractC5939t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.s */
/* loaded from: classes.dex */
public final class C6724s implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f32130a;

    /* renamed from: b */
    public final /* synthetic */ C0554l f32131b;

    public /* synthetic */ C6724s(C0554l c0554l, int i10) {
        this.f32130a = i10;
        this.f32131b = c0554l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32130a) {
            case 0:
                Object key = ((InterfaceC6730y) obj).getKey();
                C0554l c0554l = this.f32131b;
                return AbstractC5939t.m11866a(Integer.valueOf(c0554l.m1637f(key)), Integer.valueOf(c0554l.m1637f(((InterfaceC6730y) obj2).getKey())));
            case 1:
                Object key2 = ((InterfaceC6730y) obj).getKey();
                C0554l c0554l2 = this.f32131b;
                return AbstractC5939t.m11866a(Integer.valueOf(c0554l2.m1637f(key2)), Integer.valueOf(c0554l2.m1637f(((InterfaceC6730y) obj2).getKey())));
            case 2:
                Object key3 = ((InterfaceC6730y) obj2).getKey();
                C0554l c0554l3 = this.f32131b;
                return AbstractC5939t.m11866a(Integer.valueOf(c0554l3.m1637f(key3)), Integer.valueOf(c0554l3.m1637f(((InterfaceC6730y) obj).getKey())));
            default:
                Object key4 = ((InterfaceC6730y) obj2).getKey();
                C0554l c0554l4 = this.f32131b;
                return AbstractC5939t.m11866a(Integer.valueOf(c0554l4.m1637f(key4)), Integer.valueOf(c0554l4.m1637f(((InterfaceC6730y) obj).getKey())));
        }
    }
}
