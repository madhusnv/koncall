package og;

import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.x */
/* loaded from: classes.dex */
public final class C5383x extends AbstractC5373n implements Serializable {

    /* renamed from: a */
    public final Object f26931a;

    /* renamed from: b */
    public final Object f26932b;

    public C5383x(Object obj, Object obj2) {
        this.f26931a = obj;
        this.f26932b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26931a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26932b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
