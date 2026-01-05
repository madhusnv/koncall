package com.amplifyframework.statemachine;

import java.util.Date;
import java.util.UUID;
import p001o.sq8;

/* loaded from: classes5.dex */
public interface StateMachineEvent {

    public static final class DefaultImpls {
        public static String getId(StateMachineEvent stateMachineEvent) {
            String string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }

        public static Date getTime(StateMachineEvent stateMachineEvent) {
            return new Date();
        }
    }

    String getId();

    Date getTime();

    String getType();
}
