package p001o;

/* loaded from: classes2.dex */
public final class pc4 extends ya3 {
    public pc4(String str, Throwable th) {
        super(str == null ? "The provider could not provide credentials or required configuration was not set" : str, th);
    }

    public /* synthetic */ pc4(String str, Throwable th, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
