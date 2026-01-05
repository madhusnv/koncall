package com.onesignal.user.internal;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.IDManager;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.IUserManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionList;
import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.state.UserChangedState;
import com.onesignal.user.state.UserState;
import com.onesignal.user.subscriptions.IPushSubscription;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.isa;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public class UserManager implements IUserManager, ISingletonModelStoreChangeHandler<IdentityModel> {
    private final IdentityModelStore _identityModelStore;
    private final ILanguageContext _languageContext;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISubscriptionManager _subscriptionManager;
    private final EventProducer<IUserStateObserver> changeHandlersNotifier;

    /* renamed from: com.onesignal.user.internal.UserManager$onModelUpdated$1 */
    public static final class C118511 extends kf9 implements xk7 {
        final /* synthetic */ UserState $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118511(UserState userState) {
            super(1);
            this.$newUserState = userState;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IUserStateObserver) obj);
            return y3i.f54824a;
        }

        public final void invoke(IUserStateObserver iUserStateObserver) {
            sq8.m48649h(iUserStateObserver, "it");
            iUserStateObserver.onUserStateChange(new UserChangedState(this.$newUserState));
        }
    }

    public UserManager(ISubscriptionManager iSubscriptionManager, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, ILanguageContext iLanguageContext) {
        sq8.m48649h(iSubscriptionManager, "_subscriptionManager");
        sq8.m48649h(identityModelStore, "_identityModelStore");
        sq8.m48649h(propertiesModelStore, "_propertiesModelStore");
        sq8.m48649h(iLanguageContext, "_languageContext");
        this._subscriptionManager = iSubscriptionManager;
        this._identityModelStore = identityModelStore;
        this._propertiesModelStore = propertiesModelStore;
        this._languageContext = iLanguageContext;
        this.changeHandlersNotifier = new EventProducer<>();
        identityModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    private final IdentityModel get_identityModel() {
        return this._identityModelStore.getModel();
    }

    private final PropertiesModel get_propertiesModel() {
        return this._propertiesModelStore.getModel();
    }

    @Override // com.onesignal.user.IUserManager
    public void addAlias(String str, String str2) {
        sq8.m48649h(str, Constants.ScionAnalytics.PARAM_LABEL);
        sq8.m48649h(str2, OutcomeConstants.OUTCOME_ID);
        Logging.log(LogLevel.DEBUG, "setAlias(label: " + str + ", id: " + str2 + ')');
        if (str.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot add empty alias");
        } else if (sq8.m48644c(str, IdentityConstants.ONESIGNAL_ID)) {
            Logging.log(LogLevel.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((IdentityModel) str, str2);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addAliases(Map<String, String> map) {
        sq8.m48649h(map, "aliases");
        Logging.log(LogLevel.DEBUG, "addAliases(aliases: " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot add empty alias");
                return;
            } else if (sq8.m48644c(entry.getKey(), IdentityConstants.ONESIGNAL_ID)) {
                Logging.log(LogLevel.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            get_identityModel().put((IdentityModel) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addEmail(String str) {
        sq8.m48649h(str, "email");
        Logging.log(LogLevel.DEBUG, "addEmail(email: " + str + ')');
        if (OneSignalUtils.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.addEmailSubscription(str);
            return;
        }
        Logging.log(LogLevel.ERROR, "Cannot add invalid email address as subscription: " + str);
    }

    @Override // com.onesignal.user.IUserManager
    public void addObserver(IUserStateObserver iUserStateObserver) {
        sq8.m48649h(iUserStateObserver, "observer");
        this.changeHandlersNotifier.subscribe(iUserStateObserver);
    }

    @Override // com.onesignal.user.IUserManager
    public void addSms(String str) {
        sq8.m48649h(str, "sms");
        Logging.log(LogLevel.DEBUG, "addSms(sms: " + str + ')');
        if (OneSignalUtils.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.addSmsSubscription(str);
            return;
        }
        Logging.log(LogLevel.ERROR, "Cannot add invalid sms number as subscription: " + str);
    }

    @Override // com.onesignal.user.IUserManager
    public void addTag(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        Logging.log(LogLevel.DEBUG, "setTag(key: " + str + ", value: " + str2 + ')');
        if (str.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((MapModel<String>) str, str2);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addTags(Map<String, String> map) {
        sq8.m48649h(map, "tags");
        Logging.log(LogLevel.DEBUG, "setTags(tags: " + map + ')');
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            get_propertiesModel().getTags().put((MapModel<String>) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        IdentityModel identityModel = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : identityModel.entrySet()) {
            if (!sq8.m48644c(entry.getKey(), OutcomeConstants.OUTCOME_ID)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return isa.m32693t(linkedHashMap);
    }

    public final EventProducer<IUserStateObserver> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.onesignal.user.IUserManager
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // com.onesignal.user.IUserManager
    public String getOnesignalId() {
        return IDManager.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // com.onesignal.user.IUserManager
    public IPushSubscription getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final SubscriptionList getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // com.onesignal.user.IUserManager
    public Map<String, String> getTags() {
        return isa.m32693t(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(IdentityModel identityModel, String str) {
        sq8.m48649h(identityModel, "model");
        sq8.m48649h(str, "tag");
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        if (sq8.m48644c(modelChangedArgs.getProperty(), IdentityConstants.ONESIGNAL_ID)) {
            this.changeHandlersNotifier.fire(new C118511(new UserState(String.valueOf(modelChangedArgs.getNewValue()), getExternalId())));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeAlias(String str) {
        sq8.m48649h(str, Constants.ScionAnalytics.PARAM_LABEL);
        Logging.log(LogLevel.DEBUG, "removeAlias(label: " + str + ')');
        if (str.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot remove empty alias");
        } else if (sq8.m48644c(str, IdentityConstants.ONESIGNAL_ID)) {
            Logging.log(LogLevel.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) str);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeAliases(Collection<String> collection) {
        sq8.m48649h(collection, "labels");
        Logging.log(LogLevel.DEBUG, "removeAliases(labels: " + collection + ')');
        Collection<String> collection2 = collection;
        for (String str : collection2) {
            if (str.length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot remove empty alias");
                return;
            } else if (sq8.m48644c(str, IdentityConstants.ONESIGNAL_ID)) {
                Logging.log(LogLevel.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeEmail(String str) {
        sq8.m48649h(str, "email");
        Logging.log(LogLevel.DEBUG, "removeEmail(email: " + str + ')');
        if (OneSignalUtils.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.removeEmailSubscription(str);
            return;
        }
        Logging.log(LogLevel.ERROR, "Cannot remove invalid email address as subscription: " + str);
    }

    @Override // com.onesignal.user.IUserManager
    public void removeObserver(IUserStateObserver iUserStateObserver) {
        sq8.m48649h(iUserStateObserver, "observer");
        this.changeHandlersNotifier.unsubscribe(iUserStateObserver);
    }

    @Override // com.onesignal.user.IUserManager
    public void removeSms(String str) {
        sq8.m48649h(str, "sms");
        Logging.log(LogLevel.DEBUG, "removeSms(sms: " + str + ')');
        if (OneSignalUtils.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.removeSmsSubscription(str);
            return;
        }
        Logging.log(LogLevel.ERROR, "Cannot remove invalid sms number as subscription: " + str);
    }

    @Override // com.onesignal.user.IUserManager
    public void removeTag(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Logging.log(LogLevel.DEBUG, "removeTag(key: " + str + ')');
        if (str.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) str);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeTags(Collection<String> collection) {
        sq8.m48649h(collection, UserMetadata.KEYDATA_FILENAME);
        Logging.log(LogLevel.DEBUG, "removeTags(keys: " + collection + ')');
        Collection<String> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void setLanguage(String str) {
        sq8.m48649h(str, "value");
        this._languageContext.setLanguage(str);
    }
}
