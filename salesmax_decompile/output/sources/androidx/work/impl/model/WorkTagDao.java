package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.sq8;

@Dao
/* loaded from: classes2.dex */
public interface WorkTagDao {

    public static final class DefaultImpls {
        public static void insertTags(WorkTagDao workTagDao, String str, Set<String> set) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(set, "tags");
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new WorkTag((String) it.next(), str));
            }
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> getTagsForWorkSpecId(String str);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> getWorkSpecIdsWithTag(String str);

    @Insert(onConflict = 5)
    void insert(WorkTag workTag);

    void insertTags(String str, Set<String> set);
}
