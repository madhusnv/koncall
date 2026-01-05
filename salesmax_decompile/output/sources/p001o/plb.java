package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.q74;

/* loaded from: classes2.dex */
public interface plb extends q74.InterfaceC16311b {

    /* renamed from: u */
    public static final C16136b f40230u = C16136b.f40231a;

    /* renamed from: o.plb$a */
    public static final class C16135a {
        /* renamed from: a */
        public static Object m43844a(plb plbVar, Object obj, nl7 nl7Var) {
            sq8.m48649h(nl7Var, "operation");
            return q74.InterfaceC16311b.a.m44920a(plbVar, obj, nl7Var);
        }

        /* renamed from: b */
        public static q74.InterfaceC16311b m43845b(plb plbVar, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            return q74.InterfaceC16311b.a.m44921b(plbVar, interfaceC16312c);
        }

        /* renamed from: c */
        public static q74 m43846c(plb plbVar, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            return q74.InterfaceC16311b.a.m44922c(plbVar, interfaceC16312c);
        }

        /* renamed from: d */
        public static q74 m43847d(plb plbVar, q74 q74Var) {
            sq8.m48649h(q74Var, "context");
            return q74.InterfaceC16311b.a.m44923d(plbVar, q74Var);
        }
    }

    /* renamed from: o.plb$b */
    public static final class C16136b implements q74.InterfaceC16312c {

        /* renamed from: a */
        public static final /* synthetic */ C16136b f40231a = new C16136b();
    }

    @Override // p001o.q74.InterfaceC16311b
    default q74.InterfaceC16312c getKey() {
        return f40230u;
    }

    /* renamed from: h */
    Object mo29725h(xk7 xk7Var, n64 n64Var);
}
