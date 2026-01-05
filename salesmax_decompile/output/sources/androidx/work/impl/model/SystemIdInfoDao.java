package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import p001o.sq8;

@Dao
/* loaded from: classes2.dex */
public interface SystemIdInfoDao {

    public static final class DefaultImpls {
        public static SystemIdInfo getSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            sq8.m48649h(workGenerationalId, OutcomeConstants.OUTCOME_ID);
            return systemIdInfoDao.getSystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration());
        }

        public static void removeSystemIdInfo(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId workGenerationalId) {
            sq8.m48649h(workGenerationalId, OutcomeConstants.OUTCOME_ID);
            systemIdInfoDao.removeSystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration());
        }
    }

    SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId);

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    SystemIdInfo getSystemIdInfo(String str, int i);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(WorkGenerationalId workGenerationalId);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(String str);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(String str, int i);
}
