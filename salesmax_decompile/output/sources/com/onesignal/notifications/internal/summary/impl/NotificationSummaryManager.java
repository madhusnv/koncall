package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import com.google.api.Service;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationSummaryManager implements INotificationSummaryManager {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationRestoreProcessor _notificationRestoreProcessor;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;
    private final ITime _time;

    @l75(m36647c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", m36648f = "NotificationSummaryManager.kt", m36649l = {Opcodes.DADD, Opcodes.LDIV, Opcodes.FNEG}, m36650m = "clearNotificationOnSummaryClick")
    /* renamed from: com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager$clearNotificationOnSummaryClick$1 */
    public static final class C118171 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C118171(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationSummaryManager.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", m36648f = "NotificationSummaryManager.kt", m36649l = {um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 48, Opcodes.V15, TypeReference.INSTANCEOF, Opcodes.FASTORE}, m36650m = "internalUpdateSummaryNotificationAfterChildRemoved")
    /* renamed from: com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 */
    public static final class C118181 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C118181(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationSummaryManager.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", m36648f = "NotificationSummaryManager.kt", m36649l = {Opcodes.POP2, Opcodes.DUP_X1}, m36650m = "restoreSummary")
    /* renamed from: com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager$restoreSummary$1 */
    public static final class C118191 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118191(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationSummaryManager.this.restoreSummary(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", m36648f = "NotificationSummaryManager.kt", m36649l = {25, Service.MONITORING_FIELD_NUMBER}, m36650m = "updatePossibleDependentSummaryOnDismiss")
    /* renamed from: com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 */
    public static final class C118201 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118201(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationSummaryManager.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public NotificationSummaryManager(IApplicationService iApplicationService, INotificationRepository iNotificationRepository, ISummaryNotificationDisplayer iSummaryNotificationDisplayer, ConfigModelStore configModelStore, INotificationRestoreProcessor iNotificationRestoreProcessor, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(iSummaryNotificationDisplayer, "_summaryNotificationDisplayer");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iNotificationRestoreProcessor, "_notificationRestoreProcessor");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._dataController = iNotificationRepository;
        this._summaryNotificationDisplayer = iSummaryNotificationDisplayer;
        this._configModelStore = configModelStore;
        this._notificationRestoreProcessor = iNotificationRestoreProcessor;
        this._time = iTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z, n64 n64Var) {
        C118181 c118181;
        NotificationSummaryManager notificationSummaryManager;
        List list;
        String str2;
        int i;
        Integer num;
        if (n64Var instanceof C118181) {
            c118181 = (C118181) n64Var;
            int i2 = c118181.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118181.label = i2 - Integer.MIN_VALUE;
            } else {
                c118181 = new C118181(n64Var);
            }
        }
        C118181 c1181812 = c118181;
        Object objListNotificationsForGroup = c1181812.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c1181812.label;
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i3 == 0) {
            wre.m54934b(objListNotificationsForGroup);
            INotificationRepository iNotificationRepository = this._dataController;
            c1181812.L$0 = this;
            c1181812.L$1 = str;
            c1181812.Z$0 = z;
            c1181812.label = 1;
            objListNotificationsForGroup = iNotificationRepository.listNotificationsForGroup(str, c1181812);
            if (objListNotificationsForGroup == objM51918f) {
                return objM51918f;
            }
            notificationSummaryManager = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        wre.m54934b(objListNotificationsForGroup);
                        return y3i.f54824a;
                    }
                    if (i3 == 4) {
                        wre.m54934b(objListNotificationsForGroup);
                        return y3i.f54824a;
                    }
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objListNotificationsForGroup);
                    return y3i.f54824a;
                }
                i = c1181812.I$0;
                z = c1181812.Z$0;
                list = (List) c1181812.L$2;
                str2 = (String) c1181812.L$1;
                notificationSummaryManager = (NotificationSummaryManager) c1181812.L$0;
                wre.m54934b(objListNotificationsForGroup);
                num = (Integer) objListNotificationsForGroup;
                if (num != null) {
                    return y3i.f54824a;
                }
                int iIntValue = num.intValue();
                if (i == 0) {
                    NotificationHelper.INSTANCE.getNotificationManager(notificationSummaryManager._applicationService.getAppContext()).cancel(iIntValue);
                    INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                    c1181812.L$0 = null;
                    c1181812.L$1 = null;
                    c1181812.L$2 = null;
                    c1181812.label = 3;
                    if (INotificationRepository.DefaultImpls.markAsConsumed$default(iNotificationRepository2, iIntValue, z, null, false, c1181812, 12, null) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                if (i == 1) {
                    c1181812.L$0 = null;
                    c1181812.L$1 = null;
                    c1181812.L$2 = null;
                    c1181812.label = 4;
                    if (notificationSummaryManager.restoreSummary(str2, c1181812) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) kh3.f0(list);
                NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(new JSONObject(notificationData.getFullData()), notificationSummaryManager._time);
                notificationGenerationJob.setRestoring(true);
                notificationGenerationJob.setShownTimeStamp(ml1.m39305e(notificationData.getCreatedAt()));
                ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationSummaryManager._summaryNotificationDisplayer;
                c1181812.L$0 = null;
                c1181812.L$1 = null;
                c1181812.L$2 = null;
                c1181812.label = 5;
                if (iSummaryNotificationDisplayer.updateSummaryNotification(notificationGenerationJob, c1181812) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            z = c1181812.Z$0;
            str = (String) c1181812.L$1;
            NotificationSummaryManager notificationSummaryManager2 = (NotificationSummaryManager) c1181812.L$0;
            wre.m54934b(objListNotificationsForGroup);
            notificationSummaryManager = notificationSummaryManager2;
        }
        list = (List) objListNotificationsForGroup;
        int size = list.size();
        INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
        c1181812.L$0 = notificationSummaryManager;
        c1181812.L$1 = str;
        c1181812.L$2 = list;
        c1181812.Z$0 = z;
        c1181812.I$0 = size;
        c1181812.label = 2;
        Object androidIdForGroup = iNotificationRepository3.getAndroidIdForGroup(str, true, c1181812);
        if (androidIdForGroup == objM51918f) {
            return objM51918f;
        }
        str2 = str;
        i = size;
        objListNotificationsForGroup = androidIdForGroup;
        num = (Integer) objListNotificationsForGroup;
        if (num != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, n64 n64Var) {
        C118191 c118191;
        NotificationSummaryManager notificationSummaryManager;
        NotificationSummaryManager notificationSummaryManager2;
        Iterator it;
        if (n64Var instanceof C118191) {
            c118191 = (C118191) n64Var;
            int i = c118191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118191.label = i - Integer.MIN_VALUE;
            } else {
                c118191 = new C118191(n64Var);
            }
        }
        Object objListNotificationsForGroup = c118191.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118191.label;
        if (i2 == 0) {
            wre.m54934b(objListNotificationsForGroup);
            INotificationRepository iNotificationRepository = this._dataController;
            c118191.L$0 = this;
            c118191.label = 1;
            objListNotificationsForGroup = iNotificationRepository.listNotificationsForGroup(str, c118191);
            if (objListNotificationsForGroup == objM51918f) {
                return objM51918f;
            }
            notificationSummaryManager = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c118191.L$1;
                notificationSummaryManager2 = (NotificationSummaryManager) c118191.L$0;
                wre.m54934b(objListNotificationsForGroup);
                while (it.hasNext()) {
                    INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                    INotificationRestoreProcessor iNotificationRestoreProcessor = notificationSummaryManager2._notificationRestoreProcessor;
                    c118191.L$0 = notificationSummaryManager2;
                    c118191.L$1 = it;
                    c118191.label = 2;
                    if (INotificationRestoreProcessor.DefaultImpls.processNotification$default(iNotificationRestoreProcessor, notificationData, 0, c118191, 2, null) == objM51918f) {
                        return objM51918f;
                    }
                }
                return y3i.f54824a;
            }
            notificationSummaryManager = (NotificationSummaryManager) c118191.L$0;
            wre.m54934b(objListNotificationsForGroup);
        }
        notificationSummaryManager2 = notificationSummaryManager;
        it = ((List) objListNotificationsForGroup).iterator();
        while (it.hasNext()) {
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, n64 n64Var) {
        C118171 c118171;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        NotificationSummaryManager notificationSummaryManager;
        NotificationManager notificationManager2;
        Integer numM39304d;
        if (n64Var instanceof C118171) {
            c118171 = (C118171) n64Var;
            int i = c118171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118171.label = i - Integer.MIN_VALUE;
            } else {
                c118171 = new C118171(n64Var);
            }
        }
        Object obj = c118171.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118171.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            notificationManager = NotificationHelper.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
            INotificationRepository iNotificationRepository = this._dataController;
            c118171.L$0 = this;
            c118171.L$1 = str;
            c118171.L$2 = notificationManager;
            c118171.label = 1;
            androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(str, false, c118171);
            if (androidIdForGroup == objM51918f) {
                return objM51918f;
            }
            notificationSummaryManager = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                notificationManager2 = (NotificationManager) c118171.L$0;
                wre.m54934b(obj);
                Integer num = (Integer) obj;
                notificationManager = notificationManager2;
                numM39304d = num;
                if (numM39304d != null) {
                    notificationManager.cancel(numM39304d.intValue());
                }
                return y3i.f54824a;
            }
            NotificationManager notificationManager3 = (NotificationManager) c118171.L$2;
            String str2 = (String) c118171.L$1;
            notificationSummaryManager = (NotificationSummaryManager) c118171.L$0;
            wre.m54934b(obj);
            notificationManager = notificationManager3;
            str = str2;
            androidIdForGroup = obj;
        }
        Integer num2 = (Integer) androidIdForGroup;
        if (num2 != null) {
            if (!notificationSummaryManager._configModelStore.getModel().getClearGroupOnSummaryClick()) {
                INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                int iIntValue = num2.intValue();
                c118171.L$0 = null;
                c118171.L$1 = null;
                c118171.L$2 = null;
                c118171.label = 3;
                if (iNotificationRepository2.markAsDismissed(iIntValue, c118171) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            if (sq8.m48644c(str, NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
                numM39304d = ml1.m39304d(NotificationHelper.GROUPLESS_SUMMARY_ID);
                if (numM39304d != null) {
                }
            } else {
                INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
                c118171.L$0 = notificationManager;
                c118171.L$1 = null;
                c118171.L$2 = null;
                c118171.label = 2;
                Object androidIdForGroup2 = iNotificationRepository3.getAndroidIdForGroup(str, true, c118171);
                if (androidIdForGroup2 == objM51918f) {
                    return objM51918f;
                }
                NotificationManager notificationManager4 = notificationManager;
                obj = androidIdForGroup2;
                notificationManager2 = notificationManager4;
                Integer num3 = (Integer) obj;
                notificationManager = notificationManager2;
                numM39304d = num3;
                if (numM39304d != null) {
                }
            }
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i, n64 n64Var) {
        C118201 c118201;
        NotificationSummaryManager notificationSummaryManager;
        if (n64Var instanceof C118201) {
            c118201 = (C118201) n64Var;
            int i2 = c118201.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c118201.label = i2 - Integer.MIN_VALUE;
            } else {
                c118201 = new C118201(n64Var);
            }
        }
        Object groupId = c118201.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c118201.label;
        if (i3 == 0) {
            wre.m54934b(groupId);
            INotificationRepository iNotificationRepository = this._dataController;
            c118201.L$0 = this;
            c118201.label = 1;
            groupId = iNotificationRepository.getGroupId(i, c118201);
            if (groupId == objM51918f) {
                return objM51918f;
            }
            notificationSummaryManager = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(groupId);
                return y3i.f54824a;
            }
            notificationSummaryManager = (NotificationSummaryManager) c118201.L$0;
            wre.m54934b(groupId);
        }
        String str = (String) groupId;
        if (str == null) {
            return y3i.f54824a;
        }
        c118201.L$0 = null;
        c118201.label = 2;
        if (notificationSummaryManager.internalUpdateSummaryNotificationAfterChildRemoved(str, true, c118201) == objM51918f) {
            return objM51918f;
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, n64 n64Var) {
        Object objInternalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z, n64Var);
        return objInternalUpdateSummaryNotificationAfterChildRemoved == uq8.m51918f() ? objInternalUpdateSummaryNotificationAfterChildRemoved : y3i.f54824a;
    }
}
