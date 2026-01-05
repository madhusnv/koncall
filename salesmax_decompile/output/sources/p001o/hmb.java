package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.q74;

/* loaded from: classes2.dex */
public interface hmb extends q74.InterfaceC16311b {

    /* renamed from: v */
    public static final C14002b f27170v = C14002b.f27171a;

    /* renamed from: o.hmb$a */
    public static final class C14001a {
        /* renamed from: a */
        public static Object m30814a(hmb hmbVar, Object obj, nl7 nl7Var) {
            sq8.m48649h(nl7Var, "operation");
            return q74.InterfaceC16311b.a.m44920a(hmbVar, obj, nl7Var);
        }

        /* renamed from: b */
        public static q74.InterfaceC16311b m30815b(hmb hmbVar, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            return q74.InterfaceC16311b.a.m44921b(hmbVar, interfaceC16312c);
        }

        /* renamed from: c */
        public static q74 m30816c(hmb hmbVar, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            return q74.InterfaceC16311b.a.m44922c(hmbVar, interfaceC16312c);
        }

        /* renamed from: d */
        public static q74 m30817d(hmb hmbVar, q74 q74Var) {
            sq8.m48649h(q74Var, "context");
            return q74.InterfaceC16311b.a.m44923d(hmbVar, q74Var);
        }
    }

    /* renamed from: o.hmb$b */
    public static final class C14002b implements q74.InterfaceC16312c {

        /* renamed from: a */
        public static final /* synthetic */ C14002b f27171a = new C14002b();
    }

    @Override // p001o.q74.InterfaceC16311b
    default q74.InterfaceC16312c getKey() {
        return f27170v;
    }
}
