package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes3.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean _constructed;

    public DLTaggedObjectParser(int i10, int i11, boolean z6, ASN1StreamParser aSN1StreamParser) {
        super(i10, i11, aSN1StreamParser);
        this._constructed = z6;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z6, int i10) throws IOException {
        if (!z6) {
            return this._constructed ? this._parser.parseImplicitConstructedDL(i10) : this._parser.parseImplicitPrimitive(i10);
        }
        if (this._constructed) {
            return this._parser.parseObject(i10);
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        if (this._constructed) {
            return this._parser.readObject();
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        if (this._constructed) {
            return this._parser.parseTaggedObject();
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i10, int i11) {
        return new DLTaggedObjectParser(i10, i11, this._constructed, this._parser);
    }
}
