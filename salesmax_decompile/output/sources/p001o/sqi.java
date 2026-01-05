package p001o;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.C2181a;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.api.Service;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.entity.ContentLengthStrategy;
import org.objectweb.asm.Opcodes;
import p001o.mad;

/* loaded from: classes2.dex */
public abstract class sqi {

    /* renamed from: a */
    public static final int f45790a;

    /* renamed from: b */
    public static final String f45791b;

    /* renamed from: c */
    public static final String f45792c;

    /* renamed from: d */
    public static final String f45793d;

    /* renamed from: e */
    public static final String f45794e;

    /* renamed from: f */
    public static final byte[] f45795f;

    /* renamed from: g */
    public static final long[] f45796g;

    /* renamed from: h */
    public static final Pattern f45797h;

    /* renamed from: i */
    public static final Pattern f45798i;

    /* renamed from: j */
    public static final Pattern f45799j;

    /* renamed from: k */
    public static final Pattern f45800k;

    /* renamed from: l */
    public static HashMap f45801l;

    /* renamed from: m */
    public static final String[] f45802m;

    /* renamed from: n */
    public static final String[] f45803n;

    /* renamed from: o */
    public static final int[] f45804o;

    /* renamed from: p */
    public static final int[] f45805p;

    /* renamed from: q */
    public static final int[] f45806q;

    /* renamed from: o.sqi$a */
    public static final class C16895a {
        /* renamed from: a */
        public static Drawable m48748a(Context context, Resources resources, int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f45790a = i;
        String str = Build.DEVICE;
        f45791b = str;
        String str2 = Build.MANUFACTURER;
        f45792c = str2;
        String str3 = Build.MODEL;
        f45793d = str3;
        f45794e = str + ", " + str3 + ", " + str2 + ", " + i;
        f45795f = new byte[0];
        f45796g = new long[0];
        f45797h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f45798i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f45799j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f45800k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f45802m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", OutcomeConstants.OUTCOME_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f45803n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f45804o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f45805p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f45806q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Opcodes.DNEG, 126, Opcodes.LSHL, 108, Opcodes.DMUL, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, Opcodes.MONITOREXIT, 202, HttpStatus.SC_RESET_CONTENT, Opcodes.D2F, Opcodes.DCMPL, 158, 153, Opcodes.F2L, Opcodes.F2I, 130, Opcodes.I2L, Opcodes.JSR, Opcodes.DRETURN, Opcodes.IF_ACMPNE, Opcodes.IF_ICMPLT, Opcodes.GETFIELD, Opcodes.PUTSTATIC, Opcodes.INVOKEDYNAMIC, Opcodes.ANEWARRAY, Opcodes.IFNONNULL, Opcodes.CHECKCAST, 201, HttpStatus.SC_PARTIAL_CONTENT, 219, 220, 213, 210, Constants.MAX_HOST_LENGTH, 248, 241, 246, 227, 228, 237, 234, Opcodes.INVOKESPECIAL, Opcodes.ARETURN, Opcodes.INVOKEINTERFACE, Opcodes.ARRAYLENGTH, Opcodes.LOOKUPSWITCH, Opcodes.IRETURN, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPGE, Opcodes.D2L, Opcodes.L2I, Opcodes.LOR, Opcodes.I2F, Opcodes.I2S, Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, Opcodes.DDIV, 104, 97, 102, Opcodes.DREM, 116, Opcodes.LUSHR, 122, Opcodes.L2F, Opcodes.D2I, Opcodes.I2D, 128, Opcodes.FCMPL, Opcodes.I2C, 155, 156, Opcodes.RETURN, Opcodes.INVOKEVIRTUAL, Opcodes.ATHROW, Opcodes.INVOKESTATIC, Opcodes.LRETURN, Opcodes.TABLESWITCH, Opcodes.IF_ICMPGT, Opcodes.IF_ICMPLE, 249, 254, 247, 240, 229, 226, 235, 236, Opcodes.INSTANCEOF, Opcodes.IFNULL, HttpStatus.SC_MULTI_STATUS, 200, 221, 218, 211, 212, 105, 110, 103, 96, Opcodes.LNEG, Opcodes.FREM, Opcodes.LSHR, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Opcodes.FNEG, Opcodes.LREM, 120, Opcodes.LAND, Opcodes.FMUL, Opcodes.LDIV, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, Opcodes.FRETURN, Opcodes.RET, Opcodes.IF_ICMPNE, Opcodes.GOTO, Opcodes.GETSTATIC, Opcodes.PUTFIELD, Opcodes.NEWARRAY, Opcodes.NEW, Opcodes.FCMPG, Opcodes.I2B, Opcodes.DCMPG, Opcodes.IF_ICMPEQ, Opcodes.L2D, Opcodes.F2D, Opcodes.IINC, Opcodes.LXOR, 222, 217, 208, 215, Opcodes.MONITORENTER, Opcodes.MULTIANEWARRAY, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static Handler m48696A(Handler.Callback callback) {
        return m48746y((Looper) op0.m42519i(Looper.myLooper()), callback);
    }

