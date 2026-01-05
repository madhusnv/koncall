package p001o;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface a7f extends Closeable {

    /* renamed from: o.a7f$a */
    public static final class C12105a {
        /* renamed from: a */
        public static /* synthetic */ Object m16562a(a7f a7fVar, t6f t6fVar, long j, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i & 2) != 0) {
                j = t6fVar.m49489c();
            }
            return a7fVar.Y0(t6fVar, j, n64Var);
        }
    }

    Object Y0(t6f t6fVar, long j, n64 n64Var);

    /* renamed from: q */
    boolean mo16561q(Throwable th);
}
