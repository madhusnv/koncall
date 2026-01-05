package p001o;

/* loaded from: classes6.dex */
public interface tb2 extends r0c {

    /* renamed from: o.tb2$a */
    public static final class C17044a implements tb2 {

        /* renamed from: a */
        public final xk7 f46757a;

        public C17044a(xk7 xk7Var) {
            this.f46757a = xk7Var;
        }

        @Override // p001o.tb2
        /* renamed from: a */
        public void mo23886a(Throwable th) {
            this.f46757a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + o75.m41657a(this.f46757a) + '@' + o75.m41658b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo23886a(Throwable th);
}
