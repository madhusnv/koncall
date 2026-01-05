package p001o;

import ai.salesmax.model.NotificationStagingInfo;
import ai.salesmax.model.NotificationStagingSummary;
import ai.salesmax.model.PaginatedTokenResults;
import com.amplifyframework.datastore.generated.model.NotificationStaging;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class o4c {
    /* renamed from: c */
    public static s47 m41524c(int i) {
        l1 l1VarTB = uni.kC().TB();
        return l1VarTB.xi(l1VarTB.Eo(), i).m47686M(new rl7() { // from class: o.m4c
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return o4c.m41526e((PaginatedTokenResults) obj);
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ NotificationStagingInfo m41525d(NotificationStaging notificationStaging) {
        return new NotificationStagingSummary(notificationStaging).toNotificationStagingInfo();
    }

    /* renamed from: e */
    public static /* synthetic */ PaginatedTokenResults m41526e(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.n4c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return o4c.m41525d((NotificationStaging) obj);
            }
        });
        map.loadInitial();
        return map;
    }
}
