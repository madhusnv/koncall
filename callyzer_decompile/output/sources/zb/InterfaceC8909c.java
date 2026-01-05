package zb;

import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zb.c */
/* loaded from: classes.dex */
public interface InterfaceC8909c {
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c);

    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c);

    Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c interfaceC7559c);

    Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c);

    Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c interfaceC7559c);

    Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c);

    Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c);

    default void readAfterAttempt(InterfaceC8916j context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readAfterDeserialization(InterfaceC8916j context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readAfterExecution(InterfaceC8916j context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readAfterSerialization(InterfaceC8913g context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readAfterSigning(InterfaceC8913g context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readAfterTransmit(InterfaceC8914h context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeAttempt(InterfaceC8913g context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeDeserialization(InterfaceC8914h context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeExecution(InterfaceC8915i context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeSerialization(InterfaceC8915i context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeSigning(InterfaceC8913g context) {
        AbstractC4154l.m8923f(context, "context");
    }

    default void readBeforeTransmit(InterfaceC8913g context) {
        AbstractC4154l.m8923f(context, "context");
    }
}
