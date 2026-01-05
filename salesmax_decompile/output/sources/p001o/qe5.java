package p001o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public final class qe5 implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f41770a = "Exif\u0000\u0000".getBytes(Charset.forName(HTTP.UTF_8));

    /* renamed from: b */
    public static final int[] f41771b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: o.qe5$a */
    public static final class C16358a implements InterfaceC16360c {

        /* renamed from: a */
        public final ByteBuffer f41772a;

        public C16358a(ByteBuffer byteBuffer) {
            this.f41772a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: a */
        public int mo45260a() {
            return (mo45262c() << 8) | mo45262c();
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: b */
        public int mo45261b(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f41772a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f41772a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: c */
        public short mo45262c() throws InterfaceC16360c.a {
            if (this.f41772a.remaining() >= 1) {
                return (short) (this.f41772a.get() & 255);
            }
            throw new InterfaceC16360c.a();
        }

        @Override // p001o.qe5.InterfaceC16360c
        public long skip(long j) {
            int iMin = (int) Math.min(this.f41772a.remaining(), j);
            ByteBuffer byteBuffer = this.f41772a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: o.qe5$b */
    public static final class C16359b {

        /* renamed from: a */
        public final ByteBuffer f41773a;

        public C16359b(byte[] bArr, int i) {
            this.f41773a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m45263a(int i) {
            if (m45265c(i, 2)) {
                return this.f41773a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m45264b(int i) {
            if (m45265c(i, 4)) {
                return this.f41773a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m45265c(int i, int i2) {
            return this.f41773a.remaining() - i >= i2;
        }

        /* renamed from: d */
        public int m45266d() {
            return this.f41773a.remaining();
        }

        /* renamed from: e */
        public void m45267e(ByteOrder byteOrder) {
            this.f41773a.order(byteOrder);
        }
    }

    /* renamed from: o.qe5$c */
    public interface InterfaceC16360c {

        /* renamed from: o.qe5$c$a */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo45260a();

        /* renamed from: b */
        int mo45261b(byte[] bArr, int i);

        /* renamed from: c */
        short mo45262c();

        long skip(long j);
    }

    /* renamed from: o.qe5$d */
    public static final class C16361d implements InterfaceC16360c {

        /* renamed from: a */
        public final InputStream f41774a;

        public C16361d(InputStream inputStream) {
            this.f41774a = inputStream;
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: a */
        public int mo45260a() {
            return (mo45262c() << 8) | mo45262c();
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: b */
        public int mo45261b(byte[] bArr, int i) throws InterfaceC16360c.a {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f41774a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new InterfaceC16360c.a();
            }
            return i2;
        }

        @Override // p001o.qe5.InterfaceC16360c
        /* renamed from: c */
        public short mo45262c() throws IOException {
            int i = this.f41774a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new InterfaceC16360c.a();
        }

        @Override // p001o.qe5.InterfaceC16360c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f41774a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f41774a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    public static int m45251e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: h */
    public static boolean m45252h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: k */
    public static int m45253k(C16359b c16359b) {
        ByteOrder byteOrder;
        short sM45263a = c16359b.m45263a(6);
        if (sM45263a != 18761) {
            if (sM45263a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append((int) sM45263a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c16359b.m45267e(byteOrder);
        int iM45264b = c16359b.m45264b(10) + 6;
        short sM45263a2 = c16359b.m45263a(iM45264b);
        for (int i = 0; i < sM45263a2; i++) {
            int iM45251e = m45251e(iM45264b, i);
            short sM45263a3 = c16359b.m45263a(iM45251e);
            if (sM45263a3 == 274) {
                short sM45263a4 = c16359b.m45263a(iM45251e + 2);
                if (sM45263a4 >= 1 && sM45263a4 <= 12) {
                    int iM45264b2 = c16359b.m45264b(iM45251e + 4);
                    if (iM45264b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) sM45263a3);
                            sb2.append(" formatCode=");
                            sb2.append((int) sM45263a4);
                            sb2.append(" componentCount=");
                            sb2.append(iM45264b2);
                        }
                        int i2 = iM45264b2 + f41771b[sM45263a4];
                        if (i2 <= 4) {
                            int i3 = iM45251e + 8;
                            if (i3 >= 0 && i3 <= c16359b.m45266d()) {
                                if (i2 >= 0 && i2 + i3 <= c16359b.m45266d()) {
                                    return c16359b.m45263a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal number of bytes for TI tag data tagType=");
                                    sb3.append((int) sM45263a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Illegal tagValueOffset=");
                                sb4.append(i3);
                                sb4.append(" tagType=");
                                sb4.append((int) sM45263a3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append((int) sM45263a4);
                        }
                    } else {
                        continue;
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) sM45263a4);
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo12685a(ByteBuffer byteBuffer, wo0 wo0Var) {
        return m45254f(new C16358a((ByteBuffer) bgd.m18886d(byteBuffer)), (wo0) bgd.m18886d(wo0Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo12686b(ByteBuffer byteBuffer) {
        return m45255g(new C16358a((ByteBuffer) bgd.m18886d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo12687c(InputStream inputStream, wo0 wo0Var) {
        return m45254f(new C16361d((InputStream) bgd.m18886d(inputStream)), (wo0) bgd.m18886d(wo0Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo12688d(InputStream inputStream) {
        return m45255g(new C16361d((InputStream) bgd.m18886d(inputStream)));
    }

    /* renamed from: f */
    public final int m45254f(InterfaceC16360c interfaceC16360c, wo0 wo0Var) {
        try {
            int iMo45260a = interfaceC16360c.mo45260a();
            if (!m45252h(iMo45260a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(iMo45260a);
                }
                return -1;
            }
            int iM45257j = m45257j(interfaceC16360c);
            if (iM45257j == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) wo0Var.mo46964c(iM45257j, byte[].class);
            try {
                return m45258l(interfaceC16360c, bArr, iM45257j);
            } finally {
                wo0Var.mo46966e(bArr);
            }
        } catch (InterfaceC16360c.a unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m45255g(InterfaceC16360c interfaceC16360c) {
        try {
            int iMo45260a = interfaceC16360c.mo45260a();
            if (iMo45260a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo45262c = (iMo45260a << 8) | interfaceC16360c.mo45262c();
            if (iMo45262c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo45262c2 = (iMo45262c << 8) | interfaceC16360c.mo45262c();
            if (iMo45262c2 == -1991225785) {
                interfaceC16360c.skip(21L);
                try {
                    return interfaceC16360c.mo45262c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (InterfaceC16360c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo45262c2 != 1380533830) {
                return m45259m(interfaceC16360c, iMo45262c2) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
            interfaceC16360c.skip(4L);
            if (((interfaceC16360c.mo45260a() << 16) | interfaceC16360c.mo45260a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo45260a2 = (interfaceC16360c.mo45260a() << 16) | interfaceC16360c.mo45260a();
            if ((iMo45260a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iMo45260a2 & Constants.MAX_HOST_LENGTH;
            if (i == 88) {
                interfaceC16360c.skip(4L);
                short sMo45262c = interfaceC16360c.mo45262c();
                return (sMo45262c & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sMo45262c & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            interfaceC16360c.skip(4L);
            return (interfaceC16360c.mo45262c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (InterfaceC16360c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m45256i(byte[] bArr, int i) {
        boolean z = bArr != null && i > f41770a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f41770a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final int m45257j(InterfaceC16360c interfaceC16360c) {
        short sMo45262c;
        int iMo45260a;
        long j;
        long jSkip;
        do {
            short sMo45262c2 = interfaceC16360c.mo45262c();
            if (sMo45262c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) sMo45262c2);
                }
                return -1;
            }
            sMo45262c = interfaceC16360c.mo45262c();
            if (sMo45262c == 218 || sMo45262c == 217) {
                return -1;
            }
            iMo45260a = interfaceC16360c.mo45260a() - 2;
            if (sMo45262c == 225) {
                return iMo45260a;
            }
            j = iMo45260a;
            jSkip = interfaceC16360c.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) sMo45262c);
            sb2.append(", wanted to skip: ");
            sb2.append(iMo45260a);
            sb2.append(", but actually skipped: ");
            sb2.append(jSkip);
        }
        return -1;
    }

    /* renamed from: l */
    public final int m45258l(InterfaceC16360c interfaceC16360c, byte[] bArr, int i) {
        int iMo45261b = interfaceC16360c.mo45261b(bArr, i);
        if (iMo45261b == i) {
            if (m45256i(bArr, i)) {
                return m45253k(new C16359b(bArr, i));
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to read exif segment data, length: ");
            sb.append(i);
            sb.append(", actually read: ");
            sb.append(iMo45261b);
        }
        return -1;
    }

    /* renamed from: m */
    public final boolean m45259m(InterfaceC16360c interfaceC16360c, int i) {
        if (((interfaceC16360c.mo45260a() << 16) | interfaceC16360c.mo45260a()) != 1718909296) {
            return false;
        }
        int iMo45260a = (interfaceC16360c.mo45260a() << 16) | interfaceC16360c.mo45260a();
        if (iMo45260a == 1635150182 || iMo45260a == 1635150195) {
            return true;
        }
        interfaceC16360c.skip(4L);
        int i2 = i - 16;
        if (i2 % 4 != 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && i2 > 0) {
            int iMo45260a2 = (interfaceC16360c.mo45260a() << 16) | interfaceC16360c.mo45260a();
            if (iMo45260a2 == 1635150182 || iMo45260a2 == 1635150195) {
                return true;
            }
            i3++;
            i2 -= 4;
        }
        return false;
    }
}
