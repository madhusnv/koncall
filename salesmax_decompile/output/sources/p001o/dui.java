package p001o;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.mec;

/* loaded from: classes5.dex */
public class dui implements ioe {

    /* renamed from: d */
    public static final mec f20560d = mec.m38830a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C13040a());

    /* renamed from: e */
    public static final mec f20561e = mec.m38830a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C13041b());

    /* renamed from: f */
    public static final C13044e f20562f = new C13044e();

    /* renamed from: g */
    public static final List f20563g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC13045f f20564a;

    /* renamed from: b */
    public final mi1 f20565b;

    /* renamed from: c */
    public final C13044e f20566c;

    /* renamed from: o.dui$a */
    public class C13040a implements mec.InterfaceC15298b {

        /* renamed from: a */
        public final ByteBuffer f20567a = ByteBuffer.allocate(8);

        @Override // p001o.mec.InterfaceC15298b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23866a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f20567a) {
                this.f20567a.position(0);
                messageDigest.update(this.f20567a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: o.dui$b */
    public class C13041b implements mec.InterfaceC15298b {

        /* renamed from: a */
        public final ByteBuffer f20568a = ByteBuffer.allocate(4);

        @Override // p001o.mec.InterfaceC15298b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23866a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f20568a) {
                this.f20568a.position(0);
                messageDigest.update(this.f20568a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: o.dui$c */
    public static final class C13042c implements InterfaceC13045f {
        public C13042c() {
        }

        public /* synthetic */ C13042c(C13040a c13040a) {
            this();
        }

        @Override // p001o.dui.InterfaceC13045f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23869a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: o.dui$d */
    public static final class C13043d implements InterfaceC13045f {

        /* renamed from: o.dui$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f20569a;

            public a(ByteBuffer byteBuffer) {
                this.f20569a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f20569a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f20569a.limit()) {
                    return -1;
                }
                this.f20569a.position((int) j);
                int iMin = Math.min(i2, this.f20569a.remaining());
                this.f20569a.get(bArr, i, iMin);
                return iMin;
            }
        }

        @Override // p001o.dui.InterfaceC13045f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23869a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* renamed from: o.dui$e */
    public static class C13044e {
        /* renamed from: a */
        public MediaMetadataRetriever m23872a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: o.dui$f */
    public interface InterfaceC13045f {
        /* renamed from: a */
        void mo23869a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: o.dui$g */
    public static final class C13046g implements InterfaceC13045f {
        @Override // p001o.dui.InterfaceC13045f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23869a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: o.dui$h */
    public static final class C13047h extends RuntimeException {
        public C13047h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public dui(mi1 mi1Var, InterfaceC13045f interfaceC13045f) {
        this(mi1Var, interfaceC13045f, f20562f);
    }

    /* renamed from: c */
    public static ioe m23856c(mi1 mi1Var) {
        return new dui(mi1Var, new C13042c(null));
    }

    /* renamed from: d */
    public static ioe m23857d(mi1 mi1Var) {
        return new dui(mi1Var, new C13043d());
    }

    /* renamed from: e */
    public static Bitmap m23858e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m23863j()) {
            return bitmap;
        }
        boolean z = false;
        try {
            if (m23862i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z = true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        if (!z) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: f */
    public static Bitmap m23859f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, mx5 mx5Var) {
        Bitmap bitmapM23861h = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || mx5Var == mx5.f36068f) ? null : m23861h(mediaMetadataRetriever, j, i, i2, i3, mx5Var);
        if (bitmapM23861h == null) {
            bitmapM23861h = m23860g(mediaMetadataRetriever, j, i);
        }
        Bitmap bitmapM23858e = m23858e(mediaMetadataRetriever, bitmapM23861h);
        if (bitmapM23858e != null) {
            return bitmapM23858e;
        }
        throw new C13047h();
    }

    /* renamed from: g */
    public static Bitmap m23860g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: h */
    public static Bitmap m23861h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, mx5 mx5Var) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fMo39755b = mx5Var.mo39755b(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fMo39755b), Math.round(fMo39755b * i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m23862i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i = Integer.parseInt(strExtractMetadata);
        return (i == 7 || i == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* renamed from: j */
    public static boolean m23863j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m23864k();
        }
        int i = Build.VERSION.SDK_INT;
        return i >= 30 && i < 33;
    }

    /* renamed from: k */
    public static boolean m23864k() {
        Iterator it = f20563g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static ioe m23865l(mi1 mi1Var) {
        return new dui(mi1Var, new C13046g());
    }

    @Override // p001o.ioe
    /* renamed from: a */
    public boolean mo16415a(Object obj, rec recVar) {
        return true;
    }

    @Override // p001o.ioe
    /* renamed from: b */
    public zne mo16416b(Object obj, int i, int i2, rec recVar) throws IOException {
        long jLongValue = ((Long) recVar.m46585c(f20560d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) recVar.m46585c(f20561e);
        if (num == null) {
            num = 2;
        }
        mx5 mx5Var = (mx5) recVar.m46585c(mx5.f36070h);
        if (mx5Var == null) {
            mx5Var = mx5.f36069g;
        }
        mx5 mx5Var2 = mx5Var;
        MediaMetadataRetriever mediaMetadataRetrieverM23872a = this.f20566c.m23872a();
        try {
            this.f20564a.mo23869a(mediaMetadataRetrieverM23872a, obj);
            return oi1.m42257d(m23859f(mediaMetadataRetrieverM23872a, jLongValue, num.intValue(), i, i2, mx5Var2), this.f20565b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverM23872a.release();
            } else {
                mediaMetadataRetrieverM23872a.release();
            }
        }
    }

    public dui(mi1 mi1Var, InterfaceC13045f interfaceC13045f, C13044e c13044e) {
        this.f20565b = mi1Var;
        this.f20564a = interfaceC13045f;
        this.f20566c = c13044e;
    }
}
