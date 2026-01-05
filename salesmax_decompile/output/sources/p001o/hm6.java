package p001o;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public class hm6 {

    /* renamed from: c */
    public static final String[] f27140c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    public static final om6[] f27141d;

    /* renamed from: e */
    public static final om6[] f27142e;

    /* renamed from: f */
    public static final om6[] f27143f;

    /* renamed from: g */
    public static final om6[] f27144g;

    /* renamed from: h */
    public static final om6[] f27145h;

    /* renamed from: i */
    public static final om6[][] f27146i;

    /* renamed from: j */
    public static final HashSet f27147j;

    /* renamed from: a */
    public final List f27148a;

    /* renamed from: b */
    public final ByteOrder f27149b;

    /* renamed from: o.hm6$a */
    public static /* synthetic */ class C13998a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27150a;

        static {
            int[] iArr = new int[s72.values().length];
            f27150a = iArr;
            try {
                iArr[s72.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27150a[s72.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27150a[s72.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: o.hm6$b */
    public static final class C13999b {

        /* renamed from: c */
        public static final Pattern f27151c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f27152d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f27153e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final List f27154f = Collections.list(new a());

        /* renamed from: a */
        public final List f27155a = Collections.list(new b());

        /* renamed from: b */
        public final ByteOrder f27156b;

        /* renamed from: o.hm6$b$a */
        public class a implements Enumeration {

            /* renamed from: a */
            public int f27157a = 0;

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap map = new HashMap();
                for (om6 om6Var : hm6.f27146i[this.f27157a]) {
                    map.put(om6Var.f38579b, om6Var);
                }
                this.f27157a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f27157a < hm6.f27146i.length;
            }
        }

        /* renamed from: o.hm6$b$b */
        public class b implements Enumeration {

            /* renamed from: a */
            public int f27158a = 0;

            public b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f27158a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f27158a < hm6.f27146i.length;
            }
        }

        /* renamed from: o.hm6$b$c */
        public class c implements Enumeration {

            /* renamed from: a */
            public final Enumeration f27160a;

            public c() {
                this.f27160a = Collections.enumeration(C13999b.this.f27155a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f27160a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f27160a.hasMoreElements();
            }
        }

        public C13999b(ByteOrder byteOrder) {
            this.f27156b = byteOrder;
        }

        /* renamed from: b */
        public static Pair m30791b(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair pairM30791b = m30791b(strArrSplit[0]);
                if (((Integer) pairM30791b.first).intValue() == 2) {
                    return pairM30791b;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair pairM30791b2 = m30791b(strArrSplit[i]);
                    int iIntValue = (((Integer) pairM30791b2.first).equals(pairM30791b.first) || ((Integer) pairM30791b2.second).equals(pairM30791b.first)) ? ((Integer) pairM30791b.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairM30791b.second).intValue() == -1 || !(((Integer) pairM30791b2.first).equals(pairM30791b.second) || ((Integer) pairM30791b2.second).equals(pairM30791b.second))) ? -1 : ((Integer) pairM30791b.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairM30791b = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairM30791b = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairM30791b;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
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
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
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

        /* renamed from: a */
        public hm6 m30792a() throws NumberFormatException {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                m30794d("ExposureProgram", String.valueOf(0), list);
                m30794d("ExifVersion", "0230", list);
                m30794d("ComponentsConfiguration", "1,2,3,0", list);
                m30794d("MeteringMode", String.valueOf(0), list);
                m30794d("LightSource", String.valueOf(0), list);
                m30794d("FlashpixVersion", "0100", list);
                m30794d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m30794d("FileSource", String.valueOf(3), list);
                m30794d("SceneType", String.valueOf(1), list);
                m30794d("CustomRendered", String.valueOf(0), list);
                m30794d("SceneCaptureType", String.valueOf(0), list);
                m30794d("Contrast", String.valueOf(0), list);
                m30794d("Saturation", String.valueOf(0), list);
                m30794d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                m30794d("GPSVersionID", "2300", list);
                m30794d("GPSSpeedRef", "K", list);
                m30794d("GPSTrackRef", "T", list);
                m30794d("GPSImgDirectionRef", "T", list);
                m30794d("GPSDestBearingRef", "T", list);
                m30794d("GPSDestDistanceRef", "K", list);
            }
            return new hm6(this.f27156b, list);
        }

        /* renamed from: c */
        public C13999b m30793c(String str, String str2) throws NumberFormatException {
            m30795e(str, str2, this.f27155a);
            return this;
        }

        /* renamed from: d */
        public final void m30794d(String str, String str2, List list) throws NumberFormatException {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            m30795e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: e */
        public final void m30795e(String str, String str2, List list) throws NumberFormatException {
            int i;
            int i2;
            int i3;
            C13999b c13999b = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f27152d.matcher(strReplaceAll).find();
                boolean zFind2 = f27153e.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    wja.m54638l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i4 = 2;
            int i5 = 1;
            if (strReplaceAll != null && hm6.f27147j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f27151c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        wja.m54638l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) fgd.m26663g(matcher.group(1))) + "/1," + Integer.parseInt((String) fgd.m26663g(matcher.group(2))) + "/1," + Integer.parseInt((String) fgd.m26663g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new ola(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e) {
                        wja.m54639m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e);
                        return;
                    }
                }
            }
            int i6 = 0;
            int i7 = 0;
            while (i7 < hm6.f27146i.length) {
                om6 om6Var = (om6) ((HashMap) f27154f.get(i7)).get(str4);
                if (om6Var == null) {
                    i = i7;
                    i2 = i5;
                } else {
                    if (strReplaceAll != null) {
                        Pair pairM30791b = m30791b(strReplaceAll);
                        if (om6Var.f38580c == ((Integer) pairM30791b.first).intValue() || om6Var.f38580c == ((Integer) pairM30791b.second).intValue()) {
                            i3 = om6Var.f38580c;
                        } else {
                            int i8 = om6Var.f38581d;
                            if (i8 == -1 || !(i8 == ((Integer) pairM30791b.first).intValue() || om6Var.f38581d == ((Integer) pairM30791b.second).intValue())) {
                                i3 = om6Var.f38580c;
                                if (i3 == i5 || i3 == 7 || i3 == i4) {
                                }
                            } else {
                                i3 = om6Var.f38581d;
                            }
                        }
                        String str5 = "/";
                        switch (i3) {
                            case 1:
                                i = i7;
                                i2 = i5;
                                ((Map) list.get(i)).put(str4, gm6.m29042a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i = i7;
                                i2 = i5;
                                ((Map) list.get(i)).put(str4, gm6.m29046e(strReplaceAll));
                                break;
                            case 3:
                                i = i7;
                                i2 = i5;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                                    iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                                }
                                ((Map) list.get(i)).put(str4, gm6.m29050i(iArr, c13999b.f27156b));
                                break;
                            case 4:
                                i = i7;
                                i2 = i5;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                                    jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                                }
                                ((Map) list.get(i)).put(str4, gm6.m29048g(jArr, c13999b.f27156b));
                                break;
                            case 5:
                                String str6 = "/";
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                ola[] olaVarArr = new ola[strArrSplit3.length];
                                int i11 = i6;
                                while (i11 < strArrSplit3.length) {
                                    String str7 = str6;
                                    String[] strArrSplit4 = strArrSplit3[i11].split(str7, -1);
                                    olaVarArr[i11] = new ola((long) Double.parseDouble(strArrSplit4[i6]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i11++;
                                    str6 = str7;
                                    i7 = i7;
                                    i6 = 0;
                                }
                                i = i7;
                                i2 = 1;
                                ((Map) list.get(i)).put(str4, gm6.m29049h(olaVarArr, c13999b.f27156b));
                                break;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i12 = i6; i12 < strArrSplit5.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit5[i12]);
                                }
                                ((Map) list.get(i7)).put(str4, gm6.m29044c(iArr2, c13999b.f27156b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                ola[] olaVarArr2 = new ola[strArrSplit6.length];
                                int i13 = i6;
                                while (i13 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i13].split(str5, -1);
                                    olaVarArr2[i13] = new ola((long) Double.parseDouble(strArrSplit7[i6]), (long) Double.parseDouble(strArrSplit7[i5]));
                                    i13++;
                                    str5 = str5;
                                    i5 = 1;
                                }
                                c13999b = this;
                                ((Map) list.get(i7)).put(str4, gm6.m29045d(olaVarArr2, c13999b.f27156b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i14 = i6; i14 < strArrSplit8.length; i14++) {
                                    dArr[i14] = Double.parseDouble(strArrSplit8[i14]);
                                }
                                ((Map) list.get(i7)).put(str4, gm6.m29043b(dArr, c13999b.f27156b));
                                break;
                        }
                    } else {
                        ((Map) list.get(i7)).remove(str4);
                    }
                    i = i7;
                    i2 = i5;
                }
                i7 = i + 1;
                i5 = i2;
                i4 = 2;
                i6 = 0;
            }
        }

        /* renamed from: f */
        public C13999b m30796f(long j) {
            return m30793c("ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: g */
        public C13999b m30797g(s72 s72Var) throws NumberFormatException {
            int i;
            if (s72Var == s72.UNKNOWN) {
                return this;
            }
            int i2 = C13998a.f27150a[s72Var.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else {
                if (i2 != 3) {
                    wja.m54638l("ExifData", "Unknown flash state: " + s72Var);
                    return this;
                }
                i = 1;
            }
            if ((i & 1) == 1) {
                m30793c("LightSource", String.valueOf(4));
            }
            return m30793c("Flash", String.valueOf(i));
        }

        /* renamed from: h */
        public C13999b m30798h(float f) {
            return m30793c("FocalLength", new ola((long) (f * 1000.0f), 1000L).toString());
        }

        /* renamed from: i */
        public C13999b m30799i(int i) {
            return m30793c("ImageLength", String.valueOf(i));
        }

        /* renamed from: j */
        public C13999b m30800j(int i) {
            return m30793c("ImageWidth", String.valueOf(i));
        }

        /* renamed from: k */
        public C13999b m30801k(int i) {
            return m30793c("SensitivityType", String.valueOf(3)).m30793c("PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
        }

        /* renamed from: l */
        public C13999b m30802l(float f) {
            return m30793c("FNumber", String.valueOf(f));
        }

        /* renamed from: m */
        public C13999b m30803m(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                wja.m54638l("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return m30793c("Orientation", String.valueOf(i2));
        }

        /* renamed from: n */
        public C13999b m30804n(EnumC14000c enumC14000c) {
            int iOrdinal = enumC14000c.ordinal();
            return m30793c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* renamed from: o.hm6$c */
    public enum EnumC14000c {
        AUTO,
        MANUAL
    }

    static {
        om6[] om6VarArr = {new om6("ImageWidth", 256, 3, 4), new om6("ImageLength", 257, 3, 4), new om6("Make", 271, 2), new om6("Model", 272, 2), new om6("Orientation", 274, 3), new om6("XResolution", 282, 5), new om6("YResolution", 283, 5), new om6("ResolutionUnit", 296, 3), new om6("Software", HttpStatus.SC_USE_PROXY, 2), new om6("DateTime", 306, 2), new om6("YCbCrPositioning", 531, 3), new om6("SubIFDPointer", 330, 4), new om6("ExifIFDPointer", 34665, 4), new om6("GPSInfoIFDPointer", 34853, 4)};
        f27141d = om6VarArr;
        om6[] om6VarArr2 = {new om6("ExposureTime", 33434, 5), new om6("FNumber", 33437, 5), new om6("ExposureProgram", 34850, 3), new om6("PhotographicSensitivity", 34855, 3), new om6("SensitivityType", 34864, 3), new om6("ExifVersion", 36864, 2), new om6("DateTimeOriginal", 36867, 2), new om6("DateTimeDigitized", 36868, 2), new om6("ComponentsConfiguration", 37121, 7), new om6("ShutterSpeedValue", 37377, 10), new om6("ApertureValue", 37378, 5), new om6("BrightnessValue", 37379, 10), new om6("ExposureBiasValue", 37380, 10), new om6("MaxApertureValue", 37381, 5), new om6("MeteringMode", 37383, 3), new om6("LightSource", 37384, 3), new om6("Flash", 37385, 3), new om6("FocalLength", 37386, 5), new om6("SubSecTime", 37520, 2), new om6("SubSecTimeOriginal", 37521, 2), new om6("SubSecTimeDigitized", 37522, 2), new om6("FlashpixVersion", 40960, 7), new om6("ColorSpace", 40961, 3), new om6("PixelXDimension", 40962, 3, 4), new om6("PixelYDimension", 40963, 3, 4), new om6("InteroperabilityIFDPointer", 40965, 4), new om6("FocalPlaneResolutionUnit", 41488, 3), new om6("SensingMethod", 41495, 3), new om6("FileSource", 41728, 7), new om6("SceneType", 41729, 7), new om6("CustomRendered", 41985, 3), new om6("ExposureMode", 41986, 3), new om6("WhiteBalance", 41987, 3), new om6("SceneCaptureType", 41990, 3), new om6("Contrast", 41992, 3), new om6("Saturation", 41993, 3), new om6("Sharpness", 41994, 3)};
        f27142e = om6VarArr2;
        om6[] om6VarArr3 = {new om6("GPSVersionID", 0, 1), new om6("GPSLatitudeRef", 1, 2), new om6("GPSLatitude", 2, 5, 10), new om6("GPSLongitudeRef", 3, 2), new om6("GPSLongitude", 4, 5, 10), new om6("GPSAltitudeRef", 5, 1), new om6("GPSAltitude", 6, 5), new om6("GPSTimeStamp", 7, 5), new om6("GPSSpeedRef", 12, 2), new om6("GPSTrackRef", 14, 2), new om6("GPSImgDirectionRef", 16, 2), new om6("GPSDestBearingRef", 23, 2), new om6("GPSDestDistanceRef", 25, 2)};
        f27143f = om6VarArr3;
        f27144g = new om6[]{new om6("SubIFDPointer", 330, 4), new om6("ExifIFDPointer", 34665, 4), new om6("GPSInfoIFDPointer", 34853, 4), new om6("InteroperabilityIFDPointer", 40965, 4)};
        om6[] om6VarArr4 = {new om6("InteroperabilityIndex", 1, 2)};
        f27145h = om6VarArr4;
        f27146i = new om6[][]{om6VarArr, om6VarArr2, om6VarArr3, om6VarArr4};
        f27147j = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public hm6(ByteOrder byteOrder, List list) {
        fgd.m26666j(list.size() == f27146i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f27149b = byteOrder;
        this.f27148a = list;
    }

    /* renamed from: a */
    public static C13999b m30787a() {
        return new C13999b(ByteOrder.BIG_ENDIAN).m30793c("Orientation", String.valueOf(1)).m30793c("XResolution", "72/1").m30793c("YResolution", "72/1").m30793c("ResolutionUnit", String.valueOf(2)).m30793c("YCbCrPositioning", String.valueOf(1)).m30793c("Make", Build.MANUFACTURER).m30793c("Model", Build.MODEL);
    }

    /* renamed from: b */
    public static hm6 m30788b(InterfaceC1893c interfaceC1893c, int i) {
        C13999b c13999bM30787a = m30787a();
        if (interfaceC1893c.y2() != null) {
            interfaceC1893c.y2().mo17846b(c13999bM30787a);
        }
        c13999bM30787a.m30803m(i);
        return c13999bM30787a.m30800j(interfaceC1893c.getWidth()).m30799i(interfaceC1893c.getHeight()).m30792a();
    }

    /* renamed from: c */
    public Map m30789c(int i) {
        fgd.m26659c(i, 0, f27146i.length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f27148a.get(i);
    }

    /* renamed from: d */
    public ByteOrder m30790d() {
        return this.f27149b;
    }
}
