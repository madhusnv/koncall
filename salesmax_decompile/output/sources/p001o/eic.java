package p001o;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class eic {

    /* renamed from: a */
    public static final eic f21743a = new eic();

    /* renamed from: a */
    public static final GraphRequest m25115a(String str, String str2, String str3) {
        sq8.m48649h(str, "authorizationCode");
        sq8.m48649h(str2, "redirectUri");
        sq8.m48649h(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("client_id", C10773c.m13020m());
        bundle.putString("redirect_uri", str2);
        bundle.putString("code_verifier", str3);
        GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(null, "oauth/access_token", null);
        graphRequestM12913x.m12845F(p38.GET);
        graphRequestM12913x.m12846G(bundle);
        return graphRequestM12913x;
    }

    /* renamed from: b */
    public static final String m25116b(String str, ye3 ye3Var) throws NoSuchAlgorithmException {
        sq8.m48649h(str, "codeVerifier");
        sq8.m48649h(ye3Var, "codeChallengeMethod");
        if (!m25118d(str)) {
            throw new ur6("Invalid Code Verifier.");
        }
        if (ye3Var == ye3.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(sh2.f45426f);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            sq8.m48648g(strEncodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e) {
            throw new ur6(e);
        }
    }

    /* renamed from: c */
    public static final String m25117c() {
        int iM18614q = bce.m18614q(new kl8(43, 128), vbe.f50091a);
        List listY0 = kh3.y0(kh3.y0(kh3.y0(kh3.y0(kh3.x0(kh3.w0(new kh2('a', 'z'), new kh2('A', 'Z')), new kh2('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iM18614q);
        for (int i = 0; i < iM18614q; i++) {
            arrayList.add(Character.valueOf(((Character) kh3.A0(listY0, vbe.f50091a)).charValue()));
        }
        return kh3.p0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public static final boolean m25118d(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new mge("^[-._~A-Za-z0-9]+$").m38995g(str);
    }
}
