package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class ASN1UTCTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UTCTime.class, 23) { // from class: org.bouncycastle.asn1.ASN1UTCTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UTCTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1UTCTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e2) {
            throw new IllegalArgumentException("invalid date string: " + e2.getMessage());
        }
    }

    public static ASN1UTCTime createPrimitive(byte[] bArr) {
        return new ASN1UTCTime(bArr);
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UTCTime) {
                return (ASN1UTCTime) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(AbstractC5601a.m11234e(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1UTCTime) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e2) {
            throw new IllegalArgumentException(AbstractC4801l.m9732f(e2, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    private boolean isDigit(int i10) {
        byte b10;
        byte[] bArr = this.contents;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.contents, ((ASN1UTCTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z6) {
        aSN1OutputStream.writeEncodingDL(z6, 23, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z6) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, this.contents.length);
    }

    public Date getAdjustedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        return (time.charAt(0) < '5' ? "20" : "19").concat(time);
    }

    public Date getDate() {
        return new SimpleDateFormat("yyMMddHHmmssz", LocaleUtil.EN_Locale).parse(getTime());
    }

    public String getTime() {
        StringBuilder sb2;
        String strSubstring;
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.indexOf(45) >= 0 || strFromByteArray.indexOf(43) >= 0) {
            int iIndexOf = strFromByteArray.indexOf(45);
            if (iIndexOf < 0) {
                iIndexOf = strFromByteArray.indexOf(43);
            }
            if (iIndexOf == strFromByteArray.length() - 3) {
                strFromByteArray = strFromByteArray.concat("00");
            }
            if (iIndexOf == 10) {
                sb2 = new StringBuilder();
                sb2.append(strFromByteArray.substring(0, 10));
                sb2.append("00GMT");
                sb2.append(strFromByteArray.substring(10, 13));
                sb2.append(":");
                strSubstring = strFromByteArray.substring(13, 15);
            } else {
                sb2 = new StringBuilder();
                sb2.append(strFromByteArray.substring(0, 12));
                sb2.append("GMT");
                sb2.append(strFromByteArray.substring(12, 15));
                sb2.append(":");
                strSubstring = strFromByteArray.substring(15, 17);
            }
        } else if (strFromByteArray.length() == 11) {
            sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, 10));
            strSubstring = "00GMT+00:00";
        } else {
            sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, 12));
            strSubstring = "GMT+00:00";
        }
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return Strings.fromByteArray(this.contents);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.contents = bArr;
        if (!isDigit(0) || !isDigit(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z6) {
        return (ASN1UTCTime) TYPE.getContextInstance(aSN1TaggedObject, z6);
    }
}
