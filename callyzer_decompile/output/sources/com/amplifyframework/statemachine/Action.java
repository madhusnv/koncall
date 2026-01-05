package com.amplifyframework.statemachine;

import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Action {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, InterfaceC2142f block, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            AbstractC4154l.m8923f(block, "block");
            return new Action$Companion$invoke$1(str, block);
        }

        public final BasicAction basic(String id2, InterfaceC2142f block) {
            AbstractC4154l.m8923f(id2, "id");
            AbstractC4154l.m8923f(block, "block");
            return new BasicAction(id2, block);
        }

        public final Action invoke(String str, InterfaceC2142f block) {
            AbstractC4154l.m8923f(block, "block");
            return new Action$Companion$invoke$1(str, block);
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, InterfaceC2143g block, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            AbstractC4154l.m8923f(block, "block");
            return new Action$Companion$invoke$2(str, block);
        }

        public final <EnvType extends Environment> Action invoke(String str, InterfaceC2143g block) {
            AbstractC4154l.m8923f(block, "block");
            return new Action$Companion$invoke$2(str, block);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static String getId(Action action) {
            return Action.super.getId();
        }
    }

    Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c);

    default String getId() {
        return getClass().getSimpleName();
    }
}
