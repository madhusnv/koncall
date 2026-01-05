package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends AbstractC4155m implements InterfaceC2139c {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i10;
    }

    @Override // ex.InterfaceC2139c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IntentSender.SendIntentException {
        invoke((PendingIntent) obj);
        return a0.f30746a;
    }

    public final void invoke(PendingIntent result) throws IntentSender.SendIntentException {
        AbstractC4154l.m8923f(result, "result");
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(result.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e2) {
            HiddenActivity hiddenActivity = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
            AbstractC4154l.m8920c(resultReceiver);
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e2.getMessage());
        }
    }
}
