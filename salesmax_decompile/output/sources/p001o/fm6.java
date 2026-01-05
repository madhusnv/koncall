package p001o;

import android.location.Location;
import androidx.camera.core.InterfaceC1893c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class fm6 {

    /* renamed from: c */
    public static final String f23638c = "fm6";

    /* renamed from: d */
    public static final ThreadLocal f23639d = new C13485a();

    /* renamed from: e */
    public static final ThreadLocal f23640e = new C13486b();

    /* renamed from: f */
    public static final ThreadLocal f23641f = new C13487c();

    /* renamed from: g */
    public static final List f23642g = m27051n();

    /* renamed from: h */
    public static final List f23643h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    public final im6 f23644a;

    /* renamed from: b */
    public boolean f23645b = false;

    /* renamed from: o.fm6$a */
    public class C13485a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: o.fm6$b */
    public class C13486b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: o.fm6$c */
    public class C13487c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: o.fm6$d */
    public static final class C13488d {

        /* renamed from: o.fm6$d$a */
        public static final class a {

            /* renamed from: a */
            public final double f23646a;

            public a(double d) {
                this.f23646a = d;
            }

            /* renamed from: a */
            public double m27076a() {
                return this.f23646a / 2.23694d;
            }
        }

        /* renamed from: a */
        public static a m27073a(double d) {
            return new a(d * 0.621371d);
        }

        /* renamed from: b */
        public static a m27074b(double d) {
            return new a(d * 1.15078d);
        }

        /* renamed from: c */
        public static a m27075c(double d) {
            return new a(d);
        }
    }

    public fm6(im6 im6Var) {
        this.f23644a = im6Var;
    }

    /* renamed from: c */
    public static Date m27043c(String str) {
        return ((SimpleDateFormat) f23639d.get()).parse(str);
    }

    /* renamed from: d */
    public static Date m27044d(String str) {
        return ((SimpleDateFormat) f23641f.get()).parse(str);
    }

    /* renamed from: e */
    public static Date m27045e(String str) {
        return ((SimpleDateFormat) f23640e.get()).parse(str);
    }

    /* renamed from: f */
    public static String m27046f(long j) {
        return ((SimpleDateFormat) f23641f.get()).format(new Date(j));
    }

    /* renamed from: h */
    public static fm6 m27047h(File file) {
        return m27048i(file.toString());
    }

    /* renamed from: i */
    public static fm6 m27048i(String str) {
        return new fm6(new im6(str));
    }

    /* renamed from: j */
    public static fm6 m27049j(InterfaceC1893c interfaceC1893c) {
        ByteBuffer buffer = interfaceC1893c.u1()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return m27050k(new ByteArrayInputStream(bArr));
    }

    /* renamed from: k */
    public static fm6 m27050k(InputStream inputStream) {
        return new fm6(new im6(inputStream));
    }

    /* renamed from: n */
    public static List m27051n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* renamed from: A */
    public void m27052A() throws Throwable {
        if (!this.f23645b) {
            m27053a();
        }
        this.f23644a.m32344X();
    }

    /* renamed from: a */
    public final void m27053a() throws NumberFormatException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM27046f = m27046f(jCurrentTimeMillis);
        this.f23644a.c0("DateTime", strM27046f);
        try {
            this.f23644a.c0("SubSecTime", Long.toString(jCurrentTimeMillis - m27044d(strM27046f).getTime()));
        } catch (ParseException unused) {
        }
    }

    /* renamed from: b */
    public void m27054b(Location location) throws NumberFormatException {
        this.f23644a.d0(location);
    }

    /* renamed from: g */
    public void m27055g(fm6 fm6Var) throws NumberFormatException {
        ArrayList<String> arrayList = new ArrayList(f23642g);
        arrayList.removeAll(f23643h);
        for (String str : arrayList) {
            String strM32352g = this.f23644a.m32352g(str);
            String strM32352g2 = fm6Var.f23644a.m32352g(str);
            if (strM32352g != null && !strM32352g.equals(strM32352g2)) {
                fm6Var.f23644a.c0(str, strM32352g);
            }
        }
    }

    /* renamed from: l */
    public void m27056l() throws NumberFormatException {
        int i;
        switch (m27061r()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.f23644a.c0("Orientation", String.valueOf(i));
    }

    /* renamed from: m */
    public void m27057m() throws NumberFormatException {
        int i;
        switch (m27061r()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.f23644a.c0("Orientation", String.valueOf(i));
    }

    /* renamed from: o */
    public String m27058o() {
        return this.f23644a.m32352g("ImageDescription");
    }

    /* renamed from: p */
    public int m27059p() {
        return this.f23644a.m32354i("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Location m27060q() {
        char c;
        String strM32352g = this.f23644a.m32352g("GPSProcessingMethod");
        double[] dArrM32358m = this.f23644a.m32358m();
        double dM32351f = this.f23644a.m32351f(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        double dM32353h = this.f23644a.m32353h("GPSSpeed", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        String strM32352g2 = this.f23644a.m32352g("GPSSpeedRef");
        if (strM32352g2 == null) {
            strM32352g2 = "K";
        }
        long jM27068y = m27068y(this.f23644a.m32352g("GPSDateStamp"), this.f23644a.m32352g("GPSTimeStamp"));
        if (dArrM32358m == null) {
            return null;
        }
        if (strM32352g == null) {
            strM32352g = f23638c;
        }
        Location location = new Location(strM32352g);
        location.setLatitude(dArrM32358m[0]);
        location.setLongitude(dArrM32358m[1]);
        if (dM32351f != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            location.setAltitude(dM32351f);
        }
        if (dM32353h != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int iHashCode = strM32352g2.hashCode();
            if (iHashCode == 75) {
                if (strM32352g2.equals("K")) {
                    c = 2;
                }
                location.setSpeed((float) (c != 0 ? c != 1 ? C13488d.m27073a(dM32353h).m27076a() : C13488d.m27074b(dM32353h).m27076a() : C13488d.m27075c(dM32353h).m27076a()));
            } else if (iHashCode != 77) {
                c = (iHashCode == 78 && strM32352g2.equals("N")) ? (char) 1 : (char) 65535;
                location.setSpeed((float) (c != 0 ? c != 1 ? C13488d.m27073a(dM32353h).m27076a() : C13488d.m27074b(dM32353h).m27076a() : C13488d.m27075c(dM32353h).m27076a()));
            } else {
                if (strM32352g2.equals("M")) {
                    c = 0;
                }
                location.setSpeed((float) (c != 0 ? c != 1 ? C13488d.m27073a(dM32353h).m27076a() : C13488d.m27074b(dM32353h).m27076a() : C13488d.m27075c(dM32353h).m27076a()));
            }
        }
        if (jM27068y != -1) {
            location.setTime(jM27068y);
        }
        return location;
    }

    /* renamed from: r */
    public int m27061r() {
        return this.f23644a.m32354i("Orientation", 0);
    }

    /* renamed from: s */
    public int m27062s() {
        switch (m27061r()) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: t */
    public long m27063t() throws NumberFormatException {
        long jM27067x = m27067x(this.f23644a.m32352g("DateTimeOriginal"));
        if (jM27067x == -1) {
            return -1L;
        }
        String strM32352g = this.f23644a.m32352g("SubSecTimeOriginal");
        if (strM32352g == null) {
            return jM27067x;
        }
        try {
            long j = Long.parseLong(strM32352g);
            while (j > 1000) {
                j /= 10;
            }
            return jM27067x + j;
        } catch (NumberFormatException unused) {
            return jM27067x;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m27064u()), Integer.valueOf(m27059p()), Integer.valueOf(m27062s()), Boolean.valueOf(m27066w()), Boolean.valueOf(m27065v()), m27060q(), Long.valueOf(m27063t()), m27058o());
    }

    /* renamed from: u */
    public int m27064u() {
        return this.f23644a.m32354i("ImageWidth", 0);
    }

    /* renamed from: v */
    public boolean m27065v() {
        return m27061r() == 2;
    }

    /* renamed from: w */
    public boolean m27066w() {
        int iM27061r = m27061r();
        return iM27061r == 4 || iM27061r == 5 || iM27061r == 7;
    }

    /* renamed from: x */
    public final long m27067x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m27044d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* renamed from: y */
    public final long m27068y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m27043c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return m27045e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return m27067x(str + " " + str2);
    }

    /* renamed from: z */
    public void m27069z(int i) throws NumberFormatException {
        if (i % 90 != 0) {
            wja.m54638l(f23638c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i)));
            this.f23644a.c0("Orientation", String.valueOf(0));
            return;
        }
        int i2 = i % 360;
        int iM27061r = m27061r();
        while (i2 < 0) {
            i2 += 90;
            switch (iM27061r) {
                case 2:
                    iM27061r = 5;
                    break;
                case 3:
                case 8:
                    iM27061r = 6;
                    break;
                case 4:
                    iM27061r = 7;
                    break;
                case 5:
                    iM27061r = 4;
                    break;
                case 6:
                    iM27061r = 1;
                    break;
                case 7:
                    iM27061r = 2;
                    break;
                default:
                    iM27061r = 8;
                    break;
            }
        }
        while (i2 > 0) {
            i2 -= 90;
            switch (iM27061r) {
                case 2:
                    iM27061r = 7;
                    break;
                case 3:
                    iM27061r = 8;
                    break;
                case 4:
                    iM27061r = 5;
                    break;
                case 5:
                    iM27061r = 2;
                    break;
                case 6:
                    iM27061r = 3;
                    break;
                case 7:
                    iM27061r = 4;
                    break;
                case 8:
                    iM27061r = 1;
                    break;
                default:
                    iM27061r = 6;
                    break;
            }
        }
        this.f23644a.c0("Orientation", String.valueOf(iM27061r));
    }
}
