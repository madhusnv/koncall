package s2;

import k2.k2;
import k2.l1;
import p2.C5792d;
import p2.C5799k;
import r2.C6443b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.f */
/* loaded from: classes.dex */
public final class C6737f extends C5792d {

    /* renamed from: g */
    public C6738g f32178g;

    @Override // p2.C5792d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof l1) {
            return super.containsKey((l1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof k2) {
            return super.containsValue((k2) obj);
        }
        return false;
    }

    @Override // p2.C5792d, n2.InterfaceC4944c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C6738g build() {
        C5799k c5799k = this.f28384c;
        C6738g c6738g = this.f32178g;
        if (c5799k != c6738g.f28377a) {
            this.f28383b = new C6443b();
            c6738g = new C6738g(this.f28384c, size());
        }
        this.f32178g = c6738g;
        return c6738g;
    }

    @Override // p2.C5792d, java.util.AbstractMap, java.util.Map
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

    @Override // p2.C5792d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof l1) {
            return (k2) super.remove((l1) obj);
        }
        return null;
    }
}
