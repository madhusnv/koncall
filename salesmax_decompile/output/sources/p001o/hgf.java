package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class hgf extends s6f {

    /* renamed from: b */
    public final ggf f26840b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.hgf$a */
    public static final class EnumC13938a {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC13938a[] $VALUES;
        public static final EnumC13938a Client = new EnumC13938a("Client", 0);
        public static final EnumC13938a Server = new EnumC13938a("Server", 1);
        public static final EnumC13938a Unknown = new EnumC13938a("Unknown", 2);

        private static final /* synthetic */ EnumC13938a[] $values() {
            return new EnumC13938a[]{Client, Server, Unknown};
        }

        static {
            EnumC13938a[] enumC13938aArr$values = $values();
            $VALUES = enumC13938aArr$values;
            $ENTRIES = hi6.m30609a(enumC13938aArr$values);
        }

        private EnumC13938a(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC13938a valueOf(String str) {
            return (EnumC13938a) Enum.valueOf(EnumC13938a.class, str);
        }

        public static EnumC13938a[] values() {
            return (EnumC13938a[]) $VALUES.clone();
        }
    }

    public hgf() {
        this.f26840b = new ggf();
    }

    /* renamed from: b */
    public List mo30425b() {
        List listM18961c = bh3.m18961c();
        String message = super.getMessage();
        if (message == null) {
            message = mo30426c().m28585l();
        }
        if (message == null) {
            String strM28584k = mo30426c().m28584k();
            if (strM28584k != null) {
                listM18961c.add("Service returned error code " + strM28584k);
            }
            listM18961c.add("Error type: " + mo30426c().m28586m());
            listM18961c.add("Protocol response: " + mo30426c().m28587n().getSummary());
        } else {
            listM18961c.add(message);
        }
        String strM28588o = mo30426c().m28588o();
        if (strM28588o != null) {
            listM18961c.add("Request ID: " + strM28588o);
        }
        return bh3.m18959a(listM18961c);
    }

    /* renamed from: c */
    public abstract ggf mo30426c();

    @Override // java.lang.Throwable
    public String getMessage() {
        return kh3.p0(mo30425b(), null, null, null, 0, null, null, 63, null);
    }

    public hgf(String str) {
        super(str);
        this.f26840b = new ggf();
    }

    public hgf(String str, Throwable th) {
        super(str, th);
        this.f26840b = new ggf();
    }
}
