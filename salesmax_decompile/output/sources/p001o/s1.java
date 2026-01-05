package p001o;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Consumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class s1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AWSCognitoAuthPlugin f44426a;

    public /* synthetic */ s1(AWSCognitoAuthPlugin aWSCognitoAuthPlugin) {
        this.f44426a = aWSCognitoAuthPlugin;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) throws Throwable {
        this.f44426a.throwIt((AuthException) obj);
    }
}
