package p001o;

/* loaded from: classes6.dex */
public abstract class f9 {
    /* renamed from: a */
    public static final Void m26289a(String str, ob9 ob9Var) {
        String str2;
        sq8.m48649h(ob9Var, "baseClass");
        String str3 = "in the polymorphic scope of '" + ob9Var.mo26337d() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + ob9Var.mo26337d() + "' has to be sealed and '@Serializable'.";
        }
        throw new gff(str2);
    }

    /* renamed from: b */
    public static final Void m26290b(ob9 ob9Var, ob9 ob9Var2) {
        sq8.m48649h(ob9Var, "subClass");
        sq8.m48649h(ob9Var2, "baseClass");
        String strMo26337d = ob9Var.mo26337d();
        if (strMo26337d == null) {
            strMo26337d = String.valueOf(ob9Var);
        }
        m26289a(strMo26337d, ob9Var2);
        throw new qe9();
    }
}
