package com.amplifyframework.util;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.b8;
import qw.InterfaceC6357g;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AmplifyHttp {
    public static final AmplifyHttp INSTANCE = new AmplifyHttp();
    private static final InterfaceC6357g availableVersion$delegate;
    private static final Logger logger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Version {
        private static final /* synthetic */ InterfaceC8493a $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;
        public static final Version OkHttp4 = new Version("OkHttp4", 0);
        public static final Version OkHttp5 = new Version("OkHttp5", 1);

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{OkHttp4, OkHttp5};
        }

        static {
            Version[] versionArr$values = $values();
            $VALUES = versionArr$values;
            $ENTRIES = b8.m11548b(versionArr$values);
        }

        private Version(String str, int i10) {
        }

        public static InterfaceC8493a getEntries() {
            return $ENTRIES;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }
    }

    static {
        Logger logger2 = Amplify.Logging.logger("HttpEngine");
        AbstractC4154l.m8922e(logger2, "logger(...)");
        logger = logger2;
        availableVersion$delegate = nd.m10782c(new C1226a(10));
    }

    private AmplifyHttp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Version availableVersion_delegate$lambda$0() throws ClassNotFoundException {
        try {
            Class.forName("aws.smithy.kotlin.runtime.http.engine.okhttp4.OkHttp4Engine");
            logger.info("Using OkHttp4 Engine");
            return Version.OkHttp4;
        } catch (ClassNotFoundException unused) {
            logger.info("Using default OkHttp5 Engine");
            return Version.OkHttp5;
        }
    }

    public final Version getAvailableVersion() {
        return (Version) availableVersion$delegate.getValue();
    }
}
