package s2;

import k2.i1;
import k2.k2;
import k2.l1;
import n2.InterfaceC4944c;
import p2.C5790b;
import p2.C5792d;
import p2.C5799k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.g */
/* loaded from: classes.dex */
public final class C6738g extends C5790b implements i1 {

    /* renamed from: d */
    public static final C6738g f32179d = new C6738g(C5799k.f28398e, 0);

    @Override // p2.C5790b
    /* renamed from: b */
    public final C5792d builder() {
        C6737f c6737f = new C6737f(this);
        c6737f.f32178g = this;
        return c6737f;
    }

    @Override // p2.C5790b, n2.InterfaceC4945d
    public final InterfaceC4944c builder() {
        C6737f c6737f = new C6737f(this);
        c6737f.f32178g = this;
        return c6737f;
    }

    @Override // p2.C5790b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof l1) {
            return super.containsKey((l1) obj);
        }
        return false;
    }

    @Override // rw.AbstractC6655e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof k2) {
            return super.containsValue((k2) obj);
        }
        return false;
    }

    @Override // p2.C5790b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof l1) {
            return (k2) super.get((l1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof l1) ? obj2 : (k2) super.getOrDefault((l1) obj, (k2) obj2);
    }
}
