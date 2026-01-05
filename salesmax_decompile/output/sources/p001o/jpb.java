package p001o;

import p001o.wb9;

/* loaded from: classes2.dex */
public final class jpb extends lra implements wb9.InterfaceC17813a {

    /* renamed from: c */
    public final w4d f30910c;

    /* renamed from: d */
    public Object f30911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(w4d w4dVar, Object obj, Object obj2) {
        super(obj, obj2);
        sq8.m48649h(w4dVar, "parentIterator");
        this.f30910c = w4dVar;
        this.f30911d = obj2;
    }

    /* renamed from: a */
    public void m34211a(Object obj) {
        this.f30911d = obj;
    }

    @Override // p001o.lra, java.util.Map.Entry
    public Object getValue() {
        return this.f30911d;
    }

    @Override // p001o.lra, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        m34211a(obj);
        this.f30910c.m53930e(getKey(), obj);
        return value;
    }
}
