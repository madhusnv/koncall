package p001o;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import com.google.api.Service;
import com.google.firebase.FirebaseError;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.ph3;
import p001o.qbg;
import p001o.uth;
import p001o.w5;
import p001o.zaf;

/* loaded from: classes2.dex */
public class xza implements tq6 {
    public static final yq6 e0 = new yq6() { // from class: o.wza
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return xza.m56987C();
        }
    };
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0 = sqi.t0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID j0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map k0;

    /* renamed from: A */
    public boolean f54498A;

    /* renamed from: B */
    public long f54499B;

    /* renamed from: C */
    public long f54500C;

    /* renamed from: D */
    public long f54501D;

    /* renamed from: E */
    public bla f54502E;

    /* renamed from: F */
    public bla f54503F;

    /* renamed from: G */
    public boolean f54504G;

    /* renamed from: H */
    public boolean f54505H;

    /* renamed from: I */
    public int f54506I;

    /* renamed from: J */
    public long f54507J;

    /* renamed from: K */
    public long f54508K;

    /* renamed from: L */
    public int f54509L;

    /* renamed from: M */
    public int f54510M;

    /* renamed from: N */
    public int[] f54511N;

    /* renamed from: O */
    public int f54512O;

    /* renamed from: P */
    public int f54513P;

    /* renamed from: Q */
    public int f54514Q;

    /* renamed from: R */
    public int f54515R;

    /* renamed from: S */
    public boolean f54516S;

    /* renamed from: T */
    public long f54517T;

    /* renamed from: U */
    public int f54518U;

    /* renamed from: V */
    public int f54519V;

    /* renamed from: W */
    public int f54520W;

    /* renamed from: X */
    public boolean f54521X;

    /* renamed from: Y */
    public boolean f54522Y;

    /* renamed from: Z */
    public boolean f54523Z;

    /* renamed from: a */
    public final s26 f54524a;
    public int a0;

    /* renamed from: b */
    public final dsi f54525b;
    public byte b0;

    /* renamed from: c */
    public final SparseArray f54526c;
    public boolean c0;

    /* renamed from: d */
    public final boolean f54527d;
    public vq6 d0;

    /* renamed from: e */
    public final boolean f54528e;

    /* renamed from: f */
    public final qbg.InterfaceC16329a f54529f;

    /* renamed from: g */
    public final zwc f54530g;

    /* renamed from: h */
    public final zwc f54531h;

    /* renamed from: i */
    public final zwc f54532i;

    /* renamed from: j */
    public final zwc f54533j;

    /* renamed from: k */
    public final zwc f54534k;

    /* renamed from: l */
    public final zwc f54535l;

    /* renamed from: m */
    public final zwc f54536m;

    /* renamed from: n */
    public final zwc f54537n;

    /* renamed from: o */
    public final zwc f54538o;

    /* renamed from: p */
    public final zwc f54539p;

    /* renamed from: q */
    public ByteBuffer f54540q;

    /* renamed from: r */
    public long f54541r;

    /* renamed from: s */
    public long f54542s;

    /* renamed from: t */
    public long f54543t;

    /* renamed from: u */
    public long f54544u;

    /* renamed from: v */
    public long f54545v;

    /* renamed from: w */
    public C18269c f54546w;

    /* renamed from: x */
    public boolean f54547x;

    /* renamed from: y */
    public int f54548y;

    /* renamed from: z */
    public long f54549z;

    /* renamed from: o.xza$b */
    public final class C18268b implements r26 {
        public C18268b() {
        }

        @Override // p001o.r26
        /* renamed from: a */
        public void mo46059a(int i) throws byc {
            xza.this.m57012q(i);
        }

        @Override // p001o.r26
        /* renamed from: b */
        public void mo46060b(int i, double d) {
            xza.this.m57014t(i, d);
        }

        @Override // p001o.r26
        /* renamed from: c */
        public void mo46061c(int i, long j) throws byc {
            xza.this.m57019z(i, j);
        }

        @Override // p001o.r26
        /* renamed from: d */
        public int mo46062d(int i) {
            return xza.this.m57016w(i);
        }

        @Override // p001o.r26
        /* renamed from: e */
        public boolean mo46063e(int i) {
            return xza.this.m56995B(i);
        }

        @Override // p001o.r26
        /* renamed from: f */
        public void mo46064f(int i, String str) throws byc {
            xza.this.m57001J(i, str);
        }

        @Override // p001o.r26
        /* renamed from: g */
        public void mo46065g(int i, int i2, uq6 uq6Var) throws byc {
            xza.this.m57009n(i, i2, uq6Var);
        }

        @Override // p001o.r26
        /* renamed from: h */
        public void mo46066h(int i, long j, long j2) throws byc {
            xza.this.m57000I(i, j, j2);
        }
    }

    /* renamed from: o.xza$c */
    public static final class C18269c {

        /* renamed from: O */
        public byte[] f54565O;

        /* renamed from: U */
        public wxh f54571U;

        /* renamed from: V */
        public boolean f54572V;

        /* renamed from: Y */
        public uth f54575Y;

        /* renamed from: Z */
        public int f54576Z;

        /* renamed from: a */
        public String f54577a;

        /* renamed from: b */
        public String f54578b;

        /* renamed from: c */
        public int f54579c;

        /* renamed from: d */
        public int f54580d;

        /* renamed from: e */
        public int f54581e;

        /* renamed from: f */
        public int f54582f;

        /* renamed from: g */
        public int f54583g;

        /* renamed from: h */
        public boolean f54584h;

        /* renamed from: i */
        public byte[] f54585i;

        /* renamed from: j */
        public uth.C17452a f54586j;

        /* renamed from: k */
        public byte[] f54587k;

        /* renamed from: l */
        public DrmInitData f54588l;

        /* renamed from: m */
        public int f54589m = -1;

        /* renamed from: n */
        public int f54590n = -1;

        /* renamed from: o */
        public int f54591o = -1;

        /* renamed from: p */
        public int f54592p = -1;

        /* renamed from: q */
        public int f54593q = -1;

        /* renamed from: r */
        public int f54594r = 0;

        /* renamed from: s */
        public int f54595s = -1;

        /* renamed from: t */
        public float f54596t = 0.0f;

        /* renamed from: u */
        public float f54597u = 0.0f;

        /* renamed from: v */
        public float f54598v = 0.0f;

        /* renamed from: w */
        public byte[] f54599w = null;

        /* renamed from: x */
        public int f54600x = -1;

        /* renamed from: y */
        public boolean f54601y = false;

        /* renamed from: z */
        public int f54602z = -1;

        /* renamed from: A */
        public int f54551A = -1;

        /* renamed from: B */
        public int f54552B = -1;

        /* renamed from: C */
        public int f54553C = 1000;

        /* renamed from: D */
        public int f54554D = 200;

        /* renamed from: E */
        public float f54555E = -1.0f;

        /* renamed from: F */
        public float f54556F = -1.0f;

        /* renamed from: G */
        public float f54557G = -1.0f;

        /* renamed from: H */
        public float f54558H = -1.0f;

        /* renamed from: I */
        public float f54559I = -1.0f;

        /* renamed from: J */
        public float f54560J = -1.0f;

        /* renamed from: K */
        public float f54561K = -1.0f;

        /* renamed from: L */
        public float f54562L = -1.0f;

        /* renamed from: M */
        public float f54563M = -1.0f;

        /* renamed from: N */
        public float f54564N = -1.0f;

        /* renamed from: P */
        public int f54566P = 1;

        /* renamed from: Q */
        public int f54567Q = -1;

        /* renamed from: R */
        public int f54568R = 8000;

        /* renamed from: S */
        public long f54569S = 0;

        /* renamed from: T */
        public long f54570T = 0;

        /* renamed from: W */
        public boolean f54573W = true;

        /* renamed from: X */
        public String f54574X = "eng";

        /* renamed from: k */
        public static Pair m57025k(zwc zwcVar) throws byc {
            try {
                zwcVar.m60018V(16);
                long jM60043x = zwcVar.m60043x();
                if (jM60043x == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jM60043x == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jM60043x != 826496599) {
                    ria.m46824h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrM60024e = zwcVar.m60024e();
                for (int iM60025f = zwcVar.m60025f() + 20; iM60025f < bArrM60024e.length - 4; iM60025f++) {
                    if (bArrM60024e[iM60025f] == 0 && bArrM60024e[iM60025f + 1] == 0 && bArrM60024e[iM60025f + 2] == 1 && bArrM60024e[iM60025f + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM60024e, iM60025f, bArrM60024e.length)));
                    }
                }
                throw byc.m19921a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw byc.m19921a("Error parsing FourCC private data", null);
            }
        }

        /* renamed from: l */
        public static boolean m57026l(zwc zwcVar) throws byc {
            try {
                int iM60045z = zwcVar.m60045z();
                if (iM60045z == 1) {
                    return true;
                }
                if (iM60045z != 65534) {
                    return false;
                }
                zwcVar.m60017U(24);
                if (zwcVar.m59997A() == xza.j0.getMostSignificantBits()) {
                    if (zwcVar.m59997A() == xza.j0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw byc.m19921a("Error parsing MS/ACM codec private", null);
            }
        }

        /* renamed from: m */
        public static List m57027m(byte[] bArr) throws byc {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw byc.m19921a("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & Constants.MAX_HOST_LENGTH) != 255) {
                        break;
                    }
                    i3 += Constants.MAX_HOST_LENGTH;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & Constants.MAX_HOST_LENGTH);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & Constants.MAX_HOST_LENGTH) != 255) {
                        break;
                    }
                    i7 += Constants.MAX_HOST_LENGTH;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & Constants.MAX_HOST_LENGTH);
                if (bArr[i8] != 1) {
                    throw byc.m19921a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw byc.m19921a("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw byc.m19921a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw byc.m19921a("Error parsing vorbis codec private", null);
            }
        }

        /* renamed from: f */
        public final void m57028f() {
            op0.m42515e(this.f54575Y);
        }

        /* renamed from: g */
        public final byte[] m57029g(String str) throws byc {
            byte[] bArr = this.f54587k;
            if (bArr != null) {
                return bArr;
            }
            throw byc.m19921a("Missing CodecPrivate for codec " + str, null);
        }

        /* renamed from: h */
        public final byte[] m57030h() {
            if (this.f54555E == -1.0f || this.f54556F == -1.0f || this.f54557G == -1.0f || this.f54558H == -1.0f || this.f54559I == -1.0f || this.f54560J == -1.0f || this.f54561K == -1.0f || this.f54562L == -1.0f || this.f54563M == -1.0f || this.f54564N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f54555E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54556F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54557G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54558H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54559I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54560J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54561K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f54562L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f54563M + 0.5f));
            byteBufferOrder.putShort((short) (this.f54564N + 0.5f));
            byteBufferOrder.putShort((short) this.f54553C);
            byteBufferOrder.putShort((short) this.f54554D);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:206:0x041f  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x043c  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x045b  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x0588  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m57031i(vq6 vq6Var, int i) throws byc {
            char c;
            List listSingletonList;
            int iG0;
            String str;
            List list;
            String str2;
            int i2;
            int i3;
            String str3;
            C2181a.b bVar;
            int i4;
            int iIntValue;
            int i5;
            sw5 sw5VarM48957a;
            String str4 = this.f54578b;
            str4.hashCode();
            switch (str4.hashCode()) {
                case -2095576542:
                    if (!str4.equals("V_MPEG4/ISO/AP")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -2095575984:
                    if (str4.equals("V_MPEG4/ISO/SP")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1985379776:
                    if (str4.equals("A_MS/ACM")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1784763192:
                    if (str4.equals("A_TRUEHD")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1730367663:
                    if (str4.equals("A_VORBIS")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1482641358:
                    if (str4.equals("A_MPEG/L2")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1482641357:
                    if (str4.equals("A_MPEG/L3")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1373388978:
                    if (str4.equals("V_MS/VFW/FOURCC")) {
                        c = 7;
                        break;
                    }
                    break;
                case -933872740:
                    if (str4.equals("S_DVBSUB")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -538363189:
                    if (str4.equals("V_MPEG4/ISO/ASP")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -538363109:
                    if (str4.equals("V_MPEG4/ISO/AVC")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -425012669:
                    if (str4.equals("S_VOBSUB")) {
                        c = 11;
                        break;
                    }
                    break;
                case -356037306:
                    if (str4.equals("A_DTS/LOSSLESS")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 62923557:
                    if (str4.equals("A_AAC")) {
                        c = TokenParser.CR;
                        break;
                    }
                    break;
                case 62923603:
                    if (str4.equals("A_AC3")) {
                        c = 14;
                        break;
                    }
                    break;
                case 62927045:
                    if (str4.equals("A_DTS")) {
                        c = 15;
                        break;
                    }
                    break;
                case 82318131:
                    if (str4.equals("V_AV1")) {
                        c = 16;
                        break;
                    }
                    break;
                case 82338133:
                    if (str4.equals("V_VP8")) {
                        c = 17;
                        break;
                    }
                    break;
                case 82338134:
                    if (str4.equals("V_VP9")) {
                        c = 18;
                        break;
                    }
                    break;
                case 99146302:
                    if (str4.equals("S_HDMV/PGS")) {
                        c = 19;
                        break;
                    }
                    break;
                case 444813526:
                    if (str4.equals("V_THEORA")) {
                        c = 20;
                        break;
                    }
                    break;
                case 542569478:
                    if (str4.equals("A_DTS/EXPRESS")) {
                        c = 21;
                        break;
                    }
                    break;
                case 635596514:
                    if (str4.equals("A_PCM/FLOAT/IEEE")) {
                        c = 22;
                        break;
                    }
                    break;
                case 725948237:
                    if (str4.equals("A_PCM/INT/BIG")) {
                        c = 23;
                        break;
                    }
                    break;
                case 725957860:
                    if (str4.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    break;
                case 738597099:
                    if (str4.equals("S_TEXT/ASS")) {
                        c = 25;
                        break;
                    }
                    break;
                case 855502857:
                    if (str4.equals("V_MPEGH/ISO/HEVC")) {
                        c = 26;
                        break;
                    }
                    break;
                case 1045209816:
                    if (str4.equals("S_TEXT/WEBVTT")) {
                        c = 27;
                        break;
                    }
                    break;
                case 1422270023:
                    if (str4.equals("S_TEXT/UTF8")) {
                        c = 28;
                        break;
                    }
                    break;
                case 1809237540:
                    if (str4.equals("V_MPEG2")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1950749482:
                    if (str4.equals("A_EAC3")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1950789798:
                    if (str4.equals("A_FLAC")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1951062397:
                    if (str4.equals("A_OPUS")) {
                        c = ' ';
                        break;
                    }
                    break;
            }
            int i6 = 4096;
            String str5 = "audio/raw";
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.f54587k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null && (sw5VarM48957a = sw5.m48957a(new zwc(this.f54565O))) != null) {
                        str = sw5VarM48957a.f46019c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    int i7 = 0;
                    int i8 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                        bVar.m6751N(this.f54566P).p0(this.f54568R).i0(i2);
                        i4 = 1;
                    } else if (xeb.m56189q(str3)) {
                        if (this.f54594r == 0) {
                            int i9 = this.f54592p;
                            iIntValue = -1;
                            if (i9 == -1) {
                                i9 = this.f54589m;
                            }
                            this.f54592p = i9;
                            int i10 = this.f54593q;
                            if (i10 == -1) {
                                i10 = this.f54590n;
                            }
                            this.f54593q = i10;
                        } else {
                            iIntValue = -1;
                        }
                        float f = (this.f54592p == iIntValue || (i5 = this.f54593q) == iIntValue) ? -1.0f : (this.f54590n * r2) / (this.f54589m * i5);
                        ph3 ph3VarM43669a = this.f54601y ? new ph3.C16113b().m43672d(this.f54602z).m43671c(this.f54552B).m43673e(this.f54551A).m43674f(m57030h()).m43675g(this.f54591o).m43670b(this.f54591o).m43669a() : null;
                        if (this.f54577a != null && xza.k0.containsKey(this.f54577a)) {
                            iIntValue = ((Integer) xza.k0.get(this.f54577a)).intValue();
                        }
                        if (this.f54595s == 0 && Float.compare(this.f54596t, 0.0f) == 0 && Float.compare(this.f54597u, 0.0f) == 0) {
                            if (Float.compare(this.f54598v, 0.0f) != 0) {
                                if (Float.compare(this.f54598v, 90.0f) == 0) {
                                    i7 = 90;
                                } else if (Float.compare(this.f54598v, -180.0f) == 0 || Float.compare(this.f54598v, 180.0f) == 0) {
                                    i7 = Opcodes.GETFIELD;
                                } else if (Float.compare(this.f54598v, -90.0f) == 0) {
                                    i7 = 270;
                                }
                            }
                            bVar.v0(this.f54589m).m6762Y(this.f54590n).k0(f).n0(i7).l0(this.f54599w).r0(this.f54600x).m6753P(ph3VarM43669a);
                            i4 = 2;
                        } else {
                            i7 = iIntValue;
                            bVar.v0(this.f54589m).m6762Y(this.f54590n).k0(f).n0(i7).l0(this.f54599w).r0(this.f54600x).m6753P(ph3VarM43669a);
                            i4 = 2;
                        }
                    } else {
                        if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw byc.m19921a("Unexpected MIME type.", null);
                        }
                        i4 = 3;
                    }
                    if (this.f54577a != null && !xza.k0.containsKey(this.f54577a)) {
                        bVar.c0(this.f54577a);
                    }
                    C2181a c2181aM6748K = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f;
                    uthVarMo32487f.mo7072b(c2181aM6748K);
                    return;
                case 2:
                    if (m57026l(new zwc(m57029g(this.f54578b)))) {
                        iG0 = sqi.g0(this.f54567Q);
                        if (iG0 == 0) {
                            ria.m46824h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f54567Q + ". Setting mimeType to audio/x-unknown");
                        }
                        i2 = iG0;
                        listSingletonList = null;
                        str = null;
                        i3 = -1;
                        if (this.f54565O != null) {
                            str = sw5VarM48957a.f46019c;
                            str5 = "video/dolby-vision";
                            break;
                        }
                        str3 = str5;
                        int i72 = 0;
                        int i82 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                        bVar = new C2181a.b();
                        if (xeb.m56185m(str3)) {
                        }
                        if (this.f54577a != null) {
                            bVar.c0(this.f54577a);
                            break;
                        }
                        C2181a c2181aM6748K2 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                        uth uthVarMo32487f2 = vq6Var.mo32487f(this.f54579c, i4);
                        this.f54575Y = uthVarMo32487f2;
                        uthVarMo32487f2.mo7072b(c2181aM6748K2);
                        return;
                    }
                    ria.m46824h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722 = 0;
                    int i822 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22;
                    uthVarMo32487f22.mo7072b(c2181aM6748K22);
                    return;
                case 3:
                    this.f54571U = new wxh();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222 = 0;
                    int i8222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222;
                    uthVarMo32487f222.mo7072b(c2181aM6748K222);
                    return;
                case 4:
                    listSingletonList = m57027m(m57029g(this.f54578b));
                    str5 = "audio/vorbis";
                    i6 = 8192;
                    str = null;
                    i3 = i6;
                    i2 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222 = 0;
                    int i82222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222;
                    uthVarMo32487f2222.mo7072b(c2181aM6748K2222);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i3 = i6;
                    i2 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222 = 0;
                    int i822222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222;
                    uthVarMo32487f22222.mo7072b(c2181aM6748K22222);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i3 = i6;
                    i2 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222 = 0;
                    int i8222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222;
                    uthVarMo32487f222222.mo7072b(c2181aM6748K222222);
                    return;
                case 7:
                    Pair pairM57025k = m57025k(new zwc(m57029g(this.f54578b)));
                    str5 = (String) pairM57025k.first;
                    listSingletonList = (List) pairM57025k.second;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222 = 0;
                    int i82222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222;
                    uthVarMo32487f2222222.mo7072b(c2181aM6748K2222222);
                    return;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(m57029g(this.f54578b), 0, bArr2, 0, 4);
                    listSingletonList = nf8.m40500F(bArr2);
                    str5 = "application/dvbsubs";
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222 = 0;
                    int i822222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222;
                    uthVarMo32487f22222222.mo7072b(c2181aM6748K22222222);
                    return;
                case '\n':
                    w61 w61VarM54001b = w61.m54001b(new zwc(m57029g(this.f54578b)));
                    list = w61VarM54001b.f51523a;
                    this.f54576Z = w61VarM54001b.f51524b;
                    str2 = w61VarM54001b.f51534l;
                    str5 = "video/avc";
                    i2 = -1;
                    i3 = -1;
                    List list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222 = 0;
                    int i8222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222;
                    uthVarMo32487f222222222.mo7072b(c2181aM6748K222222222);
                    return;
                case 11:
                    listSingletonList = nf8.m40500F(m57029g(this.f54578b));
                    str = null;
                    str5 = "application/vobsub";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222 = 0;
                    int i82222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222;
                    uthVarMo32487f2222222222.mo7072b(c2181aM6748K2222222222);
                    return;
                case '\f':
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222 = 0;
                    int i822222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222;
                    uthVarMo32487f22222222222.mo7072b(c2181aM6748K22222222222);
                    return;
                case '\r':
                    listSingletonList = Collections.singletonList(m57029g(this.f54578b));
                    w5.C17781b c17781bM53967f = w5.m53967f(this.f54587k);
                    this.f54568R = c17781bM53967f.f51494a;
                    this.f54566P = c17781bM53967f.f51495b;
                    str = c17781bM53967f.f51496c;
                    str5 = "audio/mp4a-latm";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222 = 0;
                    int i8222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222;
                    uthVarMo32487f222222222222.mo7072b(c2181aM6748K222222222222);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222 = 0;
                    int i82222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222;
                    uthVarMo32487f2222222222222.mo7072b(c2181aM6748K2222222222222);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222222 = 0;
                    int i822222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222222;
                    uthVarMo32487f22222222222222.mo7072b(c2181aM6748K22222222222222);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222 = 0;
                    int i8222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222;
                    uthVarMo32487f222222222222222.mo7072b(c2181aM6748K222222222222222);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222222 = 0;
                    int i82222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222222;
                    uthVarMo32487f2222222222222222.mo7072b(c2181aM6748K2222222222222222);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222222222 = 0;
                    int i822222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222222222;
                    uthVarMo32487f22222222222222222.mo7072b(c2181aM6748K22222222222222222);
                    return;
                case 19:
                    str5 = "application/pgs";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222 = 0;
                    int i8222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222;
                    uthVarMo32487f222222222222222222.mo7072b(c2181aM6748K222222222222222222);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222 = 0;
                    int i82222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222222222;
                    uthVarMo32487f2222222222222222222.mo7072b(c2181aM6748K2222222222222222222);
                    return;
                case 22:
                    if (this.f54567Q == 32) {
                        listSingletonList = null;
                        str = null;
                        i2 = 4;
                        i3 = -1;
                        if (this.f54565O != null) {
                        }
                        str3 = str5;
                        int i722222222222222222222 = 0;
                        int i822222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                        bVar = new C2181a.b();
                        if (xeb.m56185m(str3)) {
                        }
                        if (this.f54577a != null) {
                        }
                        C2181a c2181aM6748K22222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                        uth uthVarMo32487f22222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                        this.f54575Y = uthVarMo32487f22222222222222222222;
                        uthVarMo32487f22222222222222222222.mo7072b(c2181aM6748K22222222222222222222);
                        return;
                    }
                    ria.m46824h("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f54567Q + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222 = 0;
                    int i8222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222222;
                    uthVarMo32487f222222222222222222222.mo7072b(c2181aM6748K222222222222222222222);
                    return;
                case 23:
                    int i11 = this.f54567Q;
                    if (i11 == 8) {
                        listSingletonList = null;
                        str = null;
                        i2 = 3;
                        i3 = -1;
                        if (this.f54565O != null) {
                        }
                        str3 = str5;
                        int i72222222222222222222222 = 0;
                        int i82222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                        bVar = new C2181a.b();
                        if (xeb.m56185m(str3)) {
                        }
                        if (this.f54577a != null) {
                        }
                        C2181a c2181aM6748K2222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                        uth uthVarMo32487f2222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                        this.f54575Y = uthVarMo32487f2222222222222222222222;
                        uthVarMo32487f2222222222222222222222.mo7072b(c2181aM6748K2222222222222222222222);
                        return;
                    }
                    if (i11 == 16) {
                        iG0 = 268435456;
                    } else if (i11 == 24) {
                        iG0 = 1342177280;
                    } else {
                        if (i11 != 32) {
                            ria.m46824h("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f54567Q + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i2 = -1;
                            i3 = -1;
                            if (this.f54565O != null) {
                            }
                            str3 = str5;
                            int i722222222222222222222222 = 0;
                            int i822222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                            bVar = new C2181a.b();
                            if (xeb.m56185m(str3)) {
                            }
                            if (this.f54577a != null) {
                            }
                            C2181a c2181aM6748K22222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                            uth uthVarMo32487f22222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                            this.f54575Y = uthVarMo32487f22222222222222222222222;
                            uthVarMo32487f22222222222222222222222.mo7072b(c2181aM6748K22222222222222222222222);
                            return;
                        }
                        iG0 = 1610612736;
                    }
                    i2 = iG0;
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222 = 0;
                    int i8222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222222222;
                    uthVarMo32487f222222222222222222222222.mo7072b(c2181aM6748K222222222222222222222222);
                    return;
                case 24:
                    iG0 = sqi.g0(this.f54567Q);
                    if (iG0 == 0) {
                        ria.m46824h("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f54567Q + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        i3 = -1;
                        if (this.f54565O != null) {
                        }
                        str3 = str5;
                        int i72222222222222222222222222 = 0;
                        int i82222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                        bVar = new C2181a.b();
                        if (xeb.m56185m(str3)) {
                        }
                        if (this.f54577a != null) {
                        }
                        C2181a c2181aM6748K2222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                        uth uthVarMo32487f2222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                        this.f54575Y = uthVarMo32487f2222222222222222222222222;
                        uthVarMo32487f2222222222222222222222222.mo7072b(c2181aM6748K2222222222222222222222222);
                        return;
                    }
                    i2 = iG0;
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222 = 0;
                    int i822222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222222222222222222;
                    uthVarMo32487f22222222222222222222222222.mo7072b(c2181aM6748K22222222222222222222222222);
                    return;
                case 25:
                    listSingletonList = nf8.m40501G(xza.g0, m57029g(this.f54578b));
                    str = null;
                    str5 = "text/x-ssa";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222 = 0;
                    int i8222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222222222222;
                    uthVarMo32487f222222222222222222222222222.mo7072b(c2181aM6748K222222222222222222222222222);
                    return;
                case 26:
                    ey7 ey7VarM25845a = ey7.m25845a(new zwc(m57029g(this.f54578b)));
                    list = ey7VarM25845a.f22382a;
                    this.f54576Z = ey7VarM25845a.f22383b;
                    str2 = ey7VarM25845a.f22393l;
                    str5 = "video/hevc";
                    i2 = -1;
                    i3 = -1;
                    List list22 = list;
                    str = str2;
                    listSingletonList = list22;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222222 = 0;
                    int i82222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222222222222222222;
                    uthVarMo32487f2222222222222222222222222222.mo7072b(c2181aM6748K2222222222222222222222222222);
                    return;
                case 27:
                    listSingletonList = null;
                    str = null;
                    str5 = "text/vtt";
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222222 = 0;
                    int i822222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222222222222222222222;
                    uthVarMo32487f22222222222222222222222222222.mo7072b(c2181aM6748K22222222222222222222222222222);
                    return;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222222 = 0;
                    int i8222222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222222222222222;
                    uthVarMo32487f222222222222222222222222222222.mo7072b(c2181aM6748K222222222222222222222222222222);
                    return;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222222222 = 0;
                    int i82222222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222222222222222222222;
                    uthVarMo32487f2222222222222222222222222222222.mo7072b(c2181aM6748K2222222222222222222222222222222);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222222222 = 0;
                    int i822222222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K22222222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i822222222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f22222222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f22222222222222222222222222222222;
                    uthVarMo32487f22222222222222222222222222222222.mo7072b(c2181aM6748K22222222222222222222222222222222);
                    return;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    listSingletonList = Collections.singletonList(m57029g(this.f54578b));
                    str5 = "audio/flac";
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i7222222222222222222222222222222222 = 0;
                    int i8222222222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K222222222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i8222222222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f222222222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f222222222222222222222222222222222;
                    uthVarMo32487f222222222222222222222222222222222.mo7072b(c2181aM6748K222222222222222222222222222222222);
                    return;
                case ' ':
                    listSingletonList = new ArrayList(3);
                    listSingletonList.add(m57029g(this.f54578b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f54569S).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f54570T).array());
                    str5 = "audio/opus";
                    i6 = 5760;
                    str = null;
                    i3 = i6;
                    i2 = -1;
                    if (this.f54565O != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222222222222222 = 0;
                    int i82222222222222222222222222222222222 = (this.f54573W ? 1 : 0) | 0 | (this.f54572V ? 2 : 0);
                    bVar = new C2181a.b();
                    if (xeb.m56185m(str3)) {
                    }
                    if (this.f54577a != null) {
                    }
                    C2181a c2181aM6748K2222222222222222222222222222222222 = bVar.m6763Z(i).o0(str3).f0(i3).e0(this.f54574X).q0(i82222222222222222222222222222222222).b0(listSingletonList).m6752O(str).m6758U(this.f54588l).m6748K();
                    uth uthVarMo32487f2222222222222222222222222222222222 = vq6Var.mo32487f(this.f54579c, i4);
                    this.f54575Y = uthVarMo32487f2222222222222222222222222222222222;
                    uthVarMo32487f2222222222222222222222222222222222.mo7072b(c2181aM6748K2222222222222222222222222222222222);
                    return;
                default:
                    throw byc.m19921a("Unrecognized codec identifier.", null);
            }
        }

        /* renamed from: j */
        public void m57032j() {
            wxh wxhVar = this.f54571U;
            if (wxhVar != null) {
                wxhVar.m55379a(this.f54575Y, this.f54586j);
            }
        }

        /* renamed from: n */
        public void m57033n() {
            wxh wxhVar = this.f54571U;
            if (wxhVar != null) {
                wxhVar.m55380b();
            }
        }

        /* renamed from: o */
        public final boolean m57034o(boolean z) {
            return "A_OPUS".equals(this.f54578b) ? z : this.f54582f > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(Opcodes.GETFIELD));
        map.put("htc_video_rotA-270", 270);
        k0 = Collections.unmodifiableMap(map);
    }

    public xza(qbg.InterfaceC16329a interfaceC16329a, int i) {
        this(new vd5(), i, interfaceC16329a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: A */
    public static boolean m56986A(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = TokenParser.SP;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: C */
    public static /* synthetic */ tq6[] m56987C() {
        return new tq6[]{new xza(qbg.InterfaceC16329a.f41600a, 2)};
    }

    /* renamed from: H */
    public static void m56988H(String str, long j, byte[] bArr) {
        byte[] bArrM56994u;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                bArrM56994u = m56994u(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrM56994u = m56994u(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                bArrM56994u = m56994u(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrM56994u, 0, bArr, i, bArrM56994u.length);
    }

    /* renamed from: r */
    public static int[] m56993r(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: u */
    public static byte[] m56994u(long j, String str, long j2) {
        op0.m42511a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return sqi.t0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    /* renamed from: B */
    public boolean m56995B(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: D */
    public final boolean m56996D(ued uedVar, long j) {
        if (this.f54498A) {
            this.f54500C = j;
            uedVar.f48772a = this.f54499B;
            this.f54498A = false;
            return true;
        }
        if (this.f54547x) {
            long j2 = this.f54500C;
            if (j2 != -1) {
                uedVar.f48772a = j2;
                this.f54500C = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m56997E(uq6 uq6Var, int i) {
        if (this.f54532i.m60026g() >= i) {
            return;
        }
        if (this.f54532i.m60021b() < i) {
            zwc zwcVar = this.f54532i;
            zwcVar.m60022c(Math.max(zwcVar.m60021b() * 2, i));
        }
        uq6Var.readFully(this.f54532i.m60024e(), this.f54532i.m60026g(), i - this.f54532i.m60026g());
        this.f54532i.m60016T(i);
    }

    /* renamed from: F */
    public final void m56998F() {
        this.f54518U = 0;
        this.f54519V = 0;
        this.f54520W = 0;
        this.f54521X = false;
        this.f54522Y = false;
        this.f54523Z = false;
        this.a0 = 0;
        this.b0 = (byte) 0;
        this.c0 = false;
        this.f54535l.m60013Q(0);
    }

    /* renamed from: G */
    public final long m56999G(long j) throws byc {
        long j2 = this.f54543t;
        if (j2 != -9223372036854775807L) {
            return sqi.a1(j, j2, 1000L);
        }
        throw byc.m19921a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: I */
    public void m57000I(int i, long j, long j2) throws byc {
        m57008m();
        if (i == 160) {
            this.f54516S = false;
            this.f54517T = 0L;
            return;
        }
        if (i == 174) {
            this.f54546w = new C18269c();
            return;
        }
        if (i == 187) {
            this.f54504G = false;
            return;
        }
        if (i == 19899) {
            this.f54548y = -1;
            this.f54549z = -1L;
            return;
        }
        if (i == 20533) {
            m57015v(i).f54584h = true;
            return;
        }
        if (i == 21968) {
            m57015v(i).f54601y = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f54542s;
            if (j3 != -1 && j3 != j) {
                throw byc.m19921a("Multiple Segment elements not supported", null);
            }
            this.f54542s = j;
            this.f54541r = j2;
            return;
        }
        if (i == 475249515) {
            this.f54502E = new bla();
            this.f54503F = new bla();
        } else if (i == 524531317 && !this.f54547x) {
            if (this.f54527d && this.f54499B != -1) {
                this.f54498A = true;
            } else {
                this.d0.mo32490r(new zaf.C18604b(this.f54545v));
                this.f54547x = true;
            }
        }
    }

    /* renamed from: J */
    public void m57001J(int i, String str) throws byc {
        if (i == 134) {
            m57015v(i).f54578b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                m57015v(i).f54577a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                m57015v(i).f54574X = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw byc.m19921a("DocType " + str + " not supported", null);
    }

    /* renamed from: K */
    public final int m57002K(uq6 uq6Var, C18269c c18269c, int i, boolean z) throws byc {
        int i2;
        if ("S_TEXT/UTF8".equals(c18269c.f54578b)) {
            m57003L(uq6Var, f0, i);
            return m57013s();
        }
        if ("S_TEXT/ASS".equals(c18269c.f54578b)) {
            m57003L(uq6Var, h0, i);
            return m57013s();
        }
        if ("S_TEXT/WEBVTT".equals(c18269c.f54578b)) {
            m57003L(uq6Var, i0, i);
            return m57013s();
        }
        uth uthVar = c18269c.f54575Y;
        if (!this.f54521X) {
            if (c18269c.f54584h) {
                this.f54514Q &= -1073741825;
                if (!this.f54522Y) {
                    uq6Var.readFully(this.f54532i.m60024e(), 0, 1);
                    this.f54518U++;
                    if ((this.f54532i.m60024e()[0] & 128) == 128) {
                        throw byc.m19921a("Extension bit is set in signal byte", null);
                    }
                    this.b0 = this.f54532i.m60024e()[0];
                    this.f54522Y = true;
                }
                byte b = this.b0;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f54514Q |= 1073741824;
                    if (!this.c0) {
                        uq6Var.readFully(this.f54537n.m60024e(), 0, 8);
                        this.f54518U += 8;
                        this.c0 = true;
                        this.f54532i.m60024e()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f54532i.m60017U(0);
                        uthVar.mo7074f(this.f54532i, 1, 1);
                        this.f54519V++;
                        this.f54537n.m60017U(0);
                        uthVar.mo7074f(this.f54537n, 8, 1);
                        this.f54519V += 8;
                    }
                    if (z2) {
                        if (!this.f54523Z) {
                            uq6Var.readFully(this.f54532i.m60024e(), 0, 1);
                            this.f54518U++;
                            this.f54532i.m60017U(0);
                            this.a0 = this.f54532i.m60004H();
                            this.f54523Z = true;
                        }
                        int i3 = this.a0 * 4;
                        this.f54532i.m60013Q(i3);
                        uq6Var.readFully(this.f54532i.m60024e(), 0, i3);
                        this.f54518U += i3;
                        short s = (short) ((this.a0 / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f54540q;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.f54540q = ByteBuffer.allocate(i4);
                        }
                        this.f54540q.position(0);
                        this.f54540q.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.a0;
                            if (i5 >= i2) {
                                break;
                            }
                            int iM60008L = this.f54532i.m60008L();
                            if (i5 % 2 == 0) {
                                this.f54540q.putShort((short) (iM60008L - i6));
                            } else {
                                this.f54540q.putInt(iM60008L - i6);
                            }
                            i5++;
                            i6 = iM60008L;
                        }
                        int i7 = (i - this.f54518U) - i6;
                        if (i2 % 2 == 1) {
                            this.f54540q.putInt(i7);
                        } else {
                            this.f54540q.putShort((short) i7);
                            this.f54540q.putInt(0);
                        }
                        this.f54538o.m60015S(this.f54540q.array(), i4);
                        uthVar.mo7074f(this.f54538o, i4, 1);
                        this.f54519V += i4;
                    }
                }
            } else {
                byte[] bArr = c18269c.f54585i;
                if (bArr != null) {
                    this.f54535l.m60015S(bArr, bArr.length);
                }
            }
            if (c18269c.m57034o(z)) {
                this.f54514Q |= 268435456;
                this.f54539p.m60013Q(0);
                int iM60026g = (this.f54535l.m60026g() + i) - this.f54518U;
                this.f54532i.m60013Q(4);
                this.f54532i.m60024e()[0] = (byte) ((iM60026g >> 24) & Constants.MAX_HOST_LENGTH);
                this.f54532i.m60024e()[1] = (byte) ((iM60026g >> 16) & Constants.MAX_HOST_LENGTH);
                this.f54532i.m60024e()[2] = (byte) ((iM60026g >> 8) & Constants.MAX_HOST_LENGTH);
                this.f54532i.m60024e()[3] = (byte) (iM60026g & Constants.MAX_HOST_LENGTH);
                uthVar.mo7074f(this.f54532i, 4, 2);
                this.f54519V += 4;
            }
            this.f54521X = true;
        }
        int iM60026g2 = i + this.f54535l.m60026g();
        if (!"V_MPEG4/ISO/AVC".equals(c18269c.f54578b) && !"V_MPEGH/ISO/HEVC".equals(c18269c.f54578b)) {
            if (c18269c.f54571U != null) {
                op0.m42517g(this.f54535l.m60026g() == 0);
                c18269c.f54571U.m55382d(uq6Var);
            }
            while (true) {
                int i8 = this.f54518U;
                if (i8 >= iM60026g2) {
                    break;
                }
                int iM57004M = m57004M(uq6Var, uthVar, iM60026g2 - i8);
                this.f54518U += iM57004M;
                this.f54519V += iM57004M;
            }
        } else {
            byte[] bArrM60024e = this.f54531h.m60024e();
            bArrM60024e[0] = 0;
            bArrM60024e[1] = 0;
            bArrM60024e[2] = 0;
            int i9 = c18269c.f54576Z;
            int i10 = 4 - i9;
            while (this.f54518U < iM60026g2) {
                int i11 = this.f54520W;
                if (i11 == 0) {
                    m57005N(uq6Var, bArrM60024e, i10, i9);
                    this.f54518U += i9;
                    this.f54531h.m60017U(0);
                    this.f54520W = this.f54531h.m60008L();
                    this.f54530g.m60017U(0);
                    uthVar.m52027e(this.f54530g, 4);
                    this.f54519V += 4;
                } else {
                    int iM57004M2 = m57004M(uq6Var, uthVar, i11);
                    this.f54518U += iM57004M2;
                    this.f54519V += iM57004M2;
                    this.f54520W -= iM57004M2;
                }
            }
        }
        if ("A_VORBIS".equals(c18269c.f54578b)) {
            this.f54533j.m60017U(0);
            uthVar.m52027e(this.f54533j, 4);
            this.f54519V += 4;
        }
        return m57013s();
    }

    /* renamed from: L */
    public final void m57003L(uq6 uq6Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f54536m.m60021b() < length) {
            this.f54536m.m60014R(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f54536m.m60024e(), 0, bArr.length);
        }
        uq6Var.readFully(this.f54536m.m60024e(), bArr.length, i);
        this.f54536m.m60017U(0);
        this.f54536m.m60016T(length);
    }

    /* renamed from: M */
    public final int m57004M(uq6 uq6Var, uth uthVar, int i) {
        int iM60020a = this.f54535l.m60020a();
        if (iM60020a <= 0) {
            return uthVar.m52026c(uq6Var, i, false);
        }
        int iMin = Math.min(i, iM60020a);
        uthVar.m52027e(this.f54535l, iMin);
        return iMin;
    }

    /* renamed from: N */
    public final void m57005N(uq6 uq6Var, byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.f54535l.m60020a());
        uq6Var.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.f54535l.m60031l(bArr, i, iMin);
        }
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f54501D = -9223372036854775807L;
        this.f54506I = 0;
        this.f54524a.reset();
        this.f54525b.m23774e();
        m56998F();
        for (int i = 0; i < this.f54526c.size(); i++) {
            ((C18269c) this.f54526c.valueAt(i)).m57033n();
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public final boolean mo17262c(uq6 uq6Var) {
        return new byf().m19926b(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public final void mo17263d(vq6 vq6Var) {
        this.d0 = vq6Var;
        if (this.f54528e) {
            vq6Var = new sbg(vq6Var, this.f54529f);
        }
        this.d0 = vq6Var;
    }

    /* renamed from: j */
    public final void m57006j(int i) throws byc {
        if (this.f54502E == null || this.f54503F == null) {
            throw byc.m19921a("Element " + i + " must be in a Cues", null);
        }
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public final int mo17264k(uq6 uq6Var, ued uedVar) {
        this.f54505H = false;
        boolean zMo47451a = true;
        while (zMo47451a && !this.f54505H) {
            zMo47451a = this.f54524a.mo47451a(uq6Var);
            if (zMo47451a && m56996D(uedVar, uq6Var.getPosition())) {
                return 1;
            }
        }
        if (zMo47451a) {
            return 0;
        }
        for (int i = 0; i < this.f54526c.size(); i++) {
            C18269c c18269c = (C18269c) this.f54526c.valueAt(i);
            c18269c.m57028f();
            c18269c.m57032j();
        }
        return -1;
    }

    /* renamed from: l */
    public final void m57007l(int i) throws byc {
        if (this.f54546w != null) {
            return;
        }
        throw byc.m19921a("Element " + i + " must be in a TrackEntry", null);
    }

    /* renamed from: m */
    public final void m57008m() {
        op0.m42519i(this.d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0237, code lost:
    
        throw p001o.byc.m19921a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m57009n(int i, int i2, uq6 uq6Var) throws byc {
        C18269c c18269c;
        int i3;
        C18269c c18269c2;
        C18269c c18269c3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f54506I != 2) {
                    return;
                }
                m57018y((C18269c) this.f54526c.get(this.f54512O), this.f54515R, uq6Var, i2);
                return;
            }
            if (i == 16877) {
                m57017x(m57015v(i), uq6Var, i2);
                return;
            }
            if (i == 16981) {
                m57007l(i);
                byte[] bArr = new byte[i2];
                this.f54546w.f54585i = bArr;
                uq6Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                uq6Var.readFully(bArr2, 0, i2);
                m57015v(i).f54586j = new uth.C17452a(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.f54534k.m60024e(), (byte) 0);
                uq6Var.readFully(this.f54534k.m60024e(), 4 - i2, i2);
                this.f54534k.m60017U(0);
                this.f54548y = (int) this.f54534k.m60006J();
                return;
            }
            if (i == 25506) {
                m57007l(i);
                byte[] bArr3 = new byte[i2];
                this.f54546w.f54587k = bArr3;
                uq6Var.readFully(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                throw byc.m19921a("Unexpected id: " + i, null);
            }
            m57007l(i);
            byte[] bArr4 = new byte[i2];
            this.f54546w.f54599w = bArr4;
            uq6Var.readFully(bArr4, 0, i2);
            return;
        }
        if (this.f54506I == 0) {
            this.f54512O = (int) this.f54525b.m23773d(uq6Var, false, true, 8);
            this.f54513P = this.f54525b.m23772b();
            this.f54508K = -9223372036854775807L;
            this.f54506I = 1;
            this.f54532i.m60013Q(0);
        }
        C18269c c18269c4 = (C18269c) this.f54526c.get(this.f54512O);
        if (c18269c4 == null) {
            uq6Var.mo40496k(i2 - this.f54513P);
            this.f54506I = 0;
            return;
        }
        c18269c4.m57028f();
        if (this.f54506I == 1) {
            m56997E(uq6Var, 3);
            int i9 = (this.f54532i.m60024e()[2] & 6) >> 1;
            byte b = 255;
            if (i9 == 0) {
                this.f54510M = 1;
                int[] iArrM56993r = m56993r(this.f54511N, 1);
                this.f54511N = iArrM56993r;
                iArrM56993r[0] = (i2 - this.f54513P) - 3;
            } else {
                int i10 = 4;
                m56997E(uq6Var, 4);
                int i11 = (this.f54532i.m60024e()[3] & 255) + 1;
                this.f54510M = i11;
                int[] iArrM56993r2 = m56993r(this.f54511N, i11);
                this.f54511N = iArrM56993r2;
                if (i9 == 2) {
                    int i12 = (i2 - this.f54513P) - 4;
                    int i13 = this.f54510M;
                    Arrays.fill(iArrM56993r2, 0, i13, i12 / i13);
                } else if (i9 == 1) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        i4 = this.f54510M;
                        if (i14 >= i4 - 1) {
                            break;
                        }
                        this.f54511N[i14] = 0;
                        do {
                            i10++;
                            m56997E(uq6Var, i10);
                            i5 = this.f54532i.m60024e()[i10 - 1] & 255;
                            int[] iArr = this.f54511N;
                            i6 = iArr[i14] + i5;
                            iArr[i14] = i6;
                        } while (i5 == 255);
                        i15 += i6;
                        i14++;
                    }
                    this.f54511N[i4 - 1] = ((i2 - this.f54513P) - i10) - i15;
                } else {
                    if (i9 != 3) {
                        throw byc.m19921a("Unexpected lacing value: " + i9, null);
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.f54510M;
                        if (i16 >= i18 - 1) {
                            c18269c2 = c18269c4;
                            this.f54511N[i18 - 1] = ((i2 - this.f54513P) - i10) - i17;
                            break;
                        }
                        this.f54511N[i16] = i7;
                        i10++;
                        m56997E(uq6Var, i10);
                        int i19 = i10 - 1;
                        if (this.f54532i.m60024e()[i19] == 0) {
                            throw byc.m19921a("No valid varint length mask found", null);
                        }
                        int i20 = i7;
                        while (true) {
                            if (i20 >= 8) {
                                c18269c3 = c18269c4;
                                j = 0;
                                break;
                            }
                            int i21 = i8 << (7 - i20);
                            if ((this.f54532i.m60024e()[i19] & i21) != 0) {
                                int i22 = i10 + i20;
                                m56997E(uq6Var, i22);
                                c18269c3 = c18269c4;
                                j = (~i21) & this.f54532i.m60024e()[i19] & b;
                                int i23 = i19 + 1;
                                while (i23 < i22) {
                                    j = (j << 8) | (this.f54532i.m60024e()[i23] & b);
                                    i23++;
                                    i22 = i22;
                                    b = 255;
                                }
                                int i24 = i22;
                                if (i16 > 0) {
                                    j -= (1 << ((i20 * 7) + 6)) - 1;
                                }
                                i10 = i24;
                            } else {
                                i20++;
                                i8 = 1;
                                b = 255;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i25 = (int) j;
                        int[] iArr2 = this.f54511N;
                        if (i16 != 0) {
                            i25 += iArr2[i16 - 1];
                        }
                        iArr2[i16] = i25;
                        i17 += i25;
                        i16++;
                        c18269c4 = c18269c3;
                        i7 = 0;
                        i8 = 1;
                        b = 255;
                    }
                }
            }
            c18269c2 = c18269c4;
            this.f54507J = this.f54501D + m56999G((this.f54532i.m60024e()[0] << 8) | (this.f54532i.m60024e()[1] & 255));
            c18269c = c18269c2;
            this.f54514Q = (c18269c.f54580d == 2 || (i == 163 && (this.f54532i.m60024e()[2] & 128) == 128)) ? 1 : 0;
            this.f54506I = 2;
            this.f54509L = 0;
            i3 = Opcodes.IF_ICMPGT;
        } else {
            c18269c = c18269c4;
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i26 = this.f54509L;
                if (i26 >= this.f54510M) {
                    this.f54506I = 0;
                    return;
                } else {
                    m57011p(c18269c, ((this.f54509L * c18269c.f54581e) / 1000) + this.f54507J, this.f54514Q, m57002K(uq6Var, c18269c, this.f54511N[i26], false), 0);
                    this.f54509L++;
                }
            }
        } else {
            while (true) {
                int i27 = this.f54509L;
                if (i27 >= this.f54510M) {
                    return;
                }
                int[] iArr3 = this.f54511N;
                iArr3[i27] = m57002K(uq6Var, c18269c, iArr3[i27], true);
                this.f54509L++;
            }
        }
    }

    /* renamed from: o */
    public final zaf m57010o(bla blaVar, bla blaVar2) {
        int i;
        if (this.f54542s == -1 || this.f54545v == -9223372036854775807L || blaVar == null || blaVar.m19331c() == 0 || blaVar2 == null || blaVar2.m19331c() != blaVar.m19331c()) {
            return new zaf.C18604b(this.f54545v);
        }
        int iM19331c = blaVar.m19331c();
        int[] iArrCopyOf = new int[iM19331c];
        long[] jArrCopyOf = new long[iM19331c];
        long[] jArrCopyOf2 = new long[iM19331c];
        long[] jArrCopyOf3 = new long[iM19331c];
        int i2 = 0;
        for (int i3 = 0; i3 < iM19331c; i3++) {
            jArrCopyOf3[i3] = blaVar.m19330b(i3);
            jArrCopyOf[i3] = this.f54542s + blaVar2.m19330b(i3);
        }
        while (true) {
            i = iM19331c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.f54542s + this.f54541r) - jArrCopyOf[i]);
        long j = this.f54545v - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            ria.m46824h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new n93(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* renamed from: p */
    public final void m57011p(C18269c c18269c, long j, int i, int i2, int i3) {
        wxh wxhVar = c18269c.f54571U;
        if (wxhVar != null) {
            wxhVar.m55381c(c18269c.f54575Y, j, i, i2, i3, c18269c.f54586j);
        } else {
            if ("S_TEXT/UTF8".equals(c18269c.f54578b) || "S_TEXT/ASS".equals(c18269c.f54578b) || "S_TEXT/WEBVTT".equals(c18269c.f54578b)) {
                if (this.f54510M > 1) {
                    ria.m46824h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f54508K;
                    if (j2 == -9223372036854775807L) {
                        ria.m46824h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m56988H(c18269c.f54578b, j2, this.f54536m.m60024e());
                        int iM60025f = this.f54536m.m60025f();
                        while (true) {
                            if (iM60025f >= this.f54536m.m60026g()) {
                                break;
                            }
                            if (this.f54536m.m60024e()[iM60025f] == 0) {
                                this.f54536m.m60016T(iM60025f);
                                break;
                            }
                            iM60025f++;
                        }
                        uth uthVar = c18269c.f54575Y;
                        zwc zwcVar = this.f54536m;
                        uthVar.m52027e(zwcVar, zwcVar.m60026g());
                        i2 += this.f54536m.m60026g();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f54510M > 1) {
                    this.f54539p.m60013Q(0);
                } else {
                    int iM60026g = this.f54539p.m60026g();
                    c18269c.f54575Y.mo7074f(this.f54539p, iM60026g, 2);
                    i2 += iM60026g;
                }
            }
            c18269c.f54575Y.mo7071a(j, i, i2, i3, c18269c.f54586j);
        }
        this.f54505H = true;
    }

    /* renamed from: q */
    public void m57012q(int i) throws byc {
        m57008m();
        if (i == 160) {
            if (this.f54506I != 2) {
                return;
            }
            C18269c c18269c = (C18269c) this.f54526c.get(this.f54512O);
            c18269c.m57028f();
            if (this.f54517T > 0 && "A_OPUS".equals(c18269c.f54578b)) {
                this.f54539p.m60014R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f54517T).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f54510M; i3++) {
                i2 += this.f54511N[i3];
            }
            int i4 = 0;
            while (i4 < this.f54510M) {
                long j = this.f54507J + ((c18269c.f54581e * i4) / 1000);
                int i5 = this.f54514Q;
                if (i4 == 0 && !this.f54516S) {
                    i5 |= 1;
                }
                int i6 = this.f54511N[i4];
                int i7 = i2 - i6;
                m57011p(c18269c, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.f54506I = 0;
            return;
        }
        if (i == 174) {
            C18269c c18269c2 = (C18269c) op0.m42519i(this.f54546w);
            String str = c18269c2.f54578b;
            if (str == null) {
                throw byc.m19921a("CodecId is missing in TrackEntry element", null);
            }
            if (m56986A(str)) {
                c18269c2.m57031i(this.d0, c18269c2.f54579c);
                this.f54526c.put(c18269c2.f54579c, c18269c2);
            }
            this.f54546w = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.f54548y;
            if (i8 != -1) {
                long j2 = this.f54549z;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.f54499B = j2;
                        return;
                    }
                    return;
                }
            }
            throw byc.m19921a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            m57007l(i);
            C18269c c18269c3 = this.f54546w;
            if (c18269c3.f54584h) {
                if (c18269c3.f54586j == null) {
                    throw byc.m19921a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                c18269c3.f54588l = new DrmInitData(new DrmInitData.SchemeData(dr1.f20423a, "video/webm", this.f54546w.f54586j.f49485b));
                return;
            }
            return;
        }
        if (i == 28032) {
            m57007l(i);
            C18269c c18269c4 = this.f54546w;
            if (c18269c4.f54584h && c18269c4.f54585i != null) {
                throw byc.m19921a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f54543t == -9223372036854775807L) {
                this.f54543t = 1000000L;
            }
            long j3 = this.f54544u;
            if (j3 != -9223372036854775807L) {
                this.f54545v = m56999G(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f54526c.size() == 0) {
                throw byc.m19921a("No valid tracks were found", null);
            }
            this.d0.mo32489p();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f54547x) {
                this.d0.mo32490r(m57010o(this.f54502E, this.f54503F));
                this.f54547x = true;
            }
            this.f54502E = null;
            this.f54503F = null;
        }
    }

    @Override // p001o.tq6
    public final void release() {
    }

    /* renamed from: s */
    public final int m57013s() {
        int i = this.f54519V;
        m56998F();
        return i;
    }

    /* renamed from: t */
    public void m57014t(int i, double d) {
        if (i == 181) {
            m57015v(i).f54568R = (int) d;
        }
        if (i == 17545) {
            this.f54544u = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m57015v(i).f54555E = (float) d;
                break;
            case 21970:
                m57015v(i).f54556F = (float) d;
                break;
            case 21971:
                m57015v(i).f54557G = (float) d;
                break;
            case 21972:
                m57015v(i).f54558H = (float) d;
                break;
            case 21973:
                m57015v(i).f54559I = (float) d;
                break;
            case 21974:
                m57015v(i).f54560J = (float) d;
                break;
            case 21975:
                m57015v(i).f54561K = (float) d;
                break;
            case 21976:
                m57015v(i).f54562L = (float) d;
                break;
            case 21977:
                m57015v(i).f54563M = (float) d;
                break;
            case 21978:
                m57015v(i).f54564N = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m57015v(i).f54596t = (float) d;
                        break;
                    case 30324:
                        m57015v(i).f54597u = (float) d;
                        break;
                    case 30325:
                        m57015v(i).f54598v = (float) d;
                        break;
                }
        }
    }

    /* renamed from: v */
    public C18269c m57015v(int i) throws byc {
        m57007l(i);
        return this.f54546w;
    }

    /* renamed from: w */
    public int m57016w(int i) {
        switch (i) {
            case Opcodes.LXOR /* 131 */:
            case Opcodes.L2I /* 136 */:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case Opcodes.I2F /* 134 */:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: x */
    public void m57017x(C18269c c18269c, uq6 uq6Var, int i) {
        if (c18269c.f54583g != 1685485123 && c18269c.f54583g != 1685480259) {
            uq6Var.mo40496k(i);
            return;
        }
        byte[] bArr = new byte[i];
        c18269c.f54565O = bArr;
        uq6Var.readFully(bArr, 0, i);
    }

    /* renamed from: y */
    public void m57018y(C18269c c18269c, int i, uq6 uq6Var, int i2) {
        if (i != 4 || !"V_VP9".equals(c18269c.f54578b)) {
            uq6Var.mo40496k(i2);
        } else {
            this.f54539p.m60013Q(i2);
            uq6Var.readFully(this.f54539p.m60024e(), 0, i2);
        }
    }

    /* renamed from: z */
    public void m57019z(int i, long j) throws byc {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw byc.m19921a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw byc.m19921a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case Opcodes.LXOR /* 131 */:
                m57015v(i).f54580d = (int) j;
                return;
            case Opcodes.L2I /* 136 */:
                m57015v(i).f54573W = j == 1;
                return;
            case 155:
                this.f54508K = m56999G(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                m57015v(i).f54566P = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                m57015v(i).f54589m = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                m57006j(i);
                this.f54502E.m19329a(m56999G(j));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                m57015v(i).f54590n = (int) j;
                return;
            case 215:
                m57015v(i).f54579c = (int) j;
                return;
            case 231:
                this.f54501D = m56999G(j);
                return;
            case 238:
                this.f54515R = (int) j;
                return;
            case 241:
                if (this.f54504G) {
                    return;
                }
                m57006j(i);
                this.f54503F.m19329a(j);
                this.f54504G = true;
                return;
            case 251:
                this.f54516S = true;
                return;
            case 16871:
                m57015v(i).f54583g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw byc.m19921a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw byc.m19921a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw byc.m19921a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw byc.m19921a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw byc.m19921a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f54549z = j + this.f54542s;
                return;
            case 21432:
                int i2 = (int) j;
                m57007l(i);
                if (i2 == 0) {
                    this.f54546w.f54600x = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f54546w.f54600x = 2;
                    return;
                } else if (i2 == 3) {
                    this.f54546w.f54600x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f54546w.f54600x = 3;
                    return;
                }
            case 21680:
                m57015v(i).f54592p = (int) j;
                return;
            case 21682:
                m57015v(i).f54594r = (int) j;
                return;
            case 21690:
                m57015v(i).f54593q = (int) j;
                return;
            case 21930:
                m57015v(i).f54572V = j == 1;
                return;
            case 21938:
                m57007l(i);
                C18269c c18269c = this.f54546w;
                c18269c.f54601y = true;
                c18269c.f54591o = (int) j;
                return;
            case 21998:
                m57015v(i).f54582f = (int) j;
                return;
            case 22186:
                m57015v(i).f54569S = j;
                return;
            case 22203:
                m57015v(i).f54570T = j;
                return;
            case 25188:
                m57015v(i).f54567Q = (int) j;
                return;
            case 30114:
                this.f54517T = j;
                return;
            case 30321:
                m57007l(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f54546w.f54595s = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f54546w.f54595s = 1;
                    return;
                } else if (i3 == 2) {
                    this.f54546w.f54595s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f54546w.f54595s = 3;
                    return;
                }
            case 2352003:
                m57015v(i).f54581e = (int) j;
                return;
            case 2807729:
                this.f54543t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m57007l(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f54546w.f54552B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f54546w.f54552B = 1;
                            return;
                        }
                    case 21946:
                        m57007l(i);
                        int iM43662k = ph3.m43662k((int) j);
                        if (iM43662k != -1) {
                            this.f54546w.f54551A = iM43662k;
                            return;
                        }
                        return;
                    case 21947:
                        m57007l(i);
                        this.f54546w.f54601y = true;
                        int iM43661j = ph3.m43661j((int) j);
                        if (iM43661j != -1) {
                            this.f54546w.f54602z = iM43661j;
                            return;
                        }
                        return;
                    case 21948:
                        m57015v(i).f54553C = (int) j;
                        return;
                    case 21949:
                        m57015v(i).f54554D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public xza(s26 s26Var, int i, qbg.InterfaceC16329a interfaceC16329a) {
        this.f54542s = -1L;
        this.f54543t = -9223372036854775807L;
        this.f54544u = -9223372036854775807L;
        this.f54545v = -9223372036854775807L;
        this.f54499B = -1L;
        this.f54500C = -1L;
        this.f54501D = -9223372036854775807L;
        this.f54524a = s26Var;
        s26Var.mo47452b(new C18268b());
        this.f54529f = interfaceC16329a;
        this.f54527d = (i & 1) == 0;
        this.f54528e = (i & 2) == 0;
        this.f54525b = new dsi();
        this.f54526c = new SparseArray();
        this.f54532i = new zwc(4);
        this.f54533j = new zwc(ByteBuffer.allocate(4).putInt(-1).array());
        this.f54534k = new zwc(4);
        this.f54530g = new zwc(irb.f29113a);
        this.f54531h = new zwc(4);
        this.f54535l = new zwc();
        this.f54536m = new zwc();
        this.f54537n = new zwc(8);
        this.f54538o = new zwc();
        this.f54539p = new zwc();
        this.f54511N = new int[1];
    }
}
