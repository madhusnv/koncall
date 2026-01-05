package p001o;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;
import p001o.km6;

/* loaded from: classes2.dex */
public class im6 {

    /* renamed from: U */
    public static SimpleDateFormat f28858U;

    /* renamed from: V */
    public static SimpleDateFormat f28859V;

    /* renamed from: Z */
    public static final C14323e[] f28863Z;
    public static final C14323e[] a0;
    public static final C14323e[] b0;
    public static final C14323e[] c0;
    public static final C14323e[] d0;
    public static final C14323e e0;
    public static final C14323e[] f0;
    public static final C14323e[] g0;
    public static final C14323e[] h0;
    public static final C14323e[] i0;
    public static final C14323e[][] j0;
    public static final C14323e[] k0;
    public static final HashMap[] l0;
    public static final HashMap[] m0;
    public static final HashSet n0;
    public static final HashMap o0;
    public static final Charset p0;
    public static final byte[] q0;
    public static final byte[] r0;
    public static final Pattern s0;
    public static final Pattern t0;
    public static final Pattern u0;
    public static final Pattern v0;

    /* renamed from: a */
    public String f28869a;

    /* renamed from: b */
    public FileDescriptor f28870b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f28871c;

    /* renamed from: d */
    public int f28872d;

    /* renamed from: e */
    public boolean f28873e;

    /* renamed from: f */
    public final HashMap[] f28874f;

    /* renamed from: g */
    public Set f28875g;

    /* renamed from: h */
    public ByteOrder f28876h;

    /* renamed from: i */
    public boolean f28877i;

    /* renamed from: j */
    public boolean f28878j;

    /* renamed from: k */
    public boolean f28879k;

    /* renamed from: l */
    public int f28880l;

    /* renamed from: m */
    public int f28881m;

    /* renamed from: n */
    public byte[] f28882n;

    /* renamed from: o */
    public int f28883o;

    /* renamed from: p */
    public int f28884p;

    /* renamed from: q */
    public int f28885q;

    /* renamed from: r */
    public int f28886r;

    /* renamed from: s */
    public int f28887s;

    /* renamed from: t */
    public boolean f28888t;

    /* renamed from: u */
    public boolean f28889u;

    /* renamed from: v */
    public static final boolean f28864v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    public static final List f28865w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    public static final List f28866x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f28867y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f28868z = {4};

    /* renamed from: A */
    public static final int[] f28838A = {8};

    /* renamed from: B */
    public static final byte[] f28839B = {-1, -40, -1};

    /* renamed from: C */
    public static final byte[] f28840C = {102, 116, 121, 112};

    /* renamed from: D */
    public static final byte[] f28841D = {109, 105, 102, 49};

    /* renamed from: E */
    public static final byte[] f28842E = {104, 101, 105, 99};

    /* renamed from: F */
    public static final byte[] f28843F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    public static final byte[] f28844G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    public static final byte[] f28845H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    public static final byte[] f28846I = {101, 88, 73, 102};

    /* renamed from: J */
    public static final byte[] f28847J = {73, 72, 68, 82};

    /* renamed from: K */
    public static final byte[] f28848K = {73, 69, 78, 68};

    /* renamed from: L */
    public static final byte[] f28849L = {82, 73, 70, 70};

    /* renamed from: M */
    public static final byte[] f28850M = {87, 69, 66, 80};

    /* renamed from: N */
    public static final byte[] f28851N = {69, 88, 73, 70};

    /* renamed from: O */
    public static final byte[] f28852O = {-99, 1, 42};

    /* renamed from: P */
    public static final byte[] f28853P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f28854Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final byte[] f28855R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final byte[] f28856S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final byte[] f28857T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    public static final String[] f28860W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    public static final int[] f28861X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    public static final byte[] f28862Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: o.im6$a */
    public class C14319a extends MediaDataSource {

        /* renamed from: a */
        public long f28890a;

        /* renamed from: b */
        public final /* synthetic */ C14325g f28891b;

