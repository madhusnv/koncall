package p001o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class nge implements kta {

    /* renamed from: a */
    public final pge f36831a = new pge(100);

    /* renamed from: b */
    public static kta m40546b() {
        return new nge();
    }

    /* renamed from: c */
    public static boolean m40547c(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // p001o.kta
    /* renamed from: a */
    public boolean mo36214a(CharSequence charSequence, l7d l7dVar, boolean z) {
        String strM36658b = l7dVar.m36658b();
        if (strM36658b.length() == 0) {
            return false;
        }
        return m40547c(charSequence, this.f36831a.m43607a(strM36658b), z);
    }
}
