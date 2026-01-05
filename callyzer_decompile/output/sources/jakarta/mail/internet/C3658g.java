package jakarta.mail.internet;

import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import i0.m0;
import jakarta.mail.MessagingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.g */
/* loaded from: classes3.dex */
public final class C3658g {

    /* renamed from: b */
    public static final boolean f19357b = PropUtil.getBooleanSystemProperty("mail.mime.ignorewhitespacelines", false);

    /* renamed from: a */
    public final ArrayList f19358a;

    public C3658g() {
        ArrayList arrayList = new ArrayList(40);
        this.f19358a = arrayList;
        arrayList.add(new C3656e("Return-Path", null));
        arrayList.add(new C3656e("Received", null));
        arrayList.add(new C3656e("Resent-Date", null));
        arrayList.add(new C3656e("Resent-From", null));
        arrayList.add(new C3656e("Resent-Sender", null));
        arrayList.add(new C3656e("Resent-To", null));
        arrayList.add(new C3656e("Resent-Cc", null));
        arrayList.add(new C3656e("Resent-Bcc", null));
        arrayList.add(new C3656e("Resent-Message-Id", null));
        arrayList.add(new C3656e("Date", null));
        arrayList.add(new C3656e("From", null));
        arrayList.add(new C3656e("Sender", null));
        arrayList.add(new C3656e("Reply-To", null));
        arrayList.add(new C3656e("To", null));
        arrayList.add(new C3656e("Cc", null));
        arrayList.add(new C3656e("Bcc", null));
        arrayList.add(new C3656e("Message-Id", null));
        arrayList.add(new C3656e("In-Reply-To", null));
        arrayList.add(new C3656e("References", null));
        arrayList.add(new C3656e("Subject", null));
        arrayList.add(new C3656e("Comments", null));
        arrayList.add(new C3656e("Keywords", null));
        arrayList.add(new C3656e("Errors-To", null));
        arrayList.add(new C3656e("MIME-Version", null));
        arrayList.add(new C3656e(ObjectMetadata.CONTENT_TYPE, null));
        arrayList.add(new C3656e("Content-Transfer-Encoding", null));
        arrayList.add(new C3656e(ObjectMetadata.CONTENT_MD5, null));
        arrayList.add(new C3656e(":", null));
        arrayList.add(new C3656e("Content-Length", null));
        arrayList.add(new C3656e("Status", null));
    }

    /* renamed from: a */
    public final void m8215a(String str, String str2) {
        ArrayList arrayList = this.f19358a;
        int size = arrayList.size();
        boolean z6 = str.equalsIgnoreCase("Received") || str.equalsIgnoreCase("Return-Path");
        if (z6) {
            size = 0;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C3656e c3656e = (C3656e) arrayList.get(size2);
            if (str.equalsIgnoreCase(c3656e.f19405a)) {
                if (!z6) {
                    arrayList.add(size2 + 1, new C3656e(str, str2));
                    return;
                }
                size = size2;
            }
            if (!z6 && c3656e.f19405a.equals(":")) {
                size = size2;
            }
        }
        arrayList.add(size, new C3656e(str, str2));
    }

    /* renamed from: b */
    public final void m8216b(String str) {
        try {
            char cCharAt = str.charAt(0);
            ArrayList arrayList = this.f19358a;
            if (cCharAt != ' ' && cCharAt != '\t') {
                arrayList.add(new C3656e(str));
                return;
            }
            ((C3656e) arrayList.get(arrayList.size() - 1)).f19350c += "\r\n" + str;
        } catch (StringIndexOutOfBoundsException | NoSuchElementException unused) {
        }
    }

    /* renamed from: c */
    public final String m8217c(String str, String str2) {
        String[] strArrM8218d = m8218d(str);
        if (strArrM8218d == null) {
            return null;
        }
        if (strArrM8218d.length == 1 || str2 == null) {
            return strArrM8218d[0];
        }
        StringBuilder sb2 = new StringBuilder(strArrM8218d[0]);
        for (int i10 = 1; i10 < strArrM8218d.length; i10++) {
            sb2.append(str2);
            sb2.append(strArrM8218d[i10]);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public final String[] m8218d(String str) {
        Iterator it = this.f19358a.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            C3656e c3656e = (C3656e) it.next();
            if (str.equalsIgnoreCase(c3656e.f19405a) && c3656e.f19350c != null) {
                arrayList.add(c3656e.mo8212a());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public final C3657f m8219e(String[] strArr) {
        return new C3657f(this.f19358a, strArr, false, true, 1);
    }

    /* renamed from: f */
    public final void m8220f(InputStream inputStream, boolean z6) throws MessagingException {
        LineInputStream lineInputStream = new LineInputStream(inputStream, z6);
        StringBuilder sb2 = new StringBuilder();
        String str = null;
        boolean z10 = true;
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null || !(line.startsWith(" ") || line.startsWith("\t"))) {
                    if (str != null) {
                        m8216b(str);
                    } else if (sb2.length() > 0) {
                        m8216b(sb2.toString());
                        sb2.setLength(0);
                    }
                    str = line;
                } else {
                    if (str != null) {
                        sb2.append(str);
                        str = null;
                    }
                    if (z10) {
                        String strTrim = line.trim();
                        if (strTrim.length() > 0) {
                            sb2.append(strTrim);
                        }
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append("\r\n");
                        }
                        sb2.append(line);
                    }
                }
                if (line == null) {
                    return;
                }
                if (line.length() == 0 || (f19357b && line.trim().length() == 0)) {
                    return;
                } else {
                    z10 = false;
                }
            } catch (IOException e2) {
                throw new MessagingException("Error in input stream", e2);
            }
        }
    }

    /* renamed from: g */
    public final void m8221g(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19358a;
            if (i10 >= arrayList.size()) {
                return;
            }
            C3656e c3656e = (C3656e) arrayList.get(i10);
            if (str.equalsIgnoreCase(c3656e.f19405a)) {
                c3656e.f19350c = null;
            }
            i10++;
        }
    }

    /* renamed from: h */
    public final void m8222h(String str, String str2) {
        int iIndexOf;
        int i10 = 0;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f19358a;
            if (i10 >= arrayList.size()) {
                break;
            }
            C3656e c3656e = (C3656e) arrayList.get(i10);
            if (str.equalsIgnoreCase(c3656e.f19405a)) {
                if (z6) {
                    arrayList.remove(i10);
                    i10--;
                } else {
                    String str3 = c3656e.f19350c;
                    if (str3 == null || (iIndexOf = str3.indexOf(58)) < 0) {
                        c3656e.f19350c = m0.m7379l(str, ": ", str2);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c3656e.f19350c.substring(0, iIndexOf + 1));
                        c3656e.f19350c = AbstractC1452a.m4564k(sb2, " ", str2);
                    }
                    z6 = true;
                }
            }
            i10++;
        }
        if (z6) {
            return;
        }
        m8215a(str, str2);
    }

    public C3658g(InputStream inputStream, boolean z6) throws MessagingException {
        this.f19358a = new ArrayList(40);
        m8220f(inputStream, z6);
    }
}
