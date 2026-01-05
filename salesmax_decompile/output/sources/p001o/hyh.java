package p001o;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface hyh {

    /* renamed from: o.hyh$a */
    public static final class C14126a {

        /* renamed from: a */
        public final String f27799a;

        /* renamed from: b */
        public final int f27800b;

        /* renamed from: c */
        public final byte[] f27801c;

        public C14126a(String str, int i, byte[] bArr) {
            this.f27799a = str;
            this.f27800b = i;
            this.f27801c = bArr;
        }
    }

    /* renamed from: o.hyh$b */
    public static final class C14127b {

        /* renamed from: a */
        public final int f27802a;

        /* renamed from: b */
        public final String f27803b;

        /* renamed from: c */
        public final int f27804c;

        /* renamed from: d */
        public final List f27805d;

        /* renamed from: e */
        public final byte[] f27806e;

        public C14127b(int i, String str, int i2, List list, byte[] bArr) {
            this.f27802a = i;
            this.f27803b = str;
            this.f27804c = i2;
            this.f27805d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f27806e = bArr;
        }

        /* renamed from: a */
        public int m31291a() {
            int i = this.f27804c;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* renamed from: o.hyh$c */
    public interface InterfaceC14128c {
        /* renamed from: a */
        SparseArray mo31292a();

        /* renamed from: b */
        hyh mo31293b(int i, C14127b c14127b);
    }

    /* renamed from: o.hyh$d */
    public static final class C14129d {

        /* renamed from: a */
        public final String f27807a;

        /* renamed from: b */
        public final int f27808b;

        /* renamed from: c */
        public final int f27809c;

        /* renamed from: d */
        public int f27810d;

        /* renamed from: e */
        public String f27811e;

        public C14129d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public void m31294a() {
            int i = this.f27810d;
            this.f27810d = i == Integer.MIN_VALUE ? this.f27808b : i + this.f27809c;
            this.f27811e = this.f27807a + this.f27810d;
        }

        /* renamed from: b */
        public String m31295b() {
            m31297d();
            return this.f27811e;
        }

        /* renamed from: c */
        public int m31296c() {
            m31297d();
            return this.f27810d;
        }

        /* renamed from: d */
        public final void m31297d() {
            if (this.f27810d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C14129d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f27807a = str;
            this.f27808b = i2;
            this.f27809c = i3;
            this.f27810d = Integer.MIN_VALUE;
            this.f27811e = "";
        }
    }

    /* renamed from: a */
    void mo31288a(zwc zwcVar, int i);

    /* renamed from: b */
    void mo31289b();

    /* renamed from: c */
    void mo31290c(umh umhVar, vq6 vq6Var, C14129d c14129d);
}
