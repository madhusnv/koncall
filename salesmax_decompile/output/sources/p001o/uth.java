package p001o;

import androidx.media3.common.C2181a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public interface uth {

    /* renamed from: o.uth$a */
    public static final class C17452a {

        /* renamed from: a */
        public final int f49484a;

        /* renamed from: b */
        public final byte[] f49485b;

        /* renamed from: c */
        public final int f49486c;

        /* renamed from: d */
        public final int f49487d;

        public C17452a(int i, byte[] bArr, int i2, int i3) {
            this.f49484a = i;
            this.f49485b = bArr;
            this.f49486c = i2;
            this.f49487d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C17452a.class != obj.getClass()) {
                return false;
            }
            C17452a c17452a = (C17452a) obj;
            return this.f49484a == c17452a.f49484a && this.f49486c == c17452a.f49486c && this.f49487d == c17452a.f49487d && Arrays.equals(this.f49485b, c17452a.f49485b);
        }

        public int hashCode() {
            return (((((this.f49484a * 31) + Arrays.hashCode(this.f49485b)) * 31) + this.f49486c) * 31) + this.f49487d;
        }
    }

    /* renamed from: a */
    void mo7071a(long j, int i, int i2, int i3, C17452a c17452a);

    /* renamed from: b */
    void mo7072b(C2181a c2181a);

    /* renamed from: c */
    default int m52026c(pu4 pu4Var, int i, boolean z) {
        return mo7073d(pu4Var, i, z, 0);
    }

    /* renamed from: d */
    int mo7073d(pu4 pu4Var, int i, boolean z, int i2);

    /* renamed from: e */
    default void m52027e(zwc zwcVar, int i) {
        mo7074f(zwcVar, i, 0);
    }

    /* renamed from: f */
    void mo7074f(zwc zwcVar, int i, int i2);
}
