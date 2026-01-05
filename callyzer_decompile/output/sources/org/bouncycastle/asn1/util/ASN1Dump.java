package org.bouncycastle.asn1.util;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z6, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder sbM11245p;
        int length;
        String strLineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(strLineSeparator);
            return;
        }
        int i10 = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String strM4561h = AbstractC1452a.m4561h(str, TAB);
            int size = aSN1Sequence.size();
            while (i10 < size) {
                _dumpAsString(strM4561h, z6, aSN1Sequence.getObjectAt(i10).toASN1Primitive(), stringBuffer);
                i10++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String strM4561h2 = AbstractC1452a.m4561h(str, TAB);
            int size2 = aSN1Set.size();
            while (i10 < size2) {
                _dumpAsString(strM4561h2, z6, aSN1Set.getObjectAt(i10).toASN1Primitive(), stringBuffer);
                i10++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(strLineSeparator);
            _dumpAsString(str + TAB, z6, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                sbM11245p = AbstractC5601a.m11245p(str, "BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                sbM11245p = AbstractC5601a.m11245p(str, "DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            sbM11245p.append(length);
            sbM11245p.append("] ");
            stringBuffer.append(sbM11245p.toString());
            if (z6) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            StringBuilder sbM11245p2 = AbstractC5601a.m11245p(str, "ObjectIdentifier(");
            sbM11245p2.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
            sbM11245p2.append(")");
            sbM11245p2.append(strLineSeparator);
            stringBuffer.append(sbM11245p2.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            StringBuilder sbM11245p3 = AbstractC5601a.m11245p(str, "RelativeOID(");
            sbM11245p3.append(((ASN1RelativeOID) aSN1Primitive).getId());
            sbM11245p3.append(")");
            sbM11245p3.append(strLineSeparator);
            stringBuffer.append(sbM11245p3.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            StringBuilder sbM11245p4 = AbstractC5601a.m11245p(str, "Boolean(");
            sbM11245p4.append(((ASN1Boolean) aSN1Primitive).isTrue());
            sbM11245p4.append(")");
            sbM11245p4.append(strLineSeparator);
            stringBuffer.append(sbM11245p4.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            StringBuilder sbM11245p5 = AbstractC5601a.m11245p(str, "Integer(");
            sbM11245p5.append(((ASN1Integer) aSN1Primitive).getValue());
            sbM11245p5.append(")");
            sbM11245p5.append(strLineSeparator);
            stringBuffer.append(sbM11245p5.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            int padBits = aSN1BitString.getPadBits();
            StringBuilder sbM11245p6 = AbstractC5601a.m11245p(str, aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[");
            sbM11245p6.append(bytes.length);
            sbM11245p6.append(", ");
            sbM11245p6.append(padBits);
            sbM11245p6.append("] ");
            stringBuffer.append(sbM11245p6.toString());
            if (z6) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            StringBuilder sbM11245p7 = AbstractC5601a.m11245p(str, "IA5String(");
            sbM11245p7.append(((ASN1IA5String) aSN1Primitive).getString());
            sbM11245p7.append(") ");
            sbM11245p7.append(strLineSeparator);
            stringBuffer.append(sbM11245p7.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            StringBuilder sbM11245p8 = AbstractC5601a.m11245p(str, "UTF8String(");
            sbM11245p8.append(((ASN1UTF8String) aSN1Primitive).getString());
            sbM11245p8.append(") ");
            sbM11245p8.append(strLineSeparator);
            stringBuffer.append(sbM11245p8.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            StringBuilder sbM11245p9 = AbstractC5601a.m11245p(str, "NumericString(");
            sbM11245p9.append(((ASN1NumericString) aSN1Primitive).getString());
            sbM11245p9.append(") ");
            sbM11245p9.append(strLineSeparator);
            stringBuffer.append(sbM11245p9.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            StringBuilder sbM11245p10 = AbstractC5601a.m11245p(str, "PrintableString(");
            sbM11245p10.append(((ASN1PrintableString) aSN1Primitive).getString());
            sbM11245p10.append(") ");
            sbM11245p10.append(strLineSeparator);
            stringBuffer.append(sbM11245p10.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            StringBuilder sbM11245p11 = AbstractC5601a.m11245p(str, "VisibleString(");
            sbM11245p11.append(((ASN1VisibleString) aSN1Primitive).getString());
            sbM11245p11.append(") ");
            sbM11245p11.append(strLineSeparator);
            stringBuffer.append(sbM11245p11.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            StringBuilder sbM11245p12 = AbstractC5601a.m11245p(str, "BMPString(");
            sbM11245p12.append(((ASN1BMPString) aSN1Primitive).getString());
            sbM11245p12.append(") ");
            sbM11245p12.append(strLineSeparator);
            stringBuffer.append(sbM11245p12.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            StringBuilder sbM11245p13 = AbstractC5601a.m11245p(str, "T61String(");
            sbM11245p13.append(((ASN1T61String) aSN1Primitive).getString());
            sbM11245p13.append(") ");
            sbM11245p13.append(strLineSeparator);
            stringBuffer.append(sbM11245p13.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            StringBuilder sbM11245p14 = AbstractC5601a.m11245p(str, "GraphicString(");
            sbM11245p14.append(((ASN1GraphicString) aSN1Primitive).getString());
            sbM11245p14.append(") ");
            sbM11245p14.append(strLineSeparator);
            stringBuffer.append(sbM11245p14.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            StringBuilder sbM11245p15 = AbstractC5601a.m11245p(str, "VideotexString(");
            sbM11245p15.append(((ASN1VideotexString) aSN1Primitive).getString());
            sbM11245p15.append(") ");
            sbM11245p15.append(strLineSeparator);
            stringBuffer.append(sbM11245p15.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            StringBuilder sbM11245p16 = AbstractC5601a.m11245p(str, "UTCTime(");
            sbM11245p16.append(((ASN1UTCTime) aSN1Primitive).getTime());
            sbM11245p16.append(") ");
            sbM11245p16.append(strLineSeparator);
            stringBuffer.append(sbM11245p16.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            StringBuilder sbM11245p17 = AbstractC5601a.m11245p(str, "GeneralizedTime(");
            sbM11245p17.append(((ASN1GeneralizedTime) aSN1Primitive).getTime());
            sbM11245p17.append(") ");
            sbM11245p17.append(strLineSeparator);
            stringBuffer.append(sbM11245p17.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            StringBuilder sbM11245p18 = AbstractC5601a.m11245p(str, "DER Enumerated(");
            sbM11245p18.append(((ASN1Enumerated) aSN1Primitive).getValue());
            sbM11245p18.append(")");
            sbM11245p18.append(strLineSeparator);
            stringBuffer.append(sbM11245p18.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            StringBuilder sbM11245p19 = AbstractC5601a.m11245p(str, "ObjectDescriptor(");
            sbM11245p19.append(((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
            sbM11245p19.append(") ");
            sbM11245p19.append(strLineSeparator);
            stringBuffer.append(sbM11245p19.toString());
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
            sbM4568o.append(aSN1Primitive.toString());
            sbM4568o.append(strLineSeparator);
            stringBuffer.append(sbM4568o.toString());
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + "External " + strLineSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(TAB);
        String string = sb2.toString();
        if (aSN1External.getDirectReference() != null) {
            StringBuilder sbM11245p20 = AbstractC5601a.m11245p(string, "Direct Reference: ");
            sbM11245p20.append(aSN1External.getDirectReference().getId());
            sbM11245p20.append(strLineSeparator);
            stringBuffer.append(sbM11245p20.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder sbM11245p21 = AbstractC5601a.m11245p(string, "Indirect Reference: ");
            sbM11245p21.append(aSN1External.getIndirectReference().toString());
            sbM11245p21.append(strLineSeparator);
            stringBuffer.append(sbM11245p21.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(string, z6, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        StringBuilder sbM11245p22 = AbstractC5601a.m11245p(string, "Encoding: ");
        sbM11245p22.append(aSN1External.getEncoding());
        sbM11245p22.append(strLineSeparator);
        stringBuffer.append(sbM11245p22.toString());
        _dumpAsString(string, z6, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            byte b10 = bArr[i12];
            if (b10 >= 32 && b10 <= 126) {
                stringBuffer.append((char) b10);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String strCalculateAscString;
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(strLineSeparator);
        for (int i10 = 0; i10 < bArr.length; i10 += 32) {
            int length = bArr.length - i10;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, 32)));
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i10, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, bArr.length - i10)));
                for (int length2 = bArr.length - i10; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i10, bArr.length - i10);
            }
            stringBuffer.append(strCalculateAscString);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z6) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z6, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
