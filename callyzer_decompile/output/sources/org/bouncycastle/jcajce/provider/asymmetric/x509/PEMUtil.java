package org.bouncycastle.jcajce.provider.asymmetric.x509;

import i0.m0;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes3.dex */
class PEMUtil {
    private final Boundaries[] _supportedBoundaries;

    public static class Boundaries {
        private final String _footer;
        private final String _header;

        private Boundaries(String str) {
            this._header = AbstractC5601a.m11238i("-----BEGIN ", str, "-----");
            this._footer = AbstractC5601a.m11238i("-----END ", str, "-----");
        }

        public boolean isTheExpectedFooter(String str) {
            return str.startsWith(this._footer);
        }

        public boolean isTheExpectedHeader(String str) {
            return str.startsWith(this._header);
        }
    }

    public PEMUtil(String str) {
        this._supportedBoundaries = new Boundaries[]{new Boundaries(str), new Boundaries(m0.m7378k("X509 ", str)), new Boundaries("PKCS7")};
    }

    private Boundaries getBoundaries(String str) {
        Boundaries boundaries;
        int i10 = 0;
        while (true) {
            Boundaries[] boundariesArr = this._supportedBoundaries;
            if (i10 == boundariesArr.length) {
                return null;
            }
            boundaries = boundariesArr[i10];
            if (boundaries.isTheExpectedHeader(str) || boundaries.isTheExpectedFooter(str)) {
                break;
            }
            i10++;
        }
        return boundaries;
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i10;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i10 = inputStream.read();
            if (i10 != 13 && i10 != 10 && i10 >= 0) {
                stringBuffer.append((char) i10);
            } else if (i10 < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i10 < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i10 == 13) {
            inputStream.mark(1);
            int i11 = inputStream.read();
            if (i11 == 10) {
                inputStream.mark(1);
            }
            if (i11 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public ASN1Sequence readPEMObject(InputStream inputStream, boolean z6) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String line = readLine(inputStream);
            if (line == null) {
                break;
            }
            boundaries = getBoundaries(line);
            if (boundaries != null && !boundaries.isTheExpectedHeader(line)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (boundaries == null) {
            if (z6) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        Boundaries boundaries2 = null;
        while (boundaries2 == null) {
            String line2 = readLine(inputStream);
            if (line2 == null) {
                break;
            }
            boundaries2 = getBoundaries(line2);
            if (boundaries2 == null) {
                stringBuffer.append(line2);
            } else if (!boundaries.isTheExpectedFooter(line2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (boundaries2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
