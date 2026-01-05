package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.q8d;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class oue extends zh9.AbstractC18641f {

    /* renamed from: b */
    public static final oue f38938b = new oue();

    /* renamed from: o.oue$a */
    public static final class C15896a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15896a f38939a = new C15896a();

        public C15896a() {
            super(1);
        }

        /* renamed from: a */
        public final void m42705a(q8d.AbstractC16323a abstractC16323a) {
            sq8.m48649h(abstractC16323a, "$this$layout");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42705a((q8d.AbstractC16323a) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.oue$b */
    public static final class C15897b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ q8d f38940a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15897b(q8d q8dVar) {
            super(1);
            this.f38940a = q8dVar;
        }

        /* renamed from: a */
        public final void m42706a(q8d.AbstractC16323a abstractC16323a) {
            sq8.m48649h(abstractC16323a, "$this$layout");
            q8d.AbstractC16323a.m44991t(abstractC16323a, this.f38940a, 0, 0, 0.0f, null, 12, null);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42706a((q8d.AbstractC16323a) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.oue$c */
    public static final class C15898c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ List f38941a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15898c(List list) {
            super(1);
            this.f38941a = list;
        }

        /* renamed from: a */
        public final void m42707a(q8d.AbstractC16323a abstractC16323a) {
            sq8.m48649h(abstractC16323a, "$this$layout");
            List list = this.f38941a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q8d.AbstractC16323a.m44991t(abstractC16323a, (q8d) list.get(i), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m42707a((q8d.AbstractC16323a) obj);
            return y3i.f54824a;
        }
    }

    public oue() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // p001o.a1b
    /* renamed from: a */
    public b1b mo16327a(c1b c1bVar, List list, long j) {
        sq8.m48649h(c1bVar, "$this$measure");
        sq8.m48649h(list, "measurables");
        if (list.isEmpty()) {
            return c1b.m20067u(c1bVar, bu3.m19800l(j), bu3.m19799k(j), null, C15896a.f38939a, 4, null);
        }
        if (list.size() == 1) {
            q8d q8dVarMo21322w = ((y0b) list.get(0)).mo21322w(j);
            return c1b.m20067u(c1bVar, du3.m23820d(j, q8dVarMo21322w.m44974Q()), du3.m23819c(j, q8dVarMo21322w.m44970L()), null, new C15897b(q8dVarMo21322w), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((y0b) list.get(i)).mo21322w(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            q8d q8dVar = (q8d) arrayList.get(i2);
            iMax = Math.max(q8dVar.m44974Q(), iMax);
            iMax2 = Math.max(q8dVar.m44970L(), iMax2);
        }
        return c1b.m20067u(c1bVar, du3.m23820d(j, iMax), du3.m23819c(j, iMax2), null, new C15898c(arrayList), 4, null);
    }
}
