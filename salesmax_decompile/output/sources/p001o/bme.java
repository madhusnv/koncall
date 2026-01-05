package p001o;

/* loaded from: classes5.dex */
public interface bme {

    /* renamed from: o.bme$a */
    public enum EnumC12455a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        EnumC12455a(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo19377a();

    /* renamed from: b */
    bme mo19378b();

    /* renamed from: c */
    void mo19379c(wle wleVar);

    /* renamed from: e */
    void mo19380e(wle wleVar);

    /* renamed from: g */
    boolean mo19381g(wle wleVar);

    /* renamed from: h */
    boolean mo19382h(wle wleVar);

    /* renamed from: i */
    boolean mo19383i(wle wleVar);
}
