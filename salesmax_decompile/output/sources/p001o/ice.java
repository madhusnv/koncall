package p001o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes2.dex */
public final class ice extends wb1 {

    /* renamed from: e */
    public final Context f28453e;

    /* renamed from: f */
    public iz4 f28454f;

    /* renamed from: g */
    public AssetFileDescriptor f28455g;

    /* renamed from: h */
    public InputStream f28456h;

    /* renamed from: i */
    public long f28457i;

    /* renamed from: j */
    public boolean f28458j;

    /* renamed from: o.ice$a */
    public static class C14252a extends fz4 {
        public C14252a(String str) {
            super(str, null, 2000);
        }

        public C14252a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public ice(Context context) {
        super(false);
        this.f28453e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* renamed from: r */
    public static AssetFileDescriptor m31907r(Context context, iz4 iz4Var) throws C14252a, Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = iz4Var.f29380a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C14252a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = m31908s(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C14252a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String strSubstring = (String) op0.m42515e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C14252a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, CastStatusCodes.APPLICATION_NOT_RUNNING);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = m31908s(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new C14252a("Resource not found.", null, CastStatusCodes.APPLICATION_NOT_RUNNING);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new C14252a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new C14252a(null, e2, CastStatusCodes.APPLICATION_NOT_RUNNING);
        }
    }

    /* renamed from: s */
    public static int m31908s(String str) throws C14252a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C14252a("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    @Override // p001o.dz4
    public void close() {
        this.f28454f = null;
        try {
            try {
                InputStream inputStream = this.f28456h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f28456h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f28455g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f28455g = null;
                        if (this.f28458j) {
                            this.f28458j = false;
                            m54153o();
                        }
                    }
                } catch (IOException e) {
                    throw new C14252a(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new C14252a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f28456h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f28455g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f28455g = null;
                    if (this.f28458j) {
                        this.f28458j = false;
                        m54153o();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C14252a(null, e3, 2000);
                }
            } finally {
                this.f28455g = null;
                if (this.f28458j) {
                    this.f28458j = false;
                    m54153o();
                }
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws fz4, Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.f28454f = iz4Var;
        m54154p(iz4Var);
        AssetFileDescriptor assetFileDescriptorM31907r = m31907r(this.f28453e, iz4Var);
        this.f28455g = assetFileDescriptorM31907r;
        long length = assetFileDescriptorM31907r.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f28455g.getFileDescriptor());
        this.f28456h = fileInputStream;
        if (length != -1) {
            try {
                if (iz4Var.f29386g > length) {
                    throw new C14252a(null, null, 2008);
                }
            } catch (C14252a e) {
                throw e;
            } catch (IOException e2) {
                throw new C14252a(null, e2, 2000);
            }
        }
        long startOffset = this.f28455g.getStartOffset();
        long jSkip = fileInputStream.skip(iz4Var.f29386g + startOffset) - startOffset;
        if (jSkip != iz4Var.f29386g) {
            throw new C14252a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f28457i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f28457i = size;
                if (size < 0) {
                    throw new C14252a(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.f28457i = j;
            if (j < 0) {
                throw new fz4(2008);
            }
        }
        long jMin = iz4Var.f29387h;
        if (jMin != -1) {
            long j2 = this.f28457i;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            this.f28457i = jMin;
        }
        this.f28458j = true;
        m54155q(iz4Var);
        long j3 = iz4Var.f29387h;
        return j3 != -1 ? j3 : this.f28457i;
    }

    @Override // p001o.dz4
    public Uri getUri() {
        iz4 iz4Var = this.f28454f;
        if (iz4Var != null) {
            return iz4Var.f29380a;
        }
        return null;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f28457i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C14252a(null, e, 2000);
            }
        }
        int i3 = ((InputStream) sqi.m48729h(this.f28456h)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f28457i == -1) {
                return -1;
            }
            throw new C14252a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f28457i;
        if (j2 != -1) {
            this.f28457i = j2 - i3;
        }
        m54152n(i3);
        return i3;
    }
}
