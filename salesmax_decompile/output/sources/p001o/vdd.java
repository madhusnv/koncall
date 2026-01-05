package p001o;

import com.apollographql.apollo.api.ResponseField;
import java.lang.annotation.Annotation;
import p001o.bff;

/* loaded from: classes6.dex */
public abstract class vdd {

    /* renamed from: o.vdd$a */
    public /* synthetic */ class C17551a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50158a;

        static {
            int[] iArr = new int[ea3.values().length];
            try {
                iArr[ea3.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ea3.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ea3.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50158a = iArr;
        }
    }

    /* renamed from: b */
    public static final void m52590b(bff bffVar) {
        sq8.m48649h(bffVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        if (bffVar instanceof bff.C12373b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (bffVar instanceof vhd) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (bffVar instanceof udd) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    /* renamed from: c */
    public static final String m52591c(uef uefVar, p79 p79Var) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        for (Annotation annotation : uefVar.getAnnotations()) {
            if (annotation instanceof t79) {
                return ((t79) annotation).discriminator();
            }
        }
        return p79Var.m43087d().m51127d();
    }

    /* renamed from: d */
    public static final Object m52592d(b89 b89Var, bn5 bn5Var) {
        ea9 ea9VarM36743h;
        sq8.m48649h(b89Var, "<this>");
        sq8.m48649h(bn5Var, "deserializer");
        if (!(bn5Var instanceof e9) || b89Var.mo18278d().m43087d().m51138o()) {
            return bn5Var.deserialize(b89Var);
        }
        String strM52591c = m52591c(bn5Var.getDescriptor(), b89Var.mo18278d());
        k89 k89VarMo18279f = b89Var.mo18279f();
        uef descriptor = bn5Var.getDescriptor();
        if (!(k89VarMo18279f instanceof z99)) {
            throw w89.m54056d(-1, "Expected " + kge.m35689b(z99.class) + " as the serialized body of " + descriptor.mo16766h() + ", but had " + kge.m35689b(k89VarMo18279f.getClass()));
        }
        z99 z99Var = (z99) k89VarMo18279f;
        k89 k89Var = (k89) z99Var.get(strM52591c);
        try {
            bn5 bn5VarM56096a = xdd.m56096a((e9) bn5Var, b89Var, (k89Var == null || (ea9VarM36743h = l89.m36743h(k89Var)) == null) ? null : l89.m36739d(ea9VarM36743h));
            sq8.m48647f(bn5VarM56096a, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return kxh.m36298a(b89Var.mo18278d(), strM52591c, z99Var, bn5VarM56096a);
        } catch (gff e) {
            String message = e.getMessage();
            sq8.m48646e(message);
            throw w89.m54057e(-1, message, z99Var.toString());
        }
    }

    /* renamed from: e */
    public static final void m52593e(iff iffVar, iff iffVar2, String str) {
        if ((iffVar instanceof l8f) && e99.m24533a(iffVar2.getDescriptor()).contains(str)) {
            String strMo16766h = iffVar.getDescriptor().mo16766h();
            throw new IllegalStateException(("Sealed class '" + iffVar2.getDescriptor().mo16766h() + "' cannot be serialized as base class '" + strMo16766h + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
