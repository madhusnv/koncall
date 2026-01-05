package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class mie {
    public static final mie EXPLICIT = new C15334a("EXPLICIT", 0);
    public static final mie REPLACED = new mie("REPLACED", 1) { // from class: o.mie.b
        {
            C15334a c15334a = null;
        }

        @Override // p001o.mie
        public boolean wasEvicted() {
            return false;
        }
    };
    public static final mie COLLECTED = new mie("COLLECTED", 2) { // from class: o.mie.c
        {
            C15334a c15334a = null;
        }

        @Override // p001o.mie
        public boolean wasEvicted() {
            return true;
        }
    };
    public static final mie EXPIRED = new mie("EXPIRED", 3) { // from class: o.mie.d
        {
            C15334a c15334a = null;
        }

        @Override // p001o.mie
        public boolean wasEvicted() {
            return true;
        }
    };
    public static final mie SIZE = new mie("SIZE", 4) { // from class: o.mie.e
        {
            C15334a c15334a = null;
        }

        @Override // p001o.mie
        public boolean wasEvicted() {
            return true;
        }
    };
    private static final /* synthetic */ mie[] $VALUES = $values();

    /* renamed from: o.mie$a */
    public enum C15334a extends mie {
        public C15334a(String str, int i) {
            super(str, i, null);
        }

        @Override // p001o.mie
        public boolean wasEvicted() {
            return false;
        }
    }

    private static /* synthetic */ mie[] $values() {
        return new mie[]{EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE};
    }

    private mie(String str, int i) {
    }

    public static mie valueOf(String str) {
        return (mie) Enum.valueOf(mie.class, str);
    }

    public static mie[] values() {
        return (mie[]) $VALUES.clone();
    }

    public abstract boolean wasEvicted();

    public /* synthetic */ mie(String str, int i, C15334a c15334a) {
        this(str, i);
    }
}
