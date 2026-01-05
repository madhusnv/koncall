package p001o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class oge implements lta {

    /* renamed from: a */
    public final qge f38342a = new qge(100);

    /* renamed from: b */
    public static lta m42225b() {
        return new oge();
    }

    /* renamed from: c */
    public static boolean m42226c(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // p001o.lta
    /* renamed from: a */
    public boolean mo37880a(CharSequence charSequence, m7d m7dVar, boolean z) {
        String strM38484a = m7dVar.m38484a();
        if (strM38484a.length() == 0) {
            return false;
        }
        return m42226c(charSequence, this.f38342a.m45436a(strM38484a), z);
    }
}
