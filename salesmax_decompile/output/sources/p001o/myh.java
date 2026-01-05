package p001o;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class myh {
    /* renamed from: a */
    public static void m39870a(Spannable spannable, int i, int i2, nyh nyhVar, jyh jyhVar, Map map, int i3) {
        jyh jyhVarM39874e;
        nyh nyhVarM39875f;
        int i4;
        if (nyhVar.m41252l() != -1) {
            spannable.setSpan(new StyleSpan(nyhVar.m41252l()), i, i2, 33);
        }
        if (nyhVar.m41259s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (nyhVar.m41260t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (nyhVar.m41257q()) {
            xzf.m57046b(spannable, new ForegroundColorSpan(nyhVar.m41243c()), i, i2, 33);
        }
        if (nyhVar.m41256p()) {
            xzf.m57046b(spannable, new BackgroundColorSpan(nyhVar.m41242b()), i, i2, 33);
        }
        if (nyhVar.m41244d() != null) {
            xzf.m57046b(spannable, new TypefaceSpan(nyhVar.m41244d()), i, i2, 33);
        }
        if (nyhVar.m41255o() != null) {
            zgh zghVar = (zgh) op0.m42515e(nyhVar.m41255o());
            int i5 = zghVar.f57177a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = zghVar.f57178b;
            }
            int i6 = zghVar.f57179c;
            if (i6 == -2) {
                i6 = 1;
            }
            xzf.m57046b(spannable, new ahh(i5, i4, i6), i, i2, 33);
        }
        int iM41250j = nyhVar.m41250j();
        if (iM41250j == 2) {
            jyh jyhVarM39873d = m39873d(jyhVar, map);
            if (jyhVarM39873d != null && (jyhVarM39874e = m39874e(jyhVarM39873d, map)) != null) {
                if (jyhVarM39874e.m34730g() != 1 || jyhVarM39874e.m34729f(0).f31264b == null) {
                    ria.m46822f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) sqi.m48729h(jyhVarM39874e.m34729f(0).f31264b);
                    nyh nyhVarM39875f2 = m39875f(jyhVarM39874e.f31268f, jyhVarM39874e.m34734l(), map);
                    int iM41249i = nyhVarM39875f2 != null ? nyhVarM39875f2.m41249i() : -1;
                    if (iM41249i == -1 && (nyhVarM39875f = m39875f(jyhVarM39873d.f31268f, jyhVarM39873d.m34734l(), map)) != null) {
                        iM41249i = nyhVarM39875f.m41249i();
                    }
                    spannable.setSpan(new kve(str, iM41249i), i, i2, 33);
                }
            }
        } else if (iM41250j == 3 || iM41250j == 4) {
            spannable.setSpan(new jl5(), i, i2, 33);
        }
        if (nyhVar.m41254n()) {
            xzf.m57046b(spannable, new w08(), i, i2, 33);
        }
        int iM41246f = nyhVar.m41246f();
        if (iM41246f == 1) {
            xzf.m57046b(spannable, new AbsoluteSizeSpan((int) nyhVar.m41245e(), true), i, i2, 33);
        } else if (iM41246f == 2) {
            xzf.m57046b(spannable, new RelativeSizeSpan(nyhVar.m41245e()), i, i2, 33);
        } else {
            if (iM41246f != 3) {
                return;
            }
            xzf.m57045a(spannable, nyhVar.m41245e() / 100.0f, i, i2, 33);
        }
    }

    /* renamed from: b */
    public static String m39871b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m39872c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    public static jyh m39873d(jyh jyhVar, Map map) {
        while (jyhVar != null) {
            nyh nyhVarM39875f = m39875f(jyhVar.f31268f, jyhVar.m34734l(), map);
            if (nyhVarM39875f != null && nyhVarM39875f.m41250j() == 1) {
                return jyhVar;
            }
            jyhVar = jyhVar.f31272j;
        }
        return null;
    }

    /* renamed from: e */
    public static jyh m39874e(jyh jyhVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(jyhVar);
        while (!arrayDeque.isEmpty()) {
            jyh jyhVar2 = (jyh) arrayDeque.pop();
            nyh nyhVarM39875f = m39875f(jyhVar2.f31268f, jyhVar2.m34734l(), map);
            if (nyhVarM39875f != null && nyhVarM39875f.m41250j() == 3) {
                return jyhVar2;
            }
            for (int iM34730g = jyhVar2.m34730g() - 1; iM34730g >= 0; iM34730g--) {
                arrayDeque.push(jyhVar2.m34729f(iM34730g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static nyh m39875f(nyh nyhVar, String[] strArr, Map map) {
        int i = 0;
        if (nyhVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (nyh) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                nyh nyhVar2 = new nyh();
                int length = strArr.length;
                while (i < length) {
                    nyhVar2.m41241a((nyh) map.get(strArr[i]));
                    i++;
                }
                return nyhVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return nyhVar.m41241a((nyh) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    nyhVar.m41241a((nyh) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return nyhVar;
    }
}
