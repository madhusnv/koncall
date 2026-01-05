package com.onesignal.user.internal.subscriptions.impl;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.IModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.EmailSubscription;
import com.onesignal.user.internal.PushSubscription;
import com.onesignal.user.internal.SmsSubscription;
import com.onesignal.user.internal.Subscription;
import com.onesignal.user.internal.UninitializedPushSubscription;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionList;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import com.onesignal.user.subscriptions.IEmailSubscription;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.ISmsSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import java.util.Iterator;
import java.util.List;
import p001o.ch3;
import p001o.kf9;
import p001o.kh3;
import p001o.sq8;
import p001o.szb;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SubscriptionManager implements ISubscriptionManager, IModelStoreChangeHandler<SubscriptionModel>, ISessionLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ISessionService _sessionService;
    private final SubscriptionModelStore _subscriptionModelStore;
    private final EventProducer<ISubscriptionChangedHandler> events;
    private SubscriptionList subscriptions;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            iArr[SubscriptionType.SMS.ordinal()] = 1;
            iArr[SubscriptionType.EMAIL.ordinal()] = 2;
            iArr[SubscriptionType.PUSH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.SubscriptionManager$createSubscriptionAndAddToSubscriptionList$1 */
    public static final class C118771 extends kf9 implements xk7 {
        final /* synthetic */ ISubscription $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118771(ISubscription iSubscription) {
            super(1);
            this.$subscription = iSubscription;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISubscriptionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISubscriptionChangedHandler iSubscriptionChangedHandler) {
            sq8.m48649h(iSubscriptionChangedHandler, "it");
            iSubscriptionChangedHandler.onSubscriptionAdded(this.$subscription);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.SubscriptionManager$onModelUpdated$1 */
    public static final class C118781 extends kf9 implements xk7 {
        final /* synthetic */ ISubscription $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118781(ISubscription iSubscription) {
            super(1);
            this.$subscription = iSubscription;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IPushSubscriptionObserver) obj);
            return y3i.f54824a;
        }

        public final void invoke(IPushSubscriptionObserver iPushSubscriptionObserver) {
            sq8.m48649h(iPushSubscriptionObserver, "it");
            iPushSubscriptionObserver.onPushSubscriptionChange(new PushSubscriptionChangedState(((PushSubscription) this.$subscription).getSavedState(), ((PushSubscription) this.$subscription).refreshState()));
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.SubscriptionManager$onModelUpdated$2 */
    public static final class C118792 extends kf9 implements xk7 {
        final /* synthetic */ ModelChangedArgs $args;
        final /* synthetic */ ISubscription $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118792(ISubscription iSubscription, ModelChangedArgs modelChangedArgs) {
            super(1);
            this.$subscription = iSubscription;
            this.$args = modelChangedArgs;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISubscriptionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISubscriptionChangedHandler iSubscriptionChangedHandler) {
            sq8.m48649h(iSubscriptionChangedHandler, "it");
            iSubscriptionChangedHandler.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.SubscriptionManager$removeSubscriptionFromSubscriptionList$1 */
    public static final class C118801 extends kf9 implements xk7 {
        final /* synthetic */ ISubscription $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118801(ISubscription iSubscription) {
            super(1);
            this.$subscription = iSubscription;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ISubscriptionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ISubscriptionChangedHandler iSubscriptionChangedHandler) {
            sq8.m48649h(iSubscriptionChangedHandler, "it");
            iSubscriptionChangedHandler.onSubscriptionRemoved(this.$subscription);
        }
    }

    public SubscriptionManager(IApplicationService iApplicationService, ISessionService iSessionService, SubscriptionModelStore subscriptionModelStore) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iSessionService, "_sessionService");
        sq8.m48649h(subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = iApplicationService;
        this._sessionService = iSessionService;
        this._subscriptionModelStore = subscriptionModelStore;
        this.events = new EventProducer<>();
        this.subscriptions = new SubscriptionList(ch3.m21246k(), new UninitializedPushSubscription());
        Iterator it = subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((SubscriptionModel) it.next());
        }
        this._subscriptionModelStore.subscribe((IModelStoreChangeHandler) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(SubscriptionType subscriptionType, String str, SubscriptionStatus subscriptionStatus) {
        Logging.log(LogLevel.DEBUG, "SubscriptionManager.addSubscription(type: " + subscriptionType + ", address: " + str + ')');
        SubscriptionModel subscriptionModel = new SubscriptionModel();
        subscriptionModel.setId(IDManager.INSTANCE.createLocalId());
        subscriptionModel.setOptedIn(true);
        subscriptionModel.setType(subscriptionType);
        subscriptionModel.setAddress(str);
        if (subscriptionStatus == null) {
            subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
        }
        subscriptionModel.setStatus(subscriptionStatus);
        IModelStore.DefaultImpls.add$default(this._subscriptionModelStore, subscriptionModel, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(SubscriptionManager subscriptionManager, SubscriptionType subscriptionType, String str, SubscriptionStatus subscriptionStatus, int i, Object obj) {
        if ((i & 4) != 0) {
            subscriptionStatus = null;
        }
        subscriptionManager.addSubscriptionToModels(subscriptionType, str, subscriptionStatus);
    }

    private final void createSubscriptionAndAddToSubscriptionList(SubscriptionModel subscriptionModel) {
        ISubscription iSubscriptionCreateSubscriptionFromModel = createSubscriptionFromModel(subscriptionModel);
        List listT0 = kh3.T0(getSubscriptions().getCollection());
        if (subscriptionModel.getType() == SubscriptionType.PUSH) {
            IPushSubscription push = getSubscriptions().getPush();
            sq8.m48647f(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            PushSubscription pushSubscription = (PushSubscription) push;
            sq8.m48647f(iSubscriptionCreateSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((PushSubscription) iSubscriptionCreateSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(pushSubscription.getChangeHandlersNotifier());
            listT0.remove(pushSubscription);
        }
        listT0.add(iSubscriptionCreateSubscriptionFromModel);
        setSubscriptions(new SubscriptionList(listT0, new UninitializedPushSubscription()));
        this.events.fire(new C118771(iSubscriptionCreateSubscriptionFromModel));
    }

    private final ISubscription createSubscriptionFromModel(SubscriptionModel subscriptionModel) {
        int i = WhenMappings.$EnumSwitchMapping$0[subscriptionModel.getType().ordinal()];
        if (i == 1) {
            return new SmsSubscription(subscriptionModel);
        }
        if (i == 2) {
            return new EmailSubscription(subscriptionModel);
        }
        if (i == 3) {
            return new PushSubscription(subscriptionModel);
        }
        throw new szb();
    }

    private final void refreshPushSubscriptionState() {
        ISubscription push = getSubscriptions().getPush();
        if (push instanceof UninitializedPushSubscription) {
            return;
        }
        sq8.m48647f(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        SubscriptionModel model = ((Subscription) push).getModel();
        model.setSdk(OneSignalUtils.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        sq8.m48648g(str, "RELEASE");
        model.setDeviceOS(str);
        String carrierName = DeviceUtils.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(ISubscription iSubscription) {
        Logging.log(LogLevel.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + iSubscription + ')');
        IModelStore.DefaultImpls.remove$default(this._subscriptionModelStore, iSubscription.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(ISubscription iSubscription) {
        List listT0 = kh3.T0(getSubscriptions().getCollection());
        listT0.remove(iSubscription);
        setSubscriptions(new SubscriptionList(listT0, new UninitializedPushSubscription()));
        this.events.fire(new C118801(iSubscription));
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addEmailSubscription(String str) {
        sq8.m48649h(str, "email");
        addSubscriptionToModels$default(this, SubscriptionType.EMAIL, str, null, 4, null);
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addOrUpdatePushSubscriptionToken(String str, SubscriptionStatus subscriptionStatus) {
        sq8.m48649h(subscriptionStatus, "pushTokenStatus");
        ISubscription push = getSubscriptions().getPush();
        if (push instanceof UninitializedPushSubscription) {
            SubscriptionType subscriptionType = SubscriptionType.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(subscriptionType, str, subscriptionStatus);
            return;
        }
        sq8.m48647f(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        SubscriptionModel model = ((Subscription) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(subscriptionStatus);
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addSmsSubscription(String str) {
        sq8.m48649h(str, "sms");
        addSubscriptionToModels$default(this, SubscriptionType.SMS, str, null, 4, null);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public SubscriptionModel getPushSubscriptionModel() {
        IPushSubscription push = getSubscriptions().getPush();
        sq8.m48647f(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((PushSubscription) push).getModel();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public SubscriptionList getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        Object next;
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ISubscription iSubscription = (ISubscription) next;
            Model model = modelChangedArgs.getModel();
            sq8.m48647f(iSubscription, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (sq8.m48644c(model, ((Subscription) iSubscription).getModel())) {
                break;
            }
        }
        ISubscription iSubscription2 = (ISubscription) next;
        if (iSubscription2 == null) {
            Model model2 = modelChangedArgs.getModel();
            sq8.m48647f(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((SubscriptionModel) model2);
        } else {
            if (iSubscription2 instanceof PushSubscription) {
                ((PushSubscription) iSubscription2).getChangeHandlersNotifier().fireOnMain(new C118781(iSubscription2));
            }
            this.events.fire(new C118792(iSubscription2, modelChangedArgs));
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void removeEmailSubscription(String str) {
        Object next;
        sq8.m48649h(str, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            IEmailSubscription iEmailSubscription = (IEmailSubscription) next;
            if ((iEmailSubscription instanceof EmailSubscription) && sq8.m48644c(iEmailSubscription.getEmail(), str)) {
                break;
            }
        }
        IEmailSubscription iEmailSubscription2 = (IEmailSubscription) next;
        if (iEmailSubscription2 != null) {
            removeSubscriptionFromModels(iEmailSubscription2);
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void removeSmsSubscription(String str) {
        Object next;
        sq8.m48649h(str, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ISmsSubscription iSmsSubscription = (ISmsSubscription) next;
            if ((iSmsSubscription instanceof SmsSubscription) && sq8.m48644c(iSmsSubscription.getNumber(), str)) {
                break;
            }
        }
        ISmsSubscription iSmsSubscription2 = (ISmsSubscription) next;
        if (iSmsSubscription2 != null) {
            removeSubscriptionFromModels(iSmsSubscription2);
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void setSubscriptions(SubscriptionList subscriptionList) {
        sq8.m48649h(subscriptionList, "<set-?>");
        this.subscriptions = subscriptionList;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(SubscriptionModel subscriptionModel, String str) {
        sq8.m48649h(subscriptionModel, "model");
        sq8.m48649h(str, "tag");
        createSubscriptionAndAddToSubscriptionList(subscriptionModel);
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(SubscriptionModel subscriptionModel, String str) {
        Object next;
        sq8.m48649h(subscriptionModel, "model");
        sq8.m48649h(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (sq8.m48644c(((ISubscription) next).getId(), subscriptionModel.getId())) {
                    break;
                }
            }
        }
        ISubscription iSubscription = (ISubscription) next;
        if (iSubscription != null) {
            removeSubscriptionFromSubscriptionList(iSubscription);
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISubscriptionChangedHandler iSubscriptionChangedHandler) {
        sq8.m48649h(iSubscriptionChangedHandler, "handler");
        this.events.subscribe(iSubscriptionChangedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISubscriptionChangedHandler iSubscriptionChangedHandler) {
        sq8.m48649h(iSubscriptionChangedHandler, "handler");
        this.events.unsubscribe(iSubscriptionChangedHandler);
    }
}
