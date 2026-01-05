package p001o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class zka {

    /* renamed from: a */
    public static final hdg f57314a;

    /* renamed from: o.zka$a */
    public class C18665a implements hdg {
        @Override // p001o.hdg
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yka get() {
            return new ala();
        }
    }

    /* renamed from: o.zka$b */
    public class C18666b implements hdg {
        @Override // p001o.hdg
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yka get() {
            return new C18667c(null);
        }
    }

    /* renamed from: o.zka$c */
    public static final class C18667c extends AtomicLong implements yka {
        public C18667c() {
        }

        @Override // p001o.yka
        /* renamed from: a */
        public void mo17346a() {
            getAndIncrement();
        }

        @Override // p001o.yka
        public void add(long j) {
            getAndAdd(j);
        }

        public /* synthetic */ C18667c(C18665a c18665a) {
            this();
        }
    }

    static {
        hdg c18666b;
        try {
            new ala();
            c18666b = new C18665a();
        } catch (Throwable unused) {
            c18666b = new C18666b();
        }
        f57314a = c18666b;
    }

    /* renamed from: a */
    public static yka m59536a() {
        return (yka) f57314a.get();
    }
}
