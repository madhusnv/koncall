package androidx.room.migration;

import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(leg legVar) {
        sq8.m48649h(legVar, "db");
    }
}
