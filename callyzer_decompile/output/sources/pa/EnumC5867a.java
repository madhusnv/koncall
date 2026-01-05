package pa;

import pg.b8;
import xw.InterfaceC8493a;
import yb.InterfaceC8609a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pa.a */
/* loaded from: classes.dex */
public final class EnumC5867a implements InterfaceC8609a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5867a[] $VALUES;
    private final String identifier;
    public static final EnumC5867a S3_EXPRESS_BUCKET = new EnumC5867a("S3_EXPRESS_BUCKET", 0, "J");
    public static final EnumC5867a DDB_MAPPER = new EnumC5867a("DDB_MAPPER", 1, "d");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: pa.a$a */
    public static final class a implements InterfaceC8609a {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final String identifier;
        public static final a CREDENTIALS_CODE = new a("CREDENTIALS_CODE", 0, "e");
        public static final a CREDENTIALS_JVM_SYSTEM_PROPERTIES = new a("CREDENTIALS_JVM_SYSTEM_PROPERTIES", 1, "f");
        public static final a CREDENTIALS_ENV_VARS = new a("CREDENTIALS_ENV_VARS", 2, "g");
        public static final a CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN = new a("CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN", 3, "h");
        public static final a CREDENTIALS_STS_ASSUME_ROLE = new a("CREDENTIALS_STS_ASSUME_ROLE", 4, "i");
        public static final a CREDENTIALS_STS_ASSUME_ROLE_WEB_ID = new a("CREDENTIALS_STS_ASSUME_ROLE_WEB_ID", 5, "k");
        public static final a CREDENTIALS_PROFILE = new a("CREDENTIALS_PROFILE", 6, "n");
        public static final a CREDENTIALS_PROFILE_SOURCE_PROFILE = new a("CREDENTIALS_PROFILE_SOURCE_PROFILE", 7, "o");
        public static final a CREDENTIALS_PROFILE_NAMED_PROVIDER = new a("CREDENTIALS_PROFILE_NAMED_PROVIDER", 8, "p");
        public static final a CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN = new a("CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN", 9, "q");
        public static final a CREDENTIALS_PROFILE_SSO = new a("CREDENTIALS_PROFILE_SSO", 10, "r");
        public static final a CREDENTIALS_SSO = new a("CREDENTIALS_SSO", 11, "s");
        public static final a CREDENTIALS_PROFILE_SSO_LEGACY = new a("CREDENTIALS_PROFILE_SSO_LEGACY", 12, "t");
        public static final a CREDENTIALS_SSO_LEGACY = new a("CREDENTIALS_SSO_LEGACY", 13, "u");
        public static final a CREDENTIALS_PROFILE_PROCESS = new a("CREDENTIALS_PROFILE_PROCESS", 14, "v");
        public static final a CREDENTIALS_PROCESS = new a("CREDENTIALS_PROCESS", 15, "w");
        public static final a CREDENTIALS_HTTP = new a("CREDENTIALS_HTTP", 16, "z");
        public static final a CREDENTIALS_IMDS = new a("CREDENTIALS_IMDS", 17, "0");

        private static final /* synthetic */ a[] $values() {
            return new a[]{CREDENTIALS_CODE, CREDENTIALS_JVM_SYSTEM_PROPERTIES, CREDENTIALS_ENV_VARS, CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN, CREDENTIALS_STS_ASSUME_ROLE, CREDENTIALS_STS_ASSUME_ROLE_WEB_ID, CREDENTIALS_PROFILE, CREDENTIALS_PROFILE_SOURCE_PROFILE, CREDENTIALS_PROFILE_NAMED_PROVIDER, CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN, CREDENTIALS_PROFILE_SSO, CREDENTIALS_SSO, CREDENTIALS_PROFILE_SSO_LEGACY, CREDENTIALS_SSO_LEGACY, CREDENTIALS_PROFILE_PROCESS, CREDENTIALS_PROCESS, CREDENTIALS_HTTP, CREDENTIALS_IMDS};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = b8.m11548b(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.identifier = str2;
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // yb.InterfaceC8609a
        public String getIdentifier() {
            return this.identifier;
        }
    }

    private static final /* synthetic */ EnumC5867a[] $values() {
        return new EnumC5867a[]{S3_EXPRESS_BUCKET, DDB_MAPPER};
    }

    static {
        EnumC5867a[] enumC5867aArr$values = $values();
        $VALUES = enumC5867aArr$values;
        $ENTRIES = b8.m11548b(enumC5867aArr$values);
    }

    private EnumC5867a(String str, int i10, String str2) {
        this.identifier = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5867a valueOf(String str) {
        return (EnumC5867a) Enum.valueOf(EnumC5867a.class, str);
    }

    public static EnumC5867a[] values() {
        return (EnumC5867a[]) $VALUES.clone();
    }

    @Override // yb.InterfaceC8609a
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getIdentifier();
    }
}
