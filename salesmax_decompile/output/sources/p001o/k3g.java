package p001o;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p001o.is7;

/* loaded from: classes5.dex */
public class k3g implements is7 {

    /* renamed from: u */
    public static final String f31423u = "k3g";

    /* renamed from: a */
    public int[] f31424a;

    /* renamed from: b */
    public final int[] f31425b;

    /* renamed from: c */
    public final is7.InterfaceC14363a f31426c;

    /* renamed from: d */
    public ByteBuffer f31427d;

    /* renamed from: e */
    public byte[] f31428e;

    /* renamed from: f */
    public short[] f31429f;

    /* renamed from: g */
    public byte[] f31430g;

    /* renamed from: h */
    public byte[] f31431h;

    /* renamed from: i */
    public byte[] f31432i;

    /* renamed from: j */
    public int[] f31433j;

    /* renamed from: k */
    public int f31434k;

    /* renamed from: l */
    public rs7 f31435l;

    /* renamed from: m */
    public Bitmap f31436m;

    /* renamed from: n */
    public boolean f31437n;

    /* renamed from: o */
    public int f31438o;

    /* renamed from: p */
    public int f31439p;

    /* renamed from: q */
    public int f31440q;

    /* renamed from: r */
    public int f31441r;

    /* renamed from: s */
    public Boolean f31442s;

    /* renamed from: t */
    public Bitmap.Config f31443t;

    public k3g(is7.InterfaceC14363a interfaceC14363a, rs7 rs7Var, ByteBuffer byteBuffer, int i) {
        this(interfaceC14363a);
        m34958q(rs7Var, byteBuffer, i);
    }

