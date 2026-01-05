package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> retryables = AbstractC6662l.m12710M(new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* renamed from: createCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final CreateCredentialException m799x5e74af(String str, String str2) {
            return AbstractC4154l.m8918a(str, CredentialProviderBaseController.CREATE_CANCELED) ? new CreateCredentialCancellationException(str2) : AbstractC4154l.m8918a(str, CredentialProviderBaseController.CREATE_INTERRUPTED) ? new CreateCredentialInterruptedException(str2) : new CreateCredentialUnknownException(str2);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        /* renamed from: getCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final GetCredentialException m800xd975db95(String str, String str2) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new NoCredentialException(str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new GetCredentialInterruptedException(str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new GetCredentialCancellationException(str2);
                }
            }
            return new GetCredentialUnknownException(str2);
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        private Companion() {
        }

        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }
    }

    public CredentialProviderBaseController(Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return Companion.getCONTROLLER_REQUEST_CODE();
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        AbstractC4154l.m8923f(resultReceiver, "resultReceiver");
        AbstractC4154l.m8923f(hiddenIntent, "hiddenIntent");
        AbstractC4154l.m8923f(typeTag, "typeTag");
        hiddenIntent.putExtra(TYPE_TAG, typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t7) {
        Parcel parcelObtain = Parcel.obtain();
        AbstractC4154l.m8922e(parcelObtain, "obtain()");
        AbstractC4154l.m8920c(t7);
        t7.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver;
    }
}
