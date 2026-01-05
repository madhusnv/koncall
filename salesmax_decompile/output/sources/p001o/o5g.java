package p001o;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o5g implements dz4 {

    /* renamed from: a */
    public final dz4 f37805a;

    /* renamed from: b */
    public long f37806b;

    /* renamed from: c */
    public Uri f37807c = Uri.EMPTY;

    /* renamed from: d */
    public Map f37808d = Collections.emptyMap();

    public o5g(dz4 dz4Var) {
        this.f37805a = (dz4) op0.m42515e(dz4Var);
    }

    @Override // p001o.dz4
    /* renamed from: b */
    public Map mo23959b() {
        return this.f37805a.mo23959b();
    }

    @Override // p001o.dz4
    public void close() {
        this.f37805a.close();
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) {
        this.f37807c = iz4Var.f29380a;
        this.f37808d = Collections.emptyMap();
        long jMo23960e = this.f37805a.mo23960e(iz4Var);
        this.f37807c = (Uri) op0.m42515e(getUri());
        this.f37808d = mo23959b();
        return jMo23960e;
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f37805a.getUri();
    }

    @Override // p001o.dz4
    /* renamed from: j */
    public void mo23961j(juh juhVar) {
        op0.m42515e(juhVar);
        this.f37805a.mo23961j(juhVar);
    }

    /* renamed from: n */
    public long m41627n() {
        return this.f37806b;
    }

    /* renamed from: o */
    public Uri m41628o() {
        return this.f37807c;
    }

    /* renamed from: p */
    public Map m41629p() {
        return this.f37808d;
    }

    /* renamed from: q */
    public void m41630q() {
        this.f37806b = 0L;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f37805a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f37806b += i3;
        }
        return i3;
    }
}
