package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.q74;

/* loaded from: classes6.dex */
public interface p64 extends q74.InterfaceC16311b {

    /* renamed from: p */
    public static final C15962b f39391p = C15962b.f39392a;

    /* renamed from: o.p64$a */
    public static final class C15961a {
        /* renamed from: a */
        public static q74.InterfaceC16311b m42996a(p64 p64Var, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            if (!(interfaceC16312c instanceof j7)) {
                if (p64.f39391p != interfaceC16312c) {
                    return null;
                }
                sq8.m48647f(p64Var, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return p64Var;
            }
            j7 j7Var = (j7) interfaceC16312c;
            if (!j7Var.m33318a(p64Var.getKey())) {
                return null;
            }
            q74.InterfaceC16311b interfaceC16311bM33319b = j7Var.m33319b(p64Var);
            if (interfaceC16311bM33319b instanceof q74.InterfaceC16311b) {
                return interfaceC16311bM33319b;
            }
            return null;
        }

        /* renamed from: b */
        public static q74 m42997b(p64 p64Var, q74.InterfaceC16312c interfaceC16312c) {
            sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
            if (!(interfaceC16312c instanceof j7)) {
                return p64.f39391p == interfaceC16312c ? e66.f21035a : p64Var;
            }
            j7 j7Var = (j7) interfaceC16312c;
            return (!j7Var.m33318a(p64Var.getKey()) || j7Var.m33319b(p64Var) == null) ? p64Var : e66.f21035a;
        }
    }

    /* renamed from: o.p64$b */
    public static final class C15962b implements q74.InterfaceC16312c {

        /* renamed from: a */
        public static final /* synthetic */ C15962b f39392a = new C15962b();
    }

    /* renamed from: O */
    n64 mo42994O(n64 n64Var);

    /* renamed from: o */
    void mo42995o(n64 n64Var);
}
