package p001o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.C2181a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface m1b {

    /* renamed from: o.m1b$a */
    public static final class C15198a {

        /* renamed from: a */
        public final q1b f34636a;

        /* renamed from: b */
        public final MediaFormat f34637b;

        /* renamed from: c */
        public final C2181a f34638c;

        /* renamed from: d */
        public final Surface f34639d;

        /* renamed from: e */
        public final MediaCrypto f34640e;

        /* renamed from: f */
        public final int f34641f;

        public C15198a(q1b q1bVar, MediaFormat mediaFormat, C2181a c2181a, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.f34636a = q1bVar;
            this.f34637b = mediaFormat;
            this.f34638c = c2181a;
            this.f34639d = surface;
            this.f34640e = mediaCrypto;
            this.f34641f = i;
        }

        /* renamed from: a */
        public static C15198a m38179a(q1b q1bVar, MediaFormat mediaFormat, C2181a c2181a, MediaCrypto mediaCrypto) {
            return new C15198a(q1bVar, mediaFormat, c2181a, null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static C15198a m38180b(q1b q1bVar, MediaFormat mediaFormat, C2181a c2181a, Surface surface, MediaCrypto mediaCrypto) {
            return new C15198a(q1bVar, mediaFormat, c2181a, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: o.m1b$b */
    public interface InterfaceC15199b {
        /* renamed from: a */
        m1b mo16985a(C15198a c15198a);
    }

    /* renamed from: o.m1b$c */
    public interface InterfaceC15200c {
        /* renamed from: a */
        void mo38181a();

        /* renamed from: b */
        void mo38182b();
    }

    /* renamed from: o.m1b$d */
    public interface InterfaceC15201d {
        /* renamed from: a */
        void mo36457a(m1b m1bVar, long j, long j2);
    }

    /* renamed from: a */
    void mo23718a(int i, int i2, int i3, long j, int i4);

    /* renamed from: b */
    void mo23719b(Bundle bundle);

    /* renamed from: c */
    void mo23720c(int i, int i2, xc4 xc4Var, long j, int i3);

    /* renamed from: d */
    void mo23721d(InterfaceC15201d interfaceC15201d, Handler handler);

    /* renamed from: e */
    MediaFormat mo23722e();

    /* renamed from: f */
    void mo23723f(int i);

    void flush();

    /* renamed from: g */
    ByteBuffer mo23724g(int i);

    /* renamed from: h */
    void mo23725h(Surface surface);

    /* renamed from: i */
    boolean mo23726i();

    /* renamed from: j */
    default boolean mo23727j(InterfaceC15200c interfaceC15200c) {
        return false;
    }

    /* renamed from: k */
    void mo23728k(int i, long j);

    /* renamed from: l */
    int mo23729l();

    /* renamed from: m */
    int mo23730m(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: n */
    void mo23731n(int i, boolean z);

    /* renamed from: o */
    ByteBuffer mo23732o(int i);

    void release();
}
