package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.PurchaseObject;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.PurchaseInfo;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.operations.TrackPurchaseOperation;
import com.onesignal.user.internal.operations.TrackSessionEndOperation;
import com.onesignal.user.internal.operations.TrackSessionStartOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.id5;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class UpdateUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final IRebuildUserService _buildUserService;
    private final IConsistencyManager _consistencyManager;
    private final IdentityModelStore _identityModelStore;
    private final NewRecordsState _newRecordState;
    private final PropertiesModelStore _propertiesModelStore;
    private final IUserBackendService _userBackend;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor", m36648f = "UpdateUserOperationExecutor.kt", m36649l = {Opcodes.D2I, Opcodes.DCMPG, 154}, m36650m = "execute")
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor$execute$1 */
    public static final class C118741 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C118741(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateUserOperationExecutor.this.execute(null, this);
        }
    }

    public UpdateUserOperationExecutor(IUserBackendService iUserBackendService, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, IRebuildUserService iRebuildUserService, NewRecordsState newRecordsState, IConsistencyManager iConsistencyManager) {
        sq8.m48649h(iUserBackendService, "_userBackend");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(iRebuildUserService, "_buildUserService");
        sq8.m48649h(newRecordsState, "_newRecordState");
        sq8.m48649h(iConsistencyManager, "_consistencyManager");
        this._userBackend = iUserBackendService;
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
        this._buildUserService = iRebuildUserService;
        this._newRecordState = newRecordsState;
        this._consistencyManager = iConsistencyManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0288 A[Catch: BackendException -> 0x007d, TryCatch #0 {BackendException -> 0x007d, blocks: (B:22:0x0078, B:93:0x0284, B:95:0x0288, B:99:0x02a0), top: B:147:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0 A[Catch: BackendException -> 0x007d, TRY_LEAVE, TryCatch #0 {BackendException -> 0x007d, blocks: (B:22:0x0078, B:93:0x0284, B:95:0x0288, B:99:0x02a0), top: B:147:0x0078 }] */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, n64 n64Var) throws Exception {
        C118741 c118741;
        String str;
        UpdateUserOperationExecutor updateUserOperationExecutor;
        String str2;
        String str3;
        UpdateUserOperationExecutor updateUserOperationExecutor2;
        int iIntValue;
        long sessionTime;
        BigDecimal amountSpent;
        List arrayList;
        RywData rywData;
        int i;
        ExecutionResponse executionResponse;
        List<? extends Operation> list2 = list;
        if (n64Var instanceof C118741) {
            c118741 = (C118741) n64Var;
            int i2 = c118741.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118741.label = i2 - Integer.MIN_VALUE;
            } else {
                c118741 = new C118741(n64Var);
            }
        }
        Object obj = c118741.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118741.label;
        int i4 = 1;
        if (i3 == 0) {
            wre.m54934b(obj);
            Logging.log(LogLevel.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
            PropertiesObject propertiesObject = new PropertiesObject(null, null, null, null, null, null, 63, null);
            PropertiesDeltasObject propertiesDeltasObject = new PropertiesDeltasObject(null, null, null, null, 15, null);
            PropertiesObject propertiesObjectCreatePropertiesFromOperation = propertiesObject;
            String onesignalId = null;
            PropertiesDeltasObject propertiesDeltasObject2 = propertiesDeltasObject;
            String appId = null;
            int i5 = 0;
            for (Operation operation : list) {
                if (operation instanceof SetTagOperation) {
                    if (appId == null) {
                        SetTagOperation setTagOperation = (SetTagOperation) operation;
                        appId = setTagOperation.getAppId();
                        onesignalId = setTagOperation.getOnesignalId();
                    }
                    propertiesObjectCreatePropertiesFromOperation = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetTagOperation) operation, propertiesObjectCreatePropertiesFromOperation);
                } else if (operation instanceof DeleteTagOperation) {
                    if (appId == null) {
                        DeleteTagOperation deleteTagOperation = (DeleteTagOperation) operation;
                        appId = deleteTagOperation.getAppId();
                        onesignalId = deleteTagOperation.getOnesignalId();
                    }
                    propertiesObjectCreatePropertiesFromOperation = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((DeleteTagOperation) operation, propertiesObjectCreatePropertiesFromOperation);
                } else if (operation instanceof SetPropertyOperation) {
                    if (appId == null) {
                        SetPropertyOperation setPropertyOperation = (SetPropertyOperation) operation;
                        appId = setPropertyOperation.getAppId();
                        onesignalId = setPropertyOperation.getOnesignalId();
                    }
                    propertiesObjectCreatePropertiesFromOperation = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetPropertyOperation) operation, propertiesObjectCreatePropertiesFromOperation);
                } else if (operation instanceof TrackSessionStartOperation) {
                    if (appId == null) {
                        TrackSessionStartOperation trackSessionStartOperation = (TrackSessionStartOperation) operation;
                        appId = trackSessionStartOperation.getAppId();
                        onesignalId = trackSessionStartOperation.getOnesignalId();
                    }
                    if (propertiesDeltasObject2.getSessionCount() != null) {
                        Integer sessionCount = propertiesDeltasObject2.getSessionCount();
                        sq8.m48646e(sessionCount);
                        iIntValue = sessionCount.intValue() + i4;
                    } else {
                        iIntValue = i4;
                    }
                    propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), ml1.m39304d(iIntValue), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                    i5 = i4;
                } else if (operation instanceof TrackSessionEndOperation) {
                    if (appId == null) {
                        TrackSessionEndOperation trackSessionEndOperation = (TrackSessionEndOperation) operation;
                        appId = trackSessionEndOperation.getAppId();
                        onesignalId = trackSessionEndOperation.getOnesignalId();
                    }
                    if (propertiesDeltasObject2.getSessionTime() != null) {
                        Long sessionTime2 = propertiesDeltasObject2.getSessionTime();
                        sq8.m48646e(sessionTime2);
                        sessionTime = sessionTime2.longValue() + ((TrackSessionEndOperation) operation).getSessionTime();
                    } else {
                        sessionTime = ((TrackSessionEndOperation) operation).getSessionTime();
                    }
                    propertiesDeltasObject2 = new PropertiesDeltasObject(ml1.m39305e(sessionTime), propertiesDeltasObject2.getSessionCount(), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                } else {
                    if (!(operation instanceof TrackPurchaseOperation)) {
                        throw new Exception("Unrecognized operation: " + operation);
                    }
                    if (appId == null) {
                        TrackPurchaseOperation trackPurchaseOperation = (TrackPurchaseOperation) operation;
                        appId = trackPurchaseOperation.getAppId();
                        onesignalId = trackPurchaseOperation.getOnesignalId();
                    }
                    if (propertiesDeltasObject2.getAmountSpent() != null) {
                        BigDecimal amountSpent2 = propertiesDeltasObject2.getAmountSpent();
                        sq8.m48646e(amountSpent2);
                        amountSpent = amountSpent2.add(((TrackPurchaseOperation) operation).getAmountSpent());
                        sq8.m48648g(amountSpent, "this.add(other)");
                    } else {
                        amountSpent = ((TrackPurchaseOperation) operation).getAmountSpent();
                    }
                    if (propertiesDeltasObject2.getPurchases() != null) {
                        List<PurchaseObject> purchases = propertiesDeltasObject2.getPurchases();
                        sq8.m48646e(purchases);
                        arrayList = kh3.T0(purchases);
                    } else {
                        arrayList = new ArrayList();
                    }
                    for (PurchaseInfo purchaseInfo : ((TrackPurchaseOperation) operation).getPurchases()) {
                        arrayList.add(new PurchaseObject(purchaseInfo.getSku(), purchaseInfo.getIso(), purchaseInfo.getAmount()));
                        onesignalId = onesignalId;
                    }
                    propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), propertiesDeltasObject2.getSessionCount(), amountSpent, arrayList);
                    onesignalId = onesignalId;
                    i4 = 1;
                }
            }
            if (appId != null && onesignalId != null) {
                try {
                    IUserBackendService iUserBackendService = this._userBackend;
                    boolean z = i5 != 0;
                    c118741.L$0 = this;
                    c118741.L$1 = list2;
                    c118741.L$2 = appId;
                    c118741.L$3 = onesignalId;
                    c118741.label = 1;
                    str = appId;
                    try {
                        Object objUpdateUser = iUserBackendService.updateUser(appId, IdentityConstants.ONESIGNAL_ID, onesignalId, propertiesObjectCreatePropertiesFromOperation, z, propertiesDeltasObject2, c118741);
                        if (objUpdateUser == objM51918f) {
                            return objM51918f;
                        }
                        updateUserOperationExecutor2 = this;
                        str3 = str;
                        str2 = onesignalId;
                        obj = objUpdateUser;
                        rywData = (RywData) obj;
                        if (rywData == null) {
                        }
                        updateUserOperationExecutor = updateUserOperationExecutor2;
                    } catch (BackendException e) {
                        e = e;
                        updateUserOperationExecutor = this;
                        str2 = onesignalId;
                        str3 = str;
                        i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i == 1) {
                        }
                        return executionResponse;
                    }
                } catch (BackendException e2) {
                    e = e2;
                    str = appId;
                }
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        }
        if (i3 == 1) {
            str2 = (String) c118741.L$3;
            str3 = (String) c118741.L$2;
            list2 = (List) c118741.L$1;
            updateUserOperationExecutor2 = (UpdateUserOperationExecutor) c118741.L$0;
            try {
                wre.m54934b(obj);
                rywData = (RywData) obj;
                if (rywData == null) {
                    IConsistencyManager iConsistencyManager = updateUserOperationExecutor2._consistencyManager;
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.USER;
                    c118741.L$0 = updateUserOperationExecutor2;
                    c118741.L$1 = list2;
                    c118741.L$2 = str3;
                    c118741.L$3 = str2;
                    c118741.label = 2;
                    if (iConsistencyManager.setRywData(str2, iamFetchRywTokenKey, rywData, c118741) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    IConsistencyManager iConsistencyManager2 = updateUserOperationExecutor2._consistencyManager;
                    c118741.L$0 = updateUserOperationExecutor2;
                    c118741.L$1 = list2;
                    c118741.L$2 = str3;
                    c118741.L$3 = str2;
                    c118741.label = 3;
                    if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, c118741) == objM51918f) {
                        return objM51918f;
                    }
                }
                updateUserOperationExecutor = updateUserOperationExecutor2;
            } catch (BackendException e3) {
                e = e3;
                updateUserOperationExecutor = updateUserOperationExecutor2;
                i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i == 1) {
                    executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && updateUserOperationExecutor._newRecordState.isInMissingRetryWindow(str2)) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<Operation> rebuildOperationsIfCurrentUser = updateUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(str3, str2);
                        return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                    executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                return executionResponse;
            }
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c118741.L$3;
            str3 = (String) c118741.L$2;
            list2 = (List) c118741.L$1;
            updateUserOperationExecutor = (UpdateUserOperationExecutor) c118741.L$0;
            try {
                wre.m54934b(obj);
            } catch (BackendException e4) {
                e = e4;
                i = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i == 1) {
                }
                return executionResponse;
            }
        }
        if (sq8.m48644c(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str2)) {
            for (Operation operation2 : list2) {
                if (operation2 instanceof SetTagOperation) {
                    Model.setStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((SetTagOperation) operation2).getKey(), ((SetTagOperation) operation2).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                } else if (operation2 instanceof DeleteTagOperation) {
                    Model.setOptStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((DeleteTagOperation) operation2).getKey(), null, ModelChangeTags.HYDRATE, false, 8, null);
                } else if (operation2 instanceof SetPropertyOperation) {
                    Model.setOptAnyProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel(), ((SetPropertyOperation) operation2).getProperty(), ((SetPropertyOperation) operation2).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                }
            }
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return ch3.m21249n(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
