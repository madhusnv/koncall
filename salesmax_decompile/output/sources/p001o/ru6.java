package p001o;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class ru6 extends wb1 {

    /* renamed from: e */
    public RandomAccessFile f44073e;

    /* renamed from: f */
    public Uri f44074f;

    /* renamed from: g */
    public long f44075g;

    /* renamed from: h */
    public boolean f44076h;

    /* renamed from: o.ru6$a */
    public static final class C16670a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m47165b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: o.ru6$b */
    public static class C16671b extends fz4 {
        public C16671b(Throwable th, int i) {
            super(th, i);
        }

        public C16671b(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public ru6() {
        super(false);
    }

    /* renamed from: r */
    public static RandomAccessFile m47163r(Uri uri) throws C16671b {
        int i = CastStatusCodes.MESSAGE_TOO_LARGE;
        try {
            return new RandomAccessFile((String) op0.m42515e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C16671b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            if (sqi.f45790a < 21 || !C16670a.m47165b(e.getCause())) {
                i = CastStatusCodes.APPLICATION_NOT_RUNNING;
            }
            throw new C16671b(e, i);
        } catch (SecurityException e2) {
            throw new C16671b(e2, CastStatusCodes.MESSAGE_TOO_LARGE);
        } catch (RuntimeException e3) {
            throw new C16671b(e3, 2000);
        }
    }

    @Override // p001o.dz4
    public void close() {
        this.f44074f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f44073e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C16671b(e, 2000);
            }
        } finally {
            this.f44073e = null;
            if (this.f44076h) {
                this.f44076h = false;
                m54153o();
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws IOException {
        Uri uri = iz4Var.f29380a;
        this.f44074f = uri;
        m54154p(iz4Var);
        RandomAccessFile randomAccessFileM47163r = m47163r(uri);
        this.f44073e = randomAccessFileM47163r;
        try {
            randomAccessFileM47163r.seek(iz4Var.f29386g);
            long length = iz4Var.f29387h;
            if (length == -1) {
                length = this.f44073e.length() - iz4Var.f29386g;
            }
            this.f44075g = length;
            if (length < 0) {
                throw new C16671b(null, null, 2008);
            }
            this.f44076h = true;
            m54155q(iz4Var);
            return this.f44075g;
        } catch (IOException e) {
            throw new C16671b(e, 2000);
        }
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f44074f;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f44075g == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) sqi.m48729h(this.f44073e)).read(bArr, i, (int) Math.min(this.f44075g, i2));
            if (i3 > 0) {
                this.f44075g -= i3;
                m54152n(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C16671b(e, 2000);
        }
    }
}
