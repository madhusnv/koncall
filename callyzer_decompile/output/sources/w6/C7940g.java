package w6;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import mm.AbstractC4801l;
import pg.s6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.g */
/* loaded from: classes.dex */
public final class C7940g {

    /* renamed from: A */
    public static final byte[] f38168A;

    /* renamed from: B */
    public static final byte[] f38169B;

    /* renamed from: C */
    public static final String[] f38170C;

    /* renamed from: D */
    public static final int[] f38171D;

    /* renamed from: E */
    public static final byte[] f38172E;

    /* renamed from: F */
    public static final C7937d f38173F;

    /* renamed from: G */
    public static final C7937d[][] f38174G;

    /* renamed from: H */
    public static final C7937d[] f38175H;

    /* renamed from: I */
    public static final HashMap[] f38176I;

    /* renamed from: J */
    public static final HashMap[] f38177J;

    /* renamed from: K */
    public static final HashSet f38178K;

    /* renamed from: L */
    public static final HashMap f38179L;

    /* renamed from: M */
    public static final Charset f38180M;

    /* renamed from: N */
    public static final byte[] f38181N;

    /* renamed from: O */
    public static final byte[] f38182O;

    /* renamed from: m */
    public static final boolean f38183m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n */
    public static final int[] f38184n;

    /* renamed from: o */
    public static final int[] f38185o;

    /* renamed from: p */
    public static final byte[] f38186p;

    /* renamed from: q */
    public static final byte[] f38187q;

    /* renamed from: r */
    public static final byte[] f38188r;

    /* renamed from: s */
    public static final byte[] f38189s;

    /* renamed from: t */
    public static final byte[] f38190t;

    /* renamed from: u */
    public static final byte[] f38191u;

    /* renamed from: v */
    public static final byte[] f38192v;

    /* renamed from: w */
    public static final byte[] f38193w;

    /* renamed from: x */
    public static final byte[] f38194x;

    /* renamed from: y */
    public static final byte[] f38195y;

    /* renamed from: z */
    public static final byte[] f38196z;

    /* renamed from: a */
    public final String f38197a;

    /* renamed from: b */
    public final FileDescriptor f38198b;

    /* renamed from: c */
    public final AssetManager.AssetInputStream f38199c;

    /* renamed from: d */
    public int f38200d;

    /* renamed from: e */
    public final HashMap[] f38201e;

    /* renamed from: f */
    public final HashSet f38202f;

    /* renamed from: g */
    public ByteOrder f38203g;

    /* renamed from: h */
    public boolean f38204h;

    /* renamed from: i */
    public int f38205i;

    /* renamed from: j */
    public int f38206j;

    /* renamed from: k */
    public int f38207k;

