package p001o;

import android.net.Uri;
import com.google.firebase.perf.util.Constants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ra8 implements dz4 {

    /* renamed from: a */
    public final dz4 f43315a;

    /* renamed from: b */
    public final int f43316b;

    /* renamed from: c */
    public final InterfaceC16581a f43317c;

    /* renamed from: d */
    public final byte[] f43318d;

    /* renamed from: e */
    public int f43319e;

    /* renamed from: o.ra8$a */
    public interface InterfaceC16581a {
        /* renamed from: a */
        void mo32496a(zwc zwcVar);
    }

    public ra8(dz4 dz4Var, int i, InterfaceC16581a interfaceC16581a) {
        op0.m42511a(i > 0);
        this.f43315a = dz4Var;
        this.f43316b = i;
        this.f43317c = interfaceC16581a;
        this.f43318d = new byte[1];
        this.f43319e = i;
    }

    @Override // p001o.dz4
    /* renamed from: b */
    public Map mo23959b() {
        return this.f43315a.mo23959b();
    }

    @Override // p001o.dz4
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f43315a.getUri();
    }

    @Override // p001o.dz4
    /* renamed from: j */
    public void mo23961j(juh juhVar) {
        op0.m42515e(juhVar);
        this.f43315a.mo23961j(juhVar);
    }

    /* renamed from: n */
    public final boolean m46475n() {
        if (this.f43315a.read(this.f43318d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f43318d[0] & Constants.MAX_HOST_LENGTH) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f43315a.read(bArr, i3, i2);
            if (i4 == -1) {
                return false;
            }
            i3 += i4;
            i2 -= i4;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f43317c.mo32496a(new zwc(bArr, i));
        }
        return true;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) {
        if (this.f43319e == 0) {
            if (!m46475n()) {
                return -1;
            }
            this.f43319e = this.f43316b;
        }
        int i3 = this.f43315a.read(bArr, i, Math.min(this.f43319e, i2));
        if (i3 != -1) {
            this.f43319e -= i3;
        }
        return i3;
    }
}
