package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.ya4;

/* loaded from: classes2.dex */
public final class wob extends ya4 {
    /* JADX WARN: Multi-variable type inference failed */
    public wob() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p001o.ya4
    /* renamed from: a */
    public Object mo54752a(ya4.InterfaceC18362b interfaceC18362b) {
        sq8.m48649h(interfaceC18362b, TransferTable.COLUMN_KEY);
        return m57412b().get(interfaceC18362b);
    }

    /* renamed from: c */
    public final void m54753c(ya4.InterfaceC18362b interfaceC18362b, Object obj) {
        sq8.m48649h(interfaceC18362b, TransferTable.COLUMN_KEY);
        m57412b().put(interfaceC18362b, obj);
    }

    public wob(ya4 ya4Var) {
        sq8.m48649h(ya4Var, "initialExtras");
        m57412b().putAll(ya4Var.m57412b());
    }

    public /* synthetic */ wob(ya4 ya4Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? ya4.C18361a.f55136b : ya4Var);
    }
}
