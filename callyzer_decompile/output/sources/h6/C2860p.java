package h6;

import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.credentials.internal.FrameworkClassParsingException;
import ey.C2147b;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5927h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.p */
/* loaded from: classes.dex */
public final class C2860p implements OutcomeReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f15869a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2855k f15870b;

    public C2860p(C2147b c2147b, C2861q c2861q) {
        this.f15870b = c2147b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r6) throws androidx.credentials.internal.FrameworkClassParsingException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C2860p.onError(java.lang.Throwable):void");
    }

    public final void onResult(Object obj) throws FrameworkClassParsingException {
        Object c2848d;
        AbstractC5927h c2862r;
        switch (this.f15869a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                AbstractC4154l.m8923f(response, "response");
                C2853i c2853i = (C2853i) this.f15870b;
                Bundle data = response.getData();
                AbstractC4154l.m8922e(data, "response.data");
                try {
                    try {
                        String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                        AbstractC4154l.m8920c(string);
                        c2848d = new C2851g(string, data);
                    } catch (FrameworkClassParsingException unused) {
                        c2848d = new C2848d();
                    }
                    c2853i.onResult(c2848d);
                    return;
                } catch (Exception unused2) {
                    throw new FrameworkClassParsingException();
                }
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                AbstractC4154l.m8923f(response2, "response");
                C2147b c2147b = (C2147b) this.f15870b;
                Credential credential = response2.getCredential();
                AbstractC4154l.m8922e(credential, "response.credential");
                String type = credential.getType();
                AbstractC4154l.m8922e(type, "credential.type");
                Bundle data2 = credential.getData();
                AbstractC4154l.m8922e(data2, "credential.data");
                try {
                    if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = data2.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = data2.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            AbstractC4154l.m8920c(string2);
                            AbstractC4154l.m8920c(string3);
                            c2862r = new C2862r(string3, data2, 1);
                        } catch (Exception unused3) {
                            throw new FrameworkClassParsingException();
                        }
                    } else {
                        if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            throw new FrameworkClassParsingException();
                        }
                        try {
                            String string4 = data2.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            AbstractC4154l.m8920c(string4);
                            c2862r = new C2867w(string4, data2);
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } catch (FrameworkClassParsingException unused5) {
                    c2862r = new C2862r(type, data2, 0);
                }
                c2147b.onResult(new C2864t(c2862r));
                return;
        }
    }

    public C2860p(C2853i c2853i, C2850f c2850f, C2861q c2861q) {
        this.f15870b = c2853i;
    }
}
