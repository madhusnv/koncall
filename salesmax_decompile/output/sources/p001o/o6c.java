package p001o;

import java.lang.annotation.Annotation;
import java.util.List;
import p001o.p9g;

/* loaded from: classes6.dex */
public final class o6c implements dc9 {

    /* renamed from: a */
    public final Object f37829a;

    /* renamed from: b */
    public List f37830b;

    /* renamed from: c */
    public final gi9 f37831c;

    /* renamed from: o.o6c$a */
    public static final class C15719a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ String f37832a;

        /* renamed from: b */
        public final /* synthetic */ o6c f37833b;

        /* renamed from: o.o6c$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ o6c f37834a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o6c o6cVar) {
                super(1);
                this.f37834a = o6cVar;
            }

            /* renamed from: a */
            public final void m41645a(ga3 ga3Var) {
                sq8.m48649h(ga3Var, "$this$buildSerialDescriptor");
                ga3Var.m28284h(this.f37834a.f37830b);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m41645a((ga3) obj);
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15719a(String str, o6c o6cVar) {
            super(0);
            this.f37832a = str;
            this.f37833b = o6cVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef invoke() {
            return yef.m57705b(this.f37832a, p9g.C16040d.f39684a, new uef[0], new a(this.f37833b));
        }
    }

    public o6c(String str, Object obj) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(obj, "objectInstance");
        this.f37829a = obj;
        this.f37830b = ch3.m21246k();
        this.f37831c = si9.m48361b(cj9.PUBLICATION, new C15719a(str, this));
    }

    @Override // p001o.bn5
    public Object deserialize(w75 w75Var) {
        int iMo16814k;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor);
        if (jo3VarMo20420b.mo17245n() || (iMo16814k = jo3VarMo20420b.mo16814k(getDescriptor())) == -1) {
            y3i y3iVar = y3i.f54824a;
            jo3VarMo20420b.mo18548c(descriptor);
            return this.f37829a;
        }
        throw new gff("Unexpected index " + iMo16814k);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return (uef) this.f37831c.getValue();
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(obj, "value");
        h76Var.mo29876b(getDescriptor()).mo37560c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o6c(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        sq8.m48649h(str, "serialName");
        sq8.m48649h(obj, "objectInstance");
        sq8.m48649h(annotationArr, "classAnnotations");
        this.f37830b = fp0.m27255d(annotationArr);
    }
}
