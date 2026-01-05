package kk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.q */
/* loaded from: classes.dex */
public abstract class EnumC4097q {
    private static final /* synthetic */ EnumC4097q[] $VALUES;
    public static final EnumC4097q DEFAULT;
    public static final EnumC4097q STRING;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: kk.q$a */
    public enum a extends EnumC4097q {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // kk.EnumC4097q
        public AbstractC4092l serialize(Long l9) {
            return l9 == null ? C4093m.f20997a : new C4095o(l9);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        EnumC4097q enumC4097q = new EnumC4097q("STRING", 1) { // from class: kk.q.b
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4097q
            public AbstractC4092l serialize(Long l9) {
                return l9 == null ? C4093m.f20997a : new C4095o(l9.toString());
            }
        };
        STRING = enumC4097q;
        $VALUES = new EnumC4097q[]{aVar, enumC4097q};
    }

    private EnumC4097q(String str, int i10) {
    }

    public static EnumC4097q valueOf(String str) {
        return (EnumC4097q) Enum.valueOf(EnumC4097q.class, str);
    }

    public static EnumC4097q[] values() {
        return (EnumC4097q[]) $VALUES.clone();
    }

    public abstract AbstractC4092l serialize(Long l9);

    public /* synthetic */ EnumC4097q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
