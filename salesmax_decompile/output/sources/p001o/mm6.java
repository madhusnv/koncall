package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001o.hm6;

/* loaded from: classes2.dex */
public final class mm6 extends FilterOutputStream {

    /* renamed from: g */
    public static final byte[] f35685g = "Exif\u0000\u0000".getBytes(gm6.f25443e);

    /* renamed from: a */
    public final hm6 f35686a;

    /* renamed from: b */
    public final byte[] f35687b;

    /* renamed from: c */
    public final ByteBuffer f35688c;

    /* renamed from: d */
    public int f35689d;

    /* renamed from: e */
    public int f35690e;

    /* renamed from: f */
    public int f35691f;

    /* renamed from: o.mm6$a */
    public static final class C15362a {
        /* renamed from: a */
        public static boolean m39353a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public mm6(OutputStream outputStream, hm6 hm6Var) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f35687b = new byte[1];
        this.f35688c = ByteBuffer.allocate(4);
        this.f35689d = 0;
        this.f35686a = hm6Var;
    }

    /* renamed from: a */
    public final int m39351a(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, i - this.f35688c.position());
        this.f35688c.put(bArr, i2, iMin);
        return iMin;
    }

    /* renamed from: c */
    public final void m39352c(iq1 iq1Var) throws IOException {
        om6[][] om6VarArr = hm6.f27146i;
        int[] iArr = new int[om6VarArr.length];
        int[] iArr2 = new int[om6VarArr.length];
        for (om6 om6Var : hm6.f27144g) {
            for (int i = 0; i < hm6.f27146i.length; i++) {
                this.f35686a.m30789c(i).remove(om6Var.f38579b);
            }
        }
        if (!this.f35686a.m30789c(1).isEmpty()) {
            this.f35686a.m30789c(0).put(hm6.f27144g[1].f38579b, gm6.m29047f(0L, this.f35686a.m30790d()));
        }
        if (!this.f35686a.m30789c(2).isEmpty()) {
            this.f35686a.m30789c(0).put(hm6.f27144g[2].f38579b, gm6.m29047f(0L, this.f35686a.m30790d()));
        }
        if (!this.f35686a.m30789c(3).isEmpty()) {
            this.f35686a.m30789c(1).put(hm6.f27144g[3].f38579b, gm6.m29047f(0L, this.f35686a.m30790d()));
        }
        for (int i2 = 0; i2 < hm6.f27146i.length; i2++) {
            Iterator it = this.f35686a.m30789c(i2).entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iM29051j = ((gm6) ((Map.Entry) it.next()).getValue()).m29051j();
                if (iM29051j > 4) {
                    i3 += iM29051j;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < hm6.f27146i.length; i4++) {
            if (!this.f35686a.m30789c(i4).isEmpty()) {
                iArr[i4] = size;
                size += (this.f35686a.m30789c(i4).size() * 12) + 2 + 4 + iArr2[i4];
            }
        }
        int i5 = size + 8;
        if (!this.f35686a.m30789c(1).isEmpty()) {
            this.f35686a.m30789c(0).put(hm6.f27144g[1].f38579b, gm6.m29047f(iArr[1], this.f35686a.m30790d()));
        }
        if (!this.f35686a.m30789c(2).isEmpty()) {
            this.f35686a.m30789c(0).put(hm6.f27144g[2].f38579b, gm6.m29047f(iArr[2], this.f35686a.m30790d()));
        }
        if (!this.f35686a.m30789c(3).isEmpty()) {
            this.f35686a.m30789c(1).put(hm6.f27144g[3].f38579b, gm6.m29047f(iArr[3], this.f35686a.m30790d()));
        }
        iq1Var.m32543h(i5);
        iq1Var.write(f35685g);
        iq1Var.m32541f(this.f35686a.m30790d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        iq1Var.m32538a(this.f35686a.m30790d());
        iq1Var.m32543h(42);
        iq1Var.m32542g(8L);
        for (int i6 = 0; i6 < hm6.f27146i.length; i6++) {
            if (!this.f35686a.m30789c(i6).isEmpty()) {
                iq1Var.m32543h(this.f35686a.m30789c(i6).size());
                int size2 = iArr[i6] + 2 + (this.f35686a.m30789c(i6).size() * 12) + 4;
                for (Map.Entry entry : this.f35686a.m30789c(i6).entrySet()) {
                    int i7 = ((om6) fgd.m26664h((om6) ((HashMap) hm6.C13999b.f27154f.get(i6)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f38578a;
                    gm6 gm6Var = (gm6) entry.getValue();
                    int iM29051j2 = gm6Var.m29051j();
                    iq1Var.m32543h(i7);
                    iq1Var.m32543h(gm6Var.f25447a);
                    iq1Var.m32540d(gm6Var.f25448b);
                    if (iM29051j2 > 4) {
                        iq1Var.m32542g(size2);
                        size2 += iM29051j2;
                    } else {
                        iq1Var.write(gm6Var.f25450d);
                        if (iM29051j2 < 4) {
                            while (iM29051j2 < 4) {
                                iq1Var.m32539c(0);
                                iM29051j2++;
                            }
                        }
                    }
                }
                iq1Var.m32542g(0L);
                Iterator it2 = this.f35686a.m30789c(i6).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((gm6) ((Map.Entry) it2.next()).getValue()).f25450d;
                    if (bArr.length > 4) {
                        iq1Var.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        iq1Var.m32538a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.f35690e;
            if ((i3 <= 0 && this.f35691f <= 0 && this.f35689d == 2) || i2 <= 0) {
                break;
            }
            if (i3 > 0) {
                int iMin = Math.min(i2, i3);
                i2 -= iMin;
                this.f35690e -= iMin;
                i += iMin;
            }
            int i4 = this.f35691f;
            if (i4 > 0) {
                int iMin2 = Math.min(i2, i4);
                ((FilterOutputStream) this).out.write(bArr, i, iMin2);
                i2 -= iMin2;
                this.f35691f -= iMin2;
                i += iMin2;
            }
            if (i2 == 0) {
                return;
            }
            int i5 = this.f35689d;
            if (i5 == 0) {
                int iM39351a = m39351a(2, bArr, i, i2);
                i += iM39351a;
                i2 -= iM39351a;
                if (this.f35688c.position() < 2) {
                    return;
                }
                this.f35688c.rewind();
                if (this.f35688c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f35688c.array(), 0, 2);
                this.f35689d = 1;
                this.f35688c.rewind();
                iq1 iq1Var = new iq1(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                iq1Var.m32541f((short) -31);
                m39352c(iq1Var);
            } else if (i5 != 1) {
                continue;
            } else {
                int iM39351a2 = m39351a(4, bArr, i, i2);
                i += iM39351a2;
                i2 -= iM39351a2;
                if (this.f35688c.position() == 2 && this.f35688c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f35688c.array(), 0, 2);
                    this.f35688c.rewind();
                }
                if (this.f35688c.position() < 4) {
                    return;
                }
                this.f35688c.rewind();
                short s = this.f35688c.getShort();
                if (s == -31) {
                    this.f35690e = (this.f35688c.getShort() & 65535) - 2;
                    this.f35689d = 2;
                } else if (C15362a.m39353a(s)) {
                    ((FilterOutputStream) this).out.write(this.f35688c.array(), 0, 4);
                    this.f35689d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f35688c.array(), 0, 4);
                    this.f35691f = (this.f35688c.getShort() & 65535) - 2;
                }
                this.f35688c.rewind();
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f35687b;
        bArr[0] = (byte) (i & Constants.MAX_HOST_LENGTH);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
