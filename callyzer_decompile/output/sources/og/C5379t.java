package og;

import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.t */
/* loaded from: classes.dex */
public final class C5379t extends AbstractC5373n {

    /* renamed from: a */
    public final Object f26806a;

    /* renamed from: b */
    public int f26807b;

    /* renamed from: c */
    public final /* synthetic */ C5381v f26808c;

    public C5379t(C5381v c5381v, int i10) {
        this.f26808c = c5381v;
        Object obj = C5381v.f26832k;
        this.f26806a = c5381v.m10999d()[i10];
        this.f26807b = i10;
    }

    /* renamed from: a */
    public final void m10917a() {
        int i10 = this.f26807b;
        Object obj = this.f26806a;
        C5381v c5381v = this.f26808c;
        if (i10 != -1 && i10 < c5381v.size()) {
            if (pa.m10818e(obj, c5381v.m10999d()[this.f26807b])) {
                return;
            }
        }
        Object obj2 = C5381v.f26832k;
        this.f26807b = c5381v.m11005n(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26806a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C5381v c5381v = this.f26808c;
        Map mapM11001h = c5381v.m11001h();
        if (mapM11001h != null) {
            return mapM11001h.get(this.f26806a);
        }
        m10917a();
        int i10 = this.f26807b;
        if (i10 == -1) {
            return null;
        }
        return c5381v.m11000f()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C5381v c5381v = this.f26808c;
        Map mapM11001h = c5381v.m11001h();
        Object obj2 = this.f26806a;
        if (mapM11001h != null) {
            return mapM11001h.put(obj2, obj);
        }
        m10917a();
        int i10 = this.f26807b;
        if (i10 == -1) {
            c5381v.put(obj2, obj);
            return null;
        }
        Object obj3 = c5381v.m11000f()[i10];
        c5381v.m11000f()[this.f26807b] = obj;
        return obj3;
    }
}
