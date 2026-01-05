package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;

/* loaded from: classes3.dex */
public class X509ExtensionsGenerator {
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z6, ASN1Encodable aSN1Encodable) {
        try {
            addExtension(aSN1ObjectIdentifier, z6, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        } catch (IOException e2) {
            throw new IllegalArgumentException(AbstractC4801l.m9733g("error encoding value: ", e2));
        }
    }

    public X509Extensions generate() {
        return new X509Extensions(this.extOrdering, this.extensions);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z6, byte[] bArr) {
        if (this.extensions.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(AbstractC4801l.m9735i("extension ", aSN1ObjectIdentifier, " already added"));
        }
        this.extOrdering.addElement(aSN1ObjectIdentifier);
        this.extensions.put(aSN1ObjectIdentifier, new X509Extension(z6, new DEROctetString(bArr)));
    }
}
