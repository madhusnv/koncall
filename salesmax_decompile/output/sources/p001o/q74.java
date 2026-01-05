package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.p64;

/* loaded from: classes6.dex */
public interface q74 {

    /* renamed from: o.q74$a */
    public static final class C16310a {

        /* renamed from: o.q74$a$a */
        public static final class a extends kf9 implements nl7 {

            /* renamed from: a */
            public static final a f41422a = new a();

            public a() {
                super(2);
            }

            @Override // p001o.nl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q74 invoke(q74 q74Var, InterfaceC16311b interfaceC16311b) {
                pi3 pi3Var;
                sq8.m48649h(q74Var, "acc");
                sq8.m48649h(interfaceC16311b, "element");
                q74 q74VarMinusKey = q74Var.minusKey(interfaceC16311b.getKey());
                e66 e66Var = e66.f21035a;
                if (q74VarMinusKey == e66Var) {
                    return interfaceC16311b;
                }
                p64.C15962b c15962b = p64.f39391p;
                p64 p64Var = (p64) q74VarMinusKey.get(c15962b);
                if (p64Var == null) {
                    pi3Var = new pi3(q74VarMinusKey, interfaceC16311b);
                } else {
                    q74 q74VarMinusKey2 = q74VarMinusKey.minusKey(c15962b);
                    if (q74VarMinusKey2 == e66Var) {
                        return new pi3(interfaceC16311b, p64Var);
                    }
                    pi3Var = new pi3(new pi3(q74VarMinusKey2, interfaceC16311b), p64Var);
                }
                return pi3Var;
            }
        }

        /* renamed from: a */
        public static q74 m44918a(q74 q74Var, q74 q74Var2) {
            sq8.m48649h(q74Var2, "context");
            return q74Var2 == e66.f21035a ? q74Var : (q74) q74Var2.fold(q74Var, a.f41422a);
        }
    }

    /* renamed from: o.q74$b */
    public interface InterfaceC16311b extends q74 {

        /* renamed from: o.q74$b$a */
        public static final class a {
            /* renamed from: a */
            public static Object m44920a(InterfaceC16311b interfaceC16311b, Object obj, nl7 nl7Var) {
                sq8.m48649h(nl7Var, "operation");
                return nl7Var.invoke(obj, interfaceC16311b);
            }

            /* renamed from: b */
            public static InterfaceC16311b m44921b(InterfaceC16311b interfaceC16311b, InterfaceC16312c interfaceC16312c) {
                sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
                if (!sq8.m48644c(interfaceC16311b.getKey(), interfaceC16312c)) {
                    return null;
                }
                sq8.m48647f(interfaceC16311b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return interfaceC16311b;
            }

            /* renamed from: c */
            public static q74 m44922c(InterfaceC16311b interfaceC16311b, InterfaceC16312c interfaceC16312c) {
                sq8.m48649h(interfaceC16312c, TransferTable.COLUMN_KEY);
                return sq8.m48644c(interfaceC16311b.getKey(), interfaceC16312c) ? e66.f21035a : interfaceC16311b;
            }

            /* renamed from: d */
            public static q74 m44923d(InterfaceC16311b interfaceC16311b, q74 q74Var) {
                sq8.m48649h(q74Var, "context");
                return C16310a.m44918a(interfaceC16311b, q74Var);
            }
        }

        @Override // p001o.q74
        InterfaceC16311b get(InterfaceC16312c interfaceC16312c);

        InterfaceC16312c getKey();
    }

    /* renamed from: o.q74$c */
    public interface InterfaceC16312c {
    }

    Object fold(Object obj, nl7 nl7Var);

    InterfaceC16311b get(InterfaceC16312c interfaceC16312c);

    q74 minusKey(InterfaceC16312c interfaceC16312c);

    q74 plus(q74 q74Var);
}
