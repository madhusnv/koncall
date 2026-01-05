package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public abstract class j0g {

    /* renamed from: a */
    public static final C14420a f29523a = new C14420a(null);

    /* renamed from: o.j0g$a */
    public static final class C14420a {
        public C14420a() {
        }

        public /* synthetic */ C14420a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ j0g m33015b(C14420a c14420a, Object obj, String str, EnumC14421b enumC14421b, pja pjaVar, int i, Object obj2) {
            if ((i & 2) != 0) {
                enumC14421b = nm1.f37029a.m40781a();
            }
            if ((i & 4) != 0) {
                pjaVar = ye0.f55333a;
            }
            return c14420a.m33016a(obj, str, enumC14421b, pjaVar);
        }

        /* renamed from: a */
        public final j0g m33016a(Object obj, String str, EnumC14421b enumC14421b, pja pjaVar) {
            sq8.m48649h(obj, "<this>");
            sq8.m48649h(str, "tag");
            sq8.m48649h(enumC14421b, "verificationMode");
            sq8.m48649h(pjaVar, "logger");
            return new qri(obj, str, enumC14421b, pjaVar);
        }
    }

    /* renamed from: o.j0g$b */
    public enum EnumC14421b {
        STRICT,
        LOG,
        QUIET
    }

    /* renamed from: a */
    public abstract Object mo33012a();

    /* renamed from: b */
    public final String m33013b(Object obj, String str) {
        sq8.m48649h(obj, "value");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        return str + " value: " + obj;
    }

    /* renamed from: c */
    public abstract j0g mo33014c(String str, xk7 xk7Var);
}
