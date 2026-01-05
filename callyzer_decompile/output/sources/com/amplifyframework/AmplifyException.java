package com.amplifyframework;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AmplifyException extends Exception {

    @InternalAmplifyApi
    public static final String RECOVERY_SUGGESTION_WITH_THROWABLE = "See the attached exception for more details";
    public static final String REPORT_BUG_TO_AWS_SUGGESTION = "There is a possibility that there is a bug if this error persists. Please take a look at \nhttps://github.com/aws-amplify/amplify-android/issues to see if there are any existing issues that \nmatch your scenario, and file an issue with the details of the bug if there isn't.";
    public static final String TODO_RECOVERY_SUGGESTION = "Sorry, we don’t have a recovery suggestion for this error.";
    private static final long serialVersionUID = 1;
    private final String recoverySuggestion;

    public AmplifyException(String str, Throwable th2, String str2) {
        super(str, th2);
        Objects.requireNonNull(str2);
        this.recoverySuggestion = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AmplifyException)) {
            AmplifyException amplifyException = (AmplifyException) obj;
            if (Objects.equals(getRecoverySuggestion(), amplifyException.getRecoverySuggestion()) && Objects.equals(getMessage(), amplifyException.getMessage()) && Objects.equals(getCause(), amplifyException.getCause())) {
                return true;
            }
        }
        return false;
    }

    public final String getRecoverySuggestion() {
        return this.recoverySuggestion;
    }

    public int hashCode() {
        return Objects.hash(getRecoverySuggestion(), getMessage(), getCause());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getSimpleName() + "{message=" + getMessage() + ", cause=" + getCause() + ", recoverySuggestion=" + getRecoverySuggestion() + '}';
    }

    public AmplifyException(String str, String str2) {
        super(str);
        Objects.requireNonNull(str2);
        this.recoverySuggestion = str2;
    }
}
