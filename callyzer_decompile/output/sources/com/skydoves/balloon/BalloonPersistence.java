package com.skydoves.balloon;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonPersistence {
    public static final Companion Companion = new Companion(null);
    private static final String SHOWED_UP = "SHOWED_UP";
    private static volatile BalloonPersistence instance;
    private static SharedPreferences sharedPreferenceManager;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final BalloonPersistence getInstance(Context context) {
            BalloonPersistence balloonPersistence;
            AbstractC4154l.m8923f(context, "context");
            BalloonPersistence balloonPersistence2 = BalloonPersistence.instance;
            if (balloonPersistence2 != null) {
                return balloonPersistence2;
            }
            synchronized (this) {
                balloonPersistence = BalloonPersistence.instance;
                if (balloonPersistence == null) {
                    balloonPersistence = new BalloonPersistence(null);
                    BalloonPersistence.instance = balloonPersistence;
                    BalloonPersistence.sharedPreferenceManager = context.getSharedPreferences("com.skydoves.balloon", 0);
                }
            }
            return balloonPersistence;
        }

        public final String getPersistName(String name) {
            AbstractC4154l.m8923f(name, "name");
            return BalloonPersistence.SHOWED_UP.concat(name);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BalloonPersistence(AbstractC4148f abstractC4148f) {
        this();
    }

    public static final BalloonPersistence getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final String getPersistName(String str) {
        return Companion.getPersistName(str);
    }

    private final int getPersistedCounts(String str) {
        SharedPreferences sharedPreferences = sharedPreferenceManager;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(Companion.getPersistName(str), 0);
        }
        AbstractC4154l.m8928k("sharedPreferenceManager");
        throw null;
    }

    private final void putCounts(String str, int i10) {
        SharedPreferences sharedPreferences = sharedPreferenceManager;
        if (sharedPreferences == null) {
            AbstractC4154l.m8928k("sharedPreferenceManager");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(Companion.getPersistName(str), i10);
        editorEdit.apply();
    }

    public final void clearAllPreferences() {
        SharedPreferences sharedPreferences = sharedPreferenceManager;
        if (sharedPreferences == null) {
            AbstractC4154l.m8928k("sharedPreferenceManager");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final void putIncrementedCounts(String name) {
        AbstractC4154l.m8923f(name, "name");
        putCounts(name, getPersistedCounts(name) + 1);
    }

    public final boolean shouldShowUp(String name, int i10) {
        AbstractC4154l.m8923f(name, "name");
        return getPersistedCounts(name) < i10;
    }

    private BalloonPersistence() {
    }
}
