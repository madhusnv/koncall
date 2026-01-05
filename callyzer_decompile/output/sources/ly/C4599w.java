package ly;

import b2.C0554l;
import com.sun.mail.util.AbstractC1452a;
import e1.v0;
import e1.x0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import l7.AbstractC4422v;
import l7.C4421u;
import l7.C4423w;
import mx.AbstractC4913i;
import mx.C4905a;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import q7.C6140g;
import q7.C6141h;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.w */
/* loaded from: classes3.dex */
public class C4599w {

    /* renamed from: a */
    public final /* synthetic */ int f22762a;

    /* renamed from: b */
    public int f22763b;

    /* renamed from: c */
    public String f22764c;

    /* renamed from: d */
    public String f22765d;

    /* renamed from: e */
    public Object f22766e;

    /* renamed from: f */
    public Object f22767f;

    /* renamed from: n */
    public static /* synthetic */ void m9446n(C4599w c4599w, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = c4599w.f22763b;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        c4599w.m9461m(i10, str, str2);
        throw null;
    }

    /* renamed from: A */
    public boolean m9447A() {
        int iM9473z = m9473z();
        String str = this.f22765d;
        if (iM9473z >= str.length() || iM9473z == -1 || str.charAt(iM9473z) != ',') {
            return false;
        }
        this.f22763b++;
        return true;
    }

