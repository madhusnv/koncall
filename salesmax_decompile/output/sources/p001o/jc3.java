package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jc3 {

    /* renamed from: a */
    public static final jc3 f30133a = new jc3();

    /* renamed from: a */
    public final ic3 m33495a(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        String upperCase = str.toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1708288860) {
            if (iHashCode != -1525365743) {
                if (iHashCode == 631670946 && upperCase.equals("TATATELESERVICES")) {
                    return p2h.f39246a.m42919a();
                }
            } else if (upperCase.equals("BONVOICE")) {
                return bk1.f16451a.m19264a();
            }
        } else if (upperCase.equals("CALLERDESK")) {
            return j32.f29668a.m33168a();
        }
        return rc5.f43365a.m46506a();
    }
}
