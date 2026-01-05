package com.amplifyframework.statemachine.codegen.events;

import android.net.Uri;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FetchToken extends EventType {
            private final Uri uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchToken(Uri uri) {
                super(null);
                AbstractC4154l.m8923f(uri, "uri");
                this.uri = uri;
            }

            public static /* synthetic */ FetchToken copy$default(FetchToken fetchToken, Uri uri, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    uri = fetchToken.uri;
                }
                return fetchToken.copy(uri);
            }

            public final Uri component1() {
                return this.uri;
            }

            public final FetchToken copy(Uri uri) {
                AbstractC4154l.m8923f(uri, "uri");
                return new FetchToken(uri);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchToken) && AbstractC4154l.m8918a(this.uri, ((FetchToken) obj).uri);
            }

            public final Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode();
            }

            public String toString() {
                return "FetchToken(uri=" + this.uri + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ShowHostedUI extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowHostedUI(SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                AbstractC4154l.m8923f(hostedUISignInData, "hostedUISignInData");
                this.hostedUISignInData = hostedUISignInData;
            }

            public static /* synthetic */ ShowHostedUI copy$default(ShowHostedUI showHostedUI, SignInData.HostedUISignInData hostedUISignInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    hostedUISignInData = showHostedUI.hostedUISignInData;
                }
                return showHostedUI.copy(hostedUISignInData);
            }

            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            public final ShowHostedUI copy(SignInData.HostedUISignInData hostedUISignInData) {
                AbstractC4154l.m8923f(hostedUISignInData, "hostedUISignInData");
                return new ShowHostedUI(hostedUISignInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowHostedUI) && AbstractC4154l.m8918a(this.hostedUISignInData, ((ShowHostedUI) obj).hostedUISignInData);
            }

            public final SignInData.HostedUISignInData getHostedUISignInData() {
                return this.hostedUISignInData;
            }

            public int hashCode() {
                return this.hostedUISignInData.hashCode();
            }

            public String toString() {
                return "ShowHostedUI(hostedUISignInData=" + this.hostedUISignInData + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && AbstractC4154l.m8918a(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowError(exception=", ")", this.exception);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class TokenFetched extends EventType {
            public static final TokenFetched INSTANCE = new TokenFetched();

            private TokenFetched() {
                super(null);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public HostedUIEvent(EventType eventType, Date date) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        this.type = eventType.getClass().getSimpleName();
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return super.getId();
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public /* synthetic */ HostedUIEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
