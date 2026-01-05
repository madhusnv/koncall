package com.amplifyframework.rx;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NoOpConsumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.rx.RxAdapters;
import java.util.Objects;
import p001o.auf;
import p001o.fl3;
import p001o.k6g;
import p001o.m8c;
import p001o.muf;
import p001o.nl3;
import p001o.q7c;
import p001o.rve;
import p001o.sve;
import p001o.tve;
import p001o.uve;
import p001o.vve;
import p001o.wtf;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxAdapters {

    public static final class CancelableBehaviors {

        public interface ActionEmitter<E> {
            Cancelable emitTo(Action action, Consumer<E> consumer);
        }

        public interface ResultEmitter<T, E extends Throwable> {
            Cancelable emitTo(Consumer<T> consumer, Consumer<E> consumer2);
        }

        public interface StreamEmitter<S, T, E> {
            Cancelable streamTo(Consumer<S> consumer, Consumer<T> consumer2, Consumer<E> consumer3, Action action);
        }

        private CancelableBehaviors() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toCompletable$0(ActionEmitter actionEmitter, fl3 fl3Var) {
            Objects.requireNonNull(fl3Var);
            fl3Var.mo17343d(AmplifyDisposables.fromCancelable(actionEmitter.emitTo(new p001o.z1(fl3Var), new vve(fl3Var))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toObservable$2(StreamEmitter streamEmitter, q7c q7cVar) {
            NoOpConsumer noOpConsumerCreate = NoOpConsumer.create();
            Objects.requireNonNull(q7cVar);
            q7cVar.mo28141d(AmplifyDisposables.fromCancelable(streamEmitter.streamTo(noOpConsumerCreate, new tve(q7cVar), new uve(q7cVar), new k6g(q7cVar))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toSingle$1(ResultEmitter resultEmitter, auf aufVar) {
            Objects.requireNonNull(aufVar);
            aufVar.mo17849d(AmplifyDisposables.fromCancelable(resultEmitter.emitTo(new rve(aufVar), new sve(aufVar))));
        }

        public static <E extends Throwable> xk3 toCompletable(final ActionEmitter<E> actionEmitter) {
            return xk3.m56389h(new nl3() { // from class: com.amplifyframework.rx.c
                @Override // p001o.nl3
                /* renamed from: a */
                public final void mo12392a(fl3 fl3Var) {
                    RxAdapters.CancelableBehaviors.lambda$toCompletable$0(actionEmitter, fl3Var);
                }
            });
        }

        public static <S, T, E extends Throwable> x6c toObservable(final StreamEmitter<S, T, E> streamEmitter) {
            return x6c.m55706q(new m8c() { // from class: com.amplifyframework.rx.b
                @Override // p001o.m8c
                /* renamed from: a */
                public final void mo12393a(q7c q7cVar) {
                    RxAdapters.CancelableBehaviors.lambda$toObservable$2(streamEmitter, q7cVar);
                }
            });
        }

        public static <T, E extends Throwable> wtf toSingle(final ResultEmitter<T, E> resultEmitter) {
            return wtf.m55005e(new muf() { // from class: com.amplifyframework.rx.a
                @Override // p001o.muf
                /* renamed from: a */
                public final void mo12390a(auf aufVar) {
                    RxAdapters.CancelableBehaviors.lambda$toSingle$1(resultEmitter, aufVar);
                }
            });
        }
    }

    public interface RxSingleOperation<T> extends Cancelable {
        wtf observeResult();
    }

    public static final class VoidBehaviors {

        public interface ActionEmitter<E> {
            void emitTo(Action action, Consumer<E> consumer);
        }

        public interface ResultEmitter<T, E extends Throwable> {
            void emitTo(Consumer<T> consumer, Consumer<E> consumer2);
        }

        public interface StreamEmitter<S, T, E extends Throwable> {
            void streamTo(Consumer<S> consumer, Consumer<T> consumer2, Consumer<E> consumer3, Action action);
        }

        private VoidBehaviors() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toCompletable$0(ActionEmitter actionEmitter, fl3 fl3Var) {
            Objects.requireNonNull(fl3Var);
            actionEmitter.emitTo(new p001o.z1(fl3Var), new vve(fl3Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toObservable$2(StreamEmitter streamEmitter, q7c q7cVar) {
            NoOpConsumer noOpConsumerCreate = NoOpConsumer.create();
            Objects.requireNonNull(q7cVar);
            streamEmitter.streamTo(noOpConsumerCreate, new tve(q7cVar), new uve(q7cVar), new k6g(q7cVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$toSingle$1(ResultEmitter resultEmitter, auf aufVar) {
            Objects.requireNonNull(aufVar);
            resultEmitter.emitTo(new rve(aufVar), new sve(aufVar));
        }

        public static <E extends Throwable> xk3 toCompletable(final ActionEmitter<E> actionEmitter) {
            return xk3.m56389h(new nl3() { // from class: com.amplifyframework.rx.f
                @Override // p001o.nl3
                /* renamed from: a */
                public final void mo12392a(fl3 fl3Var) {
                    RxAdapters.VoidBehaviors.lambda$toCompletable$0(actionEmitter, fl3Var);
                }
            });
        }

        public static <S, T, E extends Throwable> x6c toObservable(final StreamEmitter<S, T, E> streamEmitter) {
            return x6c.m55706q(new m8c() { // from class: com.amplifyframework.rx.d
                @Override // p001o.m8c
                /* renamed from: a */
                public final void mo12393a(q7c q7cVar) {
                    RxAdapters.VoidBehaviors.lambda$toObservable$2(streamEmitter, q7cVar);
                }
            });
        }

        public static <T, E extends Throwable> wtf toSingle(final ResultEmitter<T, E> resultEmitter) {
            return wtf.m55005e(new muf() { // from class: com.amplifyframework.rx.e
                @Override // p001o.muf
                /* renamed from: a */
                public final void mo12390a(auf aufVar) {
                    RxAdapters.VoidBehaviors.lambda$toSingle$1(resultEmitter, aufVar);
                }
            });
        }
    }

    private RxAdapters() {
    }
}
