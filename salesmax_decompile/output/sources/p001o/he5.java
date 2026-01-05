package p001o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class he5 implements b18 {

    /* renamed from: b */
    public static final he5 f26730b = new he5();

    /* renamed from: o.he5$a */
    public static final class C13924a extends jgg implements nl7 {

        /* renamed from: a */
        public int f26731a;

        /* renamed from: b */
        public final /* synthetic */ String f26732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13924a(String str, n64 n64Var) {
            super(2, n64Var);
            this.f26732b = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13924a(this.f26732b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws UnknownHostException {
            uq8.m51918f();
            if (this.f26731a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            InetAddress[] allByName = InetAddress.getAllByName(this.f26732b);
            sq8.m48648g(allByName, "getAllByName(...)");
            ArrayList arrayList = new ArrayList(allByName.length);
            for (InetAddress inetAddress : allByName) {
                sq8.m48646e(inetAddress);
                arrayList.add(ie5.m31991a(inetAddress));
            }
            return arrayList;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13924a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // p001o.b18
    /* renamed from: a */
    public Object mo18087a(String str, n64 n64Var) {
        return pm1.m43867g(eu5.m25611b(), new C13924a(str, null), n64Var);
    }

    @Override // p001o.b18
    /* renamed from: b */
    public void mo18088b(z08 z08Var) {
        sq8.m48649h(z08Var, "addr");
    }
}
