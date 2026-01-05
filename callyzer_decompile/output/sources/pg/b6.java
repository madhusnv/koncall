package pg;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import p021w.C7851q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b6 {
    /* renamed from: a */
    public static final CredentialsProviderException m11544a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = "";
        }
        return new CredentialsProviderException(message, runtimeException);
    }

    /* renamed from: b */
    public static boolean m11545b(String str, C7851q c7851q) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c7851q.m14835b(str).m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        }
    }
}
