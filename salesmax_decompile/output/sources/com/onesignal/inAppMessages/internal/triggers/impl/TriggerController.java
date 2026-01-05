package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.common.modeling.IModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.Trigger;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.inAppMessages.internal.triggers.TriggerModel;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p001o.kf9;
import p001o.sq8;
import p001o.szb;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class TriggerController implements ITriggerController, IModelStoreChangeHandler<TriggerModel> {
    private DynamicTriggerController _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Trigger.OSTriggerOperator.values().length];
            iArr[Trigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 1;
            iArr[Trigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 2;
            iArr[Trigger.OSTriggerOperator.EXISTS.ordinal()] = 3;
            iArr[Trigger.OSTriggerOperator.CONTAINS.ordinal()] = 4;
            iArr[Trigger.OSTriggerOperator.NOT_EXISTS.ordinal()] = 5;
            iArr[Trigger.OSTriggerOperator.LESS_THAN.ordinal()] = 6;
            iArr[Trigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 7;
            iArr[Trigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            iArr[Trigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.TriggerController$onModelAdded$1 */
    public static final class C117011 extends kf9 implements xk7 {
        final /* synthetic */ TriggerModel $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117011(TriggerModel triggerModel) {
            super(1);
            this.$model = triggerModel;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ITriggerHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ITriggerHandler iTriggerHandler) {
            sq8.m48649h(iTriggerHandler, "it");
            iTriggerHandler.onTriggerChanged(this.$model.getKey());
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.TriggerController$onModelUpdated$1 */
    public static final class C117021 extends kf9 implements xk7 {
        final /* synthetic */ TriggerModel $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117021(TriggerModel triggerModel) {
            super(1);
            this.$model = triggerModel;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ITriggerHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ITriggerHandler iTriggerHandler) {
            sq8.m48649h(iTriggerHandler, "it");
            iTriggerHandler.onTriggerChanged(this.$model.getKey());
        }
    }

    public TriggerController(TriggerModelStore triggerModelStore, DynamicTriggerController dynamicTriggerController) {
        sq8.m48649h(triggerModelStore, "triggerModelStore");
        sq8.m48649h(dynamicTriggerController, "_dynamicTriggerController");
        this._dynamicTriggerController = dynamicTriggerController;
        this.triggers = new ConcurrentHashMap<>();
        triggerModelStore.subscribe((IModelStoreChangeHandler) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
            y3i y3iVar = y3i.f54824a;
        }
    }

    private final boolean evaluateAndTriggers(List<Trigger> list) {
        Iterator<Trigger> it = list.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(Trigger trigger) {
        if (trigger.getKind() == Trigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (trigger.getKind() != Trigger.OSTriggerKind.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(trigger);
        }
        Trigger.OSTriggerOperator operatorType = trigger.getOperatorType();
        Object obj = this.triggers.get(trigger.getProperty());
        if (obj == null) {
            return operatorType == Trigger.OSTriggerOperator.NOT_EXISTS || (operatorType == Trigger.OSTriggerOperator.NOT_EQUAL_TO && trigger.getValue() != null);
        }
        if (operatorType == Trigger.OSTriggerOperator.EXISTS) {
            return true;
        }
        if (operatorType == Trigger.OSTriggerOperator.NOT_EXISTS) {
            return false;
        }
        if (operatorType == Trigger.OSTriggerOperator.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(trigger.getValue());
        }
        if ((obj instanceof String) && (trigger.getValue() instanceof String)) {
            String str = (String) trigger.getValue();
            sq8.m48646e(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((trigger.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) trigger.getValue();
            sq8.m48646e(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(trigger.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, Trigger.OSTriggerOperator oSTriggerOperator) {
        if (obj == null) {
            return false;
        }
        if (!oSTriggerOperator.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, oSTriggerOperator);
            }
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        if (obj2 instanceof Number) {
            string2 = new DecimalFormat("0.#").format(obj2);
            sq8.m48648g(string2, "format.format(deviceValue)");
        }
        return triggerMatchesStringValue(string, string2, oSTriggerOperator);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, Trigger.OSTriggerOperator oSTriggerOperator) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (WhenMappings.$EnumSwitchMapping$0[oSTriggerOperator.ordinal()]) {
            case 1:
                if (dDoubleValue2 == dDoubleValue) {
                    return true;
                }
                break;
            case 2:
                if (!(dDoubleValue2 == dDoubleValue)) {
                    return true;
                }
                break;
            case 3:
            case 4:
            case 5:
                Logging.error$default("Attempted to use an invalid operator with a numeric value: " + oSTriggerOperator, null, 2, null);
                break;
            case 6:
                if (dDoubleValue2 < dDoubleValue) {
                    return true;
                }
                break;
            case 7:
                if (dDoubleValue2 > dDoubleValue) {
                    return true;
                }
                break;
            case 8:
                if (dDoubleValue2 < dDoubleValue) {
                    return true;
                }
                if (dDoubleValue2 == dDoubleValue) {
                    return true;
                }
                break;
            case 9:
                if (dDoubleValue2 > dDoubleValue) {
                    return true;
                }
                if (dDoubleValue2 == dDoubleValue) {
                    return true;
                }
                break;
            default:
                throw new szb();
        }
        return false;
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, Trigger.OSTriggerOperator oSTriggerOperator) throws NumberFormatException {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), oSTriggerOperator);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, Trigger.OSTriggerOperator oSTriggerOperator) {
        int i = WhenMappings.$EnumSwitchMapping$0[oSTriggerOperator.ordinal()];
        if (i == 1) {
            return sq8.m48644c(str, str2);
        }
        if (i != 2) {
            Logging.error$default("Attempted to use an invalid operator for a string trigger comparison: " + oSTriggerOperator, null, 2, null);
        } else if (!sq8.m48644c(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean evaluateMessageTriggers(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (inAppMessage.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<Trigger>> it = inAppMessage.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean isTriggerOnMessage(InAppMessage inAppMessage, Collection<String> collection) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(collection, "triggersKeys");
        if (inAppMessage.getTriggers() == null) {
            return false;
        }
        for (String str : collection) {
            Iterator<List<Trigger>> it = inAppMessage.getTriggers().iterator();
            while (it.hasNext()) {
                for (Trigger trigger : it.next()) {
                    if (sq8.m48644c(str, trigger.getProperty()) || sq8.m48644c(str, trigger.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean messageHasOnlyDynamicTriggers(InAppMessage inAppMessage) {
        sq8.m48649h(inAppMessage, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (inAppMessage.getTriggers() == null || inAppMessage.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<Trigger>> it = inAppMessage.getTriggers().iterator();
        while (it.hasNext()) {
            for (Trigger trigger : it.next()) {
                if (trigger.getKind() == Trigger.OSTriggerKind.CUSTOM || trigger.getKind() == Trigger.OSTriggerKind.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs modelChangedArgs, String str) {
        sq8.m48649h(modelChangedArgs, "args");
        sq8.m48649h(str, "tag");
        Model model = modelChangedArgs.getModel();
        sq8.m48647f(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        TriggerModel triggerModel = (TriggerModel) model;
        addTriggers(triggerModel.getKey(), triggerModel.getValue());
        this._dynamicTriggerController.getEvents().fire(new C117021(triggerModel));
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(TriggerModel triggerModel, String str) {
        sq8.m48649h(triggerModel, "model");
        sq8.m48649h(str, "tag");
        addTriggers(triggerModel.getKey(), triggerModel.getValue());
        this._dynamicTriggerController.getEvents().fire(new C117011(triggerModel));
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(TriggerModel triggerModel, String str) {
        sq8.m48649h(triggerModel, "model");
        sq8.m48649h(str, "tag");
        removeTriggersForKeys(triggerModel.getKey());
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ITriggerHandler iTriggerHandler) {
        sq8.m48649h(iTriggerHandler, "handler");
        this._dynamicTriggerController.subscribe(iTriggerHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ITriggerHandler iTriggerHandler) {
        sq8.m48649h(iTriggerHandler, "handler");
        this._dynamicTriggerController.unsubscribe(iTriggerHandler);
    }
}
