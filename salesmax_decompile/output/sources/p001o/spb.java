package p001o;

import p001o.ac9;
import p001o.cc9;
import p001o.yb9;

/* loaded from: classes6.dex */
public abstract class spb extends upb implements yb9 {
    public spb(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // p001o.y22
    public nb9 computeReflected() {
        return kge.m35691d(this);
    }

    @Override // p001o.cc9
    public Object getDelegate(Object obj) {
        return ((yb9) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ ac9.InterfaceC12137a getGetter() {
        mo69031getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ xb9 getSetter() {
        mo69032getSetter();
        return null;
    }

    @Override // p001o.xk7
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p001o.cc9
    /* renamed from: getGetter, reason: collision with other method in class */
    public cc9.InterfaceC12633a mo69031getGetter() {
        ((yb9) getReflected()).mo69031getGetter();
        return null;
    }

    @Override // p001o.yb9
    /* renamed from: getSetter, reason: collision with other method in class */
    public yb9.InterfaceC18371a mo69032getSetter() {
        ((yb9) getReflected()).mo69032getSetter();
        return null;
    }
}
