package nw;

import fm.C2327f;
import i0.m0;
import jakarta.activation.MimeTypeParseException;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Hashtable;
import java.util.Locale;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.j */
/* loaded from: classes3.dex */
public final class C5160j implements Externalizable {

    /* renamed from: a */
    public String f25237a;

    /* renamed from: b */
    public String f25238b;

    /* renamed from: c */
    public C2327f f25239c;

    public C5160j(String str) throws MimeTypeParseException {
        m10073b(str);
    }

    /* renamed from: a */
    public static boolean m10072a(String str) {
        int length = str.length();
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > ' ' && cCharAt < 127 && "()<>@,;:/[]?=\\\"".indexOf(cCharAt) < 0) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m10073b(String str) throws MimeTypeParseException {
        int length;
        int i10;
        String strSubstring;
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0 && iIndexOf2 < 0) {
            throw new MimeTypeParseException("Unable to find a sub type.");
        }
        if (iIndexOf < 0 && iIndexOf2 >= 0) {
            throw new MimeTypeParseException("Unable to find a sub type.");
        }
        if (iIndexOf >= 0 && iIndexOf2 < 0) {
            String strTrim = str.substring(0, iIndexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.f25237a = strTrim.toLowerCase(locale);
            this.f25238b = str.substring(iIndexOf + 1).trim().toLowerCase(locale);
            C2327f c2327f = new C2327f(1);
            c2327f.f10557b = new Hashtable();
            this.f25239c = c2327f;
        } else {
            if (iIndexOf >= iIndexOf2) {
                throw new MimeTypeParseException("Unable to find a sub type.");
            }
            String strTrim2 = str.substring(0, iIndexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.f25237a = strTrim2.toLowerCase(locale2);
            this.f25238b = str.substring(iIndexOf + 1, iIndexOf2).trim().toLowerCase(locale2);
            String strSubstring2 = str.substring(iIndexOf2);
            C2327f c2327f2 = new C2327f(1);
            c2327f2.f10557b = new Hashtable();
            if (strSubstring2 != null && (length = strSubstring2.length()) > 0) {
                int iM6018d = C2327f.m6018d(0, strSubstring2);
                while (iM6018d < length && strSubstring2.charAt(iM6018d) == ';') {
                    int iM6018d2 = C2327f.m6018d(iM6018d + 1, strSubstring2);
                    if (iM6018d2 >= length) {
                        break;
                    }
                    int i11 = iM6018d2;
                    while (i11 < length && C2327f.m6017a(strSubstring2.charAt(i11))) {
                        i11++;
                    }
                    String lowerCase = strSubstring2.substring(iM6018d2, i11).toLowerCase(Locale.ENGLISH);
                    int iM6018d3 = C2327f.m6018d(i11, strSubstring2);
                    if (iM6018d3 >= length || strSubstring2.charAt(iM6018d3) != '=') {
                        throw new MimeTypeParseException("Couldn't find the '=' that separates a parameter name from its value.");
                    }
                    int iM6018d4 = C2327f.m6018d(iM6018d3 + 1, strSubstring2);
                    if (iM6018d4 >= length) {
                        throw new MimeTypeParseException(m0.m7378k("Couldn't find a value for parameter named ", lowerCase));
                    }
                    char cCharAt = strSubstring2.charAt(iM6018d4);
                    if (cCharAt == '\"') {
                        int i12 = iM6018d4 + 1;
                        if (i12 >= length) {
                            throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                        }
                        int i13 = i12;
                        while (i13 < length && (cCharAt = strSubstring2.charAt(i13)) != '\"') {
                            if (cCharAt == '\\') {
                                i13++;
                            }
                            i13++;
                        }
                        if (cCharAt != '\"') {
                            throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                        }
                        String strSubstring3 = strSubstring2.substring(i12, i13);
                        int length2 = strSubstring3.length();
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.ensureCapacity(length2);
                        boolean z6 = false;
                        for (int i14 = 0; i14 < length2; i14++) {
                            char cCharAt2 = strSubstring3.charAt(i14);
                            if (!z6 && cCharAt2 != '\\') {
                                stringBuffer.append(cCharAt2);
                            } else if (z6) {
                                stringBuffer.append(cCharAt2);
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                        }
                        strSubstring = stringBuffer.toString();
                        i10 = i13 + 1;
                    } else {
                        if (!C2327f.m6017a(cCharAt)) {
                            throw new MimeTypeParseException(AbstractC4801l.m9730d(iM6018d4, "Unexpected character encountered at index "));
                        }
                        i10 = iM6018d4;
                        while (i10 < length && C2327f.m6017a(strSubstring2.charAt(i10))) {
                            i10++;
                        }
                        strSubstring = strSubstring2.substring(iM6018d4, i10);
                    }
                    c2327f2.f10557b.put(lowerCase, strSubstring);
                    iM6018d = C2327f.m6018d(i10, strSubstring2);
                }
                if (iM6018d < length) {
                    throw new MimeTypeParseException("More characters encountered in input than expected.");
                }
            }
            this.f25239c = c2327f2;
        }
        if (!m10072a(this.f25237a)) {
            throw new MimeTypeParseException("Primary type is invalid.");
        }
        if (!m10072a(this.f25238b)) {
            throw new MimeTypeParseException("Sub type is invalid.");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        try {
            m10073b(objectInput.readUTF());
        } catch (MimeTypeParseException e2) {
            throw new IOException(e2.toString());
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25237a + "/" + this.f25238b);
        sb2.append(this.f25239c.toString());
        return sb2.toString();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }
}
