package aws.smithy.kotlin.runtime.http.interceptors;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SmokeTestsSuccessException extends Exception {
    public SmokeTestsSuccessException() {
        super("Smoke test succeeded with HTTP status code in the inclusive range: 200-599");
    }
}
