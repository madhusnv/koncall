package p001o;

import java.lang.reflect.Field;
import java.util.Map;
import p001o.vre;

/* loaded from: classes2.dex */
public abstract class h91 {

    /* renamed from: a */
    public static final gi9 f26406a = si9.m48360a(new uk7() { // from class: o.g91
        @Override // p001o.uk7
        public final Object invoke() {
            return h91.m29980d();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final String m29978b(String str, String str2) {
        String strM53351b;
        try {
            vre.C17665a c17665a = vre.f50797b;
            strM53351b = vre.m53351b(System.getProperty(str));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            strM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (!vre.m53356g(strM53351b)) {
            str2 = strM53351b;
        }
        return str2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m29979c(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "unknown";
        }
        return m29978b(str, str2);
    }

    /* renamed from: d */
    public static final Map m29980d() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
        Map mapM32685l = isa.m32685l(vyh.m53620a("javaVersion", m29979c("java.version", null, 2, null)), vyh.m53620a("jvmName", m29979c("java.vm.name", null, 2, null)), vyh.m53620a("jvmVersion", m29979c("java.vm.version", null, 2, null)));
        if (r9d.f43250a.m46382a().mo26795c()) {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            Field declaredField = cls.getDeclaredField("SDK_INT");
            Field declaredField2 = cls.getDeclaredField("RELEASE");
            mapM32685l.put("androidApiVersion", String.valueOf(declaredField.getInt(null)));
            Object obj = declaredField2.get(null);
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
            mapM32685l.put("androidRelease", (String) obj);
        }
        return mapM32685l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final vg9 m29981e() {
        return new vg9(null, (Map) f26406a.getValue(), 1, 0 == true ? 1 : 0);
    }
}
