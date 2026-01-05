package p001o;

import p001o.ac9;
import p001o.cc9;

/* loaded from: classes6.dex */
public abstract class vrd extends xrd implements cc9 {
    public vrd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // p001o.y22
    public nb9 computeReflected() {
        return kge.m35693f(this);
    }

    @Override // p001o.cc9
    public Object getDelegate(Object obj) {
        return ((cc9) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ ac9.InterfaceC12137a getGetter() {
        mo69031getGetter();
        return null;
    }

    @Override // p001o.xk7
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p001o.cc9
    /* renamed from: getGetter */
    public cc9.InterfaceC12633a mo69031getGetter() {
        ((cc9) getReflected()).mo69031getGetter();
        return null;
    }
}
