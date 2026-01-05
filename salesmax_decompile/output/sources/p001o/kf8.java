package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class kf8 extends o8 implements Serializable {

    /* renamed from: a */
    public final Object f32142a;

    /* renamed from: b */
    public final Object f32143b;

    public kf8(Object obj, Object obj2) {
        this.f32142a = obj;
        this.f32143b = obj2;
    }

    @Override // p001o.o8, java.util.Map.Entry
    public final Object getKey() {
        return this.f32142a;
    }

    @Override // p001o.o8, java.util.Map.Entry
    public final Object getValue() {
        return this.f32143b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
