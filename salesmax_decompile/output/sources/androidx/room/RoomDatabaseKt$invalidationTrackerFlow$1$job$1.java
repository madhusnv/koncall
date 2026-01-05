package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p001o.gp0;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.ljd;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.qe9;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", m36648f = "RoomDatabaseExt.kt", m36649l = {230}, m36650m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RoomDatabaseKt$invalidationTrackerFlow$1$job$1 extends jgg implements nl7 {
    final /* synthetic */ ljd $$this$callbackFlow;
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ AtomicBoolean $ignoreInvalidation;
    final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 $observer;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1$job$1(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1, boolean z, ljd ljdVar, String[] strArr, AtomicBoolean atomicBoolean, n64 n64Var) {
        super(2, n64Var);
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$observer = roomDatabaseKt$invalidationTrackerFlow$1$observer$1;
        this.$emitInitialState = z;
        this.$$this$callbackFlow = ljdVar;
        this.$tables = strArr;
        this.$ignoreInvalidation = atomicBoolean;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, this.$observer, this.$emitInitialState, this.$$this$callbackFlow, this.$tables, this.$ignoreInvalidation, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        try {
            if (i == 0) {
                wre.m54934b(obj);
                this.$this_invalidationTrackerFlow.getInvalidationTracker().addObserver(this.$observer);
                if (this.$emitInitialState) {
                    this.$$this$callbackFlow.mo23472g(gp0.K0(this.$tables));
                }
                this.$ignoreInvalidation.set(false);
                this.label = 1;
                if (nk5.m40719a(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            throw new qe9();
        } catch (Throwable th) {
            this.$this_invalidationTrackerFlow.getInvalidationTracker().removeObserver(this.$observer);
            throw th;
        }
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1$job$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