    @Override // p001o.is7
    /* renamed from: a */
    public synchronized Bitmap mo32673a() {
        if (this.f31435l.f44013c <= 0 || this.f31434k < 0) {
            if (Log.isLoggable(f31423u, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to decode frame, frameCount=");
                sb.append(this.f31435l.f44013c);
                sb.append(", framePointer=");
                sb.append(this.f31434k);
            }
            this.f31438o = 1;
        }
        int i = this.f31438o;
        if (i != 1 && i != 2) {
            this.f31438o = 0;
            if (this.f31428e == null) {
                this.f31428e = this.f31426c.mo31045b(Constants.MAX_HOST_LENGTH);
            }
            os7 os7Var = (os7) this.f31435l.f44015e.get(this.f31434k);
            int i2 = this.f31434k - 1;
            os7 os7Var2 = i2 >= 0 ? (os7) this.f31435l.f44015e.get(i2) : null;
            int[] iArr = os7Var.f38817k;
            if (iArr == null) {
                iArr = this.f31435l.f44011a;
            }
            this.f31424a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(f31423u, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No valid color table found for frame #");
                    sb2.append(this.f31434k);
                }
                this.f31438o = 1;
                return null;
            }
            if (os7Var.f38812f) {
                System.arraycopy(iArr, 0, this.f31425b, 0, iArr.length);
                int[] iArr2 = this.f31425b;
                this.f31424a = iArr2;
                iArr2[os7Var.f38814h] = 0;
                if (os7Var.f38813g == 2 && this.f31434k == 0) {
                    this.f31442s = Boolean.TRUE;
                }
            }
            return m34959r(os7Var, os7Var2);
        }
        if (Log.isLoggable(f31423u, 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to decode frame, status=");
            sb3.append(this.f31438o);
        }
        return null;
    }

    @Override // p001o.is7
    /* renamed from: b */
    public void mo32674b() {
        this.f31434k = (this.f31434k + 1) % this.f31435l.f44013c;
    }

    @Override // p001o.is7
    /* renamed from: c */
    public int mo32675c() {
        return this.f31435l.f44013c;
    }

    @Override // p001o.is7
    public void clear() {
        this.f31435l = null;
        byte[] bArr = this.f31432i;
        if (bArr != null) {
            this.f31426c.mo31048e(bArr);
        }
        int[] iArr = this.f31433j;
        if (iArr != null) {
            this.f31426c.mo31049f(iArr);
        }
        Bitmap bitmap = this.f31436m;
        if (bitmap != null) {
            this.f31426c.mo31044a(bitmap);
        }
        this.f31436m = null;
        this.f31427d = null;
        this.f31442s = null;
        byte[] bArr2 = this.f31428e;
        if (bArr2 != null) {
            this.f31426c.mo31048e(bArr2);
        }
    }

    @Override // p001o.is7
    /* renamed from: d */
    public void mo32676d(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f31443t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // p001o.is7
    /* renamed from: e */
    public int mo32677e() {
        int i;
        if (this.f31435l.f44013c <= 0 || (i = this.f31434k) < 0) {
            return 0;
        }
        return m34954m(i);
    }

    @Override // p001o.is7
    /* renamed from: f */
    public void mo32678f() {
        this.f31434k = -1;
    }

    @Override // p001o.is7
    /* renamed from: g */
    public int mo32679g() {
        return this.f31434k;
    }

    @Override // p001o.is7
    public ByteBuffer getData() {
        return this.f31427d;
    }

    @Override // p001o.is7
    /* renamed from: h */
    public int mo32680h() {
        return this.f31427d.limit() + this.f31432i.length + (this.f31433j.length * 4);
    }

    /* renamed from: i */
    public final int m34950i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f31439p + i; i9++) {
            byte[] bArr = this.f31432i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f31424a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & Constants.MAX_HOST_LENGTH;
                i5 += (i10 >> 16) & Constants.MAX_HOST_LENGTH;
                i6 += (i10 >> 8) & Constants.MAX_HOST_LENGTH;
                i7 += i10 & Constants.MAX_HOST_LENGTH;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f31439p + i11; i12++) {
            byte[] bArr2 = this.f31432i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f31424a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & Constants.MAX_HOST_LENGTH;
                i5 += (i13 >> 16) & Constants.MAX_HOST_LENGTH;
                i6 += (i13 >> 8) & Constants.MAX_HOST_LENGTH;
                i7 += i13 & Constants.MAX_HOST_LENGTH;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    public final void m34951j(os7 os7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f31433j;
        int i6 = os7Var.f38810d;
        int i7 = this.f31439p;
        int i8 = i6 / i7;
        int i9 = os7Var.f38808b / i7;
        int i10 = os7Var.f38809c / i7;
        int i11 = os7Var.f38807a / i7;
        boolean z = this.f31434k == 0;
        int i12 = this.f31441r;
        int i13 = this.f31440q;
        byte[] bArr = this.f31432i;
        int[] iArr2 = this.f31424a;
        Boolean bool = this.f31442s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (os7Var.f38811e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 == 2) {
                        i15 = 4;
                    } else if (i18 == 3) {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    } else if (i18 == 4) {
                        i17 = i18;
                        i15 = 1;
                        i14 = 2;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * os7Var.f38809c;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 < i22) {
                            int iM34950i = m34950i(i24, i28, os7Var.f38809c);
                            if (iM34950i != 0) {
                                iArr[i29] = iM34950i;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i24 += i7;
                            i29++;
                            i10 = i4;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.f31442s == null) {
            this.f31442s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m34952k(os7 os7Var) {
        os7 os7Var2 = os7Var;
        int[] iArr = this.f31433j;
        int i = os7Var2.f38810d;
        int i2 = os7Var2.f38808b;
        int i3 = os7Var2.f38809c;
        int i4 = os7Var2.f38807a;
        boolean z = this.f31434k == 0;
        int i5 = this.f31441r;
        byte[] bArr = this.f31432i;
        int[] iArr2 = this.f31424a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = os7Var2.f38809c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            os7Var2 = os7Var;
        }
        Boolean bool = this.f31442s;
        this.f31442s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f31442s == null && z && b != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: l */
    public final void m34953l(os7 os7Var) {
        int i;
        int i2;
        short s;
        k3g k3gVar = this;
        if (os7Var != null) {
            k3gVar.f31427d.position(os7Var.f38816j);
        }
        if (os7Var == null) {
            rs7 rs7Var = k3gVar.f31435l;
            i = rs7Var.f44016f;
            i2 = rs7Var.f44017g;
        } else {
            i = os7Var.f38809c;
            i2 = os7Var.f38810d;
        }
        int i3 = i * i2;
        byte[] bArr = k3gVar.f31432i;
        if (bArr == null || bArr.length < i3) {
            k3gVar.f31432i = k3gVar.f31426c.mo31045b(i3);
        }
        byte[] bArr2 = k3gVar.f31432i;
        if (k3gVar.f31429f == null) {
            k3gVar.f31429f = new short[4096];
        }
        short[] sArr = k3gVar.f31429f;
        if (k3gVar.f31430g == null) {
            k3gVar.f31430g = new byte[4096];
        }
        byte[] bArr3 = k3gVar.f31430g;
        if (k3gVar.f31431h == null) {
            k3gVar.f31431h = new byte[4097];
        }
        byte[] bArr4 = k3gVar.f31431h;
        int iM34957p = m34957p();
        int i4 = 1 << iM34957p;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iM34957p + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = k3gVar.f31428e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int iM34956o = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (iM34956o == 0) {
                iM34956o = m34956o();
                if (iM34956o <= 0) {
                    k3gVar.f31438o = 3;
                    break;
                }
                i14 = 0;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iM34956o--;
            int i21 = i15 + 8;
            int i22 = i12;
            int i23 = i20;
            int i24 = i11;
            int i25 = i7;
            int i26 = i19;
            while (true) {
                if (i21 < i24) {
                    i12 = i22;
                    i11 = i24;
                    i15 = i21;
                    i19 = i26;
                    i7 = i25;
                    i20 = i23;
                    break;
                }
                int i27 = i6;
                int i28 = i16 & i13;
                i16 >>= i24;
                i21 -= i24;
                if (i28 == i4) {
                    i13 = i8;
                    i24 = i25;
                    i22 = i27;
                    i6 = i22;
                    i23 = -1;
                } else {
                    if (i28 == i5) {
                        i15 = i21;
                        i19 = i26;
                        i12 = i22;
                        i7 = i25;
                        i6 = i27;
                        i20 = i23;
                        i11 = i24;
                        break;
                    }
                    if (i23 == -1) {
                        bArr2[i17] = bArr3[i28];
                        i17++;
                        i9++;
                        i23 = i28;
                        i26 = i23;
                        i6 = i27;
                        i21 = i21;
                    } else {
                        if (i28 >= i22) {
                            bArr4[i18] = (byte) i26;
                            i18++;
                            s = i23;
                        } else {
                            s = i28;
                        }
                        while (s >= i4) {
                            bArr4[i18] = bArr3[s];
                            i18++;
                            s = sArr[s];
                        }
                        i26 = bArr3[s] & 255;
                        byte b = (byte) i26;
                        bArr2[i17] = b;
                        while (true) {
                            i17++;
                            i9++;
                            if (i18 <= 0) {
                                break;
                            }
                            i18--;
                            bArr2[i17] = bArr4[i18];
                        }
                        byte[] bArr6 = bArr4;
                        if (i22 < 4096) {
                            sArr[i22] = (short) i23;
                            bArr3[i22] = b;
                            i22++;
                            if ((i22 & i13) == 0 && i22 < 4096) {
                                i24++;
                                i13 += i22;
                            }
                        }
                        i23 = i28;
                        i6 = i27;
                        i21 = i21;
                        bArr4 = bArr6;
                    }
                }
            }
            k3gVar = this;
        }
        Arrays.fill(bArr2, i17, i3, (byte) 0);
    }

    /* renamed from: m */
    public int m34954m(int i) {
        if (i >= 0) {
            rs7 rs7Var = this.f31435l;
            if (i < rs7Var.f44013c) {
                return ((os7) rs7Var.f44015e.get(i)).f38815i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m34955n() {
        Boolean bool = this.f31442s;
        Bitmap bitmapMo31046c = this.f31426c.mo31046c(this.f31441r, this.f31440q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f31443t);
        bitmapMo31046c.setHasAlpha(true);
        return bitmapMo31046c;
    }

    /* renamed from: o */
    public final int m34956o() {
        int iM34957p = m34957p();
        if (iM34957p <= 0) {
            return iM34957p;
        }
        ByteBuffer byteBuffer = this.f31427d;
        byteBuffer.get(this.f31428e, 0, Math.min(iM34957p, byteBuffer.remaining()));
        return iM34957p;
    }

    /* renamed from: p */
    public final int m34957p() {
        return this.f31427d.get() & 255;
    }

    /* renamed from: q */
    public synchronized void m34958q(rs7 rs7Var, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        this.f31438o = 0;
        this.f31435l = rs7Var;
        this.f31434k = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f31427d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f31427d.order(ByteOrder.LITTLE_ENDIAN);
        this.f31437n = false;
        Iterator it = rs7Var.f44015e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((os7) it.next()).f38813g == 3) {
                this.f31437n = true;
                break;
            }
        }
        this.f31439p = iHighestOneBit;
        int i2 = rs7Var.f44016f;
        this.f31441r = i2 / iHighestOneBit;
        int i3 = rs7Var.f44017g;
        this.f31440q = i3 / iHighestOneBit;
        this.f31432i = this.f31426c.mo31045b(i2 * i3);
        this.f31433j = this.f31426c.mo31047d(this.f31441r * this.f31440q);
    }

    /* renamed from: r */
    public final Bitmap m34959r(os7 os7Var, os7 os7Var2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f31433j;
        int i3 = 0;
        if (os7Var2 == null) {
            Bitmap bitmap2 = this.f31436m;
            if (bitmap2 != null) {
                this.f31426c.mo31044a(bitmap2);
            }
            this.f31436m = null;
            Arrays.fill(iArr, 0);
        }
        if (os7Var2 != null && os7Var2.f38813g == 3 && this.f31436m == null) {
            Arrays.fill(iArr, 0);
        }
        if (os7Var2 != null && (i2 = os7Var2.f38813g) > 0) {
            if (i2 == 2) {
                if (!os7Var.f38812f) {
                    rs7 rs7Var = this.f31435l;
                    int i4 = rs7Var.f44022l;
                    if (os7Var.f38817k == null || rs7Var.f44020j != os7Var.f38814h) {
                        i3 = i4;
                    }
                }
                int i5 = os7Var2.f38810d;
                int i6 = this.f31439p;
                int i7 = i5 / i6;
                int i8 = os7Var2.f38808b / i6;
                int i9 = os7Var2.f38809c / i6;
                int i10 = os7Var2.f38807a / i6;
                int i11 = this.f31441r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f31441r;
                }
            } else if (i2 == 3 && (bitmap = this.f31436m) != null) {
                int i16 = this.f31441r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f31440q);
            }
        }
        m34953l(os7Var);
        if (os7Var.f38811e || this.f31439p != 1) {
            m34951j(os7Var);
        } else {
            m34952k(os7Var);
        }
        if (this.f31437n && ((i = os7Var.f38813g) == 0 || i == 1)) {
            if (this.f31436m == null) {
                this.f31436m = m34955n();
            }
            Bitmap bitmap3 = this.f31436m;
            int i17 = this.f31441r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f31440q);
        }
        Bitmap bitmapM34955n = m34955n();
        int i18 = this.f31441r;
        bitmapM34955n.setPixels(iArr, 0, i18, 0, 0, i18, this.f31440q);
        return bitmapM34955n;
    }

    public k3g(is7.InterfaceC14363a interfaceC14363a) {
        this.f31425b = new int[256];
        this.f31443t = Bitmap.Config.ARGB_8888;
        this.f31426c = interfaceC14363a;
        this.f31435l = new rs7();
    }
}