    /* renamed from: B */
    public void m9448B(char c2) {
        int i10 = this.f22763b;
        if (i10 > 0 && c2 == '\"') {
            try {
                this.f22763b = i10 - 1;
                String strM9459k = m9459k();
                this.f22763b = i10;
                if (AbstractC4154l.m8918a(strM9459k, "null")) {
                    m9461m(this.f22763b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f22763b = i10;
                throw th2;
            }
        }
        m9462o(AbstractC4585i.m9427h(c2), true);
        throw null;
    }

    /* renamed from: a */
    public void m9449a(AbstractC4422v node) {
        v0 v0Var = (v0) this.f22767f;
        C4423w c4423w = (C4423w) this.f22766e;
        AbstractC4154l.m8923f(node, "node");
        C6140g c6140g = node.f22135b;
        int i10 = c6140g.f29939e;
        String str = c6140g.f29940f;
        if (i10 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = c4423w.f22135b.f29940f;
        if (str2 != null && AbstractC4154l.m8918a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + c4423w).toString());
        }
        if (i10 == c4423w.f22135b.f29939e) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + c4423w).toString());
        }
        AbstractC4422v abstractC4422v = (AbstractC4422v) v0Var.m5646c(i10);
        if (abstractC4422v == node) {
            return;
        }
        if (node.f22136c != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (abstractC4422v != null) {
            abstractC4422v.f22136c = null;
        }
        node.f22136c = c4423w;
        v0Var.m5648e(c6140g.f29939e, node);
    }

    /* renamed from: b */
    public int m9450b(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f22767f).append((char) (m9466s(charSequence, i10 + 3) + (m9466s(charSequence, i10) << 12) + (m9466s(charSequence, i10 + 1) << 8) + (m9466s(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f22763b = i10;
        if (i11 < charSequence.length()) {
            return m9450b(charSequence, this.f22763b);
        }
        m9446n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* renamed from: c */
    public boolean m9451c() {
        int i10 = this.f22763b;
        if (i10 == -1) {
            return false;
        }
        String str = this.f22765d;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22763b = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
        this.f22763b = i10;
        return false;
    }

    /* renamed from: d */
    public void m9452d(int i10, String str) {
        String str2 = this.f22765d;
        if (str2.length() - i10 < str.length()) {
            m9446n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (str2.charAt(i10 + i11) | ' ')) {
                m9446n(this, "Expected valid boolean literal prefix, but had '" + m9459k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f22763b = str.length() + i10;
    }

    /* renamed from: e */
    public String m9453e() {
        StringBuilder sb2 = (StringBuilder) this.f22767f;
        String str = this.f22765d;
        m9456h('\"');
        int i10 = this.f22763b;
        int iM10098I = AbstractC5178p.m10098I(str, '\"', i10, 4);
        if (iM10098I == -1) {
            m9459k();
            m9462o((byte) 1, false);
            throw null;
        }
        int i11 = i10;
        while (i11 < iM10098I) {
            if (str.charAt(i11) == '\\') {
                int iM9471x = this.f22763b;
                char cCharAt = str.charAt(i11);
                boolean z6 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iM9471x, i11);
                        int iM9471x2 = m9471x(i11 + 1);
                        if (iM9471x2 == -1) {
                            m9446n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM9450b = iM9471x2 + 1;
                        char cCharAt2 = str.charAt(iM9471x2);
                        if (cCharAt2 == 'u') {
                            iM9450b = m9450b(str, iM9450b);
                        } else {
                            char c2 = cCharAt2 < 'u' ? C4580d.f22708a[cCharAt2] : (char) 0;
                            if (c2 == 0) {
                                m9446n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c2);
                        }
                        iM9471x = m9471x(iM9450b);
                        if (iM9471x == -1) {
                            m9446n(this, "Unexpected EOF", iM9471x, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            sb2.append((CharSequence) str, iM9471x, i11);
                            iM9471x = m9471x(i11);
                            if (iM9471x == -1) {
                                m9446n(this, "Unexpected EOF", iM9471x, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i11);
                        }
                    }
                    i11 = iM9471x;
                    z6 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z6 ? str.subSequence(iM9471x, i11).toString() : m9460l(iM9471x, i11);
                this.f22763b = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f22763b = iM10098I + 1;
        String strSubstring = str.substring(i10, iM10098I);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: f */
    public byte m9454f() {
        String str = this.f22765d;
        int i10 = this.f22763b;
        while (i10 != -1 && i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22763b = i11;
                return AbstractC4585i.m9427h(cCharAt);
            }
            i10 = i11;
        }
        this.f22763b = str.length();
        return (byte) 10;
    }

    /* renamed from: g */
    public byte m9455g(byte b10) {
        byte bM9454f = m9454f();
        if (bM9454f == b10) {
            return bM9454f;
        }
        m9462o(b10, true);
        throw null;
    }

    /* renamed from: h */
    public void m9456h(char c2) {
        int i10 = this.f22763b;
        if (i10 == -1) {
            m9448B(c2);
            throw null;
        }
        String str = this.f22765d;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22763b = i11;
                if (cCharAt == c2) {
                    return;
                }
                m9448B(c2);
                throw null;
            }
            i10 = i11;
        }
        this.f22763b = -1;
        m9448B(c2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0180, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0187, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0188, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018f, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0192, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        m9446n(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0198, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0199, code lost:
    
        m9446n(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        m9446n(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0107, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010d, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011e, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0123, code lost:
    
        m9446n(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        m9446n(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0131, code lost:
    
        r21.f22763b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0144, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0146, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014b, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0150, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0156, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015e, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0160, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0162, code lost:
    
        m9446n(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:
    
        m9446n(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m9457i() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.C4599w.m9457i():long");
    }

    /* renamed from: j */
    public String m9458j() {
        String str = this.f22764c;
        if (str == null) {
            return m9453e();
        }
        AbstractC4154l.m8920c(str);
        this.f22764c = null;
        return str;
    }

    /* renamed from: k */
    public String m9459k() {
        String str = this.f22765d;
        String str2 = this.f22764c;
        if (str2 != null) {
            AbstractC4154l.m8920c(str2);
            this.f22764c = null;
            return str2;
        }
        int iM9473z = m9473z();
        if (iM9473z >= str.length() || iM9473z == -1) {
            m9446n(this, "EOF", iM9473z, null, 4);
            throw null;
        }
        byte bM9427h = AbstractC4585i.m9427h(str.charAt(iM9473z));
        if (bM9427h == 1) {
            return m9458j();
        }
        if (bM9427h != 0) {
            m9446n(this, "Expected beginning of the string, but got " + str.charAt(iM9473z), 0, null, 6);
            throw null;
        }
        boolean z6 = false;
        while (AbstractC4585i.m9427h(str.charAt(iM9473z)) == 0) {
            iM9473z++;
            if (iM9473z >= str.length()) {
                ((StringBuilder) this.f22767f).append((CharSequence) str, this.f22763b, iM9473z);
                int iM9471x = m9471x(iM9473z);
                if (iM9471x == -1) {
                    this.f22763b = iM9473z;
                    return m9460l(0, 0);
                }
                iM9473z = iM9471x;
                z6 = true;
            }
        }
        String string = !z6 ? str.subSequence(this.f22763b, iM9473z).toString() : m9460l(this.f22763b, iM9473z);
        this.f22763b = iM9473z;
        return string;
    }

    /* renamed from: l */
    public String m9460l(int i10, int i11) {
        StringBuilder sb2 = (StringBuilder) this.f22767f;
        sb2.append((CharSequence) this.f22765d, i10, i11);
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    /* renamed from: m */
    public void m9461m(int i10, String message, String hint) {
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbM11245p = AbstractC5601a.m11245p(message, " at path: ");
        sbM11245p.append(((C0554l) this.f22766e).m1639h());
        sbM11245p.append(strConcat);
        throw AbstractC4585i.m9423d(i10, this.f22765d, sbM11245p.toString());
    }

    /* renamed from: o */
    public void m9462o(byte b10, boolean z6) {
        String str = this.f22765d;
        String strM9438s = AbstractC4585i.m9438s(b10);
        int i10 = z6 ? this.f22763b - 1 : this.f22763b;
        m9446n(this, a1.m14333m("Expected ", strM9438s, ", but had '", (this.f22763b == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    /* renamed from: p */
    public AbstractC4422v m9463p(int i10) {
        return m9465r(i10, (C4423w) this.f22766e, null, false);
    }

    /* renamed from: q */
    public AbstractC4422v m9464q(String route, boolean z6) {
        Object next;
        C4423w c4423w;
        AbstractC4154l.m8923f(route, "route");
        v0 v0Var = (v0) this.f22767f;
        AbstractC4154l.m8923f(v0Var, "<this>");
        Iterator it = ((C4905a) AbstractC4913i.m9806b(new x0(0, v0Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC4422v abstractC4422v = (AbstractC4422v) next;
            if (AbstractC5185w.m10130l(abstractC4422v.f22135b.f29940f, route, false) || abstractC4422v.f22135b.m12189a(route) != null) {
                break;
            }
        }
        AbstractC4422v abstractC4422v2 = (AbstractC4422v) next;
        if (abstractC4422v2 != null) {
            return abstractC4422v2;
        }
        if (!z6 || (c4423w = ((C4423w) this.f22766e).f22136c) == null) {
            return null;
        }
        C4599w c4599w = c4423w.f22140g;
        c4599w.getClass();
        if (AbstractC5178p.m10101L(route)) {
            return null;
        }
        return c4599w.m9464q(route, true);
    }

    /* renamed from: r */
    public AbstractC4422v m9465r(int i10, AbstractC4422v abstractC4422v, AbstractC4422v abstractC4422v2, boolean z6) {
        C4423w c4423w = (C4423w) this.f22766e;
        v0 v0Var = (v0) this.f22767f;
        AbstractC4422v abstractC4422vM9465r = (AbstractC4422v) v0Var.m5646c(i10);
        if (abstractC4422v2 != null) {
            if (AbstractC4154l.m8918a(abstractC4422vM9465r, abstractC4422v2) && AbstractC4154l.m8918a(abstractC4422vM9465r.f22136c, abstractC4422v2.f22136c)) {
                return abstractC4422vM9465r;
            }
            abstractC4422vM9465r = null;
        } else if (abstractC4422vM9465r != null) {
            return abstractC4422vM9465r;
        }
        if (z6) {
            Iterator it = ((C4905a) AbstractC4913i.m9806b(new x0(0, v0Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC4422vM9465r = null;
                    break;
                }
                AbstractC4422v abstractC4422v3 = (AbstractC4422v) it.next();
                abstractC4422vM9465r = (!(abstractC4422v3 instanceof C4423w) || abstractC4422v3.equals(abstractC4422v)) ? null : ((C4423w) abstractC4422v3).f22140g.m9465r(i10, c4423w, abstractC4422v2, true);
                if (abstractC4422vM9465r != null) {
                    break;
                }
            }
        }
        if (abstractC4422vM9465r != null) {
            return abstractC4422vM9465r;
        }
        C4423w c4423w2 = c4423w.f22136c;
        if (c4423w2 == null || c4423w2.equals(abstractC4422v)) {
            return null;
        }
        C4423w c4423w3 = c4423w.f22136c;
        AbstractC4154l.m8920c(c4423w3);
        return c4423w3.f22140g.m9465r(i10, c4423w, abstractC4422v2, z6);
    }

    /* renamed from: s */
    public int m9466s(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m9446n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* renamed from: t */
    public C4421u m9467t(C4421u c4421u, C4367l c4367l, boolean z6, AbstractC4422v abstractC4422v) {
        C4421u c4421uM9254x;
        C4423w c4423w = (C4423w) this.f22766e;
        ArrayList arrayList = new ArrayList();
        Iterator it = c4423w.iterator();
        while (true) {
            C6141h c6141h = (C6141h) it;
            if (!c6141h.hasNext()) {
                break;
            }
            AbstractC4422v abstractC4422v2 = (AbstractC4422v) c6141h.next();
            c4421uM9254x = AbstractC4154l.m8918a(abstractC4422v2, abstractC4422v) ? null : abstractC4422v2.mo9251t(c4367l);
            if (c4421uM9254x != null) {
                arrayList.add(c4421uM9254x);
            }
        }
        C4421u c4421u2 = (C4421u) AbstractC6663m.m12752P(arrayList);
        C4423w c4423w2 = c4423w.f22136c;
        if (c4423w2 != null && z6 && !c4423w2.equals(abstractC4422v)) {
            c4421uM9254x = c4423w2.m9254x(c4367l, c4423w);
        }
        return (C4421u) AbstractC6663m.m12752P(AbstractC6662l.m12729s(new C4421u[]{c4421u, c4421u2, c4421uM9254x}));
    }

    public String toString() {
        switch (this.f22762a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append((Object) this.f22765d);
                sb2.append("', currentPosition=");
                return AbstractC1452a.m4563j(sb2, this.f22763b, ')');
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public String m9468u(String keyToMatch) {
        AbstractC4154l.m8923f(keyToMatch, "keyToMatch");
        int i10 = this.f22763b;
        try {
            if (m9454f() == 6 && AbstractC4154l.m8918a(m9470w(), keyToMatch)) {
                this.f22764c = null;
                if (m9454f() == 5) {
                    return m9470w();
                }
            }
            return null;
        } finally {
            this.f22763b = i10;
            this.f22764c = null;
        }
    }

    /* renamed from: v */
    public byte m9469v() {
        String str = this.f22765d;
        int i10 = this.f22763b;
        while (true) {
            int iM9471x = m9471x(i10);
            if (iM9471x == -1) {
                this.f22763b = iM9471x;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM9471x);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f22763b = iM9471x;
                return AbstractC4585i.m9427h(cCharAt);
            }
            i10 = iM9471x + 1;
        }
    }

    /* renamed from: w */
    public String m9470w() {
        if (m9469v() != 1) {
            return null;
        }
        String strM9458j = m9458j();
        this.f22764c = strM9458j;
        return strM9458j;
    }

    /* renamed from: x */
    public int m9471x(int i10) {
        if (i10 < this.f22765d.length()) {
            return i10;
        }
        return -1;
    }

    /* renamed from: y */
    public void m9472y(String str) {
        int iHashCode;
        C4423w c4423w = (C4423w) this.f22766e;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(c4423w.f22135b.f29940f)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + c4423w).toString());
            }
            if (AbstractC5178p.m10101L(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i10 = AbstractC4422v.f22133f;
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f22763b = iHashCode;
        this.f22765d = str;
    }

    /* renamed from: z */
    public int m9473z() {
        char cCharAt;
        int i10 = this.f22763b;
        if (i10 == -1) {
            return i10;
        }
        String str = this.f22765d;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f22763b = i10;
        return i10;
    }

    public C4599w(C4423w c4423w) {
        this.f22762a = 1;
        this.f22766e = c4423w;
        this.f22767f = new v0(0);
    }

    public C4599w(String source) {
        this.f22762a = 0;
        AbstractC4154l.m8923f(source, "source");
        C0554l c0554l = new C0554l(3, (char) 0);
        c0554l.f3779c = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        c0554l.f3780d = iArr;
        c0554l.f3778b = -1;
        this.f22766e = c0554l;
        this.f22767f = new StringBuilder();
        this.f22765d = source;
    }
}