    public static boolean A0(zwc zwcVar, zwc zwcVar2, Inflater inflater) {
        if (zwcVar.m60020a() <= 0) {
            return false;
        }
        if (zwcVar2.m60021b() < zwcVar.m60020a()) {
            zwcVar2.m60022c(zwcVar.m60020a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zwcVar.m60024e(), zwcVar.m60025f(), zwcVar.m60020a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zwcVar2.m60024e(), iInflate, zwcVar2.m60021b() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == zwcVar2.m60021b()) {
                        zwcVar2.m60022c(zwcVar2.m60021b() * 2);
                    }
                } else {
                    zwcVar2.m60016T(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: B */
    public static Handler m48697B() {
        return m48698C(null);
    }

    public static String B0(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: C */
    public static Handler m48698C(Handler.Callback callback) {
        return m48746y(m48716U(), callback);
    }

    public static boolean C0(Context context) {
        return f45790a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: D */
    public static HashMap m48699D() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length + f45802m.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f45802m;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static boolean D0(String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return f45790a >= 34;
            case "image/heic":
            case "image/heif":
                return f45790a >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: E */
    public static long m48700E(long j, int i) {
        return d1(j, i, 1000000L, RoundingMode.CEILING);
    }

    public static boolean E0(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* renamed from: F */
    public static Uri m48701F(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f45800k.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean F0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* renamed from: G */
    public static String m48702G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean G0(Context context) {
        int i = f45790a;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i == 30) {
                String str = f45793d;
                if (kp0.m35991a(str, "moto g(20)") || kp0.m35991a(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static String m48703H(byte[] bArr) {
        return new String(bArr, uh2.f48931c);
    }

    public static boolean H0(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: I */
    public static String m48704I(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, uh2.f48931c);
    }

    public static boolean I0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    /* renamed from: J */
    public static int m48705J(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static boolean J0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: K */
    public static int m48706K(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
        }
    }

    public static boolean K0(Context context) {
        return f45790a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* renamed from: L */
    public static AudioFormat m48707L(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static /* synthetic */ Thread L0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m48708M(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f45790a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
    }

    public static int M0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static mad.C15264b m48709N(mad madVar, mad.C15264b c15264b) {
        boolean zMo7133b = madVar.mo7133b();
        boolean zMo31981U = madVar.mo31981U();
        boolean zMo31980Q = madVar.mo31980Q();
        boolean zMo31988u = madVar.mo31988u();
        boolean zG0 = madVar.g0();
        boolean zMo31990y = madVar.mo31990y();
        boolean zM37477q = madVar.mo7112A().m37477q();
        boolean z = false;
        mad.C15264b.a aVarM38648d = new mad.C15264b.a().m38646b(c15264b).m38648d(4, !zMo7133b).m38648d(5, zMo31981U && !zMo7133b).m38648d(6, zMo31980Q && !zMo7133b).m38648d(7, !zM37477q && (zMo31980Q || !zG0 || zMo31981U) && !zMo7133b).m38648d(8, zMo31988u && !zMo7133b).m38648d(9, !zM37477q && (zMo31988u || (zG0 && zMo31990y)) && !zMo7133b).m38648d(10, !zMo7133b).m38648d(11, zMo31981U && !zMo7133b);
        if (zMo31981U && !zMo7133b) {
            z = true;
        }
        return aVarM38648d.m38648d(12, z).m38649e();
    }

    public static String N0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f45803n;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: O */
    public static int m48710O(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static long O0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: P */
    public static byte[] m48711P(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static ExecutorService P0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.rqi
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return sqi.L0(str, runnable);
            }
        });
    }

    /* renamed from: Q */
    public static String m48712Q(String str, int i) {
        String[] strArrK1 = k1(str);
        if (strArrK1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrK1) {
            if (i == xeb.m56183k(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String Q0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM35995e = kp0.m35995e(str);
        String str2 = j1(strM35995e, "-")[0];
        if (f45801l == null) {
            f45801l = m48699D();
        }
        String str3 = (String) f45801l.get(str2);
        if (str3 != null) {
            strM35995e = str3 + strM35995e.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? N0(strM35995e) : strM35995e;
    }

    /* renamed from: R */
    public static String m48713R(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return kp0.m35996f(networkCountryIso);
            }
        }
        return kp0.m35996f(Locale.getDefault().getCountry());
    }

    public static Object[] R0(Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    /* renamed from: S */
    public static Point m48714S(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) op0.m42515e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m48715T(context, display);
    }

    public static Object[] S0(Object[] objArr, int i) {
        op0.m42511a(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: T */
    public static Point m48715T(Context context, Display display) throws NumberFormatException {
        if (display.getDisplayId() == 0 && J0(context)) {
            String strR0 = f45790a < 28 ? r0("sys.display-size") : r0("vendor.display-size");
            if (!TextUtils.isEmpty(strR0)) {
                try {
                    String[] strArrI1 = i1(strR0.trim(), "x");
                    if (strArrI1.length == 2) {
                        int i = Integer.parseInt(strArrI1[0]);
                        int i2 = Integer.parseInt(strArrI1[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                ria.m46819c("Util", "Invalid display size: " + strR0);
            }
            if ("Sony".equals(f45792c) && f45793d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f45790a >= 23) {
            m48718W(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static Object[] T0(Object[] objArr, int i, int i2) {
        op0.m42511a(i >= 0);
        op0.m42511a(i2 <= objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* renamed from: U */
    public static Looper m48716U() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static long U0(String str) throws byc {
        Matcher matcher = f45797h.matcher(str);
        if (!matcher.matches()) {
            throw byc.m19921a("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: V */
    public static Locale m48717V() {
        return f45790a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static long V0(String str) throws NumberFormatException {
        Matcher matcher = f45798i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d = Double.parseDouble(strGroup6);
        }
        long j = (long) ((d6 + d) * 1000.0d);
        return zIsEmpty ? -j : j;
    }

    /* renamed from: W */
    public static void m48718W(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static boolean W0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: X */
    public static Drawable m48719X(Context context, Resources resources, int i) {
        return f45790a >= 21 ? C16895a.m48748a(context, resources, i) : resources.getDrawable(i);
    }

    public static boolean X0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: Y */
    public static int m48720Y(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static void Y0(List list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: Z */
    public static int m48721Z(String str) throws NumberFormatException {
        String[] strArrI1;
        int length;
        if (str == null || (length = (strArrI1 = i1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrI1[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrI1[length - 2]);
        try {
            int i = Integer.parseInt((String) op0.m42515e(str2));
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long Z0(long j, int i) {
        return d1(j, 1000000L, i, RoundingMode.FLOOR);
    }

    public static String a0(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long a1(long j, long j2, long j3) {
        return d1(j, j2, j3, RoundingMode.FLOOR);
    }

    /* renamed from: b */
    public static long m48723b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    public static String b0(Locale locale) {
        return f45790a >= 21 ? c0(locale) : locale.toString();
    }

    public static long[] b1(List list, long j, long j2) {
        return f1(list, j, j2, RoundingMode.FLOOR);
    }

    /* renamed from: c */
    public static boolean m48724c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String c0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void c1(long[] jArr, long j, long j2) {
        g1(jArr, j, j2, RoundingMode.FLOOR);
    }

    /* renamed from: d */
    public static int m48725d(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static int d0(Context context) {
        return G0(context) ? 1 : 5;
    }

    public static long d1(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? e1(j, j2, j3, roundingMode) : kla.m35836d(j2, kla.m35834b(j, j3, RoundingMode.UNNECESSARY)) : kla.m35834b(j2, kla.m35834b(j3, j, RoundingMode.UNNECESSARY), roundingMode) : kla.m35836d(j, kla.m35834b(j2, j3, RoundingMode.UNNECESSARY)) : kla.m35834b(j, kla.m35834b(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* renamed from: e */
    public static int m48726e(bla blaVar, long j, boolean z, boolean z2) {
        int i;
        int iM19331c = blaVar.m19331c() - 1;
        int i2 = 0;
        while (i2 <= iM19331c) {
            int i3 = (i2 + iM19331c) >>> 1;
            if (blaVar.m19330b(i3) < j) {
                i2 = i3 + 1;
            } else {
                iM19331c = i3 - 1;
            }
        }
        if (z && (i = iM19331c + 1) < blaVar.m19331c() && blaVar.m19330b(i) == j) {
            return i;
        }
        if (z2 && iM19331c == -1) {
            return 0;
        }
        return iM19331c;
    }

    public static long e0(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long e1(long j, long j2, long j3, RoundingMode roundingMode) {
        long jM35836d = kla.m35836d(j, j2);
        if (jM35836d != Long.MAX_VALUE && jM35836d != Long.MIN_VALUE) {
            return kla.m35834b(jM35836d, j3, roundingMode);
        }
        long jM35835c = kla.m35835c(Math.abs(j2), Math.abs(j3));
        long jM35834b = kla.m35834b(j2, jM35835c, RoundingMode.UNNECESSARY);
        long jM35834b2 = kla.m35834b(j3, jM35835c, RoundingMode.UNNECESSARY);
        long jM35835c2 = kla.m35835c(Math.abs(j), Math.abs(jM35834b2));
        long jM35834b3 = kla.m35834b(j, jM35835c2, RoundingMode.UNNECESSARY);
        long jM35834b4 = kla.m35834b(jM35834b2, jM35835c2, RoundingMode.UNNECESSARY);
        long jM35836d2 = kla.m35836d(jM35834b3, jM35834b);
        if (jM35836d2 != Long.MAX_VALUE && jM35836d2 != Long.MIN_VALUE) {
            return kla.m35834b(jM35836d2, jM35834b4, roundingMode);
        }
        double d = jM35834b3 * (jM35834b / jM35834b4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return ix5.m32879c(d, roundingMode);
    }

    /* renamed from: f */
    public static int m48727f(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static long f0(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    public static long[] f1(List list, long j, long j2, RoundingMode roundingMode) {
        int i;
        int size = list.size();
        long[] jArr = new long[size];
        if (j == 0) {
            return jArr;
        }
        int i2 = 0;
        if (j2 >= j && j2 % j == 0) {
            long jM35834b = kla.m35834b(j2, j, RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = kla.m35834b(((Long) list.get(i2)).longValue(), jM35834b, roundingMode);
                i2++;
            }
            return jArr;
        }
        if (j2 < j && j % j2 == 0) {
            long jM35834b2 = kla.m35834b(j, j2, RoundingMode.UNNECESSARY);
            while (i2 < size) {
                jArr[i2] = kla.m35836d(((Long) list.get(i2)).longValue(), jM35834b2);
                i2++;
            }
            return jArr;
        }
        int i3 = 0;
        while (i3 < size) {
            long jLongValue = ((Long) list.get(i3)).longValue();
            if (jLongValue != 0) {
                if (j2 >= jLongValue && j2 % jLongValue == 0) {
                    jArr[i3] = kla.m35834b(j, kla.m35834b(j2, jLongValue, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= jLongValue || jLongValue % j2 != 0) {
                    i = i3;
                    jArr[i] = e1(jLongValue, j, j2, roundingMode);
                } else {
                    jArr[i3] = kla.m35836d(j, kla.m35834b(jLongValue, j2, RoundingMode.UNNECESSARY));
                }
                i = i3;
            } else {
                i = i3;
            }
            i3 = i + 1;
        }
        return jArr;
    }

    /* renamed from: g */
    public static int m48728g(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static int g0(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static void g1(long[] jArr, long j, long j2, RoundingMode roundingMode) {
        if (j == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long jM35834b = kla.m35834b(j2, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = kla.m35834b(jArr[i], jM35834b, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long jM35834b2 = kla.m35834b(j, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = kla.m35836d(jArr[i], jM35834b2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = kla.m35834b(j, kla.m35834b(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = e1(j3, j, j2, roundingMode);
                } else {
                    jArr[i2] = kla.m35836d(j, kla.m35834b(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* renamed from: h */
    public static Object m48729h(Object obj) {
        return obj;
    }

    public static C2181a h0(int i, int i2, int i3) {
        return new C2181a.b().o0("audio/raw").m6751N(i2).p0(i3).i0(i).m6748K();
    }

    public static boolean h1(mad madVar, boolean z) {
        if (madVar == null || !madVar.mo7119J() || madVar.mo7134c() == 1 || madVar.mo7134c() == 4) {
            return true;
        }
        return z && madVar.mo7148z() != 0;
    }

    /* renamed from: i */
    public static Object[] m48730i(Object[] objArr) {
        return objArr;
    }

    public static int i0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static String[] i1(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: j */
    public static int m48731j(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static long j0(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static String[] j1(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: k */
    public static long m48732k(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static List k0(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add(MediaTrack.ROLE_MAIN);
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add(MediaTrack.ROLE_SUPPLEMENTARY);
        }
        if ((i & 8) != 0) {
            arrayList.add(MediaTrack.ROLE_COMMENTARY);
        }
        if ((i & 16) != 0) {
            arrayList.add(MediaTrack.ROLE_DUB);
        }
        if ((i & 32) != 0) {
            arrayList.add(MediaTrack.ROLE_EMERGENCY);
        }
        if ((i & 64) != 0) {
            arrayList.add(MediaTrack.ROLE_CAPTION);
        }
        if ((i & 128) != 0) {
            arrayList.add(MediaTrack.ROLE_SUBTITLE);
        }
        if ((i & 256) != 0) {
            arrayList.add(MediaTrack.ROLE_SIGN);
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & Opcodes.ACC_ENUM) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static String[] k1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : i1(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: l */
    public static void m48733l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static List l0(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i & 1) != 0) {
            arrayList.add(CookieSpecs.DEFAULT);
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static ComponentName l1(Context context, Intent intent) {
        return f45790a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    /* renamed from: m */
    public static int m48734m(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int m0(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static long m1(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: n */
    public static float m48735n(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static String n0(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    public static String n1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: o */
    public static int m48736o(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static String[] o0() {
        String[] strArrP0 = p0();
        for (int i = 0; i < strArrP0.length; i++) {
            strArrP0[i] = Q0(strArrP0[i]);
        }
        return strArrP0;
    }

    public static long o1(int i, int i2) {
        return p1(i2) | (p1(i) << 32);
    }

    /* renamed from: p */
    public static long m48737p(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static String[] p0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f45790a >= 24 ? q0(configuration) : new String[]{b0(configuration.locale)};
    }

    public static long p1(int i) {
        return i & 4294967295L;
    }

    /* renamed from: q */
    public static boolean m48738q(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static String[] q0(Configuration configuration) {
        return i1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static long q1(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: r */
    public static boolean m48739r(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m48724c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String r0(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            ria.m46820d("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    public static void r1(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: s */
    public static boolean m48740s(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f45790a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static String s0(int i) {
        switch (i) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                return DevicePublicKeyStringDef.NONE;
            case -1:
                return "unknown";
            case 0:
                return CookieSpecs.DEFAULT;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    /* renamed from: t */
    public static int m48741t(SparseArray sparseArray) {
        if (f45790a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + Objects.hashCode(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    public static byte[] t0(String str) {
        return str.getBytes(uh2.f48931c);
    }

    /* renamed from: u */
    public static int m48742u(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int iM18175b = b5i.m18175b(bArr[i]);
            i3 = m48743v(iM18175b & 15, m48743v(iM18175b >> 4, i3));
            i++;
        }
        return i3;
    }

    public static boolean u0(mad madVar) {
        if (madVar == null || !madVar.mo31989x(1)) {
            return false;
        }
        madVar.pause();
        return true;
    }

    /* renamed from: v */
    public static int m48743v(int i, int i2) {
        return (f45805p[(i ^ ((i2 >> 12) & com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH)) & com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH] ^ ((i2 << 4) & 65535)) & 65535;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v0(mad madVar) {
        boolean z = false;
        if (madVar == null) {
            return false;
        }
        int iMo7134c = madVar.mo7134c();
        if (iMo7134c != 1 || !madVar.mo31989x(2)) {
            if (iMo7134c == 4 && madVar.mo31989x(4)) {
                madVar.mo31985k();
            }
            if (madVar.mo31989x(1)) {
                return z;
            }
            madVar.mo31983g();
            return true;
        }
        madVar.mo7137f();
        z = true;
        if (madVar.mo31989x(1)) {
        }
    }

    /* renamed from: w */
    public static int m48744w(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f45804o[((i3 >>> 24) ^ (bArr[i] & com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH)) & com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static boolean w0(mad madVar, boolean z) {
        return h1(madVar, z) ? v0(madVar) : u0(madVar);
    }

    /* renamed from: x */
    public static int m48745x(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f45806q[i3 ^ (bArr[i] & com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH)];
            i++;
        }
        return i3;
    }

    public static int x0(Uri uri) {
        int iY0;
        String scheme = uri.getScheme();
        if (scheme != null && kp0.m35991a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iY0 = y0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iY0;
        }
        Matcher matcher = f45800k.matcher((CharSequence) op0.m42515e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: y */
    public static Handler m48746y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static int y0(String str) {
        String strM35995e = kp0.m35995e(str);
        strM35995e.hashCode();
        switch (strM35995e) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: z */
    public static Handler m48747z() {
        return m48696A(null);
    }

    public static int z0(Uri uri, String str) {
        if (str == null) {
            return x0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }
}
