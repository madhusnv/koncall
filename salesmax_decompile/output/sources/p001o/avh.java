package p001o;

import androidx.lifecycle.AbstractC2145n;

/* loaded from: classes2.dex */
public abstract class avh {

    /* renamed from: o.avh$a */
    public static final class C12257a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ z9b f15289a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f15290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12257a(z9b z9bVar, xk7 xk7Var) {
            super(1);
            this.f15289a = z9bVar;
            this.f15290b = xk7Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m68983invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68983invoke(Object obj) {
            this.f15289a.setValue(this.f15290b.invoke(obj));
        }
    }

    /* renamed from: o.avh$b */
    public static final class C12258b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ z9b f15291a;

        /* renamed from: b */
        public final /* synthetic */ zl7 f15292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12258b(z9b z9bVar, zl7 zl7Var) {
            super(1);
            this.f15291a = z9bVar;
            this.f15292b = zl7Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m68984invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68984invoke(Object obj) {
            this.f15291a.setValue(this.f15292b.apply(obj));
        }
    }

    /* renamed from: o.avh$c */
    public static final class C12259c implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f15293a;

        public C12259c(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f15293a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f15293a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f15293a.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final AbstractC2145n m17882a(AbstractC2145n abstractC2145n, xk7 xk7Var) {
        sq8.m48649h(abstractC2145n, "<this>");
        sq8.m48649h(xk7Var, "transform");
        z9b z9bVar = abstractC2145n.isInitialized() ? new z9b(xk7Var.invoke(abstractC2145n.getValue())) : new z9b();
        z9bVar.addSource(abstractC2145n, new C12259c(new C12257a(z9bVar, xk7Var)));
        return z9bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC2145n m17883b(AbstractC2145n abstractC2145n, zl7 zl7Var) {
        sq8.m48649h(abstractC2145n, "<this>");
        sq8.m48649h(zl7Var, "mapFunction");
        z9b z9bVar = new z9b();
        z9bVar.addSource(abstractC2145n, new C12259c(new C12258b(z9bVar, zl7Var)));
        return z9bVar;
    }
}
