package p001o;

import android.content.Context;
import com.amplifyframework.hub.HubChannel;
import p001o.co1;
import p001o.o58;
import p001o.tn0;

/* loaded from: classes.dex */
public final class f64 {

    /* renamed from: a */
    public static final C13345a f22783a = new C13345a(null);

    /* renamed from: b */
    public static final f64 f22784b = new f64();

    /* renamed from: o.f64$a */
    public static final class C13345a {
        public C13345a() {
        }

        public /* synthetic */ C13345a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final f64 m26204a() {
            return f64.f22784b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.f64$b */
    public static final class EnumC13346b {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC13346b[] $VALUES;
        public static final EnumC13346b APPLICATION = new EnumC13346b("APPLICATION", 0);
        public static final EnumC13346b USER = new EnumC13346b("USER", 1);
        public static final EnumC13346b BUSINESS = new EnumC13346b("BUSINESS", 2);

        private static final /* synthetic */ EnumC13346b[] $values() {
            return new EnumC13346b[]{APPLICATION, USER, BUSINESS};
        }

        static {
            EnumC13346b[] enumC13346bArr$values = $values();
            $VALUES = enumC13346bArr$values;
            $ENTRIES = hi6.m30609a(enumC13346bArr$values);
        }

        private EnumC13346b(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC13346b valueOf(String str) {
            return (EnumC13346b) Enum.valueOf(EnumC13346b.class, str);
        }

        public static EnumC13346b[] values() {
            return (EnumC13346b[]) $VALUES.clone();
        }
    }

    /* renamed from: o.f64$c */
    public /* synthetic */ class C13347c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22785a;

        static {
            int[] iArr = new int[EnumC13346b.values().length];
            try {
                iArr[EnumC13346b.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13346b.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13346b.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22785a = iArr;
        }
    }

    static {
        o58.C15713a c15713a = o58.f37789b;
        c15713a.m41624a().m41622i(HubChannel.LOGGING);
        c15713a.m41624a().m41622i(HubChannel.AUTH);
        c15713a.m41624a().m41620e(new rz0());
    }

    /* renamed from: e */
    public static /* synthetic */ void m26200e(f64 f64Var, EnumC13346b enumC13346b, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        f64Var.m26203d(enumC13346b, context);
    }

    /* renamed from: b */
    public final void m26201b(EnumC13346b enumC13346b) {
        sq8.m48649h(enumC13346b, "contextScope");
        int i = C13347c.f22785a[enumC13346b.ordinal()];
        if (i == 1) {
            tn0.f47449d.m50227h();
        } else if (i == 2) {
            vci.f50127d.m52566h();
        } else {
            if (i != 3) {
                return;
            }
            co1.f18426d.m21528k();
        }
    }

    /* renamed from: c */
    public final ub1 m26202c(EnumC13346b enumC13346b) {
        sq8.m48649h(enumC13346b, "contextScope");
        int i = C13347c.f22785a[enumC13346b.ordinal()];
        if (i == 1) {
            return tn0.f47449d.m50228k();
        }
        if (i == 2) {
            return vci.f50127d.m52567k();
        }
        if (i == 3) {
            return co1.f18426d.m21529n();
        }
        throw new szb();
    }

    /* renamed from: d */
    public final void m26203d(EnumC13346b enumC13346b, Context context) {
        sq8.m48649h(enumC13346b, "contextScope");
        int i = C13347c.f22785a[enumC13346b.ordinal()];
        if (i == 1) {
            tn0.C17164a c17164a = tn0.f47449d;
            sq8.m48646e(context);
            c17164a.m50229o(context);
        } else if (i == 2) {
            vci.f50127d.m52568o();
        } else {
            if (i != 3) {
                return;
            }
            co1.C12716a.m21522s(co1.f18426d, null, 1, null);
        }
    }
}
