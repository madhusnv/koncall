package p2;

import ee.C2039g;
import n2.InterfaceC4945d;
import q2.C6099a;
import rw.AbstractC6655e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.b */
/* loaded from: classes.dex */
public class C5790b extends AbstractC6655e implements InterfaceC4945d {

    /* renamed from: c */
    public static final C5790b f28376c = new C5790b(C5799k.f28398e, 0);

    /* renamed from: a */
    public final C5799k f28377a;

    /* renamed from: b */
    public final int f28378b;

    public C5790b(C5799k c5799k, int i10) {
        this.f28377a = c5799k;
        this.f28378b = i10;
    }

    @Override // n2.InterfaceC4945d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5792d builder() {
        return new C5792d(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f28377a.m11352d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: d */
    public final C5790b m11341d(Object obj, C6099a c6099a) {
        C2039g c2039gM11368u = this.f28377a.m11368u(obj, obj != null ? obj.hashCode() : 0, c6099a, 0);
        return c2039gM11368u == null ? this : new C5790b((C5799k) c2039gM11368u.f9606c, this.f28378b + c2039gM11368u.f9605b);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f28377a.m11355g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
