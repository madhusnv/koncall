package androidx.credentials.playservices;

import a2.AbstractC0030c;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.fido2.api.common.C1277c;
import ex.InterfaceC2139c;
import fg.C2284a;
import hd.C2893e;
import ig.AbstractC3250f;
import ig.C3247c;
import k0.ExecutorC3897g;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4450a;
import lf.C4451b;
import lf.C4452c;
import lf.C4453d;
import lf.C4454e;
import lf.C4456g;
import lf.C4457h;
import lf.C4461l;
import lf.C4463n;
import nf.C5047i;
import ng.C5070u;
import pf.C5904d;
import qf.C6205d;
import qf.InterfaceC6203b;
import sf.AbstractC6840z;
import yg.AbstractC8651h;
import yg.C8656m;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    private final void handleBeginSignIn() {
        C8656m c8656mM12223b;
        C4454e c4454e = (C4454e) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c4454e != null) {
            C3247c c3247c = new C3247c(this, new C4463n());
            new C4450a(false, null, null, true, null, null, false);
            C4450a c4450a = c4454e.f22196b;
            AbstractC6840z.m13036g(c4450a);
            C4453d c4453d = c4454e.f22195a;
            AbstractC6840z.m13036g(c4453d);
            C4452c c4452c = c4454e.f22200f;
            AbstractC6840z.m13036g(c4452c);
            C4451b c4451b = c4454e.f22201g;
            AbstractC6840z.m13036g(c4451b);
            C4454e c4454e2 = new C4454e(c4453d, c4450a, c3247c.f17423k, c4454e.f22198d, c4454e.f22199e, c4452c, c4451b, c4454e.f22202h);
            C2893e c2893eM7007b = C2893e.m7007b();
            c2893eM7007b.f15925d = new C5904d[]{new C5904d("auth_api_credentials_begin_sign_in", 8L)};
            c2893eM7007b.f15924c = new C5047i(c3247c, c4454e2);
            c2893eM7007b.f15922a = false;
            c2893eM7007b.f15923b = 1553;
            c8656mM12223b = c3247c.m12223b(0, c2893eM7007b.m7008a());
            C0267a c0267a = new C0267a(4, new HiddenActivity$handleBeginSignIn$1$1(this, intExtra));
            c8656mM12223b.getClass();
            ExecutorC3897g executorC3897g = AbstractC8651h.f41931a;
            c8656mM12223b.m15979f(executorC3897g, c0267a);
            c8656mM12223b.m15977d(executorC3897g, new C0305e(this, 3));
        } else {
            c8656mM12223b = null;
        }
        if (c8656mM12223b == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$8(InterfaceC2139c tmp0, Object obj) {
        AbstractC4154l.m8923f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity this$0, Exception e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "e");
        String str = ((e2 instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) e2).f5997a.f6007a))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC4154l.m8920c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, AbstractC0030c.m117h(e2, new StringBuilder("During begin sign in, failure response from one tap: ")));
    }

    private final void handleCreatePassword() {
        C8656m c8656mM12223b;
        C4457h c4457h = (C4457h) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c4457h != null) {
            C3247c c3247c = new C3247c(this, new C4461l());
            C4457h c4457h2 = new C4457h(c4457h.f22210a, c3247c.f17423k, c4457h.f22212c);
            C2893e c2893eM7007b = C2893e.m7007b();
            c2893eM7007b.f15925d = new C5904d[]{AbstractC3250f.f17427b};
            c2893eM7007b.f15924c = new C8986c(c3247c, c4457h2, 24);
            c2893eM7007b.f15922a = false;
            c2893eM7007b.f15923b = 1536;
            c8656mM12223b = c3247c.m12223b(0, c2893eM7007b.m7008a());
            C0267a c0267a = new C0267a(2, new HiddenActivity$handleCreatePassword$1$1(this, intExtra));
            c8656mM12223b.getClass();
            ExecutorC3897g executorC3897g = AbstractC8651h.f41931a;
            c8656mM12223b.m15979f(executorC3897g, c0267a);
            c8656mM12223b.m15977d(executorC3897g, new C0305e(this, 1));
        } else {
            c8656mM12223b = null;
        }
        if (c8656mM12223b == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$12(InterfaceC2139c tmp0, Object obj) {
        AbstractC4154l.m8923f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity this$0, Exception e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "e");
        String str = ((e2 instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) e2).f5997a.f6007a))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC4154l.m8920c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, AbstractC0030c.m117h(e2, new StringBuilder("During save password, found password failure response from one tap ")));
    }

    private final void handleCreatePublicKeyCredential() {
        C8656m c8656mM12223b;
        C1277c c1277c = (C1277c) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c1277c != null) {
            C5070u c5070u = new C5070u(26);
            Looper mainLooper = getMainLooper();
            AbstractC6840z.m13037h(mainLooper, "Looper must not be null.");
            C2284a c2284a = new C2284a(this, this, C2284a.f10315k, InterfaceC6203b.R0, new C6205d(c5070u, mainLooper));
            C2893e c2893eM7007b = C2893e.m7007b();
            c2893eM7007b.f15924c = new C8986c(c2284a, c1277c, 11);
            c2893eM7007b.f15923b = 5407;
            c8656mM12223b = c2284a.m12223b(0, c2893eM7007b.m7008a());
            C0267a c0267a = new C0267a(1, new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra));
            c8656mM12223b.getClass();
            ExecutorC3897g executorC3897g = AbstractC8651h.f41931a;
            c8656mM12223b.m15979f(executorC3897g, c0267a);
            c8656mM12223b.m15977d(executorC3897g, new C0305e(this, 0));
        } else {
            c8656mM12223b = null;
        }
        if (c8656mM12223b == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC2139c tmp0, Object obj) {
        AbstractC4154l.m8923f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity this$0, Exception e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "e");
        String str = ((e2 instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) e2).f5997a.f6007a))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC4154l.m8920c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, AbstractC0030c.m117h(e2, new StringBuilder("During create public key credential, fido registration failure: ")));
    }

    private final void handleGetSignInIntent() {
        C8656m c8656mM12223b;
        C4456g c4456g = (C4456g) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (c4456g != null) {
            C3247c c3247c = new C3247c(this, new C4463n());
            String str = c4456g.f22204a;
            AbstractC6840z.m13036g(str);
            String str2 = c4456g.f22207d;
            String str3 = c4456g.f22205b;
            C4456g c4456g2 = new C4456g(str, c4456g.f22209f, c4456g.f22208e, str3, c3247c.f17423k, str2);
            C2893e c2893eM7007b = C2893e.m7007b();
            c2893eM7007b.f15925d = new C5904d[]{AbstractC3250f.f17428c};
            c2893eM7007b.f15924c = new C8986c(c3247c, c4456g2, 25);
            c2893eM7007b.f15923b = 1555;
            c8656mM12223b = c3247c.m12223b(0, c2893eM7007b.m7008a());
            C0267a c0267a = new C0267a(3, new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra));
            c8656mM12223b.getClass();
            ExecutorC3897g executorC3897g = AbstractC8651h.f41931a;
            c8656mM12223b.m15979f(executorC3897g, c0267a);
            c8656mM12223b.m15977d(executorC3897g, new C0305e(this, 2));
        } else {
            c8656mM12223b = null;
        }
        if (c8656mM12223b == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$4(InterfaceC2139c tmp0, Object obj) {
        AbstractC4154l.m8923f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity this$0, Exception e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "e");
        String str = ((e2 instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) e2).f5997a.f6007a))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        AbstractC4154l.m8920c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, AbstractC0030c.m117h(e2, new StringBuilder("During get sign-in intent, failure response from one tap: ")));
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i10);
        bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i11, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4154l.m8923f(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
