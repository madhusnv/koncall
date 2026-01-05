package p001o;

/* loaded from: classes6.dex */
public abstract class tqb {

    /* renamed from: a */
    public static final lgg f47615a = new lgg("NO_OWNER");

    /* renamed from: b */
    public static final lgg f47616b = new lgg("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: a */
    public static final nqb m50339a(boolean z) {
        return new sqb(z);
    }

    /* renamed from: b */
    public static /* synthetic */ nqb m50340b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m50339a(z);
    }
}
