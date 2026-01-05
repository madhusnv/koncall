package p001o;

import java.util.List;
import p001o.bff;
import p001o.udd;

/* loaded from: classes6.dex */
public final class wdd extends e9 {

    /* renamed from: a */
    public final ob9 f51815a;

    /* renamed from: b */
    public List f51816b;

    /* renamed from: c */
    public final gi9 f51817c;

    /* renamed from: o.wdd$a */
    public static final class C17822a extends kf9 implements uk7 {

        /* renamed from: o.wdd$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ wdd f51819a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wdd wddVar) {
                super(1);
                this.f51819a = wddVar;
            }

            /* renamed from: a */
            public final void m54241a(ga3 ga3Var) {
                sq8.m48649h(ga3Var, "$this$buildSerialDescriptor");
                ga3.m28277b(ga3Var, "type", sm1.m48531z(h8g.f26398a).getDescriptor(), null, false, 12, null);
                ga3.m28277b(ga3Var, "value", yef.m57706c("kotlinx.serialization.Polymorphic<" + this.f51819a.mo24529e().mo26337d() + '>', bff.C12372a.f16098a, new uef[0], null, 8, null), null, false, 12, null);
                ga3Var.m28284h(this.f51819a.f51816b);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m54241a((ga3) obj);
                return y3i.f54824a;
            }
        }

        public C17822a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef invoke() {
            return a64.m16513c(yef.m57705b("kotlinx.serialization.Polymorphic", udd.C17354a.f48744a, new uef[0], new a(wdd.this)), wdd.this.mo24529e());
        }
    }

    public wdd(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "baseClass");
        this.f51815a = ob9Var;
        this.f51816b = ch3.m21246k();
        this.f51817c = si9.m48361b(cj9.PUBLICATION, new C17822a());
    }

    @Override // p001o.e9
    /* renamed from: e */
    public ob9 mo24529e() {
        return this.f51815a;
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return (uef) this.f51817c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo24529e() + ')';
    }
}
