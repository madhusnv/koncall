package com.onesignal.notifications.internal.limiting.impl;

import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.objectweb.asm.Opcodes;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationLimitManager implements INotificationLimitManager {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationSummaryManager _notificationSummaryManager;

    @l75(m36647c = "com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager", m36648f = "NotificationLimitManager.kt", m36649l = {21, 23, 30}, m36650m = "clearOldestOverLimit")
    /* renamed from: com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager$clearOldestOverLimit$1 */
    public static final class C117841 extends o64 {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117841(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationLimitManager.this.clearOldestOverLimit(0, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager", m36648f = "NotificationLimitManager.kt", m36649l = {57, Opcodes.V16}, m36650m = "clearOldestOverLimitStandard")
    /* renamed from: com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager$clearOldestOverLimitStandard$1 */
    public static final class C117851 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C117851(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationLimitManager.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public NotificationLimitManager(INotificationRepository iNotificationRepository, IApplicationService iApplicationService, INotificationSummaryManager iNotificationSummaryManager) {
        sq8.m48649h(iNotificationRepository, "_dataController");
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationSummaryManager, "_notificationSummaryManager");
        this._dataController = iNotificationRepository;
        this._applicationService = iApplicationService;
        this._notificationSummaryManager = iNotificationSummaryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fb -> B:39:0x00fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ff -> B:41:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i, n64 n64Var) {
        C117851 c117851;
        int length;
        Iterator it;
        NotificationLimitManager notificationLimitManager;
        int i2;
        NotificationLimitManager notificationLimitManager2;
        Iterator it2;
        Integer num;
        if (n64Var instanceof C117851) {
            c117851 = (C117851) n64Var;
            int i3 = c117851.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c117851.label = i3 - Integer.MIN_VALUE;
            } else {
                c117851 = new C117851(n64Var);
            }
        }
        Object obj = c117851.result;
        Object objM51918f = uq8.m51918f();
        int i4 = c117851.label;
        if (i4 == 0) {
            wre.m54934b(obj);
            StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
            length = (activeNotifications.length - INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()) + i;
            if (length < 1) {
                return y3i.f54824a;
            }
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (!NotificationHelper.INSTANCE.isGroupSummary(statusBarNotification)) {
                    treeMap.put(ml1.m39305e(statusBarNotification.getNotification().when), ml1.m39304d(statusBarNotification.getId()));
                }
            }
            it = treeMap.entrySet().iterator();
            notificationLimitManager = this;
            if (it.hasNext()) {
            }
            return y3i.f54824a;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c117851.I$0;
            Iterator it3 = (Iterator) c117851.L$1;
            NotificationLimitManager notificationLimitManager3 = (NotificationLimitManager) c117851.L$0;
            wre.m54934b(obj);
            notificationLimitManager = notificationLimitManager3;
            int i5 = i2 - 1;
            if (i5 > 0) {
                Iterator it4 = it3;
                length = i5;
                it = it4;
                if (it.hasNext()) {
                    Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                    INotificationRepository iNotificationRepository = notificationLimitManager._dataController;
                    sq8.m48648g(num2, "value");
                    int iIntValue = num2.intValue();
                    c117851.L$0 = notificationLimitManager;
                    c117851.L$1 = it;
                    c117851.L$2 = num2;
                    c117851.I$0 = length;
                    c117851.label = 1;
                    Object objMarkAsDismissed = iNotificationRepository.markAsDismissed(iIntValue, c117851);
                    if (objMarkAsDismissed == objM51918f) {
                        return objM51918f;
                    }
                    it2 = it;
                    i2 = length;
                    num = num2;
                    notificationLimitManager2 = notificationLimitManager;
                    obj = objMarkAsDismissed;
                    if (((Boolean) obj).booleanValue()) {
                        it3 = it2;
                        notificationLimitManager = notificationLimitManager2;
                        int i52 = i2 - 1;
                        if (i52 > 0) {
                        }
                    } else {
                        INotificationSummaryManager iNotificationSummaryManager = notificationLimitManager2._notificationSummaryManager;
                        sq8.m48648g(num, "value");
                        int iIntValue2 = num.intValue();
                        c117851.L$0 = notificationLimitManager2;
                        c117851.L$1 = it2;
                        c117851.L$2 = null;
                        c117851.I$0 = i2;
                        c117851.label = 2;
                        if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(iIntValue2, c117851) == objM51918f) {
                            return objM51918f;
                        }
                        it3 = it2;
                        notificationLimitManager3 = notificationLimitManager2;
                        notificationLimitManager = notificationLimitManager3;
                        int i522 = i2 - 1;
                        if (i522 > 0) {
                        }
                    }
                }
            }
            return y3i.f54824a;
        }
        i2 = c117851.I$0;
        num = (Integer) c117851.L$2;
        it2 = (Iterator) c117851.L$1;
        notificationLimitManager2 = (NotificationLimitManager) c117851.L$0;
        wre.m54934b(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.limiting.INotificationLimitManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i, n64 n64Var) {
        C117841 c117841;
        NotificationLimitManager notificationLimitManager;
        INotificationRepository iNotificationRepository;
        int maxNumberOfNotifications;
        if (n64Var instanceof C117841) {
            c117841 = (C117841) n64Var;
            int i2 = c117841.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c117841.label = i2 - Integer.MIN_VALUE;
            } else {
                c117841 = new C117841(n64Var);
            }
        }
        Object obj = c117841.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c117841.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            try {
                c117841.L$0 = this;
                c117841.I$0 = i;
                c117841.label = 1;
                if (clearOldestOverLimitStandard(i, c117841) == objM51918f) {
                    return objM51918f;
                }
            } catch (Throwable unused) {
                notificationLimitManager = this;
                iNotificationRepository = notificationLimitManager._dataController;
                maxNumberOfNotifications = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                c117841.L$0 = null;
                c117841.label = 3;
                if (iNotificationRepository.clearOldestOverLimitFallback(i, maxNumberOfNotifications, c117841) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
        } else if (i3 == 1 || i3 == 2) {
            i = c117841.I$0;
            notificationLimitManager = (NotificationLimitManager) c117841.L$0;
            try {
                wre.m54934b(obj);
            } catch (Throwable unused2) {
                iNotificationRepository = notificationLimitManager._dataController;
                maxNumberOfNotifications = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                c117841.L$0 = null;
                c117841.label = 3;
                if (iNotificationRepository.clearOldestOverLimitFallback(i, maxNumberOfNotifications, c117841) == objM51918f) {
                }
                return y3i.f54824a;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return y3i.f54824a;
    }
}
