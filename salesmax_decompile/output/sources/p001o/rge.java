package p001o;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes6.dex */
public abstract class rge {
    /* renamed from: e */
    public static final jta m46737e(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new mta(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: f */
    public static final jta m46738f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new mta(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: g */
    public static final kl8 m46739g(MatchResult matchResult) {
        return bce.m18616s(matchResult.start(), matchResult.end());
    }

    /* renamed from: h */
    public static final kl8 m46740h(MatchResult matchResult, int i) {
        return bce.m18616s(matchResult.start(i), matchResult.end(i));
    }
}
