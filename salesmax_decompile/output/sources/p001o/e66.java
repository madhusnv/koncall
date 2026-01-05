package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Serializable;
import p001o.q74;

/* loaded from: classes6.dex */
public final class e66 implements q74, Serializable {

    /* renamed from: a */
    public static final e66 f21035a = new e66();

    private final Object readResolve() {
        return f21035a;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        sq8.m48649h(nl7Var, "operation");
        return obj;
    }

    @Override // p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        return this;
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        sq8.m48649h(q74Var, "context");
        return q74Var;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
