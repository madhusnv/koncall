package com.amplifyframework.statemachine.codegen.events;

import android.net.Uri;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import java.util.Date;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58127type;

    public static abstract class EventType {

        public static final class FetchToken extends EventType {
            private final Uri uri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchToken(Uri uri) {
                super(null);
                sq8.m48649h(uri, "uri");
                this.uri = uri;
            }

            public static /* synthetic */ FetchToken copy$default(FetchToken fetchToken, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = fetchToken.uri;
                }
                return fetchToken.copy(uri);
            }

            public final Uri component1() {
                return this.uri;
            }

            public final FetchToken copy(Uri uri) {
                sq8.m48649h(uri, "uri");
                return new FetchToken(uri);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchToken) && sq8.m48644c(this.uri, ((FetchToken) obj).uri);
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

        public static final class ShowHostedUI extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowHostedUI(SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                sq8.m48649h(hostedUISignInData, "hostedUISignInData");
                this.hostedUISignInData = hostedUISignInData;
            }

            public static /* synthetic */ ShowHostedUI copy$default(ShowHostedUI showHostedUI, SignInData.HostedUISignInData hostedUISignInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    hostedUISignInData = showHostedUI.hostedUISignInData;
                }
                return showHostedUI.copy(hostedUISignInData);
            }

            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            public final ShowHostedUI copy(SignInData.HostedUISignInData hostedUISignInData) {
                sq8.m48649h(hostedUISignInData, "hostedUISignInData");
                return new ShowHostedUI(hostedUISignInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowHostedUI) && sq8.m48644c(this.hostedUISignInData, ((ShowHostedUI) obj).hostedUISignInData);
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

        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && sq8.m48644c(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ")";
            }
        }

        public static final class TokenFetched extends EventType {
            public static final TokenFetched INSTANCE = new TokenFetched();

            private TokenFetched() {
                super(null);
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public HostedUIEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58127type = simpleName;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.f58127type;
    }

    public /* synthetic */ HostedUIEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
