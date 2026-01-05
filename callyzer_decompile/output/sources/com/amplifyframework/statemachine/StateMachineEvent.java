package com.amplifyframework.statemachine;

import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface StateMachineEvent {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static String getId(StateMachineEvent stateMachineEvent) {
            return StateMachineEvent.super.getId();
        }

        @Deprecated
        public static Date getTime(StateMachineEvent stateMachineEvent) {
            return StateMachineEvent.super.getTime();
        }
    }

    default String getId() {
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    default Date getTime() {
        return new Date();
    }

    String getType();
}
