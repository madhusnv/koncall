package p001o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class pp0 extends wb1 {

    /* renamed from: e */
    public final AssetManager f40355e;

    /* renamed from: f */
    public Uri f40356f;

    /* renamed from: g */
    public InputStream f40357g;

    /* renamed from: h */
    public long f40358h;

    /* renamed from: i */
    public boolean f40359i;

    /* renamed from: o.pp0$a */
    public static final class C16151a extends fz4 {
        public C16151a(Throwable th, int i) {
            super(th, i);
        }
    }

    public pp0(Context context) {
        super(false);
        this.f40355e = context.getAssets();
    }

    @Override // p001o.dz4
    public void close() {
        this.f40356f = null;
        try {
            try {
                InputStream inputStream = this.f40357g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C16151a(e, 2000);
            }
        } finally {
            this.f40357g = null;
            if (this.f40359i) {
                this.f40359i = false;
                m54153o();
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws IOException {
        try {
            Uri uri = iz4Var.f29380a;
            this.f40356f = uri;
            String strSubstring = (String) op0.m42515e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            m54154p(iz4Var);
            InputStream inputStreamOpen = this.f40355e.open(strSubstring, 1);
            this.f40357g = inputStreamOpen;
            if (inputStreamOpen.skip(iz4Var.f29386g) < iz4Var.f29386g) {
                throw new C16151a(null, 2008);
            }
            long j = iz4Var.f29387h;
            if (j != -1) {
                this.f40358h = j;
            } else {
                long jAvailable = this.f40357g.available();
                this.f40358h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f40358h = -1L;
                }
            }
            this.f40359i = true;
            m54155q(iz4Var);
            return this.f40358h;
        } catch (C16151a e) {
            throw e;
        } catch (IOException e2) {
            throw new C16151a(e2, e2 instanceof FileNotFoundException ? CastStatusCodes.APPLICATION_NOT_RUNNING : 2000);
        }
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f40356f;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f40358h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C16151a(e, 2000);
            }
        }
        int i3 = ((InputStream) sqi.m48729h(this.f40357g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f40358h;
        if (j2 != -1) {
            this.f40358h = j2 - i3;
        }
        m54152n(i3);
        return i3;
    }
}
