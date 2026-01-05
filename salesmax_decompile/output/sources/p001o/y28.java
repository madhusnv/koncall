package p001o;

/* loaded from: classes3.dex */
public final class y28 extends s6f {

    /* renamed from: b */
    public final x28 f54764b;

    /* renamed from: o.y28$a */
    public /* synthetic */ class C18303a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54765a;

        static {
            int[] iArr = new int[x28.values().length];
            try {
                iArr[x28.CONNECT_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x28.TLS_NEGOTIATION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x28.SDK_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54765a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y28(Throwable th, x28 x28Var, boolean z) {
        super(th);
        sq8.m48649h(x28Var, "errorCode");
        this.f54764b = x28Var;
        m57139b(z);
    }

    /* renamed from: b */
    public final void m57139b(boolean z) {
        tob tobVarM35772c = mo30426c().m35772c();
        kx0 kx0VarM35775a = kj6.f32297b.m35775a();
        boolean z2 = true;
        if (!z) {
            int i = C18303a.f54765a[this.f54764b.ordinal()];
            if (!(i == 1 || i == 2)) {
                z2 = false;
            }
        }
        tobVarM35772c.mo34002p(kx0VarM35775a, Boolean.valueOf(z2));
    }

    @Override // java.lang.Throwable
    public String toString() {
        String string = super.toString();
        if (C18303a.f54765a[this.f54764b.ordinal()] == 3) {
            return string;
        }
        return string + "; HttpErrorCode(" + this.f54764b + ')';
    }
}
