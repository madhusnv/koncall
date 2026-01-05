package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.work.impl.utils.PreferenceUtils;
import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class RescheduleMigration extends Migration {
    private final Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleMigration(Context context, int i, int i2) {
        super(i, i2);
        sq8.m48649h(context, "mContext");
        this.mContext = context;
    }

    public final Context getMContext() {
        return this.mContext;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        if (this.endVersion >= 10) {
            legVar.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{PreferenceUtils.KEY_RESCHEDULE_NEEDED, 1});
        } else {
            this.mContext.getSharedPreferences(PreferenceUtils.PREFERENCES_FILE_NAME, 0).edit().putBoolean(PreferenceUtils.KEY_RESCHEDULE_NEEDED, true).apply();
        }
    }
}
