package com.amplifyframework.rx;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.ah1;
import p001o.k6g;
import p001o.m8c;
import p001o.q7c;
import p001o.s6c;
import p001o.tve;
import p001o.x6c;

/* loaded from: classes5.dex */
public final class RxOperations {

    public static final class RxSubscriptionOperation<T> implements Cancelable {
        private Cancelable amplifyOperation;
        private x6c subscriptionData;
        private RxSubscriptionOperation<T>.OnConnectedConsumer onConnected = new OnConnectedConsumer();
        private ah1 connectionStateSubject = ah1.N0();

        public enum ConnectionState {
            CONNECTED
        }

        public static final class ConnectionStateEvent {
            private ConnectionState connectionState;
            private String subscriptionId;

            public ConnectionStateEvent(ConnectionState connectionState, String str) {
                this.connectionState = connectionState;
                this.subscriptionId = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || ConnectionStateEvent.class != obj.getClass()) {
                    return false;
                }
                ConnectionStateEvent connectionStateEvent = (ConnectionStateEvent) obj;
                return s6c.m47909a(getConnectionState(), connectionStateEvent.getConnectionState()) && s6c.m47909a(getSubscriptionId(), connectionStateEvent.getSubscriptionId());
            }

            public ConnectionState getConnectionState() {
                return this.connectionState;
            }

            public String getSubscriptionId() {
                return this.subscriptionId;
            }

            public int hashCode() {
                int iHashCode = this.connectionState.hashCode() * 31;
                String str = this.subscriptionId;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "ConnectionStateEvent{connectionState=" + this.connectionState + ",subscriptionId=" + this.subscriptionId + "}";
            }
        }

        public final class OnConnectedConsumer implements Consumer<String> {
            private OnConnectedConsumer() {
            }

            @Override // com.amplifyframework.core.Consumer
            public void accept(String str) {
                RxSubscriptionOperation.this.connectionStateSubject.mo16560e(new ConnectionStateEvent(ConnectionState.CONNECTED, str));
            }
        }

        public RxSubscriptionOperation(final RxAdapters.CancelableBehaviors.StreamEmitter<String, T, ApiException> streamEmitter) {
            this.subscriptionData = x6c.m55706q(new m8c() { // from class: com.amplifyframework.rx.c3
                @Override // p001o.m8c
                /* renamed from: a */
                public final void mo12393a(q7c q7cVar) {
                    this.f10832a.lambda$new$0(streamEmitter, q7cVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(RxAdapters.CancelableBehaviors.StreamEmitter streamEmitter, final q7c q7cVar) {
            RxSubscriptionOperation<T>.OnConnectedConsumer onConnectedConsumer = this.onConnected;
            Objects.requireNonNull(q7cVar);
            this.amplifyOperation = streamEmitter.streamTo(onConnectedConsumer, new tve(q7cVar), new Consumer() { // from class: o.gwe
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    q7cVar.mo28139a((ApiException) obj);
                }
            }, new k6g(q7cVar));
        }

        @Override // com.amplifyframework.core.async.Cancelable
        public void cancel() {
            this.connectionStateSubject.onComplete();
            Cancelable cancelable = this.amplifyOperation;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }

        public x6c observeConnectionState() {
            return this.connectionStateSubject;
        }

        public x6c observeSubscriptionData() {
            return this.subscriptionData;
        }
    }
}
