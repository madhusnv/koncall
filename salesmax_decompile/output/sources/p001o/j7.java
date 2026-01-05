package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.q74;

/* loaded from: classes6.dex */
public abstract class j7 implements q74.InterfaceC16312c {

    /* renamed from: a */
    public final xk7 f29871a;

    /* renamed from: b */
    public final q74.InterfaceC16312c f29872b;

    public j7(q74.InterfaceC16312c interfaceC16312c, xk7 xk7Var) {
        sq8.m48649h(interfaceC16312c, "baseKey");
        sq8.m48649h(xk7Var, "safeCast");
        this.f29871a = xk7Var;
        this.f29872b = interfaceC16312c instanceof j7 ? ((j7) interfaceC16312c).f29872b : interfaceC16312c;
    }

    /* renamed from: a */
    public final boolean m33318a(q74.InterfaceC16312c interfaceC16312c) {
        sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
        return interfaceC16312c == this || this.f29872b == interfaceC16312c;
    }

    /* renamed from: b */
    public final q74.InterfaceC16311b m33319b(q74.InterfaceC16311b interfaceC16311b) {
        sq8.m48649h(interfaceC16311b, "element");
        return (q74.InterfaceC16311b) this.f29871a.invoke(interfaceC16311b);
    }
}
