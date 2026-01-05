package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class v14 extends wb1 {

    /* renamed from: e */
    public final ContentResolver f49741e;

    /* renamed from: f */
    public Uri f49742f;

    /* renamed from: g */
    public AssetFileDescriptor f49743g;

    /* renamed from: h */
    public FileInputStream f49744h;

    /* renamed from: i */
    public long f49745i;

    /* renamed from: j */
    public boolean f49746j;

    /* renamed from: o.v14$a */
    public static class C17491a extends fz4 {
        public C17491a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public v14(Context context) {
        super(false);
        this.f49741e = context.getContentResolver();
    }

    @Override // p001o.dz4
    public void close() {
        this.f49742f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f49744h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f49744h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f49743g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f49743g = null;
                        if (this.f49746j) {
                            this.f49746j = false;
                            m54153o();
                        }
                    }
                } catch (IOException e) {
                    throw new C17491a(e, 2000);
                }
            } catch (IOException e2) {
                throw new C17491a(e2, 2000);
            }
        } catch (Throwable th) {
            this.f49744h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f49743g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f49743g = null;
                    if (this.f49746j) {
                        this.f49746j = false;
                        m54153o();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C17491a(e3, 2000);
                }
            } finally {
                this.f49743g = null;
                if (this.f49746j) {
                    this.f49746j = false;
                    m54153o();
                }
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = iz4Var.f29380a.normalizeScheme();
            this.f49742f = uriNormalizeScheme;
            m54154p(iz4Var);
            if (FirebaseAnalytics.Param.CONTENT.equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f49741e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f49741e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f49743g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C17491a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f49744h = fileInputStream;
            if (length != -1 && iz4Var.f29386g > length) {
                throw new C17491a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(iz4Var.f29386g + startOffset) - startOffset;
            if (jSkip != iz4Var.f29386g) {
                throw new C17491a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f49745i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f49745i = jPosition;
                    if (jPosition < 0) {
                        throw new C17491a(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f49745i = j;
                if (j < 0) {
                    throw new C17491a(null, 2008);
                }
            }
            long jMin = iz4Var.f29387h;
            if (jMin != -1) {
                long j2 = this.f49745i;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f49745i = jMin;
            }
            this.f49746j = true;
            m54155q(iz4Var);
            long j3 = iz4Var.f29387h;
            return j3 != -1 ? j3 : this.f49745i;
        } catch (C17491a e) {
            throw e;
        } catch (IOException e2) {
            throw new C17491a(e2, e2 instanceof FileNotFoundException ? CastStatusCodes.APPLICATION_NOT_RUNNING : 2000);
        }
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f49742f;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f49745i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C17491a(e, 2000);
            }
        }
        int i3 = ((FileInputStream) sqi.m48729h(this.f49744h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f49745i;
        if (j2 != -1) {
            this.f49745i = j2 - i3;
        }
        m54152n(i3);
        return i3;
    }
}
