package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class iac implements ov5 {

    /* renamed from: c */
    public final b18 f28336c;

    /* renamed from: o.iac$a */
    public static final class C14229a extends jgg implements nl7 {

        /* renamed from: a */
        public int f28337a;

        /* renamed from: c */
        public final /* synthetic */ String f28339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14229a(String str, n64 n64Var) {
            super(2, n64Var);
            this.f28339c = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return iac.this.new C14229a(this.f28339c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f28337a;
            if (i == 0) {
                wre.m54934b(obj);
                b18 b18Var = iac.this.f28336c;
                String str = this.f28339c;
                this.f28337a = 1;
                obj = b18Var.mo18087a(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ie5.m31992b((z08) it.next()));
            }
            return arrayList;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14229a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public iac(b18 b18Var) {
        sq8.m48649h(b18Var, "hr");
        this.f28336c = b18Var;
    }

    @Override // p001o.ov5
    public List lookup(String str) {
        sq8.m48649h(str, "hostname");
        return (List) qm1.m45641b(null, new C14229a(str, null), 1, null);
    }
}
