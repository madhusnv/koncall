package com.onesignal.common.consistency.impl;

import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import com.onesignal.common.consistency.models.IConsistencyManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.cl3;
import p001o.el3;
import p001o.hwc;
import p001o.l75;
import p001o.n64;
import p001o.nqb;
import p001o.o64;
import p001o.sq8;
import p001o.tqb;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ConsistencyManager implements IConsistencyManager {
    private final nqb mutex = tqb.m50340b(false, 1, null);
    private final Map<String, Map<IConsistencyKeyEnum, RywData>> indexedTokens = new LinkedHashMap();
    private final List<hwc> conditions = new ArrayList();

    @l75(m36647c = "com.onesignal.common.consistency.impl.ConsistencyManager", m36648f = "ConsistencyManager.kt", m36649l = {100}, m36650m = "getRywDataFromAwaitableCondition")
    /* renamed from: com.onesignal.common.consistency.impl.ConsistencyManager$getRywDataFromAwaitableCondition$1 */
    public static final class C115731 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C115731(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsistencyManager.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.common.consistency.impl.ConsistencyManager", m36648f = "ConsistencyManager.kt", m36649l = {100}, m36650m = "setRywData")
    /* renamed from: com.onesignal.common.consistency.impl.ConsistencyManager$setRywData$1 */
    public static final class C115741 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C115741(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsistencyManager.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (hwc hwcVar : this.conditions) {
            ICondition iCondition = (ICondition) hwcVar.m31227a();
            cl3 cl3Var = (cl3) hwcVar.m31228b();
            if (iCondition.isMet(this.indexedTokens)) {
                RywData rywData = iCondition.getRywData(this.indexedTokens);
                if (!cl3Var.mo22414J()) {
                    cl3Var.complete(rywData);
                }
                arrayList.add(new hwc(iCondition, cl3Var));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(ICondition iCondition, n64 n64Var) {
        C115731 c115731;
        nqb nqbVar;
        ConsistencyManager consistencyManager;
        if (n64Var instanceof C115731) {
            c115731 = (C115731) n64Var;
            int i = c115731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115731.label = i - Integer.MIN_VALUE;
            } else {
                c115731 = new C115731(n64Var);
            }
        }
        Object obj = c115731.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c115731.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqbVar = this.mutex;
            c115731.L$0 = this;
            c115731.L$1 = iCondition;
            c115731.L$2 = nqbVar;
            c115731.label = 1;
            if (nqbVar.mo40922b(null, c115731) == objM51918f) {
                return objM51918f;
            }
            consistencyManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqb nqbVar2 = (nqb) c115731.L$2;
            ICondition iCondition2 = (ICondition) c115731.L$1;
            consistencyManager = (ConsistencyManager) c115731.L$0;
            wre.m54934b(obj);
            nqbVar = nqbVar2;
            iCondition = iCondition2;
        }
        try {
            cl3 cl3VarM25197b = el3.m25197b(null, 1, null);
            consistencyManager.conditions.add(new hwc(iCondition, cl3VarM25197b));
            consistencyManager.checkConditionsAndComplete();
            return cl3VarM25197b;
        } finally {
            nqbVar.mo40923c(null);
        }
    }

    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    public Object resolveConditionsWithID(String str, n64 n64Var) {
        ArrayList arrayList = new ArrayList();
        for (hwc hwcVar : this.conditions) {
            ICondition iCondition = (ICondition) hwcVar.m31227a();
            cl3 cl3Var = (cl3) hwcVar.m31228b();
            if (sq8.m48644c(iCondition.getId(), str) && !cl3Var.mo22414J()) {
                cl3Var.complete(null);
            }
            arrayList.add(new hwc(iCondition, cl3Var));
        }
        this.conditions.removeAll(arrayList);
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, IConsistencyKeyEnum iConsistencyKeyEnum, RywData rywData, n64 n64Var) {
        C115741 c115741;
        nqb nqbVar;
        ConsistencyManager consistencyManager;
        if (n64Var instanceof C115741) {
            c115741 = (C115741) n64Var;
            int i = c115741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115741.label = i - Integer.MIN_VALUE;
            } else {
                c115741 = new C115741(n64Var);
            }
        }
        Object obj = c115741.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c115741.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqbVar = this.mutex;
            c115741.L$0 = this;
            c115741.L$1 = str;
            c115741.L$2 = iConsistencyKeyEnum;
            c115741.L$3 = rywData;
            c115741.L$4 = nqbVar;
            c115741.label = 1;
            if (nqbVar.mo40922b(null, c115741) == objM51918f) {
                return objM51918f;
            }
            consistencyManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqb nqbVar2 = (nqb) c115741.L$4;
            rywData = (RywData) c115741.L$3;
            iConsistencyKeyEnum = (IConsistencyKeyEnum) c115741.L$2;
            String str2 = (String) c115741.L$1;
            consistencyManager = (ConsistencyManager) c115741.L$0;
            wre.m54934b(obj);
            nqbVar = nqbVar2;
            str = str2;
        }
        try {
            Map<String, Map<IConsistencyKeyEnum, RywData>> map = consistencyManager.indexedTokens;
            Map<IConsistencyKeyEnum, RywData> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(iConsistencyKeyEnum, rywData);
            consistencyManager.checkConditionsAndComplete();
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }
}
