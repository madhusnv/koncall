package p001o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class fa3 implements ob9, da3 {

    /* renamed from: b */
    public static final C13374a f23021b = new C13374a(null);

    /* renamed from: c */
    public static final Map f23022c;

    /* renamed from: d */
    public static final HashMap f23023d;

    /* renamed from: e */
    public static final HashMap f23024e;

    /* renamed from: f */
    public static final HashMap f23025f;

    /* renamed from: g */
    public static final Map f23026g;

    /* renamed from: a */
    public final Class f23027a;

    /* renamed from: o.fa3$a */
    public static final class C13374a {
        public C13374a() {
        }

        public /* synthetic */ C13374a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m26338a(Class cls) {
            String str;
            sq8.m48649h(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) fa3.f23025f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) fa3.f23025f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m26339b(Class cls) {
            String strP0;
            String str;
            sq8.m48649h(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    sq8.m48646e(simpleName);
                    strP0 = f9g.P0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    sq8.m48646e(simpleName);
                    return f9g.O0(simpleName, '$', null, 2, null);
                }
                sq8.m48646e(simpleName);
                return f9g.P0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            }
            if (!cls.isArray()) {
                String str3 = (String) fa3.f23026g.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            strP0 = "Array";
            if (componentType.isPrimitive() && (str = (String) fa3.f23026g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            if (str2 != null) {
                return str2;
            }
            return strP0;
        }

        /* renamed from: c */
        public final boolean m26340c(Object obj, Class cls) {
            sq8.m48649h(cls, "jClass");
            Map map = fa3.f23022c;
            sq8.m48647f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return azh.m18058k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = hb9.m30151b(hb9.m30152c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i = 0;
        List listM21249n = ch3.m21249n(uk7.class, xk7.class, nl7.class, ql7.class, sl7.class, ul7.class, vl7.class, wl7.class, xl7.class, yl7.class, wk7.class, yk7.class, zk7.class, al7.class, bl7.class, cl7.class, dl7.class, el7.class, fl7.class, gl7.class, jl7.class, kl7.class, ml7.class);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM21249n, 10));
        for (Object obj : listM21249n) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            arrayList.add(vyh.m53620a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f23022c = isa.m32691r(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f23023d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f23024e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        sq8.m48648g(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            sq8.m48646e(str);
            sb.append(f9g.R0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            hwc hwcVarM53620a = vyh.m53620a(sb.toString(), str + ".Companion");
            map3.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        for (Map.Entry entry : f23022c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f23025f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), f9g.R0((String) entry2.getValue(), '.', null, 2, null));
        }
        f23026g = linkedHashMap;
    }

    public fa3(Class cls) {
        sq8.m48649h(cls, "jClass");
        this.f23027a = cls;
    }

    @Override // p001o.ob9
    /* renamed from: a */
    public boolean mo26335a(Object obj) {
        return f23021b.m26340c(obj, mo22647b());
    }

    @Override // p001o.da3
    /* renamed from: b */
    public Class mo22647b() {
        return this.f23027a;
    }

    @Override // p001o.ob9
    /* renamed from: c */
    public String mo26336c() {
        return f23021b.m26338a(mo22647b());
    }

    @Override // p001o.ob9
    /* renamed from: d */
    public String mo26337d() {
        return f23021b.m26339b(mo22647b());
    }

    public boolean equals(Object obj) {
        return (obj instanceof fa3) && sq8.m48644c(hb9.m30151b(this), hb9.m30151b((ob9) obj));
    }

    @Override // p001o.ob9
    public int hashCode() {
        return hb9.m30151b(this).hashCode();
    }

    public String toString() {
        return mo22647b().toString() + " (Kotlin reflection is not available)";
    }
}