    /* renamed from: l */
    public int f38208l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f38184n = new int[]{8, 8, 8};
        f38185o = new int[]{8};
        f38186p = new byte[]{-1, -40, -1};
        f38187q = new byte[]{102, 116, 121, 112};
        f38188r = new byte[]{109, 105, 102, 49};
        f38189s = new byte[]{104, 101, 105, 99};
        f38190t = new byte[]{79, 76, 89, 77, 80, 0};
        f38191u = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f38192v = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f38193w = new byte[]{101, 88, 73, 102};
        f38194x = new byte[]{73, 72, 68, 82};
        f38195y = new byte[]{73, 69, 78, 68};
        f38196z = new byte[]{82, 73, 70, 70};
        f38168A = new byte[]{87, 69, 66, 80};
        f38169B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f38170C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f38171D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f38172E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C7937d[] c7937dArr = {new C7937d("NewSubfileType", 254, 4), new C7937d("SubfileType", 255, 4), new C7937d("ImageWidth", 256, 3, 4), new C7937d("ImageLength", 257, 3, 4), new C7937d("BitsPerSample", 258, 3), new C7937d("Compression", 259, 3), new C7937d("PhotometricInterpretation", 262, 3), new C7937d("ImageDescription", 270, 2), new C7937d("Make", 271, 2), new C7937d("Model", 272, 2), new C7937d("StripOffsets", 273, 3, 4), new C7937d("Orientation", 274, 3), new C7937d("SamplesPerPixel", 277, 3), new C7937d("RowsPerStrip", 278, 3, 4), new C7937d("StripByteCounts", 279, 3, 4), new C7937d("XResolution", 282, 5), new C7937d("YResolution", 283, 5), new C7937d("PlanarConfiguration", 284, 3), new C7937d("ResolutionUnit", 296, 3), new C7937d("TransferFunction", 301, 3), new C7937d("Software", 305, 2), new C7937d("DateTime", 306, 2), new C7937d("Artist", 315, 2), new C7937d("WhitePoint", 318, 5), new C7937d("PrimaryChromaticities", 319, 5), new C7937d("SubIFDPointer", 330, 4), new C7937d("JPEGInterchangeFormat", 513, 4), new C7937d("JPEGInterchangeFormatLength", 514, 4), new C7937d("YCbCrCoefficients", 529, 5), new C7937d("YCbCrSubSampling", 530, 3), new C7937d("YCbCrPositioning", 531, 3), new C7937d("ReferenceBlackWhite", 532, 5), new C7937d("Copyright", 33432, 2), new C7937d("ExifIFDPointer", 34665, 4), new C7937d("GPSInfoIFDPointer", 34853, 4), new C7937d("SensorTopBorder", 4, 4), new C7937d("SensorLeftBorder", 5, 4), new C7937d("SensorBottomBorder", 6, 4), new C7937d("SensorRightBorder", 7, 4), new C7937d("ISO", 23, 3), new C7937d("JpgFromRaw", 46, 7), new C7937d("Xmp", 700, 1)};
        C7937d[] c7937dArr2 = {new C7937d("ExposureTime", 33434, 5), new C7937d("FNumber", 33437, 5), new C7937d("ExposureProgram", 34850, 3), new C7937d("SpectralSensitivity", 34852, 2), new C7937d("PhotographicSensitivity", 34855, 3), new C7937d("OECF", 34856, 7), new C7937d("SensitivityType", 34864, 3), new C7937d("StandardOutputSensitivity", 34865, 4), new C7937d("RecommendedExposureIndex", 34866, 4), new C7937d("ISOSpeed", 34867, 4), new C7937d("ISOSpeedLatitudeyyy", 34868, 4), new C7937d("ISOSpeedLatitudezzz", 34869, 4), new C7937d("ExifVersion", 36864, 2), new C7937d("DateTimeOriginal", 36867, 2), new C7937d("DateTimeDigitized", 36868, 2), new C7937d("OffsetTime", 36880, 2), new C7937d("OffsetTimeOriginal", 36881, 2), new C7937d("OffsetTimeDigitized", 36882, 2), new C7937d("ComponentsConfiguration", 37121, 7), new C7937d("CompressedBitsPerPixel", 37122, 5), new C7937d("ShutterSpeedValue", 37377, 10), new C7937d("ApertureValue", 37378, 5), new C7937d("BrightnessValue", 37379, 10), new C7937d("ExposureBiasValue", 37380, 10), new C7937d("MaxApertureValue", 37381, 5), new C7937d("SubjectDistance", 37382, 5), new C7937d("MeteringMode", 37383, 3), new C7937d("LightSource", 37384, 3), new C7937d("Flash", 37385, 3), new C7937d("FocalLength", 37386, 5), new C7937d("SubjectArea", 37396, 3), new C7937d("MakerNote", 37500, 7), new C7937d("UserComment", 37510, 7), new C7937d("SubSecTime", 37520, 2), new C7937d("SubSecTimeOriginal", 37521, 2), new C7937d("SubSecTimeDigitized", 37522, 2), new C7937d("FlashpixVersion", 40960, 7), new C7937d("ColorSpace", 40961, 3), new C7937d("PixelXDimension", 40962, 3, 4), new C7937d("PixelYDimension", 40963, 3, 4), new C7937d("RelatedSoundFile", 40964, 2), new C7937d("InteroperabilityIFDPointer", 40965, 4), new C7937d("FlashEnergy", 41483, 5), new C7937d("SpatialFrequencyResponse", 41484, 7), new C7937d("FocalPlaneXResolution", 41486, 5), new C7937d("FocalPlaneYResolution", 41487, 5), new C7937d("FocalPlaneResolutionUnit", 41488, 3), new C7937d("SubjectLocation", 41492, 3), new C7937d("ExposureIndex", 41493, 5), new C7937d("SensingMethod", 41495, 3), new C7937d("FileSource", 41728, 7), new C7937d("SceneType", 41729, 7), new C7937d("CFAPattern", 41730, 7), new C7937d("CustomRendered", 41985, 3), new C7937d("ExposureMode", 41986, 3), new C7937d("WhiteBalance", 41987, 3), new C7937d("DigitalZoomRatio", 41988, 5), new C7937d("FocalLengthIn35mmFilm", 41989, 3), new C7937d("SceneCaptureType", 41990, 3), new C7937d("GainControl", 41991, 3), new C7937d("Contrast", 41992, 3), new C7937d("Saturation", 41993, 3), new C7937d("Sharpness", 41994, 3), new C7937d("DeviceSettingDescription", 41995, 7), new C7937d("SubjectDistanceRange", 41996, 3), new C7937d("ImageUniqueID", 42016, 2), new C7937d("CameraOwnerName", 42032, 2), new C7937d("BodySerialNumber", 42033, 2), new C7937d("LensSpecification", 42034, 5), new C7937d("LensMake", 42035, 2), new C7937d("LensModel", 42036, 2), new C7937d("Gamma", 42240, 5), new C7937d("DNGVersion", 50706, 1), new C7937d("DefaultCropSize", 50720, 3, 4)};
        C7937d[] c7937dArr3 = {new C7937d("GPSVersionID", 0, 1), new C7937d("GPSLatitudeRef", 1, 2), new C7937d("GPSLatitude", 2, 5, 10), new C7937d("GPSLongitudeRef", 3, 2), new C7937d("GPSLongitude", 4, 5, 10), new C7937d("GPSAltitudeRef", 5, 1), new C7937d("GPSAltitude", 6, 5), new C7937d("GPSTimeStamp", 7, 5), new C7937d("GPSSatellites", 8, 2), new C7937d("GPSStatus", 9, 2), new C7937d("GPSMeasureMode", 10, 2), new C7937d("GPSDOP", 11, 5), new C7937d("GPSSpeedRef", 12, 2), new C7937d("GPSSpeed", 13, 5), new C7937d("GPSTrackRef", 14, 2), new C7937d("GPSTrack", 15, 5), new C7937d("GPSImgDirectionRef", 16, 2), new C7937d("GPSImgDirection", 17, 5), new C7937d("GPSMapDatum", 18, 2), new C7937d("GPSDestLatitudeRef", 19, 2), new C7937d("GPSDestLatitude", 20, 5), new C7937d("GPSDestLongitudeRef", 21, 2), new C7937d("GPSDestLongitude", 22, 5), new C7937d("GPSDestBearingRef", 23, 2), new C7937d("GPSDestBearing", 24, 5), new C7937d("GPSDestDistanceRef", 25, 2), new C7937d("GPSDestDistance", 26, 5), new C7937d("GPSProcessingMethod", 27, 7), new C7937d("GPSAreaInformation", 28, 7), new C7937d("GPSDateStamp", 29, 2), new C7937d("GPSDifferential", 30, 3), new C7937d("GPSHPositioningError", 31, 5)};
        C7937d[] c7937dArr4 = {new C7937d("InteroperabilityIndex", 1, 2)};
        C7937d[] c7937dArr5 = {new C7937d("NewSubfileType", 254, 4), new C7937d("SubfileType", 255, 4), new C7937d("ThumbnailImageWidth", 256, 3, 4), new C7937d("ThumbnailImageLength", 257, 3, 4), new C7937d("BitsPerSample", 258, 3), new C7937d("Compression", 259, 3), new C7937d("PhotometricInterpretation", 262, 3), new C7937d("ImageDescription", 270, 2), new C7937d("Make", 271, 2), new C7937d("Model", 272, 2), new C7937d("StripOffsets", 273, 3, 4), new C7937d("ThumbnailOrientation", 274, 3), new C7937d("SamplesPerPixel", 277, 3), new C7937d("RowsPerStrip", 278, 3, 4), new C7937d("StripByteCounts", 279, 3, 4), new C7937d("XResolution", 282, 5), new C7937d("YResolution", 283, 5), new C7937d("PlanarConfiguration", 284, 3), new C7937d("ResolutionUnit", 296, 3), new C7937d("TransferFunction", 301, 3), new C7937d("Software", 305, 2), new C7937d("DateTime", 306, 2), new C7937d("Artist", 315, 2), new C7937d("WhitePoint", 318, 5), new C7937d("PrimaryChromaticities", 319, 5), new C7937d("SubIFDPointer", 330, 4), new C7937d("JPEGInterchangeFormat", 513, 4), new C7937d("JPEGInterchangeFormatLength", 514, 4), new C7937d("YCbCrCoefficients", 529, 5), new C7937d("YCbCrSubSampling", 530, 3), new C7937d("YCbCrPositioning", 531, 3), new C7937d("ReferenceBlackWhite", 532, 5), new C7937d("Copyright", 33432, 2), new C7937d("ExifIFDPointer", 34665, 4), new C7937d("GPSInfoIFDPointer", 34853, 4), new C7937d("DNGVersion", 50706, 1), new C7937d("DefaultCropSize", 50720, 3, 4)};
        f38173F = new C7937d("StripOffsets", 273, 3);
        f38174G = new C7937d[][]{c7937dArr, c7937dArr2, c7937dArr3, c7937dArr4, c7937dArr5, c7937dArr, new C7937d[]{new C7937d("ThumbnailImage", 256, 7), new C7937d("CameraSettingsIFDPointer", 8224, 4), new C7937d("ImageProcessingIFDPointer", 8256, 4)}, new C7937d[]{new C7937d("PreviewImageStart", 257, 4), new C7937d("PreviewImageLength", 258, 4)}, new C7937d[]{new C7937d("AspectFrame", 4371, 3)}, new C7937d[]{new C7937d("ColorSpace", 55, 3)}};
        f38175H = new C7937d[]{new C7937d("SubIFDPointer", 330, 4), new C7937d("ExifIFDPointer", 34665, 4), new C7937d("GPSInfoIFDPointer", 34853, 4), new C7937d("InteroperabilityIFDPointer", 40965, 4), new C7937d("CameraSettingsIFDPointer", 8224, 1), new C7937d("ImageProcessingIFDPointer", 8256, 1)};
        f38176I = new HashMap[10];
        f38177J = new HashMap[10];
        f38178K = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f38179L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f38180M = charsetForName;
        f38181N = "Exif\u0000\u0000".getBytes(charsetForName);
        f38182O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            C7937d[][] c7937dArr6 = f38174G;
            if (i10 >= c7937dArr6.length) {
                HashMap map = f38179L;
                C7937d[] c7937dArr7 = f38175H;
                map.put(Integer.valueOf(c7937dArr7[0].f38162a), 5);
                map.put(Integer.valueOf(c7937dArr7[1].f38162a), 1);
                map.put(Integer.valueOf(c7937dArr7[2].f38162a), 2);
                map.put(Integer.valueOf(c7937dArr7[3].f38162a), 3);
                map.put(Integer.valueOf(c7937dArr7[4].f38162a), 7);
                map.put(Integer.valueOf(c7937dArr7[5].f38162a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f38176I[i10] = new HashMap();
            f38177J[i10] = new HashMap();
            for (C7937d c7937d : c7937dArr6[i10]) {
                f38176I[i10].put(Integer.valueOf(c7937d.f38162a), c7937d);
                f38177J[i10].put(c7937d.f38163b, c7937d);
            }
            i10++;
        }
    }

    public C7940g(InputStream inputStream) throws Throwable {
        C7937d[][] c7937dArr = f38174G;
        this.f38201e = new HashMap[c7937dArr.length];
        this.f38202f = new HashSet(c7937dArr.length);
        this.f38203g = ByteOrder.BIG_ENDIAN;
        this.f38197a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f38199c = (AssetManager.AssetInputStream) inputStream;
            this.f38198b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC7941h.m15096c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f38199c = null;
                this.f38198b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.f38199c = null;
            this.f38198b = null;
        }
        boolean z6 = f38183m;
        for (int i10 = 0; i10 < f38174G.length; i10++) {
            try {
                this.f38201e[i10] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused2) {
                m15070a();
                if (!z6) {
                    return;
                }
            } catch (Throwable th2) {
                m15070a();
                if (z6) {
                    m15086q();
                }
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM15076g = m15076g(bufferedInputStream);
        this.f38200d = iM15076g;
        if (iM15076g == 4 || iM15076g == 9 || iM15076g == 13 || iM15076g == 14) {
            C7935b c7935b = new C7935b(bufferedInputStream);
            int i11 = this.f38200d;
            if (i11 == 4) {
                m15075f(c7935b, 0, 0);
            } else if (i11 == 13) {
                m15078i(c7935b);
            } else if (i11 == 9) {
                m15079j(c7935b);
            } else if (i11 == 14) {
                m15082m(c7935b);
            }
        } else {
            C7939f c7939f = new C7939f(bufferedInputStream);
            int i12 = this.f38200d;
            if (i12 == 12) {
                m15074e(c7939f);
            } else if (i12 == 7) {
                m15077h(c7939f);
            } else if (i12 == 10) {
                m15081l(c7939f);
            } else {
                m15080k(c7939f);
            }
            c7939f.m15068j(this.f38205i);
            m15090v(c7939f);
        }
        m15070a();
        if (!z6) {
            return;
        }
        m15086q();
    }

    /* renamed from: r */
    public static ByteOrder m15069r(C7935b c7935b) throws IOException {
        short s5 = c7935b.readShort();
        if (s5 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s5 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s5));
    }

    /* renamed from: a */
    public final void m15070a() {
        String strM15071b = m15071b("DateTimeOriginal");
        HashMap[] mapArr = this.f38201e;
        if (strM15071b != null && m15071b("DateTime") == null) {
            mapArr[0].put("DateTime", C7936c.m15060a(strM15071b));
        }
        if (m15071b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C7936c.m15061b(0L, this.f38203g));
        }
        if (m15071b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C7936c.m15061b(0L, this.f38203g));
        }
        if (m15071b("Orientation") == null) {
            mapArr[0].put("Orientation", C7936c.m15061b(0L, this.f38203g));
        }
        if (m15071b("LightSource") == null) {
            mapArr[1].put("LightSource", C7936c.m15061b(0L, this.f38203g));
        }
    }

    /* renamed from: b */
    public final String m15071b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C7936c c7936cM15073d = m15073d(str);
        if (c7936cM15073d != null) {
            if (!f38178K.contains(str)) {
                return c7936cM15073d.m15066g(this.f38203g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = c7936cM15073d.f38158a;
                if (i10 == 5 || i10 == 10) {
                    C7938e[] c7938eArr = (C7938e[]) c7936cM15073d.m15067h(this.f38203g);
                    if (c7938eArr == null || c7938eArr.length != 3) {
                        Arrays.toString(c7938eArr);
                        return null;
                    }
                    C7938e c7938e = c7938eArr[0];
                    Integer numValueOf = Integer.valueOf((int) (c7938e.f38166a / c7938e.f38167b));
                    C7938e c7938e2 = c7938eArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c7938e2.f38166a / c7938e2.f38167b));
                    C7938e c7938e3 = c7938eArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c7938e3.f38166a / c7938e3.f38167b)));
                }
            } else {
                try {
                    return Double.toString(c7936cM15073d.m15064e(this.f38203g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int m15072c(int i10, String str) {
        C7936c c7936cM15073d = m15073d(str);
        if (c7936cM15073d == null) {
            return i10;
        }
        try {
            return c7936cM15073d.m15065f(this.f38203g);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: d */
    public final C7936c m15073d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f38174G.length; i10++) {
            C7936c c7936c = (C7936c) this.f38201e[i10].get(str);
            if (c7936c != null) {
                return c7936c;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m15074e(C7939f c7939f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC7942i.m15097a(mediaMetadataRetriever, new C7934a(c7939f));
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
                HashMap[] mapArr = this.f38201e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C7936c.m15063d(Integer.parseInt(strExtractMetadata), this.f38203g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C7936c.m15063d(Integer.parseInt(strExtractMetadata2), this.f38203g));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C7936c.m15063d(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f38203g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c7939f.m15068j(i11);
                    byte[] bArr = new byte[6];
                    c7939f.readFully(bArr);
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f38181N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    c7939f.readFully(bArr2);
                    this.f38205i = i13;
                    m15087s(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
    
        r22.f38155c = r21.f38203g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0151, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f2 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15075f(w6.C7935b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C7940g.m15075f(w6.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m15076g(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C7940g.m15076g(java.io.BufferedInputStream):int");
    }

    /* renamed from: h */
    public final void m15077h(C7939f c7939f) throws Throwable {
        int i10;
        int i11;
        m15080k(c7939f);
        HashMap[] mapArr = this.f38201e;
        C7936c c7936c = (C7936c) mapArr[1].get("MakerNote");
        if (c7936c != null) {
            C7939f c7939f2 = new C7939f(c7936c.f38161d);
            c7939f2.f38155c = this.f38203g;
            byte[] bArr = f38190t;
            byte[] bArr2 = new byte[bArr.length];
            c7939f2.readFully(bArr2);
            c7939f2.m15068j(0L);
            byte[] bArr3 = f38191u;
            byte[] bArr4 = new byte[bArr3.length];
            c7939f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c7939f2.m15068j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c7939f2.m15068j(12L);
            }
            m15088t(c7939f2, 6);
            C7936c c7936c2 = (C7936c) mapArr[7].get("PreviewImageStart");
            C7936c c7936c3 = (C7936c) mapArr[7].get("PreviewImageLength");
            if (c7936c2 != null && c7936c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c7936c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c7936c3);
            }
            C7936c c7936c4 = (C7936c) mapArr[8].get("AspectFrame");
            if (c7936c4 != null) {
                int[] iArr = (int[]) c7936c4.m15067h(this.f38203g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                C7936c c7936cM15063d = C7936c.m15063d(i14, this.f38203g);
                C7936c c7936cM15063d2 = C7936c.m15063d(i15, this.f38203g);
                mapArr[0].put("ImageWidth", c7936cM15063d);
                mapArr[0].put("ImageLength", c7936cM15063d2);
            }
        }
    }

    /* renamed from: i */
    public final void m15078i(C7935b c7935b) throws Throwable {
        if (f38183m) {
            Objects.toString(c7935b);
        }
        c7935b.f38155c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f38192v;
        c7935b.m15059h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = c7935b.readInt();
                byte[] bArr2 = new byte[4];
                c7935b.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f38194x)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f38195y)) {
                    return;
                }
                if (Arrays.equals(bArr2, f38193w)) {
                    byte[] bArr3 = new byte[i10];
                    c7935b.readFully(bArr3);
                    int i12 = c7935b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f38205i = i11;
                        m15087s(0, bArr3);
                        m15093y();
                        m15090v(new C7935b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                c7935b.m15059h(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    public final void m15079j(C7935b c7935b) throws Throwable {
        if (f38183m) {
            Objects.toString(c7935b);
        }
        c7935b.m15059h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c7935b.readFully(bArr);
        c7935b.readFully(bArr2);
        c7935b.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        c7935b.m15059h(i10 - c7935b.f38154b);
        c7935b.readFully(bArr4);
        m15075f(new C7935b(bArr4), i10, 5);
        c7935b.m15059h(i12 - c7935b.f38154b);
        c7935b.f38155c = ByteOrder.BIG_ENDIAN;
        int i13 = c7935b.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = c7935b.readUnsignedShort();
            int unsignedShort2 = c7935b.readUnsignedShort();
            if (unsignedShort == f38173F.f38162a) {
                short s5 = c7935b.readShort();
                short s10 = c7935b.readShort();
                C7936c c7936cM15063d = C7936c.m15063d(s5, this.f38203g);
                C7936c c7936cM15063d2 = C7936c.m15063d(s10, this.f38203g);
                HashMap[] mapArr = this.f38201e;
                mapArr[0].put("ImageLength", c7936cM15063d);
                mapArr[0].put("ImageWidth", c7936cM15063d2);
                return;
            }
            c7935b.m15059h(unsignedShort2);
        }
    }

    /* renamed from: k */
    public final void m15080k(C7939f c7939f) throws Throwable {
        m15085p(c7939f);
        m15088t(c7939f, 0);
        m15092x(c7939f, 0);
        m15092x(c7939f, 5);
        m15092x(c7939f, 4);
        m15093y();
        if (this.f38200d == 8) {
            HashMap[] mapArr = this.f38201e;
            C7936c c7936c = (C7936c) mapArr[1].get("MakerNote");
            if (c7936c != null) {
                C7939f c7939f2 = new C7939f(c7936c.f38161d);
                c7939f2.f38155c = this.f38203g;
                c7939f2.m15059h(6);
                m15088t(c7939f2, 9);
                C7936c c7936c2 = (C7936c) mapArr[9].get("ColorSpace");
                if (c7936c2 != null) {
                    mapArr[1].put("ColorSpace", c7936c2);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m15081l(C7939f c7939f) throws Throwable {
        if (f38183m) {
            Objects.toString(c7939f);
        }
        m15080k(c7939f);
        HashMap[] mapArr = this.f38201e;
        C7936c c7936c = (C7936c) mapArr[0].get("JpgFromRaw");
        if (c7936c != null) {
            m15075f(new C7935b(c7936c.f38161d), (int) c7936c.f38160c, 5);
        }
        C7936c c7936c2 = (C7936c) mapArr[0].get("ISO");
        C7936c c7936c3 = (C7936c) mapArr[1].get("PhotographicSensitivity");
        if (c7936c2 == null || c7936c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c7936c2);
    }

    /* renamed from: m */
    public final void m15082m(C7935b c7935b) throws Throwable {
        if (f38183m) {
            Objects.toString(c7935b);
        }
        c7935b.f38155c = ByteOrder.LITTLE_ENDIAN;
        c7935b.m15059h(f38196z.length);
        int i10 = c7935b.readInt() + 8;
        byte[] bArr = f38168A;
        c7935b.m15059h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c7935b.readFully(bArr2);
                int i11 = c7935b.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f38169B, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    c7935b.readFully(bArr3);
                    this.f38205i = i12;
                    m15087s(0, bArr3);
                    m15090v(new C7935b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c7935b.m15059h(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: n */
    public final void m15083n(C7935b c7935b, HashMap map) throws Throwable {
        C7936c c7936c = (C7936c) map.get("JPEGInterchangeFormat");
        C7936c c7936c2 = (C7936c) map.get("JPEGInterchangeFormatLength");
        if (c7936c == null || c7936c2 == null) {
            return;
        }
        int iM15065f = c7936c.m15065f(this.f38203g);
        int iM15065f2 = c7936c2.m15065f(this.f38203g);
        if (this.f38200d == 7) {
            iM15065f += this.f38206j;
        }
        if (iM15065f > 0 && iM15065f2 > 0 && this.f38197a == null && this.f38199c == null && this.f38198b == null) {
            c7935b.m15059h(iM15065f);
            c7935b.readFully(new byte[iM15065f2]);
        }
    }

    /* renamed from: o */
    public final boolean m15084o(HashMap map) {
        C7936c c7936c = (C7936c) map.get("ImageLength");
        C7936c c7936c2 = (C7936c) map.get("ImageWidth");
        if (c7936c == null || c7936c2 == null) {
            return false;
        }
        return c7936c.m15065f(this.f38203g) <= 512 && c7936c2.m15065f(this.f38203g) <= 512;
    }

    /* renamed from: p */
    public final void m15085p(C7939f c7939f) throws IOException {
        ByteOrder byteOrderM15069r = m15069r(c7939f);
        this.f38203g = byteOrderM15069r;
        c7939f.f38155c = byteOrderM15069r;
        int unsignedShort = c7939f.readUnsignedShort();
        int i10 = this.f38200d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = c7939f.readInt();
        if (i11 < 8) {
            throw new IOException(AbstractC4801l.m9730d(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            c7939f.m15059h(i12);
        }
    }

    /* renamed from: q */
    public final void m15086q() throws Throwable {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f38201e;
            if (i10 >= mapArr.length) {
                return;
            }
            mapArr[i10].size();
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                C7936c c7936c = (C7936c) entry.getValue();
                c7936c.toString();
                c7936c.m15066g(this.f38203g);
            }
            i10++;
        }
    }

    /* renamed from: s */
    public final void m15087s(int i10, byte[] bArr) throws IOException {
        C7939f c7939f = new C7939f(bArr);
        m15085p(c7939f);
        m15088t(c7939f, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15088t(w6.C7939f r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C7940g.m15088t(w6.f, int):void");
    }

    /* renamed from: u */
    public final void m15089u(int i10, String str, String str2) {
        HashMap[] mapArr = this.f38201e;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    /* renamed from: v */
    public final void m15090v(C7935b c7935b) throws Throwable {
        C7936c c7936c;
        HashMap map = this.f38201e[4];
        C7936c c7936c2 = (C7936c) map.get("Compression");
        if (c7936c2 == null) {
            m15083n(c7935b, map);
            return;
        }
        int iM15065f = c7936c2.m15065f(this.f38203g);
        if (iM15065f != 1) {
            if (iM15065f == 6) {
                m15083n(c7935b, map);
                return;
            } else if (iM15065f != 7) {
                return;
            }
        }
        C7936c c7936c3 = (C7936c) map.get("BitsPerSample");
        if (c7936c3 != null) {
            int[] iArr = (int[]) c7936c3.m15067h(this.f38203g);
            int[] iArr2 = f38184n;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f38200d != 3 || (c7936c = (C7936c) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM15065f2 = c7936c.m15065f(this.f38203g);
                if ((iM15065f2 != 1 || !Arrays.equals(iArr, f38185o)) && (iM15065f2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C7936c c7936c4 = (C7936c) map.get("StripOffsets");
            C7936c c7936c5 = (C7936c) map.get("StripByteCounts");
            if (c7936c4 == null || c7936c5 == null) {
                return;
            }
            long[] jArrM11856a = s6.m11856a(c7936c4.m15067h(this.f38203g));
            long[] jArrM11856a2 = s6.m11856a(c7936c5.m15067h(this.f38203g));
            if (jArrM11856a == null || jArrM11856a.length == 0 || jArrM11856a2 == null || jArrM11856a2.length == 0 || jArrM11856a.length != jArrM11856a2.length) {
                return;
            }
            long j6 = 0;
            for (long j10 : jArrM11856a2) {
                j6 += j10;
            }
            byte[] bArr = new byte[(int) j6];
            this.f38204h = true;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < jArrM11856a.length; i12++) {
                int i13 = (int) jArrM11856a[i12];
                int i14 = (int) jArrM11856a2[i12];
                if (i12 < jArrM11856a.length - 1 && i13 + i14 != jArrM11856a[i12 + 1]) {
                    this.f38204h = false;
                }
                int i15 = i13 - i10;
                if (i15 < 0) {
                    return;
                }
                try {
                    c7935b.m15059h(i15);
                    int i16 = i10 + i15;
                    byte[] bArr2 = new byte[i14];
                    c7935b.readFully(bArr2);
                    i10 = i16 + i14;
                    System.arraycopy(bArr2, 0, bArr, i11, i14);
                    i11 += i14;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.f38204h) {
                long j11 = jArrM11856a[0];
            }
        }
    }

    /* renamed from: w */
    public final void m15091w(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f38201e;
        if (mapArr[i10].isEmpty() || mapArr[i11].isEmpty()) {
            return;
        }
        C7936c c7936c = (C7936c) mapArr[i10].get("ImageLength");
        C7936c c7936c2 = (C7936c) mapArr[i10].get("ImageWidth");
        C7936c c7936c3 = (C7936c) mapArr[i11].get("ImageLength");
        C7936c c7936c4 = (C7936c) mapArr[i11].get("ImageWidth");
        if (c7936c == null || c7936c2 == null || c7936c3 == null || c7936c4 == null) {
            return;
        }
        int iM15065f = c7936c.m15065f(this.f38203g);
        int iM15065f2 = c7936c2.m15065f(this.f38203g);
        int iM15065f3 = c7936c3.m15065f(this.f38203g);
        int iM15065f4 = c7936c4.m15065f(this.f38203g);
        if (iM15065f >= iM15065f3 || iM15065f2 >= iM15065f4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    /* renamed from: x */
    public final void m15092x(C7939f c7939f, int i10) throws Throwable {
        C7936c c7936cM15063d;
        C7936c c7936cM15063d2;
        HashMap[] mapArr = this.f38201e;
        C7936c c7936c = (C7936c) mapArr[i10].get("DefaultCropSize");
        C7936c c7936c2 = (C7936c) mapArr[i10].get("SensorTopBorder");
        C7936c c7936c3 = (C7936c) mapArr[i10].get("SensorLeftBorder");
        C7936c c7936c4 = (C7936c) mapArr[i10].get("SensorBottomBorder");
        C7936c c7936c5 = (C7936c) mapArr[i10].get("SensorRightBorder");
        if (c7936c != null) {
            if (c7936c.f38158a == 5) {
                C7938e[] c7938eArr = (C7938e[]) c7936c.m15067h(this.f38203g);
                if (c7938eArr == null || c7938eArr.length != 2) {
                    Arrays.toString(c7938eArr);
                    return;
                }
                c7936cM15063d = C7936c.m15062c(new C7938e[]{c7938eArr[0]}, this.f38203g);
                c7936cM15063d2 = C7936c.m15062c(new C7938e[]{c7938eArr[1]}, this.f38203g);
            } else {
                int[] iArr = (int[]) c7936c.m15067h(this.f38203g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c7936cM15063d = C7936c.m15063d(iArr[0], this.f38203g);
                    c7936cM15063d2 = C7936c.m15063d(iArr[1], this.f38203g);
                }
            }
            mapArr[i10].put("ImageWidth", c7936cM15063d);
            mapArr[i10].put("ImageLength", c7936cM15063d2);
            return;
        }
        if (c7936c2 != null && c7936c3 != null && c7936c4 != null && c7936c5 != null) {
            int iM15065f = c7936c2.m15065f(this.f38203g);
            int iM15065f2 = c7936c4.m15065f(this.f38203g);
            int iM15065f3 = c7936c5.m15065f(this.f38203g);
            int iM15065f4 = c7936c3.m15065f(this.f38203g);
            if (iM15065f2 <= iM15065f || iM15065f3 <= iM15065f4) {
                return;
            }
            C7936c c7936cM15063d3 = C7936c.m15063d(iM15065f2 - iM15065f, this.f38203g);
            C7936c c7936cM15063d4 = C7936c.m15063d(iM15065f3 - iM15065f4, this.f38203g);
            mapArr[i10].put("ImageLength", c7936cM15063d3);
            mapArr[i10].put("ImageWidth", c7936cM15063d4);
            return;
        }
        C7936c c7936c6 = (C7936c) mapArr[i10].get("ImageLength");
        C7936c c7936c7 = (C7936c) mapArr[i10].get("ImageWidth");
        if (c7936c6 == null || c7936c7 == null) {
            C7936c c7936c8 = (C7936c) mapArr[i10].get("JPEGInterchangeFormat");
            C7936c c7936c9 = (C7936c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (c7936c8 == null || c7936c9 == null) {
                return;
            }
            int iM15065f5 = c7936c8.m15065f(this.f38203g);
            int iM15065f6 = c7936c8.m15065f(this.f38203g);
            c7939f.m15068j(iM15065f5);
            byte[] bArr = new byte[iM15065f6];
            c7939f.readFully(bArr);
            m15075f(new C7935b(bArr), iM15065f5, i10);
        }
    }

    /* renamed from: y */
    public final void m15093y() throws Throwable {
        m15091w(0, 5);
        m15091w(0, 4);
        m15091w(5, 4);
        HashMap[] mapArr = this.f38201e;
        C7936c c7936c = (C7936c) mapArr[1].get("PixelXDimension");
        C7936c c7936c2 = (C7936c) mapArr[1].get("PixelYDimension");
        if (c7936c != null && c7936c2 != null) {
            mapArr[0].put("ImageWidth", c7936c);
            mapArr[0].put("ImageLength", c7936c2);
        }
        if (mapArr[4].isEmpty() && m15084o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m15084o(mapArr[4]);
        m15089u(0, "ThumbnailOrientation", "Orientation");
        m15089u(0, "ThumbnailImageLength", "ImageLength");
        m15089u(0, "ThumbnailImageWidth", "ImageWidth");
        m15089u(5, "ThumbnailOrientation", "Orientation");
        m15089u(5, "ThumbnailImageLength", "ImageLength");
        m15089u(5, "ThumbnailImageWidth", "ImageWidth");
        m15089u(4, "Orientation", "ThumbnailOrientation");
        m15089u(4, "ImageLength", "ThumbnailImageLength");
        m15089u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
