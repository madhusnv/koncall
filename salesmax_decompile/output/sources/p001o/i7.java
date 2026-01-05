package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.q74;

/* loaded from: classes6.dex */
public abstract class i7 implements q74.InterfaceC16311b {

    /* renamed from: a */
    public final q74.InterfaceC16312c f28168a;

    public i7(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        this.f28168a = interfaceC16312c;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return q74.InterfaceC16311b.a.m44920a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return q74.InterfaceC16311b.a.m44921b(this, interfaceC16312c);
    }

    @Override // p001o.q74.InterfaceC16311b
    public q74.InterfaceC16312c getKey() {
        return this.f28168a;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return q74.InterfaceC16311b.a.m44922c(this, interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return q74.InterfaceC16311b.a.m44923d(this, q74Var);
    }
}
