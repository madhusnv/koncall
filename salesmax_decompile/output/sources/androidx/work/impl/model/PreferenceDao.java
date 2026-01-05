package androidx.work.impl.model;

import androidx.lifecycle.AbstractC2145n;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
/* loaded from: classes2.dex */
public interface PreferenceDao {
    @Query("SELECT long_value FROM Preference where `key`=:key")
    Long getLongValue(String str);

    @Query("SELECT long_value FROM Preference where `key`=:key")
    AbstractC2145n getObservableLongValue(String str);

    @Insert(onConflict = 1)
    void insertPreference(Preference preference);
}
