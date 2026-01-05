package p001o;

import p001o.fkh;
import p001o.q74;

/* loaded from: classes6.dex */
public final class okh implements fkh {

    /* renamed from: a */
    public final Object f38514a;

    /* renamed from: b */
    public final ThreadLocal f38515b;

    /* renamed from: c */
    public final q74.InterfaceC16312c f38516c;

    public okh(Object obj, ThreadLocal threadLocal) {
        this.f38514a = obj;
        this.f38515b = threadLocal;
        this.f38516c = new qkh(threadLocal);
    }

    @Override // p001o.fkh
    /* renamed from: H */
    public void mo26969H(q74 q74Var, Object obj) {
        this.f38515b.set(obj);
    }

    @Override // p001o.fkh
    public Object f0(q74 q74Var) {
        Object obj = this.f38515b.get();
        this.f38515b.set(this.f38514a);
        return obj;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return fkh.C13475a.m26970a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        if (!sq8.m48644c(getKey(), interfaceC16312c)) {
            return null;
        }
        sq8.m48647f(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // p001o.q74.InterfaceC16311b
    public q74.InterfaceC16312c getKey() {
        return this.f38516c;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return sq8.m48644c(getKey(), interfaceC16312c) ? e66.f21035a : this;
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return fkh.C13475a.m26971b(this, q74Var);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f38514a + ", threadLocal = " + this.f38515b + ')';
    }
}
