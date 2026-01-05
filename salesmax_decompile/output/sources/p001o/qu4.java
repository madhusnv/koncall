package p001o;

import android.net.Uri;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class qu4 extends wb1 {

    /* renamed from: e */
    public iz4 f42411e;

    /* renamed from: f */
    public byte[] f42412f;

    /* renamed from: g */
    public int f42413g;

    /* renamed from: h */
    public int f42414h;

    public qu4() {
        super(false);
    }

    @Override // p001o.dz4
    public void close() {
        if (this.f42412f != null) {
            this.f42412f = null;
            m54153o();
        }
        this.f42411e = null;
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws fz4, byc {
        m54154p(iz4Var);
        this.f42411e = iz4Var;
        Uri uriNormalizeScheme = iz4Var.f29380a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        op0.m42512b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrI1 = sqi.i1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrI1.length != 2) {
            throw byc.m19922b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrI1[1];
        if (strArrI1[0].contains(";base64")) {
            try {
                this.f42412f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw byc.m19922b("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f42412f = sqi.t0(URLDecoder.decode(str, uh2.f48929a.name()));
        }
        long j = iz4Var.f29386g;
        byte[] bArr = this.f42412f;
        if (j > bArr.length) {
            this.f42412f = null;
            throw new fz4(2008);
        }
        int i = (int) j;
        this.f42413g = i;
        int length = bArr.length - i;
        this.f42414h = length;
        long j2 = iz4Var.f29387h;
        if (j2 != -1) {
            this.f42414h = (int) Math.min(length, j2);
        }
        m54155q(iz4Var);
        long j3 = iz4Var.f29387h;
        return j3 != -1 ? j3 : this.f42414h;
    }

    @Override // p001o.dz4
    public Uri getUri() {
        iz4 iz4Var = this.f42411e;
        if (iz4Var != null) {
            return iz4Var.f29380a;
        }
        return null;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f42414h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(sqi.m48729h(this.f42412f), this.f42413g, bArr, i, iMin);
        this.f42413g += iMin;
        this.f42414h -= iMin;
        m54152n(iMin);
        return iMin;
    }
}
