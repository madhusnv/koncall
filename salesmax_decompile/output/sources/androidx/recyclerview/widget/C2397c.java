package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AbstractC2401g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes2.dex */
public final class C2397c {

    /* renamed from: a */
    public final Executor f9945a;

    /* renamed from: b */
    public final Executor f9946b;

    /* renamed from: c */
    public final AbstractC2401g.f f9947c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class a {

        /* renamed from: d */
        public static final Object f9948d = new Object();

        /* renamed from: e */
        public static Executor f9949e;

        /* renamed from: a */
        public Executor f9950a;

        /* renamed from: b */
        public Executor f9951b;

        /* renamed from: c */
        public final AbstractC2401g.f f9952c;

        public a(AbstractC2401g.f fVar) {
            this.f9952c = fVar;
        }

        /* renamed from: a */
        public C2397c m9433a() {
            if (this.f9951b == null) {
                synchronized (f9948d) {
                    if (f9949e == null) {
                        f9949e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f9951b = f9949e;
            }
            return new C2397c(this.f9950a, this.f9951b, this.f9952c);
        }
    }

    public C2397c(Executor executor, Executor executor2, AbstractC2401g.f fVar) {
        this.f9945a = executor;
        this.f9946b = executor2;
        this.f9947c = fVar;
    }

    /* renamed from: a */
    public Executor m9430a() {
        return this.f9946b;
    }

    /* renamed from: b */
    public AbstractC2401g.f m9431b() {
        return this.f9947c;
    }

    /* renamed from: c */
    public Executor m9432c() {
        return this.f9945a;
    }
}
