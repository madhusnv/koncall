package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.Trigger;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.session.internal.session.ISessionService;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DynamicTriggerController implements IEventNotifier<ITriggerHandler> {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final ISessionService _session;
    private final InAppStateService _state;
    private final ITime _time;
    private final EventProducer<ITriggerHandler> events;
    private final List<String> scheduledMessages;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Trigger.OSTriggerKind.values().length];
            iArr[Trigger.OSTriggerKind.SESSION_TIME.ordinal()] = 1;
            iArr[Trigger.OSTriggerKind.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Trigger.OSTriggerOperator.values().length];
            iArr2[Trigger.OSTriggerOperator.LESS_THAN.ordinal()] = 1;
            iArr2[Trigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            iArr2[Trigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 3;
            iArr2[Trigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            iArr2[Trigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 5;
            iArr2[Trigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DynamicTriggerController(InAppStateService inAppStateService, ISessionService iSessionService, ITime iTime) {
        sq8.m48649h(inAppStateService, "_state");
        sq8.m48649h(iSessionService, "_session");
        sq8.m48649h(iTime, "_time");
        this._state = inAppStateService;
        this._session = iSessionService;
        this._time = iTime;
        this.events = new EventProducer<>();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d, double d2, Trigger.OSTriggerOperator oSTriggerOperator) {
        switch (WhenMappings.$EnumSwitchMapping$1[oSTriggerOperator.ordinal()]) {
            case 1:
                if (d2 < d) {
                    return true;
                }
                break;
            case 2:
                if (d2 <= d || roughlyEqual(d, d2)) {
                    return true;
                }
                break;
            case 3:
                if (d2 >= d) {
                    return true;
                }
                break;
            case 4:
                if (d2 >= d || roughlyEqual(d, d2)) {
                    return true;
                }
                break;
            case 5:
                return roughlyEqual(d, d2);
            case 6:
                if (!roughlyEqual(d, d2)) {
                    return true;
                }
                break;
            default:
                Logging.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + oSTriggerOperator, null, 2, null);
                break;
        }
        return false;
    }

    private final boolean roughlyEqual(double d, double d2) {
        return Math.abs(d - d2) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0014, B:11:0x001e, B:27:0x0062, B:29:0x0088, B:36:0x009e, B:40:0x00a8, B:16:0x0033, B:20:0x003d, B:23:0x0049, B:25:0x0060, B:24:0x0054), top: B:46:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(Trigger trigger) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j2;
        long jDoubleValue;
        sq8.m48649h(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            if (!(trigger.getValue() instanceof Number)) {
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
            if (i == 1) {
                currentTimeMillis = this._time.getCurrentTimeMillis();
                startTime = this._session.getStartTime();
            } else {
                if (i != 2) {
                    j2 = 0;
                    final String triggerId = trigger.getTriggerId();
                    Number number = (Number) trigger.getValue();
                    sq8.m48646e(number);
                    jDoubleValue = (long) (number.doubleValue() * 1000);
                    if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                        this.events.fire(new DynamicTriggerController$dynamicTriggerShouldFire$1$1(triggerId));
                        return true;
                    }
                    long j3 = jDoubleValue - j2;
                    if (j3 <= 0) {
                        return false;
                    }
                    if (this.scheduledMessages.contains(triggerId)) {
                        return false;
                    }
                    DynamicTriggerTimer.INSTANCE.scheduleTrigger(new TimerTask() { // from class: com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController$dynamicTriggerShouldFire$1$2
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            this.this$0.scheduledMessages.remove(triggerId);
                            this.this$0.getEvents().fire(new DynamicTriggerController$dynamicTriggerShouldFire$1$2$run$1(triggerId));
                        }
                    }, triggerId, j3);
                    this.scheduledMessages.add(triggerId);
                    return false;
                }
                if (this._state.getInAppMessageIdShowing() != null) {
                    return false;
                }
                Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                if (lastTimeInAppDismissed == null) {
                    j = DEFAULT_LAST_IN_APP_TIME_AGO;
                    j2 = j;
                    final String triggerId2 = trigger.getTriggerId();
                    Number number2 = (Number) trigger.getValue();
                    sq8.m48646e(number2);
                    jDoubleValue = (long) (number2.doubleValue() * 1000);
                    if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                    }
                } else {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = lastTimeInAppDismissed.longValue();
                }
            }
            j = currentTimeMillis - startTime;
            j2 = j;
            final String triggerId22 = trigger.getTriggerId();
            Number number22 = (Number) trigger.getValue();
            sq8.m48646e(number22);
            jDoubleValue = (long) (number22.doubleValue() * 1000);
            if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
            }
        }
    }

    public final EventProducer<ITriggerHandler> getEvents() {
        return this.events;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ITriggerHandler iTriggerHandler) {
        sq8.m48649h(iTriggerHandler, "handler");
        this.events.subscribe(iTriggerHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ITriggerHandler iTriggerHandler) {
        sq8.m48649h(iTriggerHandler, "handler");
        this.events.unsubscribe(iTriggerHandler);
    }
}
