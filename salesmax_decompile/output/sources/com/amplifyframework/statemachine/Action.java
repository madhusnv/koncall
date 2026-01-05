package com.amplifyframework.statemachine;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.n64;
import p001o.ql7;
import p001o.sl7;
import p001o.sq8;

/* loaded from: classes5.dex */
public interface Action {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, ql7 ql7Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            sq8.m48649h(ql7Var, "block");
            return new Action$Companion$invoke$1(str, ql7Var);
        }

        public final BasicAction basic(String str, ql7 ql7Var) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(ql7Var, "block");
            return new BasicAction(str, ql7Var);
        }

        public final Action invoke(String str, ql7 ql7Var) {
            sq8.m48649h(ql7Var, "block");
            return new Action$Companion$invoke$1(str, ql7Var);
        }

        public static /* synthetic */ Action invoke$default(Companion companion, String str, sl7 sl7Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            sq8.m48649h(sl7Var, "block");
            return new Action$Companion$invoke$2(str, sl7Var);
        }

        public final <EnvType extends Environment> Action invoke(String str, sl7 sl7Var) {
            sq8.m48649h(sl7Var, "block");
            return new Action$Companion$invoke$2(str, sl7Var);
        }
    }

    public static final class DefaultImpls {
        public static String getId(Action action) {
            String simpleName = action.getClass().getSimpleName();
            sq8.m48648g(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var);

    String getId();
}
