package p001o;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface sga {

    /* renamed from: o.sga$a */
    public static final class C16836a {

        /* renamed from: a */
        public final int f45389a;

        /* renamed from: b */
        public final int f45390b;

        /* renamed from: c */
        public final int f45391c;

        /* renamed from: d */
        public final int f45392d;

        public C16836a(int i, int i2, int i3, int i4) {
            this.f45389a = i;
            this.f45390b = i2;
            this.f45391c = i3;
            this.f45392d = i4;
        }

        /* renamed from: a */
        public boolean m48314a(int i) {
            if (i == 1) {
                if (this.f45389a - this.f45390b <= 1) {
                    return false;
                }
            } else if (this.f45391c - this.f45392d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.sga$b */
    public static final class C16837b {

        /* renamed from: a */
        public final int f45393a;

        /* renamed from: b */
        public final long f45394b;

        public C16837b(int i, long j) {
            op0.m42511a(j >= 0);
            this.f45393a = i;
            this.f45394b = j;
        }
    }

    /* renamed from: o.sga$c */
    public static final class C16838c {

        /* renamed from: a */
        public final tga f45395a;

        /* renamed from: b */
        public final u2b f45396b;

        /* renamed from: c */
        public final IOException f45397c;

        /* renamed from: d */
        public final int f45398d;

        public C16838c(tga tgaVar, u2b u2bVar, IOException iOException, int i) {
            this.f45395a = tgaVar;
            this.f45396b = u2bVar;
            this.f45397c = iOException;
            this.f45398d = i;
        }
    }

    /* renamed from: a */
    int mo48310a(int i);

    /* renamed from: b */
    C16837b mo48311b(C16836a c16836a, C16838c c16838c);

    /* renamed from: c */
    default void m48312c(long j) {
    }

    /* renamed from: d */
    long mo48313d(C16838c c16838c);
}
