package p001o;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes2.dex */
public abstract class yq3 {

    /* renamed from: o.yq3$a */
    public static class C18463a {
        /* renamed from: a */
        public static LocaleList m58109a(Configuration configuration) {
            return configuration.getLocales();
        }

        /* renamed from: b */
        public static void m58110b(Configuration configuration, pha phaVar) {
            configuration.setLocales((LocaleList) phaVar.m43689h());
        }
    }

    /* renamed from: a */
    public static pha m58107a(Configuration configuration) {
        return pha.m43684i(C18463a.m58109a(configuration));
    }

    /* renamed from: b */
    public static void m58108b(Configuration configuration, pha phaVar) {
        C18463a.m58110b(configuration, phaVar);
    }
}
