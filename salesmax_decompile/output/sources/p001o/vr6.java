package p001o;

import com.facebook.C10776f;
import com.facebook.FacebookRequestError;

/* loaded from: classes5.dex */
public final class vr6 extends ur6 {

    /* renamed from: b */
    public final C10776f f50787b;

    public vr6(C10776f c10776f, String str) {
        super(str);
        this.f50787b = c10776f;
    }

    @Override // p001o.ur6, java.lang.Throwable
    public String toString() {
        C10776f c10776f = this.f50787b;
        FacebookRequestError facebookRequestErrorM13064b = c10776f != null ? c10776f.m13064b() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestErrorM13064b != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestErrorM13064b.m12824f());
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestErrorM13064b.m12820b());
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestErrorM13064b.m12822d());
            sb.append(", message: ");
            sb.append(facebookRequestErrorM13064b.m12821c());
            sb.append("}");
        }
        String string = sb.toString();
        sq8.m48648g(string, "errorStringBuilder.toString()");
        return string;
    }
}
