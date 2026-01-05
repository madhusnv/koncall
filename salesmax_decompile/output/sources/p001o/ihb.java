package p001o;

import java.util.Queue;

/* loaded from: classes5.dex */
public class ihb {

    /* renamed from: a */
    public final wma f28676a;

    /* renamed from: o.ihb$a */
    public class C14294a extends wma {
        public C14294a(long j) {
            super(j);
        }

        @Override // p001o.wma
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo19446j(C14295b c14295b, Object obj) {
            c14295b.m32147c();
        }
    }

    /* renamed from: o.ihb$b */
    public static final class C14295b {

        /* renamed from: d */
        public static final Queue f28678d = uqi.m51924e(0);

        /* renamed from: a */
        public int f28679a;

        /* renamed from: b */
        public int f28680b;

        /* renamed from: c */
        public Object f28681c;

        /* renamed from: a */
        public static C14295b m32145a(Object obj, int i, int i2) {
            C14295b c14295b;
            Queue queue = f28678d;
            synchronized (queue) {
                c14295b = (C14295b) queue.poll();
            }
            if (c14295b == null) {
                c14295b = new C14295b();
            }
            c14295b.m32146b(obj, i, i2);
            return c14295b;
        }

        /* renamed from: b */
        public final void m32146b(Object obj, int i, int i2) {
            this.f28681c = obj;
            this.f28680b = i;
            this.f28679a = i2;
        }

        /* renamed from: c */
        public void m32147c() {
            Queue queue = f28678d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14295b)) {
                return false;
            }
            C14295b c14295b = (C14295b) obj;
            return this.f28680b == c14295b.f28680b && this.f28679a == c14295b.f28679a && this.f28681c.equals(c14295b.f28681c);
        }

        public int hashCode() {
            return (((this.f28679a * 31) + this.f28680b) * 31) + this.f28681c.hashCode();
        }
    }

    public ihb(long j) {
        this.f28676a = new C14294a(j);
    }

    /* renamed from: a */
    public Object m32142a(Object obj, int i, int i2) {
        C14295b c14295bM32145a = C14295b.m32145a(obj, i, i2);
        Object objM54708g = this.f28676a.m54708g(c14295bM32145a);
        c14295bM32145a.m32147c();
        return objM54708g;
    }

    /* renamed from: b */
    public void m32143b(Object obj, int i, int i2, Object obj2) {
        this.f28676a.m54710k(C14295b.m32145a(obj, i, i2), obj2);
    }
}
