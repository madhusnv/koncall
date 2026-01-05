package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class ik7 {

    /* renamed from: c */
    public static final C14309a f28780c = new C14309a(null);

    /* renamed from: a */
    public final String f28781a;

    /* renamed from: b */
    public final String f28782b;

    /* renamed from: o.ik7$a */
    public static final class C14309a {
        public C14309a() {
        }

        public /* synthetic */ C14309a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ik7 m32244a(f9d f9dVar) {
            sq8.m48649h(f9dVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
            String strMo26796e = f9dVar.mo26796e("aws.frameworkMetadata");
            if (strMo26796e == null) {
                strMo26796e = f9dVar.mo26798i("AWS_FRAMEWORK_METADATA");
            }
            if (strMo26796e == null) {
                return null;
            }
            List listC0 = f9g.C0(strMo26796e, new char[]{':'}, false, 2, 2, null);
            if (listC0.size() == 2) {
                return new ik7((String) listC0.get(0), (String) listC0.get(1));
            }
            throw new IllegalStateException(("Invalid value for FRAMEWORK_METADATA: " + strMo26796e + "; must be of the form `name:version`").toString());
        }
    }

    public ik7(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, ClientCookie.VERSION_ATTR);
        this.f28781a = str;
        this.f28782b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik7)) {
            return false;
        }
        ik7 ik7Var = (ik7) obj;
        return sq8.m48644c(this.f28781a, ik7Var.f28781a) && sq8.m48644c(this.f28782b, ik7Var.f28782b);
    }

    public int hashCode() {
        return (this.f28781a.hashCode() * 31) + this.f28782b.hashCode();
    }

    public String toString() {
        return i91.m31759d("lib", this.f28781a, this.f28782b);
    }
}
