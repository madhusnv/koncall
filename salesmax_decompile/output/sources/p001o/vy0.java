package p001o;

import androidx.media3.common.C2181a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public interface vy0 {

    /* renamed from: a */
    public static final ByteBuffer f51019a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: o.vy0$a */
    public static final class C17692a {

        /* renamed from: e */
        public static final C17692a f51020e = new C17692a(-1, -1, -1);

        /* renamed from: a */
        public final int f51021a;

        /* renamed from: b */
        public final int f51022b;

        /* renamed from: c */
        public final int f51023c;

        /* renamed from: d */
        public final int f51024d;

        public C17692a(C2181a c2181a) {
            this(c2181a.f7920C, c2181a.f7919B, c2181a.f7921D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17692a)) {
                return false;
            }
            C17692a c17692a = (C17692a) obj;
            return this.f51021a == c17692a.f51021a && this.f51022b == c17692a.f51022b && this.f51023c == c17692a.f51023c;
        }

        public int hashCode() {
            return r6c.m46256b(Integer.valueOf(this.f51021a), Integer.valueOf(this.f51022b), Integer.valueOf(this.f51023c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f51021a + ", channelCount=" + this.f51022b + ", encoding=" + this.f51023c + ']';
        }

        public C17692a(int i, int i2, int i3) {
            this.f51021a = i;
            this.f51022b = i2;
            this.f51023c = i3;
            this.f51024d = sqi.F0(i3) ? sqi.i0(i3, i2) : -1;
        }
    }

    /* renamed from: o.vy0$b */
    public static final class C17693b extends Exception {

        /* renamed from: a */
        public final C17692a f51025a;

        public C17693b(C17692a c17692a) {
            this("Unhandled input format:", c17692a);
        }

        public C17693b(String str, C17692a c17692a) {
            super(str + " " + c17692a);
            this.f51025a = c17692a;
        }
    }

    /* renamed from: a */
    boolean mo21720a();

    /* renamed from: b */
    boolean mo32950b();

    /* renamed from: c */
    ByteBuffer mo32951c();

    /* renamed from: d */
    C17692a mo32952d(C17692a c17692a);

    /* renamed from: e */
    void mo21721e(ByteBuffer byteBuffer);

    /* renamed from: f */
    void mo32953f();

    void flush();

    void reset();
}