        public C14319a(C14325g c14325g) {
            this.f28891b = c14325g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f28890a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f28891b.available()) {
                        return -1;
                    }
                    this.f28891b.m32399g(j);
                    this.f28890a = j;
                }
                if (i2 > this.f28891b.available()) {
                    i2 = this.f28891b.available();
                }
                int i3 = this.f28891b.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f28890a += i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f28890a = -1L;
            return -1;
        }
    }

    /* renamed from: o.im6$b */
    public static class C14320b extends InputStream implements DataInput {

        /* renamed from: e */
        public static final ByteOrder f28893e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        public static final ByteOrder f28894f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public final DataInputStream f28895a;

        /* renamed from: b */
        public ByteOrder f28896b;

        /* renamed from: c */
        public int f28897c;

        /* renamed from: d */
        public byte[] f28898d;

        public C14320b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m32371a() {
            return this.f28897c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f28895a.available();
        }

        /* renamed from: c */
        public long m32372c() {
            return readInt() & 4294967295L;
        }

        /* renamed from: d */
        public void m32373d(ByteOrder byteOrder) {
            this.f28896b = byteOrder;
        }

        /* renamed from: f */
        public void m32374f(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f28895a.skip(i3);
                if (iSkip <= 0) {
                    if (this.f28898d == null) {
                        this.f28898d = new byte[8192];
                    }
                    iSkip = this.f28895a.read(this.f28898d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.f28897c += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f28897c++;
            return this.f28895a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f28897c++;
            return this.f28895a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f28897c++;
            int i = this.f28895a.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f28897c += 2;
            return this.f28895a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f28897c += i2;
            this.f28895a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f28897c += 4;
            int i = this.f28895a.read();
            int i2 = this.f28895a.read();
            int i3 = this.f28895a.read();
            int i4 = this.f28895a.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28896b;
            if (byteOrder == f28893e) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f28894f) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f28896b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f28897c += 8;
            int i = this.f28895a.read();
            int i2 = this.f28895a.read();
            int i3 = this.f28895a.read();
            int i4 = this.f28895a.read();
            int i5 = this.f28895a.read();
            int i6 = this.f28895a.read();
            int i7 = this.f28895a.read();
            int i8 = this.f28895a.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28896b;
            if (byteOrder == f28893e) {
                return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f28894f) {
                return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
            }
            throw new IOException("Invalid byte order: " + this.f28896b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f28897c += 2;
            int i = this.f28895a.read();
            int i2 = this.f28895a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28896b;
            if (byteOrder == f28893e) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f28894f) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f28896b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f28897c += 2;
            return this.f28895a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f28897c++;
            return this.f28895a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f28897c += 2;
            int i = this.f28895a.read();
            int i2 = this.f28895a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28896b;
            if (byteOrder == f28893e) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f28894f) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f28896b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C14320b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C14320b(InputStream inputStream, ByteOrder byteOrder) {
            this.f28896b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f28895a = dataInputStream;
            dataInputStream.mark(0);
            this.f28897c = 0;
            this.f28896b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f28895a.read(bArr, i, i2);
            this.f28897c += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f28897c += bArr.length;
            this.f28895a.readFully(bArr);
        }
    }

    /* renamed from: o.im6$c */
    public static class C14321c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f28899a;

        /* renamed from: b */
        public ByteOrder f28900b;

        public C14321c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f28899a = outputStream;
            this.f28900b = byteOrder;
        }

        /* renamed from: a */
        public void m32375a(ByteOrder byteOrder) {
            this.f28900b = byteOrder;
        }

        /* renamed from: c */
        public void m32376c(int i) throws IOException {
            this.f28899a.write(i);
        }

        /* renamed from: d */
        public void m32377d(int i) throws IOException {
            ByteOrder byteOrder = this.f28900b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f28899a.write((i >>> 0) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 8) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 16) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 24) & Constants.MAX_HOST_LENGTH);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f28899a.write((i >>> 24) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 16) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 8) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((i >>> 0) & Constants.MAX_HOST_LENGTH);
            }
        }

        /* renamed from: f */
        public void m32378f(short s) throws IOException {
            ByteOrder byteOrder = this.f28900b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f28899a.write((s >>> 0) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((s >>> 8) & Constants.MAX_HOST_LENGTH);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f28899a.write((s >>> 8) & Constants.MAX_HOST_LENGTH);
                this.f28899a.write((s >>> 0) & Constants.MAX_HOST_LENGTH);
            }
        }

        /* renamed from: g */
        public void m32379g(long j) throws IOException {
            m32377d((int) j);
        }

        /* renamed from: h */
        public void m32380h(int i) throws IOException {
            m32378f((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f28899a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f28899a.write(bArr, i, i2);
        }
    }

    /* renamed from: o.im6$d */
    public static class C14322d {

        /* renamed from: a */
        public final int f28901a;

        /* renamed from: b */
        public final int f28902b;

        /* renamed from: c */
        public final long f28903c;

        /* renamed from: d */
        public final byte[] f28904d;

        public C14322d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C14322d m32381a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C14322d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(im6.p0);
            return new C14322d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C14322d m32382b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new C14322d(12, dArr.length, byteBufferWrap.array());
        }

        /* renamed from: c */
        public static C14322d m32383c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new C14322d(9, iArr.length, byteBufferWrap.array());
        }

        /* renamed from: d */
        public static C14322d m32384d(C14324f[] c14324fArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[10] * c14324fArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C14324f c14324f : c14324fArr) {
                byteBufferWrap.putInt((int) c14324f.f28909a);
                byteBufferWrap.putInt((int) c14324f.f28910b);
            }
            return new C14322d(10, c14324fArr.length, byteBufferWrap.array());
        }

        /* renamed from: e */
        public static C14322d m32385e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(im6.p0);
            return new C14322d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C14322d m32386f(long j, ByteOrder byteOrder) {
            return m32387g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C14322d m32387g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new C14322d(4, jArr.length, byteBufferWrap.array());
        }

        /* renamed from: h */
        public static C14322d m32388h(C14324f c14324f, ByteOrder byteOrder) {
            return m32389i(new C14324f[]{c14324f}, byteOrder);
        }

        /* renamed from: i */
        public static C14322d m32389i(C14324f[] c14324fArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[5] * c14324fArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C14324f c14324f : c14324fArr) {
                byteBufferWrap.putInt((int) c14324f.f28909a);
                byteBufferWrap.putInt((int) c14324f.f28910b);
            }
            return new C14322d(5, c14324fArr.length, byteBufferWrap.array());
        }

        /* renamed from: j */
        public static C14322d m32390j(int i, ByteOrder byteOrder) {
            return m32391k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C14322d m32391k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[im6.f28861X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new C14322d(3, iArr.length, byteBufferWrap.array());
        }

        /* renamed from: l */
        public double m32392l(ByteOrder byteOrder) throws Throwable {
            Object objM32395o = m32395o(byteOrder);
            if (objM32395o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM32395o instanceof String) {
                return Double.parseDouble((String) objM32395o);
            }
            if (objM32395o instanceof long[]) {
                if (((long[]) objM32395o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM32395o instanceof int[]) {
                if (((int[]) objM32395o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM32395o instanceof double[]) {
                double[] dArr = (double[]) objM32395o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM32395o instanceof C14324f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            C14324f[] c14324fArr = (C14324f[]) objM32395o;
            if (c14324fArr.length == 1) {
                return c14324fArr[0].m32398a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: m */
        public int m32393m(ByteOrder byteOrder) throws Throwable {
            Object objM32395o = m32395o(byteOrder);
            if (objM32395o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM32395o instanceof String) {
                return Integer.parseInt((String) objM32395o);
            }
            if (objM32395o instanceof long[]) {
                long[] jArr = (long[]) objM32395o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM32395o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM32395o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: n */
        public String m32394n(ByteOrder byteOrder) throws Throwable {
            Object objM32395o = m32395o(byteOrder);
            if (objM32395o == null) {
                return null;
            }
            if (objM32395o instanceof String) {
                return (String) objM32395o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM32395o instanceof long[]) {
                long[] jArr = (long[]) objM32395o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM32395o instanceof int[]) {
                int[] iArr = (int[]) objM32395o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM32395o instanceof double[]) {
                double[] dArr = (double[]) objM32395o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM32395o instanceof C14324f[])) {
                return null;
            }
            C14324f[] c14324fArr = (C14324f[]) objM32395o;
            while (i < c14324fArr.length) {
                sb.append(c14324fArr[i].f28909a);
                sb.append('/');
                sb.append(c14324fArr[i].f28910b);
                i++;
                if (i != c14324fArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* renamed from: o */
        public Object m32395o(ByteOrder byteOrder) throws Throwable {
            C14320b c14320b;
            byte b;
            byte b2;
            byte[] bArr;
            C14320b c14320b2 = null;
            try {
                c14320b = new C14320b(this.f28904d);
                try {
                    c14320b.m32373d(byteOrder);
                    int length = 0;
                    boolean z = true;
                    switch (this.f28901a) {
                        case 1:
                        case 6:
                            byte[] bArr2 = this.f28904d;
                            if (bArr2.length != 1 || (b = bArr2[0]) < 0 || b > 1) {
                                String str = new String(bArr2, im6.p0);
                                try {
                                    c14320b.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c14320b.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f28902b >= im6.f28862Y.length) {
                                int i = 0;
                                while (true) {
                                    bArr = im6.f28862Y;
                                    if (i < bArr.length) {
                                        if (this.f28904d[i] != bArr[i]) {
                                            z = false;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                if (z) {
                                    length = bArr.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.f28902b && (b2 = this.f28904d[length]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string = sb.toString();
                            try {
                                c14320b.close();
                            } catch (IOException unused3) {
                            }
                            return string;
                        case 3:
                            int[] iArr = new int[this.f28902b];
                            while (length < this.f28902b) {
                                iArr[length] = c14320b.readUnsignedShort();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f28902b];
                            while (length < this.f28902b) {
                                jArr[length] = c14320b.m32372c();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            C14324f[] c14324fArr = new C14324f[this.f28902b];
                            while (length < this.f28902b) {
                                c14324fArr[length] = new C14324f(c14320b.m32372c(), c14320b.m32372c());
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused6) {
                            }
                            return c14324fArr;
                        case 8:
                            int[] iArr2 = new int[this.f28902b];
                            while (length < this.f28902b) {
                                iArr2[length] = c14320b.readShort();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f28902b];
                            while (length < this.f28902b) {
                                iArr3[length] = c14320b.readInt();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            C14324f[] c14324fArr2 = new C14324f[this.f28902b];
                            while (length < this.f28902b) {
                                c14324fArr2[length] = new C14324f(c14320b.readInt(), c14320b.readInt());
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused9) {
                            }
                            return c14324fArr2;
                        case 11:
                            double[] dArr = new double[this.f28902b];
                            while (length < this.f28902b) {
                                dArr[length] = c14320b.readFloat();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f28902b];
                            while (length < this.f28902b) {
                                dArr2[length] = c14320b.readDouble();
                                length++;
                            }
                            try {
                                c14320b.close();
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                c14320b.close();
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (c14320b != null) {
                        try {
                            c14320b.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    c14320b2 = c14320b;
                    if (c14320b2 != null) {
                        try {
                            c14320b2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                c14320b = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* renamed from: p */
        public int m32396p() {
            return im6.f28861X[this.f28901a] * this.f28902b;
        }

        public String toString() {
            return "(" + im6.f28860W[this.f28901a] + ", data length:" + this.f28904d.length + ")";
        }

        public C14322d(int i, int i2, long j, byte[] bArr) {
            this.f28901a = i;
            this.f28902b = i2;
            this.f28903c = j;
            this.f28904d = bArr;
        }
    }

    /* renamed from: o.im6$f */
    public static class C14324f {

        /* renamed from: a */
        public final long f28909a;

        /* renamed from: b */
        public final long f28910b;

        public C14324f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m32398a() {
            return this.f28909a / this.f28910b;
        }

        public String toString() {
            return this.f28909a + "/" + this.f28910b;
        }

        public C14324f(long j, long j2) {
            if (j2 == 0) {
                this.f28909a = 0L;
                this.f28910b = 1L;
            } else {
                this.f28909a = j;
                this.f28910b = j2;
            }
        }
    }

    static {
        C14323e[] c14323eArr = {new C14323e("NewSubfileType", 254, 4), new C14323e("SubfileType", Constants.MAX_HOST_LENGTH, 4), new C14323e("ImageWidth", 256, 3, 4), new C14323e("ImageLength", 257, 3, 4), new C14323e("BitsPerSample", 258, 3), new C14323e("Compression", 259, 3), new C14323e("PhotometricInterpretation", 262, 3), new C14323e("ImageDescription", 270, 2), new C14323e("Make", 271, 2), new C14323e("Model", 272, 2), new C14323e("StripOffsets", 273, 3, 4), new C14323e("Orientation", 274, 3), new C14323e("SamplesPerPixel", 277, 3), new C14323e("RowsPerStrip", 278, 3, 4), new C14323e("StripByteCounts", 279, 3, 4), new C14323e("XResolution", 282, 5), new C14323e("YResolution", 283, 5), new C14323e("PlanarConfiguration", 284, 3), new C14323e("ResolutionUnit", 296, 3), new C14323e("TransferFunction", 301, 3), new C14323e("Software", HttpStatus.SC_USE_PROXY, 2), new C14323e("DateTime", 306, 2), new C14323e("Artist", MediaError.DetailedErrorCode.HLS_NETWORK_INVALID_SEGMENT, 2), new C14323e("WhitePoint", 318, 5), new C14323e("PrimaryChromaticities", 319, 5), new C14323e("SubIFDPointer", 330, 4), new C14323e("JPEGInterchangeFormat", 513, 4), new C14323e("JPEGInterchangeFormatLength", 514, 4), new C14323e("YCbCrCoefficients", 529, 5), new C14323e("YCbCrSubSampling", 530, 3), new C14323e("YCbCrPositioning", 531, 3), new C14323e("ReferenceBlackWhite", 532, 5), new C14323e("Copyright", 33432, 2), new C14323e("ExifIFDPointer", 34665, 4), new C14323e("GPSInfoIFDPointer", 34853, 4), new C14323e("SensorTopBorder", 4, 4), new C14323e("SensorLeftBorder", 5, 4), new C14323e("SensorBottomBorder", 6, 4), new C14323e("SensorRightBorder", 7, 4), new C14323e("ISO", 23, 3), new C14323e("JpgFromRaw", 46, 7), new C14323e("Xmp", Constants.FROZEN_FRAME_TIME, 1)};
        f28863Z = c14323eArr;
        C14323e[] c14323eArr2 = {new C14323e("ExposureTime", 33434, 5), new C14323e("FNumber", 33437, 5), new C14323e("ExposureProgram", 34850, 3), new C14323e("SpectralSensitivity", 34852, 2), new C14323e("PhotographicSensitivity", 34855, 3), new C14323e("OECF", 34856, 7), new C14323e("SensitivityType", 34864, 3), new C14323e("StandardOutputSensitivity", 34865, 4), new C14323e("RecommendedExposureIndex", 34866, 4), new C14323e("ISOSpeed", 34867, 4), new C14323e("ISOSpeedLatitudeyyy", 34868, 4), new C14323e("ISOSpeedLatitudezzz", 34869, 4), new C14323e("ExifVersion", 36864, 2), new C14323e("DateTimeOriginal", 36867, 2), new C14323e("DateTimeDigitized", 36868, 2), new C14323e("OffsetTime", 36880, 2), new C14323e("OffsetTimeOriginal", 36881, 2), new C14323e("OffsetTimeDigitized", 36882, 2), new C14323e("ComponentsConfiguration", 37121, 7), new C14323e("CompressedBitsPerPixel", 37122, 5), new C14323e("ShutterSpeedValue", 37377, 10), new C14323e("ApertureValue", 37378, 5), new C14323e("BrightnessValue", 37379, 10), new C14323e("ExposureBiasValue", 37380, 10), new C14323e("MaxApertureValue", 37381, 5), new C14323e("SubjectDistance", 37382, 5), new C14323e("MeteringMode", 37383, 3), new C14323e("LightSource", 37384, 3), new C14323e("Flash", 37385, 3), new C14323e("FocalLength", 37386, 5), new C14323e("SubjectArea", 37396, 3), new C14323e("MakerNote", 37500, 7), new C14323e("UserComment", 37510, 7), new C14323e("SubSecTime", 37520, 2), new C14323e("SubSecTimeOriginal", 37521, 2), new C14323e("SubSecTimeDigitized", 37522, 2), new C14323e("FlashpixVersion", 40960, 7), new C14323e("ColorSpace", 40961, 3), new C14323e("PixelXDimension", 40962, 3, 4), new C14323e("PixelYDimension", 40963, 3, 4), new C14323e("RelatedSoundFile", 40964, 2), new C14323e("InteroperabilityIFDPointer", 40965, 4), new C14323e("FlashEnergy", 41483, 5), new C14323e("SpatialFrequencyResponse", 41484, 7), new C14323e("FocalPlaneXResolution", 41486, 5), new C14323e("FocalPlaneYResolution", 41487, 5), new C14323e("FocalPlaneResolutionUnit", 41488, 3), new C14323e("SubjectLocation", 41492, 3), new C14323e("ExposureIndex", 41493, 5), new C14323e("SensingMethod", 41495, 3), new C14323e("FileSource", 41728, 7), new C14323e("SceneType", 41729, 7), new C14323e("CFAPattern", 41730, 7), new C14323e("CustomRendered", 41985, 3), new C14323e("ExposureMode", 41986, 3), new C14323e("WhiteBalance", 41987, 3), new C14323e("DigitalZoomRatio", 41988, 5), new C14323e("FocalLengthIn35mmFilm", 41989, 3), new C14323e("SceneCaptureType", 41990, 3), new C14323e("GainControl", 41991, 3), new C14323e("Contrast", 41992, 3), new C14323e("Saturation", 41993, 3), new C14323e("Sharpness", 41994, 3), new C14323e("DeviceSettingDescription", 41995, 7), new C14323e("SubjectDistanceRange", 41996, 3), new C14323e("ImageUniqueID", 42016, 2), new C14323e("CameraOwnerName", 42032, 2), new C14323e("BodySerialNumber", 42033, 2), new C14323e("LensSpecification", 42034, 5), new C14323e("LensMake", 42035, 2), new C14323e("LensModel", 42036, 2), new C14323e("Gamma", 42240, 5), new C14323e("DNGVersion", 50706, 1), new C14323e("DefaultCropSize", 50720, 3, 4)};
        a0 = c14323eArr2;
        C14323e[] c14323eArr3 = {new C14323e("GPSVersionID", 0, 1), new C14323e("GPSLatitudeRef", 1, 2), new C14323e("GPSLatitude", 2, 5, 10), new C14323e("GPSLongitudeRef", 3, 2), new C14323e("GPSLongitude", 4, 5, 10), new C14323e("GPSAltitudeRef", 5, 1), new C14323e("GPSAltitude", 6, 5), new C14323e("GPSTimeStamp", 7, 5), new C14323e("GPSSatellites", 8, 2), new C14323e("GPSStatus", 9, 2), new C14323e("GPSMeasureMode", 10, 2), new C14323e("GPSDOP", 11, 5), new C14323e("GPSSpeedRef", 12, 2), new C14323e("GPSSpeed", 13, 5), new C14323e("GPSTrackRef", 14, 2), new C14323e("GPSTrack", 15, 5), new C14323e("GPSImgDirectionRef", 16, 2), new C14323e("GPSImgDirection", 17, 5), new C14323e("GPSMapDatum", 18, 2), new C14323e("GPSDestLatitudeRef", 19, 2), new C14323e("GPSDestLatitude", 20, 5), new C14323e("GPSDestLongitudeRef", 21, 2), new C14323e("GPSDestLongitude", 22, 5), new C14323e("GPSDestBearingRef", 23, 2), new C14323e("GPSDestBearing", 24, 5), new C14323e("GPSDestDistanceRef", 25, 2), new C14323e("GPSDestDistance", 26, 5), new C14323e("GPSProcessingMethod", 27, 7), new C14323e("GPSAreaInformation", 28, 7), new C14323e("GPSDateStamp", 29, 2), new C14323e("GPSDifferential", 30, 3), new C14323e("GPSHPositioningError", 31, 5)};
        b0 = c14323eArr3;
        C14323e[] c14323eArr4 = {new C14323e("InteroperabilityIndex", 1, 2)};
        c0 = c14323eArr4;
        C14323e[] c14323eArr5 = {new C14323e("NewSubfileType", 254, 4), new C14323e("SubfileType", Constants.MAX_HOST_LENGTH, 4), new C14323e("ThumbnailImageWidth", 256, 3, 4), new C14323e("ThumbnailImageLength", 257, 3, 4), new C14323e("BitsPerSample", 258, 3), new C14323e("Compression", 259, 3), new C14323e("PhotometricInterpretation", 262, 3), new C14323e("ImageDescription", 270, 2), new C14323e("Make", 271, 2), new C14323e("Model", 272, 2), new C14323e("StripOffsets", 273, 3, 4), new C14323e("ThumbnailOrientation", 274, 3), new C14323e("SamplesPerPixel", 277, 3), new C14323e("RowsPerStrip", 278, 3, 4), new C14323e("StripByteCounts", 279, 3, 4), new C14323e("XResolution", 282, 5), new C14323e("YResolution", 283, 5), new C14323e("PlanarConfiguration", 284, 3), new C14323e("ResolutionUnit", 296, 3), new C14323e("TransferFunction", 301, 3), new C14323e("Software", HttpStatus.SC_USE_PROXY, 2), new C14323e("DateTime", 306, 2), new C14323e("Artist", MediaError.DetailedErrorCode.HLS_NETWORK_INVALID_SEGMENT, 2), new C14323e("WhitePoint", 318, 5), new C14323e("PrimaryChromaticities", 319, 5), new C14323e("SubIFDPointer", 330, 4), new C14323e("JPEGInterchangeFormat", 513, 4), new C14323e("JPEGInterchangeFormatLength", 514, 4), new C14323e("YCbCrCoefficients", 529, 5), new C14323e("YCbCrSubSampling", 530, 3), new C14323e("YCbCrPositioning", 531, 3), new C14323e("ReferenceBlackWhite", 532, 5), new C14323e("Copyright", 33432, 2), new C14323e("ExifIFDPointer", 34665, 4), new C14323e("GPSInfoIFDPointer", 34853, 4), new C14323e("DNGVersion", 50706, 1), new C14323e("DefaultCropSize", 50720, 3, 4)};
        d0 = c14323eArr5;
        e0 = new C14323e("StripOffsets", 273, 3);
        C14323e[] c14323eArr6 = {new C14323e("ThumbnailImage", 256, 7), new C14323e("CameraSettingsIFDPointer", 8224, 4), new C14323e("ImageProcessingIFDPointer", 8256, 4)};
        f0 = c14323eArr6;
        C14323e[] c14323eArr7 = {new C14323e("PreviewImageStart", 257, 4), new C14323e("PreviewImageLength", 258, 4)};
        g0 = c14323eArr7;
        C14323e[] c14323eArr8 = {new C14323e("AspectFrame", 4371, 3)};
        h0 = c14323eArr8;
        C14323e[] c14323eArr9 = {new C14323e("ColorSpace", 55, 3)};
        i0 = c14323eArr9;
        C14323e[][] c14323eArr10 = {c14323eArr, c14323eArr2, c14323eArr3, c14323eArr4, c14323eArr5, c14323eArr, c14323eArr6, c14323eArr7, c14323eArr8, c14323eArr9};
        j0 = c14323eArr10;
        k0 = new C14323e[]{new C14323e("SubIFDPointer", 330, 4), new C14323e("ExifIFDPointer", 34665, 4), new C14323e("GPSInfoIFDPointer", 34853, 4), new C14323e("InteroperabilityIFDPointer", 40965, 4), new C14323e("CameraSettingsIFDPointer", 8224, 1), new C14323e("ImageProcessingIFDPointer", 8256, 1)};
        l0 = new HashMap[c14323eArr10.length];
        m0 = new HashMap[c14323eArr10.length];
        n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        o0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        p0 = charsetForName;
        q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f28858U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f28859V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C14323e[][] c14323eArr11 = j0;
            if (i >= c14323eArr11.length) {
                HashMap map = o0;
                C14323e[] c14323eArr12 = k0;
                map.put(Integer.valueOf(c14323eArr12[0].f28905a), 5);
                map.put(Integer.valueOf(c14323eArr12[1].f28905a), 1);
                map.put(Integer.valueOf(c14323eArr12[2].f28905a), 2);
                map.put(Integer.valueOf(c14323eArr12[3].f28905a), 3);
                map.put(Integer.valueOf(c14323eArr12[4].f28905a), 7);
                map.put(Integer.valueOf(c14323eArr12[5].f28905a), 8);
                s0 = Pattern.compile(".*[1-9].*");
                t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            l0[i] = new HashMap();
            m0[i] = new HashMap();
            for (C14323e c14323e : c14323eArr11[i]) {
                l0[i].put(Integer.valueOf(c14323e.f28905a), c14323e);
                m0[i].put(c14323e.f28906b, c14323e);
            }
            i++;
        }
    }

    public im6(String str) throws Throwable {
        C14323e[][] c14323eArr = j0;
        this.f28874f = new HashMap[c14323eArr.length];
        this.f28875g = new HashSet(c14323eArr.length);
        this.f28876h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        m32326B(str);
    }

    /* renamed from: C */
    public static boolean m32319C(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = q0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: E */
    public static boolean m32320E(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f28839B;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: J */
    public static boolean m32321J(FileDescriptor fileDescriptor) {
        try {
            km6.C14867a.m35913c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: L */
    public static boolean m32322L(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: c */
    public static double m32323c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = d + (d2 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean g0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: y */
    public static Pair m32324y(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairM32324y = m32324y(strArrSplit[0]);
            if (((Integer) pairM32324y.first).intValue() == 2) {
                return pairM32324y;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairM32324y2 = m32324y(strArrSplit[i]);
                int iIntValue = (((Integer) pairM32324y2.first).equals(pairM32324y.first) || ((Integer) pairM32324y2.second).equals(pairM32324y.first)) ? ((Integer) pairM32324y.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM32324y.second).intValue() == -1 || !(((Integer) pairM32324y2.first).equals(pairM32324y.second) || ((Integer) pairM32324y2.second).equals(pairM32324y.second))) ? -1 : ((Integer) pairM32324y.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM32324y = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM32324y = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM32324y;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    return (lValueOf.longValue() < 0 || lValueOf.longValue() > 65535) ? lValueOf.longValue() < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j = (long) Double.parseDouble(strArrSplit2[0]);
                long j2 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j >= 0 && j2 >= 0) {
                    if (j <= 2147483647L && j2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* renamed from: A */
    public final void m32325A(C14320b c14320b, HashMap map) {
        C14322d c14322d = (C14322d) map.get("StripOffsets");
        C14322d c14322d2 = (C14322d) map.get("StripByteCounts");
        if (c14322d == null || c14322d2 == null) {
            return;
        }
        long[] jArrM35907d = km6.m35907d(c14322d.m32395o(this.f28876h));
        long[] jArrM35907d2 = km6.m35907d(c14322d2.m32395o(this.f28876h));
        if (jArrM35907d == null || jArrM35907d.length == 0 || jArrM35907d2 == null || jArrM35907d2.length == 0 || jArrM35907d.length != jArrM35907d2.length) {
            return;
        }
        long j = 0;
        for (long j2 : jArrM35907d2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.f28879k = true;
        this.f28878j = true;
        this.f28877i = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrM35907d.length; i4++) {
            int i5 = (int) jArrM35907d[i4];
            int i6 = (int) jArrM35907d2[i4];
            if (i4 < jArrM35907d.length - 1 && i5 + i6 != jArrM35907d[i4 + 1]) {
                this.f28879k = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (c14320b.skip(j3) != j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to skip ");
                sb.append(i7);
                sb.append(" bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (c14320b.read(bArr2) != i6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read ");
                sb2.append(i6);
                sb2.append(" bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.f28882n = bArr;
        if (this.f28879k) {
            this.f28880l = (int) jArrM35907d[0];
            this.f28881m = i;
        }
    }

    /* renamed from: B */
    public final void m32326B(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f28871c = null;
        this.f28869a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (m32321J(fileInputStream2.getFD())) {
                    this.f28870b = fileInputStream2.getFD();
                } else {
                    this.f28870b = null;
                }
                m32335O(fileInputStream2);
                km6.m35906c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                km6.m35906c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: D */
    public final boolean m32327D(byte[] bArr) throws Throwable {
        C14320b c14320b;
        long length;
        byte[] bArr2;
        long j;
        C14320b c14320b2 = null;
        try {
            try {
                c14320b = new C14320b(bArr);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            length = c14320b.readInt();
            bArr2 = new byte[4];
            c14320b.read(bArr2);
        } catch (Exception unused2) {
            c14320b2 = c14320b;
            boolean z = f28864v;
            if (c14320b2 != null) {
                c14320b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c14320b2 = c14320b;
            if (c14320b2 != null) {
                c14320b2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f28840C)) {
            c14320b.close();
            return false;
        }
        if (length == 1) {
            length = c14320b.readLong();
            j = 16;
            if (length < 16) {
                c14320b.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j2 = length - j;
        if (j2 < 8) {
            c14320b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (c14320b.read(bArr3) != 4) {
                c14320b.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f28841D)) {
                    z2 = true;
                } else if (Arrays.equals(bArr3, f28842E)) {
                    z3 = true;
                }
                if (z2 && z3) {
                    c14320b.close();
                    return true;
                }
            }
        }
        c14320b.close();
        return false;
    }

    /* renamed from: F */
    public final boolean m32328F(byte[] bArr) throws Throwable {
        C14320b c14320b = null;
        try {
            C14320b c14320b2 = new C14320b(bArr);
            try {
                ByteOrder byteOrderM32338R = m32338R(c14320b2);
                this.f28876h = byteOrderM32338R;
                c14320b2.m32373d(byteOrderM32338R);
                short s = c14320b2.readShort();
                boolean z = s == 20306 || s == 21330;
                c14320b2.close();
                return z;
            } catch (Exception unused) {
                c14320b = c14320b2;
                if (c14320b != null) {
                    c14320b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c14320b = c14320b2;
                if (c14320b != null) {
                    c14320b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: G */
    public final boolean m32329G(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f28845H;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: H */
    public final boolean m32330H(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m32331I(byte[] bArr) throws Throwable {
        C14320b c14320b = null;
        try {
            C14320b c14320b2 = new C14320b(bArr);
            try {
                ByteOrder byteOrderM32338R = m32338R(c14320b2);
                this.f28876h = byteOrderM32338R;
                c14320b2.m32373d(byteOrderM32338R);
                boolean z = c14320b2.readShort() == 85;
                c14320b2.close();
                return z;
            } catch (Exception unused) {
                c14320b = c14320b2;
                if (c14320b != null) {
                    c14320b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c14320b = c14320b2;
                if (c14320b != null) {
                    c14320b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: K */
    public final boolean m32332K(HashMap map) throws Throwable {
        C14322d c14322d;
        C14322d c14322d2 = (C14322d) map.get("BitsPerSample");
        if (c14322d2 == null) {
            return false;
        }
        int[] iArr = (int[]) c14322d2.m32395o(this.f28876h);
        int[] iArr2 = f28867y;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f28872d != 3 || (c14322d = (C14322d) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iM32393m = c14322d.m32393m(this.f28876h);
        return (iM32393m == 1 && Arrays.equals(iArr, f28838A)) || (iM32393m == 6 && Arrays.equals(iArr, iArr2));
    }

    /* renamed from: M */
    public final boolean m32333M(HashMap map) {
        C14322d c14322d = (C14322d) map.get("ImageLength");
        C14322d c14322d2 = (C14322d) map.get("ImageWidth");
        if (c14322d == null || c14322d2 == null) {
            return false;
        }
        return c14322d.m32393m(this.f28876h) <= 512 && c14322d2.m32393m(this.f28876h) <= 512;
    }

    /* renamed from: N */
    public final boolean m32334N(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f28849L;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f28850M;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f28849L.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    /* renamed from: O */
    public final void m32335O(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < j0.length; i++) {
            try {
                try {
                    this.f28874f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z = f28864v;
                    m32347a();
                    if (!z) {
                        return;
                    }
                }
            } finally {
                m32347a();
                if (f28864v) {
                    m32337Q();
                }
            }
        }
        if (!this.f28873e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f28872d = m32359n(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (g0(this.f28872d)) {
            C14325g c14325g = new C14325g(inputStream);
            if (this.f28873e) {
                m32366u(c14325g);
            } else {
                int i2 = this.f28872d;
                if (i2 == 12) {
                    m32356k(c14325g);
                } else if (i2 == 7) {
                    m32360o(c14325g);
                } else if (i2 == 10) {
                    m32365t(c14325g);
                } else {
                    m32363r(c14325g);
                }
            }
            c14325g.m32399g(this.f28884p);
            f0(c14325g);
        } else {
            C14320b c14320b = new C14320b(inputStream);
            int i3 = this.f28872d;
            if (i3 == 4) {
                m32357l(c14320b, 0, 0);
            } else if (i3 == 13) {
                m32361p(c14320b);
            } else if (i3 == 9) {
                m32362q(c14320b);
            } else if (i3 == 14) {
                m32369x(c14320b);
            }
        }
    }

    /* renamed from: P */
    public final void m32336P(C14320b c14320b) throws IOException {
        ByteOrder byteOrderM32338R = m32338R(c14320b);
        this.f28876h = byteOrderM32338R;
        c14320b.m32373d(byteOrderM32338R);
        int unsignedShort = c14320b.readUnsignedShort();
        int i = this.f28872d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c14320b.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i2);
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c14320b.m32374f(i3);
        }
    }

    /* renamed from: Q */
    public final void m32337Q() {
        for (int i = 0; i < this.f28874f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f28874f[i].size());
            for (Map.Entry entry : this.f28874f[i].entrySet()) {
                C14322d c14322d = (C14322d) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(c14322d.toString());
                sb2.append(", tagValue: '");
                sb2.append(c14322d.m32394n(this.f28876h));
                sb2.append("'");
            }
        }
    }

    /* renamed from: R */
    public final ByteOrder m32338R(C14320b c14320b) throws IOException {
        short s = c14320b.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* renamed from: S */
    public final void m32339S(byte[] bArr, int i) throws IOException {
        C14325g c14325g = new C14325g(bArr);
        m32336P(c14325g);
        m32340T(c14325g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022b  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m32340T(C14325g c14325g, int i) throws IOException {
        short s;
        int i2;
        long j;
        short s2;
        int i3;
        int unsignedShort;
        long jM32372c;
        int i4 = i;
        this.f28875g.add(Integer.valueOf(c14325g.f28897c));
        short s3 = c14325g.readShort();
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfDirectoryEntry: ");
            sb.append((int) s3);
        }
        if (s3 <= 0) {
            return;
        }
        char c = 0;
        short s4 = 0;
        while (s4 < s3) {
            int unsignedShort2 = c14325g.readUnsignedShort();
            int unsignedShort3 = c14325g.readUnsignedShort();
            int i5 = c14325g.readInt();
            long jM32371a = c14325g.m32371a() + 4;
            C14323e c14323e = (C14323e) l0[i4].get(Integer.valueOf(unsignedShort2));
            boolean z = f28864v;
            boolean z2 = true;
            if (z) {
                Object[] objArr = new Object[5];
                objArr[c] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = c14323e != null ? c14323e.f28906b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i5);
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            }
            if (c14323e != null) {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 < f28861X.length) {
                        if (c14323e.m32397a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = c14323e.f28907c;
                            }
                            i2 = unsignedShort2;
                            s = s4;
                            j = r6[unsignedShort3] * i5;
                            if (j < 0 || j > 2147483647L) {
                                if (z) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Skip the tag entry since the number of components is invalid: ");
                                    sb2.append(i5);
                                }
                                z2 = false;
                            }
                            if (z2) {
                                if (j > 4) {
                                    int i6 = c14325g.readInt();
                                    if (z) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("seek to data offset: ");
                                        sb3.append(i6);
                                    }
                                    if (this.f28872d != 7) {
                                        s2 = s3;
                                        i3 = i5;
                                        c14325g.m32399g(i6);
                                    } else {
                                        if ("MakerNote".equals(c14323e.f28906b)) {
                                            this.f28885q = i6;
                                        } else {
                                            if (i4 == 6 && "ThumbnailImage".equals(c14323e.f28906b)) {
                                                this.f28886r = i6;
                                                this.f28887s = i5;
                                                C14322d c14322dM32390j = C14322d.m32390j(6, this.f28876h);
                                                s2 = s3;
                                                C14322d c14322dM32386f = C14322d.m32386f(this.f28886r, this.f28876h);
                                                i3 = i5;
                                                C14322d c14322dM32386f2 = C14322d.m32386f(this.f28887s, this.f28876h);
                                                this.f28874f[4].put("Compression", c14322dM32390j);
                                                this.f28874f[4].put("JPEGInterchangeFormat", c14322dM32386f);
                                                this.f28874f[4].put("JPEGInterchangeFormatLength", c14322dM32386f2);
                                            }
                                            c14325g.m32399g(i6);
                                        }
                                        s2 = s3;
                                        i3 = i5;
                                        c14325g.m32399g(i6);
                                    }
                                } else {
                                    s2 = s3;
                                    i3 = i5;
                                }
                                Integer num = (Integer) o0.get(Integer.valueOf(i2));
                                if (z) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("nextIfdType: ");
                                    sb4.append(num);
                                    sb4.append(" byteCount: ");
                                    sb4.append(j);
                                }
                                if (num != null) {
                                    if (unsignedShort3 != 3) {
                                        if (unsignedShort3 == 4) {
                                            jM32372c = c14325g.m32372c();
                                        } else if (unsignedShort3 == 8) {
                                            unsignedShort = c14325g.readShort();
                                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                            unsignedShort = c14325g.readInt();
                                        } else {
                                            jM32372c = -1;
                                        }
                                        if (z) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(jM32372c), c14323e.f28906b);
                                        }
                                        if (jM32372c <= 0) {
                                            if (!this.f28875g.contains(Integer.valueOf((int) jM32372c))) {
                                                c14325g.m32399g(jM32372c);
                                                m32340T(c14325g, num.intValue());
                                            } else if (z) {
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append("Skip jump into the IFD since it has already been read: IfdType ");
                                                sb5.append(num);
                                                sb5.append(" (at ");
                                                sb5.append(jM32372c);
                                                sb5.append(")");
                                            }
                                        } else if (z) {
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("Skip jump into the IFD since its offset is invalid: ");
                                            sb6.append(jM32372c);
                                        }
                                        c14325g.m32399g(jM32371a);
                                    } else {
                                        unsignedShort = c14325g.readUnsignedShort();
                                    }
                                    jM32372c = unsignedShort;
                                    if (z) {
                                    }
                                    if (jM32372c <= 0) {
                                    }
                                    c14325g.m32399g(jM32371a);
                                } else {
                                    int iM32371a = c14325g.m32371a() + this.f28884p;
                                    byte[] bArr = new byte[(int) j];
                                    c14325g.readFully(bArr);
                                    C14322d c14322d = new C14322d(unsignedShort3, i3, iM32371a, bArr);
                                    this.f28874f[i].put(c14323e.f28906b, c14322d);
                                    if ("DNGVersion".equals(c14323e.f28906b)) {
                                        this.f28872d = 3;
                                    }
                                    if ((("Make".equals(c14323e.f28906b) || "Model".equals(c14323e.f28906b)) && c14322d.m32394n(this.f28876h).contains("PENTAX")) || ("Compression".equals(c14323e.f28906b) && c14322d.m32393m(this.f28876h) == 65535)) {
                                        this.f28872d = 8;
                                    }
                                    if (c14325g.m32371a() != jM32371a) {
                                        c14325g.m32399g(jM32371a);
                                    }
                                }
                            } else {
                                c14325g.m32399g(jM32371a);
                                s2 = s3;
                            }
                            s4 = (short) (s + 1);
                            i4 = i;
                            s3 = s2;
                            c = 0;
                        } else if (z) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Skip the tag entry since data format (");
                            sb7.append(f28860W[unsignedShort3]);
                            sb7.append(") is unexpected for tag: ");
                            sb7.append(c14323e.f28906b);
                        }
                    }
                }
                s = s4;
                i2 = unsignedShort2;
                if (z) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Skip the tag entry since data format is invalid: ");
                    sb8.append(unsignedShort3);
                }
                j = 0;
                z2 = false;
                if (z2) {
                }
                s4 = (short) (s + 1);
                i4 = i;
                s3 = s2;
                c = 0;
            } else if (z) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Skip the tag entry since tag number is not defined: ");
                sb9.append(unsignedShort2);
            }
            s = s4;
            i2 = unsignedShort2;
            j = 0;
            z2 = false;
            if (z2) {
            }
            s4 = (short) (s + 1);
            i4 = i;
            s3 = s2;
            c = 0;
        }
        int i7 = c14325g.readInt();
        boolean z3 = f28864v;
        if (z3) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j2 = i7;
        if (j2 <= 0) {
            if (z3) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("Stop reading file since a wrong offset may cause an infinite loop: ");
                sb10.append(i7);
                return;
            }
            return;
        }
        if (this.f28875g.contains(Integer.valueOf(i7))) {
            if (z3) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                sb11.append(i7);
                return;
            }
            return;
        }
        c14325g.m32399g(j2);
        if (this.f28874f[4].isEmpty()) {
            m32340T(c14325g, 4);
        } else if (this.f28874f[5].isEmpty()) {
            m32340T(c14325g, 5);
        }
    }

    /* renamed from: U */
    public final void m32341U(String str) {
        for (int i = 0; i < j0.length; i++) {
            this.f28874f[i].remove(str);
        }
    }

    /* renamed from: V */
    public final void m32342V(int i, String str, String str2) {
        if (this.f28874f[i].isEmpty() || this.f28874f[i].get(str) == null) {
            return;
        }
        HashMap map = this.f28874f[i];
        map.put(str2, map.get(str));
        this.f28874f[i].remove(str);
    }

    /* renamed from: W */
    public final void m32343W(C14325g c14325g, int i) throws Throwable {
        C14322d c14322d = (C14322d) this.f28874f[i].get("ImageLength");
        C14322d c14322d2 = (C14322d) this.f28874f[i].get("ImageWidth");
        if (c14322d == null || c14322d2 == null) {
            C14322d c14322d3 = (C14322d) this.f28874f[i].get("JPEGInterchangeFormat");
            C14322d c14322d4 = (C14322d) this.f28874f[i].get("JPEGInterchangeFormatLength");
            if (c14322d3 == null || c14322d4 == null) {
                return;
            }
            int iM32393m = c14322d3.m32393m(this.f28876h);
            int iM32393m2 = c14322d3.m32393m(this.f28876h);
            c14325g.m32399g(iM32393m);
            byte[] bArr = new byte[iM32393m2];
            c14325g.read(bArr);
            m32357l(new C14320b(bArr), iM32393m, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m32344X() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream3;
        BufferedInputStream bufferedInputStream;
        if (!m32322L(this.f28872d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f28870b == null && this.f28869a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f28877i && this.f28878j && !this.f28879k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f28888t = true;
        this.f28882n = m32367v();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f28869a != null) {
                fileInputStream = new FileInputStream(this.f28869a);
            } else {
                km6.C14867a.m35913c(this.f28870b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f28870b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    km6.m35908e(fileInputStream, fileOutputStream);
                    km6.m35906c(fileInputStream);
                    km6.m35906c(fileOutputStream);
                    try {
                        try {
                            try {
                                fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f28869a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f28869a);
                                    } else {
                                        km6.C14867a.m35913c(this.f28870b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f28870b);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                    } catch (Exception e2) {
                                        inputStream = fileInputStream3;
                                        exc = e2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    try {
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        try {
                                            if (this.f28869a != null) {
                                                km6.C14867a.m35913c(this.f28870b, 0L, OsConstants.SEEK_SET);
                                                fileOutputStream4 = new FileOutputStream(this.f28870b);
                                            } else {
                                                fileOutputStream4 = new FileOutputStream(this.f28869a);
                                            }
                                            fileOutputStream3 = fileOutputStream4;
                                            km6.m35908e(fileInputStream2, fileOutputStream3);
                                            km6.m35906c(fileInputStream2);
                                            km6.m35906c(fileOutputStream3);
                                            throw new IOException("Failed to save new file", exc);
                                        } catch (Exception e4) {
                                            e = e4;
                                            try {
                                                throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = fileInputStream2;
                                                km6.m35906c(inputStream);
                                                km6.m35906c(fileOutputStream3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = fileInputStream2;
                                            km6.m35906c(inputStream);
                                            km6.m35906c(fileOutputStream3);
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        fileInputStream2 = inputStream;
                                        e = e5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        km6.m35906c(inputStream);
                                        km6.m35906c(fileOutputStream3);
                                        throw th;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                fileOutputStream2 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = null;
                            km6.m35906c(inputStream);
                            km6.m35906c(closeable);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                        try {
                            int i = this.f28872d;
                            if (i == 4) {
                                m32345Y(bufferedInputStream, bufferedOutputStream);
                            } else if (i == 13) {
                                m32346Z(bufferedInputStream, bufferedOutputStream);
                            } else if (i == 14) {
                                a0(bufferedInputStream, bufferedOutputStream);
                            }
                            km6.m35906c(bufferedInputStream);
                            km6.m35906c(bufferedOutputStream);
                            fileCreateTempFile.delete();
                            this.f28882n = null;
                        } catch (Exception e7) {
                            exc = e7;
                            inputStream = fileInputStream3;
                            fileInputStream2 = new FileInputStream(fileCreateTempFile);
                            if (this.f28869a != null) {
                            }
                            fileOutputStream3 = fileOutputStream4;
                            km6.m35908e(fileInputStream2, fileOutputStream3);
                            km6.m35906c(fileInputStream2);
                            km6.m35906c(fileOutputStream3);
                            throw new IOException("Failed to save new file", exc);
                        }
                    } catch (Exception e8) {
                        inputStream = fileInputStream3;
                        exc = e8;
                    } catch (Throwable th6) {
                        th = th6;
                        closeable = null;
                        inputStream = bufferedInputStream;
                        km6.m35906c(inputStream);
                        km6.m35906c(closeable);
                        if (0 == 0) {
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th7) {
                        th = th7;
                        km6.m35906c(inputStream);
                        km6.m35906c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = fileInputStream;
                    km6.m35906c(inputStream);
                    km6.m35906c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
        }
    }

    /* renamed from: Y */
    public final void m32345Y(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        C14320b c14320b = new C14320b(inputStream);
        C14321c c14321c = new C14321c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c14320b.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c14321c.m32376c(-1);
        if (c14320b.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c14321c.m32376c(-40);
        C14322d c14322d = (m32352g("Xmp") == null || !this.f28889u) ? null : (C14322d) this.f28874f[0].remove("Xmp");
        c14321c.m32376c(-1);
        c14321c.m32376c(-31);
        k0(c14321c);
        if (c14322d != null) {
            this.f28874f[0].put("Xmp", c14322d);
        }
        byte[] bArr = new byte[4096];
        while (c14320b.readByte() == -1) {
            byte b = c14320b.readByte();
            if (b == -39 || b == -38) {
                c14321c.m32376c(-1);
                c14321c.m32376c(b);
                km6.m35908e(c14320b, c14321c);
                return;
            }
            if (b != -31) {
                c14321c.m32376c(-1);
                c14321c.m32376c(b);
                int unsignedShort = c14320b.readUnsignedShort();
                c14321c.m32380h(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = c14320b.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        c14321c.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = c14320b.readUnsignedShort() - 2;
                if (unsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (unsignedShort2 >= 6) {
                    if (c14320b.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, q0)) {
                        c14320b.m32374f(unsignedShort2 - 6);
                    }
                }
                c14321c.m32376c(-1);
                c14321c.m32376c(b);
                c14321c.m32380h(unsignedShort2 + 2);
                if (unsignedShort2 >= 6) {
                    unsignedShort2 -= 6;
                    c14321c.write(bArr2);
                }
                while (unsignedShort2 > 0) {
                    int i3 = c14320b.read(bArr, 0, Math.min(unsignedShort2, 4096));
                    if (i3 >= 0) {
                        c14321c.write(bArr, 0, i3);
                        unsignedShort2 -= i3;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: Z */
    public final void m32346Z(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        C14320b c14320b = new C14320b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C14321c c14321c = new C14321c(outputStream, byteOrder);
        byte[] bArr = f28845H;
        km6.m35909f(c14320b, c14321c, bArr.length);
        int i = this.f28884p;
        if (i == 0) {
            int i2 = c14320b.readInt();
            c14321c.m32377d(i2);
            km6.m35909f(c14320b, c14321c, i2 + 4 + 4);
        } else {
            km6.m35909f(c14320b, c14321c, ((i - bArr.length) - 4) - 4);
            c14320b.m32374f(c14320b.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C14321c c14321c2 = new C14321c(byteArrayOutputStream2, byteOrder);
                k0(c14321c2);
                byte[] byteArray = ((ByteArrayOutputStream) c14321c2.f28899a).toByteArray();
                c14321c.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                c14321c.m32377d((int) crc32.getValue());
                km6.m35906c(byteArrayOutputStream2);
                km6.m35908e(c14320b, c14321c);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                km6.m35906c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final void m32347a() {
        String strM32352g = m32352g("DateTimeOriginal");
        if (strM32352g != null && m32352g("DateTime") == null) {
            this.f28874f[0].put("DateTime", C14322d.m32385e(strM32352g));
        }
        if (m32352g("ImageWidth") == null) {
            this.f28874f[0].put("ImageWidth", C14322d.m32386f(0L, this.f28876h));
        }
        if (m32352g("ImageLength") == null) {
            this.f28874f[0].put("ImageLength", C14322d.m32386f(0L, this.f28876h));
        }
        if (m32352g("Orientation") == null) {
            this.f28874f[0].put("Orientation", C14322d.m32386f(0L, this.f28876h));
        }
        if (m32352g("LightSource") == null) {
            this.f28874f[1].put("LightSource", C14322d.m32386f(0L, this.f28876h));
        }
    }

    public final void a0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C14320b c14320b = new C14320b(inputStream, byteOrder);
        C14321c c14321c = new C14321c(outputStream, byteOrder);
        byte[] bArr = f28849L;
        km6.m35909f(c14320b, c14321c, bArr.length);
        byte[] bArr2 = f28850M;
        c14320b.m32374f(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            C14321c c14321c2 = new C14321c(byteArrayOutputStream, byteOrder);
            int i4 = this.f28884p;
            if (i4 != 0) {
                km6.m35909f(c14320b, c14321c2, ((i4 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                c14320b.m32374f(4);
                int i5 = c14320b.readInt();
                if (i5 % 2 != 0) {
                    i5++;
                }
                c14320b.m32374f(i5);
                k0(c14321c2);
            } else {
                byte[] bArr3 = new byte[4];
                if (c14320b.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = f28853P;
                boolean z = true;
                if (Arrays.equals(bArr3, bArr4)) {
                    int i6 = c14320b.readInt();
                    byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                    c14320b.read(bArr5);
                    byte b = (byte) (8 | bArr5[0]);
                    bArr5[0] = b;
                    boolean z2 = ((b >> 1) & 1) == 1;
                    c14321c2.write(bArr4);
                    c14321c2.m32377d(i6);
                    c14321c2.write(bArr5);
                    if (z2) {
                        m32349d(c14320b, c14321c2, f28856S, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, f28857T)) {
                                break;
                            } else {
                                m32350e(c14320b, c14321c2, bArr6);
                            }
                        }
                        k0(c14321c2);
                    } else {
                        m32349d(c14320b, c14321c2, f28855R, f28854Q);
                        k0(c14321c2);
                    }
                } else {
                    byte[] bArr7 = f28855R;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f28854Q)) {
                        int i7 = c14320b.readInt();
                        int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            c14320b.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (c14320b.read(bArr9) != 3 || !Arrays.equals(f28852O, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i = c14320b.readInt();
                            i8 -= 10;
                            i3 = (i << 2) >> 18;
                            i2 = (i << 18) >> 18;
                            z = false;
                        } else if (!Arrays.equals(bArr3, f28854Q)) {
                            i = 0;
                            z = false;
                            i2 = 0;
                            i3 = 0;
                        } else {
                            if (c14320b.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i = c14320b.readInt();
                            i2 = (i & 16383) + 1;
                            i3 = ((i & 268419072) >>> 14) + 1;
                            if ((i & 268435456) == 0) {
                                z = false;
                            }
                            i8 -= 5;
                        }
                        c14321c2.write(bArr4);
                        c14321c2.m32377d(10);
                        byte[] bArr10 = new byte[10];
                        if (z) {
                            bArr10[0] = (byte) (bArr10[0] | 16);
                        }
                        bArr10[0] = (byte) (bArr10[0] | 8);
                        int i9 = i2 - 1;
                        int i10 = i3 - 1;
                        bArr10[4] = (byte) i9;
                        bArr10[5] = (byte) (i9 >> 8);
                        bArr10[6] = (byte) (i9 >> 16);
                        bArr10[7] = (byte) i10;
                        bArr10[8] = (byte) (i10 >> 8);
                        bArr10[9] = (byte) (i10 >> 16);
                        c14321c2.write(bArr10);
                        c14321c2.write(bArr3);
                        c14321c2.m32377d(i7);
                        if (Arrays.equals(bArr3, bArr7)) {
                            c14321c2.write(bArr8);
                            c14321c2.write(f28852O);
                            c14321c2.m32377d(i);
                        } else if (Arrays.equals(bArr3, f28854Q)) {
                            c14321c2.write(47);
                            c14321c2.m32377d(i);
                        }
                        km6.m35909f(c14320b, c14321c2, i8);
                        k0(c14321c2);
                    }
                }
            }
            km6.m35908e(c14320b, c14321c2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f28850M;
            c14321c.m32377d(size + bArr11.length);
            c14321c.write(bArr11);
            byteArrayOutputStream.writeTo(c14321c);
            km6.m35906c(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            km6.m35906c(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: b */
    public final String m32348b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public void b0(double d) throws NumberFormatException {
        String str = d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0" : "1";
        c0("GPSAltitude", new C14324f(Math.abs(d)).toString());
        c0("GPSAltitudeRef", str);
    }

    public void c0(String str, String str2) throws NumberFormatException {
        C14323e c14323e;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = u0.matcher(strReplaceAll).find();
            boolean zFind2 = v0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value for ");
                sb.append(str3);
                sb.append(" : ");
                sb.append(strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = t0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid value for ");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new C14324f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid value for ");
                    sb3.append(str3);
                    sb3.append(" : ");
                    sb3.append(strReplaceAll);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < j0.length) {
            if ((i6 != 4 || this.f28877i) && (c14323e = (C14323e) m0[i6].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair pairM32324y = m32324y(strReplaceAll);
                    if (c14323e.f28907c == ((Integer) pairM32324y.first).intValue() || c14323e.f28907c == ((Integer) pairM32324y.second).intValue()) {
                        i = c14323e.f28907c;
                    } else {
                        int i7 = c14323e.f28908d;
                        if (i7 == -1 || !(i7 == ((Integer) pairM32324y.first).intValue() || c14323e.f28908d == ((Integer) pairM32324y.second).intValue())) {
                            int i8 = c14323e.f28907c;
                            if (i8 == i4 || i8 == 7 || i8 == i3) {
                                i = i8;
                            } else if (f28864v) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Given tag (");
                                sb4.append(str3);
                                sb4.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f28860W;
                                sb4.append(strArr[c14323e.f28907c]);
                                sb4.append(c14323e.f28908d == -1 ? "" : ", " + strArr[c14323e.f28908d]);
                                sb4.append(" (guess: ");
                                sb4.append(strArr[((Integer) pairM32324y.first).intValue()]);
                                sb4.append(((Integer) pairM32324y.second).intValue() != -1 ? ", " + strArr[((Integer) pairM32324y.second).intValue()] : "");
                                sb4.append(")");
                            }
                        } else {
                            i = c14323e.f28908d;
                        }
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.f28874f[i6].put(str3, C14322d.m32381a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.f28874f[i6].put(str3, C14322d.m32385e(strReplaceAll));
                            break;
                        case 3:
                            i2 = i4;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                                iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                            }
                            this.f28874f[i6].put(str3, C14322d.m32391k(iArr, this.f28876h));
                            break;
                        case 4:
                            i2 = i4;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                                jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                            }
                            this.f28874f[i6].put(str3, C14322d.m32387g(jArr, this.f28876h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            C14324f[] c14324fArr = new C14324f[strArrSplit3.length];
                            int i11 = i5;
                            while (i11 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i11].split("/", -1);
                                c14324fArr[i11] = new C14324f((long) Double.parseDouble(strArrSplit4[i5]), (long) Double.parseDouble(strArrSplit4[1]));
                                i11++;
                                i5 = 0;
                            }
                            i2 = 1;
                            this.f28874f[i6].put(str3, C14322d.m32389i(c14324fArr, this.f28876h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i2 = i4;
                            if (f28864v) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Data format isn't one of expected formats: ");
                                sb5.append(i);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i12 = i5; i12 < strArrSplit5.length; i12++) {
                                iArr2[i12] = Integer.parseInt(strArrSplit5[i12]);
                            }
                            this.f28874f[i6].put(str3, C14322d.m32383c(iArr2, this.f28876h));
                            i2 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            C14324f[] c14324fArr2 = new C14324f[strArrSplit6.length];
                            int i13 = i5;
                            while (i13 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i13].split("/", -1);
                                c14324fArr2[i13] = new C14324f((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i13++;
                                strArrSplit6 = strArrSplit6;
                                i4 = 1;
                            }
                            this.f28874f[i6].put(str3, C14322d.m32384d(c14324fArr2, this.f28876h));
                            i2 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i14 = i5; i14 < strArrSplit8.length; i14++) {
                                dArr[i14] = Double.parseDouble(strArrSplit8[i14]);
                            }
                            this.f28874f[i6].put(str3, C14322d.m32382b(dArr, this.f28876h));
                            break;
                    }
                } else {
                    this.f28874f[i6].remove(str3);
                }
                i2 = i4;
            } else {
                i2 = i4;
            }
            i6++;
            i4 = i2;
            i3 = 2;
            i5 = 0;
        }
    }

    /* renamed from: d */
    public final void m32349d(C14320b c14320b, C14321c c14321c, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c14320b.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = p0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            m32350e(c14320b, c14321c, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void d0(Location location) throws NumberFormatException {
        if (location == null) {
            return;
        }
        c0("GPSProcessingMethod", location.getProvider());
        e0(location.getLatitude(), location.getLongitude());
        b0(location.getAltitude());
        c0("GPSSpeedRef", "K");
        c0("GPSSpeed", new C14324f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f28858U.format(new Date(location.getTime())).split("\\s+", -1);
        c0("GPSDateStamp", strArrSplit[0]);
        c0("GPSTimeStamp", strArrSplit[1]);
    }

    /* renamed from: e */
    public final void m32350e(C14320b c14320b, C14321c c14321c, byte[] bArr) throws IOException {
        int i = c14320b.readInt();
        c14321c.write(bArr);
        c14321c.m32377d(i);
        if (i % 2 == 1) {
            i++;
        }
        km6.m35909f(c14320b, c14321c, i);
    }

    public void e0(double d, double d2) throws NumberFormatException {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        }
        if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        c0("GPSLatitudeRef", d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "N" : "S");
        c0("GPSLatitude", m32348b(Math.abs(d)));
        c0("GPSLongitudeRef", d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "E" : "W");
        c0("GPSLongitude", m32348b(Math.abs(d2)));
    }

    /* renamed from: f */
    public double m32351f(double d) {
        double dM32353h = m32353h("GPSAltitude", -1.0d);
        int iM32354i = m32354i("GPSAltitudeRef", -1);
        if (dM32353h < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || iM32354i < 0) {
            return d;
        }
        return dM32353h * (iM32354i != 1 ? 1 : -1);
    }

    public final void f0(C14320b c14320b) throws Throwable {
        HashMap map = this.f28874f[4];
        C14322d c14322d = (C14322d) map.get("Compression");
        if (c14322d == null) {
            this.f28883o = 6;
            m32370z(c14320b, map);
            return;
        }
        int iM32393m = c14322d.m32393m(this.f28876h);
        this.f28883o = iM32393m;
        if (iM32393m != 1) {
            if (iM32393m == 6) {
                m32370z(c14320b, map);
                return;
            } else if (iM32393m != 7) {
                return;
            }
        }
        if (m32332K(map)) {
            m32325A(c14320b, map);
        }
    }

    /* renamed from: g */
    public String m32352g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C14322d c14322dM32355j = m32355j(str);
        if (c14322dM32355j != null) {
            if (!n0.contains(str)) {
                return c14322dM32355j.m32394n(this.f28876h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c14322dM32355j.f28901a;
                if (i != 5 && i != 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GPS Timestamp format is not rational. format=");
                    sb.append(c14322dM32355j.f28901a);
                    return null;
                }
                C14324f[] c14324fArr = (C14324f[]) c14322dM32355j.m32395o(this.f28876h);
                if (c14324fArr == null || c14324fArr.length != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid GPS Timestamp array. array=");
                    sb2.append(Arrays.toString(c14324fArr));
                    return null;
                }
                C14324f c14324f = c14324fArr[0];
                Integer numValueOf = Integer.valueOf((int) (c14324f.f28909a / c14324f.f28910b));
                C14324f c14324f2 = c14324fArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c14324f2.f28909a / c14324f2.f28910b));
                C14324f c14324f3 = c14324fArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c14324f3.f28909a / c14324f3.f28910b)));
            }
            try {
                return Double.toString(c14322dM32355j.m32392l(this.f28876h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public double m32353h(String str, double d) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C14322d c14322dM32355j = m32355j(str);
        if (c14322dM32355j == null) {
            return d;
        }
        try {
            return c14322dM32355j.m32392l(this.f28876h);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public final void h0(int i, int i2) throws Throwable {
        if (this.f28874f[i].isEmpty() || this.f28874f[i2].isEmpty()) {
            return;
        }
        C14322d c14322d = (C14322d) this.f28874f[i].get("ImageLength");
        C14322d c14322d2 = (C14322d) this.f28874f[i].get("ImageWidth");
        C14322d c14322d3 = (C14322d) this.f28874f[i2].get("ImageLength");
        C14322d c14322d4 = (C14322d) this.f28874f[i2].get("ImageWidth");
        if (c14322d == null || c14322d2 == null || c14322d3 == null || c14322d4 == null) {
            return;
        }
        int iM32393m = c14322d.m32393m(this.f28876h);
        int iM32393m2 = c14322d2.m32393m(this.f28876h);
        int iM32393m3 = c14322d3.m32393m(this.f28876h);
        int iM32393m4 = c14322d4.m32393m(this.f28876h);
        if (iM32393m >= iM32393m3 || iM32393m2 >= iM32393m4) {
            return;
        }
        HashMap[] mapArr = this.f28874f;
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* renamed from: i */
    public int m32354i(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C14322d c14322dM32355j = m32355j(str);
        if (c14322dM32355j == null) {
            return i;
        }
        try {
            return c14322dM32355j.m32393m(this.f28876h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final void i0(C14325g c14325g, int i) throws Throwable {
        C14322d c14322dM32390j;
        C14322d c14322dM32390j2;
        C14322d c14322d = (C14322d) this.f28874f[i].get("DefaultCropSize");
        C14322d c14322d2 = (C14322d) this.f28874f[i].get("SensorTopBorder");
        C14322d c14322d3 = (C14322d) this.f28874f[i].get("SensorLeftBorder");
        C14322d c14322d4 = (C14322d) this.f28874f[i].get("SensorBottomBorder");
        C14322d c14322d5 = (C14322d) this.f28874f[i].get("SensorRightBorder");
        if (c14322d == null) {
            if (c14322d2 == null || c14322d3 == null || c14322d4 == null || c14322d5 == null) {
                m32343W(c14325g, i);
                return;
            }
            int iM32393m = c14322d2.m32393m(this.f28876h);
            int iM32393m2 = c14322d4.m32393m(this.f28876h);
            int iM32393m3 = c14322d5.m32393m(this.f28876h);
            int iM32393m4 = c14322d3.m32393m(this.f28876h);
            if (iM32393m2 <= iM32393m || iM32393m3 <= iM32393m4) {
                return;
            }
            C14322d c14322dM32390j3 = C14322d.m32390j(iM32393m2 - iM32393m, this.f28876h);
            C14322d c14322dM32390j4 = C14322d.m32390j(iM32393m3 - iM32393m4, this.f28876h);
            this.f28874f[i].put("ImageLength", c14322dM32390j3);
            this.f28874f[i].put("ImageWidth", c14322dM32390j4);
            return;
        }
        if (c14322d.f28901a == 5) {
            C14324f[] c14324fArr = (C14324f[]) c14322d.m32395o(this.f28876h);
            if (c14324fArr == null || c14324fArr.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid crop size values. cropSize=");
                sb.append(Arrays.toString(c14324fArr));
                return;
            }
            c14322dM32390j = C14322d.m32388h(c14324fArr[0], this.f28876h);
            c14322dM32390j2 = C14322d.m32388h(c14324fArr[1], this.f28876h);
        } else {
            int[] iArr = (int[]) c14322d.m32395o(this.f28876h);
            if (iArr == null || iArr.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid crop size values. cropSize=");
                sb2.append(Arrays.toString(iArr));
                return;
            }
            c14322dM32390j = C14322d.m32390j(iArr[0], this.f28876h);
            c14322dM32390j2 = C14322d.m32390j(iArr[1], this.f28876h);
        }
        this.f28874f[i].put("ImageWidth", c14322dM32390j);
        this.f28874f[i].put("ImageLength", c14322dM32390j2);
    }

    /* renamed from: j */
    public final C14322d m32355j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < j0.length; i++) {
            C14322d c14322d = (C14322d) this.f28874f[i].get(str);
            if (c14322d != null) {
                return c14322d;
            }
        }
        return null;
    }

    public final void j0() throws Throwable {
        h0(0, 5);
        h0(0, 4);
        h0(5, 4);
        C14322d c14322d = (C14322d) this.f28874f[1].get("PixelXDimension");
        C14322d c14322d2 = (C14322d) this.f28874f[1].get("PixelYDimension");
        if (c14322d != null && c14322d2 != null) {
            this.f28874f[0].put("ImageWidth", c14322d);
            this.f28874f[0].put("ImageLength", c14322d2);
        }
        if (this.f28874f[4].isEmpty() && m32333M(this.f28874f[5])) {
            HashMap[] mapArr = this.f28874f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m32333M(this.f28874f[4]);
        m32342V(0, "ThumbnailOrientation", "Orientation");
        m32342V(0, "ThumbnailImageLength", "ImageLength");
        m32342V(0, "ThumbnailImageWidth", "ImageWidth");
        m32342V(5, "ThumbnailOrientation", "Orientation");
        m32342V(5, "ThumbnailImageLength", "ImageLength");
        m32342V(5, "ThumbnailImageWidth", "ImageWidth");
        m32342V(4, "Orientation", "ThumbnailOrientation");
        m32342V(4, "ImageLength", "ThumbnailImageLength");
        m32342V(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: k */
    public final void m32356k(C14325g c14325g) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                km6.C14868b.m35914a(mediaMetadataRetriever, new C14319a(c14325g));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f28874f[0].put("ImageWidth", C14322d.m32390j(Integer.parseInt(strExtractMetadata), this.f28876h));
                }
                if (strExtractMetadata2 != null) {
                    this.f28874f[0].put("ImageLength", C14322d.m32390j(Integer.parseInt(strExtractMetadata2), this.f28876h));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    this.f28874f[0].put("Orientation", C14322d.m32390j(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f28876h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c14325g.m32399g(i2);
                    byte[] bArr = new byte[6];
                    if (c14325g.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c14325g.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f28884p = i4;
                    m32339S(bArr2, 0);
                }
                if (f28864v) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Heif meta: ");
                    sb.append(strExtractMetadata);
                    sb.append("x");
                    sb.append(strExtractMetadata2);
                    sb.append(", rotation ");
                    sb.append(strExtractMetadata3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public final int k0(C14321c c14321c) throws IOException {
        C14323e[][] c14323eArr = j0;
        int[] iArr = new int[c14323eArr.length];
        int[] iArr2 = new int[c14323eArr.length];
        for (C14323e c14323e : k0) {
            m32341U(c14323e.f28906b);
        }
        if (this.f28877i) {
            if (this.f28878j) {
                m32341U("StripOffsets");
                m32341U("StripByteCounts");
            } else {
                m32341U("JPEGInterchangeFormat");
                m32341U("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < j0.length; i++) {
            for (Object obj : this.f28874f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f28874f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f28874f[1].isEmpty()) {
            this.f28874f[0].put(k0[1].f28906b, C14322d.m32386f(0L, this.f28876h));
        }
        if (!this.f28874f[2].isEmpty()) {
            this.f28874f[0].put(k0[2].f28906b, C14322d.m32386f(0L, this.f28876h));
        }
        if (!this.f28874f[3].isEmpty()) {
            this.f28874f[1].put(k0[3].f28906b, C14322d.m32386f(0L, this.f28876h));
        }
        if (this.f28877i) {
            if (this.f28878j) {
                this.f28874f[4].put("StripOffsets", C14322d.m32390j(0, this.f28876h));
                this.f28874f[4].put("StripByteCounts", C14322d.m32390j(this.f28881m, this.f28876h));
            } else {
                this.f28874f[4].put("JPEGInterchangeFormat", C14322d.m32386f(0L, this.f28876h));
                this.f28874f[4].put("JPEGInterchangeFormatLength", C14322d.m32386f(this.f28881m, this.f28876h));
            }
        }
        for (int i2 = 0; i2 < j0.length; i2++) {
            Iterator it = this.f28874f[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iM32396p = ((C14322d) ((Map.Entry) it.next()).getValue()).m32396p();
                if (iM32396p > 4) {
                    i3 += iM32396p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < j0.length; i4++) {
            if (!this.f28874f[i4].isEmpty()) {
                iArr[i4] = size;
                size += (this.f28874f[i4].size() * 12) + 2 + 4 + iArr2[i4];
            }
        }
        if (this.f28877i) {
            if (this.f28878j) {
                this.f28874f[4].put("StripOffsets", C14322d.m32390j(size, this.f28876h));
            } else {
                this.f28874f[4].put("JPEGInterchangeFormat", C14322d.m32386f(size, this.f28876h));
            }
            this.f28880l = size;
            size += this.f28881m;
        }
        if (this.f28872d == 4) {
            size += 8;
        }
        if (f28864v) {
            for (int i5 = 0; i5 < j0.length; i5++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(this.f28874f[i5].size()), Integer.valueOf(iArr2[i5]), Integer.valueOf(size));
            }
        }
        if (!this.f28874f[1].isEmpty()) {
            this.f28874f[0].put(k0[1].f28906b, C14322d.m32386f(iArr[1], this.f28876h));
        }
        if (!this.f28874f[2].isEmpty()) {
            this.f28874f[0].put(k0[2].f28906b, C14322d.m32386f(iArr[2], this.f28876h));
        }
        if (!this.f28874f[3].isEmpty()) {
            this.f28874f[1].put(k0[3].f28906b, C14322d.m32386f(iArr[3], this.f28876h));
        }
        int i6 = this.f28872d;
        if (i6 == 4) {
            c14321c.m32380h(size);
            c14321c.write(q0);
        } else if (i6 == 13) {
            c14321c.m32377d(size);
            c14321c.write(f28846I);
        } else if (i6 == 14) {
            c14321c.write(f28851N);
            c14321c.m32377d(size);
        }
        c14321c.m32378f(this.f28876h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c14321c.m32375a(this.f28876h);
        c14321c.m32380h(42);
        c14321c.m32379g(8L);
        for (int i7 = 0; i7 < j0.length; i7++) {
            if (!this.f28874f[i7].isEmpty()) {
                c14321c.m32380h(this.f28874f[i7].size());
                int size2 = iArr[i7] + 2 + (this.f28874f[i7].size() * 12) + 4;
                for (Map.Entry entry2 : this.f28874f[i7].entrySet()) {
                    int i8 = ((C14323e) m0[i7].get(entry2.getKey())).f28905a;
                    C14322d c14322d = (C14322d) entry2.getValue();
                    int iM32396p2 = c14322d.m32396p();
                    c14321c.m32380h(i8);
                    c14321c.m32380h(c14322d.f28901a);
                    c14321c.m32377d(c14322d.f28902b);
                    if (iM32396p2 > 4) {
                        c14321c.m32379g(size2);
                        size2 += iM32396p2;
                    } else {
                        c14321c.write(c14322d.f28904d);
                        if (iM32396p2 < 4) {
                            while (iM32396p2 < 4) {
                                c14321c.m32376c(0);
                                iM32396p2++;
                            }
                        }
                    }
                }
                if (i7 != 0 || this.f28874f[4].isEmpty()) {
                    c14321c.m32379g(0L);
                } else {
                    c14321c.m32379g(iArr[4]);
                }
                Iterator it2 = this.f28874f[i7].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((C14322d) ((Map.Entry) it2.next()).getValue()).f28904d;
                    if (bArr.length > 4) {
                        c14321c.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f28877i) {
            c14321c.write(m32368w());
        }
        if (this.f28872d == 14 && size % 2 == 1) {
            c14321c.m32376c(0);
        }
        c14321c.m32375a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        r20.m32373d(r19.f28876h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[LOOP:0: B:10:0x002f->B:61:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m32357l(C14320b c14320b, int i, int i2) throws Throwable {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getJpegAttributes starting with: ");
            sb.append(c14320b);
        }
        c14320b.m32373d(ByteOrder.BIG_ENDIAN);
        byte b = c14320b.readByte();
        byte b2 = -1;
        if (b != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b & 255));
        }
        if (c14320b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b & 255));
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte b3 = c14320b.readByte();
            if (b3 != b2) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b3 & 255));
            }
            int i5 = i4 + 1;
            byte b4 = c14320b.readByte();
            boolean z = f28864v;
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Found JPEG segment indicator: ");
                sb2.append(Integer.toHexString(b4 & 255));
            }
            int i6 = i5 + 1;
            if (b4 != -39 && b4 != -38) {
                int unsignedShort = c14320b.readUnsignedShort() - i3;
                int i7 = i6 + i3;
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("JPEG segment: ");
                    sb3.append(Integer.toHexString(b4 & 255));
                    sb3.append(" (length: ");
                    sb3.append(unsignedShort + 2);
                    sb3.append(")");
                }
                if (unsignedShort < 0) {
                    throw new IOException("Invalid length");
                }
                if (b4 == -31) {
                    byte[] bArr = new byte[unsignedShort];
                    c14320b.readFully(bArr);
                    int i8 = i7 + unsignedShort;
                    byte[] bArr2 = q0;
                    if (km6.m35910g(bArr, bArr2)) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr2.length, unsignedShort);
                        this.f28884p = i + i7 + bArr2.length;
                        m32339S(bArrCopyOfRange, i2);
                        f0(new C14320b(bArrCopyOfRange));
                    } else {
                        byte[] bArr3 = r0;
                        if (km6.m35910g(bArr, bArr3)) {
                            int length = i7 + bArr3.length;
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, unsignedShort);
                            if (m32352g("Xmp") == null) {
                                this.f28874f[0].put("Xmp", new C14322d(1, bArrCopyOfRange2.length, length, bArrCopyOfRange2));
                                this.f28889u = true;
                            }
                        }
                    }
                    i7 = i8;
                } else if (b4 != -2) {
                    switch (b4) {
                        default:
                            switch (b4) {
                                default:
                                    switch (b4) {
                                        default:
                                            switch (b4) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            c14320b.m32374f(1);
                                            this.f28874f[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", C14322d.m32386f(c14320b.readUnsignedShort(), this.f28876h));
                                            this.f28874f[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C14322d.m32386f(c14320b.readUnsignedShort(), this.f28876h));
                                            unsignedShort -= 5;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    if (unsignedShort >= 0) {
                        throw new IOException("Invalid length");
                    }
                    c14320b.m32374f(unsignedShort);
                    i4 = i7 + unsignedShort;
                    i3 = 2;
                    b2 = -1;
                } else {
                    byte[] bArr4 = new byte[unsignedShort];
                    if (c14320b.read(bArr4) != unsignedShort) {
                        throw new IOException("Invalid exif");
                    }
                    if (m32352g("UserComment") == null) {
                        this.f28874f[1].put("UserComment", C14322d.m32385e(new String(bArr4, p0)));
                    }
                }
                unsignedShort = 0;
                if (unsignedShort >= 0) {
                }
            }
        }
    }

    /* renamed from: m */
    public double[] m32358m() {
        String strM32352g = m32352g("GPSLatitude");
        String strM32352g2 = m32352g("GPSLatitudeRef");
        String strM32352g3 = m32352g("GPSLongitude");
        String strM32352g4 = m32352g("GPSLongitudeRef");
        if (strM32352g == null || strM32352g2 == null || strM32352g3 == null || strM32352g4 == null) {
            return null;
        }
        try {
            return new double[]{m32323c(strM32352g, strM32352g2), m32323c(strM32352g3, strM32352g4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Latitude/longitude values are not parsable. ");
            sb.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM32352g, strM32352g2, strM32352g3, strM32352g4));
            return null;
        }
    }

    /* renamed from: n */
    public final int m32359n(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m32320E(bArr)) {
            return 4;
        }
        if (m32330H(bArr)) {
            return 9;
        }
        if (m32327D(bArr)) {
            return 12;
        }
        if (m32328F(bArr)) {
            return 7;
        }
        if (m32331I(bArr)) {
            return 10;
        }
        if (m32329G(bArr)) {
            return 13;
        }
        return m32334N(bArr) ? 14 : 0;
    }

    /* renamed from: o */
    public final void m32360o(C14325g c14325g) throws Throwable {
        int i;
        int i2;
        m32363r(c14325g);
        C14322d c14322d = (C14322d) this.f28874f[1].get("MakerNote");
        if (c14322d != null) {
            C14325g c14325g2 = new C14325g(c14322d.f28904d);
            c14325g2.m32373d(this.f28876h);
            byte[] bArr = f28843F;
            byte[] bArr2 = new byte[bArr.length];
            c14325g2.readFully(bArr2);
            c14325g2.m32399g(0L);
            byte[] bArr3 = f28844G;
            byte[] bArr4 = new byte[bArr3.length];
            c14325g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c14325g2.m32399g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c14325g2.m32399g(12L);
            }
            m32340T(c14325g2, 6);
            C14322d c14322d2 = (C14322d) this.f28874f[7].get("PreviewImageStart");
            C14322d c14322d3 = (C14322d) this.f28874f[7].get("PreviewImageLength");
            if (c14322d2 != null && c14322d3 != null) {
                this.f28874f[5].put("JPEGInterchangeFormat", c14322d2);
                this.f28874f[5].put("JPEGInterchangeFormatLength", c14322d3);
            }
            C14322d c14322d4 = (C14322d) this.f28874f[8].get("AspectFrame");
            if (c14322d4 != null) {
                int[] iArr = (int[]) c14322d4.m32395o(this.f28876h);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C14322d c14322dM32390j = C14322d.m32390j(i5, this.f28876h);
                C14322d c14322dM32390j2 = C14322d.m32390j(i6, this.f28876h);
                this.f28874f[0].put("ImageWidth", c14322dM32390j);
                this.f28874f[0].put("ImageLength", c14322dM32390j2);
            }
        }
    }

    /* renamed from: p */
    public final void m32361p(C14320b c14320b) throws Throwable {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(c14320b);
        }
        c14320b.m32373d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f28845H;
        c14320b.m32374f(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i = c14320b.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (c14320b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i3 = i2 + 4;
                if (i3 == 16 && !Arrays.equals(bArr2, f28847J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f28848K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f28846I)) {
                    byte[] bArr3 = new byte[i];
                    if (c14320b.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + km6.m35904a(bArr2));
                    }
                    int i4 = c14320b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i4) {
                        this.f28884p = i3;
                        m32339S(bArr3, 0);
                        j0();
                        f0(new C14320b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i4 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = i + 4;
                c14320b.m32374f(i5);
                length = i3 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: q */
    public final void m32362q(C14320b c14320b) throws Throwable {
        boolean z = f28864v;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(c14320b);
        }
        c14320b.m32374f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c14320b.read(bArr);
        c14320b.read(bArr2);
        c14320b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c14320b.m32374f(i - c14320b.m32371a());
        c14320b.read(bArr4);
        m32357l(new C14320b(bArr4), i, 5);
        c14320b.m32374f(i3 - c14320b.m32371a());
        c14320b.m32373d(ByteOrder.BIG_ENDIAN);
        int i4 = c14320b.readInt();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c14320b.readUnsignedShort();
            int unsignedShort2 = c14320b.readUnsignedShort();
            if (unsignedShort == e0.f28905a) {
                short s = c14320b.readShort();
                short s2 = c14320b.readShort();
                C14322d c14322dM32390j = C14322d.m32390j(s, this.f28876h);
                C14322d c14322dM32390j2 = C14322d.m32390j(s2, this.f28876h);
                this.f28874f[0].put("ImageLength", c14322dM32390j);
                this.f28874f[0].put("ImageWidth", c14322dM32390j2);
                if (f28864v) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) s);
                    sb3.append(", width: ");
                    sb3.append((int) s2);
                    return;
                }
                return;
            }
            c14320b.m32374f(unsignedShort2);
        }
    }

    /* renamed from: r */
    public final void m32363r(C14325g c14325g) throws Throwable {
        C14322d c14322d;
        m32336P(c14325g);
        m32340T(c14325g, 0);
        i0(c14325g, 0);
        i0(c14325g, 5);
        i0(c14325g, 4);
        j0();
        if (this.f28872d != 8 || (c14322d = (C14322d) this.f28874f[1].get("MakerNote")) == null) {
            return;
        }
        C14325g c14325g2 = new C14325g(c14322d.f28904d);
        c14325g2.m32373d(this.f28876h);
        c14325g2.m32374f(6);
        m32340T(c14325g2, 9);
        C14322d c14322d2 = (C14322d) this.f28874f[9].get("ColorSpace");
        if (c14322d2 != null) {
            this.f28874f[1].put("ColorSpace", c14322d2);
        }
    }

    /* renamed from: s */
    public int m32364s() {
        switch (m32354i("Orientation", 1)) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: t */
    public final void m32365t(C14325g c14325g) throws Throwable {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(c14325g);
        }
        m32363r(c14325g);
        C14322d c14322d = (C14322d) this.f28874f[0].get("JpgFromRaw");
        if (c14322d != null) {
            m32357l(new C14320b(c14322d.f28904d), (int) c14322d.f28903c, 5);
        }
        C14322d c14322d2 = (C14322d) this.f28874f[0].get("ISO");
        C14322d c14322d3 = (C14322d) this.f28874f[1].get("PhotographicSensitivity");
        if (c14322d2 == null || c14322d3 != null) {
            return;
        }
        this.f28874f[1].put("PhotographicSensitivity", c14322d2);
    }

    /* renamed from: u */
    public final void m32366u(C14325g c14325g) throws IOException {
        byte[] bArr = q0;
        c14325g.m32374f(bArr.length);
        byte[] bArr2 = new byte[c14325g.available()];
        c14325g.readFully(bArr2);
        this.f28884p = bArr.length;
        m32339S(bArr2, 0);
    }

    /* renamed from: v */
    public byte[] m32367v() {
        int i = this.f28883o;
        if (i == 6 || i == 7) {
            return m32368w();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m32368w() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th2;
        InputStream inputStream = null;
        if (!this.f28877i) {
            return null;
        }
        byte[] bArr = this.f28882n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f28871c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        km6.m35906c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                    km6.m35906c(fileInputStream);
                    if (fileDescriptor != null) {
                    }
                    return null;
                } catch (Throwable th3) {
                    inputStream = fileInputStream;
                    th = th3;
                    fileDescriptor = null;
                    km6.m35906c(inputStream);
                    if (fileDescriptor == null) {
                    }
                }
            } else if (this.f28869a != null) {
                fileInputStream = new FileInputStream(this.f28869a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorM35912b = km6.C14867a.m35912b(this.f28870b);
                try {
                    km6.C14867a.m35913c(fileDescriptorM35912b, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorM35912b;
                    fileInputStream = new FileInputStream(fileDescriptorM35912b);
                } catch (Exception unused2) {
                    fileDescriptor = fileDescriptorM35912b;
                    fileInputStream = null;
                    km6.m35906c(fileInputStream);
                    if (fileDescriptor != null) {
                    }
                    return null;
                } catch (Throwable th4) {
                    th2 = th4;
                    fileDescriptor = fileDescriptorM35912b;
                    th = th2;
                    km6.m35906c(inputStream);
                    if (fileDescriptor == null) {
                    }
                }
            }
            try {
                if (fileInputStream.skip(this.f28880l + this.f28884p) != this.f28880l + this.f28884p) {
                    throw new IOException("Corrupted image");
                }
                byte[] bArr2 = new byte[this.f28881m];
                if (fileInputStream.read(bArr2) != this.f28881m) {
                    throw new IOException("Corrupted image");
                }
                this.f28882n = bArr2;
                km6.m35906c(fileInputStream);
                if (fileDescriptor != null) {
                    km6.m35905b(fileDescriptor);
                }
                return bArr2;
            } catch (Exception unused3) {
                km6.m35906c(fileInputStream);
                if (fileDescriptor != null) {
                    km6.m35905b(fileDescriptor);
                }
                return null;
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = fileInputStream;
                th = th2;
                km6.m35906c(inputStream);
                if (fileDescriptor == null) {
                    throw th;
                }
                km6.m35905b(fileDescriptor);
                throw th;
            }
        } catch (Exception unused4) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th6) {
            th = th6;
            fileDescriptor = null;
        }
    }

    /* renamed from: x */
    public final void m32369x(C14320b c14320b) throws Throwable {
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(c14320b);
        }
        c14320b.m32373d(ByteOrder.LITTLE_ENDIAN);
        c14320b.m32374f(f28849L.length);
        int i = c14320b.readInt() + 8;
        byte[] bArr = f28850M;
        c14320b.m32374f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c14320b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c14320b.readInt();
                int i3 = length + 4 + 4;
                if (Arrays.equals(f28851N, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c14320b.read(bArr3) == i2) {
                        this.f28884p = i3;
                        m32339S(bArr3, 0);
                        f0(new C14320b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + km6.m35904a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c14320b.m32374f(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: z */
    public final void m32370z(C14320b c14320b, HashMap map) throws Throwable {
        C14322d c14322d = (C14322d) map.get("JPEGInterchangeFormat");
        C14322d c14322d2 = (C14322d) map.get("JPEGInterchangeFormatLength");
        if (c14322d == null || c14322d2 == null) {
            return;
        }
        int iM32393m = c14322d.m32393m(this.f28876h);
        int iM32393m2 = c14322d2.m32393m(this.f28876h);
        if (this.f28872d == 7) {
            iM32393m += this.f28885q;
        }
        if (iM32393m > 0 && iM32393m2 > 0) {
            this.f28877i = true;
            if (this.f28869a == null && this.f28871c == null && this.f28870b == null) {
                byte[] bArr = new byte[iM32393m2];
                c14320b.skip(iM32393m);
                c14320b.read(bArr);
                this.f28882n = bArr;
            }
            this.f28880l = iM32393m;
            this.f28881m = iM32393m2;
        }
        if (f28864v) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting thumbnail attributes with offset: ");
            sb.append(iM32393m);
            sb.append(", length: ");
            sb.append(iM32393m2);
        }
    }

    /* renamed from: o.im6$g */
    public static class C14325g extends C14320b {
        public C14325g(byte[] bArr) {
            super(bArr);
            this.f28895a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        /* renamed from: g */
        public void m32399g(long j) throws IOException {
            int i = this.f28897c;
            if (i > j) {
                this.f28897c = 0;
                this.f28895a.reset();
            } else {
                j -= i;
            }
            m32374f((int) j);
        }

        public C14325g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f28895a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: o.im6$e */
    public static class C14323e {

        /* renamed from: a */
        public final int f28905a;

        /* renamed from: b */
        public final String f28906b;

        /* renamed from: c */
        public final int f28907c;

        /* renamed from: d */
        public final int f28908d;

        public C14323e(String str, int i, int i2) {
            this.f28906b = str;
            this.f28905a = i;
            this.f28907c = i2;
            this.f28908d = -1;
        }

        /* renamed from: a */
        public boolean m32397a(int i) {
            int i2;
            int i3 = this.f28907c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f28908d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public C14323e(String str, int i, int i2, int i3) {
            this.f28906b = str;
            this.f28905a = i;
            this.f28907c = i2;
            this.f28908d = i3;
        }
    }

    public im6(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public im6(InputStream inputStream, int i) {
        C14323e[][] c14323eArr = j0;
        this.f28874f = new HashMap[c14323eArr.length];
        this.f28875g = new HashSet(c14323eArr.length);
        this.f28876h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f28869a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, q0.length);
                if (!m32319C(bufferedInputStream)) {
                    return;
                }
                this.f28873e = true;
                this.f28871c = null;
                this.f28870b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f28871c = (AssetManager.AssetInputStream) inputStream;
                this.f28870b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m32321J(fileInputStream.getFD())) {
                    this.f28871c = null;
                    this.f28870b = fileInputStream.getFD();
                } else {
                    this.f28871c = null;
                    this.f28870b = null;
                }
            }
            m32335O(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
