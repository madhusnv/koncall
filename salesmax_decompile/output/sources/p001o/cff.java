package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class cff extends wff {

    /* renamed from: a */
    public final Map f18037a;

    /* renamed from: b */
    public final Map f18038b;

    /* renamed from: c */
    public final Map f18039c;

    /* renamed from: d */
    public final Map f18040d;

    /* renamed from: e */
    public final Map f18041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cff(Map map, Map map2, Map map3, Map map4, Map map5) {
        super(null);
        sq8.m48649h(map, "class2ContextualFactory");
        sq8.m48649h(map2, "polyBase2Serializers");
        sq8.m48649h(map3, "polyBase2DefaultSerializerProvider");
        sq8.m48649h(map4, "polyBase2NamedSerializers");
        sq8.m48649h(map5, "polyBase2DefaultDeserializerProvider");
        this.f18037a = map;
        this.f18038b = map2;
        this.f18039c = map3;
        this.f18040d = map4;
        this.f18041e = map5;
    }

    @Override // p001o.wff
    /* renamed from: a */
    public void mo21127a(yff yffVar) {
        sq8.m48649h(yffVar, "collector");
        for (Map.Entry entry : this.f18037a.entrySet()) {
            tq.m50332a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f18038b.entrySet()) {
            ob9 ob9Var = (ob9) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                ob9 ob9Var2 = (ob9) entry3.getKey();
                dc9 dc9Var = (dc9) entry3.getValue();
                sq8.m48647f(ob9Var, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                sq8.m48647f(ob9Var2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                sq8.m48647f(dc9Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                yffVar.mo57655c(ob9Var, ob9Var2, dc9Var);
            }
        }
        for (Map.Entry entry4 : this.f18039c.entrySet()) {
            ob9 ob9Var3 = (ob9) entry4.getKey();
            xk7 xk7Var = (xk7) entry4.getValue();
            sq8.m48647f(ob9Var3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            sq8.m48647f(xk7Var, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            yffVar.mo57654b(ob9Var3, (xk7) azh.m18052e(xk7Var, 1));
        }
        for (Map.Entry entry5 : this.f18041e.entrySet()) {
            ob9 ob9Var4 = (ob9) entry5.getKey();
            xk7 xk7Var2 = (xk7) entry5.getValue();
            sq8.m48647f(ob9Var4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            sq8.m48647f(xk7Var2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            yffVar.mo57653a(ob9Var4, (xk7) azh.m18052e(xk7Var2, 1));
        }
    }

    @Override // p001o.wff
    /* renamed from: b */
    public dc9 mo21128b(ob9 ob9Var, List list) {
        sq8.m48649h(ob9Var, "kClass");
        sq8.m48649h(list, "typeArgumentsSerializers");
        tq.m50332a(this.f18037a.get(ob9Var));
        return null;
    }

    @Override // p001o.wff
    /* renamed from: d */
    public bn5 mo21129d(ob9 ob9Var, String str) {
        sq8.m48649h(ob9Var, "baseClass");
        Map map = (Map) this.f18040d.get(ob9Var);
        dc9 dc9Var = map != null ? (dc9) map.get(str) : null;
        if (!(dc9Var instanceof dc9)) {
            dc9Var = null;
        }
        if (dc9Var != null) {
            return dc9Var;
        }
        Object obj = this.f18041e.get(ob9Var);
        xk7 xk7Var = azh.m18058k(obj, 1) ? (xk7) obj : null;
        if (xk7Var != null) {
            return (bn5) xk7Var.invoke(str);
        }
        return null;
    }

    @Override // p001o.wff
    /* renamed from: e */
    public iff mo21130e(ob9 ob9Var, Object obj) {
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(obj, "value");
        if (!ob9Var.mo26335a(obj)) {
            return null;
        }
        Map map = (Map) this.f18038b.get(ob9Var);
        dc9 dc9Var = map != null ? (dc9) map.get(kge.m35689b(obj.getClass())) : null;
        if (!(dc9Var instanceof iff)) {
            dc9Var = null;
        }
        if (dc9Var != null) {
            return dc9Var;
        }
        Object obj2 = this.f18039c.get(ob9Var);
        xk7 xk7Var = azh.m18058k(obj2, 1) ? (xk7) obj2 : null;
        if (xk7Var != null) {
            return (iff) xk7Var.invoke(obj);
        }
        return null;
    }
}
