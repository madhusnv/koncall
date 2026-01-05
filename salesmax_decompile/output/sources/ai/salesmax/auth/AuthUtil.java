package ai.salesmax.auth;

import ai.salesmax.auth.AuthUtil;
import android.util.Base64;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.google.gson.reflect.TypeToken;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.f9g;
import p001o.isa;
import p001o.ja8;
import p001o.sq8;

/* loaded from: classes.dex */
public final class AuthUtil {

    /* renamed from: a */
    public static final AuthUtil f257a = new AuthUtil();

    /* renamed from: g */
    public static final void m136g(List list) {
        sq8.m48649h(list, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("User attributes = ");
        sb.append(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AuthUserAttribute authUserAttribute = (AuthUserAttribute) it.next();
            AuthUserAttributeKey key = authUserAttribute.getKey();
            String value = authUserAttribute.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Auth value received: [");
            sb2.append(key);
            sb2.append(" --> ");
            sb2.append(value);
            sb2.append("]");
        }
    }

    /* renamed from: h */
    public static final void m137h(AuthException authException) {
        sq8.m48649h(authException, "it");
    }

    /* renamed from: c */
    public final String m138c(String str) {
        sq8.m48649h(str, "input");
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            sq8.m48648g(bArrDecode, "decode(...)");
            Charset charset = StandardCharsets.UTF_8;
            sq8.m48648g(charset, "UTF_8");
            return new String(bArrDecode, charset);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Not able to decode the token.", e);
        }
    }

    /* renamed from: d */
    public final Map m139d(String str) {
        if (str == null) {
            return isa.m32681h();
        }
        AuthUtil authUtil = f257a;
        String strM140e = authUtil.m140e(str);
        if (strM140e == null) {
            return isa.m32681h();
        }
        String strM138c = authUtil.m138c(strM140e);
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded token: ");
        sb.append(strM138c);
        Object objFromJson = ja8.f30035c.fromJson(strM138c, new TypeToken<LinkedHashMap<String, String>>() { // from class: ai.salesmax.auth.AuthUtil$decodeJwt$1$1$type$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (LinkedHashMap) objFromJson;
    }

    /* renamed from: e */
    public final String m140e(String str) {
        List listD0;
        if (str == null || (listD0 = f9g.D0(str, new String[]{"."}, false, 0, 6, null)) == null) {
            return null;
        }
        if (!(listD0.size() > 1)) {
            listD0 = null;
        }
        if (listD0 != null) {
            return (String) listD0.get(1);
        }
        return null;
    }

    /* renamed from: f */
    public final void m141f() {
        Amplify.Auth.fetchUserAttributes(new Consumer() { // from class: o.m01
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AuthUtil.m136g((List) obj);
            }
        }, new Consumer() { // from class: o.n01
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AuthUtil.m137h((AuthException) obj);
            }
        });
    }
}
