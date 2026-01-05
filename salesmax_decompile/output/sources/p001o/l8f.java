package p001o;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.bff;
import p001o.udd;

/* loaded from: classes6.dex */
public final class l8f extends e9 {

    /* renamed from: a */
    public final ob9 f33454a;

    /* renamed from: b */
    public List f33455b;

    /* renamed from: c */
    public final gi9 f33456c;

    /* renamed from: d */
    public final Map f33457d;

    /* renamed from: e */
    public final Map f33458e;

    /* renamed from: o.l8f$a */
    public static final class C15034a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ String f33459a;

        /* renamed from: b */
        public final /* synthetic */ l8f f33460b;

        /* renamed from: o.l8f$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ l8f f33461a;

            /* renamed from: o.l8f$a$a$a, reason: collision with other inner class name */
            public static final class C19592a extends kf9 implements xk7 {

                /* renamed from: a */
                public final /* synthetic */ l8f f33462a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19592a(l8f l8fVar) {
                    super(1);
                    this.f33462a = l8fVar;
                }

                /* renamed from: a */
                public final void m36751a(ga3 ga3Var) {
                    sq8.m48649h(ga3Var, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : this.f33462a.f33458e.entrySet()) {
                        ga3.m28277b(ga3Var, (String) entry.getKey(), ((dc9) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // p001o.xk7
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m36751a((ga3) obj);
                    return y3i.f54824a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l8f l8fVar) {
                super(1);
                this.f33461a = l8fVar;
            }

            /* renamed from: a */
            public final void m36750a(ga3 ga3Var) {
                sq8.m48649h(ga3Var, "$this$buildSerialDescriptor");
                ga3.m28277b(ga3Var, "type", sm1.m48531z(h8g.f26398a).getDescriptor(), null, false, 12, null);
                ga3.m28277b(ga3Var, "value", yef.m57705b("kotlinx.serialization.Sealed<" + this.f33461a.mo24529e().mo26337d() + '>', bff.C12372a.f16098a, new uef[0], new C19592a(this.f33461a)), null, false, 12, null);
                ga3Var.m28284h(this.f33461a.f33455b);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m36750a((ga3) obj);
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15034a(String str, l8f l8fVar) {
            super(0);
            this.f33459a = str;
            this.f33460b = l8fVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef invoke() {
            return yef.m57705b(this.f33459a, udd.C17355b.f48745a, new uef[0], new a(this.f33460b));
        }
    }

    /* renamed from: o.l8f$b */
    public static final class C15035b implements nv7 {

        /* renamed from: a */
        public final /* synthetic */ Iterable f33463a;

        public C15035b(Iterable iterable) {
            this.f33463a = iterable;
        }

        @Override // p001o.nv7
        /* renamed from: a */
        public Object mo36752a(Object obj) {
            return ((dc9) ((Map.Entry) obj).getValue()).getDescriptor().mo16766h();
        }

        @Override // p001o.nv7
        /* renamed from: b */
        public Iterator mo36753b() {
            return this.f33463a.iterator();
        }
    }

    public l8f(String str, ob9 ob9Var, ob9[] ob9VarArr, dc9[] dc9VarArr) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(ob9VarArr, "subclasses");
        sq8.m48649h(dc9VarArr, "subclassSerializers");
        this.f33454a = ob9Var;
        this.f33455b = ch3.m21246k();
        this.f33456c = si9.m48361b(cj9.PUBLICATION, new C15034a(str, this));
        if (ob9VarArr.length != dc9VarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + mo24529e().mo26337d() + " should be marked @Serializable");
        }
        Map mapM32691r = isa.m32691r(gp0.M0(ob9VarArr, dc9VarArr));
        this.f33457d = mapM32691r;
        C15035b c15035b = new C15035b(mapM32691r.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itMo36753b = c15035b.mo36753b();
        while (itMo36753b.hasNext()) {
            Object next = itMo36753b.next();
            Object objMo36752a = c15035b.mo36752a(next);
            Object obj = linkedHashMap.get(objMo36752a);
            if (obj == null) {
                linkedHashMap.containsKey(objMo36752a);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objMo36752a;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + mo24529e() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objMo36752a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(hsa.m31055e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (dc9) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f33458e = linkedHashMap2;
    }

    @Override // p001o.e9
    /* renamed from: c */
    public bn5 mo24527c(jo3 jo3Var, String str) {
        sq8.m48649h(jo3Var, "decoder");
        dc9 dc9Var = (dc9) this.f33458e.get(str);
        return dc9Var != null ? dc9Var : super.mo24527c(jo3Var, str);
    }

    @Override // p001o.e9
    /* renamed from: d */
    public iff mo24528d(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(obj, "value");
        iff iffVarMo24528d = (dc9) this.f33457d.get(kge.m35689b(obj.getClass()));
        if (iffVarMo24528d == null) {
            iffVarMo24528d = super.mo24528d(h76Var, obj);
        }
        if (iffVarMo24528d != null) {
            return iffVarMo24528d;
        }
        return null;
    }

    @Override // p001o.e9
    /* renamed from: e */
    public ob9 mo24529e() {
        return this.f33454a;
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return (uef) this.f33456c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l8f(String str, ob9 ob9Var, ob9[] ob9VarArr, dc9[] dc9VarArr, Annotation[] annotationArr) {
        this(str, ob9Var, ob9VarArr, dc9VarArr);
        sq8.m48649h(str, "serialName");
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(ob9VarArr, "subclasses");
        sq8.m48649h(dc9VarArr, "subclassSerializers");
        sq8.m48649h(annotationArr, "classAnnotations");
        this.f33455b = fp0.m27255d(annotationArr);
    }
}
