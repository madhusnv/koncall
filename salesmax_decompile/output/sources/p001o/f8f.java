package p001o;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface f8f extends Closeable {
    public static final C13365a a0 = C13365a.f22954a;

    /* renamed from: o.f8f$a */
    public static final class C13365a {

        /* renamed from: a */
        public static final /* synthetic */ C13365a f22954a = new C13365a();

        /* renamed from: a */
        public final f8f m26283a() {
            return a74.m16540e(uac.m51308a());
        }
    }

    void N1(t6f t6fVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
