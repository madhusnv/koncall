package p001o;

/* loaded from: classes5.dex */
public abstract class dt7 {

    /* renamed from: o.dt7$a */
    public class C13028a implements InterfaceC13029b {

        /* renamed from: a */
        public volatile Object f20502a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC13029b f20503b;

        public C13028a(InterfaceC13029b interfaceC13029b) {
            this.f20503b = interfaceC13029b;
        }

        @Override // p001o.dt7.InterfaceC13029b
        public Object get() {
            if (this.f20502a == null) {
                synchronized (this) {
                    if (this.f20502a == null) {
                        this.f20502a = bgd.m18886d(this.f20503b.get());
                    }
                }
            }
            return this.f20502a;
        }
    }

    /* renamed from: o.dt7$b */
    public interface InterfaceC13029b {
        Object get();
    }

    /* renamed from: a */
    public static InterfaceC13029b m23783a(InterfaceC13029b interfaceC13029b) {
        return new C13028a(interfaceC13029b);
    }
}
