package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.cd4;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class r16 implements qbg {

    /* renamed from: h */
    public static final byte[] f42680h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f42681i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f42682j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f42683a;

    /* renamed from: b */
    public final Paint f42684b;

    /* renamed from: c */
    public final Canvas f42685c;

    /* renamed from: d */
    public final C16499b f42686d;

    /* renamed from: e */
    public final C16498a f42687e;

    /* renamed from: f */
    public final C16505h f42688f;

    /* renamed from: g */
    public Bitmap f42689g;

    /* renamed from: o.r16$a */
    public static final class C16498a {

        /* renamed from: a */
        public final int f42690a;

        /* renamed from: b */
        public final int[] f42691b;

        /* renamed from: c */
        public final int[] f42692c;

        /* renamed from: d */
        public final int[] f42693d;

        public C16498a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f42690a = i;
            this.f42691b = iArr;
            this.f42692c = iArr2;
            this.f42693d = iArr3;
        }
    }

    /* renamed from: o.r16$b */
    public static final class C16499b {

        /* renamed from: a */
        public final int f42694a;

        /* renamed from: b */
        public final int f42695b;

        /* renamed from: c */
        public final int f42696c;

        /* renamed from: d */
        public final int f42697d;

        /* renamed from: e */
        public final int f42698e;

        /* renamed from: f */
        public final int f42699f;

        public C16499b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f42694a = i;
            this.f42695b = i2;
            this.f42696c = i3;
            this.f42697d = i4;
            this.f42698e = i5;
            this.f42699f = i6;
        }
    }

    /* renamed from: o.r16$c */
    public static final class C16500c {

        /* renamed from: a */
        public final int f42700a;

        /* renamed from: b */
        public final boolean f42701b;

        /* renamed from: c */
        public final byte[] f42702c;

        /* renamed from: d */
        public final byte[] f42703d;

        public C16500c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f42700a = i;
            this.f42701b = z;
            this.f42702c = bArr;
            this.f42703d = bArr2;
        }
    }

    /* renamed from: o.r16$d */
    public static final class C16501d {

        /* renamed from: a */
        public final int f42704a;

        /* renamed from: b */
        public final int f42705b;

        /* renamed from: c */
        public final int f42706c;

        /* renamed from: d */
        public final SparseArray f42707d;

        public C16501d(int i, int i2, int i3, SparseArray sparseArray) {
            this.f42704a = i;
            this.f42705b = i2;
            this.f42706c = i3;
            this.f42707d = sparseArray;
        }
    }

    /* renamed from: o.r16$e */
    public static final class C16502e {

        /* renamed from: a */
        public final int f42708a;

        /* renamed from: b */
        public final int f42709b;

        public C16502e(int i, int i2) {
            this.f42708a = i;
            this.f42709b = i2;
        }
    }

    /* renamed from: o.r16$f */
    public static final class C16503f {

        /* renamed from: a */
        public final int f42710a;

        /* renamed from: b */
        public final boolean f42711b;

        /* renamed from: c */
        public final int f42712c;

        /* renamed from: d */
        public final int f42713d;

        /* renamed from: e */
        public final int f42714e;

        /* renamed from: f */
        public final int f42715f;

        /* renamed from: g */
        public final int f42716g;

        /* renamed from: h */
        public final int f42717h;

        /* renamed from: i */
        public final int f42718i;

        /* renamed from: j */
        public final int f42719j;

        /* renamed from: k */
        public final SparseArray f42720k;

        public C16503f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f42710a = i;
            this.f42711b = z;
            this.f42712c = i2;
            this.f42713d = i3;
            this.f42714e = i4;
            this.f42715f = i5;
            this.f42716g = i6;
            this.f42717h = i7;
            this.f42718i = i8;
            this.f42719j = i9;
            this.f42720k = sparseArray;
        }

        /* renamed from: a */
        public void m46043a(C16503f c16503f) {
            SparseArray sparseArray = c16503f.f42720k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f42720k.put(sparseArray.keyAt(i), (C16504g) sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: o.r16$g */
    public static final class C16504g {

        /* renamed from: a */
        public final int f42721a;

        /* renamed from: b */
        public final int f42722b;

        /* renamed from: c */
        public final int f42723c;

        /* renamed from: d */
        public final int f42724d;

        /* renamed from: e */
        public final int f42725e;

        /* renamed from: f */
        public final int f42726f;

        public C16504g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f42721a = i;
            this.f42722b = i2;
            this.f42723c = i3;
            this.f42724d = i4;
            this.f42725e = i5;
            this.f42726f = i6;
        }
    }

    /* renamed from: o.r16$h */
    public static final class C16505h {

        /* renamed from: a */
        public final int f42727a;

        /* renamed from: b */
        public final int f42728b;

        /* renamed from: c */
        public final SparseArray f42729c = new SparseArray();

        /* renamed from: d */
        public final SparseArray f42730d = new SparseArray();

        /* renamed from: e */
        public final SparseArray f42731e = new SparseArray();

        /* renamed from: f */
        public final SparseArray f42732f = new SparseArray();

        /* renamed from: g */
        public final SparseArray f42733g = new SparseArray();

        /* renamed from: h */
        public C16499b f42734h;

        /* renamed from: i */
        public C16501d f42735i;

        public C16505h(int i, int i2) {
            this.f42727a = i;
            this.f42728b = i2;
        }

        /* renamed from: a */
        public void m46044a() {
            this.f42729c.clear();
            this.f42730d.clear();
            this.f42731e.clear();
            this.f42732f.clear();
            this.f42733g.clear();
            this.f42734h = null;
            this.f42735i = null;
        }
    }

    public r16(List list) {
        zwc zwcVar = new zwc((byte[]) list.get(0));
        int iM60010N = zwcVar.m60010N();
        int iM60010N2 = zwcVar.m60010N();
        Paint paint = new Paint();
        this.f42683a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f42684b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f42685c = new Canvas();
        this.f42686d = new C16499b(719, 575, 0, 719, 0, 575);
        this.f42687e = new C16498a(0, m46027e(), m46028f(), m46029g());
        this.f42688f = new C16505h(iM60010N, iM60010N2);
    }

    /* renamed from: d */
    public static byte[] m46026d(int i, int i2, ywc ywcVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ywcVar.m58444h(i2);
        }
        return bArr;
    }

    /* renamed from: e */
    public static int[] m46027e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: f */
    public static int[] m46028f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m46030h(Constants.MAX_HOST_LENGTH, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = Opcodes.LAND;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = m46030h(Constants.MAX_HOST_LENGTH, i4, i5, i3);
            }
        }
        return iArr;
    }

    /* renamed from: g */
    public static int[] m46029g() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = Constants.MAX_HOST_LENGTH;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m46030h(63, i4, i5, i3);
            } else {
                int i6 = i2 & Opcodes.L2I;
                int i7 = Opcodes.TABLESWITCH;
                if (i6 == 0) {
                    int i8 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i9 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m46030h(Constants.MAX_HOST_LENGTH, i8, i9, i + i7);
                } else if (i6 == 8) {
                    int i10 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i11 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m46030h(Opcodes.LAND, i10, i11, i + i7);
                } else if (i6 == 128) {
                    iArr[i2] = m46030h(Constants.MAX_HOST_LENGTH, ((i2 & 1) != 0 ? 43 : 0) + Opcodes.LAND + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + Opcodes.LAND + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + Opcodes.LAND + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = m46030h(Constants.MAX_HOST_LENGTH, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: h */
    public static int m46030h(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: i */
    public static int m46031i(ywc ywcVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int iM58444h;
        int iM58444h2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int iM58444h3 = ywcVar.m58444h(2);
            if (iM58444h3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (ywcVar.m58443g()) {
                    iM58444h = ywcVar.m58444h(3) + 3;
                    iM58444h2 = ywcVar.m58444h(2);
                } else {
                    if (ywcVar.m58443g()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int iM58444h4 = ywcVar.m58444h(2);
                        if (iM58444h4 == 0) {
                            z = true;
                        } else if (iM58444h4 == 1) {
                            z = z2;
                            i3 = 2;
                        } else if (iM58444h4 == 2) {
                            iM58444h = ywcVar.m58444h(4) + 12;
                            iM58444h2 = ywcVar.m58444h(2);
                        } else if (iM58444h4 != 3) {
                            z = z2;
                        } else {
                            iM58444h = ywcVar.m58444h(8) + 29;
                            iM58444h2 = ywcVar.m58444h(2);
                        }
                        iM58444h3 = 0;
                        i3 = 0;
                    }
                    iM58444h3 = 0;
                }
                z = z2;
                i3 = iM58444h;
                iM58444h3 = iM58444h2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM58444h3 = bArr[iM58444h3];
                }
                paint.setColor(iArr[iM58444h3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: j */
    public static int m46032j(ywc ywcVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int iM58444h;
        int iM58444h2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int iM58444h3 = ywcVar.m58444h(4);
            if (iM58444h3 != 0) {
                z = z2;
                i3 = 1;
            } else if (ywcVar.m58443g()) {
                if (ywcVar.m58443g()) {
                    int iM58444h4 = ywcVar.m58444h(2);
                    if (iM58444h4 == 0) {
                        z = z2;
                        i3 = 1;
                    } else if (iM58444h4 == 1) {
                        z = z2;
                        i3 = 2;
                    } else if (iM58444h4 == 2) {
                        iM58444h = ywcVar.m58444h(4) + 9;
                        iM58444h2 = ywcVar.m58444h(4);
                    } else if (iM58444h4 != 3) {
                        z = z2;
                        iM58444h3 = 0;
                        i3 = 0;
                    } else {
                        iM58444h = ywcVar.m58444h(8) + 25;
                        iM58444h2 = ywcVar.m58444h(4);
                    }
                    iM58444h3 = 0;
                } else {
                    iM58444h = ywcVar.m58444h(2) + 4;
                    iM58444h2 = ywcVar.m58444h(4);
                }
                z = z2;
                i3 = iM58444h;
                iM58444h3 = iM58444h2;
            } else {
                int iM58444h5 = ywcVar.m58444h(3);
                if (iM58444h5 != 0) {
                    z = z2;
                    i3 = iM58444h5 + 2;
                    iM58444h3 = 0;
                } else {
                    z = true;
                    iM58444h3 = 0;
                    i3 = 0;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM58444h3 = bArr[iM58444h3];
                }
                paint.setColor(iArr[iM58444h3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: k */
    public static int m46033k(ywc ywcVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int iM58444h;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int iM58444h2 = ywcVar.m58444h(8);
            if (iM58444h2 != 0) {
                z = z2;
                iM58444h = 1;
            } else if (ywcVar.m58443g()) {
                z = z2;
                iM58444h = ywcVar.m58444h(7);
                iM58444h2 = ywcVar.m58444h(8);
            } else {
                int iM58444h3 = ywcVar.m58444h(7);
                if (iM58444h3 != 0) {
                    z = z2;
                    iM58444h = iM58444h3;
                    iM58444h2 = 0;
                } else {
                    z = true;
                    iM58444h2 = 0;
                    iM58444h = 0;
                }
            }
            if (iM58444h != 0 && paint != null) {
                if (bArr != null) {
                    iM58444h2 = bArr[iM58444h2];
                }
                paint.setColor(iArr[iM58444h2]);
                canvas.drawRect(i3, i2, i3 + iM58444h, i2 + 1, paint);
            }
            i3 += iM58444h;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    /* renamed from: l */
    public static void m46034l(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ywc ywcVar = new ywc(bArr);
        int iM46031i = i2;
        int i4 = i3;
        byte[] bArrM46026d = null;
        byte[] bArrM46026d2 = null;
        byte[] bArrM46026d3 = null;
        while (ywcVar.m58438b() != 0) {
            int iM58444h = ywcVar.m58444h(8);
            if (iM58444h != 240) {
                switch (iM58444h) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                                iM46031i = m46031i(ywcVar, iArr, bArr2, iM46031i, i4, paint, canvas);
                                ywcVar.m58439c();
                                break;
                            } else {
                                bArr3 = bArrM46026d3 == null ? f42680h : bArrM46026d3;
                            }
                        } else {
                            bArr3 = bArrM46026d == null ? f42681i : bArrM46026d;
                        }
                        bArr2 = bArr3;
                        iM46031i = m46031i(ywcVar, iArr, bArr2, iM46031i, i4, paint, canvas);
                        ywcVar.m58439c();
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrM46026d2 == null ? f42682j : bArrM46026d2;
                        } else {
                            bArr4 = null;
                        }
                        iM46031i = m46032j(ywcVar, iArr, bArr4, iM46031i, i4, paint, canvas);
                        ywcVar.m58439c();
                        break;
                    case 18:
                        iM46031i = m46033k(ywcVar, iArr, null, iM46031i, i4, paint, canvas);
                        break;
                    default:
                        switch (iM58444h) {
                            case 32:
                                bArrM46026d3 = m46026d(4, 4, ywcVar);
                                break;
                            case 33:
                                bArrM46026d = m46026d(4, 8, ywcVar);
                                break;
                            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                bArrM46026d2 = m46026d(16, 8, ywcVar);
                                break;
                        }
                }
            } else {
                i4 += 2;
                iM46031i = i2;
            }
        }
    }

    /* renamed from: m */
    public static void m46035m(C16500c c16500c, C16498a c16498a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? c16498a.f42693d : i == 2 ? c16498a.f42692c : c16498a.f42691b;
        m46034l(c16500c.f42702c, iArr, i, i2, i3, paint, canvas);
        m46034l(c16500c.f42703d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: o */
    public static C16498a m46036o(ywc ywcVar, int i) {
        int iM58444h;
        int i2;
        int iM58444h2;
        int iM58444h3;
        int iM58444h4;
        int i3 = 8;
        int iM58444h5 = ywcVar.m58444h(8);
        ywcVar.m58454r(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrM46027e = m46027e();
        int[] iArrM46028f = m46028f();
        int[] iArrM46029g = m46029g();
        while (i5 > 0) {
            int iM58444h6 = ywcVar.m58444h(i3);
            int iM58444h7 = ywcVar.m58444h(i3);
            int i6 = i5 - 2;
            int[] iArr = (iM58444h7 & 128) != 0 ? iArrM46027e : (iM58444h7 & 64) != 0 ? iArrM46028f : iArrM46029g;
            if ((iM58444h7 & 1) != 0) {
                iM58444h3 = ywcVar.m58444h(i3);
                iM58444h4 = ywcVar.m58444h(i3);
                iM58444h = ywcVar.m58444h(i3);
                iM58444h2 = ywcVar.m58444h(i3);
                i2 = i6 - 4;
            } else {
                int iM58444h8 = ywcVar.m58444h(6) << i4;
                int iM58444h9 = ywcVar.m58444h(4) << 4;
                iM58444h = ywcVar.m58444h(4) << 4;
                i2 = i6 - 2;
                iM58444h2 = ywcVar.m58444h(i4) << 6;
                iM58444h3 = iM58444h8;
                iM58444h4 = iM58444h9;
            }
            if (iM58444h3 == 0) {
                iM58444h2 = 255;
                iM58444h4 = 0;
                iM58444h = 0;
            }
            double d = iM58444h3;
            double d2 = iM58444h4 - 128;
            double d3 = iM58444h - 128;
            iArr[iM58444h6] = m46030h((byte) (255 - (iM58444h2 & Constants.MAX_HOST_LENGTH)), sqi.m48736o((int) (d + (1.402d * d2)), 0, Constants.MAX_HOST_LENGTH), sqi.m48736o((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, Constants.MAX_HOST_LENGTH), sqi.m48736o((int) (d + (d3 * 1.772d)), 0, Constants.MAX_HOST_LENGTH));
            i5 = i2;
            iM58444h5 = iM58444h5;
            i3 = 8;
            i4 = 2;
        }
        return new C16498a(iM58444h5, iArrM46027e, iArrM46028f, iArrM46029g);
    }

    /* renamed from: p */
    public static C16499b m46037p(ywc ywcVar) {
        int i;
        int i2;
        int i3;
        int iM58444h;
        ywcVar.m58454r(4);
        boolean zM58443g = ywcVar.m58443g();
        ywcVar.m58454r(3);
        int iM58444h2 = ywcVar.m58444h(16);
        int iM58444h3 = ywcVar.m58444h(16);
        if (zM58443g) {
            int iM58444h4 = ywcVar.m58444h(16);
            int iM58444h5 = ywcVar.m58444h(16);
            int iM58444h6 = ywcVar.m58444h(16);
            iM58444h = ywcVar.m58444h(16);
            i3 = iM58444h5;
            i2 = iM58444h6;
            i = iM58444h4;
        } else {
            i = 0;
            i2 = 0;
            i3 = iM58444h2;
            iM58444h = iM58444h3;
        }
        return new C16499b(iM58444h2, iM58444h3, i, i3, i2, iM58444h);
    }

    /* renamed from: q */
    public static C16500c m46038q(ywc ywcVar) {
        byte[] bArr;
        int iM58444h = ywcVar.m58444h(16);
        ywcVar.m58454r(4);
        int iM58444h2 = ywcVar.m58444h(2);
        boolean zM58443g = ywcVar.m58443g();
        ywcVar.m58454r(1);
        byte[] bArr2 = sqi.f45795f;
        if (iM58444h2 != 1) {
            if (iM58444h2 == 0) {
                int iM58444h3 = ywcVar.m58444h(16);
                int iM58444h4 = ywcVar.m58444h(16);
                if (iM58444h3 > 0) {
                    bArr2 = new byte[iM58444h3];
                    ywcVar.m58447k(bArr2, 0, iM58444h3);
                }
                if (iM58444h4 > 0) {
                    bArr = new byte[iM58444h4];
                    ywcVar.m58447k(bArr, 0, iM58444h4);
                }
            }
            return new C16500c(iM58444h, zM58443g, bArr2, bArr);
        }
        ywcVar.m58454r(ywcVar.m58444h(8) * 16);
        bArr = bArr2;
        return new C16500c(iM58444h, zM58443g, bArr2, bArr);
    }

    /* renamed from: r */
    public static C16501d m46039r(ywc ywcVar, int i) {
        int iM58444h = ywcVar.m58444h(8);
        int iM58444h2 = ywcVar.m58444h(4);
        int iM58444h3 = ywcVar.m58444h(2);
        ywcVar.m58454r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iM58444h4 = ywcVar.m58444h(8);
            ywcVar.m58454r(8);
            i2 -= 6;
            sparseArray.put(iM58444h4, new C16502e(ywcVar.m58444h(16), ywcVar.m58444h(16)));
        }
        return new C16501d(iM58444h, iM58444h2, iM58444h3, sparseArray);
    }

    /* renamed from: s */
    public static C16503f m46040s(ywc ywcVar, int i) {
        int iM58444h;
        int iM58444h2;
        int iM58444h3 = ywcVar.m58444h(8);
        ywcVar.m58454r(4);
        boolean zM58443g = ywcVar.m58443g();
        ywcVar.m58454r(3);
        int i2 = 16;
        int iM58444h4 = ywcVar.m58444h(16);
        int iM58444h5 = ywcVar.m58444h(16);
        int iM58444h6 = ywcVar.m58444h(3);
        int iM58444h7 = ywcVar.m58444h(3);
        int i3 = 2;
        ywcVar.m58454r(2);
        int iM58444h8 = ywcVar.m58444h(8);
        int iM58444h9 = ywcVar.m58444h(8);
        int iM58444h10 = ywcVar.m58444h(4);
        int iM58444h11 = ywcVar.m58444h(2);
        ywcVar.m58454r(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int iM58444h12 = ywcVar.m58444h(i2);
            int iM58444h13 = ywcVar.m58444h(i3);
            int iM58444h14 = ywcVar.m58444h(i3);
            int iM58444h15 = ywcVar.m58444h(12);
            int i5 = iM58444h11;
            ywcVar.m58454r(4);
            int iM58444h16 = ywcVar.m58444h(12);
            i4 -= 6;
            if (iM58444h13 == 1 || iM58444h13 == 2) {
                i4 -= 2;
                iM58444h = ywcVar.m58444h(8);
                iM58444h2 = ywcVar.m58444h(8);
            } else {
                iM58444h = 0;
                iM58444h2 = 0;
            }
            sparseArray.put(iM58444h12, new C16504g(iM58444h13, iM58444h14, iM58444h15, iM58444h16, iM58444h, iM58444h2));
            iM58444h11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new C16503f(iM58444h3, zM58443g, iM58444h4, iM58444h5, iM58444h6, iM58444h7, iM58444h8, iM58444h9, iM58444h10, iM58444h11, sparseArray);
    }

    /* renamed from: t */
    public static void m46041t(ywc ywcVar, C16505h c16505h) {
        C16503f c16503f;
        int iM58444h = ywcVar.m58444h(8);
        int iM58444h2 = ywcVar.m58444h(16);
        int iM58444h3 = ywcVar.m58444h(16);
        int iM58440d = ywcVar.m58440d() + iM58444h3;
        if (iM58444h3 * 8 > ywcVar.m58438b()) {
            ria.m46824h("DvbParser", "Data field length exceeds limit");
            ywcVar.m58454r(ywcVar.m58438b());
            return;
        }
        switch (iM58444h) {
            case 16:
                if (iM58444h2 == c16505h.f42727a) {
                    C16501d c16501d = c16505h.f42735i;
                    C16501d c16501dM46039r = m46039r(ywcVar, iM58444h3);
                    if (c16501dM46039r.f42706c == 0) {
                        if (c16501d != null && c16501d.f42705b != c16501dM46039r.f42705b) {
                            c16505h.f42735i = c16501dM46039r;
                            break;
                        }
                    } else {
                        c16505h.f42735i = c16501dM46039r;
                        c16505h.f42729c.clear();
                        c16505h.f42730d.clear();
                        c16505h.f42731e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C16501d c16501d2 = c16505h.f42735i;
                if (iM58444h2 == c16505h.f42727a && c16501d2 != null) {
                    C16503f c16503fM46040s = m46040s(ywcVar, iM58444h3);
                    if (c16501d2.f42706c == 0 && (c16503f = (C16503f) c16505h.f42729c.get(c16503fM46040s.f42710a)) != null) {
                        c16503fM46040s.m46043a(c16503f);
                    }
                    c16505h.f42729c.put(c16503fM46040s.f42710a, c16503fM46040s);
                    break;
                }
                break;
            case 18:
                if (iM58444h2 != c16505h.f42727a) {
                    if (iM58444h2 == c16505h.f42728b) {
                        C16498a c16498aM46036o = m46036o(ywcVar, iM58444h3);
                        c16505h.f42732f.put(c16498aM46036o.f42690a, c16498aM46036o);
                        break;
                    }
                } else {
                    C16498a c16498aM46036o2 = m46036o(ywcVar, iM58444h3);
                    c16505h.f42730d.put(c16498aM46036o2.f42690a, c16498aM46036o2);
                    break;
                }
                break;
            case 19:
                if (iM58444h2 != c16505h.f42727a) {
                    if (iM58444h2 == c16505h.f42728b) {
                        C16500c c16500cM46038q = m46038q(ywcVar);
                        c16505h.f42733g.put(c16500cM46038q.f42700a, c16500cM46038q);
                        break;
                    }
                } else {
                    C16500c c16500cM46038q2 = m46038q(ywcVar);
                    c16505h.f42731e.put(c16500cM46038q2.f42700a, c16500cM46038q2);
                    break;
                }
                break;
            case 20:
                if (iM58444h2 == c16505h.f42727a) {
                    c16505h.f42734h = m46037p(ywcVar);
                    break;
                }
                break;
        }
        ywcVar.m58455s(iM58440d - ywcVar.m58440d());
    }

    @Override // p001o.qbg
    /* renamed from: a */
    public void mo29158a(byte[] bArr, int i, int i2, qbg.C16330b c16330b, fu3 fu3Var) {
        ywc ywcVar = new ywc(bArr, i2 + i);
        ywcVar.m58452p(i);
        fu3Var.accept(m46042n(ywcVar));
    }

    @Override // p001o.qbg
    /* renamed from: c */
    public int mo29159c() {
        return 2;
    }

    /* renamed from: n */
    public final jd4 m46042n(ywc ywcVar) {
        int i;
        SparseArray sparseArray;
        while (ywcVar.m58438b() >= 48 && ywcVar.m58444h(8) == 15) {
            m46041t(ywcVar, this.f42688f);
        }
        C16505h c16505h = this.f42688f;
        C16501d c16501d = c16505h.f42735i;
        if (c16501d == null) {
            return new jd4(nf8.m40499E(), -9223372036854775807L, -9223372036854775807L);
        }
        C16499b c16499b = c16505h.f42734h;
        if (c16499b == null) {
            c16499b = this.f42686d;
        }
        Bitmap bitmap = this.f42689g;
        if (bitmap == null || c16499b.f42694a + 1 != bitmap.getWidth() || c16499b.f42695b + 1 != this.f42689g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c16499b.f42694a + 1, c16499b.f42695b + 1, Bitmap.Config.ARGB_8888);
            this.f42689g = bitmapCreateBitmap;
            this.f42685c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = c16501d.f42707d;
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            this.f42685c.save();
            C16502e c16502e = (C16502e) sparseArray2.valueAt(i2);
            C16503f c16503f = (C16503f) this.f42688f.f42729c.get(sparseArray2.keyAt(i2));
            int i3 = c16502e.f42708a + c16499b.f42696c;
            int i4 = c16502e.f42709b + c16499b.f42698e;
            this.f42685c.clipRect(i3, i4, Math.min(c16503f.f42712c + i3, c16499b.f42697d), Math.min(c16503f.f42713d + i4, c16499b.f42699f));
            C16498a c16498a = (C16498a) this.f42688f.f42730d.get(c16503f.f42716g);
            if (c16498a == null && (c16498a = (C16498a) this.f42688f.f42732f.get(c16503f.f42716g)) == null) {
                c16498a = this.f42687e;
            }
            SparseArray sparseArray3 = c16503f.f42720k;
            int i5 = 0;
            while (i5 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i5);
                C16504g c16504g = (C16504g) sparseArray3.valueAt(i5);
                C16500c c16500c = (C16500c) this.f42688f.f42731e.get(iKeyAt);
                C16500c c16500c2 = c16500c == null ? (C16500c) this.f42688f.f42733g.get(iKeyAt) : c16500c;
                if (c16500c2 != null) {
                    i = i5;
                    sparseArray = sparseArray3;
                    m46035m(c16500c2, c16498a, c16503f.f42715f, c16504g.f42723c + i3, i4 + c16504g.f42724d, c16500c2.f42701b ? null : this.f42683a, this.f42685c);
                } else {
                    i = i5;
                    sparseArray = sparseArray3;
                }
                i5 = i + 1;
                sparseArray3 = sparseArray;
            }
            if (c16503f.f42711b) {
                int i6 = c16503f.f42715f;
                this.f42684b.setColor(i6 == 3 ? c16498a.f42693d[c16503f.f42717h] : i6 == 2 ? c16498a.f42692c[c16503f.f42718i] : c16498a.f42691b[c16503f.f42719j]);
                this.f42685c.drawRect(i3, i4, c16503f.f42712c + i3, c16503f.f42713d + i4, this.f42684b);
            }
            arrayList.add(new cd4.C12641b().m20924f(Bitmap.createBitmap(this.f42689g, i3, i4, c16503f.f42712c, c16503f.f42713d)).m20929k(i3 / c16499b.f42694a).m20930l(0).m20926h(i4 / c16499b.f42695b, 0).m20927i(0).m20932n(c16503f.f42712c / c16499b.f42694a).m20925g(c16503f.f42713d / c16499b.f42695b).m20919a());
            this.f42685c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f42685c.restore();
        }
        return new jd4(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p001o.qbg
    public void reset() {
        this.f42688f.m46044a();
    }
}
