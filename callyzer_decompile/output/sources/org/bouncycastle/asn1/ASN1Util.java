package org.bouncycastle.asn1;

import a2.AbstractC0030c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public abstract class ASN1Util {
    public static ASN1TaggedObject checkTag(ASN1TaggedObject aSN1TaggedObject, int i10, int i11) {
        if (aSN1TaggedObject.hasTag(i10, i11)) {
            return aSN1TaggedObject;
        }
        throw new IllegalStateException(AbstractC0030c.m121l("Expected ", getTagText(i10, i11), " tag but found ", getTagText(aSN1TaggedObject)));
    }

    public static ASN1Primitive getBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, boolean z6, int i12) {
        return checkTag(aSN1TaggedObject, i10, i11).getBaseUniversal(z6, i12);
    }

    public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i10, boolean z6, int i11) {
        return getBaseUniversal(aSN1TaggedObject, 128, i10, z6, i11);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i10, int i11) {
        return checkTag(aSN1TaggedObject, i10, i11).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11) {
        return checkTag(aSN1TaggedObject, i10, i11).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i10) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i10);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i10);
    }

    public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, int i12, int i13) {
        return checkTag(aSN1TaggedObject, i10, i11).getImplicitBaseTagged(i12, i13);
    }

    public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, int i12) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i10, i11, i12);
    }

    public static String getTagText(int i10, int i11) {
        return AbstractC5601a.m11232c(i11, i10 != 64 ? i10 != 128 ? i10 != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", "]");
    }

    public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, boolean z6, int i12) {
        return checkTag(aSN1TaggedObjectParser, i10, i11).parseBaseUniversal(z6, i12);
    }

    public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, boolean z6, int i11) {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i10, z6, i11);
    }

    public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11) {
        return checkTag(aSN1TaggedObjectParser, i10, i11).parseExplicitBaseObject();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11) {
        return checkTag(aSN1TaggedObjectParser, i10, i11).parseExplicitBaseTagged();
    }

    public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10) {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i10);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10) {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i10);
    }

    public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, int i12, int i13) {
        return checkTag(aSN1TaggedObjectParser, i10, i11).parseImplicitBaseTagged(i12, i13);
    }

    public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, int i12) {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i10, i11, i12);
    }

    public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, boolean z6, int i12) {
        if (aSN1TaggedObject.hasTag(i10, i11)) {
            return aSN1TaggedObject.getBaseUniversal(z6, i12);
        }
        return null;
    }

    public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i10, boolean z6, int i11) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i10, z6, i11);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i10, int i11) {
        if (aSN1TaggedObject.hasTag(i10, i11)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11) {
        if (aSN1TaggedObject.hasTag(i10, i11)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i10) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i10);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i10);
    }

    public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, int i12, int i13) {
        if (aSN1TaggedObject.hasTag(i10, i11)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i12, i13);
        }
        return null;
    }

    public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i10, int i11, int i12) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i10, i11, i12);
    }

    public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, boolean z6, int i12) {
        if (aSN1TaggedObjectParser.hasTag(i10, i11)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z6, i12);
        }
        return null;
    }

    public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, boolean z6, int i11) {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i10, z6, i11);
    }

    public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11) {
        if (aSN1TaggedObjectParser.hasTag(i10, i11)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11) {
        if (aSN1TaggedObjectParser.hasTag(i10, i11)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10) {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i10);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10) {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i10);
    }

    public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, int i12, int i13) {
        if (aSN1TaggedObjectParser.hasTag(i10, i11)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i12, i13);
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11, int i12) {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i10, i11, i12);
    }

    public static String getTagText(ASN1Tag aSN1Tag) {
        return getTagText(aSN1Tag.getTagClass(), aSN1Tag.getTagNumber());
    }

    public static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i10, int i11) {
        if (aSN1TaggedObjectParser.hasTag(i10, i11)) {
            return aSN1TaggedObjectParser;
        }
        throw new IllegalStateException(AbstractC0030c.m121l("Expected ", getTagText(i10, i11), " tag but found ", getTagText(aSN1TaggedObjectParser)));
    }

    public static String getTagText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static String getTagText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }
}
