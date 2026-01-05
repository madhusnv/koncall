package androidx.work.impl.model;

import androidx.lifecycle.AbstractC2145n;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import p001o.oeg;

@Dao
/* loaded from: classes2.dex */
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(oeg oegVar);

    @RawQuery(observedEntities = {WorkSpec.class})
    AbstractC2145n getWorkInfoPojosLiveData(oeg oegVar);
}
