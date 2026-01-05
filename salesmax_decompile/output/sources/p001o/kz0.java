package p001o;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C2181a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface kz0 {

    /* renamed from: o.kz0$a */
    public static final class C14937a {

        /* renamed from: a */
        public final int f32852a;

        /* renamed from: b */
        public final int f32853b;

        /* renamed from: c */
        public final int f32854c;

        /* renamed from: d */
        public final boolean f32855d;

        /* renamed from: e */
        public final boolean f32856e;

        /* renamed from: f */
        public final int f32857f;

        public C14937a(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.f32852a = i;
            this.f32853b = i2;
            this.f32854c = i3;
            this.f32855d = z;
            this.f32856e = z2;
            this.f32857f = i4;
        }
    }

    /* renamed from: o.kz0$c */
    public static final class C14939c extends Exception {

        /* renamed from: a */
        public final int f32859a;

        /* renamed from: b */
        public final boolean f32860b;

        /* renamed from: c */
        public final C2181a f32861c;

        public C14939c(int i, int i2, int i3, int i4, C2181a c2181a, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(" ");
            sb.append(c2181a);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f32859a = i;
            this.f32860b = z;
            this.f32861c = c2181a;
        }
    }

    /* renamed from: o.kz0$d */
    public interface InterfaceC14940d {
        /* renamed from: a */
        void mo36357a(C14937a c14937a);

        /* renamed from: b */
        void mo36358b(C14937a c14937a);

        /* renamed from: c */
        void mo36359c(long j);

        /* renamed from: d */
        void mo36360d(boolean z);

        /* renamed from: e */
        void mo36361e(Exception exc);

        /* renamed from: f */
        void mo36362f();

        /* renamed from: g */
        void mo36363g();

        /* renamed from: h */
        void mo36364h(int i, long j, long j2);

        /* renamed from: i */
        void mo36365i();

        /* renamed from: j */
        void mo36366j();

        /* renamed from: k */
        void mo36367k();
    }

    /* renamed from: o.kz0$e */
    public static final class C14941e extends Exception {

        /* renamed from: a */
        public final long f32862a;

        /* renamed from: b */
        public final long f32863b;

        public C14941e(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f32862a = j;
            this.f32863b = j2;
        }
    }

    /* renamed from: o.kz0$f */
    public static final class C14942f extends Exception {

        /* renamed from: a */
        public final int f32864a;

        /* renamed from: b */
        public final boolean f32865b;

        /* renamed from: c */
        public final C2181a f32866c;

        public C14942f(int i, C2181a c2181a, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f32865b = z;
            this.f32864a = i;
            this.f32866c = c2181a;
        }
    }

    /* renamed from: A */
    int mo35266A(C2181a c2181a);

    /* renamed from: B */
    void mo35267B(boolean z);

    /* renamed from: a */
    boolean mo35279a(C2181a c2181a);

    /* renamed from: b */
    boolean mo35280b();

    /* renamed from: d */
    void mo35281d(kad kadVar);

    /* renamed from: e */
    kad mo35282e();

    /* renamed from: f */
    void mo35283f(jbd jbdVar);

    void flush();

    /* renamed from: g */
    void mo35284g();

    /* renamed from: h */
    ty0 mo35285h(C2181a c2181a);

    /* renamed from: i */
    void mo35286i(AudioDeviceInfo audioDeviceInfo);

    /* renamed from: j */
    boolean mo35287j();

    /* renamed from: k */
    void mo35288k(int i);

    /* renamed from: l */
    void mo35289l(wx0 wx0Var);

    /* renamed from: m */
    void mo35290m(int i);

    /* renamed from: n */
    void mo35291n();

    /* renamed from: o */
    void mo35292o(InterfaceC14940d interfaceC14940d);

    /* renamed from: p */
    boolean mo35293p(ByteBuffer byteBuffer, long j, int i);

    void pause();

    /* renamed from: q */
    void mo35294q(v61 v61Var);

    /* renamed from: r */
    void mo35295r(C2181a c2181a, int i, int[] iArr);

    void release();

    void reset();

    /* renamed from: s */
    void mo35296s();

    /* renamed from: t */
    void mo35297t(int i, int i2);

    /* renamed from: u */
    long mo35298u(boolean z);

    /* renamed from: v */
    default void m36356v(long j) {
    }

    /* renamed from: w */
    void mo35299w();

    /* renamed from: x */
    void mo35300x(float f);

    /* renamed from: y */
    void mo35301y(jb3 jb3Var);

    /* renamed from: z */
    void mo35302z();

    /* renamed from: o.kz0$b */
    public static final class C14938b extends Exception {

        /* renamed from: a */
        public final C2181a f32858a;

        public C14938b(Throwable th, C2181a c2181a) {
            super(th);
            this.f32858a = c2181a;
        }

        public C14938b(String str, C2181a c2181a) {
            super(str);
            this.f32858a = c2181a;
        }
    }
}
