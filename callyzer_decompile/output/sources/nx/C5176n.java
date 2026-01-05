package nx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.n */
/* loaded from: classes3.dex */
public final class C5176n implements Serializable {

    /* renamed from: a */
    public final Pattern f25285a;

    public C5176n(String pattern) {
        AbstractC4154l.m8923f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        this.f25285a = patternCompile;
    }

    /* renamed from: a */
    public final C5174l m10085a(int i10, String input) {
        AbstractC4154l.m8923f(input, "input");
        Matcher matcherRegion = this.f25285a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (matcherRegion.lookingAt()) {
            return new C5174l(matcherRegion, input);
        }
        return null;
    }

    /* renamed from: b */
    public final C5174l m10086b(String input) {
        AbstractC4154l.m8923f(input, "input");
        Matcher matcher = this.f25285a.matcher(input);
        AbstractC4154l.m8922e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C5174l(matcher, input);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m10087c(CharSequence input) {
        AbstractC4154l.m8923f(input, "input");
        return this.f25285a.matcher(input).matches();
    }

    /* renamed from: d */
    public final String m10088d(String input, String str) {
        AbstractC4154l.m8923f(input, "input");
        String strReplaceAll = this.f25285a.matcher(input).replaceAll(str);
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: e */
    public final List m10089e(CharSequence input, int i10) {
        AbstractC4154l.m8923f(input, "input");
        AbstractC5178p.m10109T(i10);
        Matcher matcher = this.f25285a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return pe.m10833h(input.toString());
        }
        int i11 = 10;
        if (i10 > 0 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f25285a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public C5176n(String pattern, EnumC5177o option) {
        AbstractC4154l.m8923f(pattern, "pattern");
        AbstractC4154l.m8923f(option, "option");
        int value = option.getValue();
        Pattern patternCompile = Pattern.compile(pattern, (value & 2) != 0 ? value | 64 : value);
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        this.f25285a = patternCompile;
    }
}
