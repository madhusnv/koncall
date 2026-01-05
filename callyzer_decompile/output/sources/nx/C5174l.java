package nx;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import og.f2;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.l */
/* loaded from: classes3.dex */
public final class C5174l {

    /* renamed from: a */
    public final Matcher f25280a;

    /* renamed from: b */
    public final CharSequence f25281b;

    /* renamed from: c */
    public final C5173k f25282c;

    /* renamed from: d */
    public C5172j f25283d;

    public C5174l(Matcher matcher, CharSequence input) {
        AbstractC4154l.m8923f(input, "input");
        this.f25280a = matcher;
        this.f25281b = input;
        this.f25282c = new C5173k(0, this);
    }

    /* renamed from: a */
    public final List m10082a() {
        if (this.f25283d == null) {
            this.f25283d = new C5172j(0, this);
        }
        C5172j c5172j = this.f25283d;
        AbstractC4154l.m8920c(c5172j);
        return c5172j;
    }

    /* renamed from: b */
    public final C4266h m10083b() {
        Matcher matcher = this.f25280a;
        return w9.m11919j(matcher.start(), matcher.end());
    }

    /* renamed from: c */
    public final C5174l m10084c() {
        Matcher matcher = this.f25280a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f25281b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC4154l.m8922e(matcher2, "matcher(...)");
        return f2.m10640a(matcher2, iEnd, charSequence);
    }
}
