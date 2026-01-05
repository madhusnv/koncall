package jakarta.mail.internet;

import a1.C0005d;
import com.sun.mail.imap.IMAPMultipartDataSource;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import jakarta.mail.AbstractC3635c;
import jakarta.mail.AbstractC3684p;
import jakarta.mail.InterfaceC3685q;
import jakarta.mail.MessagingException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.o */
/* loaded from: classes3.dex */
public final class C3666o extends AbstractC3684p {

    /* renamed from: d */
    public final InterfaceC5156f f19366d;

    /* renamed from: e */
    public boolean f19367e;

    /* renamed from: f */
    public boolean f19368f;

    /* renamed from: g */
    public String f19369g;

    /* renamed from: h */
    public boolean f19370h;

    /* renamed from: i */
    public boolean f19371i;

    /* renamed from: j */
    public boolean f19372j;

    /* renamed from: k */
    public boolean f19373k;

    public C3666o() {
        this.f19366d = null;
        this.f19367e = true;
        this.f19368f = true;
        this.f19369g = null;
        this.f19370h = true;
        this.f19371i = true;
        this.f19372j = false;
        this.f19373k = false;
        AtomicInteger atomicInteger = AbstractC3677z.f19403a;
        StringBuilder sb2 = new StringBuilder();
        long jHashCode = sb2.hashCode();
        sb2.append("----=_Part_");
        sb2.append(AbstractC3677z.f19403a.getAndIncrement());
        sb2.append("_");
        sb2.append(jHashCode);
        sb2.append('.');
        sb2.append(System.currentTimeMillis());
        String string = sb2.toString();
        C3675x c3675x = new C3675x();
        c3675x.m8263g("boundary", string);
        StringBuilder sbM4568o = AbstractC1452a.m4568o("multipart/mixed");
        sbM4568o.append(c3675x.m8265i(sbM4568o.length() + 14));
        this.f19413b = sbM4568o.toString();
        m8235f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static C3663l m8230c(InputStream inputStream) throws MessagingException {
        C3663l c3663l = new C3663l();
        boolean z6 = inputStream instanceof ByteArrayInputStream;
        InputStream bufferedInputStream = inputStream;
        if (!z6) {
            boolean z10 = inputStream instanceof BufferedInputStream;
            bufferedInputStream = inputStream;
            if (!z10) {
                boolean z11 = inputStream instanceof InterfaceC3676y;
                bufferedInputStream = inputStream;
                if (!z11) {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                }
            }
        }
        c3663l.headers = new C3658g(bufferedInputStream, false);
        if (bufferedInputStream instanceof InterfaceC3676y) {
            InterfaceC3676y interfaceC3676y = (InterfaceC3676y) bufferedInputStream;
            c3663l.contentStream = interfaceC3676y.newStream(interfaceC3676y.getPosition(), -1L);
            return c3663l;
        }
        try {
            c3663l.content = ASCIIUtility.getBytes(bufferedInputStream);
            return c3663l;
        } catch (IOException e2) {
            throw new MessagingException("Error reading input stream", e2);
        }
    }

    @Override // jakarta.mail.AbstractC3684p
    /* renamed from: a */
    public final synchronized void mo8231a(AbstractC3635c abstractC3635c) {
        m8236g();
        super.mo8231a(abstractC3635c);
    }

    @Override // jakarta.mail.AbstractC3684p
    /* renamed from: b */
    public final synchronized void mo8232b(OutputStream outputStream) {
        try {
            m8236g();
            String str = "--" + new C0005d(this.f19413b).m78w("boundary");
            LineOutputStream lineOutputStream = new LineOutputStream(outputStream);
            String str2 = this.f19369g;
            if (str2 != null) {
                byte[] bytes = ASCIIUtility.getBytes(str2);
                lineOutputStream.write(bytes);
                if (bytes.length > 0 && bytes[bytes.length - 1] != 13 && bytes[bytes.length - 1] != 10) {
                    lineOutputStream.writeln();
                }
            }
            if (this.f19412a.size() != 0) {
                for (int i10 = 0; i10 < this.f19412a.size(); i10++) {
                    lineOutputStream.writeln(str);
                    ((C3663l) this.f19412a.elementAt(i10)).writeTo(outputStream);
                    lineOutputStream.writeln();
                }
            } else {
                if (!this.f19373k) {
                    throw new MessagingException("Empty multipart: " + this.f19413b);
                }
                lineOutputStream.writeln(str);
                lineOutputStream.writeln();
            }
            lineOutputStream.writeln(str + "--");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final synchronized AbstractC3635c m8233d(int i10) {
        AbstractC3635c abstractC3635c;
        m8236g();
        synchronized (this) {
            Vector vector = this.f19412a;
            if (vector == null) {
                throw new IndexOutOfBoundsException("No such BodyPart");
            }
            abstractC3635c = (AbstractC3635c) vector.elementAt(i10);
        }
        return abstractC3635c;
        return abstractC3635c;
    }

    /* renamed from: e */
    public final synchronized int m8234e() {
        int size;
        m8236g();
        synchronized (this) {
            Vector vector = this.f19412a;
            size = vector == null ? 0 : vector.size();
        }
        return size;
        return size;
    }

    /* renamed from: f */
    public final void m8235f() {
        this.f19370h = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingendboundary", true);
        this.f19371i = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingboundaryparameter", true);
        this.f19372j = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoreexistingboundaryparameter", false);
        this.f19373k = PropUtil.getBooleanSystemProperty("mail.mime.multipart.allowempty", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01f1, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0294, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0296, code lost:
    
        if (r3 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0298, code lost:
    
        r19 = r6;
        r30 = r7;
        r6 = r24;
        r8 = r3.newStream(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02a2, code lost:
    
        r0 = m8230c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02ab, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ae, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02af, code lost:
    
        r19 = r6;
        r30 = r7;
        r6 = r24;
        r11 = r11 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02b6, code lost:
    
        if (r11 <= 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b8, code lost:
    
        r9.write(r10, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02be, code lost:
    
        if (r32.f19368f != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c0, code lost:
    
        if (r0 <= 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02c2, code lost:
    
        r9.write(r13, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02c6, code lost:
    
        r0 = r9.toByteArray();
        r9 = new jakarta.mail.internet.C3663l();
        r9.headers = r8;
        r9.content = r0;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0395, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[Catch: all -> 0x0027, TryCatch #4 {, blocks: (B:4:0x0005, B:8:0x000b, B:9:0x000e, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:21:0x002d, B:23:0x0031, B:25:0x0036, B:27:0x0041, B:29:0x0049, B:32:0x0051, B:34:0x0055, B:37:0x005a, B:38:0x0061, B:89:0x010e, B:254:0x0395, B:256:0x0399, B:261:0x03a5, B:262:0x03a8, B:263:0x03a9, B:264:0x03b0, B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:125:0x019a, B:128:0x01a2, B:130:0x01ad, B:131:0x01b4, B:144:0x01dd, B:147:0x01e3, B:148:0x01e7, B:201:0x0298, B:203:0x02a6, B:216:0x02d4, B:206:0x02ab, B:207:0x02ae, B:208:0x02af, B:210:0x02b8, B:211:0x02bc, B:214:0x02c2, B:215:0x02c6, B:150:0x01f4, B:151:0x01fb, B:154:0x01ff, B:162:0x021d, B:168:0x022a, B:220:0x0301, B:225:0x0318, B:226:0x031e, B:229:0x0327, B:231:0x032f, B:232:0x0332, B:233:0x0339, B:236:0x033d, B:237:0x034b, B:240:0x0357, B:242:0x035d, B:245:0x0365, B:247:0x036d, B:248:0x0370, B:249:0x0377, B:178:0x0244, B:179:0x024e, B:181:0x0256, B:183:0x025e, B:196:0x0285, B:198:0x0291, B:218:0x02ef, B:157:0x020a, B:136:0x01c7, B:139:0x01ce, B:129:0x01a8, B:252:0x038d, B:253:0x0394, B:124:0x0192, B:259:0x039d, B:260:0x03a4), top: B:280:0x0005, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0100 A[EDGE_INSN: B:291:0x0100->B:84:0x0100 BREAK  A[LOOP:0: B:40:0x0068->B:294:0x0068], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[Catch: all -> 0x008a, IOException -> 0x008d, Merged into TryCatch #7 {all -> 0x008a, IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:125:0x019a, B:128:0x01a2, B:130:0x01ad, B:131:0x01b4, B:144:0x01dd, B:147:0x01e3, B:148:0x01e7, B:201:0x0298, B:203:0x02a6, B:216:0x02d4, B:206:0x02ab, B:207:0x02ae, B:208:0x02af, B:210:0x02b8, B:211:0x02bc, B:214:0x02c2, B:215:0x02c6, B:150:0x01f4, B:151:0x01fb, B:154:0x01ff, B:162:0x021d, B:168:0x022a, B:220:0x0301, B:225:0x0318, B:226:0x031e, B:229:0x0327, B:231:0x032f, B:232:0x0332, B:233:0x0339, B:236:0x033d, B:237:0x034b, B:240:0x0357, B:242:0x035d, B:245:0x0365, B:247:0x036d, B:248:0x0370, B:249:0x0377, B:178:0x0244, B:179:0x024e, B:181:0x0256, B:183:0x025e, B:196:0x0285, B:198:0x0291, B:218:0x02ef, B:157:0x020a, B:136:0x01c7, B:139:0x01ce, B:129:0x01a8, B:252:0x038d, B:253:0x0394, B:124:0x0192, B:259:0x039d, B:260:0x03a4), top: B:285:0x0062, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102 A[Catch: all -> 0x008a, IOException -> 0x008d, Merged into TryCatch #7 {all -> 0x008a, IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:125:0x019a, B:128:0x01a2, B:130:0x01ad, B:131:0x01b4, B:144:0x01dd, B:147:0x01e3, B:148:0x01e7, B:201:0x0298, B:203:0x02a6, B:216:0x02d4, B:206:0x02ab, B:207:0x02ae, B:208:0x02af, B:210:0x02b8, B:211:0x02bc, B:214:0x02c2, B:215:0x02c6, B:150:0x01f4, B:151:0x01fb, B:154:0x01ff, B:162:0x021d, B:168:0x022a, B:220:0x0301, B:225:0x0318, B:226:0x031e, B:229:0x0327, B:231:0x032f, B:232:0x0332, B:233:0x0339, B:236:0x033d, B:237:0x034b, B:240:0x0357, B:242:0x035d, B:245:0x0365, B:247:0x036d, B:248:0x0370, B:249:0x0377, B:178:0x0244, B:179:0x024e, B:181:0x0256, B:183:0x025e, B:196:0x0285, B:198:0x0291, B:218:0x02ef, B:157:0x020a, B:136:0x01c7, B:139:0x01ce, B:129:0x01a8, B:252:0x038d, B:253:0x0394, B:124:0x0192, B:259:0x039d, B:260:0x03a4), top: B:285:0x0062, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a A[Catch: all -> 0x008a, IOException -> 0x008d, Merged into TryCatch #7 {all -> 0x008a, IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:125:0x019a, B:128:0x01a2, B:130:0x01ad, B:131:0x01b4, B:144:0x01dd, B:147:0x01e3, B:148:0x01e7, B:201:0x0298, B:203:0x02a6, B:216:0x02d4, B:206:0x02ab, B:207:0x02ae, B:208:0x02af, B:210:0x02b8, B:211:0x02bc, B:214:0x02c2, B:215:0x02c6, B:150:0x01f4, B:151:0x01fb, B:154:0x01ff, B:162:0x021d, B:168:0x022a, B:220:0x0301, B:225:0x0318, B:226:0x031e, B:229:0x0327, B:231:0x032f, B:232:0x0332, B:233:0x0339, B:236:0x033d, B:237:0x034b, B:240:0x0357, B:242:0x035d, B:245:0x0365, B:247:0x036d, B:248:0x0370, B:249:0x0377, B:178:0x0244, B:179:0x024e, B:181:0x0256, B:183:0x025e, B:196:0x0285, B:198:0x0291, B:218:0x02ef, B:157:0x020a, B:136:0x01c7, B:139:0x01ce, B:129:0x01a8, B:252:0x038d, B:253:0x0394, B:124:0x0192, B:259:0x039d, B:260:0x03a4), top: B:285:0x0062, outer: #4 }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b A[Catch: all -> 0x008a, IOException -> 0x008d, Merged into TryCatch #7 {all -> 0x008a, IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:125:0x019a, B:128:0x01a2, B:130:0x01ad, B:131:0x01b4, B:144:0x01dd, B:147:0x01e3, B:148:0x01e7, B:201:0x0298, B:203:0x02a6, B:216:0x02d4, B:206:0x02ab, B:207:0x02ae, B:208:0x02af, B:210:0x02b8, B:211:0x02bc, B:214:0x02c2, B:215:0x02c6, B:150:0x01f4, B:151:0x01fb, B:154:0x01ff, B:162:0x021d, B:168:0x022a, B:220:0x0301, B:225:0x0318, B:226:0x031e, B:229:0x0327, B:231:0x032f, B:232:0x0332, B:233:0x0339, B:236:0x033d, B:237:0x034b, B:240:0x0357, B:242:0x035d, B:245:0x0365, B:247:0x036d, B:248:0x0370, B:249:0x0377, B:178:0x0244, B:179:0x024e, B:181:0x0256, B:183:0x025e, B:196:0x0285, B:198:0x0291, B:218:0x02ef, B:157:0x020a, B:136:0x01c7, B:139:0x01ce, B:129:0x01a8, B:252:0x038d, B:253:0x0394, B:124:0x0192, B:259:0x039d, B:260:0x03a4), top: B:285:0x0062, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m8236g() {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.internet.C3666o.m8236g():void");
    }

    public C3666o(InterfaceC5156f interfaceC5156f) {
        this.f19366d = null;
        this.f19367e = true;
        this.f19368f = true;
        this.f19369g = null;
        this.f19370h = true;
        this.f19371i = true;
        this.f19372j = false;
        this.f19373k = false;
        if (interfaceC5156f instanceof C3668q) {
            InterfaceC3685q interfaceC3685q = ((C3668q) interfaceC5156f).getMessageContext().f19411a;
            synchronized (this) {
                this.f19414c = interfaceC3685q;
            }
        }
        if (interfaceC5156f instanceof IMAPMultipartDataSource) {
            IMAPMultipartDataSource iMAPMultipartDataSource = (IMAPMultipartDataSource) interfaceC5156f;
            synchronized (this) {
                this.f19413b = iMAPMultipartDataSource.getContentType();
                int count = iMAPMultipartDataSource.getCount();
                for (int i10 = 0; i10 < count; i10++) {
                    mo8231a(iMAPMultipartDataSource.getBodyPart(i10));
                }
            }
            return;
        }
        this.f19367e = false;
        this.f19366d = interfaceC5156f;
        this.f19413b = interfaceC5156f.getContentType();
    }
}
