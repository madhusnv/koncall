package com.onesignal.inAppMessages.internal.lifecycle.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class IAMLifecycleService extends EventProducer<IInAppLifecycleEventHandler> implements IInAppLifecycleService {

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageActionOccurredOnMessage$1 */
    public static final class C116851 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessageClickResult $action;
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116851(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
            super(1);
            this.$message = inAppMessage;
            this.$action = inAppMessageClickResult;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageActionOccurredOnPreview$1 */
    public static final class C116861 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessageClickResult $action;
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116861(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
            super(1);
            this.$message = inAppMessage;
            this.$action = inAppMessageClickResult;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messagePageChanged$1 */
    public static final class C116871 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;
        final /* synthetic */ InAppMessagePage $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116871(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage) {
            super(1);
            this.$message = inAppMessage;
            this.$page = inAppMessagePage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessagePageChanged(this.$message, this.$page);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageWasDismissed$1 */
    public static final class C116881 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116881(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageWasDismissed(this.$message);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageWasDisplayed$1 */
    public static final class C116891 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116891(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageWasDisplayed(this.$message);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageWillDismiss$1 */
    public static final class C116901 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116901(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageWillDismiss(this.$message);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.IAMLifecycleService$messageWillDisplay$1 */
    public static final class C116911 extends kf9 implements xk7 {
        final /* synthetic */ InAppMessage $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116911(InAppMessage inAppMessage) {
            super(1);
            this.$message = inAppMessage;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppLifecycleEventHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(IInAppLifecycleEventHandler iInAppLifecycleEventHandler) {
            sq8.m48649h(iInAppLifecycleEventHandler, "it");
            iInAppLifecycleEventHandler.onMessageWillDisplay(this.$message);
        }
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageActionOccurredOnMessage(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessageClickResult, "action");
        fire(new C116851(inAppMessage, inAppMessageClickResult));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageActionOccurredOnPreview(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessageClickResult, "action");
        fire(new C116861(inAppMessage, inAppMessageClickResult));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messagePageChanged(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(inAppMessagePage, "page");
        fire(new C116871(inAppMessage, inAppMessagePage));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWasDismissed(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        fire(new C116881(inAppMessage));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWasDisplayed(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        fire(new C116891(inAppMessage));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWillDismiss(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        fire(new C116901(inAppMessage));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWillDisplay(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        fire(new C116911(inAppMessage));
    }
}
