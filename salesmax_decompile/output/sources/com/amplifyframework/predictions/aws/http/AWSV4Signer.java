package com.amplifyframework.predictions.aws.http;

import android.net.Uri;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import j$.util.DesugarTimeZone;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p001o.ch3;
import p001o.e9g;
import p001o.f9g;
import p001o.gh3;
import p001o.hwc;
import p001o.ic4;
import p001o.id5;
import p001o.isa;
import p001o.kh3;
import p001o.sq8;
import p001o.vyh;
import p001o.wzh;
import p001o.zq1;

/* loaded from: classes5.dex */
public final class AWSV4Signer {
    private static final String ALGORITHM_AWS4_HMAC_SHA_256 = "AWS4-HMAC-SHA256";
    private static final String ALGORITHM_AWS4_HMAC_SHA_256_PAYLOAD = "AWS4-HMAC-SHA256-PAYLOAD";
    private static final String AWS4_REQUEST_TYPE = "aws4_request";
    private static final String DATE_PATTERN = "yyyyMMdd";
    private static final Logger LOG;
    private static final String METHOD = "GET";
    private static final String NEW_LINE_DELIMITER = "\n";
    private static final String SERVICE = "rekognition";
    private static final String SIGNED_HEADERS = "host";
    private static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    private static final String X_AMZ_ALGORITHM = "X-Amz-Algorithm";
    private static final String X_AMZ_CREDENTIAL = "X-Amz-Credential";
    private static final String X_AMZ_DATE = "X-Amz-Date";
    private static final String X_AMZ_EXPIRES = "X-Amz-Expires";
    private static final String X_AMZ_SECURITY_TOKEN = "X-Amz-Security-Token";
    private static final String X_AMZ_SIGNATURE = "X-Amz-Signature";
    private static final String X_AMZ_SIGNED_HEADERS = "X-Amz-SignedHeaders";
    private static final String X_AMZ_USER_AGENT = "x-amz-user-agent";
    private final SimpleDateFormat dateFormatter;
    private final String encodedSpace;
    private String priorSignature = "";
    private final MessageDigest sha256Algorithm;
    private final SimpleDateFormat timeFormatter;
    public static final Companion Companion = new Companion(null);
    private static final TimeZone GMT_TIMEZONE = DesugarTimeZone.getTimeZone("GMT");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.PREDICTIONS, "amplify:aws-predictions");
        sq8.m48648g(logger, "logger(...)");
        LOG = logger;
    }

    public AWSV4Signer() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN, new Locale("en", "US", "POSIX"));
        this.dateFormatter = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", new Locale("en", "US", "POSIX"));
        this.timeFormatter = simpleDateFormat2;
        this.sha256Algorithm = MessageDigest.getInstance("SHA-256");
        String strEncode = Uri.encode(" ");
        sq8.m48648g(strEncode, "encode(...)");
        this.encodedSpace = strEncode;
        TimeZone timeZone = GMT_TIMEZONE;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setTimeZone(timeZone);
        simpleDateFormat2.setLenient(false);
    }

    private final Map<String, String> buildQueryParamsMap(URI uri, String str, String str2, String str3, String str4, String str5, String str6) {
        Map mapM32685l = isa.m32685l(vyh.m53620a(X_AMZ_ALGORITHM, ALGORITHM_AWS4_HMAC_SHA_256), vyh.m53620a(X_AMZ_CREDENTIAL, urlEncode(str + "/" + createCredentialScope(str3, str5))), vyh.m53620a("X-Amz-Date", str4), vyh.m53620a(X_AMZ_EXPIRES, "299"), vyh.m53620a(X_AMZ_SIGNED_HEADERS, SIGNED_HEADERS), vyh.m53620a(X_AMZ_USER_AGENT, e9g.m24593G(urlEncode(str6), "+", this.encodedSpace, false, 4, null)));
        boolean z = true;
        if (!(str2 == null || str2.length() == 0)) {
            mapM32685l.put(X_AMZ_SECURITY_TOKEN, urlEncode(str2));
        }
        String query = uri.getQuery();
        if (query != null && query.length() != 0) {
            z = false;
        }
        if (!z) {
            String query2 = uri.getQuery();
            sq8.m48648g(query2, "getQuery(...)");
            for (String str7 : f9g.D0(query2, new String[]{"&"}, false, 0, 6, null)) {
                int iA0 = f9g.a0(str7, '=', 0, false, 6, null);
                if (iA0 > 0) {
                    String strSubstring = str7.substring(0, iA0);
                    sq8.m48648g(strSubstring, "substring(...)");
                    String strSubstring2 = str7.substring(iA0 + 1);
                    sq8.m48648g(strSubstring2, "substring(...)");
                    mapM32685l.put(strSubstring, urlEncode(strSubstring2));
                }
            }
        }
        return isa.m32693t(mapM32685l);
    }

    private final String convertBytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b);
            if (hexString.length() == 1) {
                sb.append("0");
            } else if (hexString.length() == 8) {
                sq8.m48646e(hexString);
                hexString = hexString.substring(6);
                sq8.m48648g(hexString, "substring(...)");
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault(...)");
        String lowerCase = string.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String createCredentialScope(String str, String str2) {
        return kh3.p0(ch3.m21249n(str2, str, SERVICE, AWS4_REQUEST_TYPE), "/", null, null, 0, null, null, 62, null);
    }

    private final byte[] createSignature(String str, String str2, String str3) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        sq8.m48648g(charsetDefaultCharset, "defaultCharset(...)");
        byte[] bytes = ("AWS4" + str2).getBytes(charsetDefaultCharset);
        sq8.m48648g(bytes, "getBytes(...)");
        return hmacSha256(AWS4_REQUEST_TYPE, hmacSha256(SERVICE, hmacSha256(str, hmacSha256(str3, bytes))));
    }

    private final byte[] encodeDateHeader(hwc hwcVar) {
        int length = ((String) hwcVar.m31229c()).length();
        long time = ((Date) hwcVar.m31230d()).getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8 + 2);
        byteBufferAllocate.put(wzh.m55511c((byte) length));
        byteBufferAllocate.put(zq1.f57497d.m59707c((String) hwcVar.m31229c()).mo38689Q());
        byteBufferAllocate.put((byte) 8);
        byteBufferAllocate.putLong(time);
        Buffer bufferPosition = byteBufferAllocate.position(0);
        sq8.m48647f(bufferPosition, "null cannot be cast to non-null type java.nio.ByteBuffer");
        byte[] bArrArray = ((ByteBuffer) bufferPosition).array();
        sq8.m48648g(bArrArray, "array(...)");
        return bArrArray;
    }

    private final String getCanonicalRequest(URI uri, String str) {
        MessageDigest messageDigest = this.sha256Algorithm;
        Charset charset = StandardCharsets.UTF_8;
        sq8.m48648g(charset, "UTF_8");
        byte[] bytes = "".getBytes(charset);
        sq8.m48648g(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        sq8.m48648g(bArrDigest, "digest(...)");
        String strConvertBytesToHex = convertBytesToHex(bArrDigest);
        return kh3.p0(ch3.m21249n("GET", getCanonicalUri(uri), str, "host:" + uri.getHost() + NEW_LINE_DELIMITER, SIGNED_HEADERS, strConvertBytesToHex), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final String getCanonicalUri(URI uri) {
        String path = uri.getPath();
        return path.length() == 0 ? "/" : path;
    }

    private final String getCanonicalizedQueryString(Map<String, String> map) {
        List listT0 = kh3.T0(map.keySet());
        gh3.m28656y(listT0);
        StringBuilder sb = new StringBuilder();
        int size = listT0.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) listT0.get(i));
            sb.append("=");
            sb.append(map.get(listT0.get(i)));
            if (listT0.size() - 1 > i) {
                sb.append("&");
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    private final String getDateStamp(long j) {
        String str = this.dateFormatter.format(new Date(j));
        sq8.m48648g(str, "format(...)");
        return str;
    }

    public static /* synthetic */ URI getSignedUri$default(AWSV4Signer aWSV4Signer, URI uri, ic4 ic4Var, String str, String str2, long j, int i, Object obj) {
        if ((i & 16) != 0) {
            j = new Date().getTime();
        }
        return aWSV4Signer.getSignedUri(uri, ic4Var, str, str2, j);
    }

    private final String getTimeStamp(long j) {
        String str = this.timeFormatter.format(new Date(j));
        sq8.m48648g(str, "format(...)");
        return str;
    }

    private final byte[] hmacSha256(String str, byte[] bArr) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            Charset charsetDefaultCharset = Charset.defaultCharset();
            sq8.m48648g(charsetDefaultCharset, "defaultCharset(...)");
            byte[] bytes = str.getBytes(charsetDefaultCharset);
            sq8.m48648g(bytes, "getBytes(...)");
            byte[] bArrDoFinal = mac.doFinal(bytes);
            sq8.m48648g(bArrDoFinal, "doFinal(...)");
            return bArrDoFinal;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    private final String signString(String str, String str2, String str3) {
        MessageDigest messageDigest = this.sha256Algorithm;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        sq8.m48648g(charsetDefaultCharset, "defaultCharset(...)");
        byte[] bytes = str3.getBytes(charsetDefaultCharset);
        sq8.m48648g(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        sq8.m48648g(bArrDigest, "digest(...)");
        return kh3.p0(ch3.m21249n(ALGORITHM_AWS4_HMAC_SHA_256, str, str2, convertBytesToHex(bArrDigest)), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final String signStringWithPreviousSignature(String str, String str2, byte[] bArr, hwc hwcVar) {
        byte[] bArrDigest = this.sha256Algorithm.digest(bArr);
        sq8.m48646e(bArrDigest);
        String strConvertBytesToHex = convertBytesToHex(bArrDigest);
        byte[] bArrDigest2 = this.sha256Algorithm.digest(encodeDateHeader(hwcVar));
        sq8.m48646e(bArrDigest2);
        return kh3.p0(ch3.m21249n(ALGORITHM_AWS4_HMAC_SHA_256_PAYLOAD, str, str2, this.priorSignature, convertBytesToHex(bArrDigest2), strConvertBytesToHex), NEW_LINE_DELIMITER, null, null, 0, null, null, 62, null);
    }

    private final String urlEncode(String str) throws UnsupportedEncodingException {
        try {
            String strEncode = URLEncoder.encode(str, Charset.defaultCharset().name());
            sq8.m48648g(strEncode, "encode(...)");
            return strEncode;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public final String getEncodedSpace() {
        return this.encodedSpace;
    }

    public final String getSignedFrame(String str, byte[] bArr, String str2, hwc hwcVar) {
        sq8.m48649h(str, TransferTable.COLUMN_REGION);
        sq8.m48649h(bArr, "frame");
        sq8.m48649h(str2, "secretKey");
        sq8.m48649h(hwcVar, "dateHeader");
        long time = ((Date) hwcVar.m31230d()).getTime();
        String timeStamp = getTimeStamp(time);
        String dateStamp = getDateStamp(time);
        String strConvertBytesToHex = convertBytesToHex(hmacSha256(signStringWithPreviousSignature(timeStamp, createCredentialScope(str, dateStamp), bArr, hwcVar), createSignature(str, str2, dateStamp)));
        this.priorSignature = strConvertBytesToHex;
        return strConvertBytesToHex;
    }

    public final URI getSignedUri(URI uri, ic4 ic4Var, String str, String str2, long j) {
        sq8.m48649h(uri, "uri");
        sq8.m48649h(ic4Var, "credentials");
        sq8.m48649h(str, TransferTable.COLUMN_REGION);
        sq8.m48649h(str2, "userAgent");
        String timeStamp = getTimeStamp(j);
        String dateStamp = getDateStamp(j);
        String sessionToken = ic4Var.getSessionToken();
        if (sessionToken == null) {
            sessionToken = "";
        }
        String canonicalizedQueryString = getCanonicalizedQueryString(buildQueryParamsMap(uri, ic4Var.mo31898d(), sessionToken, str, timeStamp, dateStamp, str2));
        String strConvertBytesToHex = convertBytesToHex(hmacSha256(signString(timeStamp, createCredentialScope(str, dateStamp), getCanonicalRequest(uri, canonicalizedQueryString)), createSignature(str, ic4Var.mo31896a(), dateStamp)));
        if (this.priorSignature.length() == 0) {
            this.priorSignature = strConvertBytesToHex;
        }
        try {
            return new URI(uri.getScheme(), uri.getRawAuthority(), getCanonicalUri(uri), canonicalizedQueryString + "&X-Amz-Signature=" + strConvertBytesToHex, null);
        } catch (URISyntaxException unused) {
            LOG.error("Error creating signed URI.");
            return null;
        }
    }

    public final void resetPriorSignature() {
        this.priorSignature = "";
    }
}
