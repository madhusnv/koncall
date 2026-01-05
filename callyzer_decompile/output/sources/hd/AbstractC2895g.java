package hd;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4261c;
import nx.AbstractC5185w;
import og.d2;
import p020v.a1;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.g */
/* loaded from: classes.dex */
public abstract class AbstractC2895g {

    /* renamed from: a */
    public static final Set f15927a = AbstractC6663m.g0(new C4261c('0', '9'));

    /* renamed from: b */
    public static final Set f15928b = AbstractC6662l.m12710M(new Character[]{'e', 'E'});

    /* renamed from: c */
    public static final Set f15929c = AbstractC6662l.m12710M(new Character[]{'-', '+'});

    /* renamed from: a */
    public static final String m7016a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                int i11 = i10 + 2;
                char cCharAt2 = str.charAt(i10 + 1);
                if (cCharAt2 == '\"') {
                    sb2.append('\"');
                } else if (cCharAt2 == '/') {
                    sb2.append('/');
                } else if (cCharAt2 == '\\') {
                    sb2.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb2.append('\b');
                } else if (cCharAt2 != 'f') {
                    int i12 = 10;
                    if (cCharAt2 == 'n') {
                        sb2.append('\n');
                    } else if (cCharAt2 == 'r') {
                        sb2.append('\r');
                    } else if (cCharAt2 == 't') {
                        sb2.append('\t');
                    } else {
                        if (cCharAt2 != 'u') {
                            throw new DeserializationException("Invalid escape character: `" + cCharAt2 + '`');
                        }
                        int i13 = i10 + 6;
                        if (i13 > str.length()) {
                            throw new IllegalStateException("Unexpected EOF reading escaped high surrogate");
                        }
                        String strSubstring = str.substring(i11, i13);
                        AbstractC4154l.m8922e(strSubstring, "substring(...)");
                        char cM7017b = m7017b(strSubstring);
                        if (Character.isHighSurrogate(cM7017b)) {
                            String strSubstring2 = str.substring(i13, i10 + 12);
                            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                            if (!AbstractC5185w.m10138t(strSubstring2, "\\u", false)) {
                                throw new IllegalStateException(a1.m14328h('`', "Expected surrogate pair, found `", strSubstring2).toString());
                            }
                            String strSubstring3 = strSubstring2.substring(2);
                            AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                            char cM7017b2 = m7017b(strSubstring3);
                            if (!Character.isLowSurrogate(cM7017b2)) {
                                throw new IllegalStateException(("Invalid surrogate pair: (" + ((int) cM7017b) + ", " + ((int) cM7017b2) + ')').toString());
                            }
                            Object[] objArr = {Character.valueOf(cM7017b), Character.valueOf(cM7017b2)};
                            for (int i14 = 0; i14 < 2; i14++) {
                                sb2.append(objArr[i14]);
                            }
                        } else {
                            sb2.append(cM7017b);
                            i12 = 4;
                        }
                        i11 += i12;
                    }
                } else {
                    sb2.append('\f');
                }
                i10 = i11;
            } else {
                sb2.append(cCharAt);
                i10++;
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static final char m7017b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                throw new IllegalStateException(a1.m14328h('`', "Invalid unicode escape: `\\u", str).toString());
            }
        }
        d2.m10599b(16);
        return (char) Integer.parseInt(str, 16);
    }
}
