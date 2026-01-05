package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public final class tx5 implements q74 {

    /* renamed from: a */
    public final /* synthetic */ q74 f47997a;

    /* renamed from: b */
    public final Throwable f47998b;

    public tx5(Throwable th, q74 q74Var) {
        this.f47997a = q74Var;
        this.f47998b = th;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return this.f47997a.fold(obj, nl7Var);
    }

    @Override // p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return this.f47997a.get(interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return this.f47997a.minusKey(interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return this.f47997a.plus(q74Var);
    }
}
