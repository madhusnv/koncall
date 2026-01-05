package p001o;

import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class js0 {

    /* renamed from: a */
    public final int f31018a;

    /* renamed from: o.js0$a */
    public static final class C14644a extends js0 {

        /* renamed from: b */
        public final long f31019b;

        /* renamed from: c */
        public final List f31020c;

        /* renamed from: d */
        public final List f31021d;

        public C14644a(int i, long j) {
            super(i);
            this.f31019b = j;
            this.f31020c = new ArrayList();
            this.f31021d = new ArrayList();
        }

        /* renamed from: d */
        public void m34448d(C14644a c14644a) {
            this.f31021d.add(c14644a);
        }

        /* renamed from: e */
        public void m34449e(C14645b c14645b) {
            this.f31020c.add(c14645b);
        }

        /* renamed from: f */
        public C14644a m34450f(int i) {
            int size = this.f31021d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C14644a c14644a = (C14644a) this.f31021d.get(i2);
                if (c14644a.f31018a == i) {
                    return c14644a;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C14645b m34451g(int i) {
            int size = this.f31020c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C14645b c14645b = (C14645b) this.f31020c.get(i2);
                if (c14645b.f31018a == i) {
                    return c14645b;
                }
            }
            return null;
        }

        @Override // p001o.js0
        public String toString() {
            return js0.m34445a(this.f31018a) + " leaves: " + Arrays.toString(this.f31020c.toArray()) + " containers: " + Arrays.toString(this.f31021d.toArray());
        }
    }

    /* renamed from: o.js0$b */
    public static final class C14645b extends js0 {

        /* renamed from: b */
        public final zwc f31022b;

        public C14645b(int i, zwc zwcVar) {
            super(i);
            this.f31022b = zwcVar;
        }
    }

    public js0(int i) {
        this.f31018a = i;
    }

    /* renamed from: a */
    public static String m34445a(int i) {
        return "" + ((char) ((i >> 24) & Constants.MAX_HOST_LENGTH)) + ((char) ((i >> 16) & Constants.MAX_HOST_LENGTH)) + ((char) ((i >> 8) & Constants.MAX_HOST_LENGTH)) + ((char) (i & Constants.MAX_HOST_LENGTH));
    }

    /* renamed from: b */
    public static int m34446b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m34447c(int i) {
        return (i >> 24) & Constants.MAX_HOST_LENGTH;
    }

    public String toString() {
        return m34445a(this.f31018a);
    }
}
