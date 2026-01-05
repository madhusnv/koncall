package p001o;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class xt7 {

    /* renamed from: k */
    public static final xt7 f54258k = new C18245a().m56827a();

    /* renamed from: a */
    public final List f54259a = null;

    /* renamed from: b */
    public final int f54260b = 1;

    /* renamed from: c */
    public final boolean f54261c = true;

    /* renamed from: d */
    public final boolean f54262d;

    /* renamed from: e */
    public final int f54263e;

    /* renamed from: f */
    public final int[] f54264f;

    /* renamed from: g */
    public final boolean f54265g;

    /* renamed from: h */
    public final boolean f54266h;

    /* renamed from: i */
    public final boolean f54267i;

    /* renamed from: j */
    public final boolean f54268j;

    /* renamed from: o.xt7$a */
    public static class C18245a {

        /* renamed from: a */
        public boolean f54269a = true;

        /* renamed from: b */
        public int f54270b = -1;

        /* renamed from: c */
        public int[] f54271c = {101};

        /* renamed from: d */
        public boolean f54272d = true;

        /* renamed from: e */
        public boolean f54273e = true;

        /* renamed from: f */
        public boolean f54274f = true;

        /* renamed from: g */
        public boolean f54275g = true;

        /* renamed from: a */
        public xt7 m56827a() {
            return new xt7(this, null);
        }

        /* renamed from: b */
        public C18245a m56828b(boolean z) {
            this.f54269a = z;
            return this;
        }

        /* renamed from: c */
        public C18245a m56829c(int i) {
            Preconditions.checkArgument(i > 0, "pageLimit should be be greater than or equal to 1");
            this.f54270b = i;
            return this;
        }

        /* renamed from: d */
        public C18245a m56830d(int i, int... iArr) {
            Preconditions.checkArgument(iArr != null, "moreFormats cannot be null");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            this.f54271c = iArrCopyOf;
            iArrCopyOf[length] = i;
            return this;
        }

        /* renamed from: e */
        public C18245a m56831e(int i) {
            if (i == 1) {
                this.f54272d = true;
                this.f54273e = true;
                this.f54274f = true;
                this.f54275g = true;
            } else {
                if (i == 2) {
                    this.f54272d = false;
                    this.f54273e = true;
                    this.f54274f = true;
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException("Invalid scanner mode: " + i);
                    }
                    this.f54272d = false;
                    this.f54273e = false;
                    this.f54274f = false;
                }
                this.f54275g = false;
            }
            return this;
        }
    }

    public /* synthetic */ xt7(C18245a c18245a, mjj mjjVar) {
        this.f54262d = c18245a.f54269a;
        this.f54263e = c18245a.f54270b;
        this.f54264f = c18245a.f54271c;
        this.f54265g = c18245a.f54272d;
        this.f54266h = c18245a.f54273e;
        this.f54267i = c18245a.f54274f;
        this.f54268j = c18245a.f54275g;
    }

    /* renamed from: a */
    public final int m56813a() {
        return this.f54263e;
    }

    /* renamed from: b */
    public final boolean m56814b() {
        return this.f54265g;
    }

    /* renamed from: c */
    public final boolean m56815c() {
        return this.f54266h;
    }

    /* renamed from: d */
    public final boolean m56816d() {
        return this.f54262d;
    }

    /* renamed from: e */
    public final boolean m56817e() {
        return this.f54267i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xt7)) {
            return false;
        }
        xt7 xt7Var = (xt7) obj;
        List list = xt7Var.f54259a;
        return Objects.equal(null, null) && this.f54262d == xt7Var.f54262d && this.f54263e == xt7Var.f54263e && Arrays.equals(this.f54264f, xt7Var.f54264f) && Objects.equal(null, null) && this.f54265g == xt7Var.f54265g && this.f54266h == xt7Var.f54266h && this.f54267i == xt7Var.f54267i && this.f54268j == xt7Var.f54268j;
    }

    /* renamed from: f */
    public final boolean m56818f() {
        return this.f54268j;
    }

    /* renamed from: g */
    public final int[] m56819g() {
        return this.f54264f;
    }

    public int hashCode() {
        return Objects.hashCode(null, 1, Boolean.TRUE, Boolean.valueOf(this.f54262d), Integer.valueOf(this.f54263e), Integer.valueOf(Arrays.hashCode(this.f54264f)), null, Boolean.valueOf(this.f54265g), Boolean.valueOf(this.f54266h), Boolean.valueOf(this.f54267i), Boolean.valueOf(this.f54268j));
    }
}
