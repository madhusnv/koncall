package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.Opcodes;
import p001o.jqi;

/* loaded from: classes6.dex */
public abstract class nf3 extends jq1 {

    /* renamed from: c */
    public static final Logger f36762c = Logger.getLogger(nf3.class.getName());

    /* renamed from: d */
    public static final boolean f36763d = z4i.m58697I();

    /* renamed from: a */
    public pf3 f36764a;

    /* renamed from: b */
    public boolean f36765b;

    /* renamed from: o.nf3$b */
    public static abstract class AbstractC15562b extends nf3 {

        /* renamed from: e */
        public final byte[] f36766e;

        /* renamed from: f */
        public final int f36767f;

        /* renamed from: g */
        public int f36768g;

        /* renamed from: h */
        public int f36769h;

        public AbstractC15562b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f36766e = bArr;
            this.f36767f = bArr.length;
        }

        public final void a1(byte b) {
            byte[] bArr = this.f36766e;
            int i = this.f36768g;
            this.f36768g = i + 1;
            bArr[i] = b;
            this.f36769h++;
        }

        public final void b1(int i) {
            byte[] bArr = this.f36766e;
            int i2 = this.f36768g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & Constants.MAX_HOST_LENGTH);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
            this.f36768g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
            this.f36769h += 4;
        }

        public final void c1(long j) {
            byte[] bArr = this.f36766e;
            int i = this.f36768g;
            int i2 = i + 1;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & Constants.MAX_HOST_LENGTH);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & Constants.MAX_HOST_LENGTH);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & Constants.MAX_HOST_LENGTH);
            this.f36768g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & Constants.MAX_HOST_LENGTH);
            this.f36769h += 8;
        }

        public final void d1(int i) {
            if (i >= 0) {
                f1(i);
            } else {
                g1(i);
            }
        }

        public final void e1(int i, int i2) {
            f1(fbj.m26427c(i, i2));
        }

        public final void f1(int i) {
            if (!nf3.f36763d) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f36766e;
                    int i2 = this.f36768g;
                    this.f36768g = i2 + 1;
                    bArr[i2] = (byte) ((i & Opcodes.LAND) | 128);
                    this.f36769h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.f36766e;
                int i3 = this.f36768g;
                this.f36768g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.f36769h++;
                return;
            }
            long j = this.f36768g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f36766e;
                int i4 = this.f36768g;
                this.f36768g = i4 + 1;
                z4i.m58703O(bArr3, i4, (byte) ((i & Opcodes.LAND) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.f36766e;
            int i5 = this.f36768g;
            this.f36768g = i5 + 1;
            z4i.m58703O(bArr4, i5, (byte) i);
            this.f36769h += (int) (this.f36768g - j);
        }

        @Override // p001o.nf3
        public final int g0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void g1(long j) {
            if (!nf3.f36763d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f36766e;
                    int i = this.f36768g;
                    this.f36768g = i + 1;
                    bArr[i] = (byte) ((((int) j) & Opcodes.LAND) | 128);
                    this.f36769h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.f36766e;
                int i2 = this.f36768g;
                this.f36768g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.f36769h++;
                return;
            }
            long j2 = this.f36768g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f36766e;
                int i3 = this.f36768g;
                this.f36768g = i3 + 1;
                z4i.m58703O(bArr3, i3, (byte) ((((int) j) & Opcodes.LAND) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f36766e;
            int i4 = this.f36768g;
            this.f36768g = i4 + 1;
            z4i.m58703O(bArr4, i4, (byte) j);
            this.f36769h += (int) (this.f36768g - j2);
        }
    }

    /* renamed from: o.nf3$c */
    public static class C15563c extends nf3 {

        /* renamed from: e */
        public final byte[] f36770e;

        /* renamed from: f */
        public final int f36771f;

        /* renamed from: g */
        public final int f36772g;

        /* renamed from: h */
        public int f36773h;

        public C15563c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f36770e = bArr;
            this.f36771f = i;
            this.f36773h = i;
            this.f36772g = i3;
        }

        @Override // p001o.nf3
        public final void C0(int i, int i2) throws C15564d {
            V0(i, 0);
            D0(i2);
        }

        @Override // p001o.nf3
        public final void D0(int i) throws C15564d {
            if (i >= 0) {
                X0(i);
            } else {
                Z0(i);
            }
        }

        @Override // p001o.nf3
        public final void G0(int i, scb scbVar, n5f n5fVar) throws C15564d {
            V0(i, 2);
            X0(((r8) scbVar).getSerializedSize(n5fVar));
            n5fVar.mo40131j(scbVar, this.f36764a);
        }

        @Override // p001o.nf3
        public final void H0(scb scbVar) throws C15564d {
            X0(scbVar.getSerializedSize());
            scbVar.writeTo(this);
        }

        @Override // p001o.nf3
        public final void I0(int i, scb scbVar) throws C15564d {
            V0(1, 3);
            W0(2, i);
            c1(3, scbVar);
            V0(1, 4);
        }

        @Override // p001o.nf3
        public final void J0(int i, xq1 xq1Var) throws C15564d {
            V0(1, 3);
            W0(2, i);
            m0(3, xq1Var);
            V0(1, 4);
        }

        @Override // p001o.nf3
        public final void T0(int i, String str) throws C15564d {
            V0(i, 2);
            U0(str);
        }

        @Override // p001o.nf3
        public final void U0(String str) throws C15564d {
            int i = this.f36773h;
            try {
                int iM40459V = nf3.m40459V(str.length() * 3);
                int iM40459V2 = nf3.m40459V(str.length());
                if (iM40459V2 == iM40459V) {
                    int i2 = i + iM40459V2;
                    this.f36773h = i2;
                    int iM34292i = jqi.m34292i(str, this.f36770e, i2, g0());
                    this.f36773h = i;
                    X0((iM34292i - i) - iM40459V2);
                    this.f36773h = iM34292i;
                } else {
                    X0(jqi.m34293j(str));
                    this.f36773h = jqi.m34292i(str, this.f36770e, this.f36773h, g0());
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(e);
            } catch (jqi.C14632d e2) {
                this.f36773h = i;
                b0(str, e2);
            }
        }

        @Override // p001o.nf3
        public final void V0(int i, int i2) throws C15564d {
            X0(fbj.m26427c(i, i2));
        }

        @Override // p001o.nf3
        public final void W0(int i, int i2) throws C15564d {
            V0(i, 0);
            X0(i2);
        }

        @Override // p001o.nf3
        public final void X0(int i) throws C15564d {
            if (!nf3.f36763d || bd0.m18627c() || g0() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f36770e;
                        int i2 = this.f36773h;
                        this.f36773h = i2 + 1;
                        bArr[i2] = (byte) ((i & Opcodes.LAND) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), 1), e);
                    }
                }
                byte[] bArr2 = this.f36770e;
                int i3 = this.f36773h;
                this.f36773h = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f36770e;
                int i4 = this.f36773h;
                this.f36773h = i4 + 1;
                z4i.m58703O(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f36770e;
            int i5 = this.f36773h;
            this.f36773h = i5 + 1;
            z4i.m58703O(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f36770e;
                int i7 = this.f36773h;
                this.f36773h = i7 + 1;
                z4i.m58703O(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f36770e;
            int i8 = this.f36773h;
            this.f36773h = i8 + 1;
            z4i.m58703O(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f36770e;
                int i10 = this.f36773h;
                this.f36773h = i10 + 1;
                z4i.m58703O(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f36770e;
            int i11 = this.f36773h;
            this.f36773h = i11 + 1;
            z4i.m58703O(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f36770e;
                int i13 = this.f36773h;
                this.f36773h = i13 + 1;
                z4i.m58703O(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f36770e;
            int i14 = this.f36773h;
            this.f36773h = i14 + 1;
            z4i.m58703O(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f36770e;
            int i15 = this.f36773h;
            this.f36773h = i15 + 1;
            z4i.m58703O(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // p001o.nf3
        public final void Y0(int i, long j) throws C15564d {
            V0(i, 0);
            Z0(j);
        }

        @Override // p001o.nf3
        public final void Z0(long j) throws C15564d {
            if (nf3.f36763d && g0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f36770e;
                    int i = this.f36773h;
                    this.f36773h = i + 1;
                    z4i.m58703O(bArr, i, (byte) ((((int) j) & Opcodes.LAND) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f36770e;
                int i2 = this.f36773h;
                this.f36773h = i2 + 1;
                z4i.m58703O(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f36770e;
                    int i3 = this.f36773h;
                    this.f36773h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & Opcodes.LAND) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), 1), e);
                }
            }
            byte[] bArr4 = this.f36770e;
            int i4 = this.f36773h;
            this.f36773h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // p001o.jq1
        /* renamed from: a */
        public final void mo34212a(ByteBuffer byteBuffer) throws C15564d {
            a1(byteBuffer);
        }

        @Override // p001o.nf3
        public void a0() {
        }

        public final void a1(ByteBuffer byteBuffer) throws C15564d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f36770e, this.f36773h, iRemaining);
                this.f36773h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // p001o.nf3, p001o.jq1
        /* renamed from: b */
        public final void mo34213b(byte[] bArr, int i, int i2) throws C15564d {
            b1(bArr, i, i2);
        }

        public final void b1(byte[] bArr, int i, int i2) throws C15564d {
            try {
                System.arraycopy(bArr, i, this.f36770e, this.f36773h, i2);
                this.f36773h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), Integer.valueOf(i2)), e);
            }
        }

        public final void c1(int i, scb scbVar) throws C15564d {
            V0(i, 2);
            H0(scbVar);
        }

        @Override // p001o.nf3
        public final int g0() {
            return this.f36772g - this.f36773h;
        }

        @Override // p001o.nf3
        public final void h0(byte b) throws C15564d {
            try {
                byte[] bArr = this.f36770e;
                int i = this.f36773h;
                this.f36773h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), 1), e);
            }
        }

        @Override // p001o.nf3
        public final void i0(int i, boolean z) throws C15564d {
            V0(i, 0);
            h0(z ? (byte) 1 : (byte) 0);
        }

        @Override // p001o.nf3
        public final void l0(byte[] bArr, int i, int i2) throws C15564d {
            X0(i2);
            b1(bArr, i, i2);
        }

        @Override // p001o.nf3
        public final void m0(int i, xq1 xq1Var) throws C15564d {
            V0(i, 2);
            n0(xq1Var);
        }

        @Override // p001o.nf3
        public final void n0(xq1 xq1Var) throws C15564d {
            X0(xq1Var.size());
            xq1Var.mo53608T(this);
        }

        @Override // p001o.nf3
        public final void s0(int i, int i2) throws C15564d {
            V0(i, 5);
            t0(i2);
        }

        @Override // p001o.nf3
        public final void t0(int i) throws C15564d {
            try {
                byte[] bArr = this.f36770e;
                int i2 = this.f36773h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & Constants.MAX_HOST_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
                this.f36773h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), 1), e);
            }
        }

        @Override // p001o.nf3
        public final void u0(int i, long j) throws C15564d {
            V0(i, 1);
            v0(j);
        }

        @Override // p001o.nf3
        public final void v0(long j) throws C15564d {
            try {
                byte[] bArr = this.f36770e;
                int i = this.f36773h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & Constants.MAX_HOST_LENGTH);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & Constants.MAX_HOST_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & Constants.MAX_HOST_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & Constants.MAX_HOST_LENGTH);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & Constants.MAX_HOST_LENGTH);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & Constants.MAX_HOST_LENGTH);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & Constants.MAX_HOST_LENGTH);
                this.f36773h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & Constants.MAX_HOST_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new C15564d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36773h), Integer.valueOf(this.f36772g), 1), e);
            }
        }
    }

    /* renamed from: o.nf3$d */
    public static class C15564d extends IOException {
        public C15564d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public C15564d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: o.nf3$e */
    public static final class C15565e extends AbstractC15562b {

        /* renamed from: i */
        public final OutputStream f36774i;

        public C15565e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f36774i = outputStream;
        }

        @Override // p001o.nf3
        public void C0(int i, int i2) throws IOException {
            i1(20);
            e1(i, 0);
            d1(i2);
        }

        @Override // p001o.nf3
        public void D0(int i) throws IOException {
            if (i >= 0) {
                X0(i);
            } else {
                Z0(i);
            }
        }

        @Override // p001o.nf3
        public void G0(int i, scb scbVar, n5f n5fVar) throws IOException {
            V0(i, 2);
            m1(scbVar, n5fVar);
        }

        @Override // p001o.nf3
        public void H0(scb scbVar) throws IOException {
            X0(scbVar.getSerializedSize());
            scbVar.writeTo(this);
        }

        @Override // p001o.nf3
        public void I0(int i, scb scbVar) throws IOException {
            V0(1, 3);
            W0(2, i);
            l1(3, scbVar);
            V0(1, 4);
        }

        @Override // p001o.nf3
        public void J0(int i, xq1 xq1Var) throws IOException {
            V0(1, 3);
            W0(2, i);
            m0(3, xq1Var);
            V0(1, 4);
        }

        @Override // p001o.nf3
        public void T0(int i, String str) throws IOException {
            V0(i, 2);
            U0(str);
        }

        @Override // p001o.nf3
        public void U0(String str) throws IOException {
            int iM34293j;
            try {
                int length = str.length() * 3;
                int iM40459V = nf3.m40459V(length);
                int i = iM40459V + length;
                int i2 = this.f36767f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM34292i = jqi.m34292i(str, bArr, 0, length);
                    X0(iM34292i);
                    mo34213b(bArr, 0, iM34292i);
                    return;
                }
                if (i > i2 - this.f36768g) {
                    h1();
                }
                int iM40459V2 = nf3.m40459V(str.length());
                int i3 = this.f36768g;
                try {
                    if (iM40459V2 == iM40459V) {
                        int i4 = i3 + iM40459V2;
                        this.f36768g = i4;
                        int iM34292i2 = jqi.m34292i(str, this.f36766e, i4, this.f36767f - i4);
                        this.f36768g = i3;
                        iM34293j = (iM34292i2 - i3) - iM40459V2;
                        f1(iM34293j);
                        this.f36768g = iM34292i2;
                    } else {
                        iM34293j = jqi.m34293j(str);
                        f1(iM34293j);
                        this.f36768g = jqi.m34292i(str, this.f36766e, this.f36768g, iM34293j);
                    }
                    this.f36769h += iM34293j;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C15564d(e);
                } catch (jqi.C14632d e2) {
                    this.f36769h -= this.f36768g - i3;
                    this.f36768g = i3;
                    throw e2;
                }
            } catch (jqi.C14632d e3) {
                b0(str, e3);
            }
        }

        @Override // p001o.nf3
        public void V0(int i, int i2) throws IOException {
            X0(fbj.m26427c(i, i2));
        }

        @Override // p001o.nf3
        public void W0(int i, int i2) throws IOException {
            i1(20);
            e1(i, 0);
            f1(i2);
        }

        @Override // p001o.nf3
        public void X0(int i) throws IOException {
            i1(5);
            f1(i);
        }

        @Override // p001o.nf3
        public void Y0(int i, long j) throws IOException {
            i1(20);
            e1(i, 0);
            g1(j);
        }

        @Override // p001o.nf3
        public void Z0(long j) throws IOException {
            i1(10);
            g1(j);
        }

        @Override // p001o.jq1
        /* renamed from: a */
        public void mo34212a(ByteBuffer byteBuffer) throws IOException {
            j1(byteBuffer);
        }

        @Override // p001o.nf3
        public void a0() throws IOException {
            if (this.f36768g > 0) {
                h1();
            }
        }

        @Override // p001o.nf3, p001o.jq1
        /* renamed from: b */
        public void mo34213b(byte[] bArr, int i, int i2) throws IOException {
            k1(bArr, i, i2);
        }

        @Override // p001o.nf3
        public void h0(byte b) throws IOException {
            if (this.f36768g == this.f36767f) {
                h1();
            }
            a1(b);
        }

        public final void h1() throws IOException {
            this.f36774i.write(this.f36766e, 0, this.f36768g);
            this.f36768g = 0;
        }

        @Override // p001o.nf3
        public void i0(int i, boolean z) throws IOException {
            i1(11);
            e1(i, 0);
            a1(z ? (byte) 1 : (byte) 0);
        }

        public final void i1(int i) throws IOException {
            if (this.f36767f - this.f36768g < i) {
                h1();
            }
        }

        public void j1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f36767f;
            int i2 = this.f36768g;
            if (i - i2 >= iRemaining) {
                byteBuffer.get(this.f36766e, i2, iRemaining);
                this.f36768g += iRemaining;
                this.f36769h += iRemaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f36766e, i2, i3);
            int i4 = iRemaining - i3;
            this.f36768g = this.f36767f;
            this.f36769h += i3;
            h1();
            while (true) {
                int i5 = this.f36767f;
                if (i4 <= i5) {
                    byteBuffer.get(this.f36766e, 0, i4);
                    this.f36768g = i4;
                    this.f36769h += i4;
                    return;
                } else {
                    byteBuffer.get(this.f36766e, 0, i5);
                    this.f36774i.write(this.f36766e, 0, this.f36767f);
                    int i6 = this.f36767f;
                    i4 -= i6;
                    this.f36769h += i6;
                }
            }
        }

        public void k1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f36767f;
            int i4 = this.f36768g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f36766e, i4, i2);
                this.f36768g += i2;
                this.f36769h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f36766e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f36768g = this.f36767f;
            this.f36769h += i5;
            h1();
            if (i7 <= this.f36767f) {
                System.arraycopy(bArr, i6, this.f36766e, 0, i7);
                this.f36768g = i7;
            } else {
                this.f36774i.write(bArr, i6, i7);
            }
            this.f36769h += i7;
        }

        @Override // p001o.nf3
        public void l0(byte[] bArr, int i, int i2) throws IOException {
            X0(i2);
            k1(bArr, i, i2);
        }

        public void l1(int i, scb scbVar) throws IOException {
            V0(i, 2);
            H0(scbVar);
        }

        @Override // p001o.nf3
        public void m0(int i, xq1 xq1Var) throws IOException {
            V0(i, 2);
            n0(xq1Var);
        }

        public void m1(scb scbVar, n5f n5fVar) throws IOException {
            X0(((r8) scbVar).getSerializedSize(n5fVar));
            n5fVar.mo40131j(scbVar, this.f36764a);
        }

        @Override // p001o.nf3
        public void n0(xq1 xq1Var) throws IOException {
            X0(xq1Var.size());
            xq1Var.mo53608T(this);
        }

        @Override // p001o.nf3
        public void s0(int i, int i2) throws IOException {
            i1(14);
            e1(i, 5);
            b1(i2);
        }

        @Override // p001o.nf3
        public void t0(int i) throws IOException {
            i1(4);
            b1(i);
        }

        @Override // p001o.nf3
        public void u0(int i, long j) throws IOException {
            i1(18);
            e1(i, 1);
            c1(j);
        }

        @Override // p001o.nf3
        public void v0(long j) throws IOException {
            i1(8);
            c1(j);
        }
    }

    /* renamed from: A */
    public static int m40438A(int i) {
        return m40459V(i) + i;
    }

    /* renamed from: B */
    public static int m40439B(int i, scb scbVar) {
        return (m40457T(1) * 2) + m40458U(2, i) + m40440C(3, scbVar);
    }

    /* renamed from: C */
    public static int m40440C(int i, scb scbVar) {
        return m40457T(i) + m40442E(scbVar);
    }

    /* renamed from: D */
    public static int m40441D(int i, scb scbVar, n5f n5fVar) {
        return m40457T(i) + m40443F(scbVar, n5fVar);
    }

    /* renamed from: E */
    public static int m40442E(scb scbVar) {
        return m40438A(scbVar.getSerializedSize());
    }

    /* renamed from: F */
    public static int m40443F(scb scbVar, n5f n5fVar) {
        return m40438A(((r8) scbVar).getSerializedSize(n5fVar));
    }

    /* renamed from: G */
    public static int m40444G(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: H */
    public static int m40445H(int i, xq1 xq1Var) {
        return (m40457T(1) * 2) + m40458U(2, i) + m40468h(3, xq1Var);
    }

    /* renamed from: I */
    public static int m40446I(int i) {
        return m40459V(i);
    }

    /* renamed from: J */
    public static int m40447J(int i, int i2) {
        return m40457T(i) + m40448K(i2);
    }

    /* renamed from: K */
    public static int m40448K(int i) {
        return 4;
    }

    /* renamed from: L */
    public static int m40449L(int i, long j) {
        return m40457T(i) + m40450M(j);
    }

    /* renamed from: M */
    public static int m40450M(long j) {
        return 8;
    }

    /* renamed from: N */
    public static int m40451N(int i, int i2) {
        return m40457T(i) + m40452O(i2);
    }

    /* renamed from: O */
    public static int m40452O(int i) {
        return m40459V(m40462Y(i));
    }

    /* renamed from: P */
    public static int m40453P(int i, long j) {
        return m40457T(i) + m40454Q(j);
    }

    /* renamed from: Q */
    public static int m40454Q(long j) {
        return m40461X(m40463Z(j));
    }

    /* renamed from: R */
    public static int m40455R(int i, String str) {
        return m40457T(i) + m40456S(str);
    }

    /* renamed from: S */
    public static int m40456S(String str) {
        int length;
        try {
            length = jqi.m34293j(str);
        } catch (jqi.C14632d unused) {
            length = str.getBytes(yn8.f55724a).length;
        }
        return m40438A(length);
    }

    /* renamed from: T */
    public static int m40457T(int i) {
        return m40459V(fbj.m26427c(i, 0));
    }

    /* renamed from: U */
    public static int m40458U(int i, int i2) {
        return m40457T(i) + m40459V(i2);
    }

    /* renamed from: V */
    public static int m40459V(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: W */
    public static int m40460W(int i, long j) {
        return m40457T(i) + m40461X(j);
    }

    /* renamed from: X */
    public static int m40461X(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: Y */
    public static int m40462Y(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: Z */
    public static long m40463Z(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static nf3 d0(OutputStream outputStream, int i) {
        return new C15565e(outputStream, i);
    }

    /* renamed from: e */
    public static int m40465e(int i, boolean z) {
        return m40457T(i) + m40466f(z);
    }

    public static nf3 e0(byte[] bArr) {
        return f0(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static int m40466f(boolean z) {
        return 1;
    }

    public static nf3 f0(byte[] bArr, int i, int i2) {
        return new C15563c(bArr, i, i2);
    }

    /* renamed from: g */
    public static int m40467g(byte[] bArr) {
        return m40438A(bArr.length);
    }

    /* renamed from: h */
    public static int m40468h(int i, xq1 xq1Var) {
        return m40457T(i) + m40469i(xq1Var);
    }

    /* renamed from: i */
    public static int m40469i(xq1 xq1Var) {
        return m40438A(xq1Var.size());
    }

    /* renamed from: j */
    public static int m40470j(int i, double d) {
        return m40457T(i) + m40471k(d);
    }

    /* renamed from: k */
    public static int m40471k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m40472l(int i, int i2) {
        return m40457T(i) + m40473m(i2);
    }

    /* renamed from: m */
    public static int m40473m(int i) {
        return m40484x(i);
    }

    /* renamed from: n */
    public static int m40474n(int i, int i2) {
        return m40457T(i) + m40475o(i2);
    }

    /* renamed from: o */
    public static int m40475o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m40476p(int i, long j) {
        return m40457T(i) + m40477q(j);
    }

    /* renamed from: q */
    public static int m40477q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m40478r(int i, float f) {
        return m40457T(i) + m40479s(f);
    }

    /* renamed from: s */
    public static int m40479s(float f) {
        return 4;
    }

    /* renamed from: t */
    public static int m40480t(int i, scb scbVar, n5f n5fVar) {
        return (m40457T(i) * 2) + m40482v(scbVar, n5fVar);
    }

    /* renamed from: u */
    public static int m40481u(scb scbVar) {
        return scbVar.getSerializedSize();
    }

    /* renamed from: v */
    public static int m40482v(scb scbVar, n5f n5fVar) {
        return ((r8) scbVar).getSerializedSize(n5fVar);
    }

    /* renamed from: w */
    public static int m40483w(int i, int i2) {
        return m40457T(i) + m40484x(i2);
    }

    /* renamed from: x */
    public static int m40484x(int i) {
        if (i >= 0) {
            return m40459V(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m40485y(int i, long j) {
        return m40457T(i) + m40486z(j);
    }

    /* renamed from: z */
    public static int m40486z(long j) {
        return m40461X(j);
    }

    public final void A0(scb scbVar) {
        scbVar.writeTo(this);
    }

    public final void B0(scb scbVar, n5f n5fVar) {
        n5fVar.mo40131j(scbVar, this.f36764a);
    }

    public abstract void C0(int i, int i2);

    public abstract void D0(int i);

    public final void E0(int i, long j) {
        Y0(i, j);
    }

    public final void F0(long j) {
        Z0(j);
    }

    public abstract void G0(int i, scb scbVar, n5f n5fVar);

    public abstract void H0(scb scbVar);

    public abstract void I0(int i, scb scbVar);

    public abstract void J0(int i, xq1 xq1Var);

    public final void K0(int i) {
        X0(i);
    }

    public final void L0(int i, int i2) {
        s0(i, i2);
    }

    public final void M0(int i) {
        t0(i);
    }

    public final void N0(int i, long j) {
        u0(i, j);
    }

    public final void O0(long j) {
        v0(j);
    }

    public final void P0(int i, int i2) {
        W0(i, m40462Y(i2));
    }

    public final void Q0(int i) {
        X0(m40462Y(i));
    }

    public final void R0(int i, long j) {
        Y0(i, m40463Z(j));
    }

    public final void S0(long j) {
        Z0(m40463Z(j));
    }

    public abstract void T0(int i, String str);

    public abstract void U0(String str);

    public abstract void V0(int i, int i2);

    public abstract void W0(int i, int i2);

    public abstract void X0(int i);

    public abstract void Y0(int i, long j);

    public abstract void Z0(long j);

    public abstract void a0();

    @Override // p001o.jq1
    /* renamed from: b */
    public abstract void mo34213b(byte[] bArr, int i, int i2);

    public final void b0(String str, jqi.C14632d c14632d) throws C15564d {
        f36762c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c14632d);
        byte[] bytes = str.getBytes(yn8.f55724a);
        try {
            X0(bytes.length);
            mo34213b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C15564d(e);
        } catch (C15564d e2) {
            throw e2;
        }
    }

    public boolean c0() {
        return this.f36765b;
    }

    /* renamed from: d */
    public final void m40487d() {
        if (g0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int g0();

    public abstract void h0(byte b);

    public abstract void i0(int i, boolean z);

    public final void j0(boolean z) {
        h0(z ? (byte) 1 : (byte) 0);
    }

    public final void k0(byte[] bArr) {
        l0(bArr, 0, bArr.length);
    }

    public abstract void l0(byte[] bArr, int i, int i2);

    public abstract void m0(int i, xq1 xq1Var);

    public abstract void n0(xq1 xq1Var);

    public final void o0(int i, double d) {
        u0(i, Double.doubleToRawLongBits(d));
    }

    public final void p0(double d) {
        v0(Double.doubleToRawLongBits(d));
    }

    public final void q0(int i, int i2) {
        C0(i, i2);
    }

    public final void r0(int i) {
        D0(i);
    }

    public abstract void s0(int i, int i2);

    public abstract void t0(int i);

    public abstract void u0(int i, long j);

    public abstract void v0(long j);

    public final void w0(int i, float f) {
        s0(i, Float.floatToRawIntBits(f));
    }

    public final void x0(float f) {
        t0(Float.floatToRawIntBits(f));
    }

    public final void y0(int i, scb scbVar) {
        V0(i, 3);
        A0(scbVar);
        V0(i, 4);
    }

    public final void z0(int i, scb scbVar, n5f n5fVar) {
        V0(i, 3);
        B0(scbVar, n5fVar);
        V0(i, 4);
    }

    public nf3() {
    }
}
