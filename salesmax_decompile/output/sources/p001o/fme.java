package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class fme {

    /* renamed from: a */
    public static final fme f23676a = new fme();

    /* renamed from: a */
    public final String m27086a(ule uleVar, Proxy.Type type2) {
        sq8.m48649h(uleVar, "request");
        sq8.m48649h(type2, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(uleVar.m51737h());
        sb.append(TokenParser.SP);
        fme fmeVar = f23676a;
        if (fmeVar.m27087b(uleVar, type2)) {
            sb.append(uleVar.m51741l());
        } else {
            sb.append(fmeVar.m27088c(uleVar.m51741l()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final boolean m27087b(ule uleVar, Proxy.Type type2) {
        return !uleVar.m51736g() && type2 == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public final String m27088c(w48 w48Var) {
        sq8.m48649h(w48Var, ImagesContract.URL);
        String strM53873c = w48Var.m53873c();
        String strM53875e = w48Var.m53875e();
        if (strM53875e == null) {
            return strM53873c;
        }
        return strM53873c + '?' + strM53875e;
    }
}
